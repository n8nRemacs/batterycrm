package com.google.gson.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class JsonToken {

    /* renamed from: b, reason: collision with root package name */
    public static final JsonToken f362196b;

    /* renamed from: c, reason: collision with root package name */
    public static final JsonToken f362197c;

    /* renamed from: d, reason: collision with root package name */
    public static final JsonToken f362198d;

    /* renamed from: e, reason: collision with root package name */
    public static final JsonToken f362199e;

    /* renamed from: f, reason: collision with root package name */
    public static final JsonToken f362200f;

    /* renamed from: g, reason: collision with root package name */
    public static final JsonToken f362201g;

    /* renamed from: h, reason: collision with root package name */
    public static final JsonToken f362202h;

    /* renamed from: i, reason: collision with root package name */
    public static final JsonToken f362203i;

    /* renamed from: j, reason: collision with root package name */
    public static final JsonToken f362204j;

    /* renamed from: k, reason: collision with root package name */
    public static final JsonToken f362205k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ JsonToken[] f362206l;

    static {
        JsonToken jsonToken = new JsonToken("BEGIN_ARRAY", 0);
        f362196b = jsonToken;
        JsonToken jsonToken2 = new JsonToken("END_ARRAY", 1);
        f362197c = jsonToken2;
        JsonToken jsonToken3 = new JsonToken("BEGIN_OBJECT", 2);
        f362198d = jsonToken3;
        JsonToken jsonToken4 = new JsonToken("END_OBJECT", 3);
        f362199e = jsonToken4;
        JsonToken jsonToken5 = new JsonToken("NAME", 4);
        f362200f = jsonToken5;
        JsonToken jsonToken6 = new JsonToken("STRING", 5);
        f362201g = jsonToken6;
        JsonToken jsonToken7 = new JsonToken("NUMBER", 6);
        f362202h = jsonToken7;
        JsonToken jsonToken8 = new JsonToken("BOOLEAN", 7);
        f362203i = jsonToken8;
        JsonToken jsonToken9 = new JsonToken("NULL", 8);
        f362204j = jsonToken9;
        JsonToken jsonToken10 = new JsonToken("END_DOCUMENT", 9);
        f362205k = jsonToken10;
        f362206l = new JsonToken[]{jsonToken, jsonToken2, jsonToken3, jsonToken4, jsonToken5, jsonToken6, jsonToken7, jsonToken8, jsonToken9, jsonToken10};
    }

    public JsonToken() {
        throw null;
    }

    public static JsonToken valueOf(String str) {
        return (JsonToken) Enum.valueOf(JsonToken.class, str);
    }

    public static JsonToken[] values() {
        return (JsonToken[]) f362206l.clone();
    }
}
