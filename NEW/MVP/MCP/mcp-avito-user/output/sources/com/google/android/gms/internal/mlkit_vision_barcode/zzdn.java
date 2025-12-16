package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.f;
import j.N;
import java.util.HashMap;
import sZ0.InterfaceC48138b;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzdn implements InterfaceC48138b {

    /* renamed from: d, reason: collision with root package name */
    public static final zzdm f351854d = zzdm.zza;
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f351855a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f351856b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final zzdm f351857c = f351854d;

    @Override // sZ0.InterfaceC48138b
    @N
    public final /* bridge */ /* synthetic */ InterfaceC48138b registerEncoder(@N Class cls, @N d dVar) {
        this.f351855a.put(cls, dVar);
        this.f351856b.remove(cls);
        return this;
    }

    public final zzdo zza() {
        return new zzdo(new HashMap(this.f351855a), new HashMap(this.f351856b), this.f351857c);
    }

    @N
    public final /* bridge */ /* synthetic */ InterfaceC48138b registerEncoder(@N Class cls, @N f fVar) {
        this.f351856b.put(cls, fVar);
        this.f351855a.remove(cls);
        return this;
    }
}
