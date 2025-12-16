package Tx0;

import Sx0.F;
import Sx0.InterfaceC15262k;
import Sx0.N;
import Sx0.O;
import Y61.k;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.avito.android.str_booking.network.generated.api.api_4_str_order_seller_by_order_id_get.a;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.h;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: StrBookingJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LTx0/c;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f16031a = new c();

    @Override // javax.inject.Provider
    public final Object get() {
        C15422a.f16029a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, InterfaceC15262k.class);
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC15262k.a.class, "bookingUpdated");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC15262k.b.class, "sellerBanner");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC15262k.c.class, "sellerCalculationPayment");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC15262k.d.class, "sellerCalculationReceive");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC15262k.e.class, "sellerDetails");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC15262k.f.class, "sellerFooter");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC15262k.g.class, "sellerInfo");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC15262k.h.class, "sellerItemInfo");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC15262k.i.class, "sellerTitle");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC15262k.j.class, "sellerUserInfo");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK = D8.k(F.class, F.a.class, "ActionButton", F.b.class, "bookingRedirectButton");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK2 = D8.k(N.class, N.a.class, "ActionButton", N.b.class, "bookingRedirectButton");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK3 = D8.k(O.class, O.a.class, "ActionButton", O.b.class, "RedirectButton");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK4 = D8.k(com.avito.android.str_booking.network.generated.api.api_4_str_order_seller_by_order_id_get.a.class, a.C8556a.class, "bookingHrefEnumButton", a.b.class, "bookingRedirectButton");
        optimalRuntimeTypeAdapterFactoryK4.b(a.c.class, "guestProfileButton");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, optimalRuntimeTypeAdapterFactoryK, optimalRuntimeTypeAdapterFactoryK2, optimalRuntimeTypeAdapterFactoryK3, optimalRuntimeTypeAdapterFactoryK4});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
