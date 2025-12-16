package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* compiled from: ThrottlingProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class z0<T> implements i0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f340775a;

    /* renamed from: b, reason: collision with root package name */
    @J41.a
    public int f340776b;

    /* renamed from: c, reason: collision with root package name */
    @J41.a
    public final ConcurrentLinkedQueue<Pair<InterfaceC36410l<T>, k0>> f340777c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f340778d;

    /* compiled from: ThrottlingProducer.java */
    public class b extends r<T, T> {
        public b() {
            throw null;
        }

        public b(InterfaceC36410l interfaceC36410l, a aVar) {
            super(interfaceC36410l);
        }

        @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.AbstractC36395b
        public final void g() {
            this.f340716b.b();
            m();
        }

        @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.AbstractC36395b
        public final void h(Throwable th2) {
            this.f340716b.a(th2);
            m();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        public final void i(int i12, @I41.h Object obj) {
            this.f340716b.c(i12, obj);
            if (AbstractC36395b.e(i12)) {
                m();
            }
        }

        public final void m() {
            Pair<InterfaceC36410l<T>, k0> pairPoll;
            synchronized (z0.this) {
                try {
                    pairPoll = z0.this.f340777c.poll();
                    if (pairPoll == null) {
                        z0 z0Var = z0.this;
                        z0Var.f340776b--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pairPoll != null) {
                z0.this.f340778d.execute(new A0(this, pairPoll));
            }
        }
    }

    public z0(Executor executor, s0 s0Var) {
        executor.getClass();
        this.f340778d = executor;
        this.f340775a = s0Var;
        this.f340777c = new ConcurrentLinkedQueue<>();
        this.f340776b = 0;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<T> interfaceC36410l, k0 k0Var) {
        boolean z12;
        k0Var.i().c(k0Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i12 = this.f340776b;
                z12 = true;
                if (i12 >= 5) {
                    this.f340777c.add(Pair.create(interfaceC36410l, k0Var));
                } else {
                    this.f340776b = i12 + 1;
                    z12 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12) {
            return;
        }
        k0Var.i().j(k0Var, "ThrottlingProducer", null);
        this.f340775a.b(new b(interfaceC36410l, null), k0Var);
    }
}
