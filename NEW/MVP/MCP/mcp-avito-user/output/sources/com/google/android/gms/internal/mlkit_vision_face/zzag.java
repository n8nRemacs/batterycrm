package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzag implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f352943b;

    /* renamed from: c, reason: collision with root package name */
    @a
    public Collection f352944c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzah f352945d;

    public zzag(zzah zzahVar) {
        this.f352945d = zzahVar;
        this.f352943b = zzahVar.f352946e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f352943b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f352943b.next();
        this.f352944c = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new zzbj(key, this.f352945d.f352947f.d(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzab.zzd(this.f352944c != null, "no calls to next() since the last call to remove()");
        this.f352943b.remove();
        this.f352945d.f352947f.f352963e -= this.f352944c.size();
        this.f352944c.clear();
        this.f352944c = null;
    }
}
