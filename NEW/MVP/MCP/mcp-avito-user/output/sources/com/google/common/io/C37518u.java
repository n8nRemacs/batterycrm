package com.google.common.io;

import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.logging.Level;

/* compiled from: Closer.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* renamed from: com.google.common.io.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37518u implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public static final c f360339b;

    /* compiled from: Closer.java */
    @XY0.e
    /* renamed from: com.google.common.io.u$a */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f360340a = new a();

        @Override // com.google.common.io.C37518u.c
        public final void a(Closeable closeable, Throwable th2, Throwable th3) {
            C37517t.f360338a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th3);
        }
    }

    /* compiled from: Closer.java */
    @XY0.e
    /* renamed from: com.google.common.io.u$b */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Method f360341a;

        public b(Method method) {
            this.f360341a = method;
        }

        @Override // com.google.common.io.C37518u.c
        public final void a(Closeable closeable, Throwable th2, Throwable th3) {
            if (th2 == th3) {
                return;
            }
            try {
                this.f360341a.invoke(th2, th3);
            } catch (Throwable unused) {
                a.f360340a.a(closeable, th2, th3);
            }
        }
    }

    /* compiled from: Closer.java */
    @XY0.e
    /* renamed from: com.google.common.io.u$c */
    public interface c {
        void a(Closeable closeable, Throwable th2, Throwable th3);
    }

    static {
        c bVar;
        try {
            bVar = new b(Throwable.class.getMethod("addSuppressed", Throwable.class));
        } catch (Throwable unused) {
            bVar = null;
        }
        if (bVar == null) {
            bVar = a.f360340a;
        }
        f360339b = bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }
}
