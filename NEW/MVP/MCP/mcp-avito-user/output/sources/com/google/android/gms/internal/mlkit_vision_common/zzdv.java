package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class zzdv implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzdv f352663a = new zzdv();

    /* renamed from: b, reason: collision with root package name */
    public static final c f352664b = P0.p(1, new c.b("durationMs"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f352665c = P0.p(2, new c.b("imageSource"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f352666d = P0.p(3, new c.b("imageFormat"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f352667e = P0.p(4, new c.b("imageByteSize"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f352668f = P0.p(5, new c.b("imageWidth"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f352669g = P0.p(6, new c.b("imageHeight"));

    /* renamed from: h, reason: collision with root package name */
    public static final c f352670h = P0.p(7, new c.b("rotationDegrees"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzhn zzhnVar = (zzhn) obj;
        e eVar = (e) obj2;
        eVar.add(f352664b, zzhnVar.zzg());
        eVar.add(f352665c, zzhnVar.zzb());
        eVar.add(f352666d, zzhnVar.zza());
        eVar.add(f352667e, zzhnVar.zzc());
        eVar.add(f352668f, zzhnVar.zze());
        eVar.add(f352669g, zzhnVar.zzd());
        eVar.add(f352670h, zzhnVar.zzf());
    }
}
