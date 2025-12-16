package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileItemsConfig.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0012¢\u0006\u0002\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0012HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J´\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006F"}, d2 = {"Lcom/avito/android/remote/model/ProfileItemsConfig;", "", "isSearchAvailable", "", "servicesNpsEnabled", "smbStats", "Lcom/avito/android/remote/model/SmbStatsInfo;", "promoHubInfo", "Lcom/avito/android/remote/model/PromoHubInfo;", "jobOnboardingBanner", "Lcom/avito/android/remote/model/JobOnboardingBanner;", "jobOnboardingButton", "Lcom/avito/android/remote/model/JobOnboardingButton;", "vasPlanBalanceLack", "Lcom/avito/android/remote/model/ProfileVasPlanBalanceLack;", "multiActionsNpsGroup", "", "serviceBooking", "", "Lcom/avito/android/remote/model/ServiceBookingHeaderBlock;", "publishBalance", "Lcom/avito/android/remote/model/ProfileItemsConfigBalance;", "vasBalance", "cpxBalance", "uxFeedbackDeepLinks", "Lcom/avito/android/deep_linking/links/DeepLink;", "(ZLjava/lang/Boolean;Lcom/avito/android/remote/model/SmbStatsInfo;Lcom/avito/android/remote/model/PromoHubInfo;Lcom/avito/android/remote/model/JobOnboardingBanner;Lcom/avito/android/remote/model/JobOnboardingButton;Lcom/avito/android/remote/model/ProfileVasPlanBalanceLack;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/ProfileItemsConfigBalance;Lcom/avito/android/remote/model/ProfileItemsConfigBalance;Lcom/avito/android/remote/model/ProfileItemsConfigBalance;Ljava/util/List;)V", "getCpxBalance", "()Lcom/avito/android/remote/model/ProfileItemsConfigBalance;", "()Z", "getJobOnboardingBanner", "()Lcom/avito/android/remote/model/JobOnboardingBanner;", "getJobOnboardingButton", "()Lcom/avito/android/remote/model/JobOnboardingButton;", "getMultiActionsNpsGroup", "()Ljava/lang/String;", "getPromoHubInfo", "()Lcom/avito/android/remote/model/PromoHubInfo;", "getPublishBalance", "getServiceBooking", "()Ljava/util/List;", "getServicesNpsEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSmbStats", "()Lcom/avito/android/remote/model/SmbStatsInfo;", "getUxFeedbackDeepLinks", "getVasBalance", "getVasPlanBalanceLack", "()Lcom/avito/android/remote/model/ProfileVasPlanBalanceLack;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/Boolean;Lcom/avito/android/remote/model/SmbStatsInfo;Lcom/avito/android/remote/model/PromoHubInfo;Lcom/avito/android/remote/model/JobOnboardingBanner;Lcom/avito/android/remote/model/JobOnboardingButton;Lcom/avito/android/remote/model/ProfileVasPlanBalanceLack;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/ProfileItemsConfigBalance;Lcom/avito/android/remote/model/ProfileItemsConfigBalance;Lcom/avito/android/remote/model/ProfileItemsConfigBalance;Ljava/util/List;)Lcom/avito/android/remote/model/ProfileItemsConfig;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ProfileItemsConfig {

    @c("cpxBalance")
    @l
    private final ProfileItemsConfigBalance cpxBalance;

    @c("isSearchAvailable")
    private final boolean isSearchAvailable;

    @c("jobOnboardingBanner")
    @l
    private final JobOnboardingBanner jobOnboardingBanner;

    @c("jobOnboardingButton")
    @l
    private final JobOnboardingButton jobOnboardingButton;

    @c("multiActionsNpsGroup")
    @l
    private final String multiActionsNpsGroup;

    @c("promoHub")
    @l
    private final PromoHubInfo promoHubInfo;

    @c("publishBalance")
    @l
    private final ProfileItemsConfigBalance publishBalance;

    @c("serviceBooking")
    @l
    private final List<ServiceBookingHeaderBlock> serviceBooking;

    @c("servicesNpsEnabled")
    @l
    private final Boolean servicesNpsEnabled;

    @c("smbStats")
    @l
    private final SmbStatsInfo smbStats;

    @c("uxFeedbackDeepLinks")
    @l
    private final List<DeepLink> uxFeedbackDeepLinks;

    @c("vasBalance")
    @l
    private final ProfileItemsConfigBalance vasBalance;

    @c("vasPlanBalanceLack")
    @l
    private final ProfileVasPlanBalanceLack vasPlanBalanceLack;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileItemsConfig(boolean z12, @l Boolean bool, @l SmbStatsInfo smbStatsInfo, @l PromoHubInfo promoHubInfo, @l JobOnboardingBanner jobOnboardingBanner, @l JobOnboardingButton jobOnboardingButton, @l ProfileVasPlanBalanceLack profileVasPlanBalanceLack, @l String str, @l List<? extends ServiceBookingHeaderBlock> list, @l ProfileItemsConfigBalance profileItemsConfigBalance, @l ProfileItemsConfigBalance profileItemsConfigBalance2, @l ProfileItemsConfigBalance profileItemsConfigBalance3, @l List<? extends DeepLink> list2) {
        this.isSearchAvailable = z12;
        this.servicesNpsEnabled = bool;
        this.smbStats = smbStatsInfo;
        this.promoHubInfo = promoHubInfo;
        this.jobOnboardingBanner = jobOnboardingBanner;
        this.jobOnboardingButton = jobOnboardingButton;
        this.vasPlanBalanceLack = profileVasPlanBalanceLack;
        this.multiActionsNpsGroup = str;
        this.serviceBooking = list;
        this.publishBalance = profileItemsConfigBalance;
        this.vasBalance = profileItemsConfigBalance2;
        this.cpxBalance = profileItemsConfigBalance3;
        this.uxFeedbackDeepLinks = list2;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSearchAvailable() {
        return this.isSearchAvailable;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final ProfileItemsConfigBalance getPublishBalance() {
        return this.publishBalance;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final ProfileItemsConfigBalance getVasBalance() {
        return this.vasBalance;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final ProfileItemsConfigBalance getCpxBalance() {
        return this.cpxBalance;
    }

    @l
    public final List<DeepLink> component13() {
        return this.uxFeedbackDeepLinks;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getServicesNpsEnabled() {
        return this.servicesNpsEnabled;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final SmbStatsInfo getSmbStats() {
        return this.smbStats;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final PromoHubInfo getPromoHubInfo() {
        return this.promoHubInfo;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final JobOnboardingBanner getJobOnboardingBanner() {
        return this.jobOnboardingBanner;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final JobOnboardingButton getJobOnboardingButton() {
        return this.jobOnboardingButton;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final ProfileVasPlanBalanceLack getVasPlanBalanceLack() {
        return this.vasPlanBalanceLack;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getMultiActionsNpsGroup() {
        return this.multiActionsNpsGroup;
    }

    @l
    public final List<ServiceBookingHeaderBlock> component9() {
        return this.serviceBooking;
    }

    @k
    public final ProfileItemsConfig copy(boolean isSearchAvailable, @l Boolean servicesNpsEnabled, @l SmbStatsInfo smbStats, @l PromoHubInfo promoHubInfo, @l JobOnboardingBanner jobOnboardingBanner, @l JobOnboardingButton jobOnboardingButton, @l ProfileVasPlanBalanceLack vasPlanBalanceLack, @l String multiActionsNpsGroup, @l List<? extends ServiceBookingHeaderBlock> serviceBooking, @l ProfileItemsConfigBalance publishBalance, @l ProfileItemsConfigBalance vasBalance, @l ProfileItemsConfigBalance cpxBalance, @l List<? extends DeepLink> uxFeedbackDeepLinks) {
        return new ProfileItemsConfig(isSearchAvailable, servicesNpsEnabled, smbStats, promoHubInfo, jobOnboardingBanner, jobOnboardingButton, vasPlanBalanceLack, multiActionsNpsGroup, serviceBooking, publishBalance, vasBalance, cpxBalance, uxFeedbackDeepLinks);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileItemsConfig)) {
            return false;
        }
        ProfileItemsConfig profileItemsConfig = (ProfileItemsConfig) other;
        return this.isSearchAvailable == profileItemsConfig.isSearchAvailable && L.f(this.servicesNpsEnabled, profileItemsConfig.servicesNpsEnabled) && L.f(this.smbStats, profileItemsConfig.smbStats) && L.f(this.promoHubInfo, profileItemsConfig.promoHubInfo) && L.f(this.jobOnboardingBanner, profileItemsConfig.jobOnboardingBanner) && L.f(this.jobOnboardingButton, profileItemsConfig.jobOnboardingButton) && L.f(this.vasPlanBalanceLack, profileItemsConfig.vasPlanBalanceLack) && L.f(this.multiActionsNpsGroup, profileItemsConfig.multiActionsNpsGroup) && L.f(this.serviceBooking, profileItemsConfig.serviceBooking) && L.f(this.publishBalance, profileItemsConfig.publishBalance) && L.f(this.vasBalance, profileItemsConfig.vasBalance) && L.f(this.cpxBalance, profileItemsConfig.cpxBalance) && L.f(this.uxFeedbackDeepLinks, profileItemsConfig.uxFeedbackDeepLinks);
    }

    @l
    public final ProfileItemsConfigBalance getCpxBalance() {
        return this.cpxBalance;
    }

    @l
    public final JobOnboardingBanner getJobOnboardingBanner() {
        return this.jobOnboardingBanner;
    }

    @l
    public final JobOnboardingButton getJobOnboardingButton() {
        return this.jobOnboardingButton;
    }

    @l
    public final String getMultiActionsNpsGroup() {
        return this.multiActionsNpsGroup;
    }

    @l
    public final PromoHubInfo getPromoHubInfo() {
        return this.promoHubInfo;
    }

    @l
    public final ProfileItemsConfigBalance getPublishBalance() {
        return this.publishBalance;
    }

    @l
    public final List<ServiceBookingHeaderBlock> getServiceBooking() {
        return this.serviceBooking;
    }

    @l
    public final Boolean getServicesNpsEnabled() {
        return this.servicesNpsEnabled;
    }

    @l
    public final SmbStatsInfo getSmbStats() {
        return this.smbStats;
    }

    @l
    public final List<DeepLink> getUxFeedbackDeepLinks() {
        return this.uxFeedbackDeepLinks;
    }

    @l
    public final ProfileItemsConfigBalance getVasBalance() {
        return this.vasBalance;
    }

    @l
    public final ProfileVasPlanBalanceLack getVasPlanBalanceLack() {
        return this.vasPlanBalanceLack;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSearchAvailable) * 31;
        Boolean bool = this.servicesNpsEnabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        SmbStatsInfo smbStatsInfo = this.smbStats;
        int iHashCode3 = (iHashCode2 + (smbStatsInfo == null ? 0 : smbStatsInfo.hashCode())) * 31;
        PromoHubInfo promoHubInfo = this.promoHubInfo;
        int iHashCode4 = (iHashCode3 + (promoHubInfo == null ? 0 : promoHubInfo.hashCode())) * 31;
        JobOnboardingBanner jobOnboardingBanner = this.jobOnboardingBanner;
        int iHashCode5 = (iHashCode4 + (jobOnboardingBanner == null ? 0 : jobOnboardingBanner.hashCode())) * 31;
        JobOnboardingButton jobOnboardingButton = this.jobOnboardingButton;
        int iHashCode6 = (iHashCode5 + (jobOnboardingButton == null ? 0 : jobOnboardingButton.hashCode())) * 31;
        ProfileVasPlanBalanceLack profileVasPlanBalanceLack = this.vasPlanBalanceLack;
        int iHashCode7 = (iHashCode6 + (profileVasPlanBalanceLack == null ? 0 : profileVasPlanBalanceLack.hashCode())) * 31;
        String str = this.multiActionsNpsGroup;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        List<ServiceBookingHeaderBlock> list = this.serviceBooking;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        ProfileItemsConfigBalance profileItemsConfigBalance = this.publishBalance;
        int iHashCode10 = (iHashCode9 + (profileItemsConfigBalance == null ? 0 : profileItemsConfigBalance.hashCode())) * 31;
        ProfileItemsConfigBalance profileItemsConfigBalance2 = this.vasBalance;
        int iHashCode11 = (iHashCode10 + (profileItemsConfigBalance2 == null ? 0 : profileItemsConfigBalance2.hashCode())) * 31;
        ProfileItemsConfigBalance profileItemsConfigBalance3 = this.cpxBalance;
        int iHashCode12 = (iHashCode11 + (profileItemsConfigBalance3 == null ? 0 : profileItemsConfigBalance3.hashCode())) * 31;
        List<DeepLink> list2 = this.uxFeedbackDeepLinks;
        return iHashCode12 + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean isSearchAvailable() {
        return this.isSearchAvailable;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileItemsConfig(isSearchAvailable=");
        sb2.append(this.isSearchAvailable);
        sb2.append(", servicesNpsEnabled=");
        sb2.append(this.servicesNpsEnabled);
        sb2.append(", smbStats=");
        sb2.append(this.smbStats);
        sb2.append(", promoHubInfo=");
        sb2.append(this.promoHubInfo);
        sb2.append(", jobOnboardingBanner=");
        sb2.append(this.jobOnboardingBanner);
        sb2.append(", jobOnboardingButton=");
        sb2.append(this.jobOnboardingButton);
        sb2.append(", vasPlanBalanceLack=");
        sb2.append(this.vasPlanBalanceLack);
        sb2.append(", multiActionsNpsGroup=");
        sb2.append(this.multiActionsNpsGroup);
        sb2.append(", serviceBooking=");
        sb2.append(this.serviceBooking);
        sb2.append(", publishBalance=");
        sb2.append(this.publishBalance);
        sb2.append(", vasBalance=");
        sb2.append(this.vasBalance);
        sb2.append(", cpxBalance=");
        sb2.append(this.cpxBalance);
        sb2.append(", uxFeedbackDeepLinks=");
        return H.p(sb2, this.uxFeedbackDeepLinks, ')');
    }
}
