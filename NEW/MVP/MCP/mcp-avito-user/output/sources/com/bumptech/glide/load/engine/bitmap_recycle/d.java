package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.m;
import java.util.ArrayDeque;

/* compiled from: BaseKeyPool.java */
/* loaded from: classes5.dex */
abstract class d<T extends m> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f338914a;

    public d() {
        char[] cArr = com.bumptech.glide.util.m.f339649a;
        this.f338914a = new ArrayDeque(20);
    }

    public abstract T a();

    public final T b() {
        T t12 = (T) this.f338914a.poll();
        return t12 == null ? (T) a() : t12;
    }

    public final void c(T t12) {
        ArrayDeque arrayDeque = this.f338914a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(t12);
        }
    }
}
