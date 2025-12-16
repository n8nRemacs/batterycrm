package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public abstract class AssetPackState {
    public static AssetPackState b(Bundle bundle, String str, C37196z0 c37196z0, C37165o1 c37165o1, N n12) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        int iA2 = n12.a(bundle.getInt(HY0.f.a("status", str)), str);
        int i12 = bundle.getInt(HY0.f.a("error_code", str));
        long j12 = bundle.getLong(HY0.f.a("bytes_downloaded", str));
        long j13 = bundle.getLong(HY0.f.a("total_bytes_to_download", str));
        double dA2 = c37196z0.a(str);
        long j14 = bundle.getLong(HY0.f.a("pack_version", str));
        long j15 = bundle.getLong(HY0.f.a("pack_base_version", str));
        int i13 = 1;
        if (iA2 == 4) {
            if (j15 != 0 && j15 != j14) {
                i13 = 2;
            }
            iA2 = 4;
        }
        return new X(str, iA2, i12, j12, j13, (int) Math.rint(dA2 * 100.0d), i13, bundle.getString(HY0.f.a("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), c37165o1.a(str));
    }

    public abstract String a();

    public abstract long c();

    @HY0.a
    public abstract int d();

    public abstract String e();

    public abstract String f();

    @HY0.b
    public abstract int g();

    public abstract long h();

    public abstract int i();

    @HY0.d
    public abstract int j();
}
