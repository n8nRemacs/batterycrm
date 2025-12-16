package com.google.common.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/* compiled from: AbstractInvocationHandler.java */
@InterfaceC37524c
/* renamed from: com.google.common.reflect.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37522a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f360449a = new Object[0];

    @I41.a
    public abstract Object a();

    @Override // java.lang.reflect.InvocationHandler
    @I41.a
    public final Object invoke(Object obj, Method method, @I41.a Object[] objArr) {
        if (objArr == null) {
            objArr = f360449a;
        }
        if (objArr.length == 0 && method.getName().equals("hashCode")) {
            return Integer.valueOf(super.hashCode());
        }
        if (objArr.length != 1 || !method.getName().equals("equals") || method.getParameterTypes()[0] != Object.class) {
            return (objArr.length == 0 && method.getName().equals("toString")) ? super.toString() : a();
        }
        Object obj2 = objArr[0];
        if (obj2 == null) {
            return Boolean.FALSE;
        }
        if (obj == obj2) {
            return Boolean.TRUE;
        }
        Class<?> cls = obj.getClass();
        return Boolean.valueOf((cls.isInstance(obj2) || (Proxy.isProxyClass(obj2.getClass()) && Arrays.equals(obj2.getClass().getInterfaces(), cls.getInterfaces()))) && super.equals(Proxy.getInvocationHandler(obj2)));
    }
}
