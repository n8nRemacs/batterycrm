package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;
import java.lang.ref.SoftReference;
import java.util.LinkedList;

/* compiled from: OOMSoftReferenceBucket.java */
@J41.c
@Nullsafe
/* loaded from: classes13.dex */
class C<V> extends C36390h<V> {

    /* renamed from: e, reason: collision with root package name */
    public LinkedList<com.facebook.common.references.f<V>> f340424e;

    @Override // com.facebook.imagepipeline.memory.C36390h
    public final void a(V v12) {
        com.facebook.common.references.f<V> fVarPoll = this.f340424e.poll();
        if (fVarPoll == null) {
            fVarPoll = new com.facebook.common.references.f<>();
        }
        fVarPoll.f339844a = new SoftReference<>(v12);
        fVarPoll.f339845b = new SoftReference<>(v12);
        fVarPoll.f339846c = new SoftReference<>(v12);
        this.f340467c.add(fVarPoll);
    }

    @Override // com.facebook.imagepipeline.memory.C36390h
    @I41.h
    public final V b() {
        com.facebook.common.references.f<V> fVar = (com.facebook.common.references.f) this.f340467c.poll();
        fVar.getClass();
        SoftReference<V> softReference = fVar.f339844a;
        V v12 = softReference == null ? null : (V) softReference.get();
        SoftReference<V> softReference2 = fVar.f339844a;
        if (softReference2 != null) {
            softReference2.clear();
            fVar.f339844a = null;
        }
        SoftReference<V> softReference3 = fVar.f339845b;
        if (softReference3 != null) {
            softReference3.clear();
            fVar.f339845b = null;
        }
        SoftReference<V> softReference4 = fVar.f339846c;
        if (softReference4 != null) {
            softReference4.clear();
            fVar.f339846c = null;
        }
        this.f340424e.add(fVar);
        return v12;
    }
}
