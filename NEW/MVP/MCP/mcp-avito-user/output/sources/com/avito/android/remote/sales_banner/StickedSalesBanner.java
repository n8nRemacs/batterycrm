package com.avito.android.remote.sales_banner;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StickedSalesBanner.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/avito/android/remote/sales_banner/StickedSalesBanner;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "text", "", "endTime", "Lcom/avito/android/remote/model/UniversalImage;", "backgroundImage", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "bannerType", "", "marginBottom", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Long;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "g", "()Lcom/avito/android/remote/model/text/AttributedText;", "f", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "Lcom/avito/android/remote/model/UniversalImage;", "getBackgroundImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StickedSalesBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<StickedSalesBanner> CREATOR = new a();

    @c("backgroundImage")
    @k
    private final UniversalImage backgroundImage;

    @c("bannerType")
    @l
    private final String bannerType;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deepLink;

    @c("endTime")
    @l
    private final Long endTime;

    @c("marginBottom")
    @l
    private final Integer marginBottom;

    @c("attributedText")
    @l
    private final AttributedText text;

    @c("attributedTitle")
    @k
    private final AttributedText title;

    /* compiled from: StickedSalesBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StickedSalesBanner> {
        @Override // android.os.Parcelable.Creator
        public final StickedSalesBanner createFromParcel(Parcel parcel) {
            return new StickedSalesBanner((AttributedText) parcel.readParcelable(StickedSalesBanner.class.getClassLoader()), (AttributedText) parcel.readParcelable(StickedSalesBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (UniversalImage) parcel.readParcelable(StickedSalesBanner.class.getClassLoader()), (DeepLink) parcel.readParcelable(StickedSalesBanner.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final StickedSalesBanner[] newArray(int i12) {
            return new StickedSalesBanner[i12];
        }
    }

    public StickedSalesBanner(@k AttributedText attributedText, @l AttributedText attributedText2, @l Long l12, @k UniversalImage universalImage, @k DeepLink deepLink, @l String str, @l Integer num) {
        this.title = attributedText;
        this.text = attributedText2;
        this.endTime = l12;
        this.backgroundImage = universalImage;
        this.deepLink = deepLink;
        this.bannerType = str;
        this.marginBottom = num;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getBannerType() {
        return this.bannerType;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Integer getMarginBottom() {
        return this.marginBottom;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickedSalesBanner)) {
            return false;
        }
        StickedSalesBanner stickedSalesBanner = (StickedSalesBanner) obj;
        return L.f(this.title, stickedSalesBanner.title) && L.f(this.text, stickedSalesBanner.text) && L.f(this.endTime, stickedSalesBanner.endTime) && L.f(this.backgroundImage, stickedSalesBanner.backgroundImage) && L.f(this.deepLink, stickedSalesBanner.deepLink) && L.f(this.bannerType, stickedSalesBanner.bannerType) && L.f(this.marginBottom, stickedSalesBanner.marginBottom);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    public final UniversalImage getBackgroundImage() {
        return this.backgroundImage;
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.text;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Long l12 = this.endTime;
        int iE2 = com.avito.android.actions_sheet.a.e(this.deepLink, com.avito.android.actions_sheet.a.a((iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.backgroundImage), 31);
        String str = this.bannerType;
        int iHashCode3 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.marginBottom;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StickedSalesBanner(title=");
        sb2.append(this.title);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", endTime=");
        sb2.append(this.endTime);
        sb2.append(", backgroundImage=");
        sb2.append(this.backgroundImage);
        sb2.append(", deepLink=");
        sb2.append(this.deepLink);
        sb2.append(", bannerType=");
        sb2.append(this.bannerType);
        sb2.append(", marginBottom=");
        return s.j(sb2, this.marginBottom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.text, i12);
        Long l12 = this.endTime;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeParcelable(this.backgroundImage, i12);
        parcel.writeParcelable(this.deepLink, i12);
        parcel.writeString(this.bannerType);
        Integer num = this.marginBottom;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
