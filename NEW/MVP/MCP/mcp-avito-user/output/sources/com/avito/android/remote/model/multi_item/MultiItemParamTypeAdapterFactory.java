package com.avito.android.remote.model.multi_item;

import Y61.k;
import com.avito.android.remote.model.multi_item.MultiItemParamUnited;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import kotlin.Metadata;

/* compiled from: MultiItemParamTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/multi_item/MultiItemParamTypeAdapterFactory;", "", "()V", "create", "Lcom/avito/android/remote/parse/adapter/stream_gson/OptimalRuntimeTypeAdapterFactory;", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MultiItemParamTypeAdapterFactory {

    @k
    public static final MultiItemParamTypeAdapterFactory INSTANCE = new MultiItemParamTypeAdapterFactory();

    private MultiItemParamTypeAdapterFactory() {
    }

    @k
    public final OptimalRuntimeTypeAdapterFactory<MultiItemParamUnited> create() {
        OptimalRuntimeTypeAdapterFactory<MultiItemParamUnited> optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, MultiItemParamUnited.class);
        optimalRuntimeTypeAdapterFactoryA.b(MultiItemParamUnited.MultiItemParam.Images.class, "images");
        optimalRuntimeTypeAdapterFactoryA.b(MultiItemParamUnited.MultiItemParam.Chips.class, "chips");
        optimalRuntimeTypeAdapterFactoryA.b(MultiItemParamUnited.MultiItemParam.Parameters.class, "params");
        return optimalRuntimeTypeAdapterFactoryA;
    }
}
