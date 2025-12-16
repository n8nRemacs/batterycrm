package com.avito.android.remote.parse.adapter;

import com.avito.android.B2;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import com.avito.android.remote.model.user_profile.items.ActionItem;
import com.avito.android.remote.model.user_profile.items.AddressItem;
import com.avito.android.remote.model.user_profile.items.AdvertsItem;
import com.avito.android.remote.model.user_profile.items.AutoSubscribeItem;
import com.avito.android.remote.model.user_profile.items.AutotekaPurchaseDataItem;
import com.avito.android.remote.model.user_profile.items.AvitoProItem;
import com.avito.android.remote.model.user_profile.items.CallsHistoryItem;
import com.avito.android.remote.model.user_profile.items.CallsItem;
import com.avito.android.remote.model.user_profile.items.ComfortableDealItem;
import com.avito.android.remote.model.user_profile.items.ContactsItem;
import com.avito.android.remote.model.user_profile.items.ContactsPackagesItem;
import com.avito.android.remote.model.user_profile.items.CvProfileItem;
import com.avito.android.remote.model.user_profile.items.EmptyAddressItem;
import com.avito.android.remote.model.user_profile.items.EntryPointCrmCandidates;
import com.avito.android.remote.model.user_profile.items.ExtensionsItem;
import com.avito.android.remote.model.user_profile.items.HelpCenterItem;
import com.avito.android.remote.model.user_profile.items.IacSessionsItem;
import com.avito.android.remote.model.user_profile.items.IncomeSettingsItem;
import com.avito.android.remote.model.user_profile.items.InfoItem;
import com.avito.android.remote.model.user_profile.items.LeasingEntryPointItem;
import com.avito.android.remote.model.user_profile.items.LoyaltyPreferencesItem;
import com.avito.android.remote.model.user_profile.items.MortgageAccountItem;
import com.avito.android.remote.model.user_profile.items.MortgageApplicationItem;
import com.avito.android.remote.model.user_profile.items.MyGarageItem;
import com.avito.android.remote.model.user_profile.items.NdTrxDealCabinetItem;
import com.avito.android.remote.model.user_profile.items.OrdersItem;
import com.avito.android.remote.model.user_profile.items.PassportItem;
import com.avito.android.remote.model.user_profile.items.PhonesItem;
import com.avito.android.remote.model.user_profile.items.PremierPartnerItem;
import com.avito.android.remote.model.user_profile.items.ProfileAuctionItem;
import com.avito.android.remote.model.user_profile.items.ProfileJobMenuItem;
import com.avito.android.remote.model.user_profile.items.ProfileManagementItem;
import com.avito.android.remote.model.user_profile.items.ProfileRemovalItem;
import com.avito.android.remote.model.user_profile.items.ProfileSessionsItem;
import com.avito.android.remote.model.user_profile.items.PromoBanner;
import com.avito.android.remote.model.user_profile.items.PromotionsItem;
import com.avito.android.remote.model.user_profile.items.RecommendationsItem;
import com.avito.android.remote.model.user_profile.items.ReferralEntryPoint;
import com.avito.android.remote.model.user_profile.items.ReviewsItem;
import com.avito.android.remote.model.user_profile.items.RewardsItem;
import com.avito.android.remote.model.user_profile.items.RfpItem;
import com.avito.android.remote.model.user_profile.items.SafeDealSettingsItem;
import com.avito.android.remote.model.user_profile.items.SafetySettingsItem;
import com.avito.android.remote.model.user_profile.items.SbcDispatchesItem;
import com.avito.android.remote.model.user_profile.items.ServiceBookingItem;
import com.avito.android.remote.model.user_profile.items.ServicesSellerSubscriptionItem;
import com.avito.android.remote.model.user_profile.items.SimpleProfileItem;
import com.avito.android.remote.model.user_profile.items.SocialItem;
import com.avito.android.remote.model.user_profile.items.SpecialMachineryRentalItem;
import com.avito.android.remote.model.user_profile.items.StrOrdersItem;
import com.avito.android.remote.model.user_profile.items.TariffItem;
import com.avito.android.remote.model.user_profile.items.TempStaffingEntryPointItem;
import com.avito.android.remote.model.user_profile.items.UserProfileItem;
import com.avito.android.remote.model.user_profile.items.VirtualDealRoomItem;
import com.avito.android.remote.model.user_profile.items.WalletItem;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import lD.C43617a;

