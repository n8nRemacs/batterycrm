package com.google.common.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.Objects;

/* compiled from: Throwables.java */
/* loaded from: classes6.dex */
class g0 extends AbstractList<StackTraceElement> {
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        Method method = h0.f359047b;
        Objects.requireNonNull(method);
        Object obj = h0.f359046a;
        Objects.requireNonNull(obj);
        try {
            return (StackTraceElement) method.invoke(obj, null, Integer.valueOf(i12));
        } catch (IllegalAccessException e12) {
            throw new RuntimeException(e12);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            h0.a(cause);
            throw new RuntimeException(cause);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        Method method = h0.f359048c;
        Objects.requireNonNull(method);
        Object obj = h0.f359046a;
        Objects.requireNonNull(obj);
        try {
            return ((Integer) method.invoke(obj, null)).intValue();
        } catch (IllegalAccessException e12) {
            throw new RuntimeException(e12);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            h0.a(cause);
            throw new RuntimeException(cause);
        }
    }
}
