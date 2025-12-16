package com.google.mlkit.common.internal.model;

import com.google.android.gms.internal.mlkit_common.zzlx;
import com.google.android.gms.internal.mlkit_common.zzng;
import com.google.android.gms.internal.mlkit_common.zznh;
import com.google.android.gms.internal.mlkit_common.zznp;
import com.google.android.gms.internal.mlkit_common.zzsv;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class f implements InterfaceC37022e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f362296b;

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public final void onComplete(Task task) {
        j jVar = this.f362296b;
        jVar.getClass();
        boolean zR2 = task.r();
        zznh zznhVar = new zznh();
        zzlx zzlxVar = new zzlx();
        zzlxVar.zzb(zznp.CUSTOM);
        zzlxVar.zza(Boolean.valueOf(zR2));
        zznhVar.zze(zzlxVar.zzc());
        jVar.f362302b.zzd(zzsv.zzf(zznhVar), zzng.REMOTE_MODEL_DELETE_ON_DEVICE);
    }
}
