package YP0;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.work_profile.WorkProfileOpenParams;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WorkProfileTabSwitchAnalyticsSender_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f19468a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f19469b;

    public e(l lVar, Provider provider) {
        this.f19468a = lVar;
        this.f19469b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((WorkProfileOpenParams) this.f19468a.f393949a, this.f19469b.get());
    }
}
