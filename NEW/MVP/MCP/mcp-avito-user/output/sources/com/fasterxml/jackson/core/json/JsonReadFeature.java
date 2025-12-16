package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.b;

/* loaded from: classes3.dex */
public enum JsonReadFeature implements b {
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_JAVA_COMMENTS(JsonParser.Feature.ALLOW_COMMENTS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_YAML_COMMENTS(JsonParser.Feature.ALLOW_YAML_COMMENTS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_SINGLE_QUOTES(JsonParser.Feature.ALLOW_SINGLE_QUOTES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_UNQUOTED_FIELD_NAMES(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_UNESCAPED_CONTROL_CHARS(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(JsonParser.Feature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_NON_NUMERIC_NUMBERS(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_MISSING_VALUES(JsonParser.Feature.ALLOW_MISSING_VALUES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_TRAILING_COMMA(JsonParser.Feature.ALLOW_TRAILING_COMMA);


    /* renamed from: b, reason: collision with root package name */
    public final int f341208b = 1 << ordinal();

    /* renamed from: c, reason: collision with root package name */
    public final JsonParser.Feature f341209c;

    JsonReadFeature(JsonParser.Feature feature) {
        this.f341209c = feature;
    }

    @Override // com.fasterxml.jackson.core.util.h
    public final int a() {
        return this.f341208b;
    }

    @Override // com.fasterxml.jackson.core.util.h
    public final boolean b() {
        return false;
    }
}
