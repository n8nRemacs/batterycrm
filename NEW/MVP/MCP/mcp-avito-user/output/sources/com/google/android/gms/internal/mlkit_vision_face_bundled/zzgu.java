package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzgu implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgu f353622a = new zzgu();

    /* renamed from: b, reason: collision with root package name */
    public static final c f353623b = P0.v(1, new c.b("options"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f353624c = P0.v(2, new c.b("eventType"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f353625d = P0.v(3, new c.b("errorCode"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmx zzmxVar = (zzmx) obj;
        e eVar = (e) obj2;
        eVar.add(f353623b, zzmxVar.zza());
        eVar.add(f353624c, (Object) null);
        eVar.add(f353625d, zzmxVar.zzb());
    }
}
