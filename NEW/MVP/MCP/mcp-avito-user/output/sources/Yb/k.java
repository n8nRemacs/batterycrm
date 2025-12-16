package Yb;

import com.avito.android.analytic.PermissionStateAnalyticTask;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PermissionStateAnalyticTask_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<PermissionStateAnalyticTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC18250a> f19542a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<e> f19543b;

    public k(Provider<InterfaceC18250a> provider, Provider<e> provider2) {
        this.f19542a = provider;
        this.f19543b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new PermissionStateAnalyticTask(this.f19542a.get(), this.f19543b.get());
    }
}
