package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes6.dex */
class l implements y<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final H f362139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f362140b;

    public l(Class cls) throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        H g12;
        this.f362140b = cls;
        try {
            try {
                try {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    g12 = new D(declaredField.get(null), cls2.getMethod("allocateInstance", Class.class));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod.setAccessible(true);
                    g12 = new F(declaredMethod);
                }
            } catch (Exception unused2) {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod3.setAccessible(true);
                g12 = new E(iIntValue, declaredMethod3);
            }
        } catch (Exception unused3) {
            g12 = new G();
        }
        this.f362139a = g12;
    }

    @Override // com.google.gson.internal.y
    public final Object a() {
        Class cls = this.f362140b;
        try {
            return this.f362139a.b(cls);
        } catch (Exception e12) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e12);
        }
    }
}
