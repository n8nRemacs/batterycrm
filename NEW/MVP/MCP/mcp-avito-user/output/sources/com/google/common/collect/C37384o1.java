package com.google.common.collect;

import java.io.Serializable;

/* compiled from: ImmutableEntry.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.o1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37384o1<K, V> extends AbstractC37340h<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC37434x3
    public final K f359901b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC37434x3
    public final V f359902c;

    public C37384o1(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
        this.f359901b = k12;
        this.f359902c = v12;
    }

    @Override // java.util.Map.Entry
    @InterfaceC37434x3
    public final K getKey() {
        return this.f359901b;
    }

    @Override // java.util.Map.Entry
    @InterfaceC37434x3
    public final V getValue() {
        return this.f359902c;
    }

    @Override // com.google.common.collect.AbstractC37340h, java.util.Map.Entry
    @InterfaceC37434x3
    public final V setValue(@InterfaceC37434x3 V v12) {
        throw new UnsupportedOperationException();
    }
}
