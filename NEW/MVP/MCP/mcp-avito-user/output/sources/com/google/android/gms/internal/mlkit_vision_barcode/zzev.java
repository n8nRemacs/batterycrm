package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzev implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzev f351886a = new zzev();

    /* renamed from: b, reason: collision with root package name */
    public static final c f351887b = P0.m(1, new c.b("logEventKey"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f351888c = P0.m(2, new c.b("eventCount"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f351889d = P0.m(3, new c.b("inferenceDurationStats"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzea zzeaVar = (zzea) obj;
        e eVar = (e) obj2;
        eVar.add(f351887b, zzeaVar.zza());
        eVar.add(f351888c, zzeaVar.zzc());
        eVar.add(f351889d, zzeaVar.zzb());
    }
}
