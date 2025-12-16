package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.advert_details.reviews.ItemReviewsHeader;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdditionalSeller.kt */
@d
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\"\u0010#Jz\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020'HÖ\u0001¢\u0006\u0004\b/\u0010)J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020'HÖ\u0001¢\u0006\u0004\b4\u00105R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u001eR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b@\u0010\u0018R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010!R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bD\u0010#¨\u0006E"}, d2 = {"Lcom/avito/android/remote/model/AdditionalSeller;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "Lcom/avito/android/remote/model/AdvertParameters$Parameter;", "params", "Lcom/avito/android/remote/model/AdditionalSellerButtons;", "buttons", "Lcom/avito/android/remote/model/ExpandItemsButton;", "expandParamsButton", "", "featuresTitle", "Lcom/avito/android/remote/model/DevelopmentFeature;", "features", "Lcom/avito/android/remote/model/AdditionalSellerAnalyticsInfo;", "analyticsInfo", "Lcom/avito/android/remote/model/advert_details/reviews/ItemReviewsHeader;", "ratingPreview", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/AdditionalSellerButtons;Lcom/avito/android/remote/model/ExpandItemsButton;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/AdditionalSellerAnalyticsInfo;Lcom/avito/android/remote/model/advert_details/reviews/ItemReviewsHeader;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/AdditionalSellerButtons;", "component4", "()Lcom/avito/android/remote/model/ExpandItemsButton;", "component5", "()Ljava/lang/String;", "component6", "component7", "()Lcom/avito/android/remote/model/AdditionalSellerAnalyticsInfo;", "component8", "()Lcom/avito/android/remote/model/advert_details/reviews/ItemReviewsHeader;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/AdditionalSellerButtons;Lcom/avito/android/remote/model/ExpandItemsButton;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/AdditionalSellerAnalyticsInfo;Lcom/avito/android/remote/model/advert_details/reviews/ItemReviewsHeader;)Lcom/avito/android/remote/model/AdditionalSeller;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Ljava/util/List;", "getParams", "Lcom/avito/android/remote/model/AdditionalSellerButtons;", "getButtons", "Lcom/avito/android/remote/model/ExpandItemsButton;", "getExpandParamsButton", "Ljava/lang/String;", "getFeaturesTitle", "getFeatures", "Lcom/avito/android/remote/model/AdditionalSellerAnalyticsInfo;", "getAnalyticsInfo", "Lcom/avito/android/remote/model/advert_details/reviews/ItemReviewsHeader;", "getRatingPreview", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdditionalSeller implements Parcelable {

    @k
    public static final Parcelable.Creator<AdditionalSeller> CREATOR = new Creator();

    @c("analytics")
    @l
    private final AdditionalSellerAnalyticsInfo analyticsInfo;

    @c("buttons")
    @l
    private final AdditionalSellerButtons buttons;

    @c("expandButton")
    @l
    private final ExpandItemsButton expandParamsButton;

    @c("developmentFeatures")
    @l
    private final List<DevelopmentFeature> features;

    @c("developmentFeaturesTitle")
    @l
    private final String featuresTitle;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @k
    private final List<AdvertParameters.Parameter> params;

    @c("ratingPreview")
    @l
    private final ItemReviewsHeader ratingPreview;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: AdditionalSeller.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdditionalSeller> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdditionalSeller createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AdditionalSeller.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = a.c(AdvertParameters.Parameter.CREATOR, parcel, arrayList2, iC3, 1);
            }
            AdditionalSellerButtons additionalSellerButtonsCreateFromParcel = parcel.readInt() == 0 ? null : AdditionalSellerButtons.CREATOR.createFromParcel(parcel);
            ExpandItemsButton expandItemsButtonCreateFromParcel = parcel.readInt() == 0 ? null : ExpandItemsButton.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(DevelopmentFeature.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList = arrayList3;
            }
            return new AdditionalSeller(attributedText, arrayList2, additionalSellerButtonsCreateFromParcel, expandItemsButtonCreateFromParcel, string, arrayList, parcel.readInt() == 0 ? null : AdditionalSellerAnalyticsInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ItemReviewsHeader.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdditionalSeller[] newArray(int i12) {
            return new AdditionalSeller[i12];
        }
    }

    public AdditionalSeller() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    public final List<AdvertParameters.Parameter> component2() {
        return this.params;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AdditionalSellerButtons getButtons() {
        return this.buttons;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final ExpandItemsButton getExpandParamsButton() {
        return this.expandParamsButton;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getFeaturesTitle() {
        return this.featuresTitle;
    }

    @l
    public final List<DevelopmentFeature> component6() {
        return this.features;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final AdditionalSellerAnalyticsInfo getAnalyticsInfo() {
        return this.analyticsInfo;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final ItemReviewsHeader getRatingPreview() {
        return this.ratingPreview;
    }

    @k
    public final AdditionalSeller copy(@l AttributedText title, @k List<AdvertParameters.Parameter> params, @l AdditionalSellerButtons buttons, @l ExpandItemsButton expandParamsButton, @l String featuresTitle, @l List<DevelopmentFeature> features, @l AdditionalSellerAnalyticsInfo analyticsInfo, @l ItemReviewsHeader ratingPreview) {
        return new AdditionalSeller(title, params, buttons, expandParamsButton, featuresTitle, features, analyticsInfo, ratingPreview);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalSeller)) {
            return false;
        }
        AdditionalSeller additionalSeller = (AdditionalSeller) other;
        return L.f(this.title, additionalSeller.title) && L.f(this.params, additionalSeller.params) && L.f(this.buttons, additionalSeller.buttons) && L.f(this.expandParamsButton, additionalSeller.expandParamsButton) && L.f(this.featuresTitle, additionalSeller.featuresTitle) && L.f(this.features, additionalSeller.features) && L.f(this.analyticsInfo, additionalSeller.analyticsInfo) && L.f(this.ratingPreview, additionalSeller.ratingPreview);
    }

    @l
    public final AdditionalSellerAnalyticsInfo getAnalyticsInfo() {
        return this.analyticsInfo;
    }

    @l
    public final AdditionalSellerButtons getButtons() {
        return this.buttons;
    }

    @l
    public final ExpandItemsButton getExpandParamsButton() {
        return this.expandParamsButton;
    }

    @l
    public final List<DevelopmentFeature> getFeatures() {
        return this.features;
    }

    @l
    public final String getFeaturesTitle() {
        return this.featuresTitle;
    }

    @k
    public final List<AdvertParameters.Parameter> getParams() {
        return this.params;
    }

    @l
    public final ItemReviewsHeader getRatingPreview() {
        return this.ratingPreview;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        AttributedText attributedText = this.title;
        int iE2 = H.e((attributedText == null ? 0 : attributedText.hashCode()) * 31, 31, this.params);
        AdditionalSellerButtons additionalSellerButtons = this.buttons;
        int iHashCode = (iE2 + (additionalSellerButtons == null ? 0 : additionalSellerButtons.hashCode())) * 31;
        ExpandItemsButton expandItemsButton = this.expandParamsButton;
        int iHashCode2 = (iHashCode + (expandItemsButton == null ? 0 : expandItemsButton.hashCode())) * 31;
        String str = this.featuresTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<DevelopmentFeature> list = this.features;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        AdditionalSellerAnalyticsInfo additionalSellerAnalyticsInfo = this.analyticsInfo;
        int iHashCode5 = (iHashCode4 + (additionalSellerAnalyticsInfo == null ? 0 : additionalSellerAnalyticsInfo.hashCode())) * 31;
        ItemReviewsHeader itemReviewsHeader = this.ratingPreview;
        return iHashCode5 + (itemReviewsHeader != null ? itemReviewsHeader.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdditionalSeller(title=" + this.title + ", params=" + this.params + ", buttons=" + this.buttons + ", expandParamsButton=" + this.expandParamsButton + ", featuresTitle=" + this.featuresTitle + ", features=" + this.features + ", analyticsInfo=" + this.analyticsInfo + ", ratingPreview=" + this.ratingPreview + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        Iterator itJ = C0.j(this.params, parcel);
        while (itJ.hasNext()) {
            ((AdvertParameters.Parameter) itJ.next()).writeToParcel(parcel, flags);
        }
        AdditionalSellerButtons additionalSellerButtons = this.buttons;
        if (additionalSellerButtons == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            additionalSellerButtons.writeToParcel(parcel, flags);
        }
        ExpandItemsButton expandItemsButton = this.expandParamsButton;
        if (expandItemsButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            expandItemsButton.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.featuresTitle);
        List<DevelopmentFeature> list = this.features;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((DevelopmentFeature) itA.next()).writeToParcel(parcel, flags);
            }
        }
        AdditionalSellerAnalyticsInfo additionalSellerAnalyticsInfo = this.analyticsInfo;
        if (additionalSellerAnalyticsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            additionalSellerAnalyticsInfo.writeToParcel(parcel, flags);
        }
        ItemReviewsHeader itemReviewsHeader = this.ratingPreview;
        if (itemReviewsHeader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemReviewsHeader.writeToParcel(parcel, flags);
        }
    }

    public AdditionalSeller(@l AttributedText attributedText, @k List<AdvertParameters.Parameter> list, @l AdditionalSellerButtons additionalSellerButtons, @l ExpandItemsButton expandItemsButton, @l String str, @l List<DevelopmentFeature> list2, @l AdditionalSellerAnalyticsInfo additionalSellerAnalyticsInfo, @l ItemReviewsHeader itemReviewsHeader) {
        this.title = attributedText;
        this.params = list;
        this.buttons = additionalSellerButtons;
        this.expandParamsButton = expandItemsButton;
        this.featuresTitle = str;
        this.features = list2;
        this.analyticsInfo = additionalSellerAnalyticsInfo;
        this.ratingPreview = itemReviewsHeader;
    }

    public AdditionalSeller(AttributedText attributedText, List list, AdditionalSellerButtons additionalSellerButtons, ExpandItemsButton expandItemsButton, String str, List list2, AdditionalSellerAnalyticsInfo additionalSellerAnalyticsInfo, ItemReviewsHeader itemReviewsHeader, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : attributedText, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? null : additionalSellerButtons, (i12 & 8) != 0 ? null : expandItemsButton, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : list2, (i12 & 64) != 0 ? null : additionalSellerAnalyticsInfo, (i12 & 128) == 0 ? itemReviewsHeader : null);
    }
}
