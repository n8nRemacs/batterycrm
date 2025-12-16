package com.avito.android.lib.design.selector_card;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: SelectorCardGroup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class l extends H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        e eVar = ((SelectorCardGroup) this.receiver).f180349f;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
        return G0.f406611a;
    }
}
