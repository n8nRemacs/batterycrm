package com.avito.avcalls.android.utils;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BuildInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/utils/Platform;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Platform {

    /* renamed from: b, reason: collision with root package name */
    public static final Platform f332423b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Platform[] f332424c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f332425d;

    static {
        Platform platform = new Platform("ANDROID", 0);
        f332423b = platform;
        Platform[] platformArr = {platform, new Platform("IOS", 1)};
        f332424c = platformArr;
        f332425d = kotlin.enums.c.a(platformArr);
    }

    public Platform() {
        throw null;
    }

    public static Platform valueOf(String str) {
        return (Platform) Enum.valueOf(Platform.class, str);
    }

    public static Platform[] values() {
        return (Platform[]) f332424c.clone();
    }
}
