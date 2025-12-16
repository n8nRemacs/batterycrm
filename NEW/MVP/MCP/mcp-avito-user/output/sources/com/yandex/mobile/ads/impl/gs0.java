package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;

/* loaded from: classes8.dex */
public final class gs0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    @Deprecated
    private static final List<String> f385822a = C42745f0.U("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");

    public static void a(@Y61.k Context context) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            ArrayList arrayList = new ArrayList(f385822a);
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                arrayList.removeAll(C42756l.g0(strArr));
                if (arrayList.size() <= 0) {
                    return;
                }
                kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
                throw new g70(String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{arrayList}, 1)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
