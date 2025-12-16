package com.avito.android.blueprints.selector_card_group_bottom_sheet;

import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import com.avito.android.lib.design.selector_card.SelectorCardItemState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectorCardGroupBottomSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f106680l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f106680l = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f106680l;
        dVar.f106685I = null;
        SelectorCardGroup selectorCardGroup = dVar.f106683G;
        if (selectorCardGroup == null) {
            selectorCardGroup = null;
        }
        selectorCardGroup.f(SelectorCardItemState.Normal.f180358b);
        SelectorCardGroup selectorCardGroup2 = dVar.f106683G;
        (selectorCardGroup2 != null ? selectorCardGroup2 : null).b();
        return G0.f406611a;
    }
}
