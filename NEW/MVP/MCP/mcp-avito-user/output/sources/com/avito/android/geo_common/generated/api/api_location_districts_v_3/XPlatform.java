package com.avito.android.geo_common.generated.api.api_location_districts_v_3;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApiLocationDistrictsV3Request.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/geo_common/generated/api/api_location_districts_v_3/XPlatform;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ios", "Android", "Mweb", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class XPlatform {

    @c("android")
    public static final XPlatform Android;

    @c("ios")
    public static final XPlatform Ios;

    @c("mweb")
    public static final XPlatform Mweb;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ XPlatform[] f159314c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f159315d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f159316b;

    static {
        XPlatform xPlatform = new XPlatform("Ios", 0, "ios");
        Ios = xPlatform;
        XPlatform xPlatform2 = new XPlatform("Android", 1, "android");
        Android = xPlatform2;
        XPlatform xPlatform3 = new XPlatform("Mweb", 2, "mweb");
        Mweb = xPlatform3;
        XPlatform[] xPlatformArr = {xPlatform, xPlatform2, xPlatform3};
        f159314c = xPlatformArr;
        f159315d = kotlin.enums.c.a(xPlatformArr);
    }

    private XPlatform(String str, int i12, String str2) {
        this.f159316b = str2;
    }

    public static XPlatform valueOf(String str) {
        return (XPlatform) Enum.valueOf(XPlatform.class, str);
    }

    public static XPlatform[] values() {
        return (XPlatform[]) f159314c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f159316b.toString();
    }
}
