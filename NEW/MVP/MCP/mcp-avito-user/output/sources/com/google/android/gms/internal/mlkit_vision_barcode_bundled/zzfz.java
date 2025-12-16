package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzfz implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f352503b;

    /* renamed from: c, reason: collision with root package name */
    public zzcy f352504c;

    public zzfz(zzdb zzdbVar, zzfx zzfxVar) {
        if (!(zzdbVar instanceof zzga)) {
            this.f352503b = null;
            this.f352504c = (zzcy) zzdbVar;
            return;
        }
        zzga zzgaVar = (zzga) zzdbVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzgaVar.f352511g);
        this.f352503b = arrayDeque;
        arrayDeque.push(zzgaVar);
        zzdb zzdbVar2 = zzgaVar.f352508d;
        while (zzdbVar2 instanceof zzga) {
            zzga zzgaVar2 = (zzga) zzdbVar2;
            this.f352503b.push(zzgaVar2);
            zzdbVar2 = zzgaVar2.f352508d;
        }
        this.f352504c = (zzcy) zzdbVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f352504c != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcy next() {
        zzcy zzcyVar;
        zzcy zzcyVar2 = this.f352504c;
        if (zzcyVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f352503b;
            zzcyVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzdb zzdbVar = ((zzga) arrayDeque.pop()).f352509e;
            while (zzdbVar instanceof zzga) {
                zzga zzgaVar = (zzga) zzdbVar;
                arrayDeque.push(zzgaVar);
                zzdbVar = zzgaVar.f352508d;
            }
            zzcyVar = (zzcy) zzdbVar;
        } while (zzcyVar.zzd() == 0);
        this.f352504c = zzcyVar;
        return zzcyVar2;
    }
}
