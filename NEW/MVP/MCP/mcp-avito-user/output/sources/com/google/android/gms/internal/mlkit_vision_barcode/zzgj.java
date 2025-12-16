package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzgj implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgj f351937a = new zzgj();

    /* renamed from: b, reason: collision with root package name */
    public static final c f351938b = P0.m(1, new c.b("maxMs"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f351939c = P0.m(2, new c.b("minMs"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f351940d = P0.m(3, new c.b("avgMs"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f351941e = P0.m(4, new c.b("firstQuartileMs"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f351942f = P0.m(5, new c.b("medianMs"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f351943g = P0.m(6, new c.b("thirdQuartileMs"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjs zzjsVar = (zzjs) obj;
        e eVar = (e) obj2;
        eVar.add(f351938b, zzjsVar.zzc());
        eVar.add(f351939c, zzjsVar.zze());
        eVar.add(f351940d, zzjsVar.zza());
        eVar.add(f351941e, zzjsVar.zzb());
        eVar.add(f351942f, zzjsVar.zzd());
        eVar.add(f351943g, zzjsVar.zzf());
    }
}
