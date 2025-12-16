package com.google.common.collect;

import com.google.common.collect.AbstractC37304b;
import java.util.Iterator;
import java.util.Map;

/* compiled from: AbstractBiMap.java */
/* renamed from: com.google.common.collect.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37298a implements Iterator<Map.Entry<Object, Object>> {

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    public Map.Entry<Object, Object> f359630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f359631c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC37304b f359632d;

    public C37298a(AbstractC37304b abstractC37304b, Iterator it) {
        this.f359632d = abstractC37304b;
        this.f359631c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f359631c.hasNext();
    }

    @Override // java.util.Iterator
    public final Map.Entry<Object, Object> next() {
        Map.Entry<Object, Object> entry = (Map.Entry) this.f359631c.next();
        this.f359630b = entry;
        return new AbstractC37304b.a(entry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry<Object, Object> entry = this.f359630b;
        if (entry == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        Object value = entry.getValue();
        this.f359631c.remove();
        this.f359632d.f359635c.f359634b.remove(value);
        this.f359630b = null;
    }
}
