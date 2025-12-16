package com.facebook.datasource;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: BaseDataSubscriber.java */
@Nullsafe
/* loaded from: classes5.dex */
public abstract class e<T> implements k<T> {
    public abstract void a(@I41.g f<T> fVar);

    @Override // com.facebook.datasource.k
    public final void c(@I41.g f<T> fVar) {
        try {
            a(fVar);
        } finally {
            fVar.close();
        }
    }

    @Override // com.facebook.datasource.k
    public final void e(@I41.g f<T> fVar) {
        boolean zG2 = fVar.g();
        try {
            f(fVar);
        } finally {
            if (zG2) {
                fVar.close();
            }
        }
    }

    public abstract void f(@I41.g f<T> fVar);

    @Override // com.facebook.datasource.k
    public final void b() {
    }

    @Override // com.facebook.datasource.k
    public void d(@I41.g f<T> fVar) {
    }
}
