package GI;

import Y61.k;
import Y61.l;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.hotel_available_rooms.di.p;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HotelAvailableRoomsAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGI/b;", "LGI/a;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f6408a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f6409b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f6410c;

    @Inject
    public b(@k E e12, @k InterfaceC28373a interfaceC28373a, @l @p String str) {
        this.f6408a = interfaceC28373a;
        this.f6409b = e12;
        this.f6410c = str;
    }

    @Override // GI.a
    public final void a(@k String str) {
        this.f6408a.c(new HI.a(-1, str, this.f6409b.a(), this.f6410c, null));
    }

    @Override // GI.a
    public final void b(int i12, @k String str, @l Map map) {
        this.f6408a.c(new HI.a(i12, str, this.f6409b.a(), this.f6410c, map));
    }

    @Override // GI.a
    public final void q(@k ParametrizedEvent parametrizedEvent) {
        this.f6408a.c(a0.a(parametrizedEvent));
    }
}
