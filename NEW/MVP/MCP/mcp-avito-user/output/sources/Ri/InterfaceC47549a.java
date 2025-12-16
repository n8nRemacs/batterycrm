package rI;

import J81.f;
import J81.k;
import J81.t;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import sI.C48052a;

/* compiled from: HistoricalSuggestsApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J|\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LrI/a;", "", "", "query", "", "bottomLeftLat", "bottomLeftLng", "upperRightLat", "upperRightLng", "", "types", "", "categoryId", "flowType", "Lcom/avito/android/remote/model/TypedResult;", "LsI/a;", "a", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: rI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC47549a {
    @f("3/location/suggest/by_query")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@l @t("query") String str, @l @t("bottomLeftLat") Double d12, @l @t("bottomLeftLng") Double d13, @l @t("upperRightLat") Double d14, @l @t("upperRightLng") Double d15, @l @t("types") List<String> list, @l @t("categoryId") Long l12, @l @t("flowType") String str2, @Y61.k Continuation<? super TypedResult<C48052a>> continuation);
}
