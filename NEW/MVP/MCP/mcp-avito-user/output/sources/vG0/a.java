package VG0;

import J81.f;
import J81.k;
import J81.t;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: UserAddressApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LVG0/a;", "", "", "lat", AddressParameter.Value.LNG, "", "verticalId", "Lcom/avito/android/remote/model/TypedResult;", "LWG0/a;", "a", "(DDLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes4.dex */
public interface a {
    @f("1/seller/address/validate")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@t("lat") double d12, @t(AddressParameter.Value.LNG) double d13, @l @t("verticalId") Long l12, @Y61.k Continuation<? super TypedResult<WG0.a>> continuation);
}
