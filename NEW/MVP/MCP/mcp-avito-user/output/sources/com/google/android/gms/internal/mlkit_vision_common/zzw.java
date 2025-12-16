package com.google.android.gms.internal.mlkit_vision_common;

import I41.a;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class zzw extends zzs {

    /* renamed from: d, reason: collision with root package name */
    public final transient zzr f352926d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f352927e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f352928f;

    public zzw(zzr zzrVar, Object[] objArr, int i12) {
        this.f352926d = zzrVar;
        this.f352927e = objArr;
        this.f352928f = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int a(Object[] objArr) {
        return zzf().a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f352926d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs
    public final zzp g() {
        return new zzv(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f352928f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl
    /* renamed from: zzd */
    public final zzab iterator() {
        return zzf().listIterator(0);
    }
}
