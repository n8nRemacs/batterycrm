package com.google.mlkit.vision.face.internal;

import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_face.zzjx;
import com.google.android.gms.internal.mlkit_vision_face.zzjy;
import com.google.android.gms.internal.mlkit_vision_face.zzjz;
import com.google.android.gms.internal.mlkit_vision_face.zzka;
import com.google.android.gms.internal.mlkit_vision_face.zzkb;
import com.google.android.gms.internal.mlkit_vision_face.zzkd;
import com.google.mlkit.common.sdkinternal.C37642k;
import j.k0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @k0
    public static final AtomicReference f362490a = new AtomicReference();

    public static zzkd a(TZ0.e eVar) {
        zzjx zzjxVar = new zzjx();
        int i12 = eVar.f15716a;
        zzjxVar.zzd(i12 != 1 ? i12 != 2 ? zzka.UNKNOWN_LANDMARKS : zzka.ALL_LANDMARKS : zzka.NO_LANDMARKS);
        int i13 = eVar.f15718c;
        zzjxVar.zza(i13 != 1 ? i13 != 2 ? zzjy.UNKNOWN_CLASSIFICATIONS : zzjy.ALL_CLASSIFICATIONS : zzjy.NO_CLASSIFICATIONS);
        int i14 = eVar.f15719d;
        zzjxVar.zzf(i14 != 1 ? i14 != 2 ? zzkb.UNKNOWN_PERFORMANCE : zzkb.ACCURATE : zzkb.FAST);
        int i15 = eVar.f15717b;
        zzjxVar.zzb(i15 != 1 ? i15 != 2 ? zzjz.UNKNOWN_CONTOURS : zzjz.ALL_CONTOURS : zzjz.NO_CONTOURS);
        zzjxVar.zzc(Boolean.valueOf(eVar.f15720e));
        zzjxVar.zze(Float.valueOf(eVar.f15721f));
        return zzjxVar.zzk();
    }

    public static boolean b() {
        AtomicReference atomicReference = f362490a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z12 = DynamiteModule.a(C37642k.c().b(), ModuleDescriptor.MODULE_ID) > 0;
        atomicReference.set(Boolean.valueOf(z12));
        return z12;
    }
}
