package org.slf4j;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.g;
import org.slf4j.helpers.h;
import org.slf4j.helpers.k;
import org.slf4j.helpers.l;
import org.slf4j.helpers.m;
import org.slf4j.impl.StaticLoggerBinder;

/* compiled from: LoggerFactory.java */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f421811a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f421812b = new l();

    /* renamed from: c, reason: collision with root package name */
    public static final h f421813c = new h();

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f421814d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f421815e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f421816f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f421814d = property == null ? false : property.equalsIgnoreCase("true");
        f421815e = new String[]{"1.6", "1.7"};
        f421816f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        LinkedHashSet linkedHashSetB;
        try {
            try {
                try {
                    try {
                        if (f()) {
                            linkedHashSetB = null;
                        } else {
                            linkedHashSetB = b();
                            i(linkedHashSetB);
                        }
                        StaticLoggerBinder.getSingleton();
                        f421811a = 3;
                        h(linkedHashSetB);
                    } catch (NoSuchMethodError e12) {
                        String message = e12.getMessage();
                        if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                            f421811a = 2;
                            m.b("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                            m.b("Your binding is version 1.5.5 or earlier.");
                            m.b("Upgrade your binding to version 1.6.x.");
                        }
                        throw e12;
                    }
                } catch (Exception e13) {
                    f421811a = 2;
                    m.c("Failed to instantiate SLF4J LoggerFactory", e13);
                    throw new IllegalStateException("Unexpected initialization failure", e13);
                }
            } catch (NoClassDefFoundError e14) {
                String message2 = e14.getMessage();
                if (message2 == null || (!message2.contains("org/slf4j/impl/StaticLoggerBinder") && !message2.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                    f421811a = 2;
                    m.c("Failed to instantiate SLF4J LoggerFactory", e14);
                    throw e14;
                }
                f421811a = 4;
                m.b("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                m.b("Defaulting to no-operation (NOP) logger implementation");
                m.b("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            }
            g();
        } catch (Throwable th2) {
            g();
            throw th2;
        }
    }

    public static LinkedHashSet b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = b.class.getClassLoader();
            String str = f421816f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e12) {
            m.c("Error getting resources from path", e12);
        }
        return linkedHashSet;
    }

    public static ILoggerFactory c() {
        if (f421811a == 0) {
            synchronized (b.class) {
                try {
                    if (f421811a == 0) {
                        f421811a = 1;
                        a();
                        if (f421811a == 3) {
                            j();
                        }
                    }
                } finally {
                }
            }
        }
        int i12 = f421811a;
        if (i12 == 1) {
            return f421812b;
        }
        if (i12 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i12 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i12 == 4) {
            return f421813c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static a d(Class<?> cls) {
        Class<?> clsA;
        a aVarE = e(cls.getName());
        if (f421814d && (clsA = m.a()) != null && !clsA.isAssignableFrom(cls)) {
            m.b("Detected logger name mismatch. Given name: \"" + aVarE.getName() + "\"; computed name: \"" + clsA.getName() + "\".");
            m.b("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return aVarE;
    }

    public static a e(String str) {
        return c().a(str);
    }

    public static boolean f() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    public static void g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        l lVar = f421812b;
        synchronized (lVar) {
            try {
                lVar.f421831a = true;
                Iterator it = new ArrayList(lVar.f421832b.values()).iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    kVar.f421825c = e(kVar.f421824b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        LinkedBlockingQueue<u81.d> linkedBlockingQueue = f421812b.f421833c;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i12 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                u81.d dVar = (u81.d) it2.next();
                if (dVar != null) {
                    k kVar2 = dVar.f439814a;
                    String str = kVar2.f421824b;
                    if (kVar2.f421825c == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(kVar2.f421825c instanceof g)) {
                        if (!kVar2.o()) {
                            m.b(str);
                        } else if (kVar2.o()) {
                            try {
                                kVar2.f421827e.invoke(kVar2.f421825c, dVar);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i13 = i12 + 1;
                if (i12 == 0) {
                    if (dVar.f439814a.o()) {
                        m.b("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        m.b("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        m.b("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(dVar.f439814a.f421825c instanceof g)) {
                        m.b("The following set of substitute loggers may have been accessed");
                        m.b("during the initialization phase. Logging calls during this");
                        m.b("phase were not honored. However, subsequent logging calls to these");
                        m.b("loggers will work as normally expected.");
                        m.b("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i12 = i13;
            }
            arrayList.clear();
        }
        l lVar2 = f421812b;
        lVar2.f421832b.clear();
        lVar2.f421833c.clear();
    }

    public static void h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        m.b("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    public static void i(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            m.b("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                m.b("Found binding in [" + ((URL) it.next()) + "]");
            }
            m.b("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z12 = false;
            for (String str2 : f421815e) {
                if (str.startsWith(str2)) {
                    z12 = true;
                }
            }
            if (z12) {
                return;
            }
            m.b("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f421815e).toString());
            m.b("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th2) {
            m.c("Unexpected problem occured during version sanity check", th2);
        }
    }
}
