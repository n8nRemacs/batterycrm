package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import com.facebook.infer.annotation.Nullsafe;
import fX0.InterfaceC40360F;
import j.k0;
import java.util.LinkedList;

/* compiled from: BucketMap.java */
@InterfaceC40360F
@Nullsafe
/* renamed from: com.facebook.imagepipeline.memory.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C36391i<T> {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray<b<T>> f340469a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    @k0
    @I41.h
    public b<T> f340470b;

    /* renamed from: c, reason: collision with root package name */
    @k0
    @I41.h
    public b<T> f340471c;

    /* compiled from: BucketMap.java */
    @k0
    /* renamed from: com.facebook.imagepipeline.memory.i$b */
    public static class b<I> {

        /* renamed from: a, reason: collision with root package name */
        @I41.h
        public b<I> f340472a;

        /* renamed from: b, reason: collision with root package name */
        public final int f340473b;

        /* renamed from: c, reason: collision with root package name */
        public final LinkedList<I> f340474c;

        /* renamed from: d, reason: collision with root package name */
        @I41.h
        public b<I> f340475d;

        public b() {
            throw null;
        }

        public b(b bVar, int i12, LinkedList linkedList, b bVar2, a aVar) {
            this.f340472a = bVar;
            this.f340473b = i12;
            this.f340474c = linkedList;
            this.f340475d = bVar2;
        }

        public final String toString() {
            return AK.c.i(this.f340473b, ")", new StringBuilder("LinkedEntry(key: "));
        }
    }

    public final synchronized void a(b<T> bVar) {
        try {
            b bVar2 = (b<T>) bVar.f340472a;
            b bVar3 = (b<T>) bVar.f340475d;
            if (bVar2 != null) {
                bVar2.f340475d = bVar3;
            }
            if (bVar3 != null) {
                bVar3.f340472a = bVar2;
            }
            bVar.f340472a = null;
            bVar.f340475d = null;
            if (bVar == this.f340470b) {
                this.f340470b = bVar3;
            }
            if (bVar == this.f340471c) {
                this.f340471c = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
