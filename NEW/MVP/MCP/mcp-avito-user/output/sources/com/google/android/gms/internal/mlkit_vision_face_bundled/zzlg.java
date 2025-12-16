package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzlg implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzlg f353879a = new zzlg();

    /* renamed from: b, reason: collision with root package name */
    public static final c f353880b = P0.v(1, new c.b("appId"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f353881c = P0.v(2, new c.b("appVersion"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f353882d = P0.v(3, new c.b("firebaseProjectId"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f353883e = P0.v(4, new c.b("mlSdkVersion"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f353884f = P0.v(5, new c.b("tfliteSchemaVersion"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f353885g = P0.v(6, new c.b("gcmSenderId"));

    /* renamed from: h, reason: collision with root package name */
    public static final c f353886h = P0.v(7, new c.b("apiKey"));

    /* renamed from: i, reason: collision with root package name */
    public static final c f353887i = P0.v(8, new c.b("languages"));

    /* renamed from: j, reason: collision with root package name */
    public static final c f353888j = P0.v(9, new c.b("mlSdkInstanceId"));

    /* renamed from: k, reason: collision with root package name */
    public static final c f353889k = P0.v(10, new c.b("isClearcutClient"));

    /* renamed from: l, reason: collision with root package name */
    public static final c f353890l = P0.v(11, new c.b("isStandaloneMlkit"));

    /* renamed from: m, reason: collision with root package name */
    public static final c f353891m = P0.v(12, new c.b("isJsonLogging"));

    /* renamed from: n, reason: collision with root package name */
    public static final c f353892n = P0.v(13, new c.b("buildLevel"));

    /* renamed from: o, reason: collision with root package name */
    public static final c f353893o = P0.v(14, new c.b("optionalModuleVersion"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrn zzrnVar = (zzrn) obj;
        e eVar = (e) obj2;
        eVar.add(f353880b, zzrnVar.zzg());
        eVar.add(f353881c, zzrnVar.zzh());
        eVar.add(f353882d, (Object) null);
        eVar.add(f353883e, zzrnVar.zzj());
        eVar.add(f353884f, zzrnVar.zzk());
        eVar.add(f353885g, (Object) null);
        eVar.add(f353886h, (Object) null);
        eVar.add(f353887i, zzrnVar.zza());
        eVar.add(f353888j, zzrnVar.zzi());
        eVar.add(f353889k, zzrnVar.zzb());
        eVar.add(f353890l, zzrnVar.zzd());
        eVar.add(f353891m, zzrnVar.zzc());
        eVar.add(f353892n, zzrnVar.zze());
        eVar.add(f353893o, zzrnVar.zzf());
    }
}
