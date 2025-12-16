package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzew implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzew f351890a = new zzew();

    /* renamed from: b, reason: collision with root package name */
    public static final c f351891b = P0.m(1, new c.b("errorCode"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f351892c = P0.m(2, new c.b("hasResult"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f351893d = P0.m(3, new c.b("isColdCall"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f351894e = P0.m(4, new c.b("imageInfo"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f351895f = P0.m(5, new c.b("options"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f351896g = P0.m(6, new c.b("detectedBarcodeFormats"));

    /* renamed from: h, reason: collision with root package name */
    public static final c f351897h = P0.m(7, new c.b("detectedBarcodeValueTypes"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdy zzdyVar = (zzdy) obj;
        e eVar = (e) obj2;
        eVar.add(f351891b, zzdyVar.zzc());
        eVar.add(f351892c, (Object) null);
        eVar.add(f351893d, zzdyVar.zze());
        eVar.add(f351894e, (Object) null);
        eVar.add(f351895f, zzdyVar.zzd());
        eVar.add(f351896g, zzdyVar.zza());
        eVar.add(f351897h, zzdyVar.zzb());
    }
}
