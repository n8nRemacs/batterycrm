package ni0;

import J81.e;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.realty_agency.inline_filters_public.generated.api.api_1_nd_trx_suggest_location_post.Mode;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oi0.C44782a;
import pi0.C47094a;
import pi0.C47095b;

/* compiled from: InlineFiltersApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JB\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lni0/a;", "", "", "key", "", "fetchRecentLocations", "Lcom/avito/android/realty_agency/inline_filters_public/generated/api/api_1_nd_trx_suggest_location_post/Mode;", "mode", "query", "Lcom/avito/android/remote/model/TypedResult;", "Loi0/a;", "b", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/realty_agency/inline_filters_public/generated/api/api_1_nd_trx_suggest_location_post/Mode;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpi0/b;", "request", "Lpi0/a;", "a", "(Ljava/lang/String;Lpi0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: ni0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC44430a {
    @o("2/nd-trx/developments/suggest")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@l @t("key") String str, @J81.a @k C47095b c47095b, @k Continuation<? super TypedResult<C47094a>> continuation);

    @o("1/nd-trx/suggestLocation")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@l @t("key") String str, @J81.c("fetchRecentLocations") @l Boolean bool, @J81.c("mode") @k Mode mode, @J81.c("query") @k String str2, @k Continuation<? super TypedResult<C44782a>> continuation);
}
