package com.google.android.gms.internal.mlkit_vision_face;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.f;
import j.N;
import java.util.HashMap;
import sZ0.InterfaceC48138b;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzcy implements InterfaceC48138b {

    /* renamed from: d, reason: collision with root package name */
    public static final zzcx f353040d = zzcx.zza;
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f353041a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f353042b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final zzcx f353043c = f353040d;

    @Override // sZ0.InterfaceC48138b
    @N
    public final /* bridge */ /* synthetic */ InterfaceC48138b registerEncoder(@N Class cls, @N d dVar) {
        this.f353041a.put(cls, dVar);
        this.f353042b.remove(cls);
        return this;
    }

    public final zzcz zza() {
        return new zzcz(new HashMap(this.f353041a), new HashMap(this.f353042b), this.f353043c);
    }

    @N
    public final /* bridge */ /* synthetic */ InterfaceC48138b registerEncoder(@N Class cls, @N f fVar) {
        this.f353042b.put(cls, fVar);
        this.f353041a.remove(cls);
        return this;
    }
}
