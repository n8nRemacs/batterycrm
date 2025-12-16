package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class R1 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference<String[]> f354867b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference<String[]> f354868c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference<String[]> f354869d = new AtomicReference<>();

    /* renamed from: a, reason: collision with root package name */
    public final Q1 f354870a;

    public R1(Q1 q12) {
        this.f354870a = q12;
    }

    public static String d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C36729v.j(atomicReference);
        C36729v.b(strArr.length == strArr2.length);
        for (int i12 = 0; i12 < strArr.length; i12++) {
            if (Objects.equals(str, strArr[i12])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i12] == null) {
                            strArr3[i12] = strArr2[i12] + "(" + strArr[i12] + ")";
                        }
                        str2 = strArr3[i12];
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f354870a.zza()) {
            return bundle.toString();
        }
        StringBuilder sbR = androidx.compose.foundation.H.r("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbR.length() != 8) {
                sbR.append(", ");
            }
            sbR.append(f(str));
            sbR.append(ContainerUtils.KEY_VALUE_DELIMITER);
            Object obj = bundle.get(str);
            sbR.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbR.append("}]");
        return sbR.toString();
    }

    public final String b(zzbe zzbeVar) {
        C36947p3 c36947p3 = (C36947p3) this.f354870a;
        if (!c36947p3.zza()) {
            return zzbeVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzbeVar.f355536d);
        sb2.append(",name=");
        sb2.append(c(zzbeVar.f355534b));
        sb2.append(",params=");
        zzaz zzazVar = zzbeVar.f355535c;
        sb2.append(zzazVar == null ? null : !c36947p3.zza() ? zzazVar.f355533b.toString() : a(zzazVar.i()));
        return sb2.toString();
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f354870a.zza() ? str : d(str, C36912k3.f355242c, C36912k3.f355240a, f354867b);
    }

    public final String e(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sbR = androidx.compose.foundation.H.r("[");
        for (Object obj : objArr) {
            String strA = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (strA != null) {
                if (sbR.length() != 1) {
                    sbR.append(", ");
                }
                sbR.append(strA);
            }
        }
        sbR.append("]");
        return sbR.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f354870a.zza() ? str : d(str, C36926m3.f355265b, C36926m3.f355264a, f354868c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        return !this.f354870a.zza() ? str : str.startsWith("_exp_") ? AK.c.k("experiment_id(", str, ")") : d(str, C36919l3.f355257b, C36919l3.f355256a, f354869d);
    }
}
