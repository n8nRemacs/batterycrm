package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersBuyerResponse.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JR\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0013R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0015¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValue;", "Landroid/os/Parcelable;", "", "orderTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "orderDeepLink", "itemTitle", "Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValueStatus;", "status", "", "images", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValueStatus;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "component4", "()Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValueStatus;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValueStatus;Ljava/util/List;)Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOrderTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOrderDeepLink", "getItemTitle", "Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValueStatus;", "getStatus", "Ljava/util/List;", "getImages", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrOrdersBuyerResponseSectionItemValue implements Parcelable {

    @k
    public static final Parcelable.Creator<StrOrdersBuyerResponseSectionItemValue> CREATOR = new Creator();

    @c("images")
    @l
    private final List<String> images;

    @c("itemTitle")
    @l
    private final String itemTitle;

    @c("orderDeepLink")
    @l
    private final DeepLink orderDeepLink;

    @c("orderTitle")
    @l
    private final String orderTitle;

    @c("status")
    @l
    private final StrOrdersBuyerResponseSectionItemValueStatus status;

    /* compiled from: StrOrdersBuyerResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrOrdersBuyerResponseSectionItemValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersBuyerResponseSectionItemValue createFromParcel(@k Parcel parcel) {
            return new StrOrdersBuyerResponseSectionItemValue(parcel.readString(), (DeepLink) parcel.readParcelable(StrOrdersBuyerResponseSectionItemValue.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : StrOrdersBuyerResponseSectionItemValueStatus.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersBuyerResponseSectionItemValue[] newArray(int i12) {
            return new StrOrdersBuyerResponseSectionItemValue[i12];
        }
    }

    public StrOrdersBuyerResponseSectionItemValue(@l String str, @l DeepLink deepLink, @l String str2, @l StrOrdersBuyerResponseSectionItemValueStatus strOrdersBuyerResponseSectionItemValueStatus, @l List<String> list) {
        this.orderTitle = str;
        this.orderDeepLink = deepLink;
        this.itemTitle = str2;
        this.status = strOrdersBuyerResponseSectionItemValueStatus;
        this.images = list;
    }

    public static /* synthetic */ StrOrdersBuyerResponseSectionItemValue copy$default(StrOrdersBuyerResponseSectionItemValue strOrdersBuyerResponseSectionItemValue, String str, DeepLink deepLink, String str2, StrOrdersBuyerResponseSectionItemValueStatus strOrdersBuyerResponseSectionItemValueStatus, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strOrdersBuyerResponseSectionItemValue.orderTitle;
        }
        if ((i12 & 2) != 0) {
            deepLink = strOrdersBuyerResponseSectionItemValue.orderDeepLink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 4) != 0) {
            str2 = strOrdersBuyerResponseSectionItemValue.itemTitle;
        }
        String str3 = str2;
        if ((i12 & 8) != 0) {
            strOrdersBuyerResponseSectionItemValueStatus = strOrdersBuyerResponseSectionItemValue.status;
        }
        StrOrdersBuyerResponseSectionItemValueStatus strOrdersBuyerResponseSectionItemValueStatus2 = strOrdersBuyerResponseSectionItemValueStatus;
        if ((i12 & 16) != 0) {
            list = strOrdersBuyerResponseSectionItemValue.images;
        }
        return strOrdersBuyerResponseSectionItemValue.copy(str, deepLink2, str3, strOrdersBuyerResponseSectionItemValueStatus2, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getOrderTitle() {
        return this.orderTitle;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getOrderDeepLink() {
        return this.orderDeepLink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final StrOrdersBuyerResponseSectionItemValueStatus getStatus() {
        return this.status;
    }

    @l
    public final List<String> component5() {
        return this.images;
    }

    @k
    public final StrOrdersBuyerResponseSectionItemValue copy(@l String orderTitle, @l DeepLink orderDeepLink, @l String itemTitle, @l StrOrdersBuyerResponseSectionItemValueStatus status, @l List<String> images) {
        return new StrOrdersBuyerResponseSectionItemValue(orderTitle, orderDeepLink, itemTitle, status, images);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrOrdersBuyerResponseSectionItemValue)) {
            return false;
        }
        StrOrdersBuyerResponseSectionItemValue strOrdersBuyerResponseSectionItemValue = (StrOrdersBuyerResponseSectionItemValue) other;
        return L.f(this.orderTitle, strOrdersBuyerResponseSectionItemValue.orderTitle) && L.f(this.orderDeepLink, strOrdersBuyerResponseSectionItemValue.orderDeepLink) && L.f(this.itemTitle, strOrdersBuyerResponseSectionItemValue.itemTitle) && L.f(this.status, strOrdersBuyerResponseSectionItemValue.status) && L.f(this.images, strOrdersBuyerResponseSectionItemValue.images);
    }

    @l
    public final List<String> getImages() {
        return this.images;
    }

    @l
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @l
    public final DeepLink getOrderDeepLink() {
        return this.orderDeepLink;
    }

    @l
    public final String getOrderTitle() {
        return this.orderTitle;
    }

    @l
    public final StrOrdersBuyerResponseSectionItemValueStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.orderTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeepLink deepLink = this.orderDeepLink;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str2 = this.itemTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StrOrdersBuyerResponseSectionItemValueStatus strOrdersBuyerResponseSectionItemValueStatus = this.status;
        int iHashCode4 = (iHashCode3 + (strOrdersBuyerResponseSectionItemValueStatus == null ? 0 : strOrdersBuyerResponseSectionItemValueStatus.hashCode())) * 31;
        List<String> list = this.images;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersBuyerResponseSectionItemValue(orderTitle=");
        sb2.append(this.orderTitle);
        sb2.append(", orderDeepLink=");
        sb2.append(this.orderDeepLink);
        sb2.append(", itemTitle=");
        sb2.append(this.itemTitle);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", images=");
        return H.p(sb2, this.images, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.orderTitle);
        parcel.writeParcelable(this.orderDeepLink, flags);
        parcel.writeString(this.itemTitle);
        StrOrdersBuyerResponseSectionItemValueStatus strOrdersBuyerResponseSectionItemValueStatus = this.status;
        if (strOrdersBuyerResponseSectionItemValueStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strOrdersBuyerResponseSectionItemValueStatus.writeToParcel(parcel, flags);
        }
        parcel.writeStringList(this.images);
    }
}
