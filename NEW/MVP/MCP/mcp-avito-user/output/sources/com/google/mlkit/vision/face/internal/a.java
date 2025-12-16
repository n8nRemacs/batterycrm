package com.google.mlkit.vision.face.internal;

import TZ0.e;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.android.gms.internal.mlkit_vision_face.zzon;
import com.google.mlkit.common.sdkinternal.C37637f;
import com.google.mlkit.common.sdkinternal.C37646o;
import j.N;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public class a extends SZ0.f<List<TZ0.a>> implements TZ0.d {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f362461g;

    static {
        new e.a().a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(i iVar, C37637f c37637f, TZ0.e eVar, e eVar2) {
        Executor executor = eVar.f15722g;
        if (executor != null) {
            c37637f.getClass();
        } else {
            executor = (Executor) c37637f.f362333a.get();
        }
        zzoc zzocVarZzb = zzon.zzb(true != k.b() ? "play-services-mlkit-face-detection" : "face-detection");
        super(iVar, executor);
        boolean zB2 = k.b();
        this.f362461g = zB2;
        zzku zzkuVar = new zzku();
        zzkuVar.zze(zB2 ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzlj zzljVar = new zzlj();
        zzljVar.zze(k.a(eVar));
        zzkuVar.zzg(zzljVar.zzi());
        zzocVarZzb.zzd(zzof.zzg(zzkuVar, 1), zzkt.ON_DEVICE_FACE_CREATE);
    }

    @Override // com.google.android.gms.common.api.k
    @N
    public final Feature[] a() {
        return this.f362461g ? C37646o.f362376a : new Feature[]{C37646o.f362377b};
    }
}