/* compiled from: UserProfileItemTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/UserProfileItemTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserProfileItemTypeAdapter extends RuntimeTypeAdapter<UserProfileItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f254259a;

    public UserProfileItemTypeAdapter(@Y61.k gD.f fVar, @Y61.k C43617a c43617a, @Y61.k B2 b22) {
        super(null, "body", null, 5, null);
        LinkedHashMap linkedHashMapJ = P0.j(new kotlin.Q("subscriptionsAuto", AutoSubscribeItem.class), new kotlin.Q("passport", PassportItem.class), new kotlin.Q(RequestReviewResultKt.INFO_TYPE, InfoItem.class), new kotlin.Q("adverts", AdvertsItem.class), new kotlin.Q(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_WALLET, WalletItem.class), new kotlin.Q("phones", PhonesItem.class), new kotlin.Q("voipSessions", IacSessionsItem.class), new kotlin.Q("reviews", ReviewsItem.class), new kotlin.Q("social", SocialItem.class), new kotlin.Q(AttachMenuItem.File.EXTENSIONS, ExtensionsItem.class), new kotlin.Q("helpCenter", HelpCenterItem.class), new kotlin.Q("contacts", ContactsItem.class), new kotlin.Q("income", IncomeSettingsItem.class), new kotlin.Q("tariff", TariffItem.class), new kotlin.Q("orders", OrdersItem.class), new kotlin.Q("autotekaPurchaseData", AutotekaPurchaseDataItem.class), new kotlin.Q("rfp", RfpItem.class), new kotlin.Q("sessionsList", ProfileSessionsItem.class), new kotlin.Q("safeDeal", SafeDealSettingsItem.class), new kotlin.Q("profileManagement", ProfileManagementItem.class), new kotlin.Q("loyaltyPreferences", LoyaltyPreferencesItem.class), new kotlin.Q("tempStaffing", TempStaffingEntryPointItem.class), new kotlin.Q("jobCrmCandidates", EntryPointCrmCandidates.class), new kotlin.Q("cv", CvProfileItem.class), new kotlin.Q("promotions", PromotionsItem.class), new kotlin.Q("sbc", SbcDispatchesItem.class), new kotlin.Q("emptyAddress", EmptyAddressItem.class), new kotlin.Q(AddressParameter.TYPE, AddressItem.class), new kotlin.Q("bookingList", StrOrdersItem.class), new kotlin.Q("passwordChange", ActionItem.class), new kotlin.Q("passwordSet", ActionItem.class), new kotlin.Q("profileRemoval", ProfileRemovalItem.class), new kotlin.Q("garage", MyGarageItem.class), new kotlin.Q("auctionProfile", ProfileAuctionItem.class), new kotlin.Q("call_history", CallsHistoryItem.class), new kotlin.Q("serviceBooking", ServiceBookingItem.class), new kotlin.Q("safety", SafetySettingsItem.class), new kotlin.Q("rewards", RewardsItem.class), new kotlin.Q("referral", ReferralEntryPoint.class), new kotlin.Q("promoBanner", PromoBanner.class), new kotlin.Q("jobMenu", ProfileJobMenuItem.class), new kotlin.Q("leasingSpecialMachinery", LeasingEntryPointItem.class), new kotlin.Q("machineryRentalOrders", SpecialMachineryRentalItem.class), new kotlin.Q("avitoPro", AvitoProItem.class), new kotlin.Q("ndTrx", NdTrxDealCabinetItem.class), new kotlin.Q("comfortableDeal", ComfortableDealItem.class), new kotlin.Q("premierPartnerApplications", PremierPartnerItem.class), new kotlin.Q("recommendationBlock", RecommendationsItem.class));
        kotlin.reflect.n<Object>[] nVarArr = gD.f.f396389r;
        kotlin.reflect.n<Object> nVar = nVarArr[1];
        if (((Boolean) fVar.f396390b.a().invoke()).booleanValue()) {
            linkedHashMapJ.put("mortgageAccount", MortgageAccountItem.class);
        }
        kotlin.reflect.n<Object> nVar2 = nVarArr[2];
        if (((Boolean) fVar.f396391c.a().invoke()).booleanValue()) {
            linkedHashMapJ.put("mortgage", MortgageApplicationItem.class);
        }
        kotlin.reflect.n<Object> nVar3 = nVarArr[3];
        if (((Boolean) fVar.f396392d.a().invoke()).booleanValue()) {
            linkedHashMapJ.put("vdr", VirtualDealRoomItem.class);
        }
        kotlin.reflect.n<Object> nVar4 = nVarArr[4];
        if (((Boolean) fVar.f396393e.a().invoke()).booleanValue()) {
            linkedHashMapJ.put("calls", CallsItem.class);
        }
        kotlin.reflect.n<Object> nVar5 = C43617a.f413588V[17];
        if (((Boolean) c43617a.f413627s.a().invoke()).booleanValue()) {
            linkedHashMapJ.put("contactsPackages", ContactsPackagesItem.class);
        }
        kotlin.reflect.n<Object> nVar6 = B2.f67184X[26];
        if (((Boolean) b22.f67186B.a().invoke()).booleanValue()) {
            linkedHashMapJ.put("servicesSellerSubscription", ServicesSellerSubscriptionItem.class);
        }
        linkedHashMapJ.put("recommerce", SimpleProfileItem.class);
        this.f254259a = linkedHashMapJ;
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Type> getMapping() {
        return this.f254259a;
    }
}
