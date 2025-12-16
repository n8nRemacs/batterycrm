package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzav implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f351757b;

    /* renamed from: c, reason: collision with root package name */
    @a
    public Collection f351758c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzaw f351759d;

    public zzav(zzaw zzawVar) {
        this.f351759d = zzawVar;
        this.f351757b = zzawVar.f351760e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f351757b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f351757b.next();
        this.f351758c = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new zzby(key, this.f351759d.f351761f.d(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzaq.zzd(this.f351758c != null, "no calls to next() since the last call to remove()");
        this.f351757b.remove();
        this.f351759d.f351761f.f351777e -= this.f351758c.size();
        this.f351758c.clear();
        this.f351758c = null;
    }
}
