package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: MemberKey.java */
/* loaded from: classes4.dex */
public final class A {

    /* renamed from: c, reason: collision with root package name */
    public static final Class<?>[] f341935c = new Class[0];

    /* renamed from: a, reason: collision with root package name */
    public final String f341936a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?>[] f341937b;

    public A(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != A.class) {
            return false;
        }
        A a12 = (A) obj;
        if (!this.f341936a.equals(a12.f341936a)) {
            return false;
        }
        Class<?>[] clsArr = this.f341937b;
        int length = clsArr.length;
        Class<?>[] clsArr2 = a12.f341937b;
        if (clsArr2.length != length) {
            return false;
        }
        for (int i12 = 0; i12 < length; i12++) {
            if (clsArr2[i12] != clsArr[i12]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f341936a.hashCode() + this.f341937b.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f341936a);
        sb2.append("(");
        return AK.c.i(this.f341937b.length, "-args)", sb2);
    }

    public A(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public A(String str, Class<?>[] clsArr) {
        this.f341936a = str;
        this.f341937b = clsArr == null ? f341935c : clsArr;
    }
}
