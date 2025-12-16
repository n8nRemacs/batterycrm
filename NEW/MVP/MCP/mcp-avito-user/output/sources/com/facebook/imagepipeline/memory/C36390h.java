package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;
import j.k0;
import java.util.LinkedList;

/* compiled from: Bucket.java */
@k0
@J41.c
@Nullsafe
/* renamed from: com.facebook.imagepipeline.memory.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C36390h<V> {

    /* renamed from: a, reason: collision with root package name */
    public final int f340465a;

    /* renamed from: b, reason: collision with root package name */
    public final int f340466b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f340467c;

    /* renamed from: d, reason: collision with root package name */
    public int f340468d;

    public C36390h(int i12, int i13, int i14) {
        com.facebook.common.internal.o.d(i12 > 0);
        com.facebook.common.internal.o.d(i13 >= 0);
        com.facebook.common.internal.o.d(i14 >= 0);
        this.f340465a = i12;
        this.f340466b = i13;
        this.f340467c = new LinkedList();
        this.f340468d = i14;
    }

    public void a(V v12) {
        this.f340467c.add(v12);
    }

    @I41.h
    public V b() {
        return (V) this.f340467c.poll();
    }
}
