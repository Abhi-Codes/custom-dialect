package com.abhicodes.customdialect.util;

import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.spi.MetadataBuilderContributor;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.type.BooleanType;

public class SQLFunctionContributor implements MetadataBuilderContributor {
	@Override
	public void contribute(MetadataBuilder metadataBuilder) {
		metadataBuilder.applySqlFunction("json_contains_key",
				new SQLFunctionTemplate(BooleanType.INSTANCE, "JSON_CONTAINS(?1, JSON_QUOTE(?2))"));
	}

}
