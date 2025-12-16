package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzhb implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzhb f351473a = new zzhb();

    /* renamed from: b, reason: collision with root package name */
    public static final c f351474b = P0.h(1, new c.b("options"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f351475c = P0.h(2, new c.b("roughDownloadDurationMs"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f351476d = P0.h(3, new c.b("errorCode"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f351477e = P0.h(4, new c.b("exactDownloadDurationMs"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f351478f = P0.h(5, new c.b(UpdateKey.MARKET_DLD_STATUS));

    /* renamed from: g, reason: collision with root package name */
    public static final c f351479g = P0.h(6, new c.b("downloadFailureStatus"));

    /* renamed from: h, reason: collision with root package name */
    public static final c f351480h = P0.h(7, new c.b("mddDownloadErrorCodes"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznn zznnVar = (zznn) obj;
        e eVar = (e) obj2;
        eVar.add(f351474b, zznnVar.zzc());
        eVar.add(f351475c, zznnVar.zzf());
        eVar.add(f351476d, zznnVar.zza());
        eVar.add(f351477e, zznnVar.zze());
        eVar.add(f351478f, zznnVar.zzb());
        eVar.add(f351479g, zznnVar.zzd());
        eVar.add(f351480h, (Object) null);
    }
}
