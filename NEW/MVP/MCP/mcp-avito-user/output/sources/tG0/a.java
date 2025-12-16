package TG0;

import J81.d;
import J81.e;
import J81.f;
import J81.o;
import J81.s;
import J81.t;
import J81.u;
import Y61.k;
import Y61.l;
import com.avito.android.geo_common.model.CoordsByAddressResult;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.user_address.model.ValidateByCoordsResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39937b;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import tF.AbstractC48544a;

/* compiled from: UserAddressApi.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J@\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJJ\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H§@¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016J6\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H§@¢\u0006\u0004\b\u0018\u0010\u0013J6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H§@¢\u0006\u0004\b\u001a\u0010\u0013J,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H§@¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00072\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010 \u001a\u00020\u001eH§@¢\u0006\u0004\b\"\u0010#J~\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00072\b\b\u0001\u0010$\u001a\u00020\u00022\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H§@¢\u0006\u0004\b+\u0010,J8\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010/\u001a\u0004\u0018\u00010.H§@¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"LTG0/a;", "", "", AddressParameter.Value.JSON_WEB_TOKEN, AddressParameter.TYPE, "", "coordinate", "Lcom/avito/android/remote/model/TypedResult;", "LaH0/k;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "addressId", "s", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "geoSessionId", "params", "LaH0/e;", "q", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LaH0/c;", "r", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LaH0/l;", "m", "Lkotlin/G0;", "n", "LaH0/b;", "l", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "latitude", "longitude", "Lcom/avito/android/user_address/model/ValidateByCoordsResult;", "o", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "query", "bottomLeftLng", "bottomLeftLat", "upperRightLng", "upperRightLat", SearchParamsConverterKt.LOCATION_ID, "LtF/a$c;", "f", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "language", "", "separateAddressByComponents", "Lcom/avito/android/geo_common/model/CoordsByAddressResult;", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: UserAddressApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: TG0.a$a, reason: collision with other inner class name */
    public static final class C1053a {
    }

    @f("2/location/suggest/by_query")
    @l
    @InterfaceC39937b
    Object f(@t("query") @k String str, @l @t("bottomLeftLng") Double d12, @l @t("bottomLeftLat") Double d13, @l @t("upperRightLng") Double d14, @l @t("upperRightLat") Double d15, @l @t("geoSessionId") String str2, @l @t(SearchParamsConverterKt.LOCATION_ID) String str3, @u @k Map<String, String> map, @k Continuation<? super TypedResult<AbstractC48544a.c>> continuation);

    @f("2/coords/by_address")
    @l
    @InterfaceC39937b
    Object k(@t(AddressParameter.TYPE) @k String str, @l @t("lang") String str2, @l @t("components") Boolean bool, @k Continuation<? super TypedResult<CoordsByAddressResult>> continuation);

    @o("2/addresses/add")
    @e
    @InterfaceC39937b
    @l
    Object l(@d @k Map<String, String> map, @k Continuation<? super TypedResult<aH0.b>> continuation);

    @o("1/addresses/update")
    @e
    @InterfaceC39937b
    @l
    Object m(@t("geox") @k String str, @d @k Map<String, String> map, @k Continuation<? super TypedResult<aH0.l>> continuation);

    @o("1/addresses/update")
    @e
    @InterfaceC39937b
    @l
    Object n(@t("geoSessionId") @k String str, @d @k Map<String, String> map, @k Continuation<? super TypedResult<G0>> continuation);

    @o("1/addresses/validate-by-coords")
    @l
    @InterfaceC39937b
    Object o(@t("lat") double d12, @t(AddressParameter.Value.LNG) double d13, @k Continuation<? super TypedResult<ValidateByCoordsResult>> continuation);

    @o("1/sellerx/address/add")
    @e
    @InterfaceC39937b
    @l
    Object p(@J81.c(AddressParameter.Value.JSON_WEB_TOKEN) @k String str, @J81.c(AddressParameter.TYPE) @k String str2, @d @k Map<String, String> map, @k Continuation<? super TypedResult<aH0.k>> continuation);

    @o("1/addresses/delete")
    @e
    @InterfaceC39937b
    @l
    Object q(@t("geoSessionId") @k String str, @d @k Map<String, String> map, @k Continuation<? super TypedResult<aH0.e>> continuation);

    @f("1/addresses/edit-info/{addressId}")
    @l
    @InterfaceC39937b
    Object r(@s("addressId") int i12, @t("geoSessionId") @k String str, @k Continuation<? super TypedResult<aH0.c>> continuation);

    @o("1/sellerx/address/update")
    @e
    @InterfaceC39937b
    @l
    Object s(@J81.c(AddressParameter.Value.JSON_WEB_TOKEN) @k String str, @J81.c(AddressParameter.TYPE) @k String str2, @J81.c("addressId") int i12, @d @k Map<String, String> map, @k Continuation<? super TypedResult<aH0.k>> continuation);
}
