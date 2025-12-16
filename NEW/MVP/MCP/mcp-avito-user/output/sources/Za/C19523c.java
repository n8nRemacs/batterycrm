package Za;

import android.content.res.Resources;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailStatsResourcesProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Za.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C19523c implements h<C19522b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f20209a;

    public C19523c(l lVar) {
        this.f20209a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C19522b((Resources) this.f20209a.f393949a);
    }
}
