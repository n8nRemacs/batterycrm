package org.mockito.internal.stubbing.answers;

import e81.InterfaceC39968b;
import java.lang.reflect.Method;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: AbstractThrowsException.java */
/* loaded from: classes7.dex */
public abstract class a implements l81.g<Object>, l81.m {

    /* renamed from: b, reason: collision with root package name */
    public final org.mockito.internal.exceptions.stacktrace.a f421703b = new org.mockito.internal.exceptions.stacktrace.a();

    @Override // l81.m
    public final void c(InterfaceC39968b interfaceC39968b) {
        boolean zD2;
        Throwable thE = e();
        if (thE == null) {
            throw new MockitoException(Y71.l.b("Cannot stub with null throwable!"));
        }
        if ((thE instanceof RuntimeException) || (thE instanceof Error)) {
            return;
        }
        u uVar = new u(interfaceC39968b);
        Method method = uVar.f421707b;
        Class<?>[] exceptionTypes = method.getExceptionTypes();
        Class<?> cls = thE.getClass();
        int length = exceptionTypes.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                zD2 = uVar.d(method.getDeclaringClass(), thE);
                break;
            } else {
                if (exceptionTypes[i12].isAssignableFrom(cls)) {
                    zD2 = true;
                    break;
                }
                i12++;
            }
        }
        if (zD2) {
            return;
        }
        throw new MockitoException(Y71.l.b("Checked exception is invalid for this method!", "Invalid: " + thE));
    }

    public abstract Throwable e();

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) throws Throwable {
        Throwable thFillInStackTrace;
        Throwable thE = e();
        if (thE == null) {
            throw new IllegalStateException("throwable is null: you shall not call #answer if #validateFor fails!");
        }
        if (Y71.h.f19325a.e(Y71.h.c(thE)) != null || (thFillInStackTrace = thE.fillInStackTrace()) == null) {
            throw thE;
        }
        this.f421703b.a(thFillInStackTrace);
        throw thFillInStackTrace;
    }
}
