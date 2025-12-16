package com.avito.android.blueprints.selector_card_group_bottom_sheet;

import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import com.avito.android.lib.design.selector_card.SelectorCardItemState;
import com.avito.android.lib.design.selector_card.r;
import kotlin.Metadata;

/* compiled from: SelectorCardGroupBottomSheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/selector_card_group_bottom_sheet/b;", "Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements SelectorCardGroup.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f106679a;

    public b(d dVar) {
        this.f106679a = dVar;
    }

    @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
    public final void b(@Y61.k r rVar) {
        d dVar = this.f106679a;
        dVar.f106685I = (j) rVar;
        SelectorCardGroup selectorCardGroup = dVar.f106683G;
        if (selectorCardGroup == null) {
            selectorCardGroup = null;
        }
        selectorCardGroup.f(SelectorCardItemState.Normal.f180358b);
    }

    @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
    public final void a(@Y61.k r rVar) {
    }
}
