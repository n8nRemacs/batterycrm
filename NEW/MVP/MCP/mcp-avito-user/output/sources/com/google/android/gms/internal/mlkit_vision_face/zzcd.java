package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzcd extends zzbn {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzce f353012d;

    public zzcd(zzce zzceVar) {
        this.f353012d = zzceVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i12) {
        zzce zzceVar = this.f353012d;
        zzab.zza(i12, zzceVar.f353015f, "index");
        int i13 = i12 + i12;
        Object[] objArr = zzceVar.f353014e;
        Object obj = objArr[i13];
        obj.getClass();
        Object obj2 = objArr[i13 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f353012d.f353015f;
    }
}
