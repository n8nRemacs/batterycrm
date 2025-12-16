package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
abstract class zzcz implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f351838b;

    public zzcz(Iterator it) {
        it.getClass();
        this.f351838b = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f351838b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f351838b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f351838b.remove();
    }
}
