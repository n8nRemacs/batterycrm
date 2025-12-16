package com.avito.android.inline_filters.dialog.location_group;

import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: LocationGroupFilterView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class F extends kotlin.jvm.internal.H implements Y41.p<Integer, InlineFilterValue, G0> {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // Y41.p
    public final G0 invoke(Integer num, InlineFilterValue inlineFilterValue) {
        int iIntValue = num.intValue();
        H h12 = (H) this.receiver;
        h12.f171686o.accept(new Q<>(h12.f171682k.get(iIntValue), inlineFilterValue));
        return G0.f406611a;
    }
}
