package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PpRecallBannerType.kt */
@d
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b'\u0010(Jz\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0018J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020,HÖ\u0001¢\u0006\u0004\b4\u0010.J \u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020,HÖ\u0001¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\bC\u0010\u0018R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u0010!R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bF\u0010\u001aR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010$R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bJ\u0010&R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bL\u0010(¨\u0006M"}, d2 = {"Lcom/avito/android/remote/model/ComfortableDealPromoWidget;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "Lcom/avito/android/remote/model/ImageInformation;", "imageInformation", "Lcom/avito/android/remote/model/WidgetStyle;", "widgetStyle", "phoneInputTitle", "Lcom/avito/android/remote/model/SubmitButton;", "submitButton", "bottomText", "", "Lcom/avito/android/remote/model/BottomSheetPayloadItem;", "bottomSheetItems", "Lcom/avito/android/remote/model/ShowBannerPayload;", "showBannerPayload", "Lcom/avito/android/remote/model/CloseBannerPayload;", "closeBannerPayload", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ImageInformation;Lcom/avito/android/remote/model/WidgetStyle;Ljava/lang/String;Lcom/avito/android/remote/model/SubmitButton;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/ShowBannerPayload;Lcom/avito/android/remote/model/CloseBannerPayload;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Lcom/avito/android/remote/model/ImageInformation;", "component4", "()Lcom/avito/android/remote/model/WidgetStyle;", "component5", "component6", "()Lcom/avito/android/remote/model/SubmitButton;", "component7", "component8", "()Ljava/util/List;", "component9", "()Lcom/avito/android/remote/model/ShowBannerPayload;", "component10", "()Lcom/avito/android/remote/model/CloseBannerPayload;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ImageInformation;Lcom/avito/android/remote/model/WidgetStyle;Ljava/lang/String;Lcom/avito/android/remote/model/SubmitButton;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/ShowBannerPayload;Lcom/avito/android/remote/model/CloseBannerPayload;)Lcom/avito/android/remote/model/ComfortableDealPromoWidget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/remote/model/ImageInformation;", "getImageInformation", "Lcom/avito/android/remote/model/WidgetStyle;", "getWidgetStyle", "getPhoneInputTitle", "Lcom/avito/android/remote/model/SubmitButton;", "getSubmitButton", "getBottomText", "Ljava/util/List;", "getBottomSheetItems", "Lcom/avito/android/remote/model/ShowBannerPayload;", "getShowBannerPayload", "Lcom/avito/android/remote/model/CloseBannerPayload;", "getCloseBannerPayload", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ComfortableDealPromoWidget implements Parcelable {

    @k
    public static final Parcelable.Creator<ComfortableDealPromoWidget> CREATOR = new Creator();

    @c("bottomSheetPayload")
    @k
    private final List<BottomSheetPayloadItem> bottomSheetItems;

    @c("bottomText")
    @k
    private final AttributedText bottomText;

    @c("closeBannerPayload")
    @k
    private final CloseBannerPayload closeBannerPayload;

    @c("imageInformation")
    @k
    private final ImageInformation imageInformation;

    @c("phoneInputTitle")
    @k
    private final String phoneInputTitle;

    @c("openBannerPayload")
    @k
    private final ShowBannerPayload showBannerPayload;

    @c("button")
    @k
    private final SubmitButton submitButton;

    @c("subtitle")
    @k
    private final AttributedText subtitle;

    @c("title")
    @k
    private final String title;

    @c("widgetStyle")
    @k
    private final WidgetStyle widgetStyle;

    /* compiled from: PpRecallBannerType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ComfortableDealPromoWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealPromoWidget createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ComfortableDealPromoWidget.class.getClassLoader());
            ImageInformation imageInformationCreateFromParcel = ImageInformation.CREATOR.createFromParcel(parcel);
            WidgetStyle widgetStyleCreateFromParcel = WidgetStyle.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            SubmitButton submitButtonCreateFromParcel = SubmitButton.CREATOR.createFromParcel(parcel);
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(ComfortableDealPromoWidget.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(BottomSheetPayloadItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ComfortableDealPromoWidget(string, attributedText, imageInformationCreateFromParcel, widgetStyleCreateFromParcel, string2, submitButtonCreateFromParcel, attributedText2, arrayList, ShowBannerPayload.CREATOR.createFromParcel(parcel), CloseBannerPayload.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealPromoWidget[] newArray(int i12) {
            return new ComfortableDealPromoWidget[i12];
        }
    }

    public ComfortableDealPromoWidget(@k String str, @k AttributedText attributedText, @k ImageInformation imageInformation, @k WidgetStyle widgetStyle, @k String str2, @k SubmitButton submitButton, @k AttributedText attributedText2, @k List<BottomSheetPayloadItem> list, @k ShowBannerPayload showBannerPayload, @k CloseBannerPayload closeBannerPayload) {
        this.title = str;
        this.subtitle = attributedText;
        this.imageInformation = imageInformation;
        this.widgetStyle = widgetStyle;
        this.phoneInputTitle = str2;
        this.submitButton = submitButton;
        this.bottomText = attributedText2;
        this.bottomSheetItems = list;
        this.showBannerPayload = showBannerPayload;
        this.closeBannerPayload = closeBannerPayload;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component10, reason: from getter */
    public final CloseBannerPayload getCloseBannerPayload() {
        return this.closeBannerPayload;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final ImageInformation getImageInformation() {
        return this.imageInformation;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final WidgetStyle getWidgetStyle() {
        return this.widgetStyle;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getPhoneInputTitle() {
        return this.phoneInputTitle;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final SubmitButton getSubmitButton() {
        return this.submitButton;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final AttributedText getBottomText() {
        return this.bottomText;
    }

    @k
    public final List<BottomSheetPayloadItem> component8() {
        return this.bottomSheetItems;
    }

    @k
    /* renamed from: component9, reason: from getter */
    public final ShowBannerPayload getShowBannerPayload() {
        return this.showBannerPayload;
    }

    @k
    public final ComfortableDealPromoWidget copy(@k String title, @k AttributedText subtitle, @k ImageInformation imageInformation, @k WidgetStyle widgetStyle, @k String phoneInputTitle, @k SubmitButton submitButton, @k AttributedText bottomText, @k List<BottomSheetPayloadItem> bottomSheetItems, @k ShowBannerPayload showBannerPayload, @k CloseBannerPayload closeBannerPayload) {
        return new ComfortableDealPromoWidget(title, subtitle, imageInformation, widgetStyle, phoneInputTitle, submitButton, bottomText, bottomSheetItems, showBannerPayload, closeBannerPayload);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComfortableDealPromoWidget)) {
            return false;
        }
        ComfortableDealPromoWidget comfortableDealPromoWidget = (ComfortableDealPromoWidget) other;
        return L.f(this.title, comfortableDealPromoWidget.title) && L.f(this.subtitle, comfortableDealPromoWidget.subtitle) && L.f(this.imageInformation, comfortableDealPromoWidget.imageInformation) && L.f(this.widgetStyle, comfortableDealPromoWidget.widgetStyle) && L.f(this.phoneInputTitle, comfortableDealPromoWidget.phoneInputTitle) && L.f(this.submitButton, comfortableDealPromoWidget.submitButton) && L.f(this.bottomText, comfortableDealPromoWidget.bottomText) && L.f(this.bottomSheetItems, comfortableDealPromoWidget.bottomSheetItems) && L.f(this.showBannerPayload, comfortableDealPromoWidget.showBannerPayload) && L.f(this.closeBannerPayload, comfortableDealPromoWidget.closeBannerPayload);
    }

    @k
    public final List<BottomSheetPayloadItem> getBottomSheetItems() {
        return this.bottomSheetItems;
    }

    @k
    public final AttributedText getBottomText() {
        return this.bottomText;
    }

    @k
    public final CloseBannerPayload getCloseBannerPayload() {
        return this.closeBannerPayload;
    }

    @k
    public final ImageInformation getImageInformation() {
        return this.imageInformation;
    }

    @k
    public final String getPhoneInputTitle() {
        return this.phoneInputTitle;
    }

    @k
    public final ShowBannerPayload getShowBannerPayload() {
        return this.showBannerPayload;
    }

    @k
    public final SubmitButton getSubmitButton() {
        return this.submitButton;
    }

    @k
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final WidgetStyle getWidgetStyle() {
        return this.widgetStyle;
    }

    public int hashCode() {
        return this.closeBannerPayload.hashCode() + ((this.showBannerPayload.hashCode() + H.e(a.b((this.submitButton.hashCode() + H.d((this.widgetStyle.hashCode() + ((this.imageInformation.hashCode() + a.b(this.title.hashCode() * 31, 31, this.subtitle)) * 31)) * 31, 31, this.phoneInputTitle)) * 31, 31, this.bottomText), 31, this.bottomSheetItems)) * 31);
    }

    @k
    public String toString() {
        return "ComfortableDealPromoWidget(title=" + this.title + ", subtitle=" + this.subtitle + ", imageInformation=" + this.imageInformation + ", widgetStyle=" + this.widgetStyle + ", phoneInputTitle=" + this.phoneInputTitle + ", submitButton=" + this.submitButton + ", bottomText=" + this.bottomText + ", bottomSheetItems=" + this.bottomSheetItems + ", showBannerPayload=" + this.showBannerPayload + ", closeBannerPayload=" + this.closeBannerPayload + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.subtitle, flags);
        this.imageInformation.writeToParcel(parcel, flags);
        this.widgetStyle.writeToParcel(parcel, flags);
        parcel.writeString(this.phoneInputTitle);
        this.submitButton.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.bottomText, flags);
        Iterator itJ = C0.j(this.bottomSheetItems, parcel);
        while (itJ.hasNext()) {
            ((BottomSheetPayloadItem) itJ.next()).writeToParcel(parcel, flags);
        }
        this.showBannerPayload.writeToParcel(parcel, flags);
        this.closeBannerPayload.writeToParcel(parcel, flags);
    }
}
