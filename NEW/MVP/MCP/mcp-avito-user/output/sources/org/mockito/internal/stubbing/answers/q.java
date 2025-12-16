package org.mockito.internal.stubbing.answers;

import e81.InterfaceC39968b;
import i81.InterfaceC41245e;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* compiled from: ClonesArguments.java */
/* loaded from: classes7.dex */
public class q implements l81.g<Object> {
    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object[] objArrD = interfaceC39968b.D();
        for (int i12 = 0; i12 < objArrD.length; i12++) {
            Object obj = objArrD[i12];
            if (obj != null) {
                if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length);
                    for (int i13 = 0; i13 < length; i13++) {
                        Array.set(objNewInstance, i13, Array.get(obj, i13));
                    }
                    objArrD[i12] = objNewInstance;
                } else {
                    Object objB = org.mockito.internal.configuration.plugins.j.b().a(null).b(obj.getClass());
                    org.mockito.internal.util.reflection.k kVar = new org.mockito.internal.util.reflection.k();
                    for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
                        InterfaceC41245e interfaceC41245e = kVar.f421775a;
                        for (Field field : superclass.getDeclaredFields()) {
                            if (!Modifier.isStatic(field.getModifiers())) {
                                try {
                                    interfaceC41245e.b(field, objB, interfaceC41245e.e(field, obj));
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                    objArrD[i12] = objB;
                }
            }
        }
        return new org.mockito.internal.stubbing.defaultanswers.e().f(interfaceC39968b);
    }
}
