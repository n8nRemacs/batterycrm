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
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Offers.kt */
@d
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b$\u0010#Jz\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0016J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020(HÖ\u0001¢\u0006\u0004\b/\u0010*J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020(HÖ\u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001bR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010#R\u001a\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bE\u0010#¨\u0006F"}, d2 = {"Lcom/avito/android/remote/model/Offers;", "Landroid/os/Parcelable;", "", "title", "offersButtonTitle", "Lcom/avito/android/remote/model/OffersPhoneParameters;", "offersPhoneParameters", "Lcom/avito/android/remote/model/OffersPosition;", "position", "", "Lcom/avito/android/remote/model/OfferItem;", "items", "", "shouldShowDevelopmentsAdvice", "Lcom/avito/android/remote/model/SimpleBanner;", "carouselPhoneBanner", "Lcom/avito/android/remote/model/SimpleAdvertAction;", "carouselPhoneUri", "offersPhoneUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/OffersPhoneParameters;Lcom/avito/android/remote/model/OffersPosition;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/remote/model/SimpleBanner;Lcom/avito/android/remote/model/SimpleAdvertAction;Lcom/avito/android/remote/model/SimpleAdvertAction;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/OffersPhoneParameters;", "component4", "()Lcom/avito/android/remote/model/OffersPosition;", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/Boolean;", "component7", "()Lcom/avito/android/remote/model/SimpleBanner;", "component8", "()Lcom/avito/android/remote/model/SimpleAdvertAction;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/OffersPhoneParameters;Lcom/avito/android/remote/model/OffersPosition;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/remote/model/SimpleBanner;Lcom/avito/android/remote/model/SimpleAdvertAction;Lcom/avito/android/remote/model/SimpleAdvertAction;)Lcom/avito/android/remote/model/Offers;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getOffersButtonTitle", "Lcom/avito/android/remote/model/OffersPhoneParameters;", "getOffersPhoneParameters", "Lcom/avito/android/remote/model/OffersPosition;", "getPosition", "Ljava/util/List;", "getItems", "Ljava/lang/Boolean;", "getShouldShowDevelopmentsAdvice", "Lcom/avito/android/remote/model/SimpleBanner;", "getCarouselPhoneBanner", "Lcom/avito/android/remote/model/SimpleAdvertAction;", "getCarouselPhoneUri", "getOffersPhoneUri", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Offers implements Parcelable {

    @k
    public static final Parcelable.Creator<Offers> CREATOR = new Creator();

    @c("carouselPhoneBanner")
    @l
    private final SimpleBanner carouselPhoneBanner;

    @c("carouselPhoneUri")
    @l
    private final SimpleAdvertAction carouselPhoneUri;

    @c("offerItems")
    @k
    private final List<OfferItem> items;

    @c("offersButtonTitle")
    @l
    private final String offersButtonTitle;

    @c("offersPhoneParameters")
    @l
    private final OffersPhoneParameters offersPhoneParameters;

    @c("offersPhoneUri")
    @k
    private final SimpleAdvertAction offersPhoneUri;

    @c("position")
    @k
    private final OffersPosition position;

    @c("shouldShowDevelopmentsAdvice")
    @l
    private final Boolean shouldShowDevelopmentsAdvice;

    @c("title")
    @k
    private final String title;

    /* compiled from: Offers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Offers> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Offers createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            OffersPhoneParameters offersPhoneParametersCreateFromParcel = parcel.readInt() == 0 ? null : OffersPhoneParameters.CREATOR.createFromParcel(parcel);
            OffersPosition offersPositionValueOf = OffersPosition.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(OfferItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Offers(string, string2, offersPhoneParametersCreateFromParcel, offersPositionValueOf, arrayList, boolValueOf, parcel.readInt() != 0 ? SimpleBanner.CREATOR.createFromParcel(parcel) : null, (SimpleAdvertAction) parcel.readParcelable(Offers.class.getClassLoader()), (SimpleAdvertAction) parcel.readParcelable(Offers.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Offers[] newArray(int i12) {
            return new Offers[i12];
        }
    }

    public Offers(@k String str, @l String str2, @l OffersPhoneParameters offersPhoneParameters, @k OffersPosition offersPosition, @k List<OfferItem> list, @l Boolean bool, @l SimpleBanner simpleBanner, @l SimpleAdvertAction simpleAdvertAction, @k SimpleAdvertAction simpleAdvertAction2) {
        this.title = str;
        this.offersButtonTitle = str2;
        this.offersPhoneParameters = offersPhoneParameters;
        this.position = offersPosition;
        this.items = list;
        this.shouldShowDevelopmentsAdvice = bool;
        this.carouselPhoneBanner = simpleBanner;
        this.carouselPhoneUri = simpleAdvertAction;
        this.offersPhoneUri = simpleAdvertAction2;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getOffersButtonTitle() {
        return this.offersButtonTitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final OffersPhoneParameters getOffersPhoneParameters() {
        return this.offersPhoneParameters;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final OffersPosition getPosition() {
        return this.position;
    }

    @k
    public final List<OfferItem> component5() {
        return this.items;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getShouldShowDevelopmentsAdvice() {
        return this.shouldShowDevelopmentsAdvice;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final SimpleBanner getCarouselPhoneBanner() {
        return this.carouselPhoneBanner;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final SimpleAdvertAction getCarouselPhoneUri() {
        return this.carouselPhoneUri;
    }

    @k
    /* renamed from: component9, reason: from getter */
    public final SimpleAdvertAction getOffersPhoneUri() {
        return this.offersPhoneUri;
    }

    @k
    public final Offers copy(@k String title, @l String offersButtonTitle, @l OffersPhoneParameters offersPhoneParameters, @k OffersPosition position, @k List<OfferItem> items, @l Boolean shouldShowDevelopmentsAdvice, @l SimpleBanner carouselPhoneBanner, @l SimpleAdvertAction carouselPhoneUri, @k SimpleAdvertAction offersPhoneUri) {
        return new Offers(title, offersButtonTitle, offersPhoneParameters, position, items, shouldShowDevelopmentsAdvice, carouselPhoneBanner, carouselPhoneUri, offersPhoneUri);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Offers)) {
            return false;
        }
        Offers offers = (Offers) other;
        return L.f(this.title, offers.title) && L.f(this.offersButtonTitle, offers.offersButtonTitle) && L.f(this.offersPhoneParameters, offers.offersPhoneParameters) && this.position == offers.position && L.f(this.items, offers.items) && L.f(this.shouldShowDevelopmentsAdvice, offers.shouldShowDevelopmentsAdvice) && L.f(this.carouselPhoneBanner, offers.carouselPhoneBanner) && L.f(this.carouselPhoneUri, offers.carouselPhoneUri) && L.f(this.offersPhoneUri, offers.offersPhoneUri);
    }

    @l
    public final SimpleBanner getCarouselPhoneBanner() {
        return this.carouselPhoneBanner;
    }

    @l
    public final SimpleAdvertAction getCarouselPhoneUri() {
        return this.carouselPhoneUri;
    }

    @k
    public final List<OfferItem> getItems() {
        return this.items;
    }

    @l
    public final String getOffersButtonTitle() {
        return this.offersButtonTitle;
    }

    @l
    public final OffersPhoneParameters getOffersPhoneParameters() {
        return this.offersPhoneParameters;
    }

    @k
    public final SimpleAdvertAction getOffersPhoneUri() {
        return this.offersPhoneUri;
    }

    @k
    public final OffersPosition getPosition() {
        return this.position;
    }

    @l
    public final Boolean getShouldShowDevelopmentsAdvice() {
        return this.shouldShowDevelopmentsAdvice;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.offersButtonTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        OffersPhoneParameters offersPhoneParameters = this.offersPhoneParameters;
        int iE2 = H.e((this.position.hashCode() + ((iHashCode2 + (offersPhoneParameters == null ? 0 : offersPhoneParameters.hashCode())) * 31)) * 31, 31, this.items);
        Boolean bool = this.shouldShowDevelopmentsAdvice;
        int iHashCode3 = (iE2 + (bool == null ? 0 : bool.hashCode())) * 31;
        SimpleBanner simpleBanner = this.carouselPhoneBanner;
        int iHashCode4 = (iHashCode3 + (simpleBanner == null ? 0 : simpleBanner.hashCode())) * 31;
        SimpleAdvertAction simpleAdvertAction = this.carouselPhoneUri;
        return this.offersPhoneUri.hashCode() + ((iHashCode4 + (simpleAdvertAction != null ? simpleAdvertAction.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        return "Offers(title=" + this.title + ", offersButtonTitle=" + this.offersButtonTitle + ", offersPhoneParameters=" + this.offersPhoneParameters + ", position=" + this.position + ", items=" + this.items + ", shouldShowDevelopmentsAdvice=" + this.shouldShowDevelopmentsAdvice + ", carouselPhoneBanner=" + this.carouselPhoneBanner + ", carouselPhoneUri=" + this.carouselPhoneUri + ", offersPhoneUri=" + this.offersPhoneUri + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.offersButtonTitle);
        OffersPhoneParameters offersPhoneParameters = this.offersPhoneParameters;
        if (offersPhoneParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offersPhoneParameters.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.position.name());
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((OfferItem) itJ.next()).writeToParcel(parcel, flags);
        }
        Boolean bool = this.shouldShowDevelopmentsAdvice;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        SimpleBanner simpleBanner = this.carouselPhoneBanner;
        if (simpleBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            simpleBanner.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.carouselPhoneUri, flags);
        parcel.writeParcelable(this.offersPhoneUri, flags);
    }

    public /* synthetic */ Offers(String str, String str2, OffersPhoneParameters offersPhoneParameters, OffersPosition offersPosition, List list, Boolean bool, SimpleBanner simpleBanner, SimpleAdvertAction simpleAdvertAction, SimpleAdvertAction simpleAdvertAction2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : offersPhoneParameters, offersPosition, list, (i12 & 32) != 0 ? null : bool, (i12 & 64) != 0 ? null : simpleBanner, (i12 & 128) != 0 ? null : simpleAdvertAction, simpleAdvertAction2);
    }
}
