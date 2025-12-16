package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39205w;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: com.yandex.metrica.impl.ob.ib, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38876ib {

    /* renamed from: a, reason: collision with root package name */
    private Uh f380774a;

    /* renamed from: b, reason: collision with root package name */
    private C38826gb f380775b;

    /* renamed from: c, reason: collision with root package name */
    private final C39205w f380776c;

    /* renamed from: d, reason: collision with root package name */
    private final C38851hb f380777d;

    /* renamed from: com.yandex.metrica.impl.ob.ib$a */
    public static final class a implements C39205w.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.C39205w.b
        public final void a(@Y61.k C39205w.a aVar) {
            C38876ib.this.b();
        }
    }

    @j.k0
    public C38876ib(@Y61.k C39205w c39205w, @Y61.k C38851hb c38851hb) {
        this.f380776c = c39205w;
        this.f380777d = c38851hb;
    }

    public synchronized void b(@Y61.k C39057pi c39057pi) {
        Uh uh2;
        try {
            if (!kotlin.jvm.internal.L.f(c39057pi.m(), this.f380774a)) {
                this.f380774a = c39057pi.m();
                C38826gb c38826gb = this.f380775b;
                if (c38826gb != null) {
                    c38826gb.a();
                }
                this.f380775b = null;
                if (a() && this.f380775b == null && (uh2 = this.f380774a) != null) {
                    this.f380775b = this.f380777d.a(uh2);
                }
            }
        } finally {
        }
    }

    public final synchronized void a(@Y61.k C39057pi c39057pi) {
        this.f380774a = c39057pi.m();
        this.f380776c.a(new a());
        b();
    }

    private final boolean a() {
        boolean zD2;
        Uh uh2 = this.f380774a;
        if (uh2 == null) {
            return false;
        }
        C39205w.a aVarC = this.f380776c.c();
        if (uh2.c().length() <= 0) {
            return false;
        }
        int iOrdinal = aVarC.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            zD2 = uh2.d();
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            zD2 = true;
        }
        return zD2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void b() {
        Uh uh2;
        try {
            boolean z12 = this.f380775b != null;
            if (a() == z12) {
                return;
            }
            if (z12) {
                C38826gb c38826gb = this.f380775b;
                if (c38826gb != null) {
                    c38826gb.a();
                }
                this.f380775b = null;
                return;
            }
            if (this.f380775b == null && (uh2 = this.f380774a) != null) {
                this.f380775b = this.f380777d.a(uh2);
            }
        } finally {
        }
    }
}
