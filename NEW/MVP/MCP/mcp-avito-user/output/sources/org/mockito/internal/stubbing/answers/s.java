package org.mockito.internal.stubbing.answers;

import e81.InterfaceC39968b;
import java.io.Serializable;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: DoesNothing.java */
/* loaded from: classes7.dex */
public class s implements l81.g<Object>, l81.m, Serializable {
    private static final long serialVersionUID = 4840880517740698416L;

    static {
        new s();
    }

    @Override // l81.m
    public final void c(InterfaceC39968b interfaceC39968b) {
        if (!new u(interfaceC39968b).f()) {
            throw new MockitoException(Y71.l.b("Only void methods can doNothing()!", "Example of correct use of doNothing():", "    doNothing().", "    doThrow(new RuntimeException())", "    .when(mock).someVoidMethod();", "Above means:", "someVoidMethod() does nothing the 1st time but throws an exception the 2nd time is called"));
        }
    }

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) {
        return null;
    }
}
