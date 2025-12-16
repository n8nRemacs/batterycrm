package io.reactivex.rxjava3.internal.jdk8;

import java.util.Iterator;
import java.util.Objects;
import q41.InterfaceC47199b;
import s41.C47998a;

/* compiled from: ObservableFromStream.java */
/* loaded from: classes8.dex */
public final class v<T> extends io.reactivex.rxjava3.core.z<T> {

    /* compiled from: ObservableFromStream.java */
    public static final class a<T> implements InterfaceC47199b<T> {

        /* renamed from: b, reason: collision with root package name */
        public Iterator<T> f402085b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f402086c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402087d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402088e;

        @Override // q41.g
        public final void clear() {
            this.f402085b = null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402086c = true;
            if (this.f402088e) {
                return;
            }
            Iterator<T> it = this.f402085b;
            while (!this.f402086c) {
                try {
                    Objects.requireNonNull(it.next(), "The Stream's Iterator.next returned a null value");
                    if (!this.f402086c) {
                        throw null;
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    throw null;
                }
            }
            this.f402085b = null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402086c;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            Iterator<T> it = this.f402085b;
            if (it == null) {
                return true;
            }
            if (!this.f402087d || it.hasNext()) {
                return false;
            }
            this.f402085b = null;
            return true;
        }

        @Override // q41.g
        public final boolean offer(@j41.e T t12) {
            throw new UnsupportedOperationException();
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            Iterator<T> it = this.f402085b;
            if (it == null) {
                return null;
            }
            if (!this.f402087d) {
                this.f402087d = true;
            } else if (!it.hasNext()) {
                this.f402085b = null;
                return null;
            }
            T next = this.f402085b.next();
            Objects.requireNonNull(next, "The Stream's Iterator.next() returned a null value");
            return next;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            this.f402088e = true;
            return 1;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        try {
            throw null;
        } finally {
            try {
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
        }
    }
}
