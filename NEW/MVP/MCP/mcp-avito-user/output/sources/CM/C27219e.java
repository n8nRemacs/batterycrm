package cm;

import android.content.res.Resources;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CalltrackingTabsDataProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: cm.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C27219e implements h<C27218d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f58129a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C27215a> f58130b;

    public C27219e(l lVar, Provider provider) {
        this.f58129a = lVar;
        this.f58130b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C27218d((Resources) this.f58129a.f393949a, this.f58130b.get());
    }
}
