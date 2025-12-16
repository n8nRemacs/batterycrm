package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzbo extends zzbj {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbp f353507d;

    public zzbo(zzbp zzbpVar) {
        this.f353507d = zzbpVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i12) {
        zzbp zzbpVar = this.f353507d;
        zzav.zza(i12, zzbpVar.f353510f, "index");
        int i13 = i12 + i12;
        Object[] objArr = zzbpVar.f353509e;
        Object obj = objArr[i13];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i13 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f353507d.f353510f;
    }
}
