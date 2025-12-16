package tG0;

import J81.f;
import J81.t;
import J81.u;
import J81.y;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.universal_map.remote.model.UniversalMapPointsRectResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import uG0.C48896b;
import uG0.C48897c;

/* compiled from: UniversalMapApi.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u009f\u0001\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b\u0010\u0010\u0011J\u009a\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u0016\u0010\u0017J6\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\u0018\u0010\u0019JQ\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u001c\u0010\u001dJL\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\"\u0010\u001dJL\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b#\u0010\u001f¨\u0006$"}, d2 = {"LtG0/b;", "", "", "path", "", "", "topLeft", "bottomRight", "extraParameters", "checkedPinFilters", "selectedPinParameters", "", "clusterRadius", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointsRectResult;", "a", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Float;)Lio/reactivex/rxjava3/core/z;", "c", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Float;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extraRequestParameters", "LuG0/d;", "d", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "g", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pinParameters", "LuG0/c;", "b", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "f", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkedFilters", "LuG0/b;", "e", "h", "_avito-discouraged_avito-api_universal-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: tG0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC48553b {
    @f
    @k
    z<TypedResult<UniversalMapPointsRectResult>> a(@y @k String path, @u @k Map<String, Double> topLeft, @u @k Map<String, Double> bottomRight, @u @k Map<String, String> extraParameters, @u @k Map<String, String> checkedPinFilters, @u @k Map<String, String> selectedPinParameters, @l @t("clusterRadius") Float clusterRadius);

    @f
    @k
    z<TypedResult<C48897c>> b(@y @k String path, @u @k Map<String, String> pinParameters, @u @k Map<String, String> extraParameters);

    @f
    @l
    Object c(@y @k String str, @u @k Map<String, Double> map, @u @k Map<String, Double> map2, @u @k Map<String, String> map3, @u @k Map<String, String> map4, @u @k Map<String, String> map5, @l @t("clusterRadius") Float f12, @k Continuation<? super TypedResult<UniversalMapPointsRectResult>> continuation);

    @J81.k({"X-Geo-required: true"})
    @f
    @k
    z<TypedResult<uG0.d>> d(@y @k String path, @u @k Map<String, String> extraRequestParameters);

    @f
    @k
    z<TypedResult<C48896b>> e(@y @k String path, @u @k Map<String, String> checkedFilters, @u @k Map<String, String> extraParameters);

    @f
    @l
    Object f(@y @k String str, @u @k Map<String, String> map, @u @k Map<String, String> map2, @k Continuation<? super TypedResult<C48897c>> continuation);

    @J81.k({"X-Geo-required: true"})
    @f
    @l
    Object g(@y @k String str, @u @k Map<String, String> map, @k Continuation<? super TypedResult<uG0.d>> continuation);

    @f
    @l
    Object h(@y @k String str, @u @k Map<String, String> map, @u @k Map<String, String> map2, @k Continuation<? super TypedResult<C48896b>> continuation);
}
