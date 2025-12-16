package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin_shared.model.action.custom.openItemsList.AdditionalData;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ItemListAdditionalDataTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/network/parse/ItemListAdditionalDataTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/beduin_shared/model/action/custom/openItemsList/AdditionalData;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemListAdditionalDataTypeAdapter extends RuntimeTypeAdapter<AdditionalData> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<String, Type> f104048a;

    public ItemListAdditionalDataTypeAdapter() {
        super(null, null, null, 7, null);
        this.f104048a = Collections.singletonMap("priceDescription", AdditionalData.PriceDescription.class);
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Type> getMapping() {
        return this.f104048a;
    }
}
