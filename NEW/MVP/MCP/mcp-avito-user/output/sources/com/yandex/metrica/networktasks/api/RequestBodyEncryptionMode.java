package com.yandex.metrica.networktasks.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class RequestBodyEncryptionMode {

    /* renamed from: b, reason: collision with root package name */
    public static final RequestBodyEncryptionMode f382428b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ RequestBodyEncryptionMode[] f382429c;

    /* JADX INFO: Fake field, exist only in values array */
    RequestBodyEncryptionMode EF0;

    static {
        RequestBodyEncryptionMode requestBodyEncryptionMode = new RequestBodyEncryptionMode("NONE", 0);
        RequestBodyEncryptionMode requestBodyEncryptionMode2 = new RequestBodyEncryptionMode("AES_RSA", 1);
        f382428b = requestBodyEncryptionMode2;
        f382429c = new RequestBodyEncryptionMode[]{requestBodyEncryptionMode, requestBodyEncryptionMode2};
    }

    public static RequestBodyEncryptionMode valueOf(String str) {
        return (RequestBodyEncryptionMode) Enum.valueOf(RequestBodyEncryptionMode.class, str);
    }

    public static RequestBodyEncryptionMode[] values() {
        return (RequestBodyEncryptionMode[]) f382429c.clone();
    }
}
