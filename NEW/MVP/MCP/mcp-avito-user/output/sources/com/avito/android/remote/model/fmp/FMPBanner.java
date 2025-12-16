package com.avito.android.remote.model.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.fmp.util.Background;
import com.avito.android.remote.model.fmp.util.FmpAnalyticsEvent;
import com.avito.android.remote.model.fmp.util.FmpButton;
import com.avito.android.remote.model.fmp.util.Padding;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FMPBanner.kt */
@d
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0094\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020,HÖ\u0001¢\u0006\u0004\b4\u0010.J \u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020,HÖ\u0001¢\u0006\u0004\b9\u0010:R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\bB\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010!R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010#R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bI\u0010#R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bK\u0010&¨\u0006L"}, d2 = {"Lcom/avito/android/remote/model/fmp/FMPBanner;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "legal", "Lcom/avito/android/remote/model/fmp/util/Background;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/remote/model/fmp/util/FmpButton;", "button", "", "Lcom/avito/android/remote/model/fmp/util/FmpAnalyticsEvent;", "onSelect", "onAppear", "Lcom/avito/android/remote/model/fmp/util/Padding;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/fmp/util/Background;Lcom/avito/android/remote/model/fmp/util/FmpButton;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/fmp/util/Padding;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "component6", "()Lcom/avito/android/remote/model/fmp/util/Background;", "component7", "()Lcom/avito/android/remote/model/fmp/util/FmpButton;", "component8", "()Ljava/util/List;", "component9", "component10", "()Lcom/avito/android/remote/model/fmp/util/Padding;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/fmp/util/Background;Lcom/avito/android/remote/model/fmp/util/FmpButton;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/fmp/util/Padding;)Lcom/avito/android/remote/model/fmp/FMPBanner;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "getLegal", "Lcom/avito/android/remote/model/fmp/util/Background;", "getBackground", "Lcom/avito/android/remote/model/fmp/util/FmpButton;", "getButton", "Ljava/util/List;", "getOnSelect", "getOnAppear", "Lcom/avito/android/remote/model/fmp/util/Padding;", "getPadding", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FMPBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<FMPBanner> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @l
    private final Background background;

    @c("button")
    @l
    private final FmpButton button;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("image")
    @l
    private final UniversalImage image;

    @c("legal")
    @l
    private final AttributedText legal;

    @c("onAppear")
    @l
    private final List<FmpAnalyticsEvent> onAppear;

    @c("onSelect")
    @l
    private final List<FmpAnalyticsEvent> onSelect;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)
    @l
    private final Padding padding;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: FMPBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FMPBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FMPBanner createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(FMPBanner.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(FMPBanner.class.getClassLoader());
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(FMPBanner.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(FMPBanner.class.getClassLoader());
            AttributedText attributedText3 = (AttributedText) parcel.readParcelable(FMPBanner.class.getClassLoader());
            Background backgroundCreateFromParcel = parcel.readInt() == 0 ? null : Background.CREATOR.createFromParcel(parcel);
            FmpButton fmpButtonCreateFromParcel = parcel.readInt() == 0 ? null : FmpButton.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(FmpAnalyticsEvent.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(FmpAnalyticsEvent.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new FMPBanner(attributedText, attributedText2, universalImage, deepLink, attributedText3, backgroundCreateFromParcel, fmpButtonCreateFromParcel, arrayList, arrayList2, parcel.readInt() != 0 ? Padding.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FMPBanner[] newArray(int i12) {
            return new FMPBanner[i12];
        }
    }

    public FMPBanner(@l AttributedText attributedText, @l AttributedText attributedText2, @l UniversalImage universalImage, @l DeepLink deepLink, @l AttributedText attributedText3, @l Background background, @l FmpButton fmpButton, @l List<FmpAnalyticsEvent> list, @l List<FmpAnalyticsEvent> list2, @l Padding padding) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.image = universalImage;
        this.deeplink = deepLink;
        this.legal = attributedText3;
        this.background = background;
        this.button = fmpButton;
        this.onSelect = list;
        this.onAppear = list2;
        this.padding = padding;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Padding getPadding() {
        return this.padding;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getLegal() {
        return this.legal;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Background getBackground() {
        return this.background;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final FmpButton getButton() {
        return this.button;
    }

    @l
    public final List<FmpAnalyticsEvent> component8() {
        return this.onSelect;
    }

    @l
    public final List<FmpAnalyticsEvent> component9() {
        return this.onAppear;
    }

    @k
    public final FMPBanner copy(@l AttributedText title, @l AttributedText subtitle, @l UniversalImage image, @l DeepLink deeplink, @l AttributedText legal, @l Background background, @l FmpButton button, @l List<FmpAnalyticsEvent> onSelect, @l List<FmpAnalyticsEvent> onAppear, @l Padding padding) {
        return new FMPBanner(title, subtitle, image, deeplink, legal, background, button, onSelect, onAppear, padding);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FMPBanner)) {
            return false;
        }
        FMPBanner fMPBanner = (FMPBanner) other;
        return L.f(this.title, fMPBanner.title) && L.f(this.subtitle, fMPBanner.subtitle) && L.f(this.image, fMPBanner.image) && L.f(this.deeplink, fMPBanner.deeplink) && L.f(this.legal, fMPBanner.legal) && L.f(this.background, fMPBanner.background) && L.f(this.button, fMPBanner.button) && L.f(this.onSelect, fMPBanner.onSelect) && L.f(this.onAppear, fMPBanner.onAppear) && L.f(this.padding, fMPBanner.padding);
    }

    @l
    public final Background getBackground() {
        return this.background;
    }

    @l
    public final FmpButton getButton() {
        return this.button;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final AttributedText getLegal() {
        return this.legal;
    }

    @l
    public final List<FmpAnalyticsEvent> getOnAppear() {
        return this.onAppear;
    }

    @l
    public final List<FmpAnalyticsEvent> getOnSelect() {
        return this.onSelect;
    }

    @l
    public final Padding getPadding() {
        return this.padding;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        AttributedText attributedText3 = this.legal;
        int iHashCode5 = (iHashCode4 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        Background background = this.background;
        int iHashCode6 = (iHashCode5 + (background == null ? 0 : background.hashCode())) * 31;
        FmpButton fmpButton = this.button;
        int iHashCode7 = (iHashCode6 + (fmpButton == null ? 0 : fmpButton.hashCode())) * 31;
        List<FmpAnalyticsEvent> list = this.onSelect;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<FmpAnalyticsEvent> list2 = this.onAppear;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Padding padding = this.padding;
        return iHashCode9 + (padding != null ? padding.hashCode() : 0);
    }

    @k
    public String toString() {
        return "FMPBanner(title=" + this.title + ", subtitle=" + this.subtitle + ", image=" + this.image + ", deeplink=" + this.deeplink + ", legal=" + this.legal + ", background=" + this.background + ", button=" + this.button + ", onSelect=" + this.onSelect + ", onAppear=" + this.onAppear + ", padding=" + this.padding + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.deeplink, flags);
        parcel.writeParcelable(this.legal, flags);
        Background background = this.background;
        if (background == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            background.writeToParcel(parcel, flags);
        }
        FmpButton fmpButton = this.button;
        if (fmpButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fmpButton.writeToParcel(parcel, flags);
        }
        List<FmpAnalyticsEvent> list = this.onSelect;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((FmpAnalyticsEvent) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<FmpAnalyticsEvent> list2 = this.onAppear;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((FmpAnalyticsEvent) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        Padding padding = this.padding;
        if (padding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            padding.writeToParcel(parcel, flags);
        }
    }
}
