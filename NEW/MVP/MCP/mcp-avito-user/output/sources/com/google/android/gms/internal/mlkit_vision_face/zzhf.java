package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzhf implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzhf f353256a = new zzhf();

    /* renamed from: b, reason: collision with root package name */
    public static final c f353257b = P0.s(1, new c.b("inferenceCommonLogEvent"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f353258c = P0.s(2, new c.b("options"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f353259d = P0.s(3, new c.b("imageInfo"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f353260e = P0.s(4, new c.b("detectorOptions"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f353261f = P0.s(5, new c.b("contourDetectedFaces"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f353262g = P0.s(6, new c.b("nonContourDetectedFaces"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzll zzllVar = (zzll) obj;
        e eVar = (e) obj2;
        eVar.add(f353257b, zzllVar.zzc());
        eVar.add(f353258c, (Object) null);
        eVar.add(f353259d, zzllVar.zzb());
        eVar.add(f353260e, zzllVar.zza());
        eVar.add(f353261f, zzllVar.zzd());
        eVar.add(f353262g, zzllVar.zze());
    }
}
