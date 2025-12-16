package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzgo implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgo f351948a = new zzgo();

    /* renamed from: b, reason: collision with root package name */
    public static final c f351949b = P0.m(1, new c.b("imageFormat"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f351950c = P0.m(2, new c.b("originalImageSize"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f351951d = P0.m(3, new c.b("compressedImageSize"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f351952e = P0.m(4, new c.b("isOdmlImage"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjy zzjyVar = (zzjy) obj;
        e eVar = (e) obj2;
        eVar.add(f351949b, zzjyVar.zza());
        eVar.add(f351950c, zzjyVar.zzb());
        eVar.add(f351951d, (Object) null);
        eVar.add(f351952e, (Object) null);
    }
}
