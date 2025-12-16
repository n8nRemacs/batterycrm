package com.google.common.base;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: FinalizableReferenceQueue.java */
@XY0.c
@InterfaceC37268l
@XY0.d
/* loaded from: classes6.dex */
public class r implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f359058e = Logger.getLogger(r.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final Method f359059f;

    /* renamed from: b, reason: collision with root package name */
    public final ReferenceQueue<Object> f359060b;

    /* renamed from: c, reason: collision with root package name */
    public final PhantomReference<Object> f359061c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f359062d;

    /* compiled from: FinalizableReferenceQueue.java */
    public static class a implements c {
        @Override // com.google.common.base.r.c
        @I41.a
        public final Class<?> a() {
            try {
                return new URLClassLoader(new URL[]{b()}, null).loadClass("com.google.common.base.internal.Finalizer");
            } catch (Exception e12) {
                r.f359058e.log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", (Throwable) e12);
                return null;
            }
        }

        public final URL b() throws IOException {
            String str = "com.google.common.base.internal.Finalizer".replace('.', '/') + ".class";
            URL resource = getClass().getClassLoader().getResource(str);
            if (resource == null) {
                throw new FileNotFoundException(str);
            }
            String string = resource.toString();
            if (string.endsWith(str)) {
                return new URL(resource, string.substring(0, string.length() - str.length()));
            }
            throw new IOException("Unsupported path style: ".concat(string));
        }
    }

    /* compiled from: FinalizableReferenceQueue.java */
    public static class b implements c {
        @Override // com.google.common.base.r.c
        public final Class<?> a() {
            try {
                Logger logger = YY0.a.f19512b;
                return YY0.a.class;
            } catch (ClassNotFoundException e12) {
                throw new AssertionError(e12);
            }
        }
    }

    /* compiled from: FinalizableReferenceQueue.java */
    public interface c {
        @I41.a
        Class<?> a();
    }

    /* compiled from: FinalizableReferenceQueue.java */
    public static class d implements c {
        @Override // com.google.common.base.r.c
        @I41.a
        public final Class<?> a() {
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader == null) {
                    return null;
                }
                try {
                    return systemClassLoader.loadClass("com.google.common.base.internal.Finalizer");
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            } catch (SecurityException unused2) {
                r.f359058e.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    static {
        c[] cVarArr = {new d(), new a(), new b()};
        for (int i12 = 0; i12 < 3; i12++) {
            Class<?> clsA = cVarArr[i12].a();
            if (clsA != null) {
                try {
                    f359059f = clsA.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
                    return;
                } catch (NoSuchMethodException e12) {
                    throw new AssertionError(e12);
                }
            }
        }
        throw new AssertionError();
    }

    public r() {
        boolean z12;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f359060b = referenceQueue;
        PhantomReference<Object> phantomReference = new PhantomReference<>(this, referenceQueue);
        this.f359061c = phantomReference;
        try {
            f359059f.invoke(null, InterfaceC37273q.class, referenceQueue, phantomReference);
            z12 = true;
        } catch (IllegalAccessException e12) {
            throw new AssertionError(e12);
        } catch (Throwable th2) {
            f359058e.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th2);
            z12 = false;
        }
        this.f359062d = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f359061c.enqueue();
        if (this.f359062d) {
            return;
        }
        while (true) {
            Reference<? extends Object> referencePoll = this.f359060b.poll();
            if (referencePoll == 0) {
                return;
            }
            referencePoll.clear();
            try {
                ((InterfaceC37273q) referencePoll).a();
            } catch (Throwable th2) {
                f359058e.log(Level.SEVERE, "Error cleaning up after reference.", th2);
            }
        }
    }
}
