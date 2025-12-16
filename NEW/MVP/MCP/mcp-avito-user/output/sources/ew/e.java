package Ew;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.developments_agency_search.screen.help_center.model.HelpCenterArguments;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HelpCenterAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f4406a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4407b;

    public e(l lVar, Provider provider) {
        this.f4406a = provider;
        this.f4407b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f4406a.get(), (HelpCenterArguments) this.f4407b.f393949a);
    }
}
