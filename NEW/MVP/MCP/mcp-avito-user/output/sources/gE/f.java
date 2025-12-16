package Ge;

import android.app.Application;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoLoanCabinetPageIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f6629a;

    public f(l lVar) {
        this.f6629a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Application) this.f6629a.f393949a);
    }
}
