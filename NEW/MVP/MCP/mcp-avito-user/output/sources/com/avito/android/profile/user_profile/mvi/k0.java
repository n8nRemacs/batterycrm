package com.avito.android.profile.user_profile.mvi;

import com.avito.android.profile.user_profile.cards.CardItem;
import kotlin.Metadata;

/* compiled from: UserProfileReducer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "cardItem", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "invoke", "(Lcom/avito/android/profile/user_profile/cards/CardItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class k0 extends kotlin.jvm.internal.N implements Y41.l<CardItem, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final k0 f226501l = new k0();

    public k0() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(CardItem cardItem) {
        CardItem cardItem2 = cardItem;
        return Boolean.valueOf((cardItem2 instanceof CardItem.WalletCardItem) || (cardItem2 instanceof CardItem.SeparateWalletCardItem) || (cardItem2 instanceof CardItem.AvitoFinanceSimpleCardItem) || (cardItem2 instanceof CardItem.AvitoFinanceSplitBonusesCardItem) || (cardItem2 instanceof CardItem.AvitoFinanceSplitInstallmentsCardItem));
    }
}
