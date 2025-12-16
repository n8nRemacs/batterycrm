package com.avito.android.profile.user_profile;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.component.user_hat.PassportParticularProfileItem;
import com.avito.android.component.user_hat.PassportProfileAddItem;
import com.avito.android.component.user_hat.PassportProfileCountItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmployeeModeSwitchLink;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.cards.passport.DeliveryRestrictionCard;
import com.avito.android.profile.user_profile.cards.passport.ReputationAndRatingCard;
import com.avito.android.profile.user_profile.cards.recommendations.item.RecommendationSnippetItem;
import com.avito.android.profile.user_profile.di.f;
import com.avito.android.profile.user_profile.t;
import com.avito.android.remote.model.Address;
import com.avito.android.remote.model.Avatar;
import com.avito.android.remote.model.DeliveryRestrictionBanner;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ProfileRating;
import com.avito.android.remote.model.user_profile.Device;
import com.avito.android.remote.model.user_profile.Phone;
import com.avito.android.remote.model.user_profile.ReputationAndRating;
import com.avito.android.remote.model.user_profile.SeparateBalance;
import com.avito.android.remote.model.user_profile.Support;
import com.avito.android.remote.model.user_profile.items.ActionItem;
import com.avito.android.remote.model.user_profile.items.AddressItem;
import com.avito.android.remote.model.user_profile.items.AdvertsItem;
import com.avito.android.remote.model.user_profile.items.AutoSubscribeItem;
import com.avito.android.remote.model.user_profile.items.AutotekaPurchaseDataItem;
import com.avito.android.remote.model.user_profile.items.AvitoProItem;
import com.avito.android.remote.model.user_profile.items.Banner;
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
import com.avito.android.remote.model.user_profile.items.PassportAvatar;
import com.avito.android.remote.model.user_profile.items.PassportInfoItem;
import com.avito.android.remote.model.user_profile.items.PassportItem;
import com.avito.android.remote.model.user_profile.items.PassportProfile;
import com.avito.android.remote.model.user_profile.items.PhonesItem;
import com.avito.android.remote.model.user_profile.items.PremierPartnerItem;
import com.avito.android.remote.model.user_profile.items.ProfileAuctionItem;
import com.avito.android.remote.model.user_profile.items.ProfileJobMenuItem;
import com.avito.android.remote.model.user_profile.items.ProfileManagementItem;
import com.avito.android.remote.model.user_profile.items.ProfileRemovalItem;
import com.avito.android.remote.model.user_profile.items.ProfileSessionsItem;
import com.avito.android.remote.model.user_profile.items.ProfileStatus;
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
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import k60.C42524a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserProfileItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/r;", "Lcom/avito/android/profile/user_profile/q;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C42524a f226579a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_persistence.f f226580b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f226581c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Resources f226582d;

    /* compiled from: UserProfileItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f226583a;

        static {
            int[] iArr = new int[CvProfileItem.Style.values().length];
            try {
                iArr[CvProfileItem.Style.BIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CvProfileItem.Style.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f226583a = iArr;
        }
    }

    @Inject
    public r(@Y61.k C42524a c42524a, @Y61.k com.avito.android.service_booking_persistence.f fVar, @f.b boolean z12, @Y61.k Resources resources) {
        this.f226579a = c42524a;
        this.f226580b = fVar;
        this.f226581c = z12;
        this.f226582d = resources;
    }

    public static CardItem.InfoCardItem c(InfoItem infoItem, String str) {
        ReputationAndRatingCard reputationAndRatingCard;
        ReputationAndRatingCard reputationAndRatingCard2;
        ProfileRating profileRating;
        String str2;
        DeliveryRestrictionCard deliveryRestrictionCard;
        Avatar avatar = infoItem.getAvatar();
        Avatar avatarCopy$default = avatar != null ? Avatar.copy$default(avatar, null, null, null, null, null, 29, null) : null;
        String name = infoItem.getName();
        String email = infoItem.getEmail();
        Address address = infoItem.getAddress();
        String title = address != null ? address.getTitle() : null;
        String registered = infoItem.getRegistered();
        boolean isIncomplete = infoItem.getIsIncomplete();
        String type = infoItem.getType();
        String manager = infoItem.getManager();
        Support support = infoItem.getSupport();
        String shopSite = infoItem.getShopSite();
        ProfileRating rating = infoItem.getRating();
        ReputationAndRating reputationAndRating = infoItem.getReputationAndRating();
        if (reputationAndRating == null) {
            reputationAndRatingCard = null;
        } else {
            String ratingWidgetText = reputationAndRating.getRatingWidgetText();
            Float ratingScore = reputationAndRating.getRatingScore();
            DeepLink ratingUri = reputationAndRating.getRatingUri();
            String reputationWidgetText = reputationAndRating.getReputationWidgetText();
            Integer reputationScore = reputationAndRating.getReputationScore();
            ReputationAndRatingCard.a aVar = ReputationAndRatingCard.f225118j;
            ReputationAndRating.ReputationColor reputationColor = reputationAndRating.getReputationColor();
            aVar.getClass();
            int i12 = reputationColor == null ? -1 : ReputationAndRatingCard.a.C6823a.f225132a[reputationColor.ordinal()];
            ReputationAndRatingCard.ProfileProReputationItemColor profileProReputationItemColor = i12 != 1 ? i12 != 2 ? ReputationAndRatingCard.ProfileProReputationItemColor.f225127b : ReputationAndRatingCard.ProfileProReputationItemColor.f225128c : ReputationAndRatingCard.ProfileProReputationItemColor.f225129d;
            DeepLink reputationUri = reputationAndRating.getReputationUri();
            String reputationTag = reputationAndRating.getReputationTag();
            reputationAndRatingCard = new ReputationAndRatingCard(reputationWidgetText, !(reputationTag == null || reputationTag.length() == 0), reputationScore, profileProReputationItemColor, reputationUri, ratingWidgetText, ratingScore, ratingUri);
        }
        DeliveryRestrictionBanner deliveryRestrictionBanner = infoItem.getDeliveryRestrictionBanner();
        if (deliveryRestrictionBanner == null) {
            str2 = shopSite;
            profileRating = rating;
            reputationAndRatingCard2 = reputationAndRatingCard;
            deliveryRestrictionCard = null;
        } else {
            reputationAndRatingCard2 = reputationAndRatingCard;
            profileRating = rating;
            str2 = shopSite;
            deliveryRestrictionCard = new DeliveryRestrictionCard(deliveryRestrictionBanner.getTitle(), new DeliveryRestrictionCard.DeliveryRestrictionAction(deliveryRestrictionBanner.getAction().getTitle(), deliveryRestrictionBanner.getAction().getDeeplink()), deliveryRestrictionBanner.getImage(), deliveryRestrictionBanner.getBackgroundColor());
        }
        return new CardItem.InfoCardItem(str, avatarCopy$default, name, email, title, registered, isIncomplete, type, manager, support, str2, profileRating, reputationAndRatingCard2, deliveryRestrictionCard);
    }

    @Override // com.avito.android.profile.user_profile.q
    @Y61.k
    public final InterfaceC33367b a(@Y61.k String str, @Y61.k UserProfileItem userProfileItem) {
        try {
            return new C33368c(b(str, userProfileItem));
        } catch (Exception e12) {
            return new C33366a(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CardItem b(String str, UserProfileItem userProfileItem) {
        CardItem profileJobMenuCardItem;
        String badgeTitle;
        String badgeKey;
        int i12;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        String str2 = null;
        if (userProfileItem instanceof PassportInfoItem) {
            PassportInfoItem passportInfoItem = (PassportInfoItem) userProfileItem;
            PassportItem passportItem = passportInfoItem.getPassportItem();
            C42524a c42524a = this.f226579a;
            c42524a.getClass();
            kotlin.reflect.n<Object> nVar = C42524a.f406098e[0];
            boolean zBooleanValue = ((Boolean) c42524a.f406099b.a().invoke()).booleanValue();
            Avatar avatar = passportInfoItem.getInfoItem().getAvatar();
            String status = avatar != null ? avatar.getStatus() : null;
            int i16 = this.f226581c ? 5 : 7;
            List<PassportProfile> listE0 = C42745f0.E0(passportItem.getProfiles(), i16);
            ArrayList arrayList = new ArrayList(C42745f0.q(listE0, 10));
            for (PassportProfile passportProfile : listE0) {
                PassportAvatar avatar2 = passportProfile.getAvatar();
                Image image = avatar2 != null ? avatar2.getImage() : null;
                String profileId = passportProfile.getProfileId();
                int i17 = (!passportProfile.getIsCurrent() || passportItem.getProfiles().size() <= i15) ? i14 : i15;
                ProfileStatus profileStatus = passportProfile.getProfileStatus();
                int i18 = profileStatus == null ? -1 : t.a.f226588a[profileStatus.ordinal()];
                com.avito.android.component.user_hat.ProfileStatus profileStatus2 = i18 != i15 ? i18 != i13 ? com.avito.android.component.user_hat.ProfileStatus.f125286d : com.avito.android.component.user_hat.ProfileStatus.f125285c : com.avito.android.component.user_hat.ProfileStatus.f125284b;
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new PassportParticularProfileItem(image, status, profileId, i17, profileStatus2, null, null, 96, null));
                i16 = i16;
                arrayList = arrayList2;
                i13 = 2;
                i14 = 0;
                i15 = 1;
            }
            int i19 = i16;
            ArrayList arrayList3 = new ArrayList(arrayList);
            if (zBooleanValue || passportItem.getCount() > i19) {
                i12 = 2;
                arrayList3.add(new PassportProfileCountItem(passportItem.getCount(), null, 2, null));
            } else {
                i12 = 2;
            }
            arrayList3.add(new PassportProfileAddItem(passportItem.getCount() == 1, null, i12, null));
            return new CardItem.PassportCardItem(str, c(passportInfoItem.getInfoItem(), str), arrayList3);
        }
        if (userProfileItem instanceof InfoItem) {
            return c((InfoItem) userProfileItem, str);
        }
        if (userProfileItem instanceof AdvertsItem) {
            AdvertsItem advertsItem = (AdvertsItem) userProfileItem;
            return new CardItem.AdvertsCardItem(str, advertsItem.getStatus().getActive(), advertsItem.getStatus().getInactive(), advertsItem.getStatus().getRejected());
        }
        if (userProfileItem instanceof AvitoProItem) {
            AvitoProItem avitoProItem = (AvitoProItem) userProfileItem;
            return new CardItem.AvitoProCardItem(avitoProItem.getDeepLink(), str, avitoProItem.getTitle(), avitoProItem.getDescription(), avitoProItem.getTooltip(), avitoProItem.getDeepLink() instanceof EmployeeModeSwitchLink);
        }
        if (userProfileItem instanceof WalletItem) {
            WalletItem walletItem = (WalletItem) userProfileItem;
            boolean isBalanceHidden = walletItem.getIsBalanceHidden();
            Resources resources = this.f226582d;
            if (isBalanceHidden) {
                return new CardItem.WalletCardItem(str, resources.getString(R.string.payment_wallet_title), walletItem.getUri(), "new");
            }
            SeparateBalance separate = walletItem.getSeparate();
            return separate != null ? new CardItem.SeparateWalletCardItem(str, separate, walletItem.getUri()) : new CardItem.WalletCardItem(str, resources.getString(R.string.wallet_balance, walletItem.getBalance()), walletItem.getUri(), "old");
        }
        if (userProfileItem instanceof SocialItem) {
            return new CardItem.SocialCardItem(str, ((SocialItem) userProfileItem).getSocialNetworks());
        }
        if (userProfileItem instanceof PhonesItem) {
            PhonesItem phonesItem = (PhonesItem) userProfileItem;
            if (phonesItem.getPhones().isEmpty()) {
                List<Device> voipSessions = phonesItem.getVoipSessions();
                if (voipSessions == null) {
                    voipSessions = C42784z0.f406748b;
                }
                return new CardItem.PhonesEmptyCardItem(str, voipSessions);
            }
            List<Phone> phones = phonesItem.getPhones();
            List<Device> voipSessions2 = phonesItem.getVoipSessions();
            if (voipSessions2 == null) {
                voipSessions2 = C42784z0.f406748b;
            }
            return new CardItem.PhonesCardItem(phonesItem.getPhonesCount(), str, phones, voipSessions2);
        }
        if (userProfileItem instanceof ReviewsItem) {
            ReviewsItem reviewsItem = (ReviewsItem) userProfileItem;
            return new CardItem.ReviewsCardItem(str, reviewsItem.getTitle(), reviewsItem.getReviews(), reviewsItem.getAction());
        }
        if (userProfileItem instanceof ContactsItem) {
            ContactsItem contactsItem = (ContactsItem) userProfileItem;
            return new CardItem.ContactsCardItem(str, contactsItem.getTitle(), contactsItem.getDescription(), contactsItem.getAction());
        }
        if (userProfileItem instanceof ContactsPackagesItem) {
            ContactsPackagesItem contactsPackagesItem = (ContactsPackagesItem) userProfileItem;
            return new CardItem.AutoClickableCardItem(str, contactsPackagesItem.getTitle(), contactsPackagesItem.getSubtitle(), contactsPackagesItem.getBadge(), contactsPackagesItem.getAction().getDeepLink());
        }
        if (userProfileItem instanceof TariffItem) {
            TariffItem tariffItem = (TariffItem) userProfileItem;
            return new CardItem.TariffCardItem(str, tariffItem.getTitle(), null, tariffItem.getSubtitle(), L.f(tariffItem.getStatus(), "active"), tariffItem.getAction());
        }
        if (userProfileItem instanceof ExtensionsItem) {
            ExtensionsItem extensionsItem = (ExtensionsItem) userProfileItem;
            return new CardItem.ExtensionsCardItem(str, extensionsItem.getTitle(), extensionsItem.getDescription(), extensionsItem.getExtensionsInfo(), extensionsItem.getActions());
        }
        if (userProfileItem instanceof HelpCenterItem) {
            return new CardItem.HelpCenterCardItem(str);
        }
        if (userProfileItem instanceof SafeDealSettingsItem) {
            SafeDealSettingsItem safeDealSettingsItem = (SafeDealSettingsItem) userProfileItem;
            return new CardItem.SafeDealSettingsCardItem(str, safeDealSettingsItem.getTitle(), safeDealSettingsItem.getSubtitle(), safeDealSettingsItem.getDeepLink());
        }
        if (userProfileItem instanceof IncomeSettingsItem) {
            IncomeSettingsItem incomeSettingsItem = (IncomeSettingsItem) userProfileItem;
            return new CardItem.IncomeSettingsCardItem(str, incomeSettingsItem.getTitle(), incomeSettingsItem.getSubtitle(), incomeSettingsItem.getUri());
        }
        if (userProfileItem instanceof ActionItem) {
            return new CardItem.ActionCardItem(str, ((ActionItem) userProfileItem).getAction());
        }
        if (userProfileItem instanceof ProfileSessionsItem) {
            ProfileSessionsItem profileSessionsItem = (ProfileSessionsItem) userProfileItem;
            return new CardItem.SessionsCardItem(str, profileSessionsItem.getTitle(), profileSessionsItem.getSubtitle(), profileSessionsItem.getDeeplink());
        }
        if (userProfileItem instanceof ProfileRemovalItem) {
            ProfileRemovalItem profileRemovalItem = (ProfileRemovalItem) userProfileItem;
            return new CardItem.ProfileRemovalItem(str, profileRemovalItem.getTitle(), profileRemovalItem.getSubtitle(), profileRemovalItem.getDeeplink());
        }
        if (userProfileItem instanceof OrdersItem) {
            OrdersItem ordersItem = (OrdersItem) userProfileItem;
            return new CardItem.OrdersCardItem(str, ordersItem.getTitle(), ordersItem.getSubtitle(), ordersItem.getAction().getTitle(), ordersItem.getAction().getUri(), ordersItem.getIsActionRequired(), null, Integer.valueOf(R.drawable.ic_file_with_corner_outlined_24));
        }
        if (userProfileItem instanceof AutotekaPurchaseDataItem) {
            AutotekaPurchaseDataItem autotekaPurchaseDataItem = (AutotekaPurchaseDataItem) userProfileItem;
            return new CardItem.AutotekaPurchaseDataCardItem(str, autotekaPurchaseDataItem.getTitle(), autotekaPurchaseDataItem.getSubtitle(), autotekaPurchaseDataItem.getAction().getTitle(), autotekaPurchaseDataItem.getAction().getUri(), R.attr.ic_auto24);
        }
        if (userProfileItem instanceof RfpItem) {
            RfpItem rfpItem = (RfpItem) userProfileItem;
            return new CardItem.RfpCardItem(str, rfpItem.getTitle(), rfpItem.getSubtitle(), rfpItem.getCounter(), rfpItem.getDeepLink());
        }
        if (userProfileItem instanceof StrOrdersItem) {
            StrOrdersItem strOrdersItem = (StrOrdersItem) userProfileItem;
            return new CardItem.StrOrdersCardItem(strOrdersItem.getAction().getUri(), str, strOrdersItem.getTitle(), strOrdersItem.getSubtitle(), strOrdersItem.getAction().getTitle(), strOrdersItem.getIsActionRequired());
        }
        if (userProfileItem instanceof ProfileManagementItem) {
            ProfileManagementItem profileManagementItem = (ProfileManagementItem) userProfileItem;
            return new CardItem.ProfileManagementCardItem(str, profileManagementItem.getTitle(), profileManagementItem.getAction(), profileManagementItem.getSubtitle());
        }
        if (userProfileItem instanceof LoyaltyPreferencesItem) {
            LoyaltyPreferencesItem loyaltyPreferencesItem = (LoyaltyPreferencesItem) userProfileItem;
            return new CardItem.LoyaltyPreferencesCardItem(loyaltyPreferencesItem.getAction(), str, loyaltyPreferencesItem.getTitle(), loyaltyPreferencesItem.getSubtitle(), loyaltyPreferencesItem.getTag());
        }
        if (userProfileItem instanceof PremierPartnerItem) {
            PremierPartnerItem premierPartnerItem = (PremierPartnerItem) userProfileItem;
            return new CardItem.PremierPartnerCardItem(str, premierPartnerItem.getTitle(), premierPartnerItem.getSubtitle(), premierPartnerItem.getDeeplink());
        }
        if (userProfileItem instanceof ComfortableDealItem) {
            ComfortableDealItem comfortableDealItem = (ComfortableDealItem) userProfileItem;
            Banner banner = comfortableDealItem.getBanner();
            return banner != null ? new CardItem.ComfortableDealWithStatusCardItem(str, comfortableDealItem.getTitle(), comfortableDealItem.getDeeplink(), banner) : new CardItem.ComfortableDealCardItem(str, comfortableDealItem.getTitle(), comfortableDealItem.getSubtitle(), comfortableDealItem.getDeeplink());
        }
        if (userProfileItem instanceof MortgageAccountItem) {
            MortgageAccountItem mortgageAccountItem = (MortgageAccountItem) userProfileItem;
            return new CardItem.MortgageAccountCardItem(str, mortgageAccountItem.getTitle(), mortgageAccountItem.getSubtitle(), mortgageAccountItem.getDeeplink());
        }
        if (userProfileItem instanceof MortgageApplicationItem) {
            MortgageApplicationItem mortgageApplicationItem = (MortgageApplicationItem) userProfileItem;
            return new CardItem.MortgageApplicationCardItem(str, mortgageApplicationItem.getTitle(), mortgageApplicationItem.getSubtitle(), mortgageApplicationItem.getDeeplink());
        }
        if (userProfileItem instanceof VirtualDealRoomItem) {
            VirtualDealRoomItem virtualDealRoomItem = (VirtualDealRoomItem) userProfileItem;
            return new CardItem.VirtualDealRoomCardItem(virtualDealRoomItem.getAction(), str, virtualDealRoomItem.getTitle(), virtualDealRoomItem.getSubtitle(), virtualDealRoomItem.getBadge());
        }
        if (userProfileItem instanceof MyGarageItem) {
            MyGarageItem myGarageItem = (MyGarageItem) userProfileItem;
            return new CardItem.MyGarageCardItem(str, myGarageItem.getTitle(), myGarageItem.getSubtitle(), myGarageItem.getDeepLink());
        }
        if (userProfileItem instanceof CallsItem) {
            CallsItem callsItem = (CallsItem) userProfileItem;
            return new CardItem.CallsCardItem(callsItem.getDeepLink(), str, callsItem.getHeader(), callsItem.getText(), callsItem.getHighlight());
        }
        if (userProfileItem instanceof CallsHistoryItem) {
            CallsHistoryItem callsHistoryItem = (CallsHistoryItem) userProfileItem;
            return new CardItem.CallsHistoryCardItem(callsHistoryItem.getHighlight(), str, callsHistoryItem.getHeader(), callsHistoryItem.getText(), callsHistoryItem.getDeepLink());
        }
        if (userProfileItem instanceof TempStaffingEntryPointItem) {
            TempStaffingEntryPointItem tempStaffingEntryPointItem = (TempStaffingEntryPointItem) userProfileItem;
            profileJobMenuCardItem = new CardItem.WithButtonCardItem(str, tempStaffingEntryPointItem.getTitle(), tempStaffingEntryPointItem.getSubtitle(), tempStaffingEntryPointItem.getAction().getTitle(), tempStaffingEntryPointItem.getIsActionRequired(), tempStaffingEntryPointItem.getAction().getDeepLink(), R.attr.ic_tempStaffing24);
        } else if (userProfileItem instanceof EntryPointCrmCandidates) {
            EntryPointCrmCandidates entryPointCrmCandidates = (EntryPointCrmCandidates) userProfileItem;
            profileJobMenuCardItem = new CardItem.WithButtonCardItem(str, entryPointCrmCandidates.getTitle(), entryPointCrmCandidates.getSubtitle(), entryPointCrmCandidates.getAction().getTitle(), entryPointCrmCandidates.getIsActionRequired(), entryPointCrmCandidates.getAction().getDeepLink(), R.attr.ic_candidates24);
        } else if (userProfileItem instanceof CvProfileItem) {
            CvProfileItem cvProfileItem = (CvProfileItem) userProfileItem;
            int i22 = a.f226583a[cvProfileItem.getStyle().ordinal()];
            if (i22 != 1) {
                if (i22 != 2) {
                    return null;
                }
                return new CardItem.ClickableCardItem(str, cvProfileItem.getTitle(), cvProfileItem.getSubtitle(), cvProfileItem.getAction().getDeepLink());
            }
            profileJobMenuCardItem = new CardItem.WithButtonCardItem(str, cvProfileItem.getTitle(), cvProfileItem.getSubtitle(), cvProfileItem.getAction().getTitle(), false, cvProfileItem.getAction().getDeepLink(), R.attr.ic_cv24);
        } else if (userProfileItem instanceof ServiceBookingItem) {
            ServiceBookingItem serviceBookingItem = (ServiceBookingItem) userProfileItem;
            boolean z12 = serviceBookingItem.getDetails() == null;
            String title = serviceBookingItem.getTitle();
            ServiceBookingItem.Details details = serviceBookingItem.getDetails();
            String subtitle = details != null ? details.getSubtitle() : null;
            ServiceBookingItem.Details details2 = serviceBookingItem.getDetails();
            if (details2 != null && (badgeTitle = details2.getBadgeTitle()) != null) {
                ServiceBookingItem.Details details3 = serviceBookingItem.getDetails();
                if ((details3 == null || (badgeKey = details3.getBadgeKey()) == null) ? true : !this.f226580b.b(badgeKey)) {
                    str2 = badgeTitle;
                }
            }
            profileJobMenuCardItem = new CardItem.ServiceBookingCardItem(str, z12, title, subtitle, str2, serviceBookingItem.getAction(), null);
        } else if (userProfileItem instanceof PromotionsItem) {
            PromotionsItem promotionsItem = (PromotionsItem) userProfileItem;
            profileJobMenuCardItem = new CardItem.PromotionsCardItem(str, promotionsItem.getKey(), promotionsItem.getTitle(), promotionsItem.getDescription(), promotionsItem.getBadge(), promotionsItem.getShowIndicator(), promotionsItem.getAction());
        } else {
            if (userProfileItem instanceof RecommendationsItem) {
                RecommendationsItem recommendationsItem = (RecommendationsItem) userProfileItem;
                String title2 = recommendationsItem.getTitle();
                DeepLink deeplink = recommendationsItem.getDeeplink();
                List<RecommendationsItem.SnippetItem> items = recommendationsItem.getItems();
                ArrayList arrayList4 = new ArrayList(C42745f0.q(items, 10));
                int i23 = 0;
                for (Object obj : items) {
                    int i24 = i23 + 1;
                    if (i23 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    arrayList4.add(new RecommendationSnippetItem(String.valueOf(i23), (RecommendationsItem.SnippetItem) obj));
                    i23 = i24;
                }
                return new CardItem.RecommendationsItem(deeplink, str, title2, arrayList4);
            }
            if (userProfileItem instanceof SbcDispatchesItem) {
                SbcDispatchesItem sbcDispatchesItem = (SbcDispatchesItem) userProfileItem;
                return new CardItem.SbcDispatchesCardItem(str, sbcDispatchesItem.getTitle(), sbcDispatchesItem.getSubtitle(), sbcDispatchesItem.getUri());
            }
            if (userProfileItem instanceof IacSessionsItem) {
                return null;
            }
            if (userProfileItem instanceof EmptyAddressItem) {
                EmptyAddressItem emptyAddressItem = (EmptyAddressItem) userProfileItem;
                return new CardItem.EmptyAddressCardItem(str, emptyAddressItem.getGeosessionId(), emptyAddressItem.getBadge(), emptyAddressItem.getTitle(), emptyAddressItem.getIcon(), emptyAddressItem.getDescription(), emptyAddressItem.getImage(), emptyAddressItem.getSuggestedAddress(), emptyAddressItem.getProfileAddress(), emptyAddressItem.getAction());
            }
            if (userProfileItem instanceof AddressItem) {
                AddressItem addressItem = (AddressItem) userProfileItem;
                profileJobMenuCardItem = new CardItem.AddressCardItem(str, addressItem.getGeosessionId(), addressItem.getTitle(), addressItem.getKind(), addressItem.getIcon(), addressItem.getDescription(), addressItem.getAction());
            } else {
                if (userProfileItem instanceof ProfileAuctionItem) {
                    ProfileAuctionItem profileAuctionItem = (ProfileAuctionItem) userProfileItem;
                    return new CardItem.ProfileAuctionCardItem(str, profileAuctionItem.getTitle(), profileAuctionItem.getSubtitle(), profileAuctionItem.getDeepLink());
                }
                if (userProfileItem instanceof SimpleProfileItem) {
                    SimpleProfileItem simpleProfileItem = (SimpleProfileItem) userProfileItem;
                    return new CardItem.SimpleCardItem(str, simpleProfileItem.getTitle(), simpleProfileItem.getSubtitle(), simpleProfileItem.getDeepLink());
                }
                if (userProfileItem instanceof SafetySettingsItem) {
                    SafetySettingsItem safetySettingsItem = (SafetySettingsItem) userProfileItem;
                    return new CardItem.SafetyCardItem(str, safetySettingsItem.getTitle(), safetySettingsItem.getSubtitle(), safetySettingsItem.getDeeplink());
                }
                if (userProfileItem instanceof LeasingEntryPointItem) {
                    LeasingEntryPointItem leasingEntryPointItem = (LeasingEntryPointItem) userProfileItem;
                    return new CardItem.LeasingEntryPointItem(str, leasingEntryPointItem.getTitle(), leasingEntryPointItem.getSubtitle(), leasingEntryPointItem.getDeeplink());
                }
                if (userProfileItem instanceof SpecialMachineryRentalItem) {
                    SpecialMachineryRentalItem specialMachineryRentalItem = (SpecialMachineryRentalItem) userProfileItem;
                    return new CardItem.SpecialMachineryRentalItem(str, specialMachineryRentalItem.getTitle(), specialMachineryRentalItem.getSubtitle(), specialMachineryRentalItem.getDeeplink());
                }
                if (userProfileItem instanceof RewardsItem) {
                    RewardsItem rewardsItem = (RewardsItem) userProfileItem;
                    return new CardItem.RewardsCardItem(rewardsItem.getDeeplink(), rewardsItem.getImage(), str, rewardsItem.getTitle(), rewardsItem.getDescription(), rewardsItem.getBadge());
                }
                if (userProfileItem instanceof ReferralEntryPoint) {
                    ReferralEntryPoint referralEntryPoint = (ReferralEntryPoint) userProfileItem;
                    profileJobMenuCardItem = new CardItem.ReferralCardItem(str, referralEntryPoint.getTitle(), referralEntryPoint.getDescription(), referralEntryPoint.getImage(), referralEntryPoint.getAction(), referralEntryPoint.getUserType(), referralEntryPoint.getBadge());
                } else if (userProfileItem instanceof PromoBanner) {
                    PromoBanner promoBanner = (PromoBanner) userProfileItem;
                    profileJobMenuCardItem = new CardItem.PromoBanner(str, promoBanner.getTitle(), promoBanner.getSubtitle(), promoBanner.getBackgroundColor(), promoBanner.getImages(), promoBanner.getClickAction(), promoBanner.getShowEvent());
                } else {
                    if (userProfileItem instanceof ServicesSellerSubscriptionItem) {
                        ServicesSellerSubscriptionItem servicesSellerSubscriptionItem = (ServicesSellerSubscriptionItem) userProfileItem;
                        return new CardItem.ServicesSellerSubscriptionCardItem(str, servicesSellerSubscriptionItem.getTitle(), servicesSellerSubscriptionItem.getSubtitle(), servicesSellerSubscriptionItem.getBadge(), servicesSellerSubscriptionItem.getTargetPage(), servicesSellerSubscriptionItem.getAction());
                    }
                    if (!(userProfileItem instanceof ProfileJobMenuItem)) {
                        if (userProfileItem instanceof AutoSubscribeItem) {
                            AutoSubscribeItem autoSubscribeItem = (AutoSubscribeItem) userProfileItem;
                            return new CardItem.AutoSubscribeItem(str, autoSubscribeItem.getTitle(), autoSubscribeItem.getBadgeText(), autoSubscribeItem.getAction().getTitle(), autoSubscribeItem.getAction().getDeepLink());
                        }
                        if (!(userProfileItem instanceof NdTrxDealCabinetItem)) {
                            throw new IllegalArgumentException("Invalid user profile item type: ".concat(userProfileItem.getClass().getName()));
                        }
                        NdTrxDealCabinetItem ndTrxDealCabinetItem = (NdTrxDealCabinetItem) userProfileItem;
                        return new CardItem.NdTrxDealCabinetCardItem(str, ndTrxDealCabinetItem.getTitle(), ndTrxDealCabinetItem.getSubtitle(), ndTrxDealCabinetItem.getAction().getDeepLink());
                    }
                    ProfileJobMenuItem profileJobMenuItem = (ProfileJobMenuItem) userProfileItem;
                    profileJobMenuCardItem = new CardItem.ProfileJobMenuCardItem(str, profileJobMenuItem.getAction().getTitle(), profileJobMenuItem.getAction().getAdditionalButtonTitle(), profileJobMenuItem.getAction().getBadge(), profileJobMenuItem.getAction().getDeepLink(), profileJobMenuItem.getTiles(), profileJobMenuItem.getTopTile());
                }
            }
        }
        return profileJobMenuCardItem;
    }
}
