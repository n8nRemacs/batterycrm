package com.google.android.gms.internal.mlkit_vision_common;

import I41.a;
import java.util.Iterator;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class zzx extends zzs {

    /* renamed from: d, reason: collision with root package name */
    public final transient zzr f352929d;

    /* renamed from: e, reason: collision with root package name */
    public final transient zzp f352930e;

    public zzx(zzr zzrVar, zzp zzpVar) {
        this.f352929d = zzrVar;
        this.f352930e = zzpVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int a(Object[] objArr) {
        return this.f352930e.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        return this.f352929d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f352930e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f352929d.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl
    /* renamed from: zzd */
    public final zzab iterator() {
        return this.f352930e.listIterator(0);
    }
}
