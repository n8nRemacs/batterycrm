package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.huawei.hms.adapter.internal.AvailableCode;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @P
    public static Boolean f349612a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public static Boolean f349613b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public static Boolean f349614c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public static Boolean f349615d;

    @SideEffectFree
    @RX0.a
    @TargetApi(20)
    public static boolean a(@N Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f349612a == null) {
            f349612a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f349612a.booleanValue();
    }

    @RX0.a
    @TargetApi(AvailableCode.ERROR_NO_ACTIVITY)
    public static boolean b(@N Context context) {
        a(context);
        if (f349613b == null) {
            f349613b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f349613b.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }
}
