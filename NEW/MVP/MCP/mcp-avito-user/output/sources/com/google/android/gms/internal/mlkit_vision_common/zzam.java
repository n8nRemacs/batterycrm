package com.google.android.gms.internal.mlkit_vision_common;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.f;
import j.N;
import java.util.HashMap;
import sZ0.InterfaceC48138b;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public final class zzam implements InterfaceC48138b {

    /* renamed from: d, reason: collision with root package name */
    public static final zzal f352594d = zzal.zza;
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f352595a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f352596b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final zzal f352597c = f352594d;

    @Override // sZ0.InterfaceC48138b
    @N
    public final /* bridge */ /* synthetic */ InterfaceC48138b registerEncoder(@N Class cls, @N d dVar) {
        this.f352595a.put(cls, dVar);
        this.f352596b.remove(cls);
        return this;
    }

    public final zzan zza() {
        return new zzan(new HashMap(this.f352595a), new HashMap(this.f352596b), this.f352597c);
    }

    @N
    public final /* bridge */ /* synthetic */ InterfaceC48138b registerEncoder(@N Class cls, @N f fVar) {
        this.f352596b.put(cls, fVar);
        this.f352595a.remove(cls);
        return this;
    }
}
