package org.mockito.internal.configuration.plugins;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: PluginLoader.java */
/* loaded from: classes7.dex */
class f implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f421502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f421503b;

    public f(Class cls, Throwable th2) {
        this.f421502a = cls;
        this.f421503b = th2;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        throw new IllegalStateException("Could not initialize plugin: " + this.f421502a + " (alternate: null)", this.f421503b);
    }
}
