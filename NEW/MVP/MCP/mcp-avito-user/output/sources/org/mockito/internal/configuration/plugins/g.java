package org.mockito.internal.configuration.plugins;

import i81.InterfaceC41247g;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: PluginLoader.java */
/* loaded from: classes7.dex */
class g implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f421504a;

    public g(Throwable th2) {
        this.f421504a = th2;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.k(InterfaceC41247g.class, "Could not initialize plugin: "), this.f421504a);
    }
}
