package com.bumptech.glide.util;

import androidx.collection.C20199a;

/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: classes5.dex */
public final class b<K, V> extends C20199a<K, V> {

    /* renamed from: h, reason: collision with root package name */
    public int f339632h;

    @Override // androidx.collection.o1, java.util.Map
    public final void clear() {
        this.f339632h = 0;
        super.clear();
    }

    @Override // androidx.collection.o1
    public final void g(C20199a c20199a) {
        this.f339632h = 0;
        super.g(c20199a);
    }

    @Override // androidx.collection.o1
    public final V h(int i12) {
        this.f339632h = 0;
        return (V) super.h(i12);
    }

    @Override // androidx.collection.o1, java.util.Map
    public final int hashCode() {
        if (this.f339632h == 0) {
            this.f339632h = super.hashCode();
        }
        return this.f339632h;
    }

    @Override // androidx.collection.o1
    public final V j(int i12, V v12) {
        this.f339632h = 0;
        return (V) super.j(i12, v12);
    }

    @Override // androidx.collection.o1, java.util.Map
    public final V put(K k12, V v12) {
        this.f339632h = 0;
        return (V) super.put(k12, v12);
    }
}
