package com.google.android.gms.internal.mlkit_common;

import I41.a;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzay extends zzau {

    /* renamed from: d, reason: collision with root package name */
    public final transient zzat f351202d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f351203e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f351204f;

    public zzay(zzat zzatVar, Object[] objArr, int i12) {
        this.f351202d = zzatVar;
        this.f351203e = objArr;
        this.f351204f = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam
    public final int a(Object[] objArr) {
        return zzf().a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f351202d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzau
    public final zzaq g() {
        return new zzax(this);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzau, com.google.android.gms.internal.mlkit_common.zzam, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f351204f;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzau, com.google.android.gms.internal.mlkit_common.zzam
    /* renamed from: zzd */
    public final zzbd iterator() {
        return zzf().listIterator(0);
    }
}
