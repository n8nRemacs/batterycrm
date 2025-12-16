package LM;

import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.important_addresses_selection.data.model.ImportantAddressesData;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ImportantAddressesApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LLM/a;", "", "", "xGeoSession", "itemId", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes14.dex */
public interface a {
    @J81.f("1/infra/addresses/important/list")
    @l
    Object a(@t("geoSessionId") @k String str, @t("itemId") @k String str2, @k Continuation<? super TypedResult<ImportantAddressesData>> continuation);
}
