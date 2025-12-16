package com.facebook.imagepipeline.cache;

import com.facebook.infer.annotation.Nullsafe;
import java.util.LinkedHashSet;

/* compiled from: BoundedLinkedHashSet.java */
@J41.d
@Nullsafe
/* renamed from: com.facebook.imagepipeline.cache.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C36374g<E> {

    /* renamed from: a, reason: collision with root package name */
    public final int f340227a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<E> f340228b;

    public C36374g(int i12) {
        this.f340228b = new LinkedHashSet<>(i12);
        this.f340227a = i12;
    }

    public final synchronized void a(com.facebook.cache.common.c cVar) {
        try {
            if (this.f340228b.size() == this.f340227a) {
                LinkedHashSet<E> linkedHashSet = this.f340228b;
                linkedHashSet.remove(linkedHashSet.iterator().next());
            }
            this.f340228b.remove(cVar);
            this.f340228b.add(cVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
