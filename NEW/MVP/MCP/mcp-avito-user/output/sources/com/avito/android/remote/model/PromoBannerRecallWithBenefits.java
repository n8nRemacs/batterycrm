package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoBannerRecallWithBenefits.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u000fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0084\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010\u001cR\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b>\u0010\u001cR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b?\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b@\u0010\u0014R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010!¨\u0006C"}, d2 = {"Lcom/avito/android/remote/model/PromoBannerRecallWithBenefits;", "Lcom/avito/android/remote/model/FavoriteElement;", "", "bannerName", "title", "description", "buttonText", "inputTitle", "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "Lcom/avito/android/remote/model/UniversalImage;", "leftImage", "rightImage", "leftText", "rightText", "", "closeItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/text/AttributedText;", "component7", "()Lcom/avito/android/remote/model/UniversalImage;", "component8", "component9", "component10", "component11", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/PromoBannerRecallWithBenefits;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBannerName", "getTitle", "getDescription", "getButtonText", "getInputTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getDisclaimer", "Lcom/avito/android/remote/model/UniversalImage;", "getLeftImage", "getRightImage", "getLeftText", "getRightText", "Ljava/util/List;", "getCloseItems", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PromoBannerRecallWithBenefits implements FavoriteElement {

    @k
    public static final Parcelable.Creator<PromoBannerRecallWithBenefits> CREATOR = new Creator();

    @c("bannerName")
    @k
    private final String bannerName;

    @c("buttonCaption")
    @k
    private final String buttonText;

    @c("closeItems")
    @k
    private final List<String> closeItems;

    @c("description")
    @k
    private final String description;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @k
    private final AttributedText disclaimer;

    @c("inputTitle")
    @k
    private final String inputTitle;

    @c("leftImage")
    @k
    private final UniversalImage leftImage;

    @c("leftText")
    @k
    private final String leftText;

    @c("rightImage")
    @k
    private final UniversalImage rightImage;

    @c("rightText")
    @k
    private final String rightText;

    @c("title")
    @k
    private final String title;

    /* compiled from: PromoBannerRecallWithBenefits.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoBannerRecallWithBenefits> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoBannerRecallWithBenefits createFromParcel(@k Parcel parcel) {
            return new PromoBannerRecallWithBenefits(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(PromoBannerRecallWithBenefits.class.getClassLoader()), (UniversalImage) parcel.readParcelable(PromoBannerRecallWithBenefits.class.getClassLoader()), (UniversalImage) parcel.readParcelable(PromoBannerRecallWithBenefits.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoBannerRecallWithBenefits[] newArray(int i12) {
            return new PromoBannerRecallWithBenefits[i12];
        }
    }

    public PromoBannerRecallWithBenefits(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k AttributedText attributedText, @k UniversalImage universalImage, @k UniversalImage universalImage2, @k String str6, @k String str7, @k List<String> list) {
        this.bannerName = str;
        this.title = str2;
        this.description = str3;
        this.buttonText = str4;
        this.inputTitle = str5;
        this.disclaimer = attributedText;
        this.leftImage = universalImage;
        this.rightImage = universalImage2;
        this.leftText = str6;
        this.rightText = str7;
        this.closeItems = list;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getBannerName() {
        return this.bannerName;
    }

    @k
    /* renamed from: component10, reason: from getter */
    public final String getRightText() {
        return this.rightText;
    }

    @k
    public final List<String> component11() {
        return this.closeItems;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getInputTitle() {
        return this.inputTitle;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final UniversalImage getLeftImage() {
        return this.leftImage;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final UniversalImage getRightImage() {
        return this.rightImage;
    }

    @k
    /* renamed from: component9, reason: from getter */
    public final String getLeftText() {
        return this.leftText;
    }

    @k
    public final PromoBannerRecallWithBenefits copy(@k String bannerName, @k String title, @k String description, @k String buttonText, @k String inputTitle, @k AttributedText disclaimer, @k UniversalImage leftImage, @k UniversalImage rightImage, @k String leftText, @k String rightText, @k List<String> closeItems) {
        return new PromoBannerRecallWithBenefits(bannerName, title, description, buttonText, inputTitle, disclaimer, leftImage, rightImage, leftText, rightText, closeItems);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoBannerRecallWithBenefits)) {
            return false;
        }
        PromoBannerRecallWithBenefits promoBannerRecallWithBenefits = (PromoBannerRecallWithBenefits) other;
        return L.f(this.bannerName, promoBannerRecallWithBenefits.bannerName) && L.f(this.title, promoBannerRecallWithBenefits.title) && L.f(this.description, promoBannerRecallWithBenefits.description) && L.f(this.buttonText, promoBannerRecallWithBenefits.buttonText) && L.f(this.inputTitle, promoBannerRecallWithBenefits.inputTitle) && L.f(this.disclaimer, promoBannerRecallWithBenefits.disclaimer) && L.f(this.leftImage, promoBannerRecallWithBenefits.leftImage) && L.f(this.rightImage, promoBannerRecallWithBenefits.rightImage) && L.f(this.leftText, promoBannerRecallWithBenefits.leftText) && L.f(this.rightText, promoBannerRecallWithBenefits.rightText) && L.f(this.closeItems, promoBannerRecallWithBenefits.closeItems);
    }

    @k
    public final String getBannerName() {
        return this.bannerName;
    }

    @k
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    public final List<String> getCloseItems() {
        return this.closeItems;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @k
    public final String getInputTitle() {
        return this.inputTitle;
    }

    @k
    public final UniversalImage getLeftImage() {
        return this.leftImage;
    }

    @k
    public final String getLeftText() {
        return this.leftText;
    }

    @k
    public final UniversalImage getRightImage() {
        return this.rightImage;
    }

    @k
    public final String getRightText() {
        return this.rightText;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.closeItems.hashCode() + H.d(H.d(a.a(a.a(a.b(H.d(H.d(H.d(H.d(this.bannerName.hashCode() * 31, 31, this.title), 31, this.description), 31, this.buttonText), 31, this.inputTitle), 31, this.disclaimer), 31, this.leftImage), 31, this.rightImage), 31, this.leftText), 31, this.rightText);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PromoBannerRecallWithBenefits(bannerName=");
        sb2.append(this.bannerName);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", buttonText=");
        sb2.append(this.buttonText);
        sb2.append(", inputTitle=");
        sb2.append(this.inputTitle);
        sb2.append(", disclaimer=");
        sb2.append(this.disclaimer);
        sb2.append(", leftImage=");
        sb2.append(this.leftImage);
        sb2.append(", rightImage=");
        sb2.append(this.rightImage);
        sb2.append(", leftText=");
        sb2.append(this.leftText);
        sb2.append(", rightText=");
        sb2.append(this.rightText);
        sb2.append(", closeItems=");
        return H.p(sb2, this.closeItems, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.bannerName);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.inputTitle);
        parcel.writeParcelable(this.disclaimer, flags);
        parcel.writeParcelable(this.leftImage, flags);
        parcel.writeParcelable(this.rightImage, flags);
        parcel.writeString(this.leftText);
        parcel.writeString(this.rightText);
        parcel.writeStringList(this.closeItems);
    }
}
