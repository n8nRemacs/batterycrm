package com.facebook.common.references;

import android.graphics.Bitmap;
import com.facebook.common.internal.o;
import com.facebook.common.references.SharedReference;
import com.facebook.infer.annotation.Nullsafe;
import fX0.InterfaceC40366d;
import fX0.t;
import java.io.Closeable;
import java.io.IOException;
import uW0.C48986a;

/* compiled from: CloseableReference.java */
@Nullsafe
/* loaded from: classes5.dex */
public abstract class a<T> implements Cloneable, Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final h<Closeable> f339838f = new C10526a();

    /* renamed from: g, reason: collision with root package name */
    public static final d f339839g = new b();

    /* renamed from: b, reason: collision with root package name */
    @J41.a
    public boolean f339840b = false;

    /* renamed from: c, reason: collision with root package name */
    public final SharedReference<T> f339841c;

    /* renamed from: d, reason: collision with root package name */
    public final d f339842d;

    /* renamed from: e, reason: collision with root package name */
    @I41.h
    public final Throwable f339843e;

    /* compiled from: CloseableReference.java */
    /* renamed from: com.facebook.common.references.a$a, reason: collision with other inner class name */
    public static class C10526a implements h<Closeable> {
        @Override // com.facebook.common.references.h
        public final void a(Closeable closeable) {
            try {
                com.facebook.common.internal.e.a(closeable);
            } catch (IOException unused) {
            }
        }
    }

    /* compiled from: CloseableReference.java */
    public static class b implements d {
        @Override // com.facebook.common.references.a.d
        public final boolean a() {
            return false;
        }

        @Override // com.facebook.common.references.a.d
        public final void b(SharedReference<Object> sharedReference, @I41.h Throwable th2) {
            Object objB = sharedReference.b();
            h<Closeable> hVar = a.f339838f;
            C48986a.j(a.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), objB == null ? null : objB.getClass().getName());
        }
    }

    /* compiled from: CloseableReference.java */
    public @interface c {
    }

    /* compiled from: CloseableReference.java */
    public interface d {
        boolean a();

        void b(SharedReference<Object> sharedReference, @I41.h Throwable th2);
    }

    public a(SharedReference<T> sharedReference, d dVar, @I41.h Throwable th2) {
        int i12;
        boolean z12;
        sharedReference.getClass();
        this.f339841c = sharedReference;
        synchronized (sharedReference) {
            synchronized (sharedReference) {
                i12 = sharedReference.f339836b;
                z12 = i12 > 0;
            }
            this.f339842d = dVar;
            this.f339843e = th2;
        }
        if (!z12) {
            throw new SharedReference.NullReferenceException();
        }
        sharedReference.f339836b = i12 + 1;
        this.f339842d = dVar;
        this.f339843e = th2;
    }

    @I41.h
    public static <T> a<T> b(@I41.h a<T> aVar) {
        a<T> aVarClone = null;
        if (aVar != null) {
            synchronized (aVar) {
                if (aVar.j()) {
                    aVarClone = aVar.clone();
                }
            }
        }
        return aVarClone;
    }

    public static void c(@I41.h a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    @InterfaceC40366d
    public static boolean k(@I41.h a<?> aVar) {
        return aVar != null && aVar.j();
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Lcom/facebook/common/references/a<TT;>; */
    public static a m(@t Closeable closeable) {
        return n(closeable, f339838f, f339839g);
    }

    public static <T> a<T> n(@t T t12, h<T> hVar, d dVar) {
        if (t12 == null) {
            return null;
        }
        return o(t12, hVar, dVar, dVar.a() ? new Throwable() : null);
    }

    public static <T> a<T> o(@t T t12, h<T> hVar, d dVar, @I41.h Throwable th2) {
        if (t12 == null) {
            return null;
        }
        if (!(t12 instanceof Bitmap)) {
            boolean z12 = t12 instanceof com.facebook.common.references.d;
        }
        return new com.facebook.common.references.b(t12, hVar, dVar, th2);
    }

    @Override // 
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract a<T> clone();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f339840b) {
                    return;
                }
                this.f339840b = true;
                this.f339841c.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized T i() {
        T tB2;
        o.d(!this.f339840b);
        tB2 = this.f339841c.b();
        tB2.getClass();
        return tB2;
    }

    public final synchronized boolean j() {
        return !this.f339840b;
    }

    public a(T t12, h<T> hVar, d dVar, @I41.h Throwable th2) {
        this.f339841c = new SharedReference<>(t12, hVar);
        this.f339842d = dVar;
        this.f339843e = th2;
    }
}
