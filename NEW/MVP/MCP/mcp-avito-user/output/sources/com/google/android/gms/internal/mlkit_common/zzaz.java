package com.google.android.gms.internal.mlkit_common;

import I41.a;
import java.util.Iterator;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzaz extends zzau {

    /* renamed from: d, reason: collision with root package name */
    public final transient zzat f351205d;

    /* renamed from: e, reason: collision with root package name */
    public final transient zzaq f351206e;

    public zzaz(zzat zzatVar, zzaq zzaqVar) {
        this.f351205d = zzatVar;
        this.f351206e = zzaqVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam
    public final int a(Object[] objArr) {
        return this.f351206e.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        return this.f351205d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzau, com.google.android.gms.internal.mlkit_common.zzam, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f351206e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f351205d.size();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzau, com.google.android.gms.internal.mlkit_common.zzam
    /* renamed from: zzd */
    public final zzbd iterator() {
        return this.f351206e.listIterator(0);
    }
}
