package com.avito.android.profile.user_profile.cards;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.common.C23088b;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.util.groupable_item.GroupingOutput;
import com.avito.android.profile.user_profile.analytics.ProfileWidgetClickEvent;
import com.avito.android.profile.user_profile.cards.passport.DeliveryRestrictionCard;
import com.avito.android.profile.user_profile.cards.passport.ReputationAndRatingCard;
import com.avito.android.profile.user_profile.cards.recommendations.item.RecommendationSnippetItem;
import com.avito.android.promoblock.TnsPromoBlockItem;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Avatar;
import com.avito.android.remote.model.AvitoFinanceBaseCard;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.ProfileRating;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.social.SocialNetwork;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.user_profile.Device;
import com.avito.android.remote.model.user_profile.Phone;
import com.avito.android.remote.model.user_profile.SeparateBalance;
import com.avito.android.remote.model.user_profile.Support;
import com.avito.android.remote.model.user_profile.items.AddressAction;
import com.avito.android.remote.model.user_profile.items.AddressDescription;
import com.avito.android.remote.model.user_profile.items.AddressIcon;
import com.avito.android.remote.model.user_profile.items.AdvertsItem;
import com.avito.android.remote.model.user_profile.items.Banner;
import com.avito.android.remote.model.user_profile.items.ExtensionsItem;
import com.avito.android.remote.model.user_profile.items.ProfileJobMenuItem;
import com.avito.android.remote.model.user_profile.items.PromoBanner;
import com.avito.android.remote.model.user_profile.items.PromotionsItem;
import com.avito.android.remote.model.user_profile.items.ServiceBookingItem;
import com.avito.android.remote.model.user_profile.items.ServicesSellerSubscriptionItem;
import com.avito.android.remote.model.user_profile.items.SuggestedAddress;
import com.avito.android.service.short_task.ShortTask;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CardItem.kt */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:A\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@AB\u0082\u0001ACDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001¨\u0006\u0082\u0001"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "ActionCardItem", "ActiveOrdersWidgetCardItem", "AddressCardItem", "AdvertsCardItem", "AutoClickableCardItem", "AutoSubscribeItem", "AutotekaPurchaseDataCardItem", "AvitoFinanceDynamicCardItem", "AvitoFinanceSimpleCardItem", "AvitoFinanceSplitBonusesCardItem", "AvitoFinanceSplitInstallmentsCardItem", "AvitoProCardItem", "CallsCardItem", "CallsHistoryCardItem", "ClickableCardItem", "ComfortableDealCardItem", "ComfortableDealWithStatusCardItem", "ContactsCardItem", "EmptyAddressCardItem", "ExtensionsCardItem", "HelpCenterCardItem", "IncomeSettingsCardItem", "InfoCardItem", "LeasingEntryPointItem", "LogoutCardItem", "LoyaltyPreferencesCardItem", "MortgageAccountCardItem", "MortgageApplicationCardItem", "MyGarageCardItem", "NdTrxDealCabinetCardItem", "OrdersCardItem", "PassportCardItem", "PhonesCardItem", "PhonesEmptyCardItem", "PremierPartnerCardItem", "ProfileAuctionCardItem", "ProfileJobMenuCardItem", "ProfileManagementCardItem", "ProfileRemovalItem", "PromoBanner", "PromoBlockItem", "PromotionsCardItem", "RecommendationsItem", "ReferralCardItem", "ReviewsCardItem", "RewardsCardItem", "RfpCardItem", "SafeDealSettingsCardItem", "SafetyCardItem", "SbcDispatchesCardItem", "SeparateWalletCardItem", "ServiceBookingCardItem", "ServicesSellerSubscriptionCardItem", "SessionsCardItem", "SilentUpdateConfig", "SilentUpdateItem", "SilentUpdateSettings", "SimpleCardItem", "SocialCardItem", "SpecialMachineryRentalItem", "StrOrdersCardItem", "TariffCardItem", "VirtualDealRoomCardItem", "WalletCardItem", "WithButtonCardItem", "Lcom/avito/android/profile/user_profile/cards/CardItem$ActionCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ActiveOrdersWidgetCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$AddressCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$AdvertsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$AutoClickableCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$AutoSubscribeItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$AutotekaPurchaseDataCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$AvitoFinanceDynamicCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$AvitoFinanceSimpleCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$AvitoFinanceSplitBonusesCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$AvitoFinanceSplitInstallmentsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$AvitoProCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$CallsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$CallsHistoryCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ClickableCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ComfortableDealCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ComfortableDealWithStatusCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ContactsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$EmptyAddressCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ExtensionsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$HelpCenterCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$IncomeSettingsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$InfoCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$LeasingEntryPointItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$LogoutCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$LoyaltyPreferencesCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$MortgageAccountCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$MortgageApplicationCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$MyGarageCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$NdTrxDealCabinetCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$OrdersCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$PassportCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$PhonesCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$PhonesEmptyCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$PremierPartnerCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ProfileAuctionCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ProfileJobMenuCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ProfileManagementCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ProfileRemovalItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$PromoBanner;", "Lcom/avito/android/profile/user_profile/cards/CardItem$PromoBlockItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$PromotionsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$RecommendationsItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ReferralCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ReviewsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$RewardsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$RfpCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$SafeDealSettingsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$SafetyCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$SbcDispatchesCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$SeparateWalletCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ServiceBookingCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ServicesSellerSubscriptionCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$SessionsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$SilentUpdateItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$SimpleCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$SocialCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$SpecialMachineryRentalItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$StrOrdersCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$TariffCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$VirtualDealRoomCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$WalletCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem$WithButtonCardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class CardItem implements ParcelableItem {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f224291b;

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ActionCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ActionCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224292c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Action f224293d;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ActionCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ActionCardItem createFromParcel(Parcel parcel) {
                return new ActionCardItem(parcel.readString(), (Action) parcel.readParcelable(ActionCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ActionCardItem[] newArray(int i12) {
                return new ActionCardItem[i12];
            }
        }

        public ActionCardItem(@Y61.k String str, @Y61.k Action action) {
            super(str, null);
            this.f224292c = str;
            this.f224293d = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionCardItem)) {
                return false;
            }
            ActionCardItem actionCardItem = (ActionCardItem) obj;
            return L.f(this.f224292c, actionCardItem.f224292c) && L.f(this.f224293d, actionCardItem.f224293d);
        }

        public final int hashCode() {
            return this.f224293d.hashCode() + (this.f224292c.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ActionCardItem(itemId=" + this.f224292c + ", action=" + this.f224293d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224292c);
            parcel.writeParcelable(this.f224293d, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ActiveOrdersWidgetCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActiveOrdersWidgetCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ActiveOrdersWidgetCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224294c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f224295d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224296e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final DeepLink f224297f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final DeepLink f224298g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final Object f224299h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f224300i;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ActiveOrdersWidgetCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ActiveOrdersWidgetCardItem createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(ActiveOrdersWidgetCardItem.class.getClassLoader());
                DeepLink deepLink2 = (DeepLink) parcel.readParcelable(ActiveOrdersWidgetCardItem.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ActiveOrdersWidgetCardItem.class, parcel, arrayList, iL2, 1);
                }
                return new ActiveOrdersWidgetCardItem(string, string2, string3, deepLink, deepLink2, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActiveOrdersWidgetCardItem[] newArray(int i12) {
                return new ActiveOrdersWidgetCardItem[i12];
            }
        }

        public ActiveOrdersWidgetCardItem(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l DeepLink deepLink, @Y61.l DeepLink deepLink2, @Y61.k List<? extends ParcelableItem> list, @Y61.l String str4) {
            super(str, null);
            this.f224294c = str;
            this.f224295d = str2;
            this.f224296e = str3;
            this.f224297f = deepLink;
            this.f224298g = deepLink2;
            this.f224299h = list;
            this.f224300i = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActiveOrdersWidgetCardItem)) {
                return false;
            }
            ActiveOrdersWidgetCardItem activeOrdersWidgetCardItem = (ActiveOrdersWidgetCardItem) obj;
            return L.f(this.f224294c, activeOrdersWidgetCardItem.f224294c) && L.f(this.f224295d, activeOrdersWidgetCardItem.f224295d) && L.f(this.f224296e, activeOrdersWidgetCardItem.f224296e) && L.f(this.f224297f, activeOrdersWidgetCardItem.f224297f) && L.f(this.f224298g, activeOrdersWidgetCardItem.f224298g) && L.f(this.f224299h, activeOrdersWidgetCardItem.f224299h) && L.f(this.f224300i, activeOrdersWidgetCardItem.f224300i);
        }

        public final int hashCode() {
            int iHashCode = this.f224294c.hashCode() * 31;
            String str = this.f224295d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f224296e;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.f224297f;
            int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            DeepLink deepLink2 = this.f224298g;
            int iA2 = C23088b.a((iHashCode4 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31, 31, this.f224299h);
            String str3 = this.f224300i;
            return iA2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActiveOrdersWidgetCardItem(itemId=");
            sb2.append(this.f224294c);
            sb2.append(", title=");
            sb2.append(this.f224295d);
            sb2.append(", badgeTitle=");
            sb2.append(this.f224296e);
            sb2.append(", onTapDeepLink=");
            sb2.append(this.f224297f);
            sb2.append(", onShowDeepLink=");
            sb2.append(this.f224298g);
            sb2.append(", items=");
            sb2.append(this.f224299h);
            sb2.append(", actionButtonText=");
            return C22026a.c(sb2, this.f224300i, ')');
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224294c);
            parcel.writeString(this.f224295d);
            parcel.writeString(this.f224296e);
            parcel.writeParcelable(this.f224297f, i12);
            parcel.writeParcelable(this.f224298g, i12);
            ?? r02 = this.f224299h;
            parcel.writeInt(r02.size());
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i12);
            }
            parcel.writeString(this.f224300i);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$AddressCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddressCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<AddressCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224301c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224302d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224303e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f224304f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final AddressIcon f224305g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final AddressDescription f224306h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final AddressAction f224307i;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AddressCardItem> {
            @Override // android.os.Parcelable.Creator
            public final AddressCardItem createFromParcel(Parcel parcel) {
                return new AddressCardItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AddressIcon) parcel.readParcelable(AddressCardItem.class.getClassLoader()), (AddressDescription) parcel.readParcelable(AddressCardItem.class.getClassLoader()), (AddressAction) parcel.readParcelable(AddressCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AddressCardItem[] newArray(int i12) {
                return new AddressCardItem[i12];
            }
        }

        public AddressCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.k AddressIcon addressIcon, @Y61.k AddressDescription addressDescription, @Y61.k AddressAction addressAction) {
            super(str, null);
            this.f224301c = str;
            this.f224302d = str2;
            this.f224303e = str3;
            this.f224304f = str4;
            this.f224305g = addressIcon;
            this.f224306h = addressDescription;
            this.f224307i = addressAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressCardItem)) {
                return false;
            }
            AddressCardItem addressCardItem = (AddressCardItem) obj;
            return L.f(this.f224301c, addressCardItem.f224301c) && L.f(this.f224302d, addressCardItem.f224302d) && L.f(this.f224303e, addressCardItem.f224303e) && L.f(this.f224304f, addressCardItem.f224304f) && L.f(this.f224305g, addressCardItem.f224305g) && L.f(this.f224306h, addressCardItem.f224306h) && L.f(this.f224307i, addressCardItem.f224307i);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f224301c.hashCode() * 31, 31, this.f224302d), 31, this.f224303e);
            String str = this.f224304f;
            return this.f224307i.hashCode() + ((this.f224306h.hashCode() + ((this.f224305g.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "AddressCardItem(itemId=" + this.f224301c + ", geosessionId=" + this.f224302d + ", title=" + this.f224303e + ", kind=" + this.f224304f + ", icon=" + this.f224305g + ", description=" + this.f224306h + ", action=" + this.f224307i + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224301c);
            parcel.writeString(this.f224302d);
            parcel.writeString(this.f224303e);
            parcel.writeString(this.f224304f);
            parcel.writeParcelable(this.f224305g, i12);
            parcel.writeParcelable(this.f224306h, i12);
            parcel.writeParcelable(this.f224307i, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$AdvertsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertsCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<AdvertsCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224308c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final AdvertsItem.StatusItem f224309d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final AdvertsItem.StatusItem f224310e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final AdvertsItem.StatusItem f224311f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdvertsCardItem> {
            @Override // android.os.Parcelable.Creator
            public final AdvertsCardItem createFromParcel(Parcel parcel) {
                return new AdvertsCardItem(parcel.readString(), (AdvertsItem.StatusItem) parcel.readParcelable(AdvertsCardItem.class.getClassLoader()), (AdvertsItem.StatusItem) parcel.readParcelable(AdvertsCardItem.class.getClassLoader()), (AdvertsItem.StatusItem) parcel.readParcelable(AdvertsCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AdvertsCardItem[] newArray(int i12) {
                return new AdvertsCardItem[i12];
            }
        }

        public AdvertsCardItem(@Y61.k String str, @Y61.k AdvertsItem.StatusItem statusItem, @Y61.l AdvertsItem.StatusItem statusItem2, @Y61.l AdvertsItem.StatusItem statusItem3) {
            super(str, null);
            this.f224308c = str;
            this.f224309d = statusItem;
            this.f224310e = statusItem2;
            this.f224311f = statusItem3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertsCardItem)) {
                return false;
            }
            AdvertsCardItem advertsCardItem = (AdvertsCardItem) obj;
            return L.f(this.f224308c, advertsCardItem.f224308c) && L.f(this.f224309d, advertsCardItem.f224309d) && L.f(this.f224310e, advertsCardItem.f224310e) && L.f(this.f224311f, advertsCardItem.f224311f);
        }

        public final int hashCode() {
            int iHashCode = (this.f224309d.hashCode() + (this.f224308c.hashCode() * 31)) * 31;
            AdvertsItem.StatusItem statusItem = this.f224310e;
            int iHashCode2 = (iHashCode + (statusItem == null ? 0 : statusItem.hashCode())) * 31;
            AdvertsItem.StatusItem statusItem2 = this.f224311f;
            return iHashCode2 + (statusItem2 != null ? statusItem2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "AdvertsCardItem(itemId=" + this.f224308c + ", active=" + this.f224309d + ", inactive=" + this.f224310e + ", rejected=" + this.f224311f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224308c);
            parcel.writeParcelable(this.f224309d, i12);
            parcel.writeParcelable(this.f224310e, i12);
            parcel.writeParcelable(this.f224311f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$AutoClickableCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AutoClickableCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<AutoClickableCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224312c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224313d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224314e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f224315f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224316g;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AutoClickableCardItem> {
            @Override // android.os.Parcelable.Creator
            public final AutoClickableCardItem createFromParcel(Parcel parcel) {
                return new AutoClickableCardItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AutoClickableCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AutoClickableCardItem[] newArray(int i12) {
                return new AutoClickableCardItem[i12];
            }
        }

        public AutoClickableCardItem(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224312c = str;
            this.f224313d = str2;
            this.f224314e = str3;
            this.f224315f = str4;
            this.f224316g = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoClickableCardItem)) {
                return false;
            }
            AutoClickableCardItem autoClickableCardItem = (AutoClickableCardItem) obj;
            return L.f(this.f224312c, autoClickableCardItem.f224312c) && L.f(this.f224313d, autoClickableCardItem.f224313d) && L.f(this.f224314e, autoClickableCardItem.f224314e) && L.f(this.f224315f, autoClickableCardItem.f224315f) && L.f(this.f224316g, autoClickableCardItem.f224316g);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224312c.hashCode() * 31, 31, this.f224313d);
            String str = this.f224314e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f224315f;
            return this.f224316g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AutoClickableCardItem(itemId=");
            sb2.append(this.f224312c);
            sb2.append(", title=");
            sb2.append(this.f224313d);
            sb2.append(", subtitle=");
            sb2.append(this.f224314e);
            sb2.append(", badge=");
            sb2.append(this.f224315f);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224316g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224312c);
            parcel.writeString(this.f224313d);
            parcel.writeString(this.f224314e);
            parcel.writeString(this.f224315f);
            parcel.writeParcelable(this.f224316g, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$AutoSubscribeItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AutoSubscribeItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<AutoSubscribeItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224317c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224318d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224319e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f224320f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224321g;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AutoSubscribeItem> {
            @Override // android.os.Parcelable.Creator
            public final AutoSubscribeItem createFromParcel(Parcel parcel) {
                return new AutoSubscribeItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AutoSubscribeItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AutoSubscribeItem[] newArray(int i12) {
                return new AutoSubscribeItem[i12];
            }
        }

        public AutoSubscribeItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224317c = str;
            this.f224318d = str2;
            this.f224319e = str3;
            this.f224320f = str4;
            this.f224321g = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoSubscribeItem)) {
                return false;
            }
            AutoSubscribeItem autoSubscribeItem = (AutoSubscribeItem) obj;
            return L.f(this.f224317c, autoSubscribeItem.f224317c) && L.f(this.f224318d, autoSubscribeItem.f224318d) && L.f(this.f224319e, autoSubscribeItem.f224319e) && L.f(this.f224320f, autoSubscribeItem.f224320f) && L.f(this.f224321g, autoSubscribeItem.f224321g);
        }

        public final int hashCode() {
            return this.f224321g.hashCode() + H.d(H.d(H.d(this.f224317c.hashCode() * 31, 31, this.f224318d), 31, this.f224319e), 31, this.f224320f);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AutoSubscribeItem(itemId=");
            sb2.append(this.f224317c);
            sb2.append(", title=");
            sb2.append(this.f224318d);
            sb2.append(", badgeText=");
            sb2.append(this.f224319e);
            sb2.append(", description=");
            sb2.append(this.f224320f);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224321g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224317c);
            parcel.writeString(this.f224318d);
            parcel.writeString(this.f224319e);
            parcel.writeString(this.f224320f);
            parcel.writeParcelable(this.f224321g, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$AutotekaPurchaseDataCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AutotekaPurchaseDataCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<AutotekaPurchaseDataCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224322c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224323d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224324e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f224325f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224326g;

        /* renamed from: h, reason: collision with root package name */
        public final int f224327h;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AutotekaPurchaseDataCardItem> {
            @Override // android.os.Parcelable.Creator
            public final AutotekaPurchaseDataCardItem createFromParcel(Parcel parcel) {
                return new AutotekaPurchaseDataCardItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AutotekaPurchaseDataCardItem.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final AutotekaPurchaseDataCardItem[] newArray(int i12) {
                return new AutotekaPurchaseDataCardItem[i12];
            }
        }

        public AutotekaPurchaseDataCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k DeepLink deepLink, @InterfaceC42150f int i12) {
            super(str, null);
            this.f224322c = str;
            this.f224323d = str2;
            this.f224324e = str3;
            this.f224325f = str4;
            this.f224326g = deepLink;
            this.f224327h = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutotekaPurchaseDataCardItem)) {
                return false;
            }
            AutotekaPurchaseDataCardItem autotekaPurchaseDataCardItem = (AutotekaPurchaseDataCardItem) obj;
            return L.f(this.f224322c, autotekaPurchaseDataCardItem.f224322c) && L.f(this.f224323d, autotekaPurchaseDataCardItem.f224323d) && L.f(this.f224324e, autotekaPurchaseDataCardItem.f224324e) && L.f(this.f224325f, autotekaPurchaseDataCardItem.f224325f) && L.f(this.f224326g, autotekaPurchaseDataCardItem.f224326g) && this.f224327h == autotekaPurchaseDataCardItem.f224327h;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f224327h) + com.avito.android.actions_sheet.a.e(this.f224326g, H.d(H.d(H.d(this.f224322c.hashCode() * 31, 31, this.f224323d), 31, this.f224324e), 31, this.f224325f), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AutotekaPurchaseDataCardItem(itemId=");
            sb2.append(this.f224322c);
            sb2.append(", title=");
            sb2.append(this.f224323d);
            sb2.append(", subtitle=");
            sb2.append(this.f224324e);
            sb2.append(", actionTitle=");
            sb2.append(this.f224325f);
            sb2.append(", deepLink=");
            sb2.append(this.f224326g);
            sb2.append(", icon=");
            return r.t(sb2, this.f224327h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224322c);
            parcel.writeString(this.f224323d);
            parcel.writeString(this.f224324e);
            parcel.writeString(this.f224325f);
            parcel.writeParcelable(this.f224326g, i12);
            parcel.writeInt(this.f224327h);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$AvitoFinanceDynamicCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvitoFinanceDynamicCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<AvitoFinanceDynamicCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224328c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final ArrayList f224329d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final ArrayList f224330e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final ArrayList f224331f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AvitoFinanceDynamicCardItem> {
            @Override // android.os.Parcelable.Creator
            public final AvitoFinanceDynamicCardItem createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                String string = parcel.readString();
                ArrayList arrayList3 = null;
                int iL2 = 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        int i14 = parcel.readInt();
                        ArrayList arrayList4 = new ArrayList(i14);
                        int iL3 = 0;
                        while (iL3 != i14) {
                            iL3 = com.avito.android.actions_sheet.a.l(AvitoFinanceDynamicCardItem.class, parcel, arrayList4, iL3, 1);
                        }
                        arrayList.add(arrayList4);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i15 = parcel.readInt();
                    arrayList2 = new ArrayList(i15);
                    int iL4 = 0;
                    while (iL4 != i15) {
                        iL4 = com.avito.android.actions_sheet.a.l(AvitoFinanceDynamicCardItem.class, parcel, arrayList2, iL4, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    int i16 = parcel.readInt();
                    arrayList3 = new ArrayList(i16);
                    while (iL2 != i16) {
                        iL2 = com.avito.android.actions_sheet.a.l(AvitoFinanceDynamicCardItem.class, parcel, arrayList3, iL2, 1);
                    }
                }
                return new AvitoFinanceDynamicCardItem(string, arrayList, arrayList2, arrayList3);
            }

            @Override // android.os.Parcelable.Creator
            public final AvitoFinanceDynamicCardItem[] newArray(int i12) {
                return new AvitoFinanceDynamicCardItem[i12];
            }
        }

        public AvitoFinanceDynamicCardItem(@Y61.k String str, @Y61.l ArrayList arrayList, @Y61.l ArrayList arrayList2, @Y61.l ArrayList arrayList3) {
            super(str, null);
            this.f224328c = str;
            this.f224329d = arrayList;
            this.f224330e = arrayList2;
            this.f224331f = arrayList3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvitoFinanceDynamicCardItem)) {
                return false;
            }
            AvitoFinanceDynamicCardItem avitoFinanceDynamicCardItem = (AvitoFinanceDynamicCardItem) obj;
            return L.f(this.f224328c, avitoFinanceDynamicCardItem.f224328c) && L.f(this.f224329d, avitoFinanceDynamicCardItem.f224329d) && L.f(this.f224330e, avitoFinanceDynamicCardItem.f224330e) && L.f(this.f224331f, avitoFinanceDynamicCardItem.f224331f);
        }

        public final int hashCode() {
            int iHashCode = this.f224328c.hashCode() * 31;
            ArrayList arrayList = this.f224329d;
            int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            ArrayList arrayList2 = this.f224330e;
            int iHashCode3 = (iHashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
            ArrayList arrayList3 = this.f224331f;
            return iHashCode3 + (arrayList3 != null ? arrayList3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AvitoFinanceDynamicCardItem(itemId=");
            sb2.append(this.f224328c);
            sb2.append(", features=");
            sb2.append(this.f224329d);
            sb2.append(", onSelect=");
            sb2.append(this.f224330e);
            sb2.append(", onAppear=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f224331f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224328c);
            ArrayList arrayList = this.f224329d;
            if (arrayList == null) {
                parcel.writeInt(0);
            } else {
                Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
                while (itY.hasNext()) {
                    Iterator itJ = C0.j((List) itY.next(), parcel);
                    while (itJ.hasNext()) {
                        parcel.writeParcelable((Parcelable) itJ.next(), i12);
                    }
                }
            }
            ArrayList arrayList2 = this.f224330e;
            if (arrayList2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator itY2 = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList2);
                while (itY2.hasNext()) {
                    parcel.writeParcelable((Parcelable) itY2.next(), i12);
                }
            }
            ArrayList arrayList3 = this.f224331f;
            if (arrayList3 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itY3 = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList3);
            while (itY3.hasNext()) {
                parcel.writeParcelable((Parcelable) itY3.next(), i12);
            }
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$AvitoFinanceSimpleCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvitoFinanceSimpleCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<AvitoFinanceSimpleCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224332c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224333d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224334e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224335f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final DeepLink f224336g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final AvitoFinanceBaseCard f224337h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final AvitoFinanceBaseCard f224338i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final AvitoFinanceBaseCard f224339j;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AvitoFinanceSimpleCardItem> {
            @Override // android.os.Parcelable.Creator
            public final AvitoFinanceSimpleCardItem createFromParcel(Parcel parcel) {
                return new AvitoFinanceSimpleCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AvitoFinanceSimpleCardItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(AvitoFinanceSimpleCardItem.class.getClassLoader()), (AvitoFinanceBaseCard) parcel.readParcelable(AvitoFinanceSimpleCardItem.class.getClassLoader()), (AvitoFinanceBaseCard) parcel.readParcelable(AvitoFinanceSimpleCardItem.class.getClassLoader()), (AvitoFinanceBaseCard) parcel.readParcelable(AvitoFinanceSimpleCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AvitoFinanceSimpleCardItem[] newArray(int i12) {
                return new AvitoFinanceSimpleCardItem[i12];
            }
        }

        public AvitoFinanceSimpleCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink, @Y61.l DeepLink deepLink2, @Y61.l AvitoFinanceBaseCard avitoFinanceBaseCard, @Y61.l AvitoFinanceBaseCard avitoFinanceBaseCard2, @Y61.l AvitoFinanceBaseCard avitoFinanceBaseCard3) {
            super(str, null);
            this.f224332c = str;
            this.f224333d = str2;
            this.f224334e = str3;
            this.f224335f = deepLink;
            this.f224336g = deepLink2;
            this.f224337h = avitoFinanceBaseCard;
            this.f224338i = avitoFinanceBaseCard2;
            this.f224339j = avitoFinanceBaseCard3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvitoFinanceSimpleCardItem)) {
                return false;
            }
            AvitoFinanceSimpleCardItem avitoFinanceSimpleCardItem = (AvitoFinanceSimpleCardItem) obj;
            return L.f(this.f224332c, avitoFinanceSimpleCardItem.f224332c) && L.f(this.f224333d, avitoFinanceSimpleCardItem.f224333d) && L.f(this.f224334e, avitoFinanceSimpleCardItem.f224334e) && L.f(this.f224335f, avitoFinanceSimpleCardItem.f224335f) && L.f(this.f224336g, avitoFinanceSimpleCardItem.f224336g) && L.f(this.f224337h, avitoFinanceSimpleCardItem.f224337h) && L.f(this.f224338i, avitoFinanceSimpleCardItem.f224338i) && L.f(this.f224339j, avitoFinanceSimpleCardItem.f224339j);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f224335f, H.d(H.d(this.f224332c.hashCode() * 31, 31, this.f224333d), 31, this.f224334e), 31);
            DeepLink deepLink = this.f224336g;
            int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            AvitoFinanceBaseCard avitoFinanceBaseCard = this.f224337h;
            int iHashCode2 = (iHashCode + (avitoFinanceBaseCard == null ? 0 : avitoFinanceBaseCard.hashCode())) * 31;
            AvitoFinanceBaseCard avitoFinanceBaseCard2 = this.f224338i;
            int iHashCode3 = (iHashCode2 + (avitoFinanceBaseCard2 == null ? 0 : avitoFinanceBaseCard2.hashCode())) * 31;
            AvitoFinanceBaseCard avitoFinanceBaseCard3 = this.f224339j;
            return iHashCode3 + (avitoFinanceBaseCard3 != null ? avitoFinanceBaseCard3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "AvitoFinanceSimpleCardItem(itemId=" + this.f224332c + ", balance=" + this.f224333d + ", bonuses=" + this.f224334e + ", walletUri=" + this.f224335f + ", topUpUri=" + this.f224336g + ", topCard=" + this.f224337h + ", leftCard=" + this.f224338i + ", rightCard=" + this.f224339j + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224332c);
            parcel.writeString(this.f224333d);
            parcel.writeString(this.f224334e);
            parcel.writeParcelable(this.f224335f, i12);
            parcel.writeParcelable(this.f224336g, i12);
            parcel.writeParcelable(this.f224337h, i12);
            parcel.writeParcelable(this.f224338i, i12);
            parcel.writeParcelable(this.f224339j, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$AvitoFinanceSplitBonusesCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvitoFinanceSplitBonusesCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<AvitoFinanceSplitBonusesCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224340c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224341d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224342e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224343f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224344g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224345h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final DeepLink f224346i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final AvitoFinanceBaseCard f224347j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final AvitoFinanceBaseCard f224348k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final AvitoFinanceBaseCard f224349l;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AvitoFinanceSplitBonusesCardItem> {
            @Override // android.os.Parcelable.Creator
            public final AvitoFinanceSplitBonusesCardItem createFromParcel(Parcel parcel) {
                return new AvitoFinanceSplitBonusesCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AvitoFinanceSplitBonusesCardItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(AvitoFinanceSplitBonusesCardItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(AvitoFinanceSplitBonusesCardItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(AvitoFinanceSplitBonusesCardItem.class.getClassLoader()), (AvitoFinanceBaseCard) parcel.readParcelable(AvitoFinanceSplitBonusesCardItem.class.getClassLoader()), (AvitoFinanceBaseCard) parcel.readParcelable(AvitoFinanceSplitBonusesCardItem.class.getClassLoader()), (AvitoFinanceBaseCard) parcel.readParcelable(AvitoFinanceSplitBonusesCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AvitoFinanceSplitBonusesCardItem[] newArray(int i12) {
                return new AvitoFinanceSplitBonusesCardItem[i12];
            }
        }

        public AvitoFinanceSplitBonusesCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink, @Y61.k DeepLink deepLink2, @Y61.k DeepLink deepLink3, @Y61.l DeepLink deepLink4, @Y61.l AvitoFinanceBaseCard avitoFinanceBaseCard, @Y61.l AvitoFinanceBaseCard avitoFinanceBaseCard2, @Y61.l AvitoFinanceBaseCard avitoFinanceBaseCard3) {
            super(str, null);
            this.f224340c = str;
            this.f224341d = str2;
            this.f224342e = str3;
            this.f224343f = deepLink;
            this.f224344g = deepLink2;
            this.f224345h = deepLink3;
            this.f224346i = deepLink4;
            this.f224347j = avitoFinanceBaseCard;
            this.f224348k = avitoFinanceBaseCard2;
            this.f224349l = avitoFinanceBaseCard3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvitoFinanceSplitBonusesCardItem)) {
                return false;
            }
            AvitoFinanceSplitBonusesCardItem avitoFinanceSplitBonusesCardItem = (AvitoFinanceSplitBonusesCardItem) obj;
            return L.f(this.f224340c, avitoFinanceSplitBonusesCardItem.f224340c) && L.f(this.f224341d, avitoFinanceSplitBonusesCardItem.f224341d) && L.f(this.f224342e, avitoFinanceSplitBonusesCardItem.f224342e) && L.f(this.f224343f, avitoFinanceSplitBonusesCardItem.f224343f) && L.f(this.f224344g, avitoFinanceSplitBonusesCardItem.f224344g) && L.f(this.f224345h, avitoFinanceSplitBonusesCardItem.f224345h) && L.f(this.f224346i, avitoFinanceSplitBonusesCardItem.f224346i) && L.f(this.f224347j, avitoFinanceSplitBonusesCardItem.f224347j) && L.f(this.f224348k, avitoFinanceSplitBonusesCardItem.f224348k) && L.f(this.f224349l, avitoFinanceSplitBonusesCardItem.f224349l);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f224345h, com.avito.android.actions_sheet.a.e(this.f224344g, com.avito.android.actions_sheet.a.e(this.f224343f, H.d(H.d(this.f224340c.hashCode() * 31, 31, this.f224341d), 31, this.f224342e), 31), 31), 31);
            DeepLink deepLink = this.f224346i;
            int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            AvitoFinanceBaseCard avitoFinanceBaseCard = this.f224347j;
            int iHashCode2 = (iHashCode + (avitoFinanceBaseCard == null ? 0 : avitoFinanceBaseCard.hashCode())) * 31;
            AvitoFinanceBaseCard avitoFinanceBaseCard2 = this.f224348k;
            int iHashCode3 = (iHashCode2 + (avitoFinanceBaseCard2 == null ? 0 : avitoFinanceBaseCard2.hashCode())) * 31;
            AvitoFinanceBaseCard avitoFinanceBaseCard3 = this.f224349l;
            return iHashCode3 + (avitoFinanceBaseCard3 != null ? avitoFinanceBaseCard3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "AvitoFinanceSplitBonusesCardItem(itemId=" + this.f224340c + ", balance=" + this.f224341d + ", bonuses=" + this.f224342e + ", walletUri=" + this.f224343f + ", bonusesUri=" + this.f224344g + ", installmentPromoUri=" + this.f224345h + ", topUpUri=" + this.f224346i + ", topCard=" + this.f224347j + ", leftCard=" + this.f224348k + ", rightCard=" + this.f224349l + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224340c);
            parcel.writeString(this.f224341d);
            parcel.writeString(this.f224342e);
            parcel.writeParcelable(this.f224343f, i12);
            parcel.writeParcelable(this.f224344g, i12);
            parcel.writeParcelable(this.f224345h, i12);
            parcel.writeParcelable(this.f224346i, i12);
            parcel.writeParcelable(this.f224347j, i12);
            parcel.writeParcelable(this.f224348k, i12);
            parcel.writeParcelable(this.f224349l, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$AvitoFinanceSplitInstallmentsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvitoFinanceSplitInstallmentsCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<AvitoFinanceSplitInstallmentsCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224350c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224351d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224352e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224353f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224354g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224355h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final DeepLink f224356i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final AvitoFinanceBaseCard f224357j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final AvitoFinanceBaseCard f224358k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final AvitoFinanceBaseCard f224359l;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AvitoFinanceSplitInstallmentsCardItem> {
            @Override // android.os.Parcelable.Creator
            public final AvitoFinanceSplitInstallmentsCardItem createFromParcel(Parcel parcel) {
                return new AvitoFinanceSplitInstallmentsCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AvitoFinanceSplitInstallmentsCardItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(AvitoFinanceSplitInstallmentsCardItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(AvitoFinanceSplitInstallmentsCardItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(AvitoFinanceSplitInstallmentsCardItem.class.getClassLoader()), (AvitoFinanceBaseCard) parcel.readParcelable(AvitoFinanceSplitInstallmentsCardItem.class.getClassLoader()), (AvitoFinanceBaseCard) parcel.readParcelable(AvitoFinanceSplitInstallmentsCardItem.class.getClassLoader()), (AvitoFinanceBaseCard) parcel.readParcelable(AvitoFinanceSplitInstallmentsCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AvitoFinanceSplitInstallmentsCardItem[] newArray(int i12) {
                return new AvitoFinanceSplitInstallmentsCardItem[i12];
            }
        }

        public AvitoFinanceSplitInstallmentsCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink, @Y61.k DeepLink deepLink2, @Y61.k DeepLink deepLink3, @Y61.l DeepLink deepLink4, @Y61.l AvitoFinanceBaseCard avitoFinanceBaseCard, @Y61.l AvitoFinanceBaseCard avitoFinanceBaseCard2, @Y61.l AvitoFinanceBaseCard avitoFinanceBaseCard3) {
            super(str, null);
            this.f224350c = str;
            this.f224351d = str2;
            this.f224352e = str3;
            this.f224353f = deepLink;
            this.f224354g = deepLink2;
            this.f224355h = deepLink3;
            this.f224356i = deepLink4;
            this.f224357j = avitoFinanceBaseCard;
            this.f224358k = avitoFinanceBaseCard2;
            this.f224359l = avitoFinanceBaseCard3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvitoFinanceSplitInstallmentsCardItem)) {
                return false;
            }
            AvitoFinanceSplitInstallmentsCardItem avitoFinanceSplitInstallmentsCardItem = (AvitoFinanceSplitInstallmentsCardItem) obj;
            return L.f(this.f224350c, avitoFinanceSplitInstallmentsCardItem.f224350c) && L.f(this.f224351d, avitoFinanceSplitInstallmentsCardItem.f224351d) && L.f(this.f224352e, avitoFinanceSplitInstallmentsCardItem.f224352e) && L.f(this.f224353f, avitoFinanceSplitInstallmentsCardItem.f224353f) && L.f(this.f224354g, avitoFinanceSplitInstallmentsCardItem.f224354g) && L.f(this.f224355h, avitoFinanceSplitInstallmentsCardItem.f224355h) && L.f(this.f224356i, avitoFinanceSplitInstallmentsCardItem.f224356i) && L.f(this.f224357j, avitoFinanceSplitInstallmentsCardItem.f224357j) && L.f(this.f224358k, avitoFinanceSplitInstallmentsCardItem.f224358k) && L.f(this.f224359l, avitoFinanceSplitInstallmentsCardItem.f224359l);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f224355h, com.avito.android.actions_sheet.a.e(this.f224354g, com.avito.android.actions_sheet.a.e(this.f224353f, H.d(H.d(this.f224350c.hashCode() * 31, 31, this.f224351d), 31, this.f224352e), 31), 31), 31);
            DeepLink deepLink = this.f224356i;
            int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            AvitoFinanceBaseCard avitoFinanceBaseCard = this.f224357j;
            int iHashCode2 = (iHashCode + (avitoFinanceBaseCard == null ? 0 : avitoFinanceBaseCard.hashCode())) * 31;
            AvitoFinanceBaseCard avitoFinanceBaseCard2 = this.f224358k;
            int iHashCode3 = (iHashCode2 + (avitoFinanceBaseCard2 == null ? 0 : avitoFinanceBaseCard2.hashCode())) * 31;
            AvitoFinanceBaseCard avitoFinanceBaseCard3 = this.f224359l;
            return iHashCode3 + (avitoFinanceBaseCard3 != null ? avitoFinanceBaseCard3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "AvitoFinanceSplitInstallmentsCardItem(itemId=" + this.f224350c + ", balance=" + this.f224351d + ", bonuses=" + this.f224352e + ", walletUri=" + this.f224353f + ", installmentPromoUri=" + this.f224354g + ", installmentsRepaymentUri=" + this.f224355h + ", topUpUri=" + this.f224356i + ", topCard=" + this.f224357j + ", leftCard=" + this.f224358k + ", rightCard=" + this.f224359l + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224350c);
            parcel.writeString(this.f224351d);
            parcel.writeString(this.f224352e);
            parcel.writeParcelable(this.f224353f, i12);
            parcel.writeParcelable(this.f224354g, i12);
            parcel.writeParcelable(this.f224355h, i12);
            parcel.writeParcelable(this.f224356i, i12);
            parcel.writeParcelable(this.f224357j, i12);
            parcel.writeParcelable(this.f224358k, i12);
            parcel.writeParcelable(this.f224359l, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$AvitoProCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvitoProCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<AvitoProCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224360c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224361d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224362e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f224363f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224364g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f224365h;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AvitoProCardItem> {
            @Override // android.os.Parcelable.Creator
            public final AvitoProCardItem createFromParcel(Parcel parcel) {
                return new AvitoProCardItem((DeepLink) parcel.readParcelable(AvitoProCardItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final AvitoProCardItem[] newArray(int i12) {
                return new AvitoProCardItem[i12];
            }
        }

        public AvitoProCardItem(@Y61.k DeepLink deepLink, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, boolean z12) {
            super(str, null);
            this.f224360c = str;
            this.f224361d = str2;
            this.f224362e = str3;
            this.f224363f = str4;
            this.f224364g = deepLink;
            this.f224365h = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvitoProCardItem)) {
                return false;
            }
            AvitoProCardItem avitoProCardItem = (AvitoProCardItem) obj;
            return L.f(this.f224360c, avitoProCardItem.f224360c) && L.f(this.f224361d, avitoProCardItem.f224361d) && L.f(this.f224362e, avitoProCardItem.f224362e) && L.f(this.f224363f, avitoProCardItem.f224363f) && L.f(this.f224364g, avitoProCardItem.f224364g) && this.f224365h == avitoProCardItem.f224365h;
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f224360c.hashCode() * 31, 31, this.f224361d), 31, this.f224362e);
            String str = this.f224363f;
            return Boolean.hashCode(this.f224365h) + com.avito.android.actions_sheet.a.e(this.f224364g, (iD2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AvitoProCardItem(itemId=");
            sb2.append(this.f224360c);
            sb2.append(", title=");
            sb2.append(this.f224361d);
            sb2.append(", description=");
            sb2.append(this.f224362e);
            sb2.append(", tooltip=");
            sb2.append(this.f224363f);
            sb2.append(", deepLink=");
            sb2.append(this.f224364g);
            sb2.append(", workIconVisible=");
            return r.x(sb2, this.f224365h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224360c);
            parcel.writeString(this.f224361d);
            parcel.writeString(this.f224362e);
            parcel.writeString(this.f224363f);
            parcel.writeParcelable(this.f224364g, i12);
            parcel.writeInt(this.f224365h ? 1 : 0);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$CallsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CallsCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<CallsCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224366c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224367d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224368e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f224369f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224370g;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CallsCardItem> {
            @Override // android.os.Parcelable.Creator
            public final CallsCardItem createFromParcel(Parcel parcel) {
                return new CallsCardItem((DeepLink) parcel.readParcelable(CallsCardItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final CallsCardItem[] newArray(int i12) {
                return new CallsCardItem[i12];
            }
        }

        public CallsCardItem(@Y61.k DeepLink deepLink, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12) {
            super(str, null);
            this.f224366c = str;
            this.f224367d = str2;
            this.f224368e = str3;
            this.f224369f = z12;
            this.f224370g = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CallsCardItem)) {
                return false;
            }
            CallsCardItem callsCardItem = (CallsCardItem) obj;
            return L.f(this.f224366c, callsCardItem.f224366c) && L.f(this.f224367d, callsCardItem.f224367d) && L.f(this.f224368e, callsCardItem.f224368e) && this.f224369f == callsCardItem.f224369f && L.f(this.f224370g, callsCardItem.f224370g);
        }

        public final int hashCode() {
            return this.f224370g.hashCode() + r.i(H.d(H.d(this.f224366c.hashCode() * 31, 31, this.f224367d), 31, this.f224368e), 31, this.f224369f);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CallsCardItem(itemId=");
            sb2.append(this.f224366c);
            sb2.append(", title=");
            sb2.append(this.f224367d);
            sb2.append(", subtitle=");
            sb2.append(this.f224368e);
            sb2.append(", highlighted=");
            sb2.append(this.f224369f);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224370g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224366c);
            parcel.writeString(this.f224367d);
            parcel.writeString(this.f224368e);
            parcel.writeInt(this.f224369f ? 1 : 0);
            parcel.writeParcelable(this.f224370g, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$CallsHistoryCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CallsHistoryCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<CallsHistoryCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224371c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224372d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224373e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Boolean f224374f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224375g;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CallsHistoryCardItem> {
            @Override // android.os.Parcelable.Creator
            public final CallsHistoryCardItem createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new CallsHistoryCardItem(boolValueOf, string, string2, string3, (DeepLink) parcel.readParcelable(CallsHistoryCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final CallsHistoryCardItem[] newArray(int i12) {
                return new CallsHistoryCardItem[i12];
            }
        }

        public CallsHistoryCardItem(@Y61.l Boolean bool, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224371c = str;
            this.f224372d = str2;
            this.f224373e = str3;
            this.f224374f = bool;
            this.f224375g = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CallsHistoryCardItem)) {
                return false;
            }
            CallsHistoryCardItem callsHistoryCardItem = (CallsHistoryCardItem) obj;
            return L.f(this.f224371c, callsHistoryCardItem.f224371c) && L.f(this.f224372d, callsHistoryCardItem.f224372d) && L.f(this.f224373e, callsHistoryCardItem.f224373e) && L.f(this.f224374f, callsHistoryCardItem.f224374f) && L.f(this.f224375g, callsHistoryCardItem.f224375g);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224371c.hashCode() * 31, 31, this.f224372d);
            String str = this.f224373e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f224374f;
            return this.f224375g.hashCode() + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CallsHistoryCardItem(itemId=");
            sb2.append(this.f224371c);
            sb2.append(", title=");
            sb2.append(this.f224372d);
            sb2.append(", subtitle=");
            sb2.append(this.f224373e);
            sb2.append(", highlighted=");
            sb2.append(this.f224374f);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224375g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224371c);
            parcel.writeString(this.f224372d);
            parcel.writeString(this.f224373e);
            Boolean bool = this.f224374f;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeParcelable(this.f224375g, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ClickableCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClickableCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ClickableCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224376c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224377d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224378e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224379f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ClickableCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ClickableCardItem createFromParcel(Parcel parcel) {
                return new ClickableCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ClickableCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ClickableCardItem[] newArray(int i12) {
                return new ClickableCardItem[i12];
            }
        }

        public ClickableCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224376c = str;
            this.f224377d = str2;
            this.f224378e = str3;
            this.f224379f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickableCardItem)) {
                return false;
            }
            ClickableCardItem clickableCardItem = (ClickableCardItem) obj;
            return L.f(this.f224376c, clickableCardItem.f224376c) && L.f(this.f224377d, clickableCardItem.f224377d) && L.f(this.f224378e, clickableCardItem.f224378e) && L.f(this.f224379f, clickableCardItem.f224379f);
        }

        public final int hashCode() {
            return this.f224379f.hashCode() + H.d(H.d(this.f224376c.hashCode() * 31, 31, this.f224377d), 31, this.f224378e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClickableCardItem(itemId=");
            sb2.append(this.f224376c);
            sb2.append(", title=");
            sb2.append(this.f224377d);
            sb2.append(", subtitle=");
            sb2.append(this.f224378e);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224379f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224376c);
            parcel.writeString(this.f224377d);
            parcel.writeString(this.f224378e);
            parcel.writeParcelable(this.f224379f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ComfortableDealCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ComfortableDealCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ComfortableDealCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224380c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224381d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224382e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224383f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ComfortableDealCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ComfortableDealCardItem createFromParcel(Parcel parcel) {
                return new ComfortableDealCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ComfortableDealCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ComfortableDealCardItem[] newArray(int i12) {
                return new ComfortableDealCardItem[i12];
            }
        }

        public ComfortableDealCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224380c = str;
            this.f224381d = str2;
            this.f224382e = str3;
            this.f224383f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComfortableDealCardItem)) {
                return false;
            }
            ComfortableDealCardItem comfortableDealCardItem = (ComfortableDealCardItem) obj;
            return L.f(this.f224380c, comfortableDealCardItem.f224380c) && L.f(this.f224381d, comfortableDealCardItem.f224381d) && L.f(this.f224382e, comfortableDealCardItem.f224382e) && L.f(this.f224383f, comfortableDealCardItem.f224383f);
        }

        public final int hashCode() {
            return this.f224383f.hashCode() + H.d(H.d(this.f224380c.hashCode() * 31, 31, this.f224381d), 31, this.f224382e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ComfortableDealCardItem(itemId=");
            sb2.append(this.f224380c);
            sb2.append(", title=");
            sb2.append(this.f224381d);
            sb2.append(", subtitle=");
            sb2.append(this.f224382e);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224383f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224380c);
            parcel.writeString(this.f224381d);
            parcel.writeString(this.f224382e);
            parcel.writeParcelable(this.f224383f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ComfortableDealWithStatusCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ComfortableDealWithStatusCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ComfortableDealWithStatusCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224384c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224385d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224386e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Banner f224387f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ComfortableDealWithStatusCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ComfortableDealWithStatusCardItem createFromParcel(Parcel parcel) {
                return new ComfortableDealWithStatusCardItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ComfortableDealWithStatusCardItem.class.getClassLoader()), (Banner) parcel.readParcelable(ComfortableDealWithStatusCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ComfortableDealWithStatusCardItem[] newArray(int i12) {
                return new ComfortableDealWithStatusCardItem[i12];
            }
        }

        public ComfortableDealWithStatusCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k DeepLink deepLink, @Y61.k Banner banner) {
            super(str, null);
            this.f224384c = str;
            this.f224385d = str2;
            this.f224386e = deepLink;
            this.f224387f = banner;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComfortableDealWithStatusCardItem)) {
                return false;
            }
            ComfortableDealWithStatusCardItem comfortableDealWithStatusCardItem = (ComfortableDealWithStatusCardItem) obj;
            return L.f(this.f224384c, comfortableDealWithStatusCardItem.f224384c) && L.f(this.f224385d, comfortableDealWithStatusCardItem.f224385d) && L.f(this.f224386e, comfortableDealWithStatusCardItem.f224386e) && L.f(this.f224387f, comfortableDealWithStatusCardItem.f224387f);
        }

        public final int hashCode() {
            return this.f224387f.hashCode() + com.avito.android.actions_sheet.a.e(this.f224386e, H.d(this.f224384c.hashCode() * 31, 31, this.f224385d), 31);
        }

        @Y61.k
        public final String toString() {
            return "ComfortableDealWithStatusCardItem(itemId=" + this.f224384c + ", title=" + this.f224385d + ", deeplink=" + this.f224386e + ", internalBanner=" + this.f224387f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224384c);
            parcel.writeString(this.f224385d);
            parcel.writeParcelable(this.f224386e, i12);
            parcel.writeParcelable(this.f224387f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ContactsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContactsCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ContactsCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224388c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224389d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224390e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Action f224391f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ContactsCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ContactsCardItem createFromParcel(Parcel parcel) {
                return new ContactsCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(ContactsCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ContactsCardItem[] newArray(int i12) {
                return new ContactsCardItem[i12];
            }
        }

        public ContactsCardItem(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l Action action) {
            super(str, null);
            this.f224388c = str;
            this.f224389d = str2;
            this.f224390e = str3;
            this.f224391f = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactsCardItem)) {
                return false;
            }
            ContactsCardItem contactsCardItem = (ContactsCardItem) obj;
            return L.f(this.f224388c, contactsCardItem.f224388c) && L.f(this.f224389d, contactsCardItem.f224389d) && L.f(this.f224390e, contactsCardItem.f224390e) && L.f(this.f224391f, contactsCardItem.f224391f);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224388c.hashCode() * 31, 31, this.f224389d);
            String str = this.f224390e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Action action = this.f224391f;
            return iHashCode + (action != null ? action.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "ContactsCardItem(itemId=" + this.f224388c + ", title=" + this.f224389d + ", description=" + this.f224390e + ", action=" + this.f224391f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224388c);
            parcel.writeString(this.f224389d);
            parcel.writeString(this.f224390e);
            parcel.writeParcelable(this.f224391f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$EmptyAddressCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmptyAddressCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<EmptyAddressCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224392c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224393d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224394e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f224395f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final AddressIcon f224396g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final String f224397h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final UniversalImage f224398i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final SuggestedAddress f224399j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final String f224400k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final AddressAction f224401l;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EmptyAddressCardItem> {
            @Override // android.os.Parcelable.Creator
            public final EmptyAddressCardItem createFromParcel(Parcel parcel) {
                return new EmptyAddressCardItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AddressIcon) parcel.readParcelable(EmptyAddressCardItem.class.getClassLoader()), parcel.readString(), (UniversalImage) parcel.readParcelable(EmptyAddressCardItem.class.getClassLoader()), (SuggestedAddress) parcel.readParcelable(EmptyAddressCardItem.class.getClassLoader()), parcel.readString(), (AddressAction) parcel.readParcelable(EmptyAddressCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final EmptyAddressCardItem[] newArray(int i12) {
                return new EmptyAddressCardItem[i12];
            }
        }

        public EmptyAddressCardItem(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k String str4, @Y61.k AddressIcon addressIcon, @Y61.k String str5, @Y61.k UniversalImage universalImage, @Y61.l SuggestedAddress suggestedAddress, @Y61.l String str6, @Y61.k AddressAction addressAction) {
            super(str, null);
            this.f224392c = str;
            this.f224393d = str2;
            this.f224394e = str3;
            this.f224395f = str4;
            this.f224396g = addressIcon;
            this.f224397h = str5;
            this.f224398i = universalImage;
            this.f224399j = suggestedAddress;
            this.f224400k = str6;
            this.f224401l = addressAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmptyAddressCardItem)) {
                return false;
            }
            EmptyAddressCardItem emptyAddressCardItem = (EmptyAddressCardItem) obj;
            return L.f(this.f224392c, emptyAddressCardItem.f224392c) && L.f(this.f224393d, emptyAddressCardItem.f224393d) && L.f(this.f224394e, emptyAddressCardItem.f224394e) && L.f(this.f224395f, emptyAddressCardItem.f224395f) && L.f(this.f224396g, emptyAddressCardItem.f224396g) && L.f(this.f224397h, emptyAddressCardItem.f224397h) && L.f(this.f224398i, emptyAddressCardItem.f224398i) && L.f(this.f224399j, emptyAddressCardItem.f224399j) && L.f(this.f224400k, emptyAddressCardItem.f224400k) && L.f(this.f224401l, emptyAddressCardItem.f224401l);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224392c.hashCode() * 31, 31, this.f224393d);
            String str = this.f224394e;
            int iA2 = com.avito.android.actions_sheet.a.a(H.d((this.f224396g.hashCode() + H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f224395f)) * 31, 31, this.f224397h), 31, this.f224398i);
            SuggestedAddress suggestedAddress = this.f224399j;
            int iHashCode = (iA2 + (suggestedAddress == null ? 0 : suggestedAddress.hashCode())) * 31;
            String str2 = this.f224400k;
            return this.f224401l.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "EmptyAddressCardItem(itemId=" + this.f224392c + ", geosessionId=" + this.f224393d + ", badge=" + this.f224394e + ", title=" + this.f224395f + ", icon=" + this.f224396g + ", description=" + this.f224397h + ", image=" + this.f224398i + ", suggestedAddress=" + this.f224399j + ", profileAddress=" + this.f224400k + ", action=" + this.f224401l + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224392c);
            parcel.writeString(this.f224393d);
            parcel.writeString(this.f224394e);
            parcel.writeString(this.f224395f);
            parcel.writeParcelable(this.f224396g, i12);
            parcel.writeString(this.f224397h);
            parcel.writeParcelable(this.f224398i, i12);
            parcel.writeParcelable(this.f224399j, i12);
            parcel.writeString(this.f224400k);
            parcel.writeParcelable(this.f224401l, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ExtensionsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExtensionsCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ExtensionsCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224402c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224403d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224404e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final List<ExtensionsItem.ExtensionInfo> f224405f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final List<Action> f224406g;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ExtensionsCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ExtensionsCardItem createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int iL2 = 0;
                ArrayList arrayList2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL3 = 0;
                    while (iL3 != i12) {
                        iL3 = com.avito.android.actions_sheet.a.l(ExtensionsCardItem.class, parcel, arrayList, iL3, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    int i13 = parcel.readInt();
                    arrayList2 = new ArrayList(i13);
                    while (iL2 != i13) {
                        iL2 = com.avito.android.actions_sheet.a.l(ExtensionsCardItem.class, parcel, arrayList2, iL2, 1);
                    }
                }
                return new ExtensionsCardItem(string, string2, string3, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final ExtensionsCardItem[] newArray(int i12) {
                return new ExtensionsCardItem[i12];
            }
        }

        public ExtensionsCardItem(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l List<ExtensionsItem.ExtensionInfo> list, @Y61.l List<Action> list2) {
            super(str, null);
            this.f224402c = str;
            this.f224403d = str2;
            this.f224404e = str3;
            this.f224405f = list;
            this.f224406g = list2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExtensionsCardItem)) {
                return false;
            }
            ExtensionsCardItem extensionsCardItem = (ExtensionsCardItem) obj;
            return L.f(this.f224402c, extensionsCardItem.f224402c) && L.f(this.f224403d, extensionsCardItem.f224403d) && L.f(this.f224404e, extensionsCardItem.f224404e) && L.f(this.f224405f, extensionsCardItem.f224405f) && L.f(this.f224406g, extensionsCardItem.f224406g);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224402c.hashCode() * 31, 31, this.f224403d);
            String str = this.f224404e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            List<ExtensionsItem.ExtensionInfo> list = this.f224405f;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<Action> list2 = this.f224406g;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ExtensionsCardItem(itemId=");
            sb2.append(this.f224402c);
            sb2.append(", title=");
            sb2.append(this.f224403d);
            sb2.append(", description=");
            sb2.append(this.f224404e);
            sb2.append(", extensionsInfo=");
            sb2.append(this.f224405f);
            sb2.append(", actions=");
            return H.p(sb2, this.f224406g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224402c);
            parcel.writeString(this.f224403d);
            parcel.writeString(this.f224404e);
            List<ExtensionsItem.ExtensionInfo> list = this.f224405f;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), i12);
                }
            }
            List<Action> list2 = this.f224406g;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$HelpCenterCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HelpCenterCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<HelpCenterCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224407c;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HelpCenterCardItem> {
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCardItem createFromParcel(Parcel parcel) {
                return new HelpCenterCardItem(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HelpCenterCardItem[] newArray(int i12) {
                return new HelpCenterCardItem[i12];
            }
        }

        public HelpCenterCardItem(@Y61.k String str) {
            super(str, null);
            this.f224407c = str;
        }

        @Override // com.avito.android.profile.user_profile.cards.CardItem
        @Y61.k
        public final ProfileWidgetClickEvent.TargetPage L() {
            return ProfileWidgetClickEvent.TargetPage.f224277i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpCenterCardItem) && L.f(this.f224407c, ((HelpCenterCardItem) obj).f224407c);
        }

        public final int hashCode() {
            return this.f224407c.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("HelpCenterCardItem(itemId="), this.f224407c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224407c);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$IncomeSettingsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncomeSettingsCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<IncomeSettingsCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224408c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224409d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224410e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224411f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IncomeSettingsCardItem> {
            @Override // android.os.Parcelable.Creator
            public final IncomeSettingsCardItem createFromParcel(Parcel parcel) {
                return new IncomeSettingsCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(IncomeSettingsCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final IncomeSettingsCardItem[] newArray(int i12) {
                return new IncomeSettingsCardItem[i12];
            }
        }

        public IncomeSettingsCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224408c = str;
            this.f224409d = str2;
            this.f224410e = str3;
            this.f224411f = deepLink;
        }

        @Override // com.avito.android.profile.user_profile.cards.CardItem
        @Y61.k
        public final ProfileWidgetClickEvent.TargetPage L() {
            return ProfileWidgetClickEvent.TargetPage.f224276h;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IncomeSettingsCardItem)) {
                return false;
            }
            IncomeSettingsCardItem incomeSettingsCardItem = (IncomeSettingsCardItem) obj;
            return L.f(this.f224408c, incomeSettingsCardItem.f224408c) && L.f(this.f224409d, incomeSettingsCardItem.f224409d) && L.f(this.f224410e, incomeSettingsCardItem.f224410e) && L.f(this.f224411f, incomeSettingsCardItem.f224411f);
        }

        public final int hashCode() {
            return this.f224411f.hashCode() + H.d(H.d(this.f224408c.hashCode() * 31, 31, this.f224409d), 31, this.f224410e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IncomeSettingsCardItem(itemId=");
            sb2.append(this.f224408c);
            sb2.append(", title=");
            sb2.append(this.f224409d);
            sb2.append(", subtitle=");
            sb2.append(this.f224410e);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224411f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224408c);
            parcel.writeString(this.f224409d);
            parcel.writeString(this.f224410e);
            parcel.writeParcelable(this.f224411f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$InfoCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InfoCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<InfoCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224412c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Avatar f224413d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224414e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f224415f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f224416g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final String f224417h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f224418i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final String f224419j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final String f224420k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final Support f224421l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final String f224422m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final ProfileRating f224423n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final ReputationAndRatingCard f224424o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final DeliveryRestrictionCard f224425p;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<InfoCardItem> {
            @Override // android.os.Parcelable.Creator
            public final InfoCardItem createFromParcel(Parcel parcel) {
                return new InfoCardItem(parcel.readString(), (Avatar) parcel.readParcelable(InfoCardItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), (Support) parcel.readParcelable(InfoCardItem.class.getClassLoader()), parcel.readString(), (ProfileRating) parcel.readParcelable(InfoCardItem.class.getClassLoader()), parcel.readInt() == 0 ? null : ReputationAndRatingCard.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DeliveryRestrictionCard.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final InfoCardItem[] newArray(int i12) {
                return new InfoCardItem[i12];
            }
        }

        public InfoCardItem(@Y61.k String str, @Y61.l Avatar avatar, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k String str5, boolean z12, @Y61.k String str6, @Y61.l String str7, @Y61.l Support support, @Y61.l String str8, @Y61.l ProfileRating profileRating, @Y61.l ReputationAndRatingCard reputationAndRatingCard, @Y61.l DeliveryRestrictionCard deliveryRestrictionCard) {
            super(str, null);
            this.f224412c = str;
            this.f224413d = avatar;
            this.f224414e = str2;
            this.f224415f = str3;
            this.f224416g = str4;
            this.f224417h = str5;
            this.f224418i = z12;
            this.f224419j = str6;
            this.f224420k = str7;
            this.f224421l = support;
            this.f224422m = str8;
            this.f224423n = profileRating;
            this.f224424o = reputationAndRatingCard;
            this.f224425p = deliveryRestrictionCard;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoCardItem)) {
                return false;
            }
            InfoCardItem infoCardItem = (InfoCardItem) obj;
            return L.f(this.f224412c, infoCardItem.f224412c) && L.f(this.f224413d, infoCardItem.f224413d) && L.f(this.f224414e, infoCardItem.f224414e) && L.f(this.f224415f, infoCardItem.f224415f) && L.f(this.f224416g, infoCardItem.f224416g) && L.f(this.f224417h, infoCardItem.f224417h) && this.f224418i == infoCardItem.f224418i && L.f(this.f224419j, infoCardItem.f224419j) && L.f(this.f224420k, infoCardItem.f224420k) && L.f(this.f224421l, infoCardItem.f224421l) && L.f(this.f224422m, infoCardItem.f224422m) && L.f(this.f224423n, infoCardItem.f224423n) && L.f(this.f224424o, infoCardItem.f224424o) && L.f(this.f224425p, infoCardItem.f224425p);
        }

        public final int hashCode() {
            int iHashCode = this.f224412c.hashCode() * 31;
            Avatar avatar = this.f224413d;
            int iD2 = H.d((iHashCode + (avatar == null ? 0 : avatar.hashCode())) * 31, 31, this.f224414e);
            String str = this.f224415f;
            int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f224416g;
            int iD3 = H.d(r.i(H.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f224417h), 31, this.f224418i), 31, this.f224419j);
            String str3 = this.f224420k;
            int iHashCode3 = (iD3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Support support = this.f224421l;
            int iHashCode4 = (iHashCode3 + (support == null ? 0 : support.hashCode())) * 31;
            String str4 = this.f224422m;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ProfileRating profileRating = this.f224423n;
            int iHashCode6 = (iHashCode5 + (profileRating == null ? 0 : profileRating.hashCode())) * 31;
            ReputationAndRatingCard reputationAndRatingCard = this.f224424o;
            int iHashCode7 = (iHashCode6 + (reputationAndRatingCard == null ? 0 : reputationAndRatingCard.hashCode())) * 31;
            DeliveryRestrictionCard deliveryRestrictionCard = this.f224425p;
            return iHashCode7 + (deliveryRestrictionCard != null ? deliveryRestrictionCard.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "InfoCardItem(itemId=" + this.f224412c + ", avatar=" + this.f224413d + ", name=" + this.f224414e + ", email=" + this.f224415f + ", address=" + this.f224416g + ", registered=" + this.f224417h + ", isIncomplete=" + this.f224418i + ", type=" + this.f224419j + ", manager=" + this.f224420k + ", support=" + this.f224421l + ", shopSite=" + this.f224422m + ", rating=" + this.f224423n + ", reputationAndRating=" + this.f224424o + ", deliveryRestrictionCard=" + this.f224425p + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224412c);
            parcel.writeParcelable(this.f224413d, i12);
            parcel.writeString(this.f224414e);
            parcel.writeString(this.f224415f);
            parcel.writeString(this.f224416g);
            parcel.writeString(this.f224417h);
            parcel.writeInt(this.f224418i ? 1 : 0);
            parcel.writeString(this.f224419j);
            parcel.writeString(this.f224420k);
            parcel.writeParcelable(this.f224421l, i12);
            parcel.writeString(this.f224422m);
            parcel.writeParcelable(this.f224423n, i12);
            ReputationAndRatingCard reputationAndRatingCard = this.f224424o;
            if (reputationAndRatingCard == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                reputationAndRatingCard.writeToParcel(parcel, i12);
            }
            DeliveryRestrictionCard deliveryRestrictionCard = this.f224425p;
            if (deliveryRestrictionCard == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                deliveryRestrictionCard.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$LeasingEntryPointItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LeasingEntryPointItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<LeasingEntryPointItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224426c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224427d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224428e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224429f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LeasingEntryPointItem> {
            @Override // android.os.Parcelable.Creator
            public final LeasingEntryPointItem createFromParcel(Parcel parcel) {
                return new LeasingEntryPointItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(LeasingEntryPointItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final LeasingEntryPointItem[] newArray(int i12) {
                return new LeasingEntryPointItem[i12];
            }
        }

        public LeasingEntryPointItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224426c = str;
            this.f224427d = str2;
            this.f224428e = str3;
            this.f224429f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeasingEntryPointItem)) {
                return false;
            }
            LeasingEntryPointItem leasingEntryPointItem = (LeasingEntryPointItem) obj;
            return L.f(this.f224426c, leasingEntryPointItem.f224426c) && L.f(this.f224427d, leasingEntryPointItem.f224427d) && L.f(this.f224428e, leasingEntryPointItem.f224428e) && L.f(this.f224429f, leasingEntryPointItem.f224429f);
        }

        public final int hashCode() {
            return this.f224429f.hashCode() + H.d(H.d(this.f224426c.hashCode() * 31, 31, this.f224427d), 31, this.f224428e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LeasingEntryPointItem(itemId=");
            sb2.append(this.f224426c);
            sb2.append(", title=");
            sb2.append(this.f224427d);
            sb2.append(", subtitle=");
            sb2.append(this.f224428e);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224429f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224426c);
            parcel.writeString(this.f224427d);
            parcel.writeString(this.f224428e);
            parcel.writeParcelable(this.f224429f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$LogoutCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LogoutCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<LogoutCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224430c;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LogoutCardItem> {
            @Override // android.os.Parcelable.Creator
            public final LogoutCardItem createFromParcel(Parcel parcel) {
                return new LogoutCardItem(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LogoutCardItem[] newArray(int i12) {
                return new LogoutCardItem[i12];
            }
        }

        public LogoutCardItem(@Y61.k String str) {
            super(str, null);
            this.f224430c = str;
        }

        @Override // com.avito.android.profile.user_profile.cards.CardItem
        @Y61.k
        public final ProfileWidgetClickEvent.TargetPage L() {
            return ProfileWidgetClickEvent.TargetPage.f224280l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LogoutCardItem) && L.f(this.f224430c, ((LogoutCardItem) obj).f224430c);
        }

        public final int hashCode() {
            return this.f224430c.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("LogoutCardItem(itemId="), this.f224430c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224430c);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$LoyaltyPreferencesCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoyaltyPreferencesCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<LoyaltyPreferencesCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224431c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224432d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224433e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f224434f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeeplinkAction f224435g;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LoyaltyPreferencesCardItem> {
            @Override // android.os.Parcelable.Creator
            public final LoyaltyPreferencesCardItem createFromParcel(Parcel parcel) {
                return new LoyaltyPreferencesCardItem((DeeplinkAction) parcel.readParcelable(LoyaltyPreferencesCardItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LoyaltyPreferencesCardItem[] newArray(int i12) {
                return new LoyaltyPreferencesCardItem[i12];
            }
        }

        public LoyaltyPreferencesCardItem(@Y61.k DeeplinkAction deeplinkAction, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4) {
            super(str, null);
            this.f224431c = str;
            this.f224432d = str2;
            this.f224433e = str3;
            this.f224434f = str4;
            this.f224435g = deeplinkAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoyaltyPreferencesCardItem)) {
                return false;
            }
            LoyaltyPreferencesCardItem loyaltyPreferencesCardItem = (LoyaltyPreferencesCardItem) obj;
            return L.f(this.f224431c, loyaltyPreferencesCardItem.f224431c) && L.f(this.f224432d, loyaltyPreferencesCardItem.f224432d) && L.f(this.f224433e, loyaltyPreferencesCardItem.f224433e) && L.f(this.f224434f, loyaltyPreferencesCardItem.f224434f) && L.f(this.f224435g, loyaltyPreferencesCardItem.f224435g);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224431c.hashCode() * 31, 31, this.f224432d);
            String str = this.f224433e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f224434f;
            return this.f224435g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "LoyaltyPreferencesCardItem(itemId=" + this.f224431c + ", title=" + this.f224432d + ", subtitle=" + this.f224433e + ", tag=" + this.f224434f + ", action=" + this.f224435g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224431c);
            parcel.writeString(this.f224432d);
            parcel.writeString(this.f224433e);
            parcel.writeString(this.f224434f);
            parcel.writeParcelable(this.f224435g, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$MortgageAccountCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MortgageAccountCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<MortgageAccountCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224436c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224437d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224438e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224439f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MortgageAccountCardItem> {
            @Override // android.os.Parcelable.Creator
            public final MortgageAccountCardItem createFromParcel(Parcel parcel) {
                return new MortgageAccountCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(MortgageAccountCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MortgageAccountCardItem[] newArray(int i12) {
                return new MortgageAccountCardItem[i12];
            }
        }

        public MortgageAccountCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224436c = str;
            this.f224437d = str2;
            this.f224438e = str3;
            this.f224439f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MortgageAccountCardItem)) {
                return false;
            }
            MortgageAccountCardItem mortgageAccountCardItem = (MortgageAccountCardItem) obj;
            return L.f(this.f224436c, mortgageAccountCardItem.f224436c) && L.f(this.f224437d, mortgageAccountCardItem.f224437d) && L.f(this.f224438e, mortgageAccountCardItem.f224438e) && L.f(this.f224439f, mortgageAccountCardItem.f224439f);
        }

        public final int hashCode() {
            return this.f224439f.hashCode() + H.d(H.d(this.f224436c.hashCode() * 31, 31, this.f224437d), 31, this.f224438e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MortgageAccountCardItem(itemId=");
            sb2.append(this.f224436c);
            sb2.append(", title=");
            sb2.append(this.f224437d);
            sb2.append(", subtitle=");
            sb2.append(this.f224438e);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224439f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224436c);
            parcel.writeString(this.f224437d);
            parcel.writeString(this.f224438e);
            parcel.writeParcelable(this.f224439f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$MortgageApplicationCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MortgageApplicationCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<MortgageApplicationCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224440c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224441d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224442e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224443f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MortgageApplicationCardItem> {
            @Override // android.os.Parcelable.Creator
            public final MortgageApplicationCardItem createFromParcel(Parcel parcel) {
                return new MortgageApplicationCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(MortgageApplicationCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MortgageApplicationCardItem[] newArray(int i12) {
                return new MortgageApplicationCardItem[i12];
            }
        }

        public MortgageApplicationCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224440c = str;
            this.f224441d = str2;
            this.f224442e = str3;
            this.f224443f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MortgageApplicationCardItem)) {
                return false;
            }
            MortgageApplicationCardItem mortgageApplicationCardItem = (MortgageApplicationCardItem) obj;
            return L.f(this.f224440c, mortgageApplicationCardItem.f224440c) && L.f(this.f224441d, mortgageApplicationCardItem.f224441d) && L.f(this.f224442e, mortgageApplicationCardItem.f224442e) && L.f(this.f224443f, mortgageApplicationCardItem.f224443f);
        }

        public final int hashCode() {
            return this.f224443f.hashCode() + H.d(H.d(this.f224440c.hashCode() * 31, 31, this.f224441d), 31, this.f224442e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MortgageApplicationCardItem(itemId=");
            sb2.append(this.f224440c);
            sb2.append(", title=");
            sb2.append(this.f224441d);
            sb2.append(", subtitle=");
            sb2.append(this.f224442e);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224443f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224440c);
            parcel.writeString(this.f224441d);
            parcel.writeString(this.f224442e);
            parcel.writeParcelable(this.f224443f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$MyGarageCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MyGarageCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<MyGarageCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224444c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224445d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224446e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224447f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MyGarageCardItem> {
            @Override // android.os.Parcelable.Creator
            public final MyGarageCardItem createFromParcel(Parcel parcel) {
                return new MyGarageCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(MyGarageCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MyGarageCardItem[] newArray(int i12) {
                return new MyGarageCardItem[i12];
            }
        }

        public MyGarageCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224444c = str;
            this.f224445d = str2;
            this.f224446e = str3;
            this.f224447f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MyGarageCardItem)) {
                return false;
            }
            MyGarageCardItem myGarageCardItem = (MyGarageCardItem) obj;
            return L.f(this.f224444c, myGarageCardItem.f224444c) && L.f(this.f224445d, myGarageCardItem.f224445d) && L.f(this.f224446e, myGarageCardItem.f224446e) && L.f(this.f224447f, myGarageCardItem.f224447f);
        }

        public final int hashCode() {
            return this.f224447f.hashCode() + H.d(H.d(this.f224444c.hashCode() * 31, 31, this.f224445d), 31, this.f224446e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MyGarageCardItem(itemId=");
            sb2.append(this.f224444c);
            sb2.append(", title=");
            sb2.append(this.f224445d);
            sb2.append(", subtitle=");
            sb2.append(this.f224446e);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224447f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224444c);
            parcel.writeString(this.f224445d);
            parcel.writeString(this.f224446e);
            parcel.writeParcelable(this.f224447f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$NdTrxDealCabinetCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NdTrxDealCabinetCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<NdTrxDealCabinetCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224448c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224449d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224450e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224451f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NdTrxDealCabinetCardItem> {
            @Override // android.os.Parcelable.Creator
            public final NdTrxDealCabinetCardItem createFromParcel(Parcel parcel) {
                return new NdTrxDealCabinetCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(NdTrxDealCabinetCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NdTrxDealCabinetCardItem[] newArray(int i12) {
                return new NdTrxDealCabinetCardItem[i12];
            }
        }

        public NdTrxDealCabinetCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224448c = str;
            this.f224449d = str2;
            this.f224450e = str3;
            this.f224451f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NdTrxDealCabinetCardItem)) {
                return false;
            }
            NdTrxDealCabinetCardItem ndTrxDealCabinetCardItem = (NdTrxDealCabinetCardItem) obj;
            return L.f(this.f224448c, ndTrxDealCabinetCardItem.f224448c) && L.f(this.f224449d, ndTrxDealCabinetCardItem.f224449d) && L.f(this.f224450e, ndTrxDealCabinetCardItem.f224450e) && L.f(this.f224451f, ndTrxDealCabinetCardItem.f224451f);
        }

        public final int hashCode() {
            return this.f224451f.hashCode() + H.d(H.d(this.f224448c.hashCode() * 31, 31, this.f224449d), 31, this.f224450e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NdTrxDealCabinetCardItem(itemId=");
            sb2.append(this.f224448c);
            sb2.append(", title=");
            sb2.append(this.f224449d);
            sb2.append(", subtitle=");
            sb2.append(this.f224450e);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224451f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224448c);
            parcel.writeString(this.f224449d);
            parcel.writeString(this.f224450e);
            parcel.writeParcelable(this.f224451f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$OrdersCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OrdersCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<OrdersCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224452c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224453d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224454e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f224455f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224456g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f224457h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final Integer f224458i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final Integer f224459j;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OrdersCardItem> {
            @Override // android.os.Parcelable.Creator
            public final OrdersCardItem createFromParcel(Parcel parcel) {
                return new OrdersCardItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(OrdersCardItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final OrdersCardItem[] newArray(int i12) {
                return new OrdersCardItem[i12];
            }
        }

        public OrdersCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k DeepLink deepLink, boolean z12, @InterfaceC42150f @Y61.l Integer num, @InterfaceC42165v @Y61.l Integer num2) {
            super(str, null);
            this.f224452c = str;
            this.f224453d = str2;
            this.f224454e = str3;
            this.f224455f = str4;
            this.f224456g = deepLink;
            this.f224457h = z12;
            this.f224458i = num;
            this.f224459j = num2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrdersCardItem)) {
                return false;
            }
            OrdersCardItem ordersCardItem = (OrdersCardItem) obj;
            return L.f(this.f224452c, ordersCardItem.f224452c) && L.f(this.f224453d, ordersCardItem.f224453d) && L.f(this.f224454e, ordersCardItem.f224454e) && L.f(this.f224455f, ordersCardItem.f224455f) && L.f(this.f224456g, ordersCardItem.f224456g) && this.f224457h == ordersCardItem.f224457h && L.f(this.f224458i, ordersCardItem.f224458i) && L.f(this.f224459j, ordersCardItem.f224459j);
        }

        public final int hashCode() {
            int i12 = r.i(com.avito.android.actions_sheet.a.e(this.f224456g, H.d(H.d(H.d(this.f224452c.hashCode() * 31, 31, this.f224453d), 31, this.f224454e), 31, this.f224455f), 31), 31, this.f224457h);
            Integer num = this.f224458i;
            int iHashCode = (i12 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f224459j;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OrdersCardItem(itemId=");
            sb2.append(this.f224452c);
            sb2.append(", title=");
            sb2.append(this.f224453d);
            sb2.append(", subtitle=");
            sb2.append(this.f224454e);
            sb2.append(", actionTitle=");
            sb2.append(this.f224455f);
            sb2.append(", deepLink=");
            sb2.append(this.f224456g);
            sb2.append(", isActionRequired=");
            sb2.append(this.f224457h);
            sb2.append(", iconAttr=");
            sb2.append(this.f224458i);
            sb2.append(", iconDrawable=");
            return s.j(sb2, this.f224459j, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224452c);
            parcel.writeString(this.f224453d);
            parcel.writeString(this.f224454e);
            parcel.writeString(this.f224455f);
            parcel.writeParcelable(this.f224456g, i12);
            parcel.writeInt(this.f224457h ? 1 : 0);
            Integer num = this.f224458i;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.f224459j;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$PassportCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PassportCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<PassportCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224460c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final InfoCardItem f224461d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ArrayList f224462e;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PassportCardItem> {
            @Override // android.os.Parcelable.Creator
            public final PassportCardItem createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                InfoCardItem infoCardItemCreateFromParcel = InfoCardItem.CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(PassportCardItem.class, parcel, arrayList, iL2, 1);
                }
                return new PassportCardItem(string, infoCardItemCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final PassportCardItem[] newArray(int i12) {
                return new PassportCardItem[i12];
            }
        }

        public PassportCardItem(@Y61.k String str, @Y61.k InfoCardItem infoCardItem, @Y61.k ArrayList arrayList) {
            super(str, null);
            this.f224460c = str;
            this.f224461d = infoCardItem;
            this.f224462e = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassportCardItem)) {
                return false;
            }
            PassportCardItem passportCardItem = (PassportCardItem) obj;
            return L.f(this.f224460c, passportCardItem.f224460c) && L.f(this.f224461d, passportCardItem.f224461d) && L.f(this.f224462e, passportCardItem.f224462e);
        }

        public final int hashCode() {
            return this.f224462e.hashCode() + ((this.f224461d.hashCode() + (this.f224460c.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PassportCardItem(itemId=");
            sb2.append(this.f224460c);
            sb2.append(", infoItem=");
            sb2.append(this.f224461d);
            sb2.append(", profilesList=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f224462e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224460c);
            this.f224461d.writeToParcel(parcel, i12);
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f224462e, parcel);
            while (itZ.hasNext()) {
                parcel.writeParcelable((Parcelable) itZ.next(), i12);
            }
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$PhonesCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhonesCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<PhonesCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224463c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final List<Phone> f224464d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final List<Device> f224465e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Integer f224466f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PhonesCardItem> {
            @Override // android.os.Parcelable.Creator
            public final PhonesCardItem createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(PhonesCardItem.class, parcel, arrayList, iL3, 1);
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(PhonesCardItem.class, parcel, arrayList2, iL2, 1);
                }
                return new PhonesCardItem(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), string, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final PhonesCardItem[] newArray(int i12) {
                return new PhonesCardItem[i12];
            }
        }

        public /* synthetic */ PhonesCardItem(String str, List list, List list2, Integer num, int i12, C42822w c42822w) {
            this((i12 & 8) != 0 ? null : num, str, list, list2);
        }

        @Override // com.avito.android.profile.user_profile.cards.CardItem
        @Y61.k
        public final ProfileWidgetClickEvent.TargetPage L() {
            return ProfileWidgetClickEvent.TargetPage.f224271c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhonesCardItem)) {
                return false;
            }
            PhonesCardItem phonesCardItem = (PhonesCardItem) obj;
            return L.f(this.f224463c, phonesCardItem.f224463c) && L.f(this.f224464d, phonesCardItem.f224464d) && L.f(this.f224465e, phonesCardItem.f224465e) && L.f(this.f224466f, phonesCardItem.f224466f);
        }

        public final int hashCode() {
            int iE2 = H.e(H.e(this.f224463c.hashCode() * 31, 31, this.f224464d), 31, this.f224465e);
            Integer num = this.f224466f;
            return iE2 + (num == null ? 0 : num.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhonesCardItem(itemId=");
            sb2.append(this.f224463c);
            sb2.append(", phones=");
            sb2.append(this.f224464d);
            sb2.append(", devices=");
            sb2.append(this.f224465e);
            sb2.append(", count=");
            return s.j(sb2, this.f224466f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224463c);
            Iterator itJ = C0.j(this.f224464d, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            Iterator itJ2 = C0.j(this.f224465e, parcel);
            while (itJ2.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ2.next(), i12);
            }
            Integer num = this.f224466f;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
        }

        public PhonesCardItem(@Y61.l Integer num, @Y61.k String str, @Y61.k List list, @Y61.k List list2) {
            super(str, null);
            this.f224463c = str;
            this.f224464d = list;
            this.f224465e = list2;
            this.f224466f = num;
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$PhonesEmptyCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhonesEmptyCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<PhonesEmptyCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224467c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final List<Device> f224468d;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PhonesEmptyCardItem> {
            @Override // android.os.Parcelable.Creator
            public final PhonesEmptyCardItem createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(PhonesEmptyCardItem.class, parcel, arrayList, iL2, 1);
                }
                return new PhonesEmptyCardItem(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final PhonesEmptyCardItem[] newArray(int i12) {
                return new PhonesEmptyCardItem[i12];
            }
        }

        public PhonesEmptyCardItem(@Y61.k String str, @Y61.k List<Device> list) {
            super(str, null);
            this.f224467c = str;
            this.f224468d = list;
        }

        @Override // com.avito.android.profile.user_profile.cards.CardItem
        @Y61.k
        public final ProfileWidgetClickEvent.TargetPage L() {
            return ProfileWidgetClickEvent.TargetPage.f224271c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhonesEmptyCardItem)) {
                return false;
            }
            PhonesEmptyCardItem phonesEmptyCardItem = (PhonesEmptyCardItem) obj;
            return L.f(this.f224467c, phonesEmptyCardItem.f224467c) && L.f(this.f224468d, phonesEmptyCardItem.f224468d);
        }

        public final int hashCode() {
            return this.f224468d.hashCode() + (this.f224467c.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhonesEmptyCardItem(itemId=");
            sb2.append(this.f224467c);
            sb2.append(", devices=");
            return H.p(sb2, this.f224468d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224467c);
            Iterator itJ = C0.j(this.f224468d, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$PremierPartnerCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PremierPartnerCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<PremierPartnerCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224469c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224470d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224471e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224472f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PremierPartnerCardItem> {
            @Override // android.os.Parcelable.Creator
            public final PremierPartnerCardItem createFromParcel(Parcel parcel) {
                return new PremierPartnerCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(PremierPartnerCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PremierPartnerCardItem[] newArray(int i12) {
                return new PremierPartnerCardItem[i12];
            }
        }

        public PremierPartnerCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224469c = str;
            this.f224470d = str2;
            this.f224471e = str3;
            this.f224472f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremierPartnerCardItem)) {
                return false;
            }
            PremierPartnerCardItem premierPartnerCardItem = (PremierPartnerCardItem) obj;
            return L.f(this.f224469c, premierPartnerCardItem.f224469c) && L.f(this.f224470d, premierPartnerCardItem.f224470d) && L.f(this.f224471e, premierPartnerCardItem.f224471e) && L.f(this.f224472f, premierPartnerCardItem.f224472f);
        }

        public final int hashCode() {
            return this.f224472f.hashCode() + H.d(H.d(this.f224469c.hashCode() * 31, 31, this.f224470d), 31, this.f224471e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PremierPartnerCardItem(itemId=");
            sb2.append(this.f224469c);
            sb2.append(", title=");
            sb2.append(this.f224470d);
            sb2.append(", subtitle=");
            sb2.append(this.f224471e);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224472f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224469c);
            parcel.writeString(this.f224470d);
            parcel.writeString(this.f224471e);
            parcel.writeParcelable(this.f224472f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ProfileAuctionCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfileAuctionCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ProfileAuctionCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224473c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224474d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224475e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224476f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ProfileAuctionCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ProfileAuctionCardItem createFromParcel(Parcel parcel) {
                return new ProfileAuctionCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ProfileAuctionCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ProfileAuctionCardItem[] newArray(int i12) {
                return new ProfileAuctionCardItem[i12];
            }
        }

        public ProfileAuctionCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224473c = str;
            this.f224474d = str2;
            this.f224475e = str3;
            this.f224476f = deepLink;
        }

        @Override // com.avito.android.profile.user_profile.cards.CardItem
        @Y61.k
        public final ProfileWidgetClickEvent.TargetPage L() {
            return ProfileWidgetClickEvent.TargetPage.f224275g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfileAuctionCardItem)) {
                return false;
            }
            ProfileAuctionCardItem profileAuctionCardItem = (ProfileAuctionCardItem) obj;
            return L.f(this.f224473c, profileAuctionCardItem.f224473c) && L.f(this.f224474d, profileAuctionCardItem.f224474d) && L.f(this.f224475e, profileAuctionCardItem.f224475e) && L.f(this.f224476f, profileAuctionCardItem.f224476f);
        }

        public final int hashCode() {
            return this.f224476f.hashCode() + H.d(H.d(this.f224473c.hashCode() * 31, 31, this.f224474d), 31, this.f224475e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProfileAuctionCardItem(itemId=");
            sb2.append(this.f224473c);
            sb2.append(", title=");
            sb2.append(this.f224474d);
            sb2.append(", subtitle=");
            sb2.append(this.f224475e);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224476f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224473c);
            parcel.writeString(this.f224474d);
            parcel.writeString(this.f224475e);
            parcel.writeParcelable(this.f224476f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ProfileJobMenuCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfileJobMenuCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ProfileJobMenuCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224477c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224478d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224479e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f224480f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224481g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final List<ProfileJobMenuItem.Tile> f224482h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final ProfileJobMenuItem.Tile f224483i;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ProfileJobMenuCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ProfileJobMenuCardItem createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(ProfileJobMenuCardItem.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ProfileJobMenuCardItem.class, parcel, arrayList, iL2, 1);
                }
                return new ProfileJobMenuCardItem(string, string2, string3, string4, deepLink, arrayList, (ProfileJobMenuItem.Tile) parcel.readParcelable(ProfileJobMenuCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ProfileJobMenuCardItem[] newArray(int i12) {
                return new ProfileJobMenuCardItem[i12];
            }
        }

        public ProfileJobMenuCardItem(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k DeepLink deepLink, @Y61.k List<ProfileJobMenuItem.Tile> list, @Y61.l ProfileJobMenuItem.Tile tile) {
            super(str, null);
            this.f224477c = str;
            this.f224478d = str2;
            this.f224479e = str3;
            this.f224480f = str4;
            this.f224481g = deepLink;
            this.f224482h = list;
            this.f224483i = tile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfileJobMenuCardItem)) {
                return false;
            }
            ProfileJobMenuCardItem profileJobMenuCardItem = (ProfileJobMenuCardItem) obj;
            return L.f(this.f224477c, profileJobMenuCardItem.f224477c) && L.f(this.f224478d, profileJobMenuCardItem.f224478d) && L.f(this.f224479e, profileJobMenuCardItem.f224479e) && L.f(this.f224480f, profileJobMenuCardItem.f224480f) && L.f(this.f224481g, profileJobMenuCardItem.f224481g) && L.f(this.f224482h, profileJobMenuCardItem.f224482h) && L.f(this.f224483i, profileJobMenuCardItem.f224483i);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224477c.hashCode() * 31, 31, this.f224478d);
            String str = this.f224479e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f224480f;
            int iE2 = H.e(com.avito.android.actions_sheet.a.e(this.f224481g, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.f224482h);
            ProfileJobMenuItem.Tile tile = this.f224483i;
            return iE2 + (tile != null ? tile.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "ProfileJobMenuCardItem(itemId=" + this.f224477c + ", title=" + this.f224478d + ", additionalButtonTitle=" + this.f224479e + ", badge=" + this.f224480f + ", deepLink=" + this.f224481g + ", tiles=" + this.f224482h + ", topTile=" + this.f224483i + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224477c);
            parcel.writeString(this.f224478d);
            parcel.writeString(this.f224479e);
            parcel.writeString(this.f224480f);
            parcel.writeParcelable(this.f224481g, i12);
            Iterator itJ = C0.j(this.f224482h, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            parcel.writeParcelable(this.f224483i, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ProfileManagementCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfileManagementCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ProfileManagementCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224484c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224485d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224486e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeeplinkAction f224487f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ProfileManagementCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ProfileManagementCardItem createFromParcel(Parcel parcel) {
                return new ProfileManagementCardItem(parcel.readString(), parcel.readString(), (DeeplinkAction) parcel.readParcelable(ProfileManagementCardItem.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ProfileManagementCardItem[] newArray(int i12) {
                return new ProfileManagementCardItem[i12];
            }
        }

        public ProfileManagementCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k DeeplinkAction deeplinkAction, @Y61.l String str3) {
            super(str, null);
            this.f224484c = str;
            this.f224485d = str2;
            this.f224486e = str3;
            this.f224487f = deeplinkAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfileManagementCardItem)) {
                return false;
            }
            ProfileManagementCardItem profileManagementCardItem = (ProfileManagementCardItem) obj;
            return L.f(this.f224484c, profileManagementCardItem.f224484c) && L.f(this.f224485d, profileManagementCardItem.f224485d) && L.f(this.f224486e, profileManagementCardItem.f224486e) && L.f(this.f224487f, profileManagementCardItem.f224487f);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224484c.hashCode() * 31, 31, this.f224485d);
            String str = this.f224486e;
            return this.f224487f.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ProfileManagementCardItem(itemId=" + this.f224484c + ", title=" + this.f224485d + ", subtitle=" + this.f224486e + ", action=" + this.f224487f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224484c);
            parcel.writeString(this.f224485d);
            parcel.writeString(this.f224486e);
            parcel.writeParcelable(this.f224487f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ProfileRemovalItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfileRemovalItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ProfileRemovalItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224488c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224489d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224490e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224491f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ProfileRemovalItem> {
            @Override // android.os.Parcelable.Creator
            public final ProfileRemovalItem createFromParcel(Parcel parcel) {
                return new ProfileRemovalItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ProfileRemovalItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ProfileRemovalItem[] newArray(int i12) {
                return new ProfileRemovalItem[i12];
            }
        }

        public ProfileRemovalItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224488c = str;
            this.f224489d = str2;
            this.f224490e = str3;
            this.f224491f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfileRemovalItem)) {
                return false;
            }
            ProfileRemovalItem profileRemovalItem = (ProfileRemovalItem) obj;
            return L.f(this.f224488c, profileRemovalItem.f224488c) && L.f(this.f224489d, profileRemovalItem.f224489d) && L.f(this.f224490e, profileRemovalItem.f224490e) && L.f(this.f224491f, profileRemovalItem.f224491f);
        }

        public final int hashCode() {
            return this.f224491f.hashCode() + H.d(H.d(this.f224488c.hashCode() * 31, 31, this.f224489d), 31, this.f224490e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProfileRemovalItem(itemId=");
            sb2.append(this.f224488c);
            sb2.append(", title=");
            sb2.append(this.f224489d);
            sb2.append(", subtitle=");
            sb2.append(this.f224490e);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224491f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224488c);
            parcel.writeString(this.f224489d);
            parcel.writeString(this.f224490e);
            parcel.writeParcelable(this.f224491f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$PromoBanner;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PromoBanner extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<PromoBanner> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224492c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final AttributedText f224493d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final AttributedText f224494e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final UniversalColor f224495f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final List<PromoBanner.Image> f224496g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final PromoBanner.ClickAction f224497h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final ParametrizedEvent f224498i;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PromoBanner> {
            @Override // android.os.Parcelable.Creator
            public final PromoBanner createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(PromoBanner.class.getClassLoader());
                AttributedText attributedText2 = (AttributedText) parcel.readParcelable(PromoBanner.class.getClassLoader());
                UniversalColor universalColor = (UniversalColor) parcel.readParcelable(PromoBanner.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(PromoBanner.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new PromoBanner(string, attributedText, attributedText2, universalColor, arrayList, (PromoBanner.ClickAction) parcel.readParcelable(PromoBanner.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(PromoBanner.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PromoBanner[] newArray(int i12) {
                return new PromoBanner[i12];
            }
        }

        public PromoBanner(@Y61.k String str, @Y61.k AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l UniversalColor universalColor, @Y61.l List<PromoBanner.Image> list, @Y61.l PromoBanner.ClickAction clickAction, @Y61.l ParametrizedEvent parametrizedEvent) {
            super(str, null);
            this.f224492c = str;
            this.f224493d = attributedText;
            this.f224494e = attributedText2;
            this.f224495f = universalColor;
            this.f224496g = list;
            this.f224497h = clickAction;
            this.f224498i = parametrizedEvent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromoBanner)) {
                return false;
            }
            PromoBanner promoBanner = (PromoBanner) obj;
            return L.f(this.f224492c, promoBanner.f224492c) && L.f(this.f224493d, promoBanner.f224493d) && L.f(this.f224494e, promoBanner.f224494e) && L.f(this.f224495f, promoBanner.f224495f) && L.f(this.f224496g, promoBanner.f224496g) && L.f(this.f224497h, promoBanner.f224497h) && L.f(this.f224498i, promoBanner.f224498i);
        }

        public final int hashCode() {
            int iB2 = com.avito.android.actions_sheet.a.b(this.f224492c.hashCode() * 31, 31, this.f224493d);
            AttributedText attributedText = this.f224494e;
            int iHashCode = (iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            UniversalColor universalColor = this.f224495f;
            int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            List<PromoBanner.Image> list = this.f224496g;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            PromoBanner.ClickAction clickAction = this.f224497h;
            int iHashCode4 = (iHashCode3 + (clickAction == null ? 0 : clickAction.hashCode())) * 31;
            ParametrizedEvent parametrizedEvent = this.f224498i;
            return iHashCode4 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PromoBanner(itemId=");
            sb2.append(this.f224492c);
            sb2.append(", title=");
            sb2.append(this.f224493d);
            sb2.append(", subtitle=");
            sb2.append(this.f224494e);
            sb2.append(", backgroundColor=");
            sb2.append(this.f224495f);
            sb2.append(", images=");
            sb2.append(this.f224496g);
            sb2.append(", clickAction=");
            sb2.append(this.f224497h);
            sb2.append(", showEvent=");
            return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.f224498i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224492c);
            parcel.writeParcelable(this.f224493d, i12);
            parcel.writeParcelable(this.f224494e, i12);
            parcel.writeParcelable(this.f224495f, i12);
            List<PromoBanner.Image> list = this.f224496g;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), i12);
                }
            }
            parcel.writeParcelable(this.f224497h, i12);
            parcel.writeParcelable(this.f224498i, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$PromotionsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PromotionsCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<PromotionsCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224511c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f224512d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224513e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f224514f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f224515g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f224516h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final PromotionsItem.PromotionsAction f224517i;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PromotionsCardItem> {
            @Override // android.os.Parcelable.Creator
            public final PromotionsCardItem createFromParcel(Parcel parcel) {
                return new PromotionsCardItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (PromotionsItem.PromotionsAction) parcel.readParcelable(PromotionsCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PromotionsCardItem[] newArray(int i12) {
                return new PromotionsCardItem[i12];
            }
        }

        public PromotionsCardItem(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5, boolean z12, @Y61.k PromotionsItem.PromotionsAction promotionsAction) {
            super(str, null);
            this.f224511c = str;
            this.f224512d = str2;
            this.f224513e = str3;
            this.f224514f = str4;
            this.f224515g = str5;
            this.f224516h = z12;
            this.f224517i = promotionsAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromotionsCardItem)) {
                return false;
            }
            PromotionsCardItem promotionsCardItem = (PromotionsCardItem) obj;
            return L.f(this.f224511c, promotionsCardItem.f224511c) && L.f(this.f224512d, promotionsCardItem.f224512d) && L.f(this.f224513e, promotionsCardItem.f224513e) && L.f(this.f224514f, promotionsCardItem.f224514f) && L.f(this.f224515g, promotionsCardItem.f224515g) && this.f224516h == promotionsCardItem.f224516h && L.f(this.f224517i, promotionsCardItem.f224517i);
        }

        public final int hashCode() {
            int iHashCode = this.f224511c.hashCode() * 31;
            String str = this.f224512d;
            int iD2 = H.d(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f224513e), 31, this.f224514f);
            String str2 = this.f224515g;
            return this.f224517i.hashCode() + r.i((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f224516h);
        }

        @Y61.k
        public final String toString() {
            return "PromotionsCardItem(itemId=" + this.f224511c + ", key=" + this.f224512d + ", title=" + this.f224513e + ", description=" + this.f224514f + ", badge=" + this.f224515g + ", showIndicator=" + this.f224516h + ", action=" + this.f224517i + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224511c);
            parcel.writeString(this.f224512d);
            parcel.writeString(this.f224513e);
            parcel.writeString(this.f224514f);
            parcel.writeString(this.f224515g);
            parcel.writeInt(this.f224516h ? 1 : 0);
            parcel.writeParcelable(this.f224517i, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$RecommendationsItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecommendationsItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<RecommendationsItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224518c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224519d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final DeepLink f224520e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ArrayList f224521f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RecommendationsItem> {
            @Override // android.os.Parcelable.Creator
            public final RecommendationsItem createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(RecommendationsItem.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(RecommendationSnippetItem.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new RecommendationsItem(deepLink, string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final RecommendationsItem[] newArray(int i12) {
                return new RecommendationsItem[i12];
            }
        }

        public RecommendationsItem(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.k String str2, @Y61.k ArrayList arrayList) {
            super(str, null);
            this.f224518c = str;
            this.f224519d = str2;
            this.f224520e = deepLink;
            this.f224521f = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecommendationsItem)) {
                return false;
            }
            RecommendationsItem recommendationsItem = (RecommendationsItem) obj;
            return L.f(this.f224518c, recommendationsItem.f224518c) && L.f(this.f224519d, recommendationsItem.f224519d) && L.f(this.f224520e, recommendationsItem.f224520e) && L.f(this.f224521f, recommendationsItem.f224521f);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224518c.hashCode() * 31, 31, this.f224519d);
            DeepLink deepLink = this.f224520e;
            return this.f224521f.hashCode() + ((iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RecommendationsItem(itemId=");
            sb2.append(this.f224518c);
            sb2.append(", title=");
            sb2.append(this.f224519d);
            sb2.append(", deeplink=");
            sb2.append(this.f224520e);
            sb2.append(", items=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f224521f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224518c);
            parcel.writeString(this.f224519d);
            parcel.writeParcelable(this.f224520e, i12);
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f224521f, parcel);
            while (itZ.hasNext()) {
                ((RecommendationSnippetItem) itZ.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ReferralCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReferralCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ReferralCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224522c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224523d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224524e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final UniversalImage f224525f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeeplinkAction f224526g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final String f224527h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f224528i;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReferralCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ReferralCardItem createFromParcel(Parcel parcel) {
                return new ReferralCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(ReferralCardItem.class.getClassLoader()), (DeeplinkAction) parcel.readParcelable(ReferralCardItem.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ReferralCardItem[] newArray(int i12) {
                return new ReferralCardItem[i12];
            }
        }

        public ReferralCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k UniversalImage universalImage, @Y61.k DeeplinkAction deeplinkAction, @Y61.k String str4, @Y61.l String str5) {
            super(str, null);
            this.f224522c = str;
            this.f224523d = str2;
            this.f224524e = str3;
            this.f224525f = universalImage;
            this.f224526g = deeplinkAction;
            this.f224527h = str4;
            this.f224528i = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReferralCardItem)) {
                return false;
            }
            ReferralCardItem referralCardItem = (ReferralCardItem) obj;
            return L.f(this.f224522c, referralCardItem.f224522c) && L.f(this.f224523d, referralCardItem.f224523d) && L.f(this.f224524e, referralCardItem.f224524e) && L.f(this.f224525f, referralCardItem.f224525f) && L.f(this.f224526g, referralCardItem.f224526g) && L.f(this.f224527h, referralCardItem.f224527h) && L.f(this.f224528i, referralCardItem.f224528i);
        }

        public final int hashCode() {
            int iD2 = H.d((this.f224526g.hashCode() + com.avito.android.actions_sheet.a.a(H.d(H.d(this.f224522c.hashCode() * 31, 31, this.f224523d), 31, this.f224524e), 31, this.f224525f)) * 31, 31, this.f224527h);
            String str = this.f224528i;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReferralCardItem(itemId=");
            sb2.append(this.f224522c);
            sb2.append(", title=");
            sb2.append(this.f224523d);
            sb2.append(", description=");
            sb2.append(this.f224524e);
            sb2.append(", image=");
            sb2.append(this.f224525f);
            sb2.append(", action=");
            sb2.append(this.f224526g);
            sb2.append(", userType=");
            sb2.append(this.f224527h);
            sb2.append(", badge=");
            return C22026a.c(sb2, this.f224528i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224522c);
            parcel.writeString(this.f224523d);
            parcel.writeString(this.f224524e);
            parcel.writeParcelable(this.f224525f, i12);
            parcel.writeParcelable(this.f224526g, i12);
            parcel.writeString(this.f224527h);
            parcel.writeString(this.f224528i);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ReviewsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReviewsCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ReviewsCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224529c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224530d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224531e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Action f224532f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewsCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ReviewsCardItem createFromParcel(Parcel parcel) {
                return new ReviewsCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(ReviewsCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewsCardItem[] newArray(int i12) {
                return new ReviewsCardItem[i12];
            }
        }

        public ReviewsCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k Action action) {
            super(str, null);
            this.f224529c = str;
            this.f224530d = str2;
            this.f224531e = str3;
            this.f224532f = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewsCardItem)) {
                return false;
            }
            ReviewsCardItem reviewsCardItem = (ReviewsCardItem) obj;
            return L.f(this.f224529c, reviewsCardItem.f224529c) && L.f(this.f224530d, reviewsCardItem.f224530d) && L.f(this.f224531e, reviewsCardItem.f224531e) && L.f(this.f224532f, reviewsCardItem.f224532f);
        }

        public final int hashCode() {
            return this.f224532f.hashCode() + H.d(H.d(this.f224529c.hashCode() * 31, 31, this.f224530d), 31, this.f224531e);
        }

        @Y61.k
        public final String toString() {
            return "ReviewsCardItem(itemId=" + this.f224529c + ", title=" + this.f224530d + ", reviews=" + this.f224531e + ", action=" + this.f224532f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224529c);
            parcel.writeString(this.f224530d);
            parcel.writeString(this.f224531e);
            parcel.writeParcelable(this.f224532f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$RewardsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RewardsCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<RewardsCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224533c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224534d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224535e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final UniversalImage f224536f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224537g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f224538h;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RewardsCardItem> {
            @Override // android.os.Parcelable.Creator
            public final RewardsCardItem createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                return new RewardsCardItem((DeepLink) parcel.readParcelable(RewardsCardItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(RewardsCardItem.class.getClassLoader()), string, string2, string3, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RewardsCardItem[] newArray(int i12) {
                return new RewardsCardItem[i12];
            }
        }

        public RewardsCardItem(@Y61.k DeepLink deepLink, @Y61.l UniversalImage universalImage, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4) {
            super(str, null);
            this.f224533c = str;
            this.f224534d = str2;
            this.f224535e = str3;
            this.f224536f = universalImage;
            this.f224537g = deepLink;
            this.f224538h = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsCardItem)) {
                return false;
            }
            RewardsCardItem rewardsCardItem = (RewardsCardItem) obj;
            return L.f(this.f224533c, rewardsCardItem.f224533c) && L.f(this.f224534d, rewardsCardItem.f224534d) && L.f(this.f224535e, rewardsCardItem.f224535e) && L.f(this.f224536f, rewardsCardItem.f224536f) && L.f(this.f224537g, rewardsCardItem.f224537g) && L.f(this.f224538h, rewardsCardItem.f224538h);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224533c.hashCode() * 31, 31, this.f224534d);
            String str = this.f224535e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            UniversalImage universalImage = this.f224536f;
            int iE2 = com.avito.android.actions_sheet.a.e(this.f224537g, (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31);
            String str2 = this.f224538h;
            return iE2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RewardsCardItem(itemId=");
            sb2.append(this.f224533c);
            sb2.append(", title=");
            sb2.append(this.f224534d);
            sb2.append(", description=");
            sb2.append(this.f224535e);
            sb2.append(", image=");
            sb2.append(this.f224536f);
            sb2.append(", deeplink=");
            sb2.append(this.f224537g);
            sb2.append(", badge=");
            return C22026a.c(sb2, this.f224538h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224533c);
            parcel.writeString(this.f224534d);
            parcel.writeString(this.f224535e);
            parcel.writeParcelable(this.f224536f, i12);
            parcel.writeParcelable(this.f224537g, i12);
            parcel.writeString(this.f224538h);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$RfpCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RfpCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<RfpCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224539c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224540d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224541e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f224542f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224543g;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RfpCardItem> {
            @Override // android.os.Parcelable.Creator
            public final RfpCardItem createFromParcel(Parcel parcel) {
                return new RfpCardItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(RfpCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final RfpCardItem[] newArray(int i12) {
                return new RfpCardItem[i12];
            }
        }

        public RfpCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224539c = str;
            this.f224540d = str2;
            this.f224541e = str3;
            this.f224542f = str4;
            this.f224543g = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RfpCardItem)) {
                return false;
            }
            RfpCardItem rfpCardItem = (RfpCardItem) obj;
            return L.f(this.f224539c, rfpCardItem.f224539c) && L.f(this.f224540d, rfpCardItem.f224540d) && L.f(this.f224541e, rfpCardItem.f224541e) && L.f(this.f224542f, rfpCardItem.f224542f) && L.f(this.f224543g, rfpCardItem.f224543g);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f224539c.hashCode() * 31, 31, this.f224540d), 31, this.f224541e);
            String str = this.f224542f;
            return this.f224543g.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RfpCardItem(itemId=");
            sb2.append(this.f224539c);
            sb2.append(", title=");
            sb2.append(this.f224540d);
            sb2.append(", subtitle=");
            sb2.append(this.f224541e);
            sb2.append(", counter=");
            sb2.append(this.f224542f);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224543g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224539c);
            parcel.writeString(this.f224540d);
            parcel.writeString(this.f224541e);
            parcel.writeString(this.f224542f);
            parcel.writeParcelable(this.f224543g, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$SafeDealSettingsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SafeDealSettingsCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<SafeDealSettingsCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224544c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224545d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224546e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224547f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SafeDealSettingsCardItem> {
            @Override // android.os.Parcelable.Creator
            public final SafeDealSettingsCardItem createFromParcel(Parcel parcel) {
                return new SafeDealSettingsCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SafeDealSettingsCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SafeDealSettingsCardItem[] newArray(int i12) {
                return new SafeDealSettingsCardItem[i12];
            }
        }

        public SafeDealSettingsCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224544c = str;
            this.f224545d = str2;
            this.f224546e = str3;
            this.f224547f = deepLink;
        }

        @Override // com.avito.android.profile.user_profile.cards.CardItem
        @Y61.k
        public final ProfileWidgetClickEvent.TargetPage L() {
            return ProfileWidgetClickEvent.TargetPage.f224274f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SafeDealSettingsCardItem)) {
                return false;
            }
            SafeDealSettingsCardItem safeDealSettingsCardItem = (SafeDealSettingsCardItem) obj;
            return L.f(this.f224544c, safeDealSettingsCardItem.f224544c) && L.f(this.f224545d, safeDealSettingsCardItem.f224545d) && L.f(this.f224546e, safeDealSettingsCardItem.f224546e) && L.f(this.f224547f, safeDealSettingsCardItem.f224547f);
        }

        public final int hashCode() {
            return this.f224547f.hashCode() + H.d(H.d(this.f224544c.hashCode() * 31, 31, this.f224545d), 31, this.f224546e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SafeDealSettingsCardItem(itemId=");
            sb2.append(this.f224544c);
            sb2.append(", title=");
            sb2.append(this.f224545d);
            sb2.append(", subtitle=");
            sb2.append(this.f224546e);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224547f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224544c);
            parcel.writeString(this.f224545d);
            parcel.writeString(this.f224546e);
            parcel.writeParcelable(this.f224547f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$SafetyCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SafetyCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<SafetyCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224548c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224549d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224550e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224551f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SafetyCardItem> {
            @Override // android.os.Parcelable.Creator
            public final SafetyCardItem createFromParcel(Parcel parcel) {
                return new SafetyCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SafetyCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SafetyCardItem[] newArray(int i12) {
                return new SafetyCardItem[i12];
            }
        }

        public SafetyCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224548c = str;
            this.f224549d = str2;
            this.f224550e = str3;
            this.f224551f = deepLink;
        }

        @Override // com.avito.android.profile.user_profile.cards.CardItem
        @Y61.k
        public final ProfileWidgetClickEvent.TargetPage L() {
            return ProfileWidgetClickEvent.TargetPage.f224279k;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SafetyCardItem)) {
                return false;
            }
            SafetyCardItem safetyCardItem = (SafetyCardItem) obj;
            return L.f(this.f224548c, safetyCardItem.f224548c) && L.f(this.f224549d, safetyCardItem.f224549d) && L.f(this.f224550e, safetyCardItem.f224550e) && L.f(this.f224551f, safetyCardItem.f224551f);
        }

        public final int hashCode() {
            return this.f224551f.hashCode() + H.d(H.d(this.f224548c.hashCode() * 31, 31, this.f224549d), 31, this.f224550e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SafetyCardItem(itemId=");
            sb2.append(this.f224548c);
            sb2.append(", title=");
            sb2.append(this.f224549d);
            sb2.append(", subtitle=");
            sb2.append(this.f224550e);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224551f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224548c);
            parcel.writeString(this.f224549d);
            parcel.writeString(this.f224550e);
            parcel.writeParcelable(this.f224551f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$SbcDispatchesCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SbcDispatchesCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<SbcDispatchesCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224552c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224553d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224554e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224555f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SbcDispatchesCardItem> {
            @Override // android.os.Parcelable.Creator
            public final SbcDispatchesCardItem createFromParcel(Parcel parcel) {
                return new SbcDispatchesCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SbcDispatchesCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SbcDispatchesCardItem[] newArray(int i12) {
                return new SbcDispatchesCardItem[i12];
            }
        }

        public SbcDispatchesCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224552c = str;
            this.f224553d = str2;
            this.f224554e = str3;
            this.f224555f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SbcDispatchesCardItem)) {
                return false;
            }
            SbcDispatchesCardItem sbcDispatchesCardItem = (SbcDispatchesCardItem) obj;
            return L.f(this.f224552c, sbcDispatchesCardItem.f224552c) && L.f(this.f224553d, sbcDispatchesCardItem.f224553d) && L.f(this.f224554e, sbcDispatchesCardItem.f224554e) && L.f(this.f224555f, sbcDispatchesCardItem.f224555f);
        }

        public final int hashCode() {
            return this.f224555f.hashCode() + H.d(H.d(this.f224552c.hashCode() * 31, 31, this.f224553d), 31, this.f224554e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SbcDispatchesCardItem(itemId=");
            sb2.append(this.f224552c);
            sb2.append(", title=");
            sb2.append(this.f224553d);
            sb2.append(", subtitle=");
            sb2.append(this.f224554e);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224555f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224552c);
            parcel.writeString(this.f224553d);
            parcel.writeString(this.f224554e);
            parcel.writeParcelable(this.f224555f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$SeparateWalletCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SeparateWalletCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<SeparateWalletCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224556c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final SeparateBalance f224557d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224558e;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SeparateWalletCardItem> {
            @Override // android.os.Parcelable.Creator
            public final SeparateWalletCardItem createFromParcel(Parcel parcel) {
                return new SeparateWalletCardItem(parcel.readString(), (SeparateBalance) parcel.readParcelable(SeparateWalletCardItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(SeparateWalletCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SeparateWalletCardItem[] newArray(int i12) {
                return new SeparateWalletCardItem[i12];
            }
        }

        public SeparateWalletCardItem(@Y61.k String str, @Y61.k SeparateBalance separateBalance, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224556c = str;
            this.f224557d = separateBalance;
            this.f224558e = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SeparateWalletCardItem)) {
                return false;
            }
            SeparateWalletCardItem separateWalletCardItem = (SeparateWalletCardItem) obj;
            return L.f(this.f224556c, separateWalletCardItem.f224556c) && L.f(this.f224557d, separateWalletCardItem.f224557d) && L.f(this.f224558e, separateWalletCardItem.f224558e);
        }

        public final int hashCode() {
            return this.f224558e.hashCode() + ((this.f224557d.hashCode() + (this.f224556c.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SeparateWalletCardItem(itemId=");
            sb2.append(this.f224556c);
            sb2.append(", balance=");
            sb2.append(this.f224557d);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224558e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224556c);
            parcel.writeParcelable(this.f224557d, i12);
            parcel.writeParcelable(this.f224558e, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ServiceBookingCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceBookingCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ServiceBookingCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224559c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f224560d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224561e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f224562f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f224563g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final ServiceBookingItem.Action f224564h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final List<ParcelableItem> f224565i;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingCardItem createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                int iL2 = 0;
                boolean z12 = parcel.readInt() != 0;
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                ServiceBookingItem.Action action = (ServiceBookingItem.Action) parcel.readParcelable(ServiceBookingCardItem.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(ServiceBookingCardItem.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new ServiceBookingCardItem(string, z12, string2, string3, string4, action, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingCardItem[] newArray(int i12) {
                return new ServiceBookingCardItem[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ServiceBookingCardItem(@Y61.k String str, boolean z12, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k ServiceBookingItem.Action action, @Y61.l List<? extends ParcelableItem> list) {
            super(str, null);
            this.f224559c = str;
            this.f224560d = z12;
            this.f224561e = str2;
            this.f224562f = str3;
            this.f224563g = str4;
            this.f224564h = action;
            this.f224565i = list;
        }

        public static ServiceBookingCardItem g0(ServiceBookingCardItem serviceBookingCardItem, String str, String str2, List list) {
            String str3 = serviceBookingCardItem.f224559c;
            String str4 = serviceBookingCardItem.f224561e;
            ServiceBookingItem.Action action = serviceBookingCardItem.f224564h;
            serviceBookingCardItem.getClass();
            return new ServiceBookingCardItem(str3, false, str4, str, str2, action, list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceBookingCardItem)) {
                return false;
            }
            ServiceBookingCardItem serviceBookingCardItem = (ServiceBookingCardItem) obj;
            return L.f(this.f224559c, serviceBookingCardItem.f224559c) && this.f224560d == serviceBookingCardItem.f224560d && L.f(this.f224561e, serviceBookingCardItem.f224561e) && L.f(this.f224562f, serviceBookingCardItem.f224562f) && L.f(this.f224563g, serviceBookingCardItem.f224563g) && L.f(this.f224564h, serviceBookingCardItem.f224564h) && L.f(this.f224565i, serviceBookingCardItem.f224565i);
        }

        public final int hashCode() {
            int iD2 = H.d(r.i(this.f224559c.hashCode() * 31, 31, this.f224560d), 31, this.f224561e);
            String str = this.f224562f;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f224563g;
            int iHashCode2 = (this.f224564h.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            List<ParcelableItem> list = this.f224565i;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceBookingCardItem(itemId=");
            sb2.append(this.f224559c);
            sb2.append(", isLoading=");
            sb2.append(this.f224560d);
            sb2.append(", title=");
            sb2.append(this.f224561e);
            sb2.append(", subtitle=");
            sb2.append(this.f224562f);
            sb2.append(", badgeText=");
            sb2.append(this.f224563g);
            sb2.append(", action=");
            sb2.append(this.f224564h);
            sb2.append(", orders=");
            return H.p(sb2, this.f224565i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224559c);
            parcel.writeInt(this.f224560d ? 1 : 0);
            parcel.writeString(this.f224561e);
            parcel.writeString(this.f224562f);
            parcel.writeString(this.f224563g);
            parcel.writeParcelable(this.f224564h, i12);
            List<ParcelableItem> list = this.f224565i;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$ServicesSellerSubscriptionCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServicesSellerSubscriptionCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<ServicesSellerSubscriptionCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224566c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224567d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224568e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f224569f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f224570g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final ServicesSellerSubscriptionItem.Action f224571h;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServicesSellerSubscriptionCardItem> {
            @Override // android.os.Parcelable.Creator
            public final ServicesSellerSubscriptionCardItem createFromParcel(Parcel parcel) {
                return new ServicesSellerSubscriptionCardItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ServicesSellerSubscriptionItem.Action) parcel.readParcelable(ServicesSellerSubscriptionCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ServicesSellerSubscriptionCardItem[] newArray(int i12) {
                return new ServicesSellerSubscriptionCardItem[i12];
            }
        }

        public ServicesSellerSubscriptionCardItem(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k ServicesSellerSubscriptionItem.Action action) {
            super(str, null);
            this.f224566c = str;
            this.f224567d = str2;
            this.f224568e = str3;
            this.f224569f = str4;
            this.f224570g = str5;
            this.f224571h = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServicesSellerSubscriptionCardItem)) {
                return false;
            }
            ServicesSellerSubscriptionCardItem servicesSellerSubscriptionCardItem = (ServicesSellerSubscriptionCardItem) obj;
            return L.f(this.f224566c, servicesSellerSubscriptionCardItem.f224566c) && L.f(this.f224567d, servicesSellerSubscriptionCardItem.f224567d) && L.f(this.f224568e, servicesSellerSubscriptionCardItem.f224568e) && L.f(this.f224569f, servicesSellerSubscriptionCardItem.f224569f) && L.f(this.f224570g, servicesSellerSubscriptionCardItem.f224570g) && L.f(this.f224571h, servicesSellerSubscriptionCardItem.f224571h);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224566c.hashCode() * 31, 31, this.f224567d);
            String str = this.f224568e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f224569f;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f224570g;
            return this.f224571h.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ServicesSellerSubscriptionCardItem(itemId=" + this.f224566c + ", title=" + this.f224567d + ", subtitle=" + this.f224568e + ", badgeText=" + this.f224569f + ", targetPage=" + this.f224570g + ", action=" + this.f224571h + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224566c);
            parcel.writeString(this.f224567d);
            parcel.writeString(this.f224568e);
            parcel.writeString(this.f224569f);
            parcel.writeString(this.f224570g);
            parcel.writeParcelable(this.f224571h, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$SessionsCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SessionsCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<SessionsCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224572c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224573d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224574e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final DeepLink f224575f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SessionsCardItem> {
            @Override // android.os.Parcelable.Creator
            public final SessionsCardItem createFromParcel(Parcel parcel) {
                return new SessionsCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SessionsCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SessionsCardItem[] newArray(int i12) {
                return new SessionsCardItem[i12];
            }
        }

        public SessionsCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l DeepLink deepLink) {
            super(str, null);
            this.f224572c = str;
            this.f224573d = str2;
            this.f224574e = str3;
            this.f224575f = deepLink;
        }

        @Override // com.avito.android.profile.user_profile.cards.CardItem
        @Y61.k
        public final ProfileWidgetClickEvent.TargetPage L() {
            return ProfileWidgetClickEvent.TargetPage.f224278j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionsCardItem)) {
                return false;
            }
            SessionsCardItem sessionsCardItem = (SessionsCardItem) obj;
            return L.f(this.f224572c, sessionsCardItem.f224572c) && L.f(this.f224573d, sessionsCardItem.f224573d) && L.f(this.f224574e, sessionsCardItem.f224574e) && L.f(this.f224575f, sessionsCardItem.f224575f);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f224572c.hashCode() * 31, 31, this.f224573d), 31, this.f224574e);
            DeepLink deepLink = this.f224575f;
            return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SessionsCardItem(itemId=");
            sb2.append(this.f224572c);
            sb2.append(", title=");
            sb2.append(this.f224573d);
            sb2.append(", subtitle=");
            sb2.append(this.f224574e);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224575f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224572c);
            parcel.writeString(this.f224573d);
            parcel.writeString(this.f224574e);
            parcel.writeParcelable(this.f224575f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$SilentUpdateItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SilentUpdateItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<SilentUpdateItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final PromoBlockItem f224581c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final SilentUpdateConfig f224582d;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SilentUpdateItem> {
            @Override // android.os.Parcelable.Creator
            public final SilentUpdateItem createFromParcel(Parcel parcel) {
                return new SilentUpdateItem(PromoBlockItem.CREATOR.createFromParcel(parcel), SilentUpdateConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SilentUpdateItem[] newArray(int i12) {
                return new SilentUpdateItem[i12];
            }
        }

        public SilentUpdateItem(@Y61.k PromoBlockItem promoBlockItem, @Y61.k SilentUpdateConfig silentUpdateConfig) {
            super(promoBlockItem.f224499c, null);
            this.f224581c = promoBlockItem;
            this.f224582d = silentUpdateConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SilentUpdateItem)) {
                return false;
            }
            SilentUpdateItem silentUpdateItem = (SilentUpdateItem) obj;
            return L.f(this.f224581c, silentUpdateItem.f224581c) && L.f(this.f224582d, silentUpdateItem.f224582d);
        }

        public final int hashCode() {
            return this.f224582d.hashCode() + (this.f224581c.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "SilentUpdateItem(promoBlock=" + this.f224581c + ", config=" + this.f224582d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            this.f224581c.writeToParcel(parcel, i12);
            this.f224582d.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$SilentUpdateSettings;", "Landroid/os/Parcelable;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SilentUpdateSettings implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<SilentUpdateSettings> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f224583b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ShortTask.BackoffPolicy f224584c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Long f224585d;

        /* renamed from: e, reason: collision with root package name */
        public final long f224586e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f224587f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f224588g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f224589h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f224590i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final Long f224591j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final ShortTask.NetworkState f224592k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f224593l;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SilentUpdateSettings> {
            @Override // android.os.Parcelable.Creator
            public final SilentUpdateSettings createFromParcel(Parcel parcel) {
                return new SilentUpdateSettings(parcel.readLong(), ShortTask.BackoffPolicy.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), ShortTask.NetworkState.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SilentUpdateSettings[] newArray(int i12) {
                return new SilentUpdateSettings[i12];
            }
        }

        public SilentUpdateSettings(long j12, @Y61.k ShortTask.BackoffPolicy backoffPolicy, @Y61.l Long l12, long j13, boolean z12, boolean z13, boolean z14, boolean z15, @Y61.l Long l13, @Y61.k ShortTask.NetworkState networkState, boolean z16) {
            this.f224583b = j12;
            this.f224584c = backoffPolicy;
            this.f224585d = l12;
            this.f224586e = j13;
            this.f224587f = z12;
            this.f224588g = z13;
            this.f224589h = z14;
            this.f224590i = z15;
            this.f224591j = l13;
            this.f224592k = networkState;
            this.f224593l = z16;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SilentUpdateSettings)) {
                return false;
            }
            SilentUpdateSettings silentUpdateSettings = (SilentUpdateSettings) obj;
            return this.f224583b == silentUpdateSettings.f224583b && this.f224584c == silentUpdateSettings.f224584c && L.f(this.f224585d, silentUpdateSettings.f224585d) && this.f224586e == silentUpdateSettings.f224586e && this.f224587f == silentUpdateSettings.f224587f && this.f224588g == silentUpdateSettings.f224588g && this.f224589h == silentUpdateSettings.f224589h && this.f224590i == silentUpdateSettings.f224590i && L.f(this.f224591j, silentUpdateSettings.f224591j) && this.f224592k == silentUpdateSettings.f224592k && this.f224593l == silentUpdateSettings.f224593l;
        }

        public final int hashCode() {
            int iHashCode = (this.f224584c.hashCode() + (Long.hashCode(this.f224583b) * 31)) * 31;
            Long l12 = this.f224585d;
            int i12 = r.i(r.i(r.i(r.i(r.g((iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.f224586e), 31, this.f224587f), 31, this.f224588g), 31, this.f224589h), 31, this.f224590i);
            Long l13 = this.f224591j;
            return Boolean.hashCode(this.f224593l) + ((this.f224592k.hashCode() + ((i12 + (l13 != null ? l13.hashCode() : 0)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SilentUpdateSettings(backoffDelayMs=");
            sb2.append(this.f224583b);
            sb2.append(", backoffPolicy=");
            sb2.append(this.f224584c);
            sb2.append(", flexIntervalMs=");
            sb2.append(this.f224585d);
            sb2.append(", initialDelayMs=");
            sb2.append(this.f224586e);
            sb2.append(", isBatteryNotLowRequired=");
            sb2.append(this.f224587f);
            sb2.append(", isChargingRequired=");
            sb2.append(this.f224588g);
            sb2.append(", isDeviceIdleRequired=");
            sb2.append(this.f224589h);
            sb2.append(", isStorageNotLowRequired=");
            sb2.append(this.f224590i);
            sb2.append(", repeatIntervalMs=");
            sb2.append(this.f224591j);
            sb2.append(", requiredNetworkState=");
            sb2.append(this.f224592k);
            sb2.append(", updateCurrent=");
            return r.x(sb2, this.f224593l, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeLong(this.f224583b);
            parcel.writeString(this.f224584c.name());
            Long l12 = this.f224585d;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeLong(this.f224586e);
            parcel.writeInt(this.f224587f ? 1 : 0);
            parcel.writeInt(this.f224588g ? 1 : 0);
            parcel.writeInt(this.f224589h ? 1 : 0);
            parcel.writeInt(this.f224590i ? 1 : 0);
            Long l13 = this.f224591j;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l13);
            }
            parcel.writeString(this.f224592k.name());
            parcel.writeInt(this.f224593l ? 1 : 0);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$SimpleCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SimpleCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<SimpleCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224594c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224595d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224596e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224597f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SimpleCardItem> {
            @Override // android.os.Parcelable.Creator
            public final SimpleCardItem createFromParcel(Parcel parcel) {
                return new SimpleCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SimpleCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SimpleCardItem[] newArray(int i12) {
                return new SimpleCardItem[i12];
            }
        }

        public SimpleCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224594c = str;
            this.f224595d = str2;
            this.f224596e = str3;
            this.f224597f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SimpleCardItem)) {
                return false;
            }
            SimpleCardItem simpleCardItem = (SimpleCardItem) obj;
            return L.f(this.f224594c, simpleCardItem.f224594c) && L.f(this.f224595d, simpleCardItem.f224595d) && L.f(this.f224596e, simpleCardItem.f224596e) && L.f(this.f224597f, simpleCardItem.f224597f);
        }

        public final int hashCode() {
            return this.f224597f.hashCode() + H.d(H.d(this.f224594c.hashCode() * 31, 31, this.f224595d), 31, this.f224596e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SimpleCardItem(itemId=");
            sb2.append(this.f224594c);
            sb2.append(", title=");
            sb2.append(this.f224595d);
            sb2.append(", subtitle=");
            sb2.append(this.f224596e);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224597f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224594c);
            parcel.writeString(this.f224595d);
            parcel.writeString(this.f224596e);
            parcel.writeParcelable(this.f224597f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$SocialCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SocialCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<SocialCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224598c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final List<SocialNetwork> f224599d;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SocialCardItem> {
            @Override // android.os.Parcelable.Creator
            public final SocialCardItem createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(SocialCardItem.class, parcel, arrayList, iL2, 1);
                }
                return new SocialCardItem(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final SocialCardItem[] newArray(int i12) {
                return new SocialCardItem[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SocialCardItem(@Y61.k String str, @Y61.k List<? extends SocialNetwork> list) {
            super(str, null);
            this.f224598c = str;
            this.f224599d = list;
        }

        @Override // com.avito.android.profile.user_profile.cards.CardItem
        @Y61.k
        public final ProfileWidgetClickEvent.TargetPage L() {
            return ProfileWidgetClickEvent.TargetPage.f224272d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SocialCardItem)) {
                return false;
            }
            SocialCardItem socialCardItem = (SocialCardItem) obj;
            return L.f(this.f224598c, socialCardItem.f224598c) && L.f(this.f224599d, socialCardItem.f224599d);
        }

        public final int hashCode() {
            return this.f224599d.hashCode() + (this.f224598c.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SocialCardItem(itemId=");
            sb2.append(this.f224598c);
            sb2.append(", socialNetworks=");
            return H.p(sb2, this.f224599d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224598c);
            Iterator itJ = C0.j(this.f224599d, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$SpecialMachineryRentalItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SpecialMachineryRentalItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<SpecialMachineryRentalItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224600c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224601d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224602e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224603f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SpecialMachineryRentalItem> {
            @Override // android.os.Parcelable.Creator
            public final SpecialMachineryRentalItem createFromParcel(Parcel parcel) {
                return new SpecialMachineryRentalItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SpecialMachineryRentalItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SpecialMachineryRentalItem[] newArray(int i12) {
                return new SpecialMachineryRentalItem[i12];
            }
        }

        public SpecialMachineryRentalItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
            super(str, null);
            this.f224600c = str;
            this.f224601d = str2;
            this.f224602e = str3;
            this.f224603f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpecialMachineryRentalItem)) {
                return false;
            }
            SpecialMachineryRentalItem specialMachineryRentalItem = (SpecialMachineryRentalItem) obj;
            return L.f(this.f224600c, specialMachineryRentalItem.f224600c) && L.f(this.f224601d, specialMachineryRentalItem.f224601d) && L.f(this.f224602e, specialMachineryRentalItem.f224602e) && L.f(this.f224603f, specialMachineryRentalItem.f224603f);
        }

        public final int hashCode() {
            return this.f224603f.hashCode() + H.d(H.d(this.f224600c.hashCode() * 31, 31, this.f224601d), 31, this.f224602e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SpecialMachineryRentalItem(itemId=");
            sb2.append(this.f224600c);
            sb2.append(", title=");
            sb2.append(this.f224601d);
            sb2.append(", subtitle=");
            sb2.append(this.f224602e);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f224603f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224600c);
            parcel.writeString(this.f224601d);
            parcel.writeString(this.f224602e);
            parcel.writeParcelable(this.f224603f, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$StrOrdersCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StrOrdersCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<StrOrdersCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224604c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224605d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224606e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f224607f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224608g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f224609h;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StrOrdersCardItem> {
            @Override // android.os.Parcelable.Creator
            public final StrOrdersCardItem createFromParcel(Parcel parcel) {
                return new StrOrdersCardItem((DeepLink) parcel.readParcelable(StrOrdersCardItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final StrOrdersCardItem[] newArray(int i12) {
                return new StrOrdersCardItem[i12];
            }
        }

        public StrOrdersCardItem(@Y61.k DeepLink deepLink, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k String str4, boolean z12) {
            super(str, null);
            this.f224604c = str;
            this.f224605d = str2;
            this.f224606e = str3;
            this.f224607f = str4;
            this.f224608g = deepLink;
            this.f224609h = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StrOrdersCardItem)) {
                return false;
            }
            StrOrdersCardItem strOrdersCardItem = (StrOrdersCardItem) obj;
            return L.f(this.f224604c, strOrdersCardItem.f224604c) && L.f(this.f224605d, strOrdersCardItem.f224605d) && L.f(this.f224606e, strOrdersCardItem.f224606e) && L.f(this.f224607f, strOrdersCardItem.f224607f) && L.f(this.f224608g, strOrdersCardItem.f224608g) && this.f224609h == strOrdersCardItem.f224609h;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224604c.hashCode() * 31, 31, this.f224605d);
            String str = this.f224606e;
            return Boolean.hashCode(this.f224609h) + com.avito.android.actions_sheet.a.e(this.f224608g, H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f224607f), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StrOrdersCardItem(itemId=");
            sb2.append(this.f224604c);
            sb2.append(", title=");
            sb2.append(this.f224605d);
            sb2.append(", subtitle=");
            sb2.append(this.f224606e);
            sb2.append(", actionTitle=");
            sb2.append(this.f224607f);
            sb2.append(", deepLink=");
            sb2.append(this.f224608g);
            sb2.append(", isActionRequired=");
            return r.x(sb2, this.f224609h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224604c);
            parcel.writeString(this.f224605d);
            parcel.writeString(this.f224606e);
            parcel.writeString(this.f224607f);
            parcel.writeParcelable(this.f224608g, i12);
            parcel.writeInt(this.f224609h ? 1 : 0);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$TariffCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TariffCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<TariffCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224610c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224611d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224612e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final AttributedText f224613f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f224614g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Action f224615h;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TariffCardItem> {
            @Override // android.os.Parcelable.Creator
            public final TariffCardItem createFromParcel(Parcel parcel) {
                return new TariffCardItem(parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(TariffCardItem.class.getClassLoader()), parcel.readInt() != 0, (Action) parcel.readParcelable(TariffCardItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final TariffCardItem[] newArray(int i12) {
                return new TariffCardItem[i12];
            }
        }

        public TariffCardItem(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l AttributedText attributedText, boolean z12, @Y61.l Action action) {
            super(str, null);
            this.f224610c = str;
            this.f224611d = str2;
            this.f224612e = str3;
            this.f224613f = attributedText;
            this.f224614g = z12;
            this.f224615h = action;
        }

        @Override // com.avito.android.profile.user_profile.cards.CardItem
        @Y61.k
        public final ProfileWidgetClickEvent.TargetPage L() {
            return ProfileWidgetClickEvent.TargetPage.f224273e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TariffCardItem)) {
                return false;
            }
            TariffCardItem tariffCardItem = (TariffCardItem) obj;
            return L.f(this.f224610c, tariffCardItem.f224610c) && L.f(this.f224611d, tariffCardItem.f224611d) && L.f(this.f224612e, tariffCardItem.f224612e) && L.f(this.f224613f, tariffCardItem.f224613f) && this.f224614g == tariffCardItem.f224614g && L.f(this.f224615h, tariffCardItem.f224615h);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224610c.hashCode() * 31, 31, this.f224611d);
            String str = this.f224612e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.f224613f;
            int i12 = r.i((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f224614g);
            Action action = this.f224615h;
            return i12 + (action != null ? action.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "TariffCardItem(itemId=" + this.f224610c + ", title=" + this.f224611d + ", subtitle=" + this.f224612e + ", subtitleAttributed=" + this.f224613f + ", isActive=" + this.f224614g + ", action=" + this.f224615h + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224610c);
            parcel.writeString(this.f224611d);
            parcel.writeString(this.f224612e);
            parcel.writeParcelable(this.f224613f, i12);
            parcel.writeInt(this.f224614g ? 1 : 0);
            parcel.writeParcelable(this.f224615h, i12);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$VirtualDealRoomCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VirtualDealRoomCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<VirtualDealRoomCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224616c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224617d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224618e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeeplinkAction f224619f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f224620g;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VirtualDealRoomCardItem> {
            @Override // android.os.Parcelable.Creator
            public final VirtualDealRoomCardItem createFromParcel(Parcel parcel) {
                return new VirtualDealRoomCardItem((DeeplinkAction) parcel.readParcelable(VirtualDealRoomCardItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VirtualDealRoomCardItem[] newArray(int i12) {
                return new VirtualDealRoomCardItem[i12];
            }
        }

        public VirtualDealRoomCardItem(@Y61.k DeeplinkAction deeplinkAction, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4) {
            super(str, null);
            this.f224616c = str;
            this.f224617d = str2;
            this.f224618e = str3;
            this.f224619f = deeplinkAction;
            this.f224620g = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VirtualDealRoomCardItem)) {
                return false;
            }
            VirtualDealRoomCardItem virtualDealRoomCardItem = (VirtualDealRoomCardItem) obj;
            return L.f(this.f224616c, virtualDealRoomCardItem.f224616c) && L.f(this.f224617d, virtualDealRoomCardItem.f224617d) && L.f(this.f224618e, virtualDealRoomCardItem.f224618e) && L.f(this.f224619f, virtualDealRoomCardItem.f224619f) && L.f(this.f224620g, virtualDealRoomCardItem.f224620g);
        }

        public final int hashCode() {
            int iHashCode = (this.f224619f.hashCode() + H.d(H.d(this.f224616c.hashCode() * 31, 31, this.f224617d), 31, this.f224618e)) * 31;
            String str = this.f224620g;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VirtualDealRoomCardItem(itemId=");
            sb2.append(this.f224616c);
            sb2.append(", title=");
            sb2.append(this.f224617d);
            sb2.append(", subtitle=");
            sb2.append(this.f224618e);
            sb2.append(", action=");
            sb2.append(this.f224619f);
            sb2.append(", badge=");
            return C22026a.c(sb2, this.f224620g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224616c);
            parcel.writeString(this.f224617d);
            parcel.writeString(this.f224618e);
            parcel.writeParcelable(this.f224619f, i12);
            parcel.writeString(this.f224620g);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$WalletCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WalletCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<WalletCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224621c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224622d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224623e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f224624f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WalletCardItem> {
            @Override // android.os.Parcelable.Creator
            public final WalletCardItem createFromParcel(Parcel parcel) {
                return new WalletCardItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(WalletCardItem.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final WalletCardItem[] newArray(int i12) {
                return new WalletCardItem[i12];
            }
        }

        public WalletCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k DeepLink deepLink, @Y61.k String str3) {
            super(str, null);
            this.f224621c = str;
            this.f224622d = str2;
            this.f224623e = deepLink;
            this.f224624f = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WalletCardItem)) {
                return false;
            }
            WalletCardItem walletCardItem = (WalletCardItem) obj;
            return L.f(this.f224621c, walletCardItem.f224621c) && L.f(this.f224622d, walletCardItem.f224622d) && L.f(this.f224623e, walletCardItem.f224623e) && L.f(this.f224624f, walletCardItem.f224624f);
        }

        public final int hashCode() {
            return this.f224624f.hashCode() + com.avito.android.actions_sheet.a.e(this.f224623e, H.d(this.f224621c.hashCode() * 31, 31, this.f224622d), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WalletCardItem(itemId=");
            sb2.append(this.f224621c);
            sb2.append(", balance=");
            sb2.append(this.f224622d);
            sb2.append(", uri=");
            sb2.append(this.f224623e);
            sb2.append(", type=");
            return C22026a.c(sb2, this.f224624f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224621c);
            parcel.writeString(this.f224622d);
            parcel.writeParcelable(this.f224623e, i12);
            parcel.writeString(this.f224624f);
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$WithButtonCardItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WithButtonCardItem extends CardItem {

        @Y61.k
        public static final Parcelable.Creator<WithButtonCardItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224625c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224626d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f224627e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f224628f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f224629g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final DeepLink f224630h;

        /* renamed from: i, reason: collision with root package name */
        public final int f224631i;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WithButtonCardItem> {
            @Override // android.os.Parcelable.Creator
            public final WithButtonCardItem createFromParcel(Parcel parcel) {
                return new WithButtonCardItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(WithButtonCardItem.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final WithButtonCardItem[] newArray(int i12) {
                return new WithButtonCardItem[i12];
            }
        }

        public WithButtonCardItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, boolean z12, @Y61.k DeepLink deepLink, @InterfaceC42150f int i12) {
            super(str, null);
            this.f224625c = str;
            this.f224626d = str2;
            this.f224627e = str3;
            this.f224628f = str4;
            this.f224629g = z12;
            this.f224630h = deepLink;
            this.f224631i = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithButtonCardItem)) {
                return false;
            }
            WithButtonCardItem withButtonCardItem = (WithButtonCardItem) obj;
            return L.f(this.f224625c, withButtonCardItem.f224625c) && L.f(this.f224626d, withButtonCardItem.f224626d) && L.f(this.f224627e, withButtonCardItem.f224627e) && L.f(this.f224628f, withButtonCardItem.f224628f) && this.f224629g == withButtonCardItem.f224629g && L.f(this.f224630h, withButtonCardItem.f224630h) && this.f224631i == withButtonCardItem.f224631i;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f224631i) + com.avito.android.actions_sheet.a.e(this.f224630h, r.i(H.d(H.d(H.d(this.f224625c.hashCode() * 31, 31, this.f224626d), 31, this.f224627e), 31, this.f224628f), 31, this.f224629g), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WithButtonCardItem(itemId=");
            sb2.append(this.f224625c);
            sb2.append(", title=");
            sb2.append(this.f224626d);
            sb2.append(", subtitle=");
            sb2.append(this.f224627e);
            sb2.append(", actionTitle=");
            sb2.append(this.f224628f);
            sb2.append(", isActionRequired=");
            sb2.append(this.f224629g);
            sb2.append(", deepLink=");
            sb2.append(this.f224630h);
            sb2.append(", iconAttr=");
            return r.t(sb2, this.f224631i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224625c);
            parcel.writeString(this.f224626d);
            parcel.writeString(this.f224627e);
            parcel.writeString(this.f224628f);
            parcel.writeInt(this.f224629g ? 1 : 0);
            parcel.writeParcelable(this.f224630h, i12);
            parcel.writeInt(this.f224631i);
        }
    }

    public CardItem(String str, C42822w c42822w) {
        this.f224291b = str;
    }

    @Y61.l
    public ProfileWidgetClickEvent.TargetPage L() {
        return null;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80342e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public String getF238671b() {
        return this.f224291b;
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$PromoBlockItem;", "Lcom/avito/android/profile/user_profile/cards/CardItem;", "Lcom/avito/android/promoblock/TnsPromoBlockItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PromoBlockItem extends CardItem implements TnsPromoBlockItem {

        @Y61.k
        public static final Parcelable.Creator<PromoBlockItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f224499c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f224500d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f224501e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f224502f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final AttributedText f224503g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final TnsPromoBlockItem.Style f224504h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f224505i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f224506j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final GroupingOutput f224507k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final TnsPromoBlockItem.Button f224508l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final TnsPromoBlockItem.Button f224509m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final String f224510n;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PromoBlockItem> {
            @Override // android.os.Parcelable.Creator
            public final PromoBlockItem createFromParcel(Parcel parcel) {
                return new PromoBlockItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(PromoBlockItem.class.getClassLoader()), TnsPromoBlockItem.Style.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, (GroupingOutput) parcel.readParcelable(PromoBlockItem.class.getClassLoader()), (TnsPromoBlockItem.Button) parcel.readParcelable(PromoBlockItem.class.getClassLoader()), (TnsPromoBlockItem.Button) parcel.readParcelable(PromoBlockItem.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PromoBlockItem[] newArray(int i12) {
                return new PromoBlockItem[i12];
            }
        }

        public /* synthetic */ PromoBlockItem(String str, String str2, String str3, String str4, AttributedText attributedText, TnsPromoBlockItem.Style style, boolean z12, boolean z13, GroupingOutput groupingOutput, TnsPromoBlockItem.Button button, TnsPromoBlockItem.Button button2, String str5, int i12, C42822w c42822w) {
            this(str, str2, str3, str4, (i12 & 16) != 0 ? null : attributedText, style, z12, z13, (i12 & 256) != 0 ? new GroupingOutput() : groupingOutput, button, (i12 & 1024) != 0 ? null : button2, str5);
        }

        @Override // com.avito.android.promoblock.TnsPromoBlockItem
        @Y61.l
        /* renamed from: T2, reason: from getter */
        public final TnsPromoBlockItem.Button getF224509m() {
            return this.f224509m;
        }

        @Override // com.avito.android.promoblock.TnsPromoBlockItem
        @Y61.l
        /* renamed from: T3, reason: from getter */
        public final TnsPromoBlockItem.Button getF224508l() {
            return this.f224508l;
        }

        @Override // com.avito.android.lib.util.groupable_item.a
        /* renamed from: W, reason: from getter */
        public final boolean getF229135h() {
            return this.f224506j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromoBlockItem)) {
                return false;
            }
            PromoBlockItem promoBlockItem = (PromoBlockItem) obj;
            return L.f(this.f224499c, promoBlockItem.f224499c) && L.f(this.f224500d, promoBlockItem.f224500d) && L.f(this.f224501e, promoBlockItem.f224501e) && L.f(this.f224502f, promoBlockItem.f224502f) && L.f(this.f224503g, promoBlockItem.f224503g) && this.f224504h == promoBlockItem.f224504h && this.f224505i == promoBlockItem.f224505i && this.f224506j == promoBlockItem.f224506j && L.f(this.f224507k, promoBlockItem.f224507k) && L.f(this.f224508l, promoBlockItem.f224508l) && L.f(this.f224509m, promoBlockItem.f224509m) && L.f(this.f224510n, promoBlockItem.f224510n);
        }

        @Override // com.avito.android.lib.util.groupable_item.a
        @Y61.k
        /* renamed from: f, reason: from getter */
        public final GroupingOutput getF229136i() {
            return this.f224507k;
        }

        @Override // com.avito.android.promoblock.TnsPromoBlockItem
        @Y61.l
        /* renamed from: getDescription, reason: from getter */
        public final String getF229131d() {
            return this.f224502f;
        }

        @Override // com.avito.android.profile.user_profile.cards.CardItem, com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF238671b() {
            return this.f224499c;
        }

        @Override // com.avito.android.promoblock.TnsPromoBlockItem
        @Y61.k
        /* renamed from: getStyle, reason: from getter */
        public final TnsPromoBlockItem.Style getF229133f() {
            return this.f224504h;
        }

        @Override // com.avito.android.promoblock.TnsPromoBlockItem
        @Y61.l
        /* renamed from: getTitle, reason: from getter */
        public final String getF229130c() {
            return this.f224501e;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f224499c.hashCode() * 31, 31, this.f224500d);
            String str = this.f224501e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f224502f;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            AttributedText attributedText = this.f224503g;
            int iHashCode3 = (this.f224507k.hashCode() + r.i(r.i((this.f224504h.hashCode() + ((iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31, 31, this.f224505i), 31, this.f224506j)) * 31;
            TnsPromoBlockItem.Button button = this.f224508l;
            int iHashCode4 = (iHashCode3 + (button == null ? 0 : button.hashCode())) * 31;
            TnsPromoBlockItem.Button button2 = this.f224509m;
            return this.f224510n.hashCode() + ((iHashCode4 + (button2 != null ? button2.hashCode() : 0)) * 31);
        }

        @Override // com.avito.android.promoblock.TnsPromoBlockItem
        @Y61.l
        /* renamed from: l3, reason: from getter */
        public final AttributedText getF229132e() {
            return this.f224503g;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PromoBlockItem(stringId=");
            sb2.append(this.f224499c);
            sb2.append(", position=");
            sb2.append(this.f224500d);
            sb2.append(", title=");
            sb2.append(this.f224501e);
            sb2.append(", description=");
            sb2.append(this.f224502f);
            sb2.append(", attributedDescription=");
            sb2.append(this.f224503g);
            sb2.append(", style=");
            sb2.append(this.f224504h);
            sb2.append(", isCloseable=");
            sb2.append(this.f224505i);
            sb2.append(", closeable=");
            sb2.append(this.f224506j);
            sb2.append(", output=");
            sb2.append(this.f224507k);
            sb2.append(", firstActionButton=");
            sb2.append(this.f224508l);
            sb2.append(", secondActionButton=");
            sb2.append(this.f224509m);
            sb2.append(", page=");
            return C22026a.c(sb2, this.f224510n, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f224499c);
            parcel.writeString(this.f224500d);
            parcel.writeString(this.f224501e);
            parcel.writeString(this.f224502f);
            parcel.writeParcelable(this.f224503g, i12);
            parcel.writeString(this.f224504h.name());
            parcel.writeInt(this.f224505i ? 1 : 0);
            parcel.writeInt(this.f224506j ? 1 : 0);
            parcel.writeParcelable(this.f224507k, i12);
            parcel.writeParcelable(this.f224508l, i12);
            parcel.writeParcelable(this.f224509m, i12);
            parcel.writeString(this.f224510n);
        }

        @Override // com.avito.android.promoblock.TnsPromoBlockItem
        /* renamed from: x1, reason: from getter */
        public final boolean getF229134g() {
            return this.f224505i;
        }

        public PromoBlockItem(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l AttributedText attributedText, @Y61.k TnsPromoBlockItem.Style style, boolean z12, boolean z13, @Y61.k GroupingOutput groupingOutput, @Y61.l TnsPromoBlockItem.Button button, @Y61.l TnsPromoBlockItem.Button button2, @Y61.k String str5) {
            super(str, null);
            this.f224499c = str;
            this.f224500d = str2;
            this.f224501e = str3;
            this.f224502f = str4;
            this.f224503g = attributedText;
            this.f224504h = style;
            this.f224505i = z12;
            this.f224506j = z13;
            this.f224507k = groupingOutput;
            this.f224508l = button;
            this.f224509m = button2;
            this.f224510n = str5;
        }
    }

    /* compiled from: CardItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/CardItem$SilentUpdateConfig;", "Landroid/os/Parcelable;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SilentUpdateConfig implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<SilentUpdateConfig> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f224576b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f224577c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final List<String> f224578d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final SilentUpdateSettings f224579e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final SilentUpdateSettings f224580f;

        /* compiled from: CardItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SilentUpdateConfig> {
            @Override // android.os.Parcelable.Creator
            public final SilentUpdateConfig createFromParcel(Parcel parcel) {
                boolean z12 = parcel.readInt() != 0;
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                Parcelable.Creator<SilentUpdateSettings> creator = SilentUpdateSettings.CREATOR;
                return new SilentUpdateConfig(z12, string, arrayListCreateStringArrayList, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SilentUpdateConfig[] newArray(int i12) {
                return new SilentUpdateConfig[i12];
            }
        }

        public SilentUpdateConfig(boolean z12, String str, List list, SilentUpdateSettings silentUpdateSettings, SilentUpdateSettings silentUpdateSettings2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? C42784z0.f406748b : list, silentUpdateSettings, silentUpdateSettings2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SilentUpdateConfig)) {
                return false;
            }
            SilentUpdateConfig silentUpdateConfig = (SilentUpdateConfig) obj;
            return this.f224576b == silentUpdateConfig.f224576b && L.f(this.f224577c, silentUpdateConfig.f224577c) && L.f(this.f224578d, silentUpdateConfig.f224578d) && L.f(this.f224579e, silentUpdateConfig.f224579e) && L.f(this.f224580f, silentUpdateConfig.f224580f);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f224576b) * 31;
            String str = this.f224577c;
            return this.f224580f.hashCode() + ((this.f224579e.hashCode() + H.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f224578d)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "SilentUpdateConfig(periodicDownloadDisabled=" + this.f224576b + ", maxVersion=" + this.f224577c + ", forbiddenVendors=" + this.f224578d + ", oneTimeConfig=" + this.f224579e + ", periodicConfig=" + this.f224580f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f224576b ? 1 : 0);
            parcel.writeString(this.f224577c);
            parcel.writeStringList(this.f224578d);
            this.f224579e.writeToParcel(parcel, i12);
            this.f224580f.writeToParcel(parcel, i12);
        }

        public SilentUpdateConfig(boolean z12, @Y61.l String str, @Y61.k List<String> list, @Y61.k SilentUpdateSettings silentUpdateSettings, @Y61.k SilentUpdateSettings silentUpdateSettings2) {
            this.f224576b = z12;
            this.f224577c = str;
            this.f224578d = list;
            this.f224579e = silentUpdateSettings;
            this.f224580f = silentUpdateSettings2;
        }
    }
}
