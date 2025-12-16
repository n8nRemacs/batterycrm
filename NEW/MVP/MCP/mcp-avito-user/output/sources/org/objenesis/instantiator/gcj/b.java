package org.objenesis.instantiator.gcj;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;

/* compiled from: GCJInstantiatorBase.java */
/* loaded from: classes7.dex */
public abstract class b<T> implements InterfaceC44601a<T> {

    /* renamed from: b, reason: collision with root package name */
    public static Method f421803b;

    /* renamed from: c, reason: collision with root package name */
    public static ObjectInputStream f421804c;

    /* renamed from: a, reason: collision with root package name */
    public final Class<T> f421805a;

    /* compiled from: GCJInstantiatorBase.java */
    public static class a extends ObjectInputStream {
    }

    public b(Class<T> cls) throws NoSuchMethodException, SecurityException {
        this.f421805a = cls;
        if (f421803b == null) {
            try {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newObject", Class.class, Class.class);
                f421803b = declaredMethod;
                declaredMethod.setAccessible(true);
                f421804c = new a();
            } catch (IOException | NoSuchMethodException | RuntimeException e12) {
                throw new ObjenesisException(e12);
            }
        }
    }
}
