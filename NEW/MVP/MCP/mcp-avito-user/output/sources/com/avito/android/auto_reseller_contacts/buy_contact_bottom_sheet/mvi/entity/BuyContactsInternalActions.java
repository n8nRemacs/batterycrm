package com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.data.BuyContactOpenParams;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BuyContactsInternalActions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/mvi/entity/BuyContactsInternalActions;", "Lcom/avito/android/analytics/screens/mvi/n;", "DeeplinkClicked", "ShowInitialData", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BuyContactsInternalActions extends n {

    /* compiled from: BuyContactsInternalActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/mvi/entity/BuyContactsInternalActions$DeeplinkClicked;", "Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/mvi/entity/BuyContactsInternalActions;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeeplinkClicked implements BuyContactsInternalActions {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f95722b;

        public DeeplinkClicked(@k DeepLink deepLink) {
            this.f95722b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeeplinkClicked) && L.f(this.f95722b, ((DeeplinkClicked) obj).f95722b);
        }

        public final int hashCode() {
            return this.f95722b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("DeeplinkClicked(uri="), this.f95722b, ')');
        }
    }

    /* compiled from: BuyContactsInternalActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/mvi/entity/BuyContactsInternalActions$ShowInitialData;", "Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/mvi/entity/BuyContactsInternalActions;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowInitialData implements BuyContactsInternalActions {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BuyContactOpenParams f95723b;

        public ShowInitialData(@k BuyContactOpenParams buyContactOpenParams) {
            this.f95723b = buyContactOpenParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowInitialData) && L.f(this.f95723b, ((ShowInitialData) obj).f95723b);
        }

        public final int hashCode() {
            return this.f95723b.f95706b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowInitialData(data=" + this.f95723b + ')';
        }
    }
}
