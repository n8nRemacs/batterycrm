package bj0;

import android.app.Application;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RelatedProductsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: bj0.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C25665e implements dagger.internal.h<C25664d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f57403a;

    public C25665e(l lVar) {
        this.f57403a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C25664d((Application) this.f57403a.f393949a);
    }
}
