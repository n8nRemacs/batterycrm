package com.avito.android.remote.parse.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.advert_docking_badge_bar.AdvertDockingBadgeBar;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: AdvertCreditCompositeBrokerV2.kt */
@K51.d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b'\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b.\u0010-R\u001a\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b/\u0010-R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b0\u0010-R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b1\u0010#R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b2\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b9\u0010&R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0019\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00106\u001a\u0004\b=\u00108R\u001a\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010A\u001a\u0004\bD\u0010C¨\u0006E"}, d2 = {"Lcom/avito/android/remote/parse/adapter/CompositeBrokerCalculatorV2;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge;", "dockingBadges", "subtitle", "", "creditRate", "", "minCreditAmount", "maxCreditAmount", "term", "maxTerm", "monthlyPaymentText", "buttonTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "agreementInfo", "", "needToScroll", "Lcom/avito/android/remote/model/UniversalImage;", "universalIcons", "Lcom/avito/android/remote/parse/adapter/FaqItem;", "faq", "needAuth", "Lcom/avito/android/remote/parse/adapter/DeepLinkInfo;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "renderEventParams", "clickEventParams", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;FIIIILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;ZLjava/util/List;Lcom/avito/android/remote/parse/adapter/FaqItem;ZLcom/avito/android/remote/parse/adapter/DeepLinkInfo;Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "g", "()Ljava/util/List;", "getSubtitle", "F", "e", "()F", "I", "k", "()I", "i", "o", "j", "l", "d", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Z", "n", "()Z", "getUniversalIcons", "Lcom/avito/android/remote/parse/adapter/FaqItem;", "h", "()Lcom/avito/android/remote/parse/adapter/FaqItem;", "m", "Lcom/avito/android/remote/parse/adapter/DeepLinkInfo;", "f", "()Lcom/avito/android/remote/parse/adapter/DeepLinkInfo;", "Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "getRenderEventParams", "()Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "getClickEventParams", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CompositeBrokerCalculatorV2 implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CompositeBrokerCalculatorV2> CREATOR = new a();

    @com.google.gson.annotations.c("agreementInfo")
    @Y61.l
    private final AttributedText agreementInfo;

    @com.google.gson.annotations.c("buttonTitle")
    @Y61.k
    private final String buttonTitle;

    @com.google.gson.annotations.c("clickEventParams")
    @Y61.l
    private final CompositeBrokerEventParams clickEventParams;

    @com.google.gson.annotations.c("creditRate")
    private final float creditRate;

    @com.google.gson.annotations.c("deepLinkParts")
    @Y61.k
    private final DeepLinkInfo deepLink;

    @com.google.gson.annotations.c("dockingBadges")
    @Y61.l
    private final List<AdvertDockingBadgeBar.Badge> dockingBadges;

    @com.google.gson.annotations.c("faq")
    @Y61.l
    private final FaqItem faq;

    @com.google.gson.annotations.c("maxCreditAmount")
    private final int maxCreditAmount;

    @com.google.gson.annotations.c("maxTerm")
    private final int maxTerm;

    @com.google.gson.annotations.c("minCreditAmount")
    private final int minCreditAmount;

    @com.google.gson.annotations.c("monthlyPaymentText")
    @Y61.k
    private final String monthlyPaymentText;

    @com.google.gson.annotations.c("needAuth")
    private final boolean needAuth;

    @com.google.gson.annotations.c("scroll")
    private final boolean needToScroll;

    @com.google.gson.annotations.c("renderEventParams")
    @Y61.l
    private final CompositeBrokerEventParams renderEventParams;

    @com.google.gson.annotations.c("subtitle")
    @Y61.k
    private final String subtitle;

    @com.google.gson.annotations.c("term")
    private final int term;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("icons")
    @Y61.k
    private final List<UniversalImage> universalIcons;

    /* compiled from: AdvertCreditCompositeBrokerV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CompositeBrokerCalculatorV2> {
        @Override // android.os.Parcelable.Creator
        public final CompositeBrokerCalculatorV2 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AdvertDockingBadgeBar.Badge.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            String string2 = parcel.readString();
            float f12 = parcel.readFloat();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(CompositeBrokerCalculatorV2.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            int i17 = parcel.readInt();
            boolean z13 = z12;
            ArrayList arrayList3 = new ArrayList(i17);
            int iL2 = 0;
            while (iL2 != i17) {
                iL2 = com.avito.android.actions_sheet.a.l(CompositeBrokerCalculatorV2.class, parcel, arrayList3, iL2, 1);
                i17 = i17;
            }
            return new CompositeBrokerCalculatorV2(string, arrayList, string2, f12, i13, i14, i15, i16, string3, string4, attributedText, z13, arrayList3, parcel.readInt() == 0 ? null : FaqItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, DeepLinkInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CompositeBrokerEventParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CompositeBrokerEventParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CompositeBrokerCalculatorV2[] newArray(int i12) {
            return new CompositeBrokerCalculatorV2[i12];
        }
    }

    public CompositeBrokerCalculatorV2(@Y61.k String str, @Y61.l List<AdvertDockingBadgeBar.Badge> list, @Y61.k String str2, float f12, int i12, int i13, int i14, int i15, @Y61.k String str3, @Y61.k String str4, @Y61.l AttributedText attributedText, boolean z12, @Y61.k List<UniversalImage> list2, @Y61.l FaqItem faqItem, boolean z13, @Y61.k DeepLinkInfo deepLinkInfo, @Y61.l CompositeBrokerEventParams compositeBrokerEventParams, @Y61.l CompositeBrokerEventParams compositeBrokerEventParams2) {
        this.title = str;
        this.dockingBadges = list;
        this.subtitle = str2;
        this.creditRate = f12;
        this.minCreditAmount = i12;
        this.maxCreditAmount = i13;
        this.term = i14;
        this.maxTerm = i15;
        this.monthlyPaymentText = str3;
        this.buttonTitle = str4;
        this.agreementInfo = attributedText;
        this.needToScroll = z12;
        this.universalIcons = list2;
        this.faq = faqItem;
        this.needAuth = z13;
        this.deepLink = deepLinkInfo;
        this.renderEventParams = compositeBrokerEventParams;
        this.clickEventParams = compositeBrokerEventParams2;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final AttributedText getAgreementInfo() {
        return this.agreementInfo;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final float getCreditRate() {
        return this.creditRate;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeBrokerCalculatorV2)) {
            return false;
        }
        CompositeBrokerCalculatorV2 compositeBrokerCalculatorV2 = (CompositeBrokerCalculatorV2) obj;
        return kotlin.jvm.internal.L.f(this.title, compositeBrokerCalculatorV2.title) && kotlin.jvm.internal.L.f(this.dockingBadges, compositeBrokerCalculatorV2.dockingBadges) && kotlin.jvm.internal.L.f(this.subtitle, compositeBrokerCalculatorV2.subtitle) && Float.compare(this.creditRate, compositeBrokerCalculatorV2.creditRate) == 0 && this.minCreditAmount == compositeBrokerCalculatorV2.minCreditAmount && this.maxCreditAmount == compositeBrokerCalculatorV2.maxCreditAmount && this.term == compositeBrokerCalculatorV2.term && this.maxTerm == compositeBrokerCalculatorV2.maxTerm && kotlin.jvm.internal.L.f(this.monthlyPaymentText, compositeBrokerCalculatorV2.monthlyPaymentText) && kotlin.jvm.internal.L.f(this.buttonTitle, compositeBrokerCalculatorV2.buttonTitle) && kotlin.jvm.internal.L.f(this.agreementInfo, compositeBrokerCalculatorV2.agreementInfo) && this.needToScroll == compositeBrokerCalculatorV2.needToScroll && kotlin.jvm.internal.L.f(this.universalIcons, compositeBrokerCalculatorV2.universalIcons) && kotlin.jvm.internal.L.f(this.faq, compositeBrokerCalculatorV2.faq) && this.needAuth == compositeBrokerCalculatorV2.needAuth && kotlin.jvm.internal.L.f(this.deepLink, compositeBrokerCalculatorV2.deepLink) && kotlin.jvm.internal.L.f(this.renderEventParams, compositeBrokerCalculatorV2.renderEventParams) && kotlin.jvm.internal.L.f(this.clickEventParams, compositeBrokerCalculatorV2.clickEventParams);
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final DeepLinkInfo getDeepLink() {
        return this.deepLink;
    }

    @Y61.l
    public final List<AdvertDockingBadgeBar.Badge> g() {
        return this.dockingBadges;
    }

    @Y61.l
    public final CompositeBrokerEventParams getClickEventParams() {
        return this.clickEventParams;
    }

    @Y61.l
    public final CompositeBrokerEventParams getRenderEventParams() {
        return this.renderEventParams;
    }

    @Y61.k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    public final List<UniversalImage> getUniversalIcons() {
        return this.universalIcons;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final FaqItem getFaq() {
        return this.faq;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        List<AdvertDockingBadgeBar.Badge> list = this.dockingBadges;
        int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(androidx.appcompat.app.r.e(this.maxTerm, androidx.appcompat.app.r.e(this.term, androidx.appcompat.app.r.e(this.maxCreditAmount, androidx.appcompat.app.r.e(this.minCreditAmount, androidx.appcompat.app.r.d(this.creditRate, androidx.compose.foundation.H.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.subtitle), 31), 31), 31), 31), 31), 31, this.monthlyPaymentText), 31, this.buttonTitle);
        AttributedText attributedText = this.agreementInfo;
        int iE2 = androidx.compose.foundation.H.e(androidx.appcompat.app.r.i((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.needToScroll), 31, this.universalIcons);
        FaqItem faqItem = this.faq;
        int iHashCode2 = (this.deepLink.hashCode() + androidx.appcompat.app.r.i((iE2 + (faqItem == null ? 0 : faqItem.hashCode())) * 31, 31, this.needAuth)) * 31;
        CompositeBrokerEventParams compositeBrokerEventParams = this.renderEventParams;
        int iHashCode3 = (iHashCode2 + (compositeBrokerEventParams == null ? 0 : compositeBrokerEventParams.hashCode())) * 31;
        CompositeBrokerEventParams compositeBrokerEventParams2 = this.clickEventParams;
        return iHashCode3 + (compositeBrokerEventParams2 != null ? compositeBrokerEventParams2.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final int getMaxCreditAmount() {
        return this.maxCreditAmount;
    }

    /* renamed from: j, reason: from getter */
    public final int getMaxTerm() {
        return this.maxTerm;
    }

    /* renamed from: k, reason: from getter */
    public final int getMinCreditAmount() {
        return this.minCreditAmount;
    }

    @Y61.k
    /* renamed from: l, reason: from getter */
    public final String getMonthlyPaymentText() {
        return this.monthlyPaymentText;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getNeedAuth() {
        return this.needAuth;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getNeedToScroll() {
        return this.needToScroll;
    }

    /* renamed from: o, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    @Y61.k
    public final String toString() {
        return "CompositeBrokerCalculatorV2(title=" + this.title + ", dockingBadges=" + this.dockingBadges + ", subtitle=" + this.subtitle + ", creditRate=" + this.creditRate + ", minCreditAmount=" + this.minCreditAmount + ", maxCreditAmount=" + this.maxCreditAmount + ", term=" + this.term + ", maxTerm=" + this.maxTerm + ", monthlyPaymentText=" + this.monthlyPaymentText + ", buttonTitle=" + this.buttonTitle + ", agreementInfo=" + this.agreementInfo + ", needToScroll=" + this.needToScroll + ", universalIcons=" + this.universalIcons + ", faq=" + this.faq + ", needAuth=" + this.needAuth + ", deepLink=" + this.deepLink + ", renderEventParams=" + this.renderEventParams + ", clickEventParams=" + this.clickEventParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        List<AdvertDockingBadgeBar.Badge> list = this.dockingBadges;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AdvertDockingBadgeBar.Badge) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeString(this.subtitle);
        parcel.writeFloat(this.creditRate);
        parcel.writeInt(this.minCreditAmount);
        parcel.writeInt(this.maxCreditAmount);
        parcel.writeInt(this.term);
        parcel.writeInt(this.maxTerm);
        parcel.writeString(this.monthlyPaymentText);
        parcel.writeString(this.buttonTitle);
        parcel.writeParcelable(this.agreementInfo, i12);
        parcel.writeInt(this.needToScroll ? 1 : 0);
        Iterator itJ = C0.j(this.universalIcons, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        FaqItem faqItem = this.faq;
        if (faqItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            faqItem.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.needAuth ? 1 : 0);
        this.deepLink.writeToParcel(parcel, i12);
        CompositeBrokerEventParams compositeBrokerEventParams = this.renderEventParams;
        if (compositeBrokerEventParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            compositeBrokerEventParams.writeToParcel(parcel, i12);
        }
        CompositeBrokerEventParams compositeBrokerEventParams2 = this.clickEventParams;
        if (compositeBrokerEventParams2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            compositeBrokerEventParams2.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ CompositeBrokerCalculatorV2(String str, List list, String str2, float f12, int i12, int i13, int i14, int i15, String str3, String str4, AttributedText attributedText, boolean z12, List list2, FaqItem faqItem, boolean z13, DeepLinkInfo deepLinkInfo, CompositeBrokerEventParams compositeBrokerEventParams, CompositeBrokerEventParams compositeBrokerEventParams2, int i16, C42822w c42822w) {
        this(str, list, str2, f12, i12, i13, i14, i15, str3, str4, attributedText, z12, list2, faqItem, (i16 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z13, deepLinkInfo, compositeBrokerEventParams, compositeBrokerEventParams2);
    }
}
