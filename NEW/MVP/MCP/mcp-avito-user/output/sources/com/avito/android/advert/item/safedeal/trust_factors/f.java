package com.avito.android.advert.item.safedeal.trust_factors;

import androidx.compose.runtime.internal.P;
import com.avito.android.J0;
import com.avito.android.advert.item.safedeal.trust_factors.badge_bar.TrustFactorsBadgeBarItem;
import com.avito.android.advert.item.safedeal.trust_factors.button.TrustFactorsButtonItem;
import com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.CombinedButtonsItem;
import com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.FreeDeliveryBlock;
import com.avito.android.advert.item.safedeal.trust_factors.discount_voucher.TrustFactorsVoucherItem;
import com.avito.android.advert.item.safedeal.trust_factors.expandable_list_item.TrustFactorsExpandableListItemItem;
import com.avito.android.advert.item.safedeal.trust_factors.header.TrustFactorsHeaderItem;
import com.avito.android.advert.item.safedeal.trust_factors.list_item.TrustFactorsListItemItem;
import com.avito.android.advert.item.safedeal.trust_factors.spacing.TrustFactorsSpacingItem;
import com.avito.android.advert.item.safedeal.trust_factors.text.TrustFactorsTextItem;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.delivery_combined_buttons_public.CombinedButtonsData;
import com.avito.android.remote.safedeal.SafeDeal;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: TrustFactorsComponentsMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/f;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f79147a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final J0 f79148b;

    @Inject
    public f(@Y61.k J0 j02, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f79147a = jVar;
        this.f79148b = j02;
    }

    public final String a(TrustFactorsComponent trustFactorsComponent) {
        String f84275c = trustFactorsComponent.getF84275c();
        return f84275c != null ? f84275c : trustFactorsComponent instanceof TrustFactorsComponent.ExpandableListItem ? ((TrustFactorsComponent.ExpandableListItem) trustFactorsComponent).f84262b.getTitle().getText() : trustFactorsComponent instanceof TrustFactorsComponent.Text ? ((TrustFactorsComponent.Text) trustFactorsComponent).f84272b.getAttributedText().getText() : trustFactorsComponent instanceof TrustFactorsComponent.ListItem ? ((TrustFactorsComponent.ListItem) trustFactorsComponent).f84266b.getTitle().getText() : trustFactorsComponent instanceof TrustFactorsComponent.Header ? ((TrustFactorsComponent.Header) trustFactorsComponent).f84264b.getTitle().getText() : trustFactorsComponent instanceof TrustFactorsComponent.BadgeBar ? ((TrustFactorsComponent.BadgeBar) trustFactorsComponent).f84255b.getTitle() : trustFactorsComponent instanceof TrustFactorsComponent.Voucher ? ((TrustFactorsComponent.Voucher) trustFactorsComponent).f84274b.getTitle().getText() : String.valueOf(this.f79148b.a());
    }

    @Y61.l
    public final TrustFactorsItem b(@Y61.k TrustFactorsComponent trustFactorsComponent) {
        FreeDeliveryBlock freeDeliveryBlock;
        int iA2 = this.f79147a.a();
        if (trustFactorsComponent instanceof TrustFactorsComponent.Button) {
            return new TrustFactorsButtonItem(a(trustFactorsComponent), (TrustFactorsComponent.Button) trustFactorsComponent, iA2, null, null, null, 56, null);
        }
        if (trustFactorsComponent instanceof TrustFactorsComponent.CombinedButtons) {
            String str = ((TrustFactorsComponent.CombinedButtons) trustFactorsComponent).f84261d;
            if (str == null) {
                str = "ITEM_DELIVERY_COMBINED_BUTTONS";
            }
            String str2 = str;
            SafeDeal.Component.CombinedButtons combinedButtons = ((TrustFactorsComponent.CombinedButtons) trustFactorsComponent).f84259b;
            CombinedButtonsData combinedButtonsDataA = R9.a.a(combinedButtons);
            SafeDeal.Component.CombinedButtons.FreeDeliveryBlock freeDeliveryBlock2 = combinedButtons.getFreeDeliveryBlock();
            if (freeDeliveryBlock2 != null) {
                String text = freeDeliveryBlock2.getText();
                boolean isRequested = freeDeliveryBlock2.getIsRequested();
                Boolean isLoading = freeDeliveryBlock2.getIsLoading();
                freeDeliveryBlock = new FreeDeliveryBlock(text, isRequested, isLoading != null ? isLoading.booleanValue() : false);
            } else {
                freeDeliveryBlock = null;
            }
            return new CombinedButtonsItem(str2, combinedButtonsDataA, freeDeliveryBlock, null, iA2, null, null, 104, null);
        }
        if (trustFactorsComponent instanceof TrustFactorsComponent.ExpandableListItem) {
            return new TrustFactorsExpandableListItemItem(a(trustFactorsComponent), (TrustFactorsComponent.ExpandableListItem) trustFactorsComponent, iA2, null, null, null, 56, null);
        }
        if (trustFactorsComponent instanceof TrustFactorsComponent.Header) {
            return new TrustFactorsHeaderItem(a(trustFactorsComponent), (TrustFactorsComponent.Header) trustFactorsComponent, iA2, null, null, null, 56, null);
        }
        if (trustFactorsComponent instanceof TrustFactorsComponent.ListItem) {
            return new TrustFactorsListItemItem(a(trustFactorsComponent), (TrustFactorsComponent.ListItem) trustFactorsComponent, iA2, null, null, null, 56, null);
        }
        if (trustFactorsComponent instanceof TrustFactorsComponent.Spacing) {
            return new TrustFactorsSpacingItem(a(trustFactorsComponent), (TrustFactorsComponent.Spacing) trustFactorsComponent, iA2, null, null, null, 56, null);
        }
        if (trustFactorsComponent instanceof TrustFactorsComponent.Text) {
            return new TrustFactorsTextItem(a(trustFactorsComponent), (TrustFactorsComponent.Text) trustFactorsComponent, iA2, null, null, null, 56, null);
        }
        if (trustFactorsComponent instanceof TrustFactorsComponent.BadgeBar) {
            return new TrustFactorsBadgeBarItem(a(trustFactorsComponent), iA2, (TrustFactorsComponent.BadgeBar) trustFactorsComponent, null, null, null, 56, null);
        }
        if (trustFactorsComponent instanceof TrustFactorsComponent.Voucher) {
            return new TrustFactorsVoucherItem(a(trustFactorsComponent), iA2, (TrustFactorsComponent.Voucher) trustFactorsComponent, null, null, null, 56, null);
        }
        if (trustFactorsComponent instanceof TrustFactorsComponent.SplitText) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
