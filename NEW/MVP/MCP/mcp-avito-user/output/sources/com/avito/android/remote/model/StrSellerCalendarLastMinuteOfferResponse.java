package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarLastMinuteOfferResponse.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b-\u0010\u000f¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/StrSellerCalendarLastMinuteOfferResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "title", "description", "Lcom/avito/android/remote/model/LastMinuteOfferDiscount;", "discount", "buttonText", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/LastMinuteOfferDiscount;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/LastMinuteOfferDiscount;", "component5", "copy", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/LastMinuteOfferDiscount;Ljava/lang/String;)Lcom/avito/android/remote/model/StrSellerCalendarLastMinuteOfferResponse;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/LastMinuteOfferDiscount;", "getDiscount", "getButtonText", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrSellerCalendarLastMinuteOfferResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<StrSellerCalendarLastMinuteOfferResponse> CREATOR = new Creator();

    @c("buttonText")
    @k
    private final String buttonText;

    @c("description")
    @k
    private final String description;

    @c("discount")
    @k
    private final LastMinuteOfferDiscount discount;

    @c("image")
    @k
    private final UniversalImage image;

    @c("title")
    @k
    private final String title;

    /* compiled from: StrSellerCalendarLastMinuteOfferResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrSellerCalendarLastMinuteOfferResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerCalendarLastMinuteOfferResponse createFromParcel(@k Parcel parcel) {
            return new StrSellerCalendarLastMinuteOfferResponse((UniversalImage) parcel.readParcelable(StrSellerCalendarLastMinuteOfferResponse.class.getClassLoader()), parcel.readString(), parcel.readString(), LastMinuteOfferDiscount.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerCalendarLastMinuteOfferResponse[] newArray(int i12) {
            return new StrSellerCalendarLastMinuteOfferResponse[i12];
        }
    }

    public StrSellerCalendarLastMinuteOfferResponse(@k UniversalImage universalImage, @k String str, @k String str2, @k LastMinuteOfferDiscount lastMinuteOfferDiscount, @k String str3) {
        this.image = universalImage;
        this.title = str;
        this.description = str2;
        this.discount = lastMinuteOfferDiscount;
        this.buttonText = str3;
    }

    public static /* synthetic */ StrSellerCalendarLastMinuteOfferResponse copy$default(StrSellerCalendarLastMinuteOfferResponse strSellerCalendarLastMinuteOfferResponse, UniversalImage universalImage, String str, String str2, LastMinuteOfferDiscount lastMinuteOfferDiscount, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalImage = strSellerCalendarLastMinuteOfferResponse.image;
        }
        if ((i12 & 2) != 0) {
            str = strSellerCalendarLastMinuteOfferResponse.title;
        }
        String str4 = str;
        if ((i12 & 4) != 0) {
            str2 = strSellerCalendarLastMinuteOfferResponse.description;
        }
        String str5 = str2;
        if ((i12 & 8) != 0) {
            lastMinuteOfferDiscount = strSellerCalendarLastMinuteOfferResponse.discount;
        }
        LastMinuteOfferDiscount lastMinuteOfferDiscount2 = lastMinuteOfferDiscount;
        if ((i12 & 16) != 0) {
            str3 = strSellerCalendarLastMinuteOfferResponse.buttonText;
        }
        return strSellerCalendarLastMinuteOfferResponse.copy(universalImage, str4, str5, lastMinuteOfferDiscount2, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
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
    public final LastMinuteOfferDiscount getDiscount() {
        return this.discount;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    public final StrSellerCalendarLastMinuteOfferResponse copy(@k UniversalImage image, @k String title, @k String description, @k LastMinuteOfferDiscount discount, @k String buttonText) {
        return new StrSellerCalendarLastMinuteOfferResponse(image, title, description, discount, buttonText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrSellerCalendarLastMinuteOfferResponse)) {
            return false;
        }
        StrSellerCalendarLastMinuteOfferResponse strSellerCalendarLastMinuteOfferResponse = (StrSellerCalendarLastMinuteOfferResponse) other;
        return L.f(this.image, strSellerCalendarLastMinuteOfferResponse.image) && L.f(this.title, strSellerCalendarLastMinuteOfferResponse.title) && L.f(this.description, strSellerCalendarLastMinuteOfferResponse.description) && L.f(this.discount, strSellerCalendarLastMinuteOfferResponse.discount) && L.f(this.buttonText, strSellerCalendarLastMinuteOfferResponse.buttonText);
    }

    @k
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final LastMinuteOfferDiscount getDiscount() {
        return this.discount;
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.buttonText.hashCode() + ((this.discount.hashCode() + H.d(H.d(this.image.hashCode() * 31, 31, this.title), 31, this.description)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerCalendarLastMinuteOfferResponse(image=");
        sb2.append(this.image);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", discount=");
        sb2.append(this.discount);
        sb2.append(", buttonText=");
        return C22026a.c(sb2, this.buttonText, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        this.discount.writeToParcel(parcel, flags);
        parcel.writeString(this.buttonText);
    }
}
