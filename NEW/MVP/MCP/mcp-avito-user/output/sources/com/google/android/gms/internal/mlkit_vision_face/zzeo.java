package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzeo implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzeo f353076a = new zzeo();

    /* renamed from: b, reason: collision with root package name */
    public static final c f353077b = P0.s(1, new c.b("logEventKey"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f353078c = P0.s(2, new c.b("eventCount"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f353079d = P0.s(3, new c.b("inferenceDurationStats"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdp zzdpVar = (zzdp) obj;
        e eVar = (e) obj2;
        eVar.add(f353077b, zzdpVar.zza());
        eVar.add(f353078c, zzdpVar.zzc());
        eVar.add(f353079d, zzdpVar.zzb());
    }
}
