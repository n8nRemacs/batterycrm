package bv0;

import android.app.Application;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PortfolioIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: bv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C25723b implements h<com.avito.android.services_portfolio.a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f57544a;

    public C25723b(l lVar) {
        this.f57544a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.services_portfolio.a((Application) this.f57544a.f393949a);
    }
}
