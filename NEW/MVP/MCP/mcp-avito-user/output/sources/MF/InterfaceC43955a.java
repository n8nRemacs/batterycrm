package mF;

import J81.d;
import J81.e;
import J81.f;
import J81.o;
import J81.s;
import J81.t;
import J81.u;
import Y61.k;
import Y61.l;
import com.avito.android.geo_common.model.AddressListResult;
import com.avito.android.geo_common.model.CoordsByAddressResult;
import com.avito.android.geo_common.model.SetDefaultAddressResult;
import com.avito.android.remote.model.ConvertDtoToTyped;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import e30.InterfaceC39936a;
import e30.InterfaceC39937b;
import io.reactivex.rxjava3.core.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import tF.AbstractC48544a;
import tF.C48546c;
import tF.C48547d;
import tF.e;
import uF.AbstractC48888a;
import uF.d;
import uF.e;
import uF.g;

/* compiled from: LocationApi.kt */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u0004H'¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u0007J%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0007J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013Jf\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00102\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0014\b\u0003\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0019H§@¢\u0006\u0004\b\u001c\u0010\u001dJ~\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0019H§@¢\u0006\u0004\b \u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0010H§@¢\u0006\u0004\b#\u0010$J4\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00102\b\b\u0001\u0010%\u001a\u00020\u00142\b\b\u0001\u0010&\u001a\u00020\u00142\b\b\u0003\u0010'\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010*J6\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00102\b\b\u0001\u0010%\u001a\u00020\u00142\b\b\u0001\u0010&\u001a\u00020\u00142\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b-\u0010*J)\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00042\b\b\u0001\u0010%\u001a\u00020\u00022\b\b\u0001\u0010&\u001a\u00020\u0002H'¢\u0006\u0004\b/\u00100J%\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b2\u0010\u0007J\u001f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b4\u0010\u0007J \u00105\u001a\b\u0012\u0004\u0012\u0002030\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b5\u0010\u0013J%\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b7\u0010\u0007J&\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\n0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b8\u0010\u0013J8\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00102\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010:\u001a\u0004\u0018\u000109H§@¢\u0006\u0004\b<\u0010=JF\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00102\b\b\u0001\u0010>\u001a\u00020\u00022$\b\u0001\u0010A\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020?j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`@H§@¢\u0006\u0004\bC\u0010DJ8\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00102\b\b\u0001\u0010E\u001a\u00020\u00022\n\b\u0003\u0010F\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010G\u001a\u0004\u0018\u000109H§@¢\u0006\u0004\bI\u0010=J,\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00102\b\b\u0001\u0010\u001e\u001a\u00020\u00022\n\b\u0001\u0010J\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bL\u0010MJ*\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u00102\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010O\u001a\u00020NH§@¢\u0006\u0004\bQ\u0010RJ \u0010S\u001a\b\u0012\u0004\u0012\u00020K0\u00102\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\bS\u0010\u0013¨\u0006T"}, d2 = {"LmF/a;", "", "", SearchParamsConverterKt.LOCATION_ID, "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/Location;", "b", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "e", "()Lio/reactivex/rxjava3/core/z;", "", "g", "query", "LtF/d;", "d", "i", "Lcom/avito/android/remote/model/TypedResult;", "LuF/c;", "o", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "bottomLeftLng", "bottomLeftLat", "upperRightLng", "upperRightLat", "", "params", "LuF/d$c;", "w", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "geoSessionId", "LtF/a$c;", "f", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LuF/g;", "s", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "latitude", "longitude", "flowType", "LuF/a;", "n", "(DDLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "itemId", "LuF/f;", "t", "LtF/c;", "c", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/Metro;", "h", "Lcom/avito/android/remote/model/metro_lines/MetroResponseBody;", "m", "u", "Lcom/avito/android/remote/model/District;", "a", "v", "", "onlyRealLocations", "LtF/e$c;", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", AddressParameter.Value.JSON_WEB_TOKEN, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "validationRules", "LuF/e$c;", "p", "(Ljava/lang/String;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", AddressParameter.TYPE, "language", "separateAddressByComponents", "Lcom/avito/android/geo_common/model/CoordsByAddressResult;", "k", "fromPage", "Lcom/avito/android/geo_common/model/AddressListResult;", "j", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "addressId", "Lcom/avito/android/geo_common/model/SetDefaultAddressResult;", "l", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: mF.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC43955a {

    /* compiled from: LocationApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mF.a$a, reason: collision with other inner class name */
    public static final class C11820a {
    }

    @f("2/locations/{locationId}/districts")
    @InterfaceC39937b
    @k
    z<List<District>> a(@s(SearchParamsConverterKt.LOCATION_ID) @k String locationId);

    @f("2/locations/{locationId}")
    @InterfaceC39937b
    @k
    z<Location> b(@s(SearchParamsConverterKt.LOCATION_ID) @k String locationId);

    @f("2/locations/nearest?includeRefs=1")
    @InterfaceC39937b
    @Named("nearest")
    @k
    z<C48546c> c(@t("lat") @k String latitude, @t(AddressParameter.Value.LNG) @k String longitude);

    @f("2/locations/search")
    @InterfaceC39937b
    @k
    z<C48547d> d(@t("query") @k String query);

    @f("2/locations/top")
    @InterfaceC39937b
    @k
    z<Location> e();

    @f("2/location/suggest/by_query")
    @l
    @InterfaceC39937b
    Object f(@t("query") @k String str, @l @t("bottomLeftLng") Double d12, @l @t("bottomLeftLat") Double d13, @l @t("upperRightLng") Double d14, @l @t("upperRightLat") Double d15, @l @t("geoSessionId") String str2, @l @t(SearchParamsConverterKt.LOCATION_ID) String str3, @u @k Map<String, String> map, @k Continuation<? super TypedResult<AbstractC48544a.c>> continuation);

    @f("2/locations/top/children")
    @InterfaceC39937b
    @k
    z<List<Location>> g();

    @f("2/locations/{locationId}/metro")
    @InterfaceC39937b
    @k
    z<List<Metro>> h(@s(SearchParamsConverterKt.LOCATION_ID) @k String locationId);

    @f("2/locations/{locationId}/children")
    @InterfaceC39937b
    @k
    z<List<Location>> i(@s(SearchParamsConverterKt.LOCATION_ID) @k String locationId);

    @f("1/addresses/list")
    @l
    @InterfaceC39937b
    Object j(@t("geoSessionId") @k String str, @l @t("fromPage") String str2, @k Continuation<? super TypedResult<AddressListResult>> continuation);

    @f("2/coords/by_address")
    @l
    @InterfaceC39937b
    Object k(@t(AddressParameter.TYPE) @k String str, @l @t("lang") String str2, @l @t("components") Boolean bool, @k Continuation<? super TypedResult<CoordsByAddressResult>> continuation);

    @o("1/addresses/set-default")
    @e
    @InterfaceC39937b
    @l
    Object l(@t("geoSessionId") @k String str, @J81.c("addressId") int i12, @k Continuation<? super TypedResult<SetDefaultAddressResult>> continuation);

    @f("3/locations/{locationId}/metro")
    @InterfaceC39937b
    @k
    z<MetroResponseBody> m(@s(SearchParamsConverterKt.LOCATION_ID) @k String locationId);

    @f("1/location/suggest/by_coordinates")
    @l
    @InterfaceC39937b
    Object n(@t("lat") double d12, @t(AddressParameter.Value.LNG) double d13, @t("flowType") @k String str, @k Continuation<? super TypedResult<AbstractC48888a>> continuation);

    @f("1/location/coords/by_address")
    @l
    @InterfaceC39937b
    Object o(@t(AddressParameter.TYPE) @k String str, @k Continuation<? super TypedResult<uF.c>> continuation);

    @o("2/address/validate")
    @e
    @InterfaceC39937b
    @l
    Object p(@J81.c(AddressParameter.Value.JSON_WEB_TOKEN) @k String str, @d @k HashMap<String, String> map, @k Continuation<? super TypedResult<e.c>> continuation);

    @f("1/slocations?limit=10")
    @l
    @InterfaceC39937b
    Object q(@t("query") @k String str, @l @t(SearchParamsConverterKt.LOCATION_ID) String str2, @l @t("onlyRealLocations") Boolean bool, @k Continuation<? super TypedResult<e.c>> continuation);

    @f("1/addresses/list")
    @l
    @InterfaceC39937b
    Object r(@t("geoSessionId") @k String str, @k Continuation<? super TypedResult<AddressListResult>> continuation);

    @f("1/location/coords/current")
    @l
    @InterfaceC39937b
    Object s(@k Continuation<? super TypedResult<g>> continuation);

    @o("2/location/verify")
    @J81.e
    @InterfaceC39937b
    @l
    Object t(@J81.c("lat") double d12, @J81.c(AddressParameter.Value.LNG) double d13, @J81.c("itemId") @l String str, @k Continuation<? super TypedResult<uF.f>> continuation);

    @f("3/locations/{locationId}/metro")
    @ConvertDtoToTyped
    @InterfaceC39937b
    @l
    Object u(@s(SearchParamsConverterKt.LOCATION_ID) @k String str, @k Continuation<? super TypedResult<MetroResponseBody>> continuation);

    @f("2/locations/{locationId}/districts")
    @ConvertDtoToTyped
    @InterfaceC39937b
    @l
    Object v(@s(SearchParamsConverterKt.LOCATION_ID) @k String str, @k Continuation<? super TypedResult<List<District>>> continuation);

    @f("1/location/suggest/by_query")
    @l
    @InterfaceC39937b
    Object w(@t("query") @k String str, @l @t("bottomLeftLng") Double d12, @l @t("bottomLeftLat") Double d13, @l @t("upperRightLng") Double d14, @l @t("upperRightLat") Double d15, @u @k Map<String, String> map, @k Continuation<? super TypedResult<d.c>> continuation);
}
