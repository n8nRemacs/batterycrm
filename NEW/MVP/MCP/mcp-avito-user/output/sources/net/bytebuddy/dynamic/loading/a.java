package net.bytebuddy.dynamic.loading;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.utility.nullability.d;

/* compiled from: MultipleParentClassLoader.java */
/* loaded from: classes8.dex */
public class a extends InjectionClassLoader {

    /* renamed from: b, reason: collision with root package name */
    public final List<? extends ClassLoader> f416808b;

    /* compiled from: MultipleParentClassLoader.java */
    @HashCodeAndEqualsPlugin.Enhance
    /* renamed from: net.bytebuddy.dynamic.loading.a$a, reason: collision with other inner class name */
    public static class C12048a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f416809a;

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends ClassLoader> f416810b;

        public C12048a() {
            this(Collections.emptyList(), true);
        }

        public final C12048a a(Collection<? extends Class<?>> collection) {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<? extends Class<?>> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getClassLoader());
            }
            return b(arrayList);
        }

        public final C12048a b(List<? extends ClassLoader> list) {
            List<? extends ClassLoader> list2 = this.f416810b;
            ArrayList arrayList = new ArrayList(list.size() + list2.size());
            arrayList.addAll(list2);
            for (ClassLoader classLoader : list) {
                if (classLoader != null) {
                    ClassLoader parent = classLoader;
                    do {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((ClassLoader) it.next()).equals(parent)) {
                                it.remove();
                            }
                        }
                        parent = parent.getParent();
                    } while (parent != null);
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            arrayList.add(classLoader);
                            break;
                        }
                        ClassLoader parent2 = (ClassLoader) it2.next();
                        while (!parent2.equals(classLoader)) {
                            parent2 = parent2.getParent();
                            if (parent2 == null) {
                                break;
                            }
                        }
                    }
                }
            }
            return new C12048a(arrayList, this.f416809a);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C12048a c12048a = (C12048a) obj;
            return this.f416809a == c12048a.f416809a && this.f416810b.equals(c12048a.f416810b);
        }

        public final int hashCode() {
            return this.f416810b.hashCode() + (((getClass().hashCode() * 31) + (this.f416809a ? 1 : 0)) * 31);
        }

        public C12048a(List<? extends ClassLoader> list, boolean z12) {
            this.f416810b = list;
            this.f416809a = z12;
        }
    }

    /* compiled from: MultipleParentClassLoader.java */
    public static class b implements Enumeration<URL> {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f416811b;

        /* renamed from: c, reason: collision with root package name */
        @d
        public Enumeration<URL> f416812c;

        public b(ArrayList arrayList) {
            this.f416811b = arrayList;
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            Enumeration<URL> enumeration = this.f416812c;
            if (enumeration != null && enumeration.hasMoreElements()) {
                return true;
            }
            ArrayList arrayList = this.f416811b;
            if (arrayList.isEmpty()) {
                return false;
            }
            this.f416812c = (Enumeration) arrayList.remove(0);
            return hasMoreElements();
        }

        @Override // java.util.Enumeration
        @SuppressFBWarnings(justification = "Null reference is avoided by element check.", value = {"UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR"})
        public final URL nextElement() {
            if (hasMoreElements()) {
                return this.f416812c.nextElement();
            }
            throw new NoSuchElementException();
        }
    }

    static {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("registerAsParallelCapable", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    public a() {
        throw null;
    }

    public a(List<? extends ClassLoader> list) {
        super(null, true);
        this.f416808b = list;
    }

    @Override // net.bytebuddy.dynamic.loading.InjectionClassLoader
    public final Map a(LinkedHashMap linkedHashMap) {
        HashMap map = new HashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            map.put(entry.getKey(), defineClass((String) entry.getKey(), (byte[]) entry.getValue(), 0, ((byte[]) entry.getValue()).length));
        }
        return map;
    }

    @Override // java.lang.ClassLoader
    public final URL getResource(String str) {
        Iterator<? extends ClassLoader> it = this.f416808b.iterator();
        while (it.hasNext()) {
            URL resource = it.next().getResource(str);
            if (resource != null) {
                return resource;
            }
        }
        return super.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public final Enumeration<URL> getResources(String str) {
        List<? extends ClassLoader> list = this.f416808b;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        Iterator<? extends ClassLoader> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getResources(str));
        }
        arrayList.add(super.getResources(str));
        return new b(arrayList);
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z12) throws ClassNotFoundException {
        Iterator<? extends ClassLoader> it = this.f416808b.iterator();
        while (it.hasNext()) {
            try {
                Class<?> clsLoadClass = it.next().loadClass(str);
                if (z12) {
                    resolveClass(clsLoadClass);
                }
                return clsLoadClass;
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z12);
    }
}
