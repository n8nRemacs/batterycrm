package pY;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wY.C49575a;

/* compiled from: MasterPlanAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f428598a;

    /* renamed from: b, reason: collision with root package name */
    public final l f428599b;

    /* renamed from: c, reason: collision with root package name */
    public final l f428600c;

    public e(l lVar, l lVar2, Provider provider) {
        this.f428598a = provider;
        this.f428599b = lVar;
        this.f428600c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f428598a.get(), (C49575a) this.f428599b.f393949a, (C49575a) this.f428600c.f393949a);
    }
}
