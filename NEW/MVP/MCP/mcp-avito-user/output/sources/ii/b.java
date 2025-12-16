package II;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AvailableHotelRoomsDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f8075a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.hotel_available_rooms.d f8076b;

    public b(dv.b bVar, com.avito.android.hotel_available_rooms.d dVar) {
        this.f8075a = bVar;
        this.f8076b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f8075a.get(), (com.avito.android.hotel_available_rooms.a) this.f8076b.get());
    }
}
