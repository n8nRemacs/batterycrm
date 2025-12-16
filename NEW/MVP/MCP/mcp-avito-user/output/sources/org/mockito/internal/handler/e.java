package org.mockito.internal.handler;

import Y71.k;
import e81.InterfaceC39969c;
import e81.h;
import h81.InterfaceC40782a;

/* compiled from: NullResultGuardian.java */
/* loaded from: classes7.dex */
class e<T> implements h<T> {

    /* renamed from: b, reason: collision with root package name */
    public final c f421648b;

    public e(c cVar) {
        this.f421648b = cVar;
    }

    @Override // e81.h
    public final Object N0(org.mockito.internal.invocation.e eVar) {
        Object objN0 = this.f421648b.N0(eVar);
        Class<?> returnType = eVar.f421652c.c().getReturnType();
        return (objN0 == null && returnType.isPrimitive()) ? k.f19337b.get(returnType) : objN0;
    }

    @Override // e81.h
    public final InterfaceC39969c T5() {
        return this.f421648b.f421642b;
    }

    @Override // e81.h
    public final InterfaceC40782a<T> j0() {
        return this.f421648b.f421644d;
    }
}
