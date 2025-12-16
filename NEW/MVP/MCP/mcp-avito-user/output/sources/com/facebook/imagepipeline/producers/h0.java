package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;
import java.util.Comparator;

/* compiled from: PriorityStarvingThrottlingProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class h0<T> implements i0<T> {

    /* renamed from: a, reason: collision with root package name */
    @J41.a
    public int f340680a;

    /* compiled from: PriorityStarvingThrottlingProducer.java */
    public static class b<T> {
    }

    /* compiled from: PriorityStarvingThrottlingProducer.java */
    public static class c<T> implements Comparator<b<T>> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            ((b) obj).getClass();
            throw null;
        }
    }

    /* compiled from: PriorityStarvingThrottlingProducer.java */
    public class d extends r<T, T> {

        /* compiled from: PriorityStarvingThrottlingProducer.java */
        public class a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public d() {
            throw null;
        }

        public d(InterfaceC36410l interfaceC36410l, a aVar) {
            super(interfaceC36410l);
        }

        @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.AbstractC36395b
        public final void g() {
            this.f340716b.b();
            m();
            throw null;
        }

        @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.AbstractC36395b
        public final void h(Throwable th2) {
            this.f340716b.a(th2);
            m();
            throw null;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        public final void i(int i12, @I41.h Object obj) {
            this.f340716b.c(i12, obj);
            if (AbstractC36395b.e(i12)) {
                m();
                throw null;
            }
        }

        public final void m() {
            synchronized (h0.this) {
                h0.this.getClass();
                throw null;
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<T> interfaceC36410l, k0 k0Var) {
        System.nanoTime();
        k0Var.i().c(k0Var, "PriorityStarvingThrottlingProducer");
        synchronized (this) {
            int i12 = this.f340680a;
            if (i12 >= 0) {
                throw null;
            }
            this.f340680a = i12 + 1;
        }
        k0Var.i().j(k0Var, "PriorityStarvingThrottlingProducer", null);
        new d(interfaceC36410l, null);
        throw null;
    }
}
