package com.fasterxml.jackson.databind.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class JsonNodeType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ JsonNodeType[] f342185b = {new JsonNodeType("ARRAY", 0), new JsonNodeType("BINARY", 1), new JsonNodeType("BOOLEAN", 2), new JsonNodeType("MISSING", 3), new JsonNodeType("NULL", 4), new JsonNodeType("NUMBER", 5), new JsonNodeType("OBJECT", 6), new JsonNodeType("POJO", 7), new JsonNodeType("STRING", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    JsonNodeType EF5;

    public JsonNodeType() {
        throw null;
    }

    public static JsonNodeType valueOf(String str) {
        return (JsonNodeType) Enum.valueOf(JsonNodeType.class, str);
    }

    public static JsonNodeType[] values() {
        return (JsonNodeType[]) f342185b.clone();
    }
}
