package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
class zzat extends zzbe implements zzch {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbe
    public /* bridge */ /* synthetic */ Collection c() {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbe
    public final Collection d(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new zzaz(this, obj, list, null) : new zzbd(this, obj, list, null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.util.List] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzch
    public final List zzc(Object obj) {
        return zzh(obj);
    }
}
