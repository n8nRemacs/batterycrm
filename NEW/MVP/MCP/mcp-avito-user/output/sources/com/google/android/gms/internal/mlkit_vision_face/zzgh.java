package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzgh implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgh f353142a = new zzgh();

    /* renamed from: b, reason: collision with root package name */
    public static final c f353143b = P0.s(1, new c.b("imageFormat"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f353144c = P0.s(2, new c.b("originalImageSize"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f353145d = P0.s(3, new c.b("compressedImageSize"));

    /* renamed from: e, reason: collision with root package name */
    public static final c f353146e = P0.s(4, new c.b("isOdmlImage"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkh zzkhVar = (zzkh) obj;
        e eVar = (e) obj2;
        eVar.add(f353143b, zzkhVar.zza());
        eVar.add(f353144c, zzkhVar.zzb());
        eVar.add(f353145d, (Object) null);
        eVar.add(f353146e, (Object) null);
    }
}
