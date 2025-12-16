package com.google.common.util.concurrent;

import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Striped.java */
@InterfaceC37531b0
@XY0.d
@XY0.c
/* loaded from: classes6.dex */
public abstract class i1<L> {

    /* compiled from: Striped.java */
    public static class b<L> extends f<L> {

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f360613b;

        public b() {
            throw null;
        }

        public b(int i12, com.google.common.base.e0 e0Var, a aVar) {
            super(i12);
            int i13 = 0;
            com.google.common.base.M.d("Stripes must be <= 2^30)", i12 <= 1073741824);
            this.f360613b = new Object[this.f360614a + 1];
            while (true) {
                Object[] objArr = this.f360613b;
                if (i13 >= objArr.length) {
                    return;
                }
                objArr[i13] = e0Var.get();
                i13++;
            }
        }
    }

    /* compiled from: Striped.java */
    @XY0.e
    public static class c<L> extends f<L> {
    }

    /* compiled from: Striped.java */
    public static class d extends ReentrantLock {
        public d() {
            super(false);
        }
    }

    /* compiled from: Striped.java */
    public static class e extends Semaphore {
    }

    /* compiled from: Striped.java */
    public static abstract class f<L> extends i1<L> {

        /* renamed from: a, reason: collision with root package name */
        public final int f360614a;

        public f(int i12) {
            super();
            com.google.common.base.M.d("Stripes must be positive", i12 > 0);
            this.f360614a = i12 > 1073741824 ? -1 : (1 << com.google.common.math.f.b(i12, RoundingMode.CEILING)) - 1;
        }
    }

    /* compiled from: Striped.java */
    @XY0.e
    public static class g<L> extends f<L> {

        /* compiled from: Striped.java */
        public static final class a<L> extends WeakReference<L> {
        }
    }

    /* compiled from: Striped.java */
    public static final class h extends AbstractConditionC37551l0 {

        /* renamed from: a, reason: collision with root package name */
        public final Condition f360615a;

        public h(Condition condition) {
            this.f360615a = condition;
        }

        @Override // com.google.common.util.concurrent.AbstractConditionC37551l0
        public final Condition a() {
            return this.f360615a;
        }
    }

    /* compiled from: Striped.java */
    public static final class i extends AbstractLockC37562r0 {

        /* renamed from: b, reason: collision with root package name */
        public final Lock f360616b;

        public i(Lock lock, j jVar) {
            this.f360616b = lock;
        }

        @Override // com.google.common.util.concurrent.AbstractLockC37562r0
        public final Lock a() {
            return this.f360616b;
        }

        @Override // com.google.common.util.concurrent.AbstractLockC37562r0, java.util.concurrent.locks.Lock
        public final Condition newCondition() {
            return new h(this.f360616b.newCondition());
        }
    }

    /* compiled from: Striped.java */
    public static final class j implements ReadWriteLock {

        /* renamed from: b, reason: collision with root package name */
        public final ReentrantReadWriteLock f360617b = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public final Lock readLock() {
            return new i(this.f360617b.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public final Lock writeLock() {
            return new i(this.f360617b.writeLock(), this);
        }
    }

    public i1() {
    }
}
