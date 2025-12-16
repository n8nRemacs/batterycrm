package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* compiled from: Maps.java */
/* loaded from: classes6.dex */
class G2 extends U0<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f359344b;

    public G2(Set set) {
        this.f359344b = set;
    }

    @Override // com.google.common.collect.U0, com.google.common.collect.B0, com.google.common.collect.S0
    public final Object X() {
        return this.f359344b;
    }

    @Override // com.google.common.collect.U0, com.google.common.collect.B0
    /* renamed from: Y */
    public final Collection X() {
        return this.f359344b;
    }

    @Override // com.google.common.collect.B0, java.util.Collection
    public final boolean add(@InterfaceC37434x3 Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.B0, java.util.Collection
    public final boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.U0
    /* renamed from: b0 */
    public final Set<Object> X() {
        return this.f359344b;
    }
}
