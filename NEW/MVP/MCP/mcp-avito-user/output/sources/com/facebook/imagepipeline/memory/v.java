package com.facebook.imagepipeline.memory;

import com.facebook.imagepipeline.memory.C36391i;
import com.facebook.infer.annotation.Nullsafe;
import java.util.HashSet;

/* compiled from: LruBucketsPoolBackend.java */
@Nullsafe
/* loaded from: classes13.dex */
public abstract class v<T> implements D<T> {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f340487a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final C36391i<T> f340488b = new C36391i<>();

    @I41.h
    public final T a() {
        T t12;
        C36391i<T> c36391i = this.f340488b;
        synchronized (c36391i) {
            C36391i.b<T> bVar = c36391i.f340471c;
            if (bVar == null) {
                t12 = null;
            } else {
                T tPollLast = bVar.f340474c.pollLast();
                if (bVar.f340474c.isEmpty()) {
                    c36391i.a(bVar);
                    c36391i.f340469a.remove(bVar.f340473b);
                }
                t12 = tPollLast;
            }
        }
        if (t12 != null) {
            synchronized (this) {
                this.f340487a.remove(t12);
            }
        }
        return t12;
    }
}
