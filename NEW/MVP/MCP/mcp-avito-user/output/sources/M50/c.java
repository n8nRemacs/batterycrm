package M50;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Z1;

/* compiled from: AnalyticInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f10397a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Z1<AnalyticScreen>> f10398b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f10399c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.h f10400d;

    public c(Provider provider, Provider provider2, dagger.internal.l lVar, dagger.internal.h hVar) {
        this.f10397a = provider;
        this.f10398b = provider2;
        this.f10399c = lVar;
        this.f10400d = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f10397a.get(), this.f10398b.get(), (Z1) this.f10399c.f393949a, (ProfileCreateExtendedFlow) this.f10400d.get());
    }
}
