package org.mockito.internal.configuration.plugins;

import i81.InterfaceC41250j;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: PluginLoader.java */
/* loaded from: classes7.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    public final a f421505a;

    /* renamed from: b, reason: collision with root package name */
    public final e f421506b;

    public h(a aVar, e eVar) {
        this.f421505a = aVar;
        this.f421506b = eVar;
    }

    public final <T> T a(Class<T> cls) {
        try {
            T t12 = (T) this.f421506b.a(cls);
            if (t12 != null) {
                return t12;
            }
            this.f421505a.getClass();
            return (T) a.a(cls);
        } catch (Throwable th2) {
            return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new f(cls, th2));
        }
    }

    public h(InterfaceC41250j interfaceC41250j) {
        this(new a(), new e(interfaceC41250j, Collections.emptySet(), new a()));
    }

    public h(InterfaceC41250j interfaceC41250j, String... strArr) {
        this(new a(), new e(interfaceC41250j, new HashSet(Arrays.asList(strArr)), new a()));
    }
}
