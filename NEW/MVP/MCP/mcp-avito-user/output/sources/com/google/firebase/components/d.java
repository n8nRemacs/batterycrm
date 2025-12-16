package com.google.firebase.components;

import androidx.camera.camera2.internal.G;
import java.lang.reflect.InvocationTargetException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class d implements wZ0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f360739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f360740b;

    public /* synthetic */ d(Object obj, int i12) {
        this.f360739a = i12;
        this.f360740b = obj;
    }

    @Override // wZ0.b
    public final Object get() throws ClassNotFoundException {
        switch (this.f360739a) {
            case 0:
                String str = (String) this.f360740b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e12) {
                    throw new InvalidRegistrarException(AK.c.k("Could not instantiate ", str, "."), e12);
                } catch (InstantiationException e13) {
                    throw new InvalidRegistrarException(AK.c.k("Could not instantiate ", str, "."), e13);
                } catch (NoSuchMethodException e14) {
                    throw new InvalidRegistrarException(G.f("Could not instantiate ", str), e14);
                } catch (InvocationTargetException e15) {
                    throw new InvalidRegistrarException(G.f("Could not instantiate ", str), e15);
                }
            default:
                return (ComponentRegistrar) this.f360740b;
        }
    }
}
