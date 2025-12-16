package com.google.android.gms.internal.fido;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzep extends zzev {

    /* renamed from: b, reason: collision with root package name */
    public static final zzep f350345b = new zzep(zzev.zze());

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f350346a;

    public zzep(zzev zzevVar) {
        this.f350346a = new AtomicReference(zzevVar);
    }

    public static final zzep zzb() {
        return f350345b;
    }

    @Override // com.google.android.gms.internal.fido.zzev
    public final zzdr zza() {
        return ((zzev) this.f350346a.get()).zza();
    }

    @Override // com.google.android.gms.internal.fido.zzev
    public final zzfi zzc() {
        return ((zzev) this.f350346a.get()).zzc();
    }

    @Override // com.google.android.gms.internal.fido.zzev
    public final boolean zzd(String str, Level level, boolean z12) {
        ((zzev) this.f350346a.get()).zzd(str, level, z12);
        return false;
    }
}
