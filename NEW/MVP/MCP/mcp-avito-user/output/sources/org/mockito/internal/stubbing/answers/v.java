package org.mockito.internal.stubbing.answers;

import e81.InterfaceC39968b;
import java.io.Serializable;
import java.lang.reflect.Method;
import org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue;
import org.mockito.exceptions.misusing.WrongTypeOfReturnValue;

/* compiled from: Returns.java */
/* loaded from: classes7.dex */
public class v implements l81.g<Object>, l81.m, Serializable {
    private static final long serialVersionUID = -6245608253574215396L;

    @Override // l81.m
    public final void c(InterfaceC39968b interfaceC39968b) {
        u uVar = new u(interfaceC39968b);
        boolean zF2 = uVar.f();
        Method method = uVar.f421707b;
        if (zF2) {
            throw new CannotStubVoidMethodWithReturnValue(Y71.l.b(AK.c.k("'", method.getName(), "' is a *void method* and it *cannot* be stubbed with a *return value*!"), "Voids are usually stubbed with Throwables:", "    doThrow(exception).when(mock).someVoidMethod();", "If you need to set the void method to do nothing you can use:", "    doNothing().when(mock).someVoidMethod();", "For more information, check out the javadocs for Mockito.doNothing().", "***", "If you're unsure why you're getting above error read on.", "Due to the nature of the syntax above problem might occur because:", "1. The method you are trying to stub is *overloaded*. Make sure you are calling the right overloaded version.", "2. Somewhere in your test you are stubbing *final methods*. Sorry, Mockito does not verify/stub final methods.", "3. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies - ", "   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.", "4. Mocking methods declared on non-public parent classes is not supported.", ""));
        }
        if (method.getReturnType().isPrimitive()) {
            String simpleName = method.getReturnType().getSimpleName();
            String name = method.getName();
            throw new WrongTypeOfReturnValue(Y71.l.b(AK.c.k("null cannot be returned by ", name, "()"), androidx.appcompat.app.r.r(name, "() should return ", simpleName), "***", "If you're unsure why you're getting above error read on.", "Due to the nature of the syntax above problem might occur because:", "1. This exception *might* occur in wrongly written multi-threaded tests.", "   Please refer to Mockito FAQ on limitations of concurrency testing.", "2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies - ", "   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.", ""));
        }
    }

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) {
        int i12 = Y71.e.f19322a;
        return null;
    }

    public final String toString() {
        return "Returns: null";
    }
}
