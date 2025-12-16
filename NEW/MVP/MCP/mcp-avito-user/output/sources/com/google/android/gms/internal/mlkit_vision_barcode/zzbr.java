package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzbr extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbs f351792b;

    public zzbr(zzbs zzbsVar) {
        this.f351792b = zzbsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f351792b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzbs zzbsVar = this.f351792b;
        Map mapA = zzbsVar.a();
        return mapA != null ? mapA.values().iterator() : new zzbm(zzbsVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f351792b.size();
    }
}
