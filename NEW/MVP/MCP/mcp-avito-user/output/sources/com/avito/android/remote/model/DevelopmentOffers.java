package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
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

/* compiled from: DevelopmentOffers.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010#J\u0084\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b0\u0010+J \u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b5\u00106R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010\u001fR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010!R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010#R\u001a\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bC\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bD\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bE\u0010#¨\u0006F"}, d2 = {"Lcom/avito/android/remote/model/DevelopmentOffers;", "Landroid/os/Parcelable;", "", "title", "offersButtonTitle", "position", "", "Lcom/avito/android/remote/model/DevelopmentOffer;", "offers", "", "shouldShowDevelopmentsAdvice", "Lcom/avito/android/remote/model/SimpleBanner;", "carouselPhoneBanner", "Lcom/avito/android/remote/model/SimpleAdvertAction;", "carouselPhoneUri", "offersPhoneUri", "brandspaceButtonUri", "moznotekaButtonUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/avito/android/remote/model/SimpleBanner;Lcom/avito/android/remote/model/SimpleAdvertAction;Lcom/avito/android/remote/model/SimpleAdvertAction;Lcom/avito/android/remote/model/SimpleAdvertAction;Lcom/avito/android/remote/model/SimpleAdvertAction;)V", "", "index", "get", "(I)Lcom/avito/android/remote/model/DevelopmentOffer;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Z", "component6", "()Lcom/avito/android/remote/model/SimpleBanner;", "component7", "()Lcom/avito/android/remote/model/SimpleAdvertAction;", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/avito/android/remote/model/SimpleBanner;Lcom/avito/android/remote/model/SimpleAdvertAction;Lcom/avito/android/remote/model/SimpleAdvertAction;Lcom/avito/android/remote/model/SimpleAdvertAction;Lcom/avito/android/remote/model/SimpleAdvertAction;)Lcom/avito/android/remote/model/DevelopmentOffers;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getOffersButtonTitle", "getPosition", "Ljava/util/List;", "getOffers", "Z", "getShouldShowDevelopmentsAdvice", "Lcom/avito/android/remote/model/SimpleBanner;", "getCarouselPhoneBanner", "Lcom/avito/android/remote/model/SimpleAdvertAction;", "getCarouselPhoneUri", "getOffersPhoneUri", "getBrandspaceButtonUri", "getMoznotekaButtonUri", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DevelopmentOffers implements Parcelable {

    @k
    public static final Parcelable.Creator<DevelopmentOffers> CREATOR = new Creator();

    @c("brandspaceButtonUri")
    @l
    private final SimpleAdvertAction brandspaceButtonUri;

    @c("carouselPhoneBanner")
    @k
    private final SimpleBanner carouselPhoneBanner;

    @c("carouselPhoneUri")
    @k
    private final SimpleAdvertAction carouselPhoneUri;

    @c("moznotekaButtonUri")
    @l
    private final SimpleAdvertAction moznotekaButtonUri;

    @c("offers")
    @k
    private final List<DevelopmentOffer> offers;

    @c("offersButtonTitle")
    @l
    private final String offersButtonTitle;

    @c("offersPhoneUri")
    @k
    private final SimpleAdvertAction offersPhoneUri;

    @c("position")
    @l
    private final String position;

    @c("shouldShowDevelopmentsAdvice")
    private final boolean shouldShowDevelopmentsAdvice;

    @c("title")
    @l
    private final String title;

    /* compiled from: DevelopmentOffers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DevelopmentOffers> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DevelopmentOffers createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(DevelopmentOffer.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new DevelopmentOffers(string, string2, string3, arrayList, parcel.readInt() != 0, SimpleBanner.CREATOR.createFromParcel(parcel), (SimpleAdvertAction) parcel.readParcelable(DevelopmentOffers.class.getClassLoader()), (SimpleAdvertAction) parcel.readParcelable(DevelopmentOffers.class.getClassLoader()), (SimpleAdvertAction) parcel.readParcelable(DevelopmentOffers.class.getClassLoader()), (SimpleAdvertAction) parcel.readParcelable(DevelopmentOffers.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DevelopmentOffers[] newArray(int i12) {
            return new DevelopmentOffers[i12];
        }
    }

    public DevelopmentOffers(@l String str, @l String str2, @l String str3, @k List<DevelopmentOffer> list, boolean z12, @k SimpleBanner simpleBanner, @k SimpleAdvertAction simpleAdvertAction, @k SimpleAdvertAction simpleAdvertAction2, @l SimpleAdvertAction simpleAdvertAction3, @l SimpleAdvertAction simpleAdvertAction4) {
        this.title = str;
        this.offersButtonTitle = str2;
        this.position = str3;
        this.offers = list;
        this.shouldShowDevelopmentsAdvice = z12;
        this.carouselPhoneBanner = simpleBanner;
        this.carouselPhoneUri = simpleAdvertAction;
        this.offersPhoneUri = simpleAdvertAction2;
        this.brandspaceButtonUri = simpleAdvertAction3;
        this.moznotekaButtonUri = simpleAdvertAction4;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final SimpleAdvertAction getMoznotekaButtonUri() {
        return this.moznotekaButtonUri;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getOffersButtonTitle() {
        return this.offersButtonTitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    @k
    public final List<DevelopmentOffer> component4() {
        return this.offers;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShouldShowDevelopmentsAdvice() {
        return this.shouldShowDevelopmentsAdvice;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final SimpleBanner getCarouselPhoneBanner() {
        return this.carouselPhoneBanner;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final SimpleAdvertAction getCarouselPhoneUri() {
        return this.carouselPhoneUri;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final SimpleAdvertAction getOffersPhoneUri() {
        return this.offersPhoneUri;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final SimpleAdvertAction getBrandspaceButtonUri() {
        return this.brandspaceButtonUri;
    }

    @k
    public final DevelopmentOffers copy(@l String title, @l String offersButtonTitle, @l String position, @k List<DevelopmentOffer> offers, boolean shouldShowDevelopmentsAdvice, @k SimpleBanner carouselPhoneBanner, @k SimpleAdvertAction carouselPhoneUri, @k SimpleAdvertAction offersPhoneUri, @l SimpleAdvertAction brandspaceButtonUri, @l SimpleAdvertAction moznotekaButtonUri) {
        return new DevelopmentOffers(title, offersButtonTitle, position, offers, shouldShowDevelopmentsAdvice, carouselPhoneBanner, carouselPhoneUri, offersPhoneUri, brandspaceButtonUri, moznotekaButtonUri);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevelopmentOffers)) {
            return false;
        }
        DevelopmentOffers developmentOffers = (DevelopmentOffers) other;
        return L.f(this.title, developmentOffers.title) && L.f(this.offersButtonTitle, developmentOffers.offersButtonTitle) && L.f(this.position, developmentOffers.position) && L.f(this.offers, developmentOffers.offers) && this.shouldShowDevelopmentsAdvice == developmentOffers.shouldShowDevelopmentsAdvice && L.f(this.carouselPhoneBanner, developmentOffers.carouselPhoneBanner) && L.f(this.carouselPhoneUri, developmentOffers.carouselPhoneUri) && L.f(this.offersPhoneUri, developmentOffers.offersPhoneUri) && L.f(this.brandspaceButtonUri, developmentOffers.brandspaceButtonUri) && L.f(this.moznotekaButtonUri, developmentOffers.moznotekaButtonUri);
    }

    @k
    public final DevelopmentOffer get(int index) {
        return this.offers.get(index);
    }

    @l
    public final SimpleAdvertAction getBrandspaceButtonUri() {
        return this.brandspaceButtonUri;
    }

    @k
    public final SimpleBanner getCarouselPhoneBanner() {
        return this.carouselPhoneBanner;
    }

    @k
    public final SimpleAdvertAction getCarouselPhoneUri() {
        return this.carouselPhoneUri;
    }

    @l
    public final SimpleAdvertAction getMoznotekaButtonUri() {
        return this.moznotekaButtonUri;
    }

    @k
    public final List<DevelopmentOffer> getOffers() {
        return this.offers;
    }

    @l
    public final String getOffersButtonTitle() {
        return this.offersButtonTitle;
    }

    @k
    public final SimpleAdvertAction getOffersPhoneUri() {
        return this.offersPhoneUri;
    }

    @l
    public final String getPosition() {
        return this.position;
    }

    public final boolean getShouldShowDevelopmentsAdvice() {
        return this.shouldShowDevelopmentsAdvice;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.offersButtonTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.position;
        int iHashCode3 = (this.offersPhoneUri.hashCode() + ((this.carouselPhoneUri.hashCode() + ((this.carouselPhoneBanner.hashCode() + r.i(H.e((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.offers), 31, this.shouldShowDevelopmentsAdvice)) * 31)) * 31)) * 31;
        SimpleAdvertAction simpleAdvertAction = this.brandspaceButtonUri;
        int iHashCode4 = (iHashCode3 + (simpleAdvertAction == null ? 0 : simpleAdvertAction.hashCode())) * 31;
        SimpleAdvertAction simpleAdvertAction2 = this.moznotekaButtonUri;
        return iHashCode4 + (simpleAdvertAction2 != null ? simpleAdvertAction2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "DevelopmentOffers(title=" + this.title + ", offersButtonTitle=" + this.offersButtonTitle + ", position=" + this.position + ", offers=" + this.offers + ", shouldShowDevelopmentsAdvice=" + this.shouldShowDevelopmentsAdvice + ", carouselPhoneBanner=" + this.carouselPhoneBanner + ", carouselPhoneUri=" + this.carouselPhoneUri + ", offersPhoneUri=" + this.offersPhoneUri + ", brandspaceButtonUri=" + this.brandspaceButtonUri + ", moznotekaButtonUri=" + this.moznotekaButtonUri + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.offersButtonTitle);
        parcel.writeString(this.position);
        Iterator itJ = C0.j(this.offers, parcel);
        while (itJ.hasNext()) {
            ((DevelopmentOffer) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.shouldShowDevelopmentsAdvice ? 1 : 0);
        this.carouselPhoneBanner.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.carouselPhoneUri, flags);
        parcel.writeParcelable(this.offersPhoneUri, flags);
        parcel.writeParcelable(this.brandspaceButtonUri, flags);
        parcel.writeParcelable(this.moznotekaButtonUri, flags);
    }

    public /* synthetic */ DevelopmentOffers(String str, String str2, String str3, List list, boolean z12, SimpleBanner simpleBanner, SimpleAdvertAction simpleAdvertAction, SimpleAdvertAction simpleAdvertAction2, SimpleAdvertAction simpleAdvertAction3, SimpleAdvertAction simpleAdvertAction4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, list, z12, simpleBanner, simpleAdvertAction, simpleAdvertAction2, simpleAdvertAction3, simpleAdvertAction4);
    }
}
