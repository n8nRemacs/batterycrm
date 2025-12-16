package com.avito.android.search.filter.converter.util;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search.filter.converter.common.ItemWithState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ParametersListChangePayloadCreator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/util/l;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final ItemWithState.State f262993a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final hJ.m f262994b;

    public l(@Y61.l ItemWithState.State state, @Y61.l String str, @Y61.l hJ.m mVar) {
        this.f262993a = state;
        this.f262994b = mVar;
    }

    public /* synthetic */ l(ItemWithState.State state, String str, hJ.m mVar, AttributedText attributedText, int i12, C42822w c42822w) {
        this(state, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : mVar);
    }
}
