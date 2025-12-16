package uW;

import J81.f;
import J81.t;
import J81.u;
import Y61.k;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39937b;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import kotlin.Metadata;
import uF.h;
import yW.AbstractC50188a;

/* compiled from: RadiusApi.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ1\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u00052\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LuW/a;", "", "", "radiusId", "categoryId", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "LuF/h$c;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "", "searchParams", "LyW/a$c;", "b", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: uW.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC48983a {
    @f("1/search/parameters/radius/values")
    @InterfaceC39937b
    @k
    z<TypedResult<h.c>> a(@t("selectedValue") @k String radiusId, @t("categoryId") @k String categoryId);

    @f("1/items/count")
    @InterfaceC39937b
    @k
    z<TypedResult<AbstractC50188a.c>> b(@u @k Map<String, String> searchParams);
}
