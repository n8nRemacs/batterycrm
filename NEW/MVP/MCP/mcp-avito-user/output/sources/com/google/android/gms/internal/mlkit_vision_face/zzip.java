package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzip implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzip f353299a = new zzip();

    /* renamed from: b, reason: collision with root package name */
    public static final c f353300b = P0.s(1, new c.b("appId"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f353301c = P0.s(2, new c.b("appVersion"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f353302d = P0.s(3, new c.b("firebaseProjectId"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f353303e = P0.s(4, new c.b("mlSdkVersion"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f353304f = P0.s(5, new c.b("tfliteSchemaVersion"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f353305g = P0.s(6, new c.b("gcmSenderId"));

    /* renamed from: h, reason: collision with root package name */
    public static final c f353306h = P0.s(7, new c.b("apiKey"));

    /* renamed from: i, reason: collision with root package name */
    public static final c f353307i = P0.s(8, new c.b("languages"));

    /* renamed from: j, reason: collision with root package name */
    public static final c f353308j = P0.s(9, new c.b("mlSdkInstanceId"));

    /* renamed from: k, reason: collision with root package name */
    public static final c f353309k = P0.s(10, new c.b("isClearcutClient"));

    /* renamed from: l, reason: collision with root package name */
    public static final c f353310l = P0.s(11, new c.b("isStandaloneMlkit"));

    /* renamed from: m, reason: collision with root package name */
    public static final c f353311m = P0.s(12, new c.b("isJsonLogging"));

    /* renamed from: n, reason: collision with root package name */
    public static final c f353312n = P0.s(13, new c.b("buildLevel"));

    /* renamed from: o, reason: collision with root package name */
    public static final c f353313o = P0.s(14, new c.b("optionalModuleVersion"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmv zzmvVar = (zzmv) obj;
        e eVar = (e) obj2;
        eVar.add(f353300b, zzmvVar.zzg());
        eVar.add(f353301c, zzmvVar.zzh());
        eVar.add(f353302d, (Object) null);
        eVar.add(f353303e, zzmvVar.zzj());
        eVar.add(f353304f, zzmvVar.zzk());
        eVar.add(f353305g, (Object) null);
        eVar.add(f353306h, (Object) null);
        eVar.add(f353307i, zzmvVar.zza());
        eVar.add(f353308j, zzmvVar.zzi());
        eVar.add(f353309k, zzmvVar.zzb());
        eVar.add(f353310l, zzmvVar.zzd());
        eVar.add(f353311m, zzmvVar.zzc());
        eVar.add(f353312n, zzmvVar.zze());
        eVar.add(f353313o, zzmvVar.zzf());
    }
}
