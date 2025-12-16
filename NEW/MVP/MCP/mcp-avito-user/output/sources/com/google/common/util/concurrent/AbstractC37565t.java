package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC37532c;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AggregateFutureState.java */
@InterfaceC37531b0
@ReflectionSupport(ReflectionSupport.Level.FULL)
@XY0.b
/* renamed from: com.google.common.util.concurrent.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37565t<OutputT> extends AbstractC37532c.j<OutputT> {

    /* renamed from: k, reason: collision with root package name */
    public static final b f360646k;

    /* renamed from: l, reason: collision with root package name */
    public static final Logger f360647l = Logger.getLogger(AbstractC37565t.class.getName());

    /* renamed from: i, reason: collision with root package name */
    @I41.a
    public volatile Set<Throwable> f360648i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f360649j;

    /* compiled from: AggregateFutureState.java */
    /* renamed from: com.google.common.util.concurrent.t$b */
    public static abstract class b {
        public b() {
        }

        public abstract void a(AbstractC37563s abstractC37563s, Set set);

        public abstract int b(AbstractC37563s abstractC37563s);
    }

    /* compiled from: AggregateFutureState.java */
    /* renamed from: com.google.common.util.concurrent.t$c */
    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractC37565t<?>, Set<Throwable>> f360650a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicIntegerFieldUpdater<AbstractC37565t<?>> f360651b;

        public c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f360650a = atomicReferenceFieldUpdater;
            this.f360651b = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.AbstractC37565t.b
        public final void a(AbstractC37563s abstractC37563s, Set set) {
            AtomicReferenceFieldUpdater<AbstractC37565t<?>, Set<Throwable>> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f360650a;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC37563s, null, set)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC37563s) == null);
        }

        @Override // com.google.common.util.concurrent.AbstractC37565t.b
        public final int b(AbstractC37563s abstractC37563s) {
            return this.f360651b.decrementAndGet(abstractC37563s);
        }
    }

    /* compiled from: AggregateFutureState.java */
    /* renamed from: com.google.common.util.concurrent.t$d */
    public static final class d extends b {
        public d() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC37565t.b
        public final void a(AbstractC37563s abstractC37563s, Set set) {
            synchronized (abstractC37563s) {
                if (abstractC37563s.f360648i == null) {
                    abstractC37563s.f360648i = set;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC37565t.b
        public final int b(AbstractC37563s abstractC37563s) {
            int i12;
            synchronized (abstractC37563s) {
                i12 = abstractC37563s.f360649j - 1;
                abstractC37563s.f360649j = i12;
            }
            return i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b dVar;
        Throwable th2 = null;
        Object[] objArr = 0;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(AbstractC37565t.class, Set.class, "i"), AtomicIntegerFieldUpdater.newUpdater(AbstractC37565t.class, "j"));
        } catch (Error | RuntimeException e12) {
            dVar = new d();
            th2 = e12;
        }
        f360646k = dVar;
        if (th2 != null) {
            f360647l.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }
}
