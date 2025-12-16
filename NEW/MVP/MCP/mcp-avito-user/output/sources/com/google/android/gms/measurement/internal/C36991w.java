package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C36729v;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36991w {

    /* renamed from: a, reason: collision with root package name */
    public final String f355412a;

    /* renamed from: b, reason: collision with root package name */
    public final String f355413b;

    /* renamed from: c, reason: collision with root package name */
    public final String f355414c;

    /* renamed from: d, reason: collision with root package name */
    public final long f355415d;

    /* renamed from: e, reason: collision with root package name */
    public final long f355416e;

    /* renamed from: f, reason: collision with root package name */
    public final zzaz f355417f;

    public C36991w(I2 i22, String str, String str2, String str3, long j12, Bundle bundle) {
        zzaz zzazVar;
        C36729v.f(str2);
        C36729v.f(str3);
        this.f355412a = str2;
        this.f355413b = str3;
        this.f355414c = TextUtils.isEmpty(str) ? null : str;
        this.f355415d = j12;
        this.f355416e = 0L;
        if (bundle == null || bundle.isEmpty()) {
            zzazVar = new zzaz(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    S1 s12 = i22.f354717i;
                    I2.c(s12);
                    s12.f354889f.b("Param name can't be null");
                    it.remove();
                } else {
                    N5 n52 = i22.f354720l;
                    I2.d(n52);
                    Object objA0 = n52.a0(bundle2.get(next), next);
                    if (objA0 == null) {
                        S1 s13 = i22.f354717i;
                        I2.c(s13);
                        s13.f354892i.c("Param value can't be null", i22.f354721m.f(next));
                        it.remove();
                    } else {
                        N5 n53 = i22.f354720l;
                        I2.d(n53);
                        n53.I(next, bundle2, objA0);
                    }
                }
            }
            zzazVar = new zzaz(bundle2);
        }
        this.f355417f = zzazVar;
    }

    public final C36991w a(I2 i22, long j12) {
        return new C36991w(i22, this.f355414c, this.f355412a, this.f355413b, this.f355415d, j12, this.f355417f);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f355417f);
        StringBuilder sb2 = new StringBuilder("Event{appId='");
        sb2.append(this.f355412a);
        sb2.append("', name='");
        return androidx.camera.camera2.internal.G.h(sb2, this.f355413b, "', params=", strValueOf, "}");
    }

    public C36991w(I2 i22, String str, String str2, String str3, long j12, long j13, zzaz zzazVar) {
        C36729v.f(str2);
        C36729v.f(str3);
        C36729v.j(zzazVar);
        this.f355412a = str2;
        this.f355413b = str3;
        this.f355414c = TextUtils.isEmpty(str) ? null : str;
        this.f355415d = j12;
        this.f355416e = j13;
        if (j13 != 0 && j13 > j12) {
            S1 s12 = i22.f354717i;
            I2.c(s12);
            s12.f354892i.a(S1.i(str2), "Event created with reverse previous/current timestamps. appId, name", S1.i(str3));
        }
        this.f355417f = zzazVar;
    }
}
