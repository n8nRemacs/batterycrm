package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public final class zzks implements zzkw {

    /* renamed from: a, reason: collision with root package name */
    @k0
    public final ArrayList f352892a;

    public zzks(Context context, zzkr zzkrVar) {
        ArrayList arrayList = new ArrayList();
        this.f352892a = arrayList;
        if (zzkrVar.zzc()) {
            arrayList.add(new zzld(context, zzkrVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkw
    public final void zza(zzkp zzkpVar) {
        Iterator it = this.f352892a.iterator();
        while (it.hasNext()) {
            ((zzkw) it.next()).zza(zzkpVar);
        }
    }
}
