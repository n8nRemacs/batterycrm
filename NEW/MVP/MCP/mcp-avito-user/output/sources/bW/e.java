package Bw;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealRoomAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f1802a;

    /* renamed from: b, reason: collision with root package name */
    public final l f1803b;

    public e(l lVar, Provider provider) {
        this.f1802a = provider;
        this.f1803b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f1802a.get(), (DealRoomArguments) this.f1803b.f393949a);
    }
}
