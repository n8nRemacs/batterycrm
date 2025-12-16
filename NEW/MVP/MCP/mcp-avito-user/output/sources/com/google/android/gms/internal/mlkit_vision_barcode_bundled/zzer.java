package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzer implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f352454b;

    public zzer(Iterator it) {
        this.f352454b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f352454b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f352454b.next();
        return entry.getValue() instanceof zzes ? new zzeq(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f352454b.remove();
    }
}
