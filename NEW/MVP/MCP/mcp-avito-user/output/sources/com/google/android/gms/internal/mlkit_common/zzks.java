package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzks implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzks f351593a = new zzks();

    /* renamed from: b, reason: collision with root package name */
    public static final c f351594b = P0.h(1, new c.b("appId"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f351595c = P0.h(2, new c.b("appVersion"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f351596d = P0.h(3, new c.b("firebaseProjectId"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f351597e = P0.h(4, new c.b("mlSdkVersion"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f351598f = P0.h(5, new c.b("tfliteSchemaVersion"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f351599g = P0.h(6, new c.b("gcmSenderId"));

    /* renamed from: h, reason: collision with root package name */
    public static final c f351600h = P0.h(7, new c.b("apiKey"));

    /* renamed from: i, reason: collision with root package name */
    public static final c f351601i = P0.h(8, new c.b("languages"));

    /* renamed from: j, reason: collision with root package name */
    public static final c f351602j = P0.h(9, new c.b("mlSdkInstanceId"));

    /* renamed from: k, reason: collision with root package name */
    public static final c f351603k = P0.h(10, new c.b("isClearcutClient"));

    /* renamed from: l, reason: collision with root package name */
    public static final c f351604l = P0.h(11, new c.b("isStandaloneMlkit"));

    /* renamed from: m, reason: collision with root package name */
    public static final c f351605m = P0.h(12, new c.b("isJsonLogging"));

    /* renamed from: n, reason: collision with root package name */
    public static final c f351606n = P0.h(13, new c.b("buildLevel"));

    /* renamed from: o, reason: collision with root package name */
    public static final c f351607o = P0.h(14, new c.b("optionalModuleVersion"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrg zzrgVar = (zzrg) obj;
        e eVar = (e) obj2;
        eVar.add(f351594b, zzrgVar.zzg());
        eVar.add(f351595c, zzrgVar.zzh());
        eVar.add(f351596d, (Object) null);
        eVar.add(f351597e, zzrgVar.zzj());
        eVar.add(f351598f, zzrgVar.zzk());
        eVar.add(f351599g, (Object) null);
        eVar.add(f351600h, (Object) null);
        eVar.add(f351601i, zzrgVar.zza());
        eVar.add(f351602j, zzrgVar.zzi());
        eVar.add(f351603k, zzrgVar.zzb());
        eVar.add(f351604l, zzrgVar.zzd());
        eVar.add(f351605m, zzrgVar.zzc());
        eVar.add(f351606n, zzrgVar.zze());
        eVar.add(f351607o, zzrgVar.zzf());
    }
}
