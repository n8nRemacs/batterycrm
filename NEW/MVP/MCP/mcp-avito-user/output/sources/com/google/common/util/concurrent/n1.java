package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC37545i0;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: TrustedListenableFutureTask.java */
@InterfaceC37531b0
@XY0.b
/* loaded from: classes6.dex */
class n1<V> extends AbstractC37545i0.a<V> implements RunnableFuture<V> {

    /* renamed from: j, reason: collision with root package name */
    @I41.a
    public volatile b f360627j;

    /* compiled from: TrustedListenableFutureTask.java */
    public final class a extends B0<D0<V>> {
        @Override // com.google.common.util.concurrent.B0
        public final void a(Throwable th2) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.B0
        public final void b(Object obj) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.B0
        public final boolean d() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.B0
        public final Object e() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.B0
        public final String f() {
            throw null;
        }
    }

    /* compiled from: TrustedListenableFutureTask.java */
    public final class b extends B0<V> {

        /* renamed from: d, reason: collision with root package name */
        public final Callable<V> f360628d;

        public b(Callable<V> callable) {
            callable.getClass();
            this.f360628d = callable;
        }

        @Override // com.google.common.util.concurrent.B0
        public final void a(Throwable th2) {
            n1.this.o(th2);
        }

        @Override // com.google.common.util.concurrent.B0
        public final void b(@T0 V v12) {
            n1.this.n(v12);
        }

        @Override // com.google.common.util.concurrent.B0
        public final boolean d() {
            return n1.this.isDone();
        }

        @Override // com.google.common.util.concurrent.B0
        @T0
        public final V e() {
            return this.f360628d.call();
        }

        @Override // com.google.common.util.concurrent.B0
        public final String f() {
            return this.f360628d.toString();
        }
    }

    public n1(Callable<V> callable) {
        this.f360627j = new b(callable);
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c
    public final void c() {
        b bVar;
        if (q() && (bVar = this.f360627j) != null) {
            bVar.c();
        }
        this.f360627j = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c
    @I41.a
    public final String l() {
        b bVar = this.f360627j;
        if (bVar == null) {
            return super.l();
        }
        return "task=[" + bVar + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        b bVar = this.f360627j;
        if (bVar != null) {
            bVar.run();
        }
        this.f360627j = null;
    }
}
