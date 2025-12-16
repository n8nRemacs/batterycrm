package org.mockito.internal.stubbing.answers;

import e81.InterfaceC39968b;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import org.mockito.Answers;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: CallsRealMethods.java */
/* loaded from: classes7.dex */
public class p implements l81.g<Object>, l81.m, Serializable {
    private static final long serialVersionUID = 9057165148930624087L;

    @Override // l81.m
    public final void c(InterfaceC39968b interfaceC39968b) {
        if ((new u(interfaceC39968b).f421707b.getModifiers() & 1024) != 0) {
            throw new MockitoException(Y71.l.b("Cannot call abstract real method on java object!", "Calling real methods is only possible when mocking non abstract method.", "  //correct example:", "  when(mockOfConcreteClass.nonAbstractMethod()).thenCallRealMethod();"));
        }
    }

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) {
        return Modifier.isAbstract(interfaceC39968b.getMethod().getModifiers()) ? Answers.RETURNS_DEFAULTS.f(interfaceC39968b) : interfaceC39968b.d5();
    }
}
