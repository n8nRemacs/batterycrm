package M20;

import J81.e;
import J81.o;
import P20.d;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import e30.InterfaceC39936a;
import e30.InterfaceC39937b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: MultiGeoApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LM20/a;", "", "", AddressParameter.Value.JSON_WEB_TOKEN, "", "addressId", "Lcom/avito/android/remote/model/TypedResult;", "LP20/d;", "a", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes15.dex */
public interface a {
    @o("1/sellerx/address/delete")
    @e
    @InterfaceC39937b
    @l
    Object a(@J81.c(AddressParameter.Value.JSON_WEB_TOKEN) @k String str, @J81.c("addressId") int i12, @k Continuation<? super TypedResult<d>> continuation);
}
