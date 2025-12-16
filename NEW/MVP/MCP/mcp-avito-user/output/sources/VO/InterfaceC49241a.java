package vO;

import J81.f;
import J81.s;
import J81.t;
import J81.u;
import Y61.k;
import com.avito.android.item_map.remote.model.AmenityResponse;
import com.avito.android.item_map.remote.model.route.RouteResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ItemMapApi.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JC\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\b2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LvO/a;", "", "", "itemId", "", "lat", AddressParameter.Value.LNG, "type", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/item_map/remote/model/AmenityResponse;", "a", "(Ljava/lang/String;FFLjava/lang/String;)Lio/reactivex/rxjava3/core/z;", "", "params", "Lcom/avito/android/item_map/remote/model/route/RouteResponse;", "b", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "_avito-discouraged_avito-api_item-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: vO.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC49241a {
    @f("1/developmentsCatalog/amenity/{itemId}")
    @k
    z<TypedResult<AmenityResponse>> a(@s("itemId") @k String itemId, @t("lat") float lat, @t(AddressParameter.Value.LNG) float lng, @t("type") @k String type);

    @J81.k({"X-Geo-required: true"})
    @f("1/route")
    @k
    z<TypedResult<RouteResponse>> b(@u @k Map<String, String> params);
}
