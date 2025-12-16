package com.google.mlkit.vision.face.internal;

import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlm;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzof;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class j implements zzoa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f362488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzks f362489b;

    public /* synthetic */ j(boolean z12, zzks zzksVar) {
        this.f362488a = z12;
        this.f362489b = zzksVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
    public final zznr zza() {
        zzku zzkuVar = new zzku();
        zzkuVar.zze(this.f362488a ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzlm zzlmVar = new zzlm();
        zzlmVar.zzb(this.f362489b);
        zzkuVar.zzh(zzlmVar.zzc());
        return zzof.zzf(zzkuVar);
    }
}
