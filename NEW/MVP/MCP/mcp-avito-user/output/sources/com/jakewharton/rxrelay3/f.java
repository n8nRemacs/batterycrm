package com.jakewharton.rxrelay3;

import io.reactivex.rxjava3.core.G;

/* compiled from: SerializedRelay.java */
/* loaded from: classes7.dex */
final class f<T> extends d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final d<T> f364298b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f364299c;

    /* renamed from: d, reason: collision with root package name */
    public a<T> f364300d;

    public f(d<T> dVar) {
        this.f364298b = dVar;
    }

    @Override // l41.g
    public final void accept(T t12) {
        a<T> aVar;
        Object[] objArr;
        synchronized (this) {
            try {
                if (this.f364299c) {
                    a<T> aVar2 = this.f364300d;
                    if (aVar2 == null) {
                        aVar2 = new a<>();
                        this.f364300d = aVar2;
                    }
                    aVar2.a(t12);
                    return;
                }
                this.f364299c = true;
                this.f364298b.accept(t12);
                while (true) {
                    synchronized (this) {
                        try {
                            aVar = this.f364300d;
                            if (aVar == null) {
                                this.f364299c = false;
                                return;
                            }
                            this.f364300d = null;
                        } finally {
                        }
                    }
                    d<T> dVar = this.f364298b;
                    for (Object[] objArr2 = aVar.f364261a; objArr2 != null; objArr2 = objArr2[4]) {
                        for (int i12 = 0; i12 < 4 && (objArr = objArr2[i12]) != null; i12++) {
                            dVar.accept(objArr);
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        this.f364298b.c(g12);
    }
}
