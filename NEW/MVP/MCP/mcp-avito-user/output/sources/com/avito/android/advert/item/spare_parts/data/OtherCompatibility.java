package com.avito.android.advert.item.spare_parts.data;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsV3Dto.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/data/OtherCompatibility;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OtherCompatibility implements Parcelable {

    @k
    public static final Parcelable.Creator<OtherCompatibility> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f80432b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f80433c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f80434d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f80435e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f80436f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f80437g;

    /* compiled from: SparePartsV3Dto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OtherCompatibility> {
        @Override // android.os.Parcelable.Creator
        public final OtherCompatibility createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(SparePartsGroup.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new OtherCompatibility(string, z12, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OtherCompatibility[] newArray(int i12) {
            return new OtherCompatibility[i12];
        }
    }

    public OtherCompatibility(@l String str, boolean z12, @l ArrayList arrayList, @l Integer num, @l String str2, @l String str3) {
        this.f80432b = str;
        this.f80433c = z12;
        this.f80434d = arrayList;
        this.f80435e = num;
        this.f80436f = str2;
        this.f80437g = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtherCompatibility)) {
            return false;
        }
        OtherCompatibility otherCompatibility = (OtherCompatibility) obj;
        return L.f(this.f80432b, otherCompatibility.f80432b) && this.f80433c == otherCompatibility.f80433c && L.f(this.f80434d, otherCompatibility.f80434d) && L.f(this.f80435e, otherCompatibility.f80435e) && L.f(this.f80436f, otherCompatibility.f80436f) && L.f(this.f80437g, otherCompatibility.f80437g);
    }

    public final int hashCode() {
        String str = this.f80432b;
        int i12 = r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f80433c);
        ArrayList arrayList = this.f80434d;
        int iHashCode = (i12 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Integer num = this.f80435e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f80436f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f80437g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OtherCompatibility(title=");
        sb2.append(this.f80432b);
        sb2.append(", showTitleImage=");
        sb2.append(this.f80433c);
        sb2.append(", groupings=");
        sb2.append(this.f80434d);
        sb2.append(", groupingsLimitCount=");
        sb2.append(this.f80435e);
        sb2.append(", groupingsExpandText=");
        sb2.append(this.f80436f);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f80437g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f80432b);
        parcel.writeInt(this.f80433c ? 1 : 0);
        ArrayList arrayList = this.f80434d;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((SparePartsGroup) itY.next()).writeToParcel(parcel, i12);
            }
        }
        Integer num = this.f80435e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f80436f);
        parcel.writeString(this.f80437g);
    }
}
