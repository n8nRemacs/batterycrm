package com.avito.android.lib.design.selector_card;

import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: SelectorCardGroup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class n extends H implements Y41.l<Integer, G0> {
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        SelectorCardGroup.a aVar;
        int iIntValue = num.intValue();
        SelectorCardGroup selectorCardGroup = (SelectorCardGroup) this.receiver;
        e eVar = selectorCardGroup.f180349f;
        if (eVar != null && (aVar = selectorCardGroup.reselectedListener) != null) {
            aVar.a(((s) eVar.f180410n.get(iIntValue)).f180422a);
        }
        return G0.f406611a;
    }
}
