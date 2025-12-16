package org.mockito.internal.stubbing.defaultanswers;

import e81.InterfaceC39968b;
import java.io.Serializable;

/* compiled from: TriesToReturnSelf.java */
/* loaded from: classes7.dex */
public class k implements l81.g<Object>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final e f421722b = new e();

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) {
        Class<?> returnType = interfaceC39968b.getMethod().getReturnType();
        return (!returnType.isAssignableFrom(Y71.h.a(interfaceC39968b.v3()).j0().d()) || returnType == Object.class) ? this.f421722b.c(returnType) : interfaceC39968b.v3();
    }
}
