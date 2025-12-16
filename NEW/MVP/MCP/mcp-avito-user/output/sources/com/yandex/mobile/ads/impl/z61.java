package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x21;

/* loaded from: classes8.dex */
public final class z61 implements tu {

    /* renamed from: b, reason: collision with root package name */
    private final long f392192b;

    /* renamed from: c, reason: collision with root package name */
    private final tu f392193c;

    public class a implements x21 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x21 f392194a;

        public a(x21 x21Var) {
            this.f392194a = x21Var;
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final boolean b() {
            return this.f392194a.b();
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final long c() {
            return this.f392194a.c();
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final x21.a b(long j12) {
            x21.a aVarB = this.f392194a.b(j12);
            z21 z21Var = aVarB.f391532a;
            z21 z21Var2 = new z21(z21Var.f392159a, z61.this.f392192b + z21Var.f392160b);
            z21 z21Var3 = aVarB.f391533b;
            return new x21.a(z21Var2, new z21(z21Var3.f392159a, z61.this.f392192b + z21Var3.f392160b));
        }
    }

    public z61(long j12, tu tuVar) {
        this.f392192b = j12;
        this.f392193c = tuVar;
    }

    @Override // com.yandex.mobile.ads.impl.tu
    public final x91 a(int i12, int i13) {
        return this.f392193c.a(i12, i13);
    }

    @Override // com.yandex.mobile.ads.impl.tu
    public final void a() {
        this.f392193c.a();
    }

    @Override // com.yandex.mobile.ads.impl.tu
    public final void a(x21 x21Var) {
        this.f392193c.a(new a(x21Var));
    }
}
