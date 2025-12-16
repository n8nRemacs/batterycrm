package com.avito.android.remote.early_access.generated.api.order_status_v_2;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderStatusV2Request.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/early_access/generated/api/order_status_v_2/XPlatform;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ios", "Android", "Mweb", "Desktop", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class XPlatform {

    @c("android")
    public static final XPlatform Android;

    @c("desktop")
    public static final XPlatform Desktop;

    @c("ios")
    public static final XPlatform Ios;

    @c("mweb")
    public static final XPlatform Mweb;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ XPlatform[] f253387c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f253388d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f253389b;

    static {
        XPlatform xPlatform = new XPlatform("Ios", 0, "ios");
        Ios = xPlatform;
        XPlatform xPlatform2 = new XPlatform("Android", 1, "android");
        Android = xPlatform2;
        XPlatform xPlatform3 = new XPlatform("Mweb", 2, "mweb");
        Mweb = xPlatform3;
        XPlatform xPlatform4 = new XPlatform("Desktop", 3, "desktop");
        Desktop = xPlatform4;
        XPlatform[] xPlatformArr = {xPlatform, xPlatform2, xPlatform3, xPlatform4};
        f253387c = xPlatformArr;
        f253388d = kotlin.enums.c.a(xPlatformArr);
    }

    private XPlatform(String str, int i12, String str2) {
        this.f253389b = str2;
    }

    public static XPlatform valueOf(String str) {
        return (XPlatform) Enum.valueOf(XPlatform.class, str);
    }

    public static XPlatform[] values() {
        return (XPlatform[]) f253387c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f253389b.toString();
    }
}
