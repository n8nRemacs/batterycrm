package com.google.android.gms.common;

import aZ0.InterfaceC19846b;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.errorprone.annotations.RestrictedInheritance;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
@InterfaceC36733z
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@InterfaceC19846b
/* renamed from: com.google.android.gms.common.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36734j {

    /* renamed from: c, reason: collision with root package name */
    @I41.h
    public static C36734j f349498c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f349499a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f349500b;

    public C36734j(@j.N Context context) {
        this.f349499a = context.getApplicationContext();
    }

    @j.N
    @RX0.a
    public static C36734j a(@j.N Context context) {
        C36729v.j(context);
        synchronized (C36734j.class) {
            if (f349498c == null) {
                F f12 = N.f348876a;
                synchronized (N.class) {
                    try {
                        if (N.f348882g == null) {
                            N.f348882g = context.getApplicationContext();
                        }
                    } finally {
                    }
                }
                f349498c = new C36734j(context);
            }
        }
        return f349498c;
    }

    @I41.h
    public static final J c(PackageInfo packageInfo, J... jArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        K k12 = new K(packageInfo.signatures[0].toByteArray());
        for (int i12 = 0; i12 < jArr.length; i12++) {
            if (jArr[i12].equals(k12)) {
                return jArr[i12];
            }
        }
        return null;
    }

    public static final boolean d(@j.N PackageInfo packageInfo, boolean z12) {
        PackageInfo packageInfo2;
        if (!z12) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z12 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z12 ? c(packageInfo2, M.f348875a) : c(packageInfo2, M.f348875a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0178 A[EDGE_INSN: B:117:0x0178->B:92:0x0178 BREAK  A[LOOP:0: B:8:0x001a->B:89:0x016a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a A[LOOP:0: B:8:0x001a->B:89:0x016a, LOOP_END] */
    @RX0.a
    @com.google.android.gms.common.internal.InterfaceC36733z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r18) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C36734j.b(int):boolean");
    }
}
