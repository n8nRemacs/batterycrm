package com.avito.android.service_transportation_info.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.ExpandItemsButton;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TransportInfo.kt */
@d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/avito/android/service_transportation_info/model/TransportInfo;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/AdvertParameters$Parameter;", "params", "Lcom/avito/android/remote/model/ExpandItemsButton;", "expandParamsButton", "Lcom/avito/android/service_transportation_info/model/TransportInfo$TransportInfoDetails;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/ExpandItemsButton;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/remote/model/ExpandItemsButton;", "c", "()Lcom/avito/android/remote/model/ExpandItemsButton;", "getItems", "TransportInfoDetails", "_avito_service-transportation-info_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransportInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<TransportInfo> CREATOR = new a();

    @c("expandButton")
    @l
    private final ExpandItemsButton expandParamsButton;

    @c("items")
    @k
    private final List<TransportInfoDetails> items;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @k
    private final List<AdvertParameters.Parameter> params;

    @c("title")
    @k
    private final String title;

    /* compiled from: TransportInfo.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/android/service_transportation_info/model/TransportInfo$TransportInfoDetails;", "Landroid/os/Parcelable;", "", "title", "subtitle", "price", "priceUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrice", "c", "_avito_service-transportation-info_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TransportInfoDetails implements Parcelable {

        @k
        public static final Parcelable.Creator<TransportInfoDetails> CREATOR = new a();

        @c("price")
        @k
        private final String price;

        @c("priceUnit")
        @k
        private final String priceUnit;

        @c("subTitle")
        @k
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: TransportInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TransportInfoDetails> {
            @Override // android.os.Parcelable.Creator
            public final TransportInfoDetails createFromParcel(Parcel parcel) {
                return new TransportInfoDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TransportInfoDetails[] newArray(int i12) {
                return new TransportInfoDetails[i12];
            }
        }

        public TransportInfoDetails(@k String str, @k String str2, @k String str3, @k String str4) {
            this.title = str;
            this.subtitle = str2;
            this.price = str3;
            this.priceUnit = str4;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getPriceUnit() {
            return this.priceUnit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransportInfoDetails)) {
                return false;
            }
            TransportInfoDetails transportInfoDetails = (TransportInfoDetails) obj;
            return L.f(this.title, transportInfoDetails.title) && L.f(this.subtitle, transportInfoDetails.subtitle) && L.f(this.price, transportInfoDetails.price) && L.f(this.priceUnit, transportInfoDetails.priceUnit);
        }

        @k
        public final String getPrice() {
            return this.price;
        }

        @k
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.priceUnit.hashCode() + H.d(H.d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.price);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TransportInfoDetails(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", price=");
            sb2.append(this.price);
            sb2.append(", priceUnit=");
            return C22026a.c(sb2, this.priceUnit, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.price);
            parcel.writeString(this.priceUnit);
        }
    }

    /* compiled from: TransportInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TransportInfo> {
        @Override // android.os.Parcelable.Creator
        public final TransportInfo createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(TransportInfo.class, parcel, arrayList, iL2, 1);
            }
            ExpandItemsButton expandItemsButton = (ExpandItemsButton) parcel.readParcelable(TransportInfo.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(TransportInfoDetails.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new TransportInfo(string, arrayList, expandItemsButton, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final TransportInfo[] newArray(int i12) {
            return new TransportInfo[i12];
        }
    }

    public TransportInfo(@k String str, @k List<AdvertParameters.Parameter> list, @l ExpandItemsButton expandItemsButton, @k List<TransportInfoDetails> list2) {
        this.title = str;
        this.params = list;
        this.expandParamsButton = expandItemsButton;
        this.items = list2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ExpandItemsButton getExpandParamsButton() {
        return this.expandParamsButton;
    }

    @k
    public final List<AdvertParameters.Parameter> d() {
        return this.params;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransportInfo)) {
            return false;
        }
        TransportInfo transportInfo = (TransportInfo) obj;
        return L.f(this.title, transportInfo.title) && L.f(this.params, transportInfo.params) && L.f(this.expandParamsButton, transportInfo.expandParamsButton) && L.f(this.items, transportInfo.items);
    }

    @k
    public final List<TransportInfoDetails> getItems() {
        return this.items;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iE2 = H.e(this.title.hashCode() * 31, 31, this.params);
        ExpandItemsButton expandItemsButton = this.expandParamsButton;
        return this.items.hashCode() + ((iE2 + (expandItemsButton == null ? 0 : expandItemsButton.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransportInfo(title=");
        sb2.append(this.title);
        sb2.append(", params=");
        sb2.append(this.params);
        sb2.append(", expandParamsButton=");
        sb2.append(this.expandParamsButton);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.params, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.expandParamsButton, i12);
        Iterator itJ2 = C0.j(this.items, parcel);
        while (itJ2.hasNext()) {
            ((TransportInfoDetails) itJ2.next()).writeToParcel(parcel, i12);
        }
    }

    public TransportInfo(String str, List list, ExpandItemsButton expandItemsButton, List list2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? null : expandItemsButton, list2);
    }
}
