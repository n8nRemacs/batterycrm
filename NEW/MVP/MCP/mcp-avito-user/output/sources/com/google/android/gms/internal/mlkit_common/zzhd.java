package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzhd implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzhd f351491a = new zzhd();

    /* renamed from: b, reason: collision with root package name */
    public static final c f351492b = P0.h(1, new c.b("modelInfo"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f351493c = P0.h(2, new c.b("initialDownloadConditions"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f351494d = P0.h(3, new c.b("updateDownloadConditions"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f351495e = P0.h(4, new c.b("isModelUpdateEnabled"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        e eVar = (e) obj2;
        eVar.add(f351492b, ((zznw) obj).zza());
        eVar.add(f351493c, (Object) null);
        eVar.add(f351494d, (Object) null);
        eVar.add(f351495e, (Object) null);
    }
}
