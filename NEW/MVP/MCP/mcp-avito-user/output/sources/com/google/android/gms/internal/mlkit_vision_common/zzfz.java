package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class zzfz implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzfz f352803a = new zzfz();

    /* renamed from: b, reason: collision with root package name */
    public static final c f352804b = P0.p(1, new c.b("appId"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f352805c = P0.p(2, new c.b("appVersion"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f352806d = P0.p(3, new c.b("firebaseProjectId"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f352807e = P0.p(4, new c.b("mlSdkVersion"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f352808f = P0.p(5, new c.b("tfliteSchemaVersion"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f352809g = P0.p(6, new c.b("gcmSenderId"));

    /* renamed from: h, reason: collision with root package name */
    public static final c f352810h = P0.p(7, new c.b("apiKey"));

    /* renamed from: i, reason: collision with root package name */
    public static final c f352811i = P0.p(8, new c.b("languages"));

    /* renamed from: j, reason: collision with root package name */
    public static final c f352812j = P0.p(9, new c.b("mlSdkInstanceId"));

    /* renamed from: k, reason: collision with root package name */
    public static final c f352813k = P0.p(10, new c.b("isClearcutClient"));

    /* renamed from: l, reason: collision with root package name */
    public static final c f352814l = P0.p(11, new c.b("isStandaloneMlkit"));

    /* renamed from: m, reason: collision with root package name */
    public static final c f352815m = P0.p(12, new c.b("isJsonLogging"));

    /* renamed from: n, reason: collision with root package name */
    public static final c f352816n = P0.p(13, new c.b("buildLevel"));

    /* renamed from: o, reason: collision with root package name */
    public static final c f352817o = P0.p(14, new c.b("optionalModuleVersion"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjq zzjqVar = (zzjq) obj;
        e eVar = (e) obj2;
        eVar.add(f352804b, zzjqVar.zzg());
        eVar.add(f352805c, zzjqVar.zzh());
        eVar.add(f352806d, (Object) null);
        eVar.add(f352807e, zzjqVar.zzj());
        eVar.add(f352808f, zzjqVar.zzk());
        eVar.add(f352809g, (Object) null);
        eVar.add(f352810h, (Object) null);
        eVar.add(f352811i, zzjqVar.zza());
        eVar.add(f352812j, zzjqVar.zzi());
        eVar.add(f352813k, zzjqVar.zzb());
        eVar.add(f352814l, zzjqVar.zzd());
        eVar.add(f352815m, zzjqVar.zzc());
        eVar.add(f352816n, zzjqVar.zze());
        eVar.add(f352817o, zzjqVar.zzf());
    }
}
