package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p21;
import com.yandex.mobile.ads.impl.z11;

/* loaded from: classes8.dex */
final class n21 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p21.a f388146b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p21 f388147c;

    public n21(p21 p21Var, p21.a aVar) {
        this.f388147c = p21Var;
        this.f388146b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f388147c.f388715h.a(this.f388147c.f388717j, new a());
    }

    public class a implements z11.a {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.z11.a
        public final void a() {
            p21.h(n21.this.f388147c);
            ts tsVarA = n21.this.f388147c.f388719l.a();
            fh0.a();
            n21 n21Var = n21.this;
            n21Var.f388146b.a(n21Var.f388147c.f388716i, tsVarA);
        }

        @Override // com.yandex.mobile.ads.impl.z11.a
        public final void a(@j.N ok1 ok1Var) {
            w2 w2VarA;
            n21.this.f388147c.f388718k.getClass();
            if (ok1Var instanceof r2) {
                w2VarA = x2.a(null, ((r2) ok1Var).a());
            } else {
                w2VarA = i5.f386311c;
            }
            n21.this.f388146b.a(w2VarA);
        }
    }
}
