package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzgo extends zzgq {

    /* renamed from: b, reason: collision with root package name */
    public int f350403b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f350404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzgx f350405d;

    public zzgo(zzgx zzgxVar) {
        this.f350405d = zzgxVar;
        this.f350404c = zzgxVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f350403b < this.f350404c;
    }

    @Override // com.google.android.gms.internal.fido.zzgs
    public final byte zza() {
        int i12 = this.f350403b;
        if (i12 >= this.f350404c) {
            throw new NoSuchElementException();
        }
        this.f350403b = i12 + 1;
        return this.f350405d.a(i12);
    }
}
