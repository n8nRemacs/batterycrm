package com.bumptech.glide.load.model;

import j.N;
import j.P;
import j.k0;
import java.util.ArrayDeque;

/* compiled from: ModelCache.java */
/* loaded from: classes5.dex */
public class m<A, B> {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.util.h<b<A>, B> f339237a;

    /* compiled from: ModelCache.java */
    public class a extends com.bumptech.glide.util.h<b<A>, B> {
        @Override // com.bumptech.glide.util.h
        public final void d(@N Object obj, @P Object obj2) {
            b bVar = (b) obj;
            bVar.getClass();
            ArrayDeque arrayDeque = b.f339238b;
            synchronized (arrayDeque) {
                arrayDeque.offer(bVar);
            }
        }
    }

    /* compiled from: ModelCache.java */
    @k0
    public static final class b<A> {

        /* renamed from: b, reason: collision with root package name */
        public static final ArrayDeque f339238b;

        /* renamed from: a, reason: collision with root package name */
        public A f339239a;

        static {
            char[] cArr = com.bumptech.glide.util.m.f339649a;
            f339238b = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b a(Object obj) {
            b bVar;
            ArrayDeque arrayDeque = f339238b;
            synchronized (arrayDeque) {
                bVar = (b) arrayDeque.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.f339239a = obj;
            return bVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.f339239a.equals(bVar.f339239a);
        }

        public final int hashCode() {
            return this.f339239a.hashCode();
        }
    }

    public m() {
        this(250L);
    }

    @P
    public final Object a(Object obj) {
        b<A> bVarA = b.a(obj);
        B b12 = this.f339237a.b(bVarA);
        ArrayDeque arrayDeque = b.f339238b;
        synchronized (arrayDeque) {
            arrayDeque.offer(bVarA);
        }
        return b12;
    }

    public final void b(Object obj, Object obj2) {
        this.f339237a.e(b.a(obj), obj2);
    }

    public m(long j12) {
        this.f339237a = new a(j12);
    }
}
