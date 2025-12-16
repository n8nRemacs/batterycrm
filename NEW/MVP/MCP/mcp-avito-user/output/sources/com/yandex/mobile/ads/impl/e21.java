package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class e21 implements az0<v11> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f384732a;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final h21 f384736e = new h21();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final y11 f384733b = new y11();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final t21 f384734c = new t21();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final kl f384735d = new kl();

    public e21(@j.N Context context) {
        this.f384732a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.az0
    @j.P
    public final v11 a(@j.N zo0 zo0Var) {
        return (v11) this.f384736e.a(zo0Var);
    }

    @Override // com.yandex.mobile.ads.impl.az0
    public final boolean a() {
        v11 v11VarA = q21.b().a(this.f384732a);
        if (v11VarA != null && !this.f384733b.a(v11VarA)) {
            this.f384734c.getClass();
            if (!t21.a(v11VarA)) {
                this.f384735d.getClass();
                if (q21.b().g() == v11VarA.f0()) {
                    this.f384735d.getClass();
                    if (q21.b().f() == v11VarA.R()) {
                        this.f384735d.getClass();
                        if (q21.b().d() == v11VarA.v()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
