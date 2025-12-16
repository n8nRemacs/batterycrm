package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.f;
import j.N;
import java.util.HashMap;
import sZ0.InterfaceC48138b;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzbr implements InterfaceC48138b {

    /* renamed from: d, reason: collision with root package name */
    public static final zzbq f351230d = zzbq.zza;
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f351231a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f351232b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final zzbq f351233c = f351230d;

    @Override // sZ0.InterfaceC48138b
    @N
    public final /* bridge */ /* synthetic */ InterfaceC48138b registerEncoder(@N Class cls, @N d dVar) {
        this.f351231a.put(cls, dVar);
        this.f351232b.remove(cls);
        return this;
    }

    public final zzbs zza() {
        return new zzbs(new HashMap(this.f351231a), new HashMap(this.f351232b), this.f351233c);
    }

    @N
    public final /* bridge */ /* synthetic */ InterfaceC48138b registerEncoder(@N Class cls, @N f fVar) {
        this.f351232b.put(cls, fVar);
        this.f351231a.remove(cls);
        return this;
    }
}
