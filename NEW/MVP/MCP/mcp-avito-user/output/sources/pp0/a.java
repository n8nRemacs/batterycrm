package PP0;

import J81.f;
import J81.t;
import J81.u;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.widget_filters.remote.model.WidgetFiltersApplyResponse;
import com.avito.android.widget_filters.remote.model.WidgetFiltersResponse;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: WidgetFiltersApi.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LPP0/a;", "", "", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/widget_filters/remote/model/WidgetFiltersResponse;", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fromPage", "Lcom/avito/android/widget_filters/remote/model/WidgetFiltersApplyResponse;", "b", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes5.dex */
public interface a {
    @f("1/widget/filters/parameters")
    @l
    Object a(@u @k Map<String, String> map, @k Continuation<? super TypedResult<WidgetFiltersResponse>> continuation);

    @f("1/widget/filters/apply")
    @l
    Object b(@u @k Map<String, String> map, @l @t("fromPage") String str, @k Continuation<? super TypedResult<WidgetFiltersApplyResponse>> continuation);
}
