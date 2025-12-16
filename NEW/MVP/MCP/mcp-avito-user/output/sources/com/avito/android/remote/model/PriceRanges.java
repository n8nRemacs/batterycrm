package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CarMarketPrice.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJR\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b.\u0010\u000e¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/PriceRanges;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/PriceDetails;", "details", "", "Lcom/avito/android/remote/model/Range;", "ranges", ServiceTransportationWidget.DisclaimerField.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/PriceDetails;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/PriceDetails;", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/PriceDetails;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/PriceRanges;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/PriceDetails;", "getDetails", "Ljava/util/List;", "getRanges", "getDisclaimer", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PriceRanges implements Parcelable {

    @k
    public static final Parcelable.Creator<PriceRanges> CREATOR = new Creator();

    @c("details")
    @l
    private final PriceDetails details;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @l
    private final String disclaimer;

    @c("ranges")
    @l
    private final List<Range> ranges;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: CarMarketPrice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PriceRanges> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceRanges createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            PriceDetails priceDetailsCreateFromParcel = parcel.readInt() == 0 ? null : PriceDetails.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Range.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new PriceRanges(string, string2, priceDetailsCreateFromParcel, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceRanges[] newArray(int i12) {
            return new PriceRanges[i12];
        }
    }

    public PriceRanges(@l String str, @l String str2, @l PriceDetails priceDetails, @l List<Range> list, @l String str3) {
        this.title = str;
        this.subtitle = str2;
        this.details = priceDetails;
        this.ranges = list;
        this.disclaimer = str3;
    }

    public static /* synthetic */ PriceRanges copy$default(PriceRanges priceRanges, String str, String str2, PriceDetails priceDetails, List list, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = priceRanges.title;
        }
        if ((i12 & 2) != 0) {
            str2 = priceRanges.subtitle;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            priceDetails = priceRanges.details;
        }
        PriceDetails priceDetails2 = priceDetails;
        if ((i12 & 8) != 0) {
            list = priceRanges.ranges;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            str3 = priceRanges.disclaimer;
        }
        return priceRanges.copy(str, str4, priceDetails2, list2, str3);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final PriceDetails getDetails() {
        return this.details;
    }

    @l
    public final List<Range> component4() {
        return this.ranges;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @k
    public final PriceRanges copy(@l String title, @l String subtitle, @l PriceDetails details, @l List<Range> ranges, @l String disclaimer) {
        return new PriceRanges(title, subtitle, details, ranges, disclaimer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceRanges)) {
            return false;
        }
        PriceRanges priceRanges = (PriceRanges) other;
        return L.f(this.title, priceRanges.title) && L.f(this.subtitle, priceRanges.subtitle) && L.f(this.details, priceRanges.details) && L.f(this.ranges, priceRanges.ranges) && L.f(this.disclaimer, priceRanges.disclaimer);
    }

    @l
    public final PriceDetails getDetails() {
        return this.details;
    }

    @l
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @l
    public final List<Range> getRanges() {
        return this.ranges;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PriceDetails priceDetails = this.details;
        int iHashCode3 = (iHashCode2 + (priceDetails == null ? 0 : priceDetails.hashCode())) * 31;
        List<Range> list = this.ranges;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.disclaimer;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PriceRanges(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", details=");
        sb2.append(this.details);
        sb2.append(", ranges=");
        sb2.append(this.ranges);
        sb2.append(", disclaimer=");
        return C22026a.c(sb2, this.disclaimer, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        PriceDetails priceDetails = this.details;
        if (priceDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceDetails.writeToParcel(parcel, flags);
        }
        List<Range> list = this.ranges;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Range) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.disclaimer);
    }

    public /* synthetic */ PriceRanges(String str, String str2, PriceDetails priceDetails, List list, String str3, int i12, C42822w c42822w) {
        this(str, str2, priceDetails, list, (i12 & 16) != 0 ? null : str3);
    }
}
