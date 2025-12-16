package com.avito.android.remote.adapter;

import Y61.k;
import com.avito.android.N2;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.AdvertImage;
import com.avito.android.remote.model.AdvertStats;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.remote.model.Service;
import com.avito.android.remote.model.TimeToLive;
import com.avito.android.remote.model.UserAdvert;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.model.user_adverts.FashionAuthentication;
import com.avito.android.remote.model.user_adverts.RealtyLeadgen;
import com.avito.android.remote.model.user_adverts.RealtyOwnerVerificationBadge;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: UserAdvertDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/adapter/UserAdvertDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/UserAdvert;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserAdvertDeserializer implements h<UserAdvert> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final N2 f253075a;

    public UserAdvertDeserializer(@k N2 n22) {
        this.f253075a = n22;
    }

    @Override // com.google.gson.h
    public final UserAdvert deserialize(i iVar, Type type, g gVar) {
        UserAdvert.AdvertTips advertTips;
        RealtyOwnerVerificationBadge realtyOwnerVerificationBadge;
        ArrayList arrayList;
        com.google.gson.k kVarI = iVar.i();
        String strS = kVarI.D("id").s();
        String strS2 = kVarI.D("title").s();
        i iVarD = kVarI.D("category");
        NameIdEntity nameIdEntity = (NameIdEntity) (iVarD == null ? null : gVar.b(iVarD, NameIdEntity.class));
        i iVarD2 = kVarI.D("images");
        AdvertImage advertImage = (AdvertImage) (iVarD2 == null ? null : gVar.b(iVarD2, AdvertImage.class));
        i iVarD3 = kVarI.D("video");
        Video video = (Video) (iVarD3 == null ? null : gVar.b(iVarD3, Video.class));
        i iVarD4 = kVarI.D("price");
        String strS3 = iVarD4 != null ? iVarD4.s() : null;
        i iVarD5 = kVarI.D("saleInfo");
        AttributedText attributedText = (AttributedText) (iVarD5 == null ? null : gVar.b(iVarD5, AttributedText.class));
        i iVarD6 = kVarI.D("shortcut");
        String strS4 = iVarD6 != null ? iVarD6.s() : null;
        long jL2 = kVarI.D(CrashHianalyticsData.TIME).l();
        i iVarD7 = kVarI.D("stats");
        AdvertStats advertStats = (AdvertStats) (iVarD7 == null ? null : gVar.b(iVarD7, AdvertStats.class));
        N2 n22 = this.f253075a;
        n<Object> nVar = N2.f67352m[5];
        if (((Boolean) n22.f67358g.a().invoke()).booleanValue()) {
            i iVarD8 = kVarI.D("tip");
            advertTips = (UserAdvert.AdvertTips) (iVarD8 == null ? null : gVar.b(iVarD8, UserAdvert.AdvertTips.class));
        } else {
            advertTips = null;
        }
        f fVarH = kVarI.D("services").h();
        int size = fVarH.f362000b.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iC2 = 0;
        while (iC2 < size) {
            i iVarW = fVarH.w(iC2);
            ArrayList arrayList3 = arrayList2;
            iC2 = b.c(gVar, iVarW != null ? iVarW.i() : null, Service.class, arrayList3, iC2, 1);
            n22 = n22;
            size = size;
            fVarH = fVarH;
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = arrayList2;
        N2 n23 = n22;
        i iVarD9 = kVarI.D("ttl");
        TimeToLive timeToLive = (TimeToLive) (iVarD9 == null ? null : gVar.b(iVarD9, TimeToLive.class));
        i iVarD10 = kVarI.D("declineReason");
        String strS5 = iVarD10 != null ? iVarD10.s() : null;
        i iVarD11 = kVarI.D(TooltipAttribute.PARAM_DEEP_LINK);
        DeepLink deepLink = (DeepLink) (iVarD11 == null ? null : gVar.b(iVarD11, DeepLink.class));
        Boolean boolValueOf = Boolean.valueOf(kVarI.D(NotificationsSettings.Section.SECTION_DELIVERY) != null);
        i iVarD12 = kVarI.D("status");
        UserAdvert.Status status = (UserAdvert.Status) (iVarD12 == null ? null : gVar.b(iVarD12, UserAdvert.Status.class));
        i iVarD13 = kVarI.D("verification");
        UserAdvert.VerificationStatus verificationStatus = (UserAdvert.VerificationStatus) (iVarD13 == null ? null : gVar.b(iVarD13, UserAdvert.VerificationStatus.class));
        i iVarD14 = kVarI.D("liquidityStatus");
        UserAdvert.LiquidityStatus liquidityStatus = (UserAdvert.LiquidityStatus) (iVarD14 == null ? null : gVar.b(iVarD14, UserAdvert.LiquidityStatus.class));
        i iVarD15 = kVarI.D("shortcutTitle");
        String strS6 = iVarD15 != null ? iVarD15.s() : null;
        i iVarD16 = kVarI.D("priceBadge");
        UserAdvert.PriceBadge priceBadge = (UserAdvert.PriceBadge) (iVarD16 == null ? null : gVar.b(iVarD16, UserAdvert.PriceBadge.class));
        i iVarD17 = kVarI.D("isAutoPublishOn");
        Boolean boolValueOf2 = iVarD17 != null ? Boolean.valueOf(iVarD17.d()) : null;
        i iVarD18 = kVarI.D("reservationInfo");
        String strS7 = iVarD18 != null ? iVarD18.s() : null;
        i iVarD19 = kVarI.D("isModerated");
        boolean zD2 = iVarD19 != null ? iVarD19.d() : false;
        i iVarD20 = kVarI.D("location");
        String strS8 = iVarD20 != null ? iVarD20.s() : null;
        i iVarD21 = kVarI.D("addressesAdditionalInfo");
        UserAdvert.AddressesAdditionalInfo addressesAdditionalInfo = (UserAdvert.AddressesAdditionalInfo) (iVarD21 == null ? null : gVar.b(iVarD21, UserAdvert.AddressesAdditionalInfo.class));
        i iVarD22 = kVarI.D("multiItemsInfo");
        UserAdvert.LinkedAdvertisementsInfo linkedAdvertisementsInfo = (UserAdvert.LinkedAdvertisementsInfo) (iVarD22 == null ? null : gVar.b(iVarD22, UserAdvert.LinkedAdvertisementsInfo.class));
        i iVarD23 = kVarI.D("contactsBbl");
        UserAdvert.ContactsBbl contactsBbl = (UserAdvert.ContactsBbl) (iVarD23 == null ? null : gVar.b(iVarD23, UserAdvert.ContactsBbl.class));
        n<Object> nVar2 = N2.f67352m[0];
        if (((Boolean) n23.f67353b.a().invoke()).booleanValue()) {
            i iVarD24 = kVarI.D("badge");
            realtyOwnerVerificationBadge = (RealtyOwnerVerificationBadge) (iVarD24 == null ? null : gVar.b(iVarD24, RealtyOwnerVerificationBadge.class));
        } else {
            realtyOwnerVerificationBadge = null;
        }
        i iVarD25 = kVarI.D("fashionAuthentication");
        FashionAuthentication fashionAuthentication = (FashionAuthentication) (iVarD25 == null ? null : gVar.b(iVarD25, FashionAuthentication.class));
        i iVarD26 = kVarI.D("realtyLeadgen");
        RealtyLeadgen realtyLeadgen = (RealtyLeadgen) (iVarD26 == null ? null : gVar.b(iVarD26, RealtyLeadgen.class));
        i iVarD27 = kVarI.D("actions");
        if (iVarD27 != null) {
            ArrayList arrayList5 = iVarD27.h().f362000b;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                arrayList6.add(gVar.b((i) it.next(), String.class));
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        i iVarD28 = kVarI.D("availableStocks");
        String strE = iVarD28 != null ? C34328m0.e(iVarD28) : null;
        i iVarD29 = kVarI.D("editDeeplink");
        DeepLink deepLink2 = (DeepLink) (iVarD29 == null ? null : gVar.b(iVarD29, DeepLink.class));
        i iVarD30 = kVarI.D("fillParameters");
        String strE2 = iVarD30 != null ? C34328m0.e(iVarD30) : null;
        i iVarD31 = kVarI.D("actionButton");
        UserAdvert.ActionButton actionButton = (UserAdvert.ActionButton) (iVarD31 == null ? null : gVar.b(iVarD31, UserAdvert.ActionButton.class));
        i iVarD32 = kVarI.D("searchPosition");
        UserAdvert.SearchPosition searchPosition = (UserAdvert.SearchPosition) (iVarD32 == null ? null : gVar.b(iVarD32, UserAdvert.SearchPosition.class));
        i iVarD33 = kVarI.D("deliveryAlertText");
        return new UserAdvert(strS, strS2, nameIdEntity, advertImage, video, strS3, attributedText, strS4, jL2, advertStats, advertTips, arrayList4, timeToLive, strS5, strS7, realtyLeadgen, zD2, deepLink, boolValueOf, status, strS6, priceBadge, realtyOwnerVerificationBadge, fashionAuthentication, boolValueOf2, verificationStatus, liquidityStatus, arrayList, strE, deepLink2, strE2, iVarD33 != null ? C34328m0.e(iVarD33) : null, strS8, addressesAdditionalInfo, contactsBbl, linkedAdvertisementsInfo, actionButton, searchPosition, null, null, 0, 192, null);
    }
}
