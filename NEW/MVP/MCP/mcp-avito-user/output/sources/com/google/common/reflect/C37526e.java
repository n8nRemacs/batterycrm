package com.google.common.reflect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.M0;
import java.util.Map;

/* compiled from: ImmutableTypeToInstanceMap.java */
@InterfaceC37524c
/* renamed from: com.google.common.reflect.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37526e<B> extends M0<w<? extends B>, B> implements s<B> {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC37412t1<w<? extends B>, B> f360450b;

    /* compiled from: ImmutableTypeToInstanceMap.java */
    /* renamed from: com.google.common.reflect.e$b */
    public static final class b<B> {
        public b() {
            AbstractC37412t1.a();
        }
    }

    public C37526e() {
        throw null;
    }

    public C37526e(AbstractC37412t1 abstractC37412t1, a aVar) {
        this.f360450b = abstractC37412t1;
    }

    @Override // com.google.common.collect.M0, com.google.common.collect.S0
    public final Object X() {
        return this.f360450b;
    }

    @Override // com.google.common.collect.M0
    /* renamed from: Y */
    public final Map<w<? extends B>, B> X() {
        return this.f360450b;
    }

    @Override // com.google.common.collect.M0, java.util.Map
    @I41.a
    @aZ0.e
    @Deprecated
    @InterfaceC19845a
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.M0, java.util.Map
    @aZ0.e
    @Deprecated
    public final void putAll(Map<? extends w<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException();
    }
}
