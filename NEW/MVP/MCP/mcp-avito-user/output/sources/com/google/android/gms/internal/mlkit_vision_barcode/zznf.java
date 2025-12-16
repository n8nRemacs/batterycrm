package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zznf implements zznl {

    /* renamed from: a, reason: collision with root package name */
    @k0
    public final ArrayList f352201a;

    public zznf(Context context, zzne zzneVar) {
        ArrayList arrayList = new ArrayList();
        this.f352201a = arrayList;
        if (zzneVar.zzc()) {
            arrayList.add(new zznu(context, zzneVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zznl
    public final void zza(zznp zznpVar) {
        Iterator it = this.f352201a.iterator();
        while (it.hasNext()) {
            ((zznl) it.next()).zza(zznpVar);
        }
    }
}
