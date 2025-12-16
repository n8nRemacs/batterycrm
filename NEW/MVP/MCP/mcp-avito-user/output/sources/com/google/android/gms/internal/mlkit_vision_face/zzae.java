package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
class zzae extends zzap implements zzbs {
    @Override // com.google.android.gms.internal.mlkit_vision_face.zzap
    public /* bridge */ /* synthetic */ Collection c() {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzap
    public final Collection d(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new zzak(this, obj, list, null) : new zzao(this, obj, list, null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.util.List] */
    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbs
    public final List zzc(Object obj) {
        return zzh(obj);
    }
}
