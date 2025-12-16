package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzgj implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgj f353148a = new zzgj();

    /* renamed from: b, reason: collision with root package name */
    public static final c f353149b = P0.s(1, new c.b("durationMs"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f353150c = P0.s(2, new c.b("errorCode"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f353151d = P0.s(3, new c.b("isColdCall"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f353152e = P0.s(4, new c.b("autoManageModelOnBackground"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f353153f = P0.s(5, new c.b("autoManageModelOnLowMemory"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f353154g = P0.s(6, new c.b("isNnApiEnabled"));

    /* renamed from: h, reason: collision with root package name */
    public static final c f353155h = P0.s(7, new c.b("eventsCount"));

    /* renamed from: i, reason: collision with root package name */
    public static final c f353156i = P0.s(8, new c.b("otherErrors"));

    /* renamed from: j, reason: collision with root package name */
    public static final c f353157j = P0.s(9, new c.b("remoteConfigValueForAcceleration"));

    /* renamed from: k, reason: collision with root package name */
    public static final c f353158k = P0.s(10, new c.b("isAccelerated"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkl zzklVar = (zzkl) obj;
        e eVar = (e) obj2;
        eVar.add(f353149b, zzklVar.zze());
        eVar.add(f353150c, zzklVar.zza());
        eVar.add(f353151d, zzklVar.zzd());
        eVar.add(f353152e, zzklVar.zzb());
        eVar.add(f353153f, zzklVar.zzc());
        eVar.add(f353154g, (Object) null);
        eVar.add(f353155h, (Object) null);
        eVar.add(f353156i, (Object) null);
        eVar.add(f353157j, (Object) null);
        eVar.add(f353158k, (Object) null);
    }
}
