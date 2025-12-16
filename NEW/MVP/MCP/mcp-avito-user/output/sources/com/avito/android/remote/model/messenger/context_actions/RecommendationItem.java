package com.avito.android.remote.model.messenger.context_actions;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RecommendationItem.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JR\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0015¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/RecommendationItem;", "Landroid/os/Parcelable;", "", "id", "title", "price", "Lcom/avito/android/remote/model/Image;", "image", "location", "", RecommendationItem.WITH_SELLER_FAST_REPLY_BADGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "component6", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/messenger/context_actions/RecommendationItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getPrice", "Lcom/avito/android/remote/model/Image;", "getImage", "getLocation", "Ljava/lang/Boolean;", "getWithSellerFastReplyBadge", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RecommendationItem implements Parcelable {

    /* renamed from: ID, reason: collision with root package name */
    @k
    public static final String f253875ID = "id";

    @k
    public static final String IMAGE = "imageBySizes";

    @k
    public static final String LOCATION = "locationWithMetro";

    @k
    public static final String PRICE = "priceString";

    @k
    public static final String TITLE = "title";

    @k
    public static final String WITH_SELLER_FAST_REPLY_BADGE = "withSellerFastReplyBadge";

    @c("id")
    @k
    private final String id;

    @c("imageBySizes")
    @l
    private final Image image;

    @c("locationWithMetro")
    @l
    private final String location;

    @c("priceString")
    @k
    private final String price;

    @c("title")
    @k
    private final String title;

    @c(WITH_SELLER_FAST_REPLY_BADGE)
    @l
    private final Boolean withSellerFastReplyBadge;

    @k
    public static final Parcelable.Creator<RecommendationItem> CREATOR = new Creator();

    /* compiled from: RecommendationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecommendationItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecommendationItem createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Image image = (Image) parcel.readParcelable(RecommendationItem.class.getClassLoader());
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RecommendationItem(string, string2, string3, image, string4, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecommendationItem[] newArray(int i12) {
            return new RecommendationItem[i12];
        }
    }

    public RecommendationItem(@k String str, @k String str2, @k String str3, @l Image image, @l String str4, @l Boolean bool) {
        this.id = str;
        this.title = str2;
        this.price = str3;
        this.image = image;
        this.location = str4;
        this.withSellerFastReplyBadge = bool;
    }

    public static /* synthetic */ RecommendationItem copy$default(RecommendationItem recommendationItem, String str, String str2, String str3, Image image, String str4, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = recommendationItem.id;
        }
        if ((i12 & 2) != 0) {
            str2 = recommendationItem.title;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = recommendationItem.price;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            image = recommendationItem.image;
        }
        Image image2 = image;
        if ((i12 & 16) != 0) {
            str4 = recommendationItem.location;
        }
        String str7 = str4;
        if ((i12 & 32) != 0) {
            bool = recommendationItem.withSellerFastReplyBadge;
        }
        return recommendationItem.copy(str, str5, str6, image2, str7, bool);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getWithSellerFastReplyBadge() {
        return this.withSellerFastReplyBadge;
    }

    @k
    public final RecommendationItem copy(@k String id2, @k String title, @k String price, @l Image image, @l String location, @l Boolean withSellerFastReplyBadge) {
        return new RecommendationItem(id2, title, price, image, location, withSellerFastReplyBadge);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationItem)) {
            return false;
        }
        RecommendationItem recommendationItem = (RecommendationItem) other;
        return L.f(this.id, recommendationItem.id) && L.f(this.title, recommendationItem.title) && L.f(this.price, recommendationItem.price) && L.f(this.image, recommendationItem.image) && L.f(this.location, recommendationItem.location) && L.f(this.withSellerFastReplyBadge, recommendationItem.withSellerFastReplyBadge);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final String getLocation() {
        return this.location;
    }

    @k
    public final String getPrice() {
        return this.price;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Boolean getWithSellerFastReplyBadge() {
        return this.withSellerFastReplyBadge;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.price);
        Image image = this.image;
        int iHashCode = (iD2 + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.location;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.withSellerFastReplyBadge;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RecommendationItem(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", location=");
        sb2.append(this.location);
        sb2.append(", withSellerFastReplyBadge=");
        return C0.g(sb2, this.withSellerFastReplyBadge, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.price);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.location);
        Boolean bool = this.withSellerFastReplyBadge;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ RecommendationItem(String str, String str2, String str3, Image image, String str4, Boolean bool, int i12, C42822w c42822w) {
        this(str, str2, str3, image, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : bool);
    }
}
