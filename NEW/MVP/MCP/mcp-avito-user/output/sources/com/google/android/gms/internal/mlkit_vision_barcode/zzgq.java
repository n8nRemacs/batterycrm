package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzgq implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgq f351954a = new zzgq();

    /* renamed from: b, reason: collision with root package name */
    public static final c f351955b = P0.m(1, new c.b("durationMs"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f351956c = P0.m(2, new c.b("errorCode"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f351957d = P0.m(3, new c.b("isColdCall"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f351958e = P0.m(4, new c.b("autoManageModelOnBackground"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f351959f = P0.m(5, new c.b("autoManageModelOnLowMemory"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f351960g = P0.m(6, new c.b("isNnApiEnabled"));

    /* renamed from: h, reason: collision with root package name */
    public static final c f351961h = P0.m(7, new c.b("eventsCount"));

    /* renamed from: i, reason: collision with root package name */
    public static final c f351962i = P0.m(8, new c.b("otherErrors"));

    /* renamed from: j, reason: collision with root package name */
    public static final c f351963j = P0.m(9, new c.b("remoteConfigValueForAcceleration"));

    /* renamed from: k, reason: collision with root package name */
    public static final c f351964k = P0.m(10, new c.b("isAccelerated"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkc zzkcVar = (zzkc) obj;
        e eVar = (e) obj2;
        eVar.add(f351955b, zzkcVar.zze());
        eVar.add(f351956c, zzkcVar.zza());
        eVar.add(f351957d, zzkcVar.zzd());
        eVar.add(f351958e, zzkcVar.zzb());
        eVar.add(f351959f, zzkcVar.zzc());
        eVar.add(f351960g, (Object) null);
        eVar.add(f351961h, (Object) null);
        eVar.add(f351962i, (Object) null);
        eVar.add(f351963j, (Object) null);
        eVar.add(f351964k, (Object) null);
    }
}
