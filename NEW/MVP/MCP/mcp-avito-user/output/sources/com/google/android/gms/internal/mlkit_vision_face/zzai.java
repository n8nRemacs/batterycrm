package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzai implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    @a
    public Map.Entry f352948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f352949c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzaj f352950d;

    public zzai(zzaj zzajVar, Iterator it) {
        this.f352950d = zzajVar;
        this.f352949c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f352949c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f352949c.next();
        this.f352948b = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzab.zzd(this.f352948b != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f352948b.getValue();
        this.f352949c.remove();
        zzaj zzajVar = this.f352950d;
        zzajVar.f352951c.f352963e -= collection.size();
        collection.clear();
        this.f352948b = null;
    }
}
