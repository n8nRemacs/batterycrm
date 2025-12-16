package com.yandex.mobile.ads.exo.offline;

import com.yandex.mobile.ads.exo.offline.c;
import com.yandex.mobile.ads.exo.offline.d;
import com.yandex.mobile.ads.impl.b11;
import com.yandex.mobile.ads.impl.ch;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.kn;
import com.yandex.mobile.ads.impl.nh;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.uu0;
import com.yandex.mobile.ads.impl.xc0;
import j.P;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f383135a;

    /* renamed from: b, reason: collision with root package name */
    private final kn f383136b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f383137c;

    /* renamed from: d, reason: collision with root package name */
    private final nh f383138d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private d.a f383139e;

    /* renamed from: f, reason: collision with root package name */
    private volatile b11<Void, IOException> f383140f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f383141g;

    public class a extends b11<Void, IOException> {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.b11
        public final void b() {
            e.this.f383138d.b();
        }

        @Override // com.yandex.mobile.ads.impl.b11
        public final void c() {
            e.this.f383138d.a();
        }
    }

    public e(xc0 xc0Var, ch.b bVar, Executor executor) {
        this.f383135a = (Executor) db.a(executor);
        db.a(xc0Var.f391606b);
        kn knVarA = new kn.a().a(xc0Var.f391606b.f391654a).a(xc0Var.f391606b.f391658e).a(4).a();
        this.f383136b = knVarA;
        ch chVarB = bVar.b();
        this.f383137c = chVarB;
        this.f383138d = new nh(chVarB, knVarA, new com.my.target.ads.a(this, 6));
    }

    @Override // com.yandex.mobile.ads.exo.offline.d
    public final void cancel() {
        this.f383141g = true;
        b11<Void, IOException> b11Var = this.f383140f;
        if (b11Var != null) {
            b11Var.cancel(true);
        }
    }

    @Override // com.yandex.mobile.ads.exo.offline.d
    public final void remove() {
        this.f383137c.g().a(this.f383137c.h().a(this.f383136b));
    }

    @Override // com.yandex.mobile.ads.exo.offline.d
    public final void a(@P d.a aVar) {
        this.f383139e = aVar;
        this.f383140f = new a();
        boolean z12 = false;
        while (!z12) {
            try {
                if (this.f383141g) {
                    break;
                }
                this.f383135a.execute(this.f383140f);
                try {
                    this.f383140f.get();
                    z12 = true;
                } catch (ExecutionException e12) {
                    Throwable cause = e12.getCause();
                    cause.getClass();
                    if (!(cause instanceof uu0)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i12 = pc1.f388768a;
                        throw cause;
                    }
                }
            } finally {
                this.f383140f.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j12, long j13, long j14) {
        d.a aVar = this.f383139e;
        if (aVar == null) {
            return;
        }
        ((c.d) aVar).a(j12, j13, (j12 == -1 || j12 == 0) ? -1.0f : (j13 * 100.0f) / j12);
    }
}
