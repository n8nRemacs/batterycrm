package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzcs extends zzcc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzct f351826d;

    public zzcs(zzct zzctVar) {
        this.f351826d = zzctVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i12) {
        zzct zzctVar = this.f351826d;
        zzaq.zza(i12, zzctVar.f351829f, "index");
        int i13 = i12 + i12;
        Object[] objArr = zzctVar.f351828e;
        Object obj = objArr[i13];
        obj.getClass();
        Object obj2 = objArr[i13 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f351826d.f351829f;
    }
}
