package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin.common.container.card_item.BeduinCardItemContainerModel;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinCardItemTypeAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinCardItemTypeAdapter;", "", "()V", "SelectionDisplayTypeAdapter", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinCardItemTypeAdapter {

    /* compiled from: BeduinCardItemTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinCardItemTypeAdapter$SelectionDisplayTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$SelectionDisplayType;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectionDisplayTypeAdapter extends RuntimeTypeAdapter<BeduinCardItemContainerModel.SelectionDisplayType> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Object f104036a;

        public SelectionDisplayTypeAdapter() {
            this(null, null, 3, null);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.beduin.common.container.card_item.BeduinCardItemContainerModel$SelectionDisplayType>>] */
        @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
        @k
        public final Map<String, Class<? extends BeduinCardItemContainerModel.SelectionDisplayType>> getMapping() {
            return this.f104036a;
        }

        public SelectionDisplayTypeAdapter(String str, String str2, int i12, C42822w c42822w) {
            super((i12 & 1) != 0 ? "type" : str, (i12 & 2) != 0 ? "params" : str2, null, 4, null);
            this.f104036a = P0.g(new Q("border", BeduinCardItemContainerModel.SelectionDisplayType.Border.class), new Q("borderAndMark", BeduinCardItemContainerModel.SelectionDisplayType.BorderAndMark.class));
        }
    }

    static {
        new BeduinCardItemTypeAdapter();
    }
}
