package com.avito.android.remote.imv_cars_details.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Range;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b \u0010\u0013¨\u0006!"}, d2 = {"Lcom/avito/android/remote/imv_cars_details/models/ImvCarsDetails;", "Landroid/os/Parcelable;", "", "title", "itemPrice", "", "Lcom/avito/android/remote/model/Range;", "ranges", "Lcom/avito/android/remote/imv_cars_details/models/ImvPriceDetails;", "advantages", "flaws", "", "contractVersion", ServiceTransportationWidget.DisclaimerField.TYPE, "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/imv_cars_details/models/ImvPriceDetails;Lcom/avito/android/remote/imv_cars_details/models/ImvPriceDetails;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getItemPrice", "Ljava/util/List;", "g", "()Ljava/util/List;", "Lcom/avito/android/remote/imv_cars_details/models/ImvPriceDetails;", "c", "()Lcom/avito/android/remote/imv_cars_details/models/ImvPriceDetails;", "f", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "e", "getSubtitle", "_avito-discouraged_avito-api_imv-cars-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImvCarsDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<ImvCarsDetails> CREATOR = new a();

    @c("pros")
    @l
    private final ImvPriceDetails advantages;

    @c("contractVersion")
    @l
    private final Integer contractVersion;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @l
    private final String disclaimer;

    @c("cons")
    @l
    private final ImvPriceDetails flaws;

    @c("itemPrice")
    @k
    private final String itemPrice;

    @c("ranges")
    @k
    private final List<Range> ranges;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: ImvCarsDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsDetails> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetails createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ImvCarsDetails.class, parcel, arrayList, iL2, 1);
            }
            return new ImvCarsDetails(string, string2, arrayList, parcel.readInt() == 0 ? null : ImvPriceDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ImvPriceDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetails[] newArray(int i12) {
            return new ImvCarsDetails[i12];
        }
    }

    public ImvCarsDetails(@k String str, @k String str2, @k List<Range> list, @l ImvPriceDetails imvPriceDetails, @l ImvPriceDetails imvPriceDetails2, @l Integer num, @l String str3, @l String str4) {
        this.title = str;
        this.itemPrice = str2;
        this.ranges = list;
        this.advantages = imvPriceDetails;
        this.flaws = imvPriceDetails2;
        this.contractVersion = num;
        this.disclaimer = str3;
        this.subtitle = str4;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ImvPriceDetails getAdvantages() {
        return this.advantages;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Integer getContractVersion() {
        return this.contractVersion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvCarsDetails)) {
            return false;
        }
        ImvCarsDetails imvCarsDetails = (ImvCarsDetails) obj;
        return L.f(this.title, imvCarsDetails.title) && L.f(this.itemPrice, imvCarsDetails.itemPrice) && L.f(this.ranges, imvCarsDetails.ranges) && L.f(this.advantages, imvCarsDetails.advantages) && L.f(this.flaws, imvCarsDetails.flaws) && L.f(this.contractVersion, imvCarsDetails.contractVersion) && L.f(this.disclaimer, imvCarsDetails.disclaimer) && L.f(this.subtitle, imvCarsDetails.subtitle);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final ImvPriceDetails getFlaws() {
        return this.flaws;
    }

    @k
    public final List<Range> g() {
        return this.ranges;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(this.title.hashCode() * 31, 31, this.itemPrice), 31, this.ranges);
        ImvPriceDetails imvPriceDetails = this.advantages;
        int iHashCode = (iE2 + (imvPriceDetails == null ? 0 : imvPriceDetails.hashCode())) * 31;
        ImvPriceDetails imvPriceDetails2 = this.flaws;
        int iHashCode2 = (iHashCode + (imvPriceDetails2 == null ? 0 : imvPriceDetails2.hashCode())) * 31;
        Integer num = this.contractVersion;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.disclaimer;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvCarsDetails(title=");
        sb2.append(this.title);
        sb2.append(", itemPrice=");
        sb2.append(this.itemPrice);
        sb2.append(", ranges=");
        sb2.append(this.ranges);
        sb2.append(", advantages=");
        sb2.append(this.advantages);
        sb2.append(", flaws=");
        sb2.append(this.flaws);
        sb2.append(", contractVersion=");
        sb2.append(this.contractVersion);
        sb2.append(", disclaimer=");
        sb2.append(this.disclaimer);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.subtitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.itemPrice);
        Iterator itJ = C0.j(this.ranges, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        ImvPriceDetails imvPriceDetails = this.advantages;
        if (imvPriceDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imvPriceDetails.writeToParcel(parcel, i12);
        }
        ImvPriceDetails imvPriceDetails2 = this.flaws;
        if (imvPriceDetails2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imvPriceDetails2.writeToParcel(parcel, i12);
        }
        Integer num = this.contractVersion;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.disclaimer);
        parcel.writeString(this.subtitle);
    }

    public /* synthetic */ ImvCarsDetails(String str, String str2, List list, ImvPriceDetails imvPriceDetails, ImvPriceDetails imvPriceDetails2, Integer num, String str3, String str4, int i12, C42822w c42822w) {
        this(str, str2, list, imvPriceDetails, imvPriceDetails2, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : str4);
    }
}
