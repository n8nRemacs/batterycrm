package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: DetailsSheetLink.kt */
@K51.d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b,\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b-\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b1\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b8\u00104R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b<\u00104R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010=R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\bD\u00104R\u001a\u0010\u001d\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010H\u001a\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "Landroid/os/Parcelable;", "", "title", "titleStyle", "Lcom/avito/android/remote/model/text/AttributedText;", "descriptionHeader", "Lcom/avito/android/deep_linking/links/ItemList;", "descriptionItems", "description", ConstraintKt.WARNING, "Lcom/avito/android/deep_linking/links/DetailsSheetButton;", "button", "secondaryButton", "", "closeButton", "Lcom/avito/android/remote/model/Image;", "image", "supportTablets", "Lcom/avito/android/remote/model/UniversalImage;", "universalImage", "isRightCloseButton", "", "_imageRelativeWidth", "Lcom/avito/android/deep_linking/links/Theme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/deep_linking/links/Footer;", "footer", "overlayHeader", "shouldShowAfterRotateScreen", "Lcom/avito/android/deep_linking/links/DeepLink;", "onDismissDeeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/ItemList;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DetailsSheetButton;Lcom/avito/android/deep_linking/links/DetailsSheetButton;Ljava/lang/Boolean;Lcom/avito/android/remote/model/Image;Ljava/lang/Boolean;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/Boolean;Ljava/lang/Float;Lcom/avito/android/deep_linking/links/Theme;Lcom/avito/android/deep_linking/links/Footer;Ljava/lang/Boolean;ZLcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "o", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/ItemList;", "f", "()Lcom/avito/android/deep_linking/links/ItemList;", "getDescription", "q", "Lcom/avito/android/deep_linking/links/DetailsSheetButton;", "c", "()Lcom/avito/android/deep_linking/links/DetailsSheetButton;", "k", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "m", "Lcom/avito/android/remote/model/UniversalImage;", "p", "()Lcom/avito/android/remote/model/UniversalImage;", "r", "Ljava/lang/Float;", "Lcom/avito/android/deep_linking/links/Theme;", "n", "()Lcom/avito/android/deep_linking/links/Theme;", "Lcom/avito/android/deep_linking/links/Footer;", "g", "()Lcom/avito/android/deep_linking/links/Footer;", "j", "Z", "l", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "i", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DetailsSheetLinkBody implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<DetailsSheetLinkBody> CREATOR = new a();

    @com.google.gson.annotations.c("imageRelativeWidth")
    @Y61.l
    private final Float _imageRelativeWidth;

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final DetailsSheetButton button;

    @com.google.gson.annotations.c("closeButton")
    @Y61.l
    private final Boolean closeButton;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("descriptionHeader")
    @Y61.l
    private final AttributedText descriptionHeader;

    @com.google.gson.annotations.c("descriptionItems")
    @Y61.l
    private final ItemList descriptionItems;

    @com.google.gson.annotations.c("footer")
    @Y61.l
    private final Footer footer;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final Image image;

    @com.google.gson.annotations.c("isRightCloseButton")
    @Y61.l
    private final Boolean isRightCloseButton;

    @com.google.gson.annotations.c("onDismissDeepLink")
    @Y61.l
    private final DeepLink onDismissDeeplink;

    @com.google.gson.annotations.c("overlayHeader")
    @Y61.l
    private final Boolean overlayHeader;

    @com.google.gson.annotations.c("secondaryButton")
    @Y61.l
    private final DetailsSheetButton secondaryButton;

    @com.google.gson.annotations.c("shouldShowAfterRotateScreen")
    private final boolean shouldShowAfterRotateScreen;

    @com.google.gson.annotations.c("supportTablets")
    @Y61.l
    private final Boolean supportTablets;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @Y61.l
    private final Theme theme;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    @com.google.gson.annotations.c("titleStyle")
    @Y61.l
    private final String titleStyle;

    @com.google.gson.annotations.c("dynamicImage")
    @Y61.l
    private final UniversalImage universalImage;

    @com.google.gson.annotations.c(ConstraintKt.WARNING)
    @Y61.l
    private final String warning;

    /* compiled from: DetailsSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DetailsSheetLinkBody> {
        @Override // android.os.Parcelable.Creator
        public final DetailsSheetLinkBody createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            String string = parcel.readString();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DetailsSheetLinkBody.class.getClassLoader());
            ItemList itemListCreateFromParcel = parcel.readInt() == 0 ? null : ItemList.CREATOR.createFromParcel(parcel);
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(DetailsSheetLinkBody.class.getClassLoader());
            String string3 = parcel.readString();
            DetailsSheetButton detailsSheetButtonCreateFromParcel = parcel.readInt() == 0 ? null : DetailsSheetButton.CREATOR.createFromParcel(parcel);
            DetailsSheetButton detailsSheetButtonCreateFromParcel2 = parcel.readInt() == 0 ? null : DetailsSheetButton.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Image image = (Image) parcel.readParcelable(DetailsSheetLinkBody.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(DetailsSheetLinkBody.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Theme themeValueOf = parcel.readInt() == 0 ? null : Theme.valueOf(parcel.readString());
            Footer footerCreateFromParcel = parcel.readInt() == 0 ? null : Footer.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DetailsSheetLinkBody(string, string2, attributedText, itemListCreateFromParcel, attributedText2, string3, detailsSheetButtonCreateFromParcel, detailsSheetButtonCreateFromParcel2, boolValueOf, image, boolValueOf2, universalImage, boolValueOf3, fValueOf, themeValueOf, footerCreateFromParcel, boolValueOf4, parcel.readInt() != 0, (DeepLink) parcel.readParcelable(DetailsSheetLinkBody.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DetailsSheetLinkBody[] newArray(int i12) {
            return new DetailsSheetLinkBody[i12];
        }
    }

    public DetailsSheetLinkBody() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 524287, null);
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final DetailsSheetButton getButton() {
        return this.button;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Boolean getCloseButton() {
        return this.closeButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final AttributedText getDescriptionHeader() {
        return this.descriptionHeader;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsSheetLinkBody)) {
            return false;
        }
        DetailsSheetLinkBody detailsSheetLinkBody = (DetailsSheetLinkBody) obj;
        return kotlin.jvm.internal.L.f(this.title, detailsSheetLinkBody.title) && kotlin.jvm.internal.L.f(this.titleStyle, detailsSheetLinkBody.titleStyle) && kotlin.jvm.internal.L.f(this.descriptionHeader, detailsSheetLinkBody.descriptionHeader) && kotlin.jvm.internal.L.f(this.descriptionItems, detailsSheetLinkBody.descriptionItems) && kotlin.jvm.internal.L.f(this.description, detailsSheetLinkBody.description) && kotlin.jvm.internal.L.f(this.warning, detailsSheetLinkBody.warning) && kotlin.jvm.internal.L.f(this.button, detailsSheetLinkBody.button) && kotlin.jvm.internal.L.f(this.secondaryButton, detailsSheetLinkBody.secondaryButton) && kotlin.jvm.internal.L.f(this.closeButton, detailsSheetLinkBody.closeButton) && kotlin.jvm.internal.L.f(this.image, detailsSheetLinkBody.image) && kotlin.jvm.internal.L.f(this.supportTablets, detailsSheetLinkBody.supportTablets) && kotlin.jvm.internal.L.f(this.universalImage, detailsSheetLinkBody.universalImage) && kotlin.jvm.internal.L.f(this.isRightCloseButton, detailsSheetLinkBody.isRightCloseButton) && kotlin.jvm.internal.L.f(this._imageRelativeWidth, detailsSheetLinkBody._imageRelativeWidth) && this.theme == detailsSheetLinkBody.theme && kotlin.jvm.internal.L.f(this.footer, detailsSheetLinkBody.footer) && kotlin.jvm.internal.L.f(this.overlayHeader, detailsSheetLinkBody.overlayHeader) && this.shouldShowAfterRotateScreen == detailsSheetLinkBody.shouldShowAfterRotateScreen && kotlin.jvm.internal.L.f(this.onDismissDeeplink, detailsSheetLinkBody.onDismissDeeplink);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final ItemList getDescriptionItems() {
        return this.descriptionItems;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final Footer getFooter() {
        return this.footer;
    }

    @Y61.l
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.l
    public final Image getImage() {
        return this.image;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    public final float h() {
        Float f12 = this._imageRelativeWidth;
        if (f12 != null) {
            return kotlin.ranges.s.c(kotlin.ranges.s.a(f12.floatValue(), 0.0f), 1.0f);
        }
        return 1.0f;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleStyle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.descriptionHeader;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ItemList itemList = this.descriptionItems;
        int iHashCode4 = (iHashCode3 + (itemList == null ? 0 : itemList.hashCode())) * 31;
        AttributedText attributedText2 = this.description;
        int iHashCode5 = (iHashCode4 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str3 = this.warning;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DetailsSheetButton detailsSheetButton = this.button;
        int iHashCode7 = (iHashCode6 + (detailsSheetButton == null ? 0 : detailsSheetButton.hashCode())) * 31;
        DetailsSheetButton detailsSheetButton2 = this.secondaryButton;
        int iHashCode8 = (iHashCode7 + (detailsSheetButton2 == null ? 0 : detailsSheetButton2.hashCode())) * 31;
        Boolean bool = this.closeButton;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Image image = this.image;
        int iHashCode10 = (iHashCode9 + (image == null ? 0 : image.hashCode())) * 31;
        Boolean bool2 = this.supportTablets;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        UniversalImage universalImage = this.universalImage;
        int iHashCode12 = (iHashCode11 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        Boolean bool3 = this.isRightCloseButton;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Float f12 = this._imageRelativeWidth;
        int iHashCode14 = (iHashCode13 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Theme theme = this.theme;
        int iHashCode15 = (iHashCode14 + (theme == null ? 0 : theme.hashCode())) * 31;
        Footer footer = this.footer;
        int iHashCode16 = (iHashCode15 + (footer == null ? 0 : footer.hashCode())) * 31;
        Boolean bool4 = this.overlayHeader;
        int i12 = androidx.appcompat.app.r.i((iHashCode16 + (bool4 == null ? 0 : bool4.hashCode())) * 31, 31, this.shouldShowAfterRotateScreen);
        DeepLink deepLink = this.onDismissDeeplink;
        return i12 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final DeepLink getOnDismissDeeplink() {
        return this.onDismissDeeplink;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final Boolean getOverlayHeader() {
        return this.overlayHeader;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final DetailsSheetButton getSecondaryButton() {
        return this.secondaryButton;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getShouldShowAfterRotateScreen() {
        return this.shouldShowAfterRotateScreen;
    }

    @Y61.l
    /* renamed from: m, reason: from getter */
    public final Boolean getSupportTablets() {
        return this.supportTablets;
    }

    @Y61.l
    /* renamed from: n, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    @Y61.l
    /* renamed from: o, reason: from getter */
    public final String getTitleStyle() {
        return this.titleStyle;
    }

    @Y61.l
    /* renamed from: p, reason: from getter */
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    @Y61.l
    /* renamed from: q, reason: from getter */
    public final String getWarning() {
        return this.warning;
    }

    @Y61.l
    /* renamed from: r, reason: from getter */
    public final Boolean getIsRightCloseButton() {
        return this.isRightCloseButton;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DetailsSheetLinkBody(title=");
        sb2.append(this.title);
        sb2.append(", titleStyle=");
        sb2.append(this.titleStyle);
        sb2.append(", descriptionHeader=");
        sb2.append(this.descriptionHeader);
        sb2.append(", descriptionItems=");
        sb2.append(this.descriptionItems);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", warning=");
        sb2.append(this.warning);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", secondaryButton=");
        sb2.append(this.secondaryButton);
        sb2.append(", closeButton=");
        sb2.append(this.closeButton);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", supportTablets=");
        sb2.append(this.supportTablets);
        sb2.append(", universalImage=");
        sb2.append(this.universalImage);
        sb2.append(", isRightCloseButton=");
        sb2.append(this.isRightCloseButton);
        sb2.append(", _imageRelativeWidth=");
        sb2.append(this._imageRelativeWidth);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", footer=");
        sb2.append(this.footer);
        sb2.append(", overlayHeader=");
        sb2.append(this.overlayHeader);
        sb2.append(", shouldShowAfterRotateScreen=");
        sb2.append(this.shouldShowAfterRotateScreen);
        sb2.append(", onDismissDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.onDismissDeeplink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.titleStyle);
        parcel.writeParcelable(this.descriptionHeader, i12);
        ItemList itemList = this.descriptionItems;
        if (itemList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemList.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.description, i12);
        parcel.writeString(this.warning);
        DetailsSheetButton detailsSheetButton = this.button;
        if (detailsSheetButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            detailsSheetButton.writeToParcel(parcel, i12);
        }
        DetailsSheetButton detailsSheetButton2 = this.secondaryButton;
        if (detailsSheetButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            detailsSheetButton2.writeToParcel(parcel, i12);
        }
        Boolean bool = this.closeButton;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.image, i12);
        Boolean bool2 = this.supportTablets;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.universalImage, i12);
        Boolean bool3 = this.isRightCloseButton;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Float f12 = this._imageRelativeWidth;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        Theme theme = this.theme;
        if (theme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(theme.name());
        }
        Footer footer = this.footer;
        if (footer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            footer.writeToParcel(parcel, i12);
        }
        Boolean bool4 = this.overlayHeader;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        parcel.writeInt(this.shouldShowAfterRotateScreen ? 1 : 0);
        parcel.writeParcelable(this.onDismissDeeplink, i12);
    }

    public DetailsSheetLinkBody(@Y61.l String str, @Y61.l String str2, @Y61.l AttributedText attributedText, @Y61.l ItemList itemList, @Y61.l AttributedText attributedText2, @Y61.l String str3, @Y61.l DetailsSheetButton detailsSheetButton, @Y61.l DetailsSheetButton detailsSheetButton2, @Y61.l Boolean bool, @Y61.l Image image, @Y61.l Boolean bool2, @Y61.l UniversalImage universalImage, @Y61.l Boolean bool3, @Y61.l Float f12, @Y61.l Theme theme, @Y61.l Footer footer, @Y61.l Boolean bool4, boolean z12, @Y61.l DeepLink deepLink) {
        this.title = str;
        this.titleStyle = str2;
        this.descriptionHeader = attributedText;
        this.descriptionItems = itemList;
        this.description = attributedText2;
        this.warning = str3;
        this.button = detailsSheetButton;
        this.secondaryButton = detailsSheetButton2;
        this.closeButton = bool;
        this.image = image;
        this.supportTablets = bool2;
        this.universalImage = universalImage;
        this.isRightCloseButton = bool3;
        this._imageRelativeWidth = f12;
        this.theme = theme;
        this.footer = footer;
        this.overlayHeader = bool4;
        this.shouldShowAfterRotateScreen = z12;
        this.onDismissDeeplink = deepLink;
    }

    public /* synthetic */ DetailsSheetLinkBody(String str, String str2, AttributedText attributedText, ItemList itemList, AttributedText attributedText2, String str3, DetailsSheetButton detailsSheetButton, DetailsSheetButton detailsSheetButton2, Boolean bool, Image image, Boolean bool2, UniversalImage universalImage, Boolean bool3, Float f12, Theme theme, Footer footer, Boolean bool4, boolean z12, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : attributedText, (i12 & 8) != 0 ? null : itemList, (i12 & 16) != 0 ? null : attributedText2, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : detailsSheetButton, (i12 & 128) != 0 ? null : detailsSheetButton2, (i12 & 256) != 0 ? Boolean.FALSE : bool, (i12 & 512) != 0 ? null : image, (i12 & 1024) != 0 ? Boolean.FALSE : bool2, (i12 & 2048) != 0 ? null : universalImage, (i12 & 4096) != 0 ? Boolean.FALSE : bool3, (i12 & 8192) != 0 ? Float.valueOf(1.0f) : f12, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : theme, (i12 & 32768) != 0 ? null : footer, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? Boolean.FALSE : bool4, (i12 & 131072) != 0 ? false : z12, (i12 & 262144) != 0 ? null : deepLink);
    }
}
