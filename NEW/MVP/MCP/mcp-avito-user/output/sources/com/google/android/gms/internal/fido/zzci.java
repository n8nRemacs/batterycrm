package com.google.android.gms.internal.fido;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzci extends zzce {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzcj f350289d;

    public zzci(zzcj zzcjVar) {
        this.f350289d = zzcjVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc l() {
        return new zzch(this);
    }

    @Override // com.google.android.gms.internal.fido.zzce
    public final zzcj r() {
        return this.f350289d;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* renamed from: zzd */
    public final zzdc iterator() {
        return zzi().listIterator(0);
    }
}
