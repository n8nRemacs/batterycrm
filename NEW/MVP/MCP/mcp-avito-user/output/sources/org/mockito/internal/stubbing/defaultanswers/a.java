package org.mockito.internal.stubbing.defaultanswers;

import e81.InterfaceC39968b;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: ForwardsInvocations.java */
/* loaded from: classes7.dex */
public class a implements l81.g<Object>, Serializable {
    private static final long serialVersionUID = -8343690268123254910L;

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) throws Throwable {
        Method method = interfaceC39968b.getMethod();
        try {
            method.getDeclaringClass();
            throw null;
        } catch (NoSuchMethodException unused) {
            Object objV3 = interfaceC39968b.v3();
            Objects.toString(method);
            Objects.toString(Y71.h.b(objV3));
            throw null;
        } catch (InvocationTargetException e12) {
            throw e12.getCause();
        }
    }
}
