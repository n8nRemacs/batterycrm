package com.avito.android.item_price_history.presentation;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.notifications_settings.deep_linking.ProfileNotificationsLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemPriceHistoryDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ItemPriceHistoryDialogFragment f173722l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment) {
        super(0);
        this.f173722l = itemPriceHistoryDialogFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f173722l.f173692m0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, new ProfileNotificationsLink(), null, null, 6);
        return G0.f406611a;
    }
}
