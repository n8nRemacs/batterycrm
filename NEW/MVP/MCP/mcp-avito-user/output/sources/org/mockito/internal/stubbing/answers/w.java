package org.mockito.internal.stubbing.answers;

import e81.InterfaceC39968b;
import java.io.Serializable;
import java.lang.reflect.Method;
import org.mockito.exceptions.misusing.WrongTypeOfReturnValue;

/* compiled from: ReturnsArgumentAt.java */
/* loaded from: classes7.dex */
public class w implements l81.g<Object>, l81.m, Serializable {
    private static final long serialVersionUID = -589315085166295101L;

    public static boolean e(InterfaceC39968b interfaceC39968b) {
        Method method = interfaceC39968b.getMethod();
        Class<?>[] parameterTypes = method.getParameterTypes();
        return method.isVarArgs() && parameterTypes.length - 1 == 0 && method.getReturnType().isAssignableFrom(parameterTypes[0]);
    }

    @Override // l81.m
    public final void c(InterfaceC39968b interfaceC39968b) {
        Class<?> componentType;
        if (!interfaceC39968b.getMethod().isVarArgs() && interfaceC39968b.D().length <= 0) {
            throw Q71.a.c(interfaceC39968b);
        }
        u uVar = new u(interfaceC39968b);
        Class<?>[] parameterTypes = interfaceC39968b.getMethod().getParameterTypes();
        if (interfaceC39968b.getMethod().isVarArgs()) {
            int length = parameterTypes.length - 1;
            componentType = (length <= 0 && !e(interfaceC39968b)) ? parameterTypes[length].getComponentType() : parameterTypes[0];
        } else {
            componentType = parameterTypes[0];
            Object objA1 = interfaceC39968b.a1(0);
            if (!componentType.isPrimitive() && objA1 != null) {
                componentType = objA1.getClass();
            }
        }
        if (uVar.e(componentType)) {
            return;
        }
        String simpleName = uVar.f421707b.getReturnType().getSimpleName();
        throw new WrongTypeOfReturnValue(Y71.l.b("The argument of type '" + componentType.getSimpleName() + "' cannot be returned because the following ", AK.c.k("method should return the type '", simpleName, "'"), " -> " + Y71.h.b(interfaceC39968b.v3()) + "." + interfaceC39968b.getMethod().getName() + "()", "", "The reason for this error can be :", "1. The wanted argument position is incorrect.", "2. The answer is used on the wrong interaction.", "", "Position of the wanted argument is 0 and " + ((Object) Q71.a.h(interfaceC39968b)), "***", "However if you're still unsure why you're getting above error read on.", "Due to the nature of the syntax above problem might occur because:", "1. This exception *might* occur in wrongly written multi-threaded tests.", "   Please refer to Mockito FAQ on limitations of concurrency testing.", "2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies - ", "   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.", ""));
    }

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) {
        if (e(interfaceC39968b)) {
            return interfaceC39968b.j5()[interfaceC39968b.j5().length - 1];
        }
        if (interfaceC39968b.D().length > 0) {
            return interfaceC39968b.a1(0);
        }
        throw Q71.a.c(interfaceC39968b);
    }
}
