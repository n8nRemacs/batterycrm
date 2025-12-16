package com.avito.android.important_addresses_selection.data;

import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.important_addresses_selection.data.model.ImportantAddressesData;
import com.avito.android.important_addresses_selection.data.model.ImportantAddressesSelectionFormResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ImportantAddressesSelectionApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/a;", "", "", "xGeoSession", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "params", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData;", "b", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes14.dex */
public interface a {
    @J81.f("1/infra/addresses/list")
    @l
    Object a(@t("geoSessionId") @k String str, @k Continuation<? super TypedResult<ImportantAddressesSelectionFormResponse>> continuation);

    @o("1/infra/addresses/important/mark")
    @J81.e
    @l
    Object b(@J81.d @k Map<String, String> map, @J81.c("geoSessionId") @k String str, @k Continuation<? super TypedResult<ImportantAddressesData>> continuation);
}
