package lA0;

import J81.f;
import J81.t;
import J81.u;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.suggest_addresses.model.ResolvedAddressResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39937b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import tF.AbstractC48544a;

/* compiled from: SuggestAddressesApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J~\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LlA0/a;", "", "", "query", "", "bottomLeftLng", "bottomLeftLat", "upperRightLng", "upperRightLat", "geoSessionId", SearchParamsConverterKt.LOCATION_ID, "", "params", "Lcom/avito/android/remote/model/TypedResult;", "LtF/a$c;", "f", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggest", "Lcom/avito/android/suggest_addresses/model/ResolvedAddressResult;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: lA0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC43610a {

    /* compiled from: SuggestAddressesApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lA0.a$a, reason: collision with other inner class name */
    public static final class C11778a {
    }

    @f("2/resolve/address")
    @l
    @InterfaceC39937b
    Object a(@t("suggest") @k String str, @k Continuation<? super TypedResult<ResolvedAddressResult>> continuation);

    @f("2/location/suggest/by_query")
    @l
    @InterfaceC39937b
    Object f(@t("query") @k String str, @l @t("bottomLeftLng") Double d12, @l @t("bottomLeftLat") Double d13, @l @t("upperRightLng") Double d14, @l @t("upperRightLat") Double d15, @l @t("geoSessionId") String str2, @l @t(SearchParamsConverterKt.LOCATION_ID) String str3, @u @k Map<String, String> map, @k Continuation<? super TypedResult<AbstractC48544a.c>> continuation);
}
