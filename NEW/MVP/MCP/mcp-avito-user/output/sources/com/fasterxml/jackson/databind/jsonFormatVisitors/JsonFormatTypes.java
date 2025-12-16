package com.fasterxml.jackson.databind.jsonFormatVisitors;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class JsonFormatTypes {

    /* JADX INFO: Fake field, exist only in values array */
    JsonFormatTypes EF5;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ JsonFormatTypes[] f342132c = {new JsonFormatTypes("STRING", 0), new JsonFormatTypes("NUMBER", 1), new JsonFormatTypes("INTEGER", 2), new JsonFormatTypes("BOOLEAN", 3), new JsonFormatTypes("OBJECT", 4), new JsonFormatTypes("ARRAY", 5), new JsonFormatTypes("NULL", 6), new JsonFormatTypes("ANY", 7)};

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f342131b = new HashMap();

    static {
        for (JsonFormatTypes jsonFormatTypes : values()) {
            f342131b.put(jsonFormatTypes.name().toLowerCase(), jsonFormatTypes);
        }
    }

    public JsonFormatTypes() {
        throw null;
    }

    public static JsonFormatTypes valueOf(String str) {
        return (JsonFormatTypes) Enum.valueOf(JsonFormatTypes.class, str);
    }

    public static JsonFormatTypes[] values() {
        return (JsonFormatTypes[]) f342132c.clone();
    }
}
