package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zznu implements zzob {

    /* renamed from: a, reason: collision with root package name */
    @k0
    public final ArrayList f353428a;

    public zznu(Context context, zznt zzntVar) {
        ArrayList arrayList = new ArrayList();
        this.f353428a = arrayList;
        if (zzntVar.zzc()) {
            arrayList.add(new zzok(context, zzntVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzob
    public final void zza(zznr zznrVar) {
        Iterator it = this.f353428a.iterator();
        while (it.hasNext()) {
            ((zzob) it.next()).zza(zznrVar);
        }
    }
}
