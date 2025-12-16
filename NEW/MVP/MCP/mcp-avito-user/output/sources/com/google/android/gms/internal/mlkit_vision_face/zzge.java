package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzge implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzge f353133a = new zzge();

    /* renamed from: b, reason: collision with root package name */
    public static final c f353134b = P0.s(1, new c.b("landmarkMode"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f353135c = P0.s(2, new c.b("classificationMode"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f353136d = P0.s(3, new c.b("performanceMode"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f353137e = P0.s(4, new c.b("contourMode"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f353138f = P0.s(5, new c.b("isTrackingEnabled"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f353139g = P0.s(6, new c.b("minFaceSize"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkd zzkdVar = (zzkd) obj;
        e eVar = (e) obj2;
        eVar.add(f353134b, zzkdVar.zzc());
        eVar.add(f353135c, zzkdVar.zza());
        eVar.add(f353136d, zzkdVar.zzd());
        eVar.add(f353137e, zzkdVar.zzb());
        eVar.add(f353138f, zzkdVar.zze());
        eVar.add(f353139g, zzkdVar.zzf());
    }
}
