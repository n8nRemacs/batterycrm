package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzjw<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator<Map.Entry<K, Object>> f350906b;

    public zzjw(Iterator<Map.Entry<K, Object>> it) {
        this.f350906b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f350906b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f350906b.next();
        return next.getValue() instanceof zzjr ? new zzju(next, null) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f350906b.remove();
    }
}
