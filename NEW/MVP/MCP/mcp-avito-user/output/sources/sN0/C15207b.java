package Sn0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.B;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import com.avito.android.safedeal.universal_delivery_type.ReloadReason;
import com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeParams;
import com.avito.android.safedeal.universal_delivery_type.k;
import h31.e;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: UniversalDeliveryTypeRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSn0/b;", "LSn0/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sn0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15207b implements InterfaceC15206a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<B> f15143a;

    @Inject
    public C15207b(@k e<B> eVar) {
        this.f15143a = eVar;
    }

    @Override // Sn0.InterfaceC15206a
    @l
    public final Object a(@k UniversalDeliveryTypeParams universalDeliveryTypeParams, @k Continuation<? super TypedResult<UniversalDeliveryTypeContent>> continuation) {
        B b12 = this.f15143a.get();
        String str = universalDeliveryTypeParams.f256425b;
        Map<String, String> mapC = universalDeliveryTypeParams.f256426c;
        if (mapC == null) {
            mapC = P0.c();
        }
        Map<String, String> map = mapC;
        ReloadReason reloadReason = universalDeliveryTypeParams.f256433j;
        int i12 = reloadReason == null ? -1 : k.a.f256637a[reloadReason.ordinal()];
        return C43292o.b(b12.c(str, map, universalDeliveryTypeParams.f256427d, universalDeliveryTypeParams.f256428e, universalDeliveryTypeParams.f256429f, universalDeliveryTypeParams.f256431h, i12 != 1 ? i12 != 2 ? i12 != 3 ? null : "completeAddress" : "editAddress" : "addAddress", universalDeliveryTypeParams.f256432i, "deliveryCompetition", Boxing.boxInt(1), Boxing.boxInt(1), Boxing.boxInt(1)), continuation);
    }
}
