package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: Maps.java */
/* loaded from: classes6.dex */
class H2 extends Y0<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SortedSet f359351b;

    public H2(SortedSet sortedSet) {
        this.f359351b = sortedSet;
    }

    @Override // com.google.common.collect.Y0, com.google.common.collect.U0, com.google.common.collect.B0, com.google.common.collect.S0
    public final Object X() {
        return this.f359351b;
    }

    @Override // com.google.common.collect.Y0, com.google.common.collect.U0, com.google.common.collect.B0
    /* renamed from: Y */
    public final Collection X() {
        return this.f359351b;
    }

    @Override // com.google.common.collect.B0, java.util.Collection
    public final boolean add(@InterfaceC37434x3 Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.B0, java.util.Collection
    public final boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Y0, com.google.common.collect.U0
    /* renamed from: b0 */
    public final Set X() {
        return this.f359351b;
    }

    @Override // com.google.common.collect.Y0
    /* renamed from: c0 */
    public final SortedSet<Object> X() {
        return this.f359351b;
    }

    @Override // com.google.common.collect.Y0, java.util.SortedSet
    public final SortedSet<Object> headSet(@InterfaceC37434x3 Object obj) {
        return new H2(super.headSet(obj));
    }

    @Override // com.google.common.collect.Y0, java.util.SortedSet
    public final SortedSet<Object> subSet(@InterfaceC37434x3 Object obj, @InterfaceC37434x3 Object obj2) {
        return new H2(super.subSet(obj, obj2));
    }

    @Override // com.google.common.collect.Y0, java.util.SortedSet
    public final SortedSet<Object> tailSet(@InterfaceC37434x3 Object obj) {
        return new H2(super.tailSet(obj));
    }
}
