package com.avito.android.campaigns_sale;

import com.avito.android.campaigns_sale.beduin.custom_actions.BeduinSetChosenItemsAction;
import im.InterfaceC41424a;
import kotlin.Metadata;

/* compiled from: CampaignsSaleViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/beduin/custom_actions/BeduinSetChosenItemsAction;", "action", "Lkotlin/G0;", "accept", "(Lcom/avito/android/campaigns_sale/beduin/custom_actions/BeduinSetChosenItemsAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class C<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f113811b;

    public C(E e12) {
        this.f113811b = e12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        BeduinSetChosenItemsAction beduinSetChosenItemsAction = (BeduinSetChosenItemsAction) obj;
        this.f113811b.accept(new InterfaceC41424a.u(beduinSetChosenItemsAction.getBlockId(), beduinSetChosenItemsAction.getItemIds()));
    }
}
