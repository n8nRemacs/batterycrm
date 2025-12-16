package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p21;

/* loaded from: classes8.dex */
final class m21 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p21.a f387835b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p21 f387836c;

    public class a implements b9 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.b9
        public final void a(@j.P u8 u8Var) {
            m21.this.f387836c.f388710c.a(z3.f392162b);
            if (u8Var != null) {
                m21.this.f387836c.f388716i.a(u8Var.a());
                m21.this.f387836c.f388716i.b(u8Var.b());
                m21.this.f387836c.f388716i.a(u8Var.c());
            }
            m21 m21Var = m21.this;
            p21.b(m21Var.f387836c, m21Var.f387835b);
        }
    }

    public m21(p21 p21Var, p21.a aVar) {
        this.f387836c = p21Var;
        this.f387835b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f387836c.f388714g.a(this.f387836c.f388708a, new a());
    }
}
