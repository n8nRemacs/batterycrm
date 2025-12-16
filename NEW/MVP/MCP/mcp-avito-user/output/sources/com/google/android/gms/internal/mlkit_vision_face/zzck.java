package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
abstract class zzck implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f353024b;

    public zzck(Iterator it) {
        it.getClass();
        this.f353024b = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f353024b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f353024b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f353024b.remove();
    }
}
