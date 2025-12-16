package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzgc implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgc f353125a = new zzgc();

    /* renamed from: b, reason: collision with root package name */
    public static final c f353126b = P0.s(1, new c.b("maxMs"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f353127c = P0.s(2, new c.b("minMs"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f353128d = P0.s(3, new c.b("avgMs"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f353129e = P0.s(4, new c.b("firstQuartileMs"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f353130f = P0.s(5, new c.b("medianMs"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f353131g = P0.s(6, new c.b("thirdQuartileMs"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjv zzjvVar = (zzjv) obj;
        e eVar = (e) obj2;
        eVar.add(f353126b, zzjvVar.zzc());
        eVar.add(f353127c, zzjvVar.zze());
        eVar.add(f353128d, zzjvVar.zza());
        eVar.add(f353129e, zzjvVar.zzb());
        eVar.add(f353130f, zzjvVar.zzd());
        eVar.add(f353131g, zzjvVar.zzf());
    }
}
