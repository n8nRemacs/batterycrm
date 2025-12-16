package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;

/* compiled from: ImmutableClassToInstanceMap.java */
@InterfaceC37329f0
@XY0.c
@aZ0.j
/* renamed from: com.google.common.collect.m1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37372m1<B> extends M0<Class<? extends B>, B> implements E<B>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C37372m1<Object> f359830c = new C37372m1<>(J3.f359405h);

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC37412t1<Class<? extends B>, B> f359831b;

    /* compiled from: ImmutableClassToInstanceMap.java */
    /* renamed from: com.google.common.collect.m1$b */
    public static final class b<B> {
        public b() {
            AbstractC37412t1.a();
        }
    }

    @Override // com.google.common.collect.M0, com.google.common.collect.S0
    public final Object X() {
        return this.f359831b;
    }

    @Override // com.google.common.collect.M0
    /* renamed from: Y */
    public final Map<Class<? extends B>, B> X() {
        return this.f359831b;
    }

    public Object readResolve() {
        return isEmpty() ? f359830c : this;
    }

    public C37372m1(AbstractC37412t1<Class<? extends B>, B> abstractC37412t1) {
        this.f359831b = abstractC37412t1;
    }
}
