package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertsHistory.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJR\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b/\u0010\u000e¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/AdvertHistoryInfo;", "Landroid/os/Parcelable;", "", "title", "price", "hint", "Lcom/avito/android/remote/model/Image;", "image", "", "autoPublish", "sellerName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "()Ljava/lang/Boolean;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertHistoryInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getPrice", "getHint", "Lcom/avito/android/remote/model/Image;", "getImage", "Ljava/lang/Boolean;", "getAutoPublish", "getSellerName", "_avito-discouraged_avito-api_publish-limits-info"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertHistoryInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertHistoryInfo> CREATOR = new Creator();

    @c("autopublish")
    @l
    private final Boolean autoPublish;

    @c("occupation_hint")
    @k
    private final String hint;

    @c("image")
    @l
    private final Image image;

    @c("price")
    @k
    private final String price;

    @c("sellerName")
    @l
    private final String sellerName;

    @c("title")
    @k
    private final String title;

    /* compiled from: AdvertsHistory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertHistoryInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertHistoryInfo createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Image image = (Image) parcel.readParcelable(AdvertHistoryInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvertHistoryInfo(string, string2, string3, image, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertHistoryInfo[] newArray(int i12) {
            return new AdvertHistoryInfo[i12];
        }
    }

    public AdvertHistoryInfo(@k String str, @k String str2, @k String str3, @l Image image, @l Boolean bool, @l String str4) {
        this.title = str;
        this.price = str2;
        this.hint = str3;
        this.image = image;
        this.autoPublish = bool;
        this.sellerName = str4;
    }

    public static /* synthetic */ AdvertHistoryInfo copy$default(AdvertHistoryInfo advertHistoryInfo, String str, String str2, String str3, Image image, Boolean bool, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = advertHistoryInfo.title;
        }
        if ((i12 & 2) != 0) {
            str2 = advertHistoryInfo.price;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = advertHistoryInfo.hint;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            image = advertHistoryInfo.image;
        }
        Image image2 = image;
        if ((i12 & 16) != 0) {
            bool = advertHistoryInfo.autoPublish;
        }
        Boolean bool2 = bool;
        if ((i12 & 32) != 0) {
            str4 = advertHistoryInfo.sellerName;
        }
        return advertHistoryInfo.copy(str, str5, str6, image2, bool2, str4);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getAutoPublish() {
        return this.autoPublish;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getSellerName() {
        return this.sellerName;
    }

    @k
    public final AdvertHistoryInfo copy(@k String title, @k String price, @k String hint, @l Image image, @l Boolean autoPublish, @l String sellerName) {
        return new AdvertHistoryInfo(title, price, hint, image, autoPublish, sellerName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertHistoryInfo)) {
            return false;
        }
        AdvertHistoryInfo advertHistoryInfo = (AdvertHistoryInfo) other;
        return L.f(this.title, advertHistoryInfo.title) && L.f(this.price, advertHistoryInfo.price) && L.f(this.hint, advertHistoryInfo.hint) && L.f(this.image, advertHistoryInfo.image) && L.f(this.autoPublish, advertHistoryInfo.autoPublish) && L.f(this.sellerName, advertHistoryInfo.sellerName);
    }

    @l
    public final Boolean getAutoPublish() {
        return this.autoPublish;
    }

    @k
    public final String getHint() {
        return this.hint;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @k
    public final String getPrice() {
        return this.price;
    }

    @l
    public final String getSellerName() {
        return this.sellerName;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(this.title.hashCode() * 31, 31, this.price), 31, this.hint);
        Image image = this.image;
        int iHashCode = (iD2 + (image == null ? 0 : image.hashCode())) * 31;
        Boolean bool = this.autoPublish;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.sellerName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertHistoryInfo(title=");
        sb2.append(this.title);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", autoPublish=");
        sb2.append(this.autoPublish);
        sb2.append(", sellerName=");
        return C22026a.c(sb2, this.sellerName, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.price);
        parcel.writeString(this.hint);
        parcel.writeParcelable(this.image, flags);
        Boolean bool = this.autoPublish;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.sellerName);
    }

    public /* synthetic */ AdvertHistoryInfo(String str, String str2, String str3, Image image, Boolean bool, String str4, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : image, (i12 & 16) != 0 ? null : bool, (i12 & 32) != 0 ? null : str4);
    }
}
