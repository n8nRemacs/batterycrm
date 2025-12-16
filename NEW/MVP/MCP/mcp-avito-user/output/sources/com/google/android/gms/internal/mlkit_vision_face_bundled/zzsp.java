package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.content.Context;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzsp implements zzsm {

    /* renamed from: a, reason: collision with root package name */
    @k0
    public final ArrayList f353974a;

    public zzsp(Context context, zzso zzsoVar) {
        ArrayList arrayList = new ArrayList();
        this.f353974a = arrayList;
        if (zzsoVar.zzc()) {
            arrayList.add(new zztb(context, zzsoVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsm
    public final void zza(zzsl zzslVar) {
        Iterator it = this.f353974a.iterator();
        while (it.hasNext()) {
            ((zzsm) it.next()).zza(zzslVar);
        }
    }
}
