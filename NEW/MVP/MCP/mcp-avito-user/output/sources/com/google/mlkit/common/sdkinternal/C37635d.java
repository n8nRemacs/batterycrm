package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.C36713l;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* renamed from: com.google.mlkit.common.sdkinternal.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37635d {

    /* renamed from: a, reason: collision with root package name */
    public static final C36713l f362332a = new C36713l("CommonUtils", "");

    @j.N
    @RX0.a
    public static String a(@j.N Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e12) {
            f362332a.b("Exception thrown when trying to get app version ".concat(e12.toString()));
            return "";
        }
    }
}
