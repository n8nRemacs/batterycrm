package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.str_booking.network.models.common.Button;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersListResponse.kt */
@d
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J~\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020&HÖ\u0001¢\u0006\u0004\b-\u0010(J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020&HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b\n\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010\"R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010@R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\f\u0012\u0004\bB\u0010C\u001a\u0004\bA\u0010\u0015¨\u0006E"}, d2 = {"Lcom/avito/android/remote/model/StrSellerOrder;", "Landroid/os/Parcelable;", "", "bookingId", "title", "subtitle", "", "hasAction", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "isActive", "Lcom/avito/android/remote/model/StrSellerOrdersBuyerInfo;", "buyerInfo", "Lcom/avito/android/remote/model/StrSellerOrdersEstateInfo;", "estateInfo", "", "Lcom/avito/android/str_booking/network/models/common/Button;", "_buttons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Lcom/avito/android/remote/model/StrSellerOrdersBuyerInfo;Lcom/avito/android/remote/model/StrSellerOrdersEstateInfo;Ljava/util/List;)V", "component9", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component6", "component7", "()Lcom/avito/android/remote/model/StrSellerOrdersBuyerInfo;", "component8", "()Lcom/avito/android/remote/model/StrSellerOrdersEstateInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Lcom/avito/android/remote/model/StrSellerOrdersBuyerInfo;Lcom/avito/android/remote/model/StrSellerOrdersEstateInfo;Ljava/util/List;)Lcom/avito/android/remote/model/StrSellerOrder;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBookingId", "getTitle", "getSubtitle", "Ljava/lang/Boolean;", "getHasAction", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/StrSellerOrdersBuyerInfo;", "getBuyerInfo", "Lcom/avito/android/remote/model/StrSellerOrdersEstateInfo;", "getEstateInfo", "Ljava/util/List;", "getButtons", "getButtons$annotations", "()V", "buttons", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrSellerOrder implements Parcelable {

    @k
    public static final Parcelable.Creator<StrSellerOrder> CREATOR = new Creator();

    @c("buttons")
    @l
    private final List<Button> _buttons;

    @c("bookingId")
    @k
    private final String bookingId;

    @c("buyerInfo")
    @l
    private final StrSellerOrdersBuyerInfo buyerInfo;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("estateInfo")
    @l
    private final StrSellerOrdersEstateInfo estateInfo;

    @c("hasAction")
    @l
    private final Boolean hasAction;

    @c("active")
    @l
    private final Boolean isActive;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: StrSellerOrdersListResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrSellerOrder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerOrder createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iL2 = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            DeepLink deepLink = (DeepLink) parcel.readParcelable(StrSellerOrder.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            StrSellerOrdersBuyerInfo strSellerOrdersBuyerInfoCreateFromParcel = parcel.readInt() == 0 ? null : StrSellerOrdersBuyerInfo.CREATOR.createFromParcel(parcel);
            StrSellerOrdersEstateInfo strSellerOrdersEstateInfoCreateFromParcel = parcel.readInt() == 0 ? null : StrSellerOrdersEstateInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = a.l(StrSellerOrder.class, parcel, arrayList, iL2, 1);
                }
            }
            return new StrSellerOrder(string, string2, string3, boolValueOf, deepLink, boolValueOf2, strSellerOrdersBuyerInfoCreateFromParcel, strSellerOrdersEstateInfoCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerOrder[] newArray(int i12) {
            return new StrSellerOrder[i12];
        }
    }

    public StrSellerOrder(@k String str, @k String str2, @l String str3, @l Boolean bool, @l DeepLink deepLink, @l Boolean bool2, @l StrSellerOrdersBuyerInfo strSellerOrdersBuyerInfo, @l StrSellerOrdersEstateInfo strSellerOrdersEstateInfo, @l List<Button> list) {
        this.bookingId = str;
        this.title = str2;
        this.subtitle = str3;
        this.hasAction = bool;
        this.deeplink = deepLink;
        this.isActive = bool2;
        this.buyerInfo = strSellerOrdersBuyerInfo;
        this.estateInfo = strSellerOrdersEstateInfo;
        this._buttons = list;
    }

    private final List<Button> component9() {
        return this._buttons;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getBookingId() {
        return this.bookingId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getHasAction() {
        return this.hasAction;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getIsActive() {
        return this.isActive;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final StrSellerOrdersBuyerInfo getBuyerInfo() {
        return this.buyerInfo;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final StrSellerOrdersEstateInfo getEstateInfo() {
        return this.estateInfo;
    }

    @k
    public final StrSellerOrder copy(@k String bookingId, @k String title, @l String subtitle, @l Boolean hasAction, @l DeepLink deeplink, @l Boolean isActive, @l StrSellerOrdersBuyerInfo buyerInfo, @l StrSellerOrdersEstateInfo estateInfo, @l List<Button> _buttons) {
        return new StrSellerOrder(bookingId, title, subtitle, hasAction, deeplink, isActive, buyerInfo, estateInfo, _buttons);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrSellerOrder)) {
            return false;
        }
        StrSellerOrder strSellerOrder = (StrSellerOrder) other;
        return L.f(this.bookingId, strSellerOrder.bookingId) && L.f(this.title, strSellerOrder.title) && L.f(this.subtitle, strSellerOrder.subtitle) && L.f(this.hasAction, strSellerOrder.hasAction) && L.f(this.deeplink, strSellerOrder.deeplink) && L.f(this.isActive, strSellerOrder.isActive) && L.f(this.buyerInfo, strSellerOrder.buyerInfo) && L.f(this.estateInfo, strSellerOrder.estateInfo) && L.f(this._buttons, strSellerOrder._buttons);
    }

    @k
    public final String getBookingId() {
        return this.bookingId;
    }

    @k
    public final List<Button> getButtons() {
        List<Button> list = this._buttons;
        return list == null ? C42784z0.f406748b : list;
    }

    @l
    public final StrSellerOrdersBuyerInfo getBuyerInfo() {
        return this.buyerInfo;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final StrSellerOrdersEstateInfo getEstateInfo() {
        return this.estateInfo;
    }

    @l
    public final Boolean getHasAction() {
        return this.hasAction;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(this.bookingId.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasAction;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Boolean bool2 = this.isActive;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        StrSellerOrdersBuyerInfo strSellerOrdersBuyerInfo = this.buyerInfo;
        int iHashCode5 = (iHashCode4 + (strSellerOrdersBuyerInfo == null ? 0 : strSellerOrdersBuyerInfo.hashCode())) * 31;
        StrSellerOrdersEstateInfo strSellerOrdersEstateInfo = this.estateInfo;
        int iHashCode6 = (iHashCode5 + (strSellerOrdersEstateInfo == null ? 0 : strSellerOrdersEstateInfo.hashCode())) * 31;
        List<Button> list = this._buttons;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    @l
    public final Boolean isActive() {
        return this.isActive;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerOrder(bookingId=");
        sb2.append(this.bookingId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", hasAction=");
        sb2.append(this.hasAction);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", isActive=");
        sb2.append(this.isActive);
        sb2.append(", buyerInfo=");
        sb2.append(this.buyerInfo);
        sb2.append(", estateInfo=");
        sb2.append(this.estateInfo);
        sb2.append(", _buttons=");
        return H.p(sb2, this._buttons, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.bookingId);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Boolean bool = this.hasAction;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.deeplink, flags);
        Boolean bool2 = this.isActive;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        StrSellerOrdersBuyerInfo strSellerOrdersBuyerInfo = this.buyerInfo;
        if (strSellerOrdersBuyerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strSellerOrdersBuyerInfo.writeToParcel(parcel, flags);
        }
        StrSellerOrdersEstateInfo strSellerOrdersEstateInfo = this.estateInfo;
        if (strSellerOrdersEstateInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strSellerOrdersEstateInfo.writeToParcel(parcel, flags);
        }
        List<Button> list = this._buttons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }

    public static /* synthetic */ void getButtons$annotations() {
    }
}
