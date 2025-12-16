package zA0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SxAddressVideoVerificationAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<C50430c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f443937a;

    /* renamed from: b, reason: collision with root package name */
    public final u f443938b;

    public d(u uVar, u uVar2) {
        this.f443937a = uVar;
        this.f443938b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50430c((InterfaceC28373a) this.f443937a.get(), (com.avito.android.analytics.provider.a) this.f443938b.get());
    }
}
