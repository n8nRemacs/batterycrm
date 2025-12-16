package com.avito.android.guests_selector.io;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GuestsDetailed.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/io/GuestsDetailed;", "Landroid/os/Parcelable;", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GuestsDetailed implements Parcelable {

    @k
    public static final Parcelable.Creator<GuestsDetailed> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f161440b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f161441c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f161442d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<String> f161443e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Boolean f161444f;

    /* compiled from: GuestsDetailed.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GuestsDetailed> {
        @Override // android.os.Parcelable.Creator
        public final GuestsDetailed createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GuestsDetailed(numValueOf, numValueOf2, numValueOf3, arrayListCreateStringArrayList, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GuestsDetailed[] newArray(int i12) {
            return new GuestsDetailed[i12];
        }
    }

    public GuestsDetailed(@l Integer num, @l Integer num2, @l Integer num3, @l List<String> list, @l Boolean bool) {
        this.f161440b = num;
        this.f161441c = num2;
        this.f161442d = num3;
        this.f161443e = list;
        this.f161444f = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestsDetailed)) {
            return false;
        }
        GuestsDetailed guestsDetailed = (GuestsDetailed) obj;
        return L.f(this.f161440b, guestsDetailed.f161440b) && L.f(this.f161441c, guestsDetailed.f161441c) && L.f(this.f161442d, guestsDetailed.f161442d) && L.f(this.f161443e, guestsDetailed.f161443e) && L.f(this.f161444f, guestsDetailed.f161444f);
    }

    public final int hashCode() {
        Integer num = this.f161440b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f161441c;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f161442d;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<String> list = this.f161443e;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f161444f;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsDetailed(version=");
        sb2.append(this.f161440b);
        sb2.append(", totalCount=");
        sb2.append(this.f161441c);
        sb2.append(", adultsCount=");
        sb2.append(this.f161442d);
        sb2.append(", children=");
        sb2.append(this.f161443e);
        sb2.append(", withPets=");
        return C0.g(sb2, this.f161444f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.f161440b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f161441c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f161442d;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        parcel.writeStringList(this.f161443e);
        Boolean bool = this.f161444f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ GuestsDetailed(Integer num, Integer num2, Integer num3, List list, Boolean bool, int i12, C42822w c42822w) {
        this(num, num2, num3, list, (i12 & 16) != 0 ? null : bool);
    }
}
