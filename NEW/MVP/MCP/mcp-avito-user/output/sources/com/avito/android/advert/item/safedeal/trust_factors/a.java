package com.avito.android.advert.item.safedeal.trust_factors;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.remote.safedeal.SafeDeal;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SafeDealComponentsMapper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {
    @Inject
    public a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static TrustFactorsComponent a(@Y61.k SafeDeal.Component component) {
        int i12 = 2;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        if (component instanceof SafeDeal.Component.Button) {
            return new TrustFactorsComponent.Button((SafeDeal.Component.Button) component, str, i12, objArr17 == true ? 1 : 0);
        }
        if (component instanceof SafeDeal.Component.CombinedButtons) {
            SafeDeal.Component.CombinedButtons combinedButtons = (SafeDeal.Component.CombinedButtons) component;
            return new TrustFactorsComponent.CombinedButtons(combinedButtons, combinedButtons.getWidthStrategy(), null, 4, null);
        }
        if (component instanceof SafeDeal.Component.ExpandableListItem) {
            return new TrustFactorsComponent.ExpandableListItem((SafeDeal.Component.ExpandableListItem) component, objArr16 == true ? 1 : 0, i12, objArr15 == true ? 1 : 0);
        }
        if (component instanceof SafeDeal.Component.Header) {
            return new TrustFactorsComponent.Header((SafeDeal.Component.Header) component, objArr14 == true ? 1 : 0, i12, objArr13 == true ? 1 : 0);
        }
        if (component instanceof SafeDeal.Component.ListItem) {
            return new TrustFactorsComponent.ListItem((SafeDeal.Component.ListItem) component, objArr12 == true ? 1 : 0, i12, objArr11 == true ? 1 : 0);
        }
        if (component instanceof SafeDeal.Component.Spacing) {
            return new TrustFactorsComponent.Spacing((SafeDeal.Component.Spacing) component, objArr10 == true ? 1 : 0, i12, objArr9 == true ? 1 : 0);
        }
        if (component instanceof SafeDeal.Component.Text) {
            return new TrustFactorsComponent.Text((SafeDeal.Component.Text) component, objArr8 == true ? 1 : 0, i12, objArr7 == true ? 1 : 0);
        }
        if (component instanceof SafeDeal.Component.SplitText) {
            return new TrustFactorsComponent.SplitText((SafeDeal.Component.SplitText) component, objArr6 == true ? 1 : 0, i12, objArr5 == true ? 1 : 0);
        }
        if (component instanceof SafeDeal.Component.BadgeBar) {
            return new TrustFactorsComponent.BadgeBar((SafeDeal.Component.BadgeBar) component, objArr4 == true ? 1 : 0, i12, objArr3 == true ? 1 : 0);
        }
        if (component instanceof SafeDeal.Component.Voucher) {
            return new TrustFactorsComponent.Voucher((SafeDeal.Component.Voucher) component, objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
        }
        throw new NoWhenBranchMatchedException();
    }
}
