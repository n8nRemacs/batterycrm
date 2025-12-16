package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzgv implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv f353626a = new zzgv();

    /* renamed from: b, reason: collision with root package name */
    public static final c f353627b = P0.v(1, new c.b("landmarkMode"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f353628c = P0.v(2, new c.b("classificationMode"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f353629d = P0.v(3, new c.b("performanceMode"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f353630e = P0.v(4, new c.b("contourMode"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f353631f = P0.v(5, new c.b("isTrackingEnabled"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f353632g = P0.v(6, new c.b("minFaceSize"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzne zzneVar = (zzne) obj;
        e eVar = (e) obj2;
        eVar.add(f353627b, zzneVar.zzc());
        eVar.add(f353628c, zzneVar.zza());
        eVar.add(f353629d, zzneVar.zzd());
        eVar.add(f353630e, zzneVar.zzb());
        eVar.add(f353631f, zzneVar.zze());
        eVar.add(f353632g, zzneVar.zzf());
    }
}
