package org.mockito.internal.stubbing.defaultanswers;

import e81.InterfaceC39968b;
import java.io.Serializable;
import java.lang.reflect.Array;

/* compiled from: ReturnsMoreEmptyValues.java */
/* loaded from: classes7.dex */
public class h implements l81.g<Object>, Serializable {
    private static final long serialVersionUID = -2816745041482698471L;

    /* renamed from: b, reason: collision with root package name */
    public final e f421717b = new e();

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) {
        Object objF = this.f421717b.f(interfaceC39968b);
        if (objF != null) {
            return objF;
        }
        Class<?> returnType = interfaceC39968b.getMethod().getReturnType();
        if (returnType == String.class) {
            return "";
        }
        if (returnType.isArray()) {
            return Array.newInstance(returnType.getComponentType(), 0);
        }
        return null;
    }
}
