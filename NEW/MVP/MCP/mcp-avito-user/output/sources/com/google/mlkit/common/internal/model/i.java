package com.google.mlkit.common.internal.model;

import com.google.android.gms.internal.mlkit_common.zzms;
import com.google.android.gms.internal.mlkit_common.zzng;
import com.google.android.gms.internal.mlkit_common.zznh;
import com.google.android.gms.internal.mlkit_common.zznp;
import com.google.android.gms.internal.mlkit_common.zzsv;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class i implements InterfaceC37022e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f362300b;

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public final void onComplete(Task task) {
        j jVar = this.f362300b;
        jVar.getClass();
        Boolean bool = (Boolean) task.n();
        bool.booleanValue();
        zznh zznhVar = new zznh();
        zzms zzmsVar = new zzms();
        zzmsVar.zzb(zznp.CUSTOM);
        zzmsVar.zza(bool);
        zznhVar.zzg(zzmsVar.zzc());
        jVar.f362302b.zzd(zzsv.zzf(zznhVar), zzng.REMOTE_MODEL_IS_DOWNLOADED);
    }
}
