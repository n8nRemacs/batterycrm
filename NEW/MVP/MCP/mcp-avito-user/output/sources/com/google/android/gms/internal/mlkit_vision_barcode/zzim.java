package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzim implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzim f352084a = new zzim();

    /* renamed from: b, reason: collision with root package name */
    public static final c f352085b = P0.m(1, new c.b("appId"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f352086c = P0.m(2, new c.b("appVersion"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f352087d = P0.m(3, new c.b("firebaseProjectId"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f352088e = P0.m(4, new c.b("mlSdkVersion"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f352089f = P0.m(5, new c.b("tfliteSchemaVersion"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f352090g = P0.m(6, new c.b("gcmSenderId"));

    /* renamed from: h, reason: collision with root package name */
    public static final c f352091h = P0.m(7, new c.b("apiKey"));

    /* renamed from: i, reason: collision with root package name */
    public static final c f352092i = P0.m(8, new c.b("languages"));

    /* renamed from: j, reason: collision with root package name */
    public static final c f352093j = P0.m(9, new c.b("mlSdkInstanceId"));

    /* renamed from: k, reason: collision with root package name */
    public static final c f352094k = P0.m(10, new c.b("isClearcutClient"));

    /* renamed from: l, reason: collision with root package name */
    public static final c f352095l = P0.m(11, new c.b("isStandaloneMlkit"));

    /* renamed from: m, reason: collision with root package name */
    public static final c f352096m = P0.m(12, new c.b("isJsonLogging"));

    /* renamed from: n, reason: collision with root package name */
    public static final c f352097n = P0.m(13, new c.b("buildLevel"));

    /* renamed from: o, reason: collision with root package name */
    public static final c f352098o = P0.m(14, new c.b("optionalModuleVersion"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzme zzmeVar = (zzme) obj;
        e eVar = (e) obj2;
        eVar.add(f352085b, zzmeVar.zzg());
        eVar.add(f352086c, zzmeVar.zzh());
        eVar.add(f352087d, (Object) null);
        eVar.add(f352088e, zzmeVar.zzj());
        eVar.add(f352089f, zzmeVar.zzk());
        eVar.add(f352090g, (Object) null);
        eVar.add(f352091h, (Object) null);
        eVar.add(f352092i, zzmeVar.zza());
        eVar.add(f352093j, zzmeVar.zzi());
        eVar.add(f352094k, zzmeVar.zzb());
        eVar.add(f352095l, zzmeVar.zzd());
        eVar.add(f352096m, zzmeVar.zzc());
        eVar.add(f352097n, zzmeVar.zze());
        eVar.add(f352098o, zzmeVar.zzf());
    }
}
