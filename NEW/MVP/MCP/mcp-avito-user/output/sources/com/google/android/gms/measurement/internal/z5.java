package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class z5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36997w5 f355520b;

    public z5(C36997w5 c36997w5, I5 i52) {
        this.f355520b = c36997w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36997w5 c36997w5 = this.f355520b;
        c36997w5.zzl().e();
        c36997w5.f355448k = new C36939o2(c36997w5);
        C36908k c36908k = new C36908k(c36997w5);
        c36908k.j();
        c36997w5.f355440c = c36908k;
        C36880g c36880gK = c36997w5.K();
        C36959r2 c36959r2 = c36997w5.f355438a;
        C36729v.j(c36959r2);
        c36880gK.f355163d = c36959r2;
        W4 w42 = new W4(c36997w5);
        w42.j();
        c36997w5.f355446i = w42;
        T5 t52 = new T5(c36997w5);
        t52.j();
        c36997w5.f355443f = t52;
        C36927m4 c36927m4 = new C36927m4(c36997w5);
        c36927m4.j();
        c36997w5.f355445h = c36927m4;
        C36956q5 c36956q5 = new C36956q5(c36997w5);
        c36956q5.j();
        c36997w5.f355442e = c36956q5;
        c36997w5.f355441d = new C36855c2(c36997w5);
        if (c36997w5.f355455r != c36997w5.f355456s) {
            S1 s1Zzj = c36997w5.zzj();
            s1Zzj.f354889f.a(Integer.valueOf(c36997w5.f355455r), "Not all upload components initialized", Integer.valueOf(c36997w5.f355456s));
        }
        c36997w5.f355450m = true;
        c36997w5.zzl().e();
        C36908k c36908k2 = c36997w5.f355440c;
        C36997w5.n(c36908k2);
        c36908k2.Z();
        if (c36997w5.f355446i.f354975g.a() == 0) {
            C36911k2 c36911k2 = c36997w5.f355446i.f354975g;
            ((com.google.android.gms.common.util.k) c36997w5.zzb()).getClass();
            c36911k2.b(System.currentTimeMillis());
        }
        c36997w5.y();
    }
}
