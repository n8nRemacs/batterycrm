package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzgt implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f352540b;

    public zzgt(zzgu zzguVar) {
        this.f352540b = zzguVar.f352541b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f352540b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f352540b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
