package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzfv implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzfv f351304a = new zzfv();

    /* renamed from: b, reason: collision with root package name */
    public static final c f351305b = P0.h(1, new c.b("modelType"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f351306c = P0.h(2, new c.b("isSuccessful"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f351307d = P0.h(3, new c.b("modelName"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlz zzlzVar = (zzlz) obj;
        e eVar = (e) obj2;
        eVar.add(f351305b, zzlzVar.zza());
        eVar.add(f351306c, zzlzVar.zzb());
        eVar.add(f351307d, (Object) null);
    }
}
