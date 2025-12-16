package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Iterator;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzya implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f354144b;

    public zzya(zzyb zzybVar) {
        this.f354144b = zzybVar.f354145b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f354144b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f354144b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
