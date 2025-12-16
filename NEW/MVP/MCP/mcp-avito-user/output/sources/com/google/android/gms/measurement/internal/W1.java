package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class W1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public String f354962a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public String f354963b;

    /* renamed from: c, reason: collision with root package name */
    public long f354964c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public Bundle f354965d;

    public static W1 b(zzbe zzbeVar) {
        String str = zzbeVar.f355534b;
        Bundle bundleI = zzbeVar.f355535c.i();
        W1 w12 = new W1();
        w12.f354962a = str;
        w12.f354963b = zzbeVar.f355536d;
        w12.f354965d = bundleI;
        w12.f354964c = zzbeVar.f355537e;
        return w12;
    }

    public final zzbe a() {
        return new zzbe(this.f354962a, new zzaz(new Bundle(this.f354965d)), this.f354963b, this.f354964c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f354965d);
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(this.f354963b);
        sb2.append(",name=");
        return androidx.camera.camera2.internal.G.g(sb2, this.f354962a, ",params=", strValueOf);
    }
}
