package ns;

import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import os.C44931a;
import os.n;
import ps.C47133a;
import ps.C47134b;
import qs.C47433a;
import qs.C47434b;
import rs.C47714a;
import rs.C47715b;

/* compiled from: CpxPromoGeoApi.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lns/a;", "", "Los/n;", "request", "Lcom/avito/android/remote/model/TypedResult;", "Los/a;", "c", "(Los/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqs/b;", "Lqs/a;", "d", "(Lqs/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrs/b;", "Lrs/a;", "b", "(Lrs/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lps/b;", "Lps/a;", "a", "(Lps/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: ns.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44470a {
    @o("1/cpa-cjm/cpx-promo-geo/save")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@J81.a @k C47134b c47134b, @k Continuation<? super TypedResult<C47133a>> continuation);

    @o("1/cpa-cjm/cpx-promo-geo/regionSheet/search")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@J81.a @k C47715b c47715b, @k Continuation<? super TypedResult<C47714a>> continuation);

    @o("1/cpa-cjm/cpx-promo-geo/getData")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@J81.a @k n nVar, @k Continuation<? super TypedResult<C44931a>> continuation);

    @o("1/cpa-cjm/cpx-promo-geo/regionSheet/getSubLocations")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object d(@J81.a @k C47434b c47434b, @k Continuation<? super TypedResult<C47433a>> continuation);
}
