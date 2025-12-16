package Xy0;

import android.app.Application;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrInsuranceIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<com.avito.android.str_insurance.a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f19177a;

    public f(l lVar) {
        this.f19177a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.str_insurance.a((Application) this.f19177a.f393949a);
    }
}
