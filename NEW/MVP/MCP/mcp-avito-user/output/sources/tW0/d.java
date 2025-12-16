package Tw0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IncomeSettingsDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<C15419a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.soa_stat.profile_settings.c f16025a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f16026b;

    public d(com.avito.android.soa_stat.profile_settings.c cVar, dv.b bVar) {
        this.f16025a = cVar;
        this.f16026b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C15419a((com.avito.android.soa_stat.profile_settings.a) this.f16025a.get(), (a.InterfaceC4053a) this.f16026b.get());
    }
}
