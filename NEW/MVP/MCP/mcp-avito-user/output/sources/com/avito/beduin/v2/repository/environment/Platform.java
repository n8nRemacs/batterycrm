package com.avito.beduin.v2.repository.environment;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Environment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/repository/environment/Platform;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Platform {

    /* renamed from: b, reason: collision with root package name */
    public static final Platform f338205b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Platform[] f338206c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f338207d;

    static {
        Platform platform = new Platform("Android", 0);
        f338205b = platform;
        Platform[] platformArr = {platform, new Platform("iOS", 1), new Platform("Mav", 2), new Platform("WebDesktop", 3)};
        f338206c = platformArr;
        f338207d = kotlin.enums.c.a(platformArr);
    }

    public Platform() {
        throw null;
    }

    public static Platform valueOf(String str) {
        return (Platform) Enum.valueOf(Platform.class, str);
    }

    public static Platform[] values() {
        return (Platform[]) f338206c.clone();
    }
}
