package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzcs extends zzcv {

    /* renamed from: b, reason: collision with root package name */
    public int f352397b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f352398c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzdb f352399d;

    public zzcs(zzdb zzdbVar) {
        this.f352399d = zzdbVar;
        this.f352398c = zzdbVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f352397b < this.f352398c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcx
    public final byte zza() {
        int i12 = this.f352397b;
        if (i12 >= this.f352398c) {
            throw new NoSuchElementException();
        }
        this.f352397b = i12 + 1;
        return this.f352399d.a(i12);
    }
}
