package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzep implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzep f353080a = new zzep();

    /* renamed from: b, reason: collision with root package name */
    public static final c f353081b = P0.s(1, new c.b("errorCode"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f353082c = P0.s(2, new c.b("isColdCall"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f353083d = P0.s(3, new c.b("imageInfo"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f353084e = P0.s(4, new c.b("detectorOptions"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f353085f = P0.s(5, new c.b("contourDetectedFaces"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f353086g = P0.s(6, new c.b("nonContourDetectedFaces"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdn zzdnVar = (zzdn) obj;
        e eVar = (e) obj2;
        eVar.add(f353081b, zzdnVar.zzb());
        eVar.add(f353082c, zzdnVar.zzc());
        eVar.add(f353083d, (Object) null);
        eVar.add(f353084e, zzdnVar.zza());
        eVar.add(f353085f, zzdnVar.zzd());
        eVar.add(f353086g, zzdnVar.zze());
    }
}
