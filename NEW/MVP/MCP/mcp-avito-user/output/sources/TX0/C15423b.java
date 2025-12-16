package Tx0;

import Y61.k;
import com.avito.android.str_booking.network.generated.api.api_4_str_order_seller_by_order_id_get.SellerUserInfoV4ButtonsItemBookingHrefEnumButtonTypeAdapterFactory;
import com.avito.android.str_booking.network.generated.api.api_4_str_order_seller_by_order_id_get.SellerUserInfoV4ButtonsItemGuestProfileButtonTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.h;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: StrBookingJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LTx0/b;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tx0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15423b implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C15423b f16030a = new C15423b();

    @Override // javax.inject.Provider
    public final Object get() {
        C15422a.f16029a.getClass();
        Set setL0 = C42756l.l0(new r[]{new SellerUserInfoV4ButtonsItemBookingHrefEnumButtonTypeAdapterFactory(), new SellerUserInfoV4ButtonsItemGuestProfileButtonTypeAdapterFactory()});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
