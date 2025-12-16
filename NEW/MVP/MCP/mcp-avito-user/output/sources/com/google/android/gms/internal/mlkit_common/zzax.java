package com.google.android.gms.internal.mlkit_common;

import java.util.AbstractMap;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzax extends zzaq {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzay f351201d;

    public zzax(zzay zzayVar) {
        this.f351201d = zzayVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i12) {
        zzay zzayVar = this.f351201d;
        zzae.zza(i12, zzayVar.f351204f, "index");
        int i13 = i12 + i12;
        Object obj = zzayVar.f351203e[i13];
        obj.getClass();
        Object obj2 = zzayVar.f351203e[i13 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f351201d.f351204f;
    }
}
