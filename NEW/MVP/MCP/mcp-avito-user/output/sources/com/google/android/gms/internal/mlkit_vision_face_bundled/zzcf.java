package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.f;
import j.N;
import java.util.HashMap;
import sZ0.InterfaceC48138b;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzcf implements InterfaceC48138b {

    /* renamed from: d, reason: collision with root package name */
    public static final zzce f353534d = zzce.zza;
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f353535a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f353536b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final zzce f353537c = f353534d;

    @Override // sZ0.InterfaceC48138b
    @N
    public final /* bridge */ /* synthetic */ InterfaceC48138b registerEncoder(@N Class cls, @N d dVar) {
        this.f353535a.put(cls, dVar);
        this.f353536b.remove(cls);
        return this;
    }

    public final zzcg zza() {
        return new zzcg(new HashMap(this.f353535a), new HashMap(this.f353536b), this.f353537c);
    }

    @N
    public final /* bridge */ /* synthetic */ InterfaceC48138b registerEncoder(@N Class cls, @N f fVar) {
        this.f353536b.put(cls, fVar);
        this.f353535a.remove(cls);
        return this;
    }
}
