package org.mockito.internal.configuration.plugins;

import i81.InterfaceC41247g;
import i81.InterfaceC41250j;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PluginInitializer.java */
/* loaded from: classes7.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC41250j f421500a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<String> f421501b;

    public e(InterfaceC41250j interfaceC41250j, Set<String> set, a aVar) {
        this.f421500a = interfaceC41250j;
        this.f421501b = set;
    }

    public final <T> T a(Class<T> cls) throws IOException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = ClassLoader.getSystemClassLoader();
        }
        try {
            Enumeration<URL> resources = contextClassLoader.getResources("mockito-extensions/".concat(cls.getName()));
            try {
                d dVar = new d(this.f421500a);
                ArrayList arrayList = new ArrayList();
                while (resources.hasMoreElements()) {
                    arrayList.add(resources.nextElement());
                }
                String strA = dVar.a(arrayList);
                if (strA == null) {
                    return null;
                }
                if (this.f421501b.contains(strA)) {
                    strA = (String) a.f421498a.get(strA);
                }
                return cls.cast(contextClassLoader.loadClass(strA).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (Exception e12) {
                throw new IllegalStateException("Failed to load " + cls + " implementation declared in " + resources, e12);
            }
        } catch (IOException e13) {
            throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.k(cls, "Failed to load "), e13);
        }
    }

    public final ArrayList b() throws IOException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = ClassLoader.getSystemClassLoader();
        }
        try {
            Enumeration<URL> resources = contextClassLoader.getResources("mockito-extensions/".concat(InterfaceC41247g.class.getName()));
            try {
                d dVar = new d(this.f421500a);
                ArrayList arrayList = new ArrayList();
                while (resources.hasMoreElements()) {
                    arrayList.add(resources.nextElement());
                }
                ArrayList arrayListB = dVar.b(arrayList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (this.f421501b.contains(str)) {
                        str = (String) a.f421498a.get(str);
                    }
                    arrayList2.add(InterfaceC41247g.class.cast(contextClassLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
                }
                return arrayList2;
            } catch (Exception e12) {
                throw new IllegalStateException("Failed to load " + InterfaceC41247g.class + " implementation declared in " + resources, e12);
            }
        } catch (IOException e13) {
            throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.k(InterfaceC41247g.class, "Failed to load "), e13);
        }
    }
}
