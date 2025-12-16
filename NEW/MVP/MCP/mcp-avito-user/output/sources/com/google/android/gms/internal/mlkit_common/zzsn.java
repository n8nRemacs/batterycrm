package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzsn implements zzsk {

    /* renamed from: a, reason: collision with root package name */
    @k0
    public final ArrayList f351725a;

    public zzsn(Context context, zzsm zzsmVar) {
        ArrayList arrayList = new ArrayList();
        this.f351725a = arrayList;
        if (zzsmVar.zzc()) {
            arrayList.add(new zzta(context, zzsmVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsk
    public final void zza(zzsj zzsjVar) {
        Iterator it = this.f351725a.iterator();
        while (it.hasNext()) {
            ((zzsk) it.next()).zza(zzsjVar);
        }
    }
}
