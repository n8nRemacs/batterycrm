package com.facebook.datasource;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: BaseBooleanSubscriber.java */
@Nullsafe
/* loaded from: classes5.dex */
public abstract class d implements k<Boolean> {
    public abstract void a(f<Boolean> fVar);

    @Override // com.facebook.datasource.k
    public final void c(f<Boolean> fVar) {
        try {
            a(fVar);
        } finally {
            fVar.close();
        }
    }

    @Override // com.facebook.datasource.k
    public final void e(f<Boolean> fVar) {
        try {
            fVar.a().getClass();
            f();
        } finally {
            fVar.close();
        }
    }

    public abstract void f();

    @Override // com.facebook.datasource.k
    public final void b() {
    }

    @Override // com.facebook.datasource.k
    public final void d(f<Boolean> fVar) {
    }
}
