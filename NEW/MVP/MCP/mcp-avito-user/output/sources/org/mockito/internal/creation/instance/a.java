package org.mockito.internal.creation.instance;

import Y71.k;
import Y71.l;
import androidx.compose.ui.graphics.colorspace.e;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import org.mockito.creation.instance.InstantiationException;
import org.mockito.internal.configuration.plugins.j;

/* compiled from: ConstructorInstantiator.java */
/* loaded from: classes7.dex */
public class a implements D71.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f421614a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f421615b;

    public a(boolean z12, Object... objArr) {
        this.f421614a = z12;
        this.f421615b = objArr;
    }

    public static boolean d(Class<?>[] clsArr, Object[] objArr) {
        if (objArr.length != clsArr.length) {
            return false;
        }
        for (int i12 = 0; i12 < objArr.length; i12++) {
            if (objArr[i12] == null) {
                if (clsArr[i12].isPrimitive()) {
                    return false;
                }
            } else if ((!clsArr[i12].isPrimitive() && !clsArr[i12].isInstance(objArr[i12])) || (clsArr[i12].isPrimitive() && !clsArr[i12].equals(k.a(objArr[i12].getClass())))) {
                return false;
            }
        }
        return true;
    }

    public final String a() {
        Object[] objArr = this.f421615b;
        int length = objArr.length;
        boolean z12 = this.f421614a;
        String[] strArr = new String[length - (z12 ? 1 : 0)];
        for (int i12 = z12 ? 1 : 0; i12 < objArr.length; i12++) {
            int i13 = i12 - (z12 ? 1 : 0);
            Object obj = objArr[i12];
            strArr[i13] = obj == null ? null : obj.getClass().getName();
        }
        return Arrays.toString(strArr);
    }

    @Override // D71.a
    public final <T> T b(Class<T> cls) throws SecurityException {
        Object[] objArr;
        LinkedList linkedList = new LinkedList();
        try {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            int i12 = 0;
            while (true) {
                objArr = this.f421615b;
                if (i12 >= length) {
                    break;
                }
                Constructor<?> constructor = declaredConstructors[i12];
                if (d(constructor.getParameterTypes(), objArr)) {
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    boolean z12 = false;
                    boolean z13 = false;
                    for (int i13 = 0; i13 < parameterTypes.length; i13++) {
                        Class<?> cls2 = parameterTypes[i13];
                        if (!cls2.isPrimitive()) {
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                Class<?> cls3 = ((Constructor) it.next()).getParameterTypes()[i13];
                                if (cls2 != cls3) {
                                    if (cls2.isAssignableFrom(cls3)) {
                                        z12 = true;
                                    } else {
                                        z13 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (!z12) {
                        linkedList.clear();
                    }
                    if (z13 || !z12) {
                        linkedList.add(constructor);
                    }
                }
                i12++;
            }
            if (linkedList.size() == 1) {
                return (T) j.c().d((Constructor) linkedList.get(0), objArr);
            }
            if (linkedList.isEmpty()) {
                throw new InstantiationException(l.b("Unable to create instance of '" + cls.getSimpleName() + "'.", e.n("Please ensure that the target class has ", c(), this.f421614a ? " and provided outer instance is correct" : "", ".")), null);
            }
            throw new InstantiationException(l.b("Unable to create instance of '" + cls.getSimpleName() + "'.", "Multiple constructors could be matched to arguments of types " + a() + ":", l.a("", " - ", linkedList), "If you believe that Mockito could do a better job deciding on which constructor to use, please let us know.", "Ticket 685 contains the discussion and a workaround for ambiguous constructors using inner class.", "See https://github.com/mockito/mockito/issues/685"), null);
        } catch (Exception e12) {
            throw new InstantiationException(l.b("Unable to create instance of '" + cls.getSimpleName() + "'.", "Please ensure the target class has " + c() + " and executes cleanly."), e12);
        }
    }

    public final String c() {
        Object[] objArr = this.f421615b;
        if (objArr.length == 0 || (this.f421614a && objArr.length == 1)) {
            return "a 0-arg constructor";
        }
        return "a constructor that matches these argument types: " + a();
    }
}
