package com.avito.android.remote.parse.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: AdvertCreditCompositeBroker.kt */
@K51.d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b'\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\b4\u00103¨\u00065"}, d2 = {"Lcom/avito/android/remote/parse/adapter/CompositeBrokerCalculator;", "Landroid/os/Parcelable;", "", "title", "subtitle", "", "creditRate", "", "minCreditAmount", "maxCreditAmount", "term", "maxTerm", "buttonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/text/AttributedText;", "agreementInfo", "", "needToScroll", "Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "renderEventParams", "clickEventParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;FIIILjava/lang/Integer;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "F", "e", "()F", "I", "h", "()I", "f", "j", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "d", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "getRenderEventParams", "()Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "getClickEventParams", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CompositeBrokerCalculator implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CompositeBrokerCalculator> CREATOR = new a();

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

    @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
    @Y61.k
    private final DeepLink deepLink;

    @com.google.gson.annotations.c("maxCreditAmount")
    private final int maxCreditAmount;

    @com.google.gson.annotations.c("maxTerm")
    @Y61.l
    private final Integer maxTerm;

    @com.google.gson.annotations.c("minCreditAmount")
    private final int minCreditAmount;

    @com.google.gson.annotations.c("scroll")
    @Y61.l
    private final Boolean needToScroll;

    @com.google.gson.annotations.c("renderEventParams")
    @Y61.l
    private final CompositeBrokerEventParams renderEventParams;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    @com.google.gson.annotations.c("term")
    private final int term;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    /* compiled from: AdvertCreditCompositeBroker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CompositeBrokerCalculator> {
        @Override // android.os.Parcelable.Creator
        public final CompositeBrokerCalculator createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            float f12 = parcel.readFloat();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(CompositeBrokerCalculator.class.getClassLoader());
            AttributedText attributedText = (AttributedText) parcel.readParcelable(CompositeBrokerCalculator.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CompositeBrokerCalculator(string, string2, f12, i12, i13, i14, numValueOf, string3, deepLink, attributedText, boolValueOf, parcel.readInt() == 0 ? null : CompositeBrokerEventParams.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CompositeBrokerEventParams.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CompositeBrokerCalculator[] newArray(int i12) {
            return new CompositeBrokerCalculator[i12];
        }
    }

    public CompositeBrokerCalculator(@Y61.k String str, @Y61.l String str2, float f12, int i12, int i13, int i14, @Y61.l Integer num, @Y61.k String str3, @Y61.k DeepLink deepLink, @Y61.l AttributedText attributedText, @Y61.l Boolean bool, @Y61.l CompositeBrokerEventParams compositeBrokerEventParams, @Y61.l CompositeBrokerEventParams compositeBrokerEventParams2) {
        this.title = str;
        this.subtitle = str2;
        this.creditRate = f12;
        this.minCreditAmount = i12;
        this.maxCreditAmount = i13;
        this.term = i14;
        this.maxTerm = num;
        this.buttonTitle = str3;
        this.deepLink = deepLink;
        this.agreementInfo = attributedText;
        this.needToScroll = bool;
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
        if (!(obj instanceof CompositeBrokerCalculator)) {
            return false;
        }
        CompositeBrokerCalculator compositeBrokerCalculator = (CompositeBrokerCalculator) obj;
        return kotlin.jvm.internal.L.f(this.title, compositeBrokerCalculator.title) && kotlin.jvm.internal.L.f(this.subtitle, compositeBrokerCalculator.subtitle) && Float.compare(this.creditRate, compositeBrokerCalculator.creditRate) == 0 && this.minCreditAmount == compositeBrokerCalculator.minCreditAmount && this.maxCreditAmount == compositeBrokerCalculator.maxCreditAmount && this.term == compositeBrokerCalculator.term && kotlin.jvm.internal.L.f(this.maxTerm, compositeBrokerCalculator.maxTerm) && kotlin.jvm.internal.L.f(this.buttonTitle, compositeBrokerCalculator.buttonTitle) && kotlin.jvm.internal.L.f(this.deepLink, compositeBrokerCalculator.deepLink) && kotlin.jvm.internal.L.f(this.agreementInfo, compositeBrokerCalculator.agreementInfo) && kotlin.jvm.internal.L.f(this.needToScroll, compositeBrokerCalculator.needToScroll) && kotlin.jvm.internal.L.f(this.renderEventParams, compositeBrokerCalculator.renderEventParams) && kotlin.jvm.internal.L.f(this.clickEventParams, compositeBrokerCalculator.clickEventParams);
    }

    /* renamed from: f, reason: from getter */
    public final int getMaxCreditAmount() {
        return this.maxCreditAmount;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final Integer getMaxTerm() {
        return this.maxTerm;
    }

    @Y61.l
    public final CompositeBrokerEventParams getClickEventParams() {
        return this.clickEventParams;
    }

    @Y61.k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @Y61.l
    public final CompositeBrokerEventParams getRenderEventParams() {
        return this.renderEventParams;
    }

    @Y61.l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final int getMinCreditAmount() {
        return this.minCreditAmount;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iE2 = androidx.appcompat.app.r.e(this.term, androidx.appcompat.app.r.e(this.maxCreditAmount, androidx.appcompat.app.r.e(this.minCreditAmount, androidx.appcompat.app.r.d(this.creditRate, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
        Integer num = this.maxTerm;
        int iE3 = com.avito.android.actions_sheet.a.e(this.deepLink, androidx.compose.foundation.H.d((iE2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.buttonTitle), 31);
        AttributedText attributedText = this.agreementInfo;
        int iHashCode2 = (iE3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.needToScroll;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        CompositeBrokerEventParams compositeBrokerEventParams = this.renderEventParams;
        int iHashCode4 = (iHashCode3 + (compositeBrokerEventParams == null ? 0 : compositeBrokerEventParams.hashCode())) * 31;
        CompositeBrokerEventParams compositeBrokerEventParams2 = this.clickEventParams;
        return iHashCode4 + (compositeBrokerEventParams2 != null ? compositeBrokerEventParams2.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final Boolean getNeedToScroll() {
        return this.needToScroll;
    }

    /* renamed from: j, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    @Y61.k
    public final String toString() {
        return "CompositeBrokerCalculator(title=" + this.title + ", subtitle=" + this.subtitle + ", creditRate=" + this.creditRate + ", minCreditAmount=" + this.minCreditAmount + ", maxCreditAmount=" + this.maxCreditAmount + ", term=" + this.term + ", maxTerm=" + this.maxTerm + ", buttonTitle=" + this.buttonTitle + ", deepLink=" + this.deepLink + ", agreementInfo=" + this.agreementInfo + ", needToScroll=" + this.needToScroll + ", renderEventParams=" + this.renderEventParams + ", clickEventParams=" + this.clickEventParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeFloat(this.creditRate);
        parcel.writeInt(this.minCreditAmount);
        parcel.writeInt(this.maxCreditAmount);
        parcel.writeInt(this.term);
        Integer num = this.maxTerm;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.buttonTitle);
        parcel.writeParcelable(this.deepLink, i12);
        parcel.writeParcelable(this.agreementInfo, i12);
        Boolean bool = this.needToScroll;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
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
}
