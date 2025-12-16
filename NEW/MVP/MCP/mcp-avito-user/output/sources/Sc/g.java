package sC;

import android.content.res.Resources;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoriteComparisonResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<C48029f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f437542a;

    public g(l lVar) {
        this.f437542a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C48029f((Resources) this.f437542a.f393949a);
    }
}
