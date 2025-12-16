package com.google.common.reflect;

import com.google.common.collect.C37325e2;
import com.google.common.collect.C37414t3;
import com.google.common.collect.U0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: MutableTypeToInstanceMap.java */
/* loaded from: classes6.dex */
class h extends U0<Map.Entry<Object, Object>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f360451b;

    public h(Set set) {
        this.f360451b = set;
    }

    @Override // com.google.common.collect.U0, com.google.common.collect.B0, com.google.common.collect.S0
    public final Object X() {
        return this.f360451b;
    }

    @Override // com.google.common.collect.U0, com.google.common.collect.B0
    /* renamed from: Y */
    public final Collection X() {
        return this.f360451b;
    }

    @Override // com.google.common.collect.U0
    /* renamed from: b0 */
    public final Set<Map.Entry<Object, Object>> X() {
        return this.f360451b;
    }

    @Override // com.google.common.collect.B0, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<Object, Object>> iterator() {
        return C37325e2.m(super.iterator(), new g());
    }

    @Override // com.google.common.collect.B0, java.util.Collection
    public final Object[] toArray() {
        return Z();
    }

    @Override // com.google.common.collect.B0, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C37414t3.c(this, tArr);
    }
}
