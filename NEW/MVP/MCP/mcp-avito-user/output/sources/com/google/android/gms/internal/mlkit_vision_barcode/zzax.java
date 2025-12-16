package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzax implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    @a
    public Map.Entry f351762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f351763c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzay f351764d;

    public zzax(zzay zzayVar, Iterator it) {
        this.f351764d = zzayVar;
        this.f351763c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f351763c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f351763c.next();
        this.f351762b = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzaq.zzd(this.f351762b != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f351762b.getValue();
        this.f351763c.remove();
        zzay zzayVar = this.f351764d;
        zzayVar.f351765c.f351777e -= collection.size();
        collection.clear();
        this.f351762b = null;
    }
}
