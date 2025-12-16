package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzbc extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbd f352978b;

    public zzbc(zzbd zzbdVar) {
        this.f352978b = zzbdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f352978b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzbd zzbdVar = this.f352978b;
        Map mapA = zzbdVar.a();
        return mapA != null ? mapA.values().iterator() : new zzax(zzbdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f352978b.size();
    }
}
