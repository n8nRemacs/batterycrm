package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzhx extends zzhz {

    /* renamed from: b, reason: collision with root package name */
    public int f350839b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f350840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzhu f350841d;

    public zzhx(zzhu zzhuVar) {
        this.f350841d = zzhuVar;
        this.f350840c = zzhuVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f350839b < this.f350840c;
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final byte zza() {
        int i12 = this.f350839b;
        if (i12 >= this.f350840c) {
            throw new NoSuchElementException();
        }
        this.f350839b = i12 + 1;
        return this.f350841d.e(i12);
    }
}
