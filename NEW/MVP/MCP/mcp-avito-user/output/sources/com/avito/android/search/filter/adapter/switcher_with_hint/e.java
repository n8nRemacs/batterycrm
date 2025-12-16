package com.avito.android.search.filter.adapter.switcher_with_hint;

import Y41.l;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.search.filter.converter.common.SwitcherWithHintItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SwitcherWithHintItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", BeduinCartItemModel.CHECKED_STRING, "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SwitcherWithHintItem f262621l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f262622m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SwitcherWithHintItem switcherWithHintItem, g gVar) {
        super(1);
        this.f262621l = switcherWithHintItem;
        this.f262622m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        SwitcherWithHintItem switcherWithHintItem = this.f262621l;
        this.f262622m.f262625c.accept(new SwitcherWithHintItem(switcherWithHintItem.f262943b, switcherWithHintItem.f262944c, zBooleanValue, switcherWithHintItem.f262946e, switcherWithHintItem.f262947f, switcherWithHintItem.f262948g, switcherWithHintItem.f262949h, switcherWithHintItem.f262950i));
        return G0.f406611a;
    }
}
