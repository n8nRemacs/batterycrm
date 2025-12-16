package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes6.dex */
class s implements y<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Constructor f362155a;

    public s(Constructor constructor) {
        this.f362155a = constructor;
    }

    @Override // com.google.gson.internal.y
    public final Object a() {
        Constructor constructor = this.f362155a;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.9.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e12);
        } catch (InstantiationException e13) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e13);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e14.getTargetException());
        }
    }
}
