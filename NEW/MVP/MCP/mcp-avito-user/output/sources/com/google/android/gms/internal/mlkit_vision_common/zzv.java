package com.google.android.gms.internal.mlkit_vision_common;

import java.util.AbstractMap;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class zzv extends zzp {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzw f352925d;

    public zzv(zzw zzwVar) {
        this.f352925d = zzwVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i12) {
        zzw zzwVar = this.f352925d;
        zzf.zza(i12, zzwVar.f352928f, "index");
        int i13 = i12 + i12;
        Object[] objArr = zzwVar.f352927e;
        Object obj = objArr[i13];
        obj.getClass();
        Object obj2 = objArr[i13 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f352925d.f352928f;
    }
}
