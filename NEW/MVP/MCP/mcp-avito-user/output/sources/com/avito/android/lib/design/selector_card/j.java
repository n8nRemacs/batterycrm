package com.avito.android.lib.design.selector_card;

import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: SelectorCardGroup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class j extends H implements Y41.p<Integer, Boolean, G0> {
    @Override // Y41.p
    public final G0 invoke(Integer num, Boolean bool) {
        SelectorCardGroup.c cVar;
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        SelectorCardGroup selectorCardGroup = (SelectorCardGroup) this.receiver;
        e eVar = selectorCardGroup.f180349f;
        if (eVar != null) {
            eVar.notifyItemChanged(iIntValue, Boolean.TRUE);
            if (zBooleanValue && (cVar = selectorCardGroup.selectedListener) != null) {
                cVar.b(((s) eVar.f180410n.get(iIntValue)).f180422a);
            }
        }
        return G0.f406611a;
    }
}
