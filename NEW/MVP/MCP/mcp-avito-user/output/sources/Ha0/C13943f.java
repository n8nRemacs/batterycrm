package Ha0;

import com.avito.android.profile.user_profile.cards.service_booking.items.m;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ActiveServiceBookingsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Ha0.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13943f implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C13939b f7281a;

    /* renamed from: b, reason: collision with root package name */
    public final u f7282b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f7283c;

    /* renamed from: d, reason: collision with root package name */
    public final m f7284d;

    public C13943f(C13939b c13939b, u uVar, Provider provider, m mVar) {
        this.f7281a = c13939b;
        this.f7282b = uVar;
        this.f7283c = provider;
        this.f7284d = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f7282b.get();
        com.avito.konveyor.a aVar2 = this.f7283c.get();
        this.f7284d.getClass();
        com.avito.android.profile.user_profile.cards.service_booking.items.d dVar = new com.avito.android.profile.user_profile.cards.service_booking.items.d();
        this.f7281a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, dVar);
    }
}
