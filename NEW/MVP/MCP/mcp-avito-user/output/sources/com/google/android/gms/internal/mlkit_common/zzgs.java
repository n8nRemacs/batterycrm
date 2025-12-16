package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzgs implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgs f351332a = new zzgs();

    /* renamed from: b, reason: collision with root package name */
    public static final c f351333b = P0.h(1, new c.b("modelType"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f351334c = P0.h(2, new c.b("isDownloaded"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f351335d = P0.h(3, new c.b("modelName"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmu zzmuVar = (zzmu) obj;
        e eVar = (e) obj2;
        eVar.add(f351333b, zzmuVar.zza());
        eVar.add(f351334c, zzmuVar.zzb());
        eVar.add(f351335d, (Object) null);
    }
}
