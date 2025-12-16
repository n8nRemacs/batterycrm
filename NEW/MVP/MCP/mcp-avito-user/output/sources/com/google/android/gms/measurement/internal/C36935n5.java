package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.n5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36935n5 {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f355287b = {"TcfDataEnabled", "GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f355288a;

    public C36935n5(HashMap map) {
        HashMap map2 = new HashMap();
        this.f355288a = map2;
        map2.putAll(map);
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = f355287b;
        for (int i12 = 0; i12 < 7; i12++) {
            String str = strArr[i12];
            HashMap map = this.f355288a;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    public final int b() {
        try {
            String str = (String) this.f355288a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C36935n5) {
            return a().equalsIgnoreCase(((C36935n5) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
