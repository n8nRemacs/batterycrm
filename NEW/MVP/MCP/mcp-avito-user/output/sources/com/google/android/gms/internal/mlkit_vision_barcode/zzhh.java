package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzhh implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzhh f352047a = new zzhh();

    /* renamed from: b, reason: collision with root package name */
    public static final c f352048b = P0.m(1, new c.b("inferenceCommonLogEvent"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f352049c = P0.m(2, new c.b("options"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f352050d = P0.m(3, new c.b("detectedBarcodeFormats"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f352051e = P0.m(4, new c.b("detectedBarcodeValueTypes"));

    /* renamed from: f, reason: collision with root package name */
    public static final c f352052f = P0.m(5, new c.b("imageInfo"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkz zzkzVar = (zzkz) obj;
        e eVar = (e) obj2;
        eVar.add(f352048b, zzkzVar.zzd());
        eVar.add(f352049c, zzkzVar.zze());
        eVar.add(f352050d, zzkzVar.zza());
        eVar.add(f352051e, zzkzVar.zzb());
        eVar.add(f352052f, zzkzVar.zzc());
    }
}
