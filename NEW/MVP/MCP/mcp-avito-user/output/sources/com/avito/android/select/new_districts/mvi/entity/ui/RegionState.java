package com.avito.android.select.new_districts.mvi.entity.ui;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.select.new_location_common.ui.CheckBoxExpandableLineState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RegionState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/ui/RegionState;", "Landroid/os/Parcelable;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RegionState implements Parcelable {

    @k
    public static final Parcelable.Creator<RegionState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<Integer> f265835b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f265836c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CheckBoxExpandableLineState f265837d;

    /* renamed from: e, reason: collision with root package name */
    public final int f265838e;

    /* compiled from: RegionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RegionState> {
        @Override // android.os.Parcelable.Creator
        public final RegionState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iD2 = 0;
            while (iD2 != i12) {
                iD2 = l.d(parcel, arrayList, iD2, 1);
            }
            return new RegionState(arrayList, parcel.readInt() != 0, CheckBoxExpandableLineState.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RegionState[] newArray(int i12) {
            return new RegionState[i12];
        }
    }

    public RegionState(@k List<Integer> list, boolean z12, @k CheckBoxExpandableLineState checkBoxExpandableLineState, int i12) {
        this.f265835b = list;
        this.f265836c = z12;
        this.f265837d = checkBoxExpandableLineState;
        this.f265838e = i12;
    }

    public static RegionState a(RegionState regionState, boolean z12, CheckBoxExpandableLineState checkBoxExpandableLineState, int i12, int i13) {
        List<Integer> list = regionState.f265835b;
        if ((i13 & 2) != 0) {
            z12 = regionState.f265836c;
        }
        if ((i13 & 4) != 0) {
            checkBoxExpandableLineState = regionState.f265837d;
        }
        if ((i13 & 8) != 0) {
            i12 = regionState.f265838e;
        }
        regionState.getClass();
        return new RegionState(list, z12, checkBoxExpandableLineState, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionState)) {
            return false;
        }
        RegionState regionState = (RegionState) obj;
        return L.f(this.f265835b, regionState.f265835b) && this.f265836c == regionState.f265836c && this.f265837d == regionState.f265837d && this.f265838e == regionState.f265838e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265838e) + ((this.f265837d.hashCode() + r.i(this.f265835b.hashCode() * 31, 31, this.f265836c)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RegionState(innerDistrictIndexes=");
        sb2.append(this.f265835b);
        sb2.append(", isOpen=");
        sb2.append(this.f265836c);
        sb2.append(", selected=");
        sb2.append(this.f265837d);
        sb2.append(", selectedDistrictCount=");
        return r.t(sb2, this.f265838e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f265835b, parcel);
        while (itJ.hasNext()) {
            parcel.writeInt(((Number) itJ.next()).intValue());
        }
        parcel.writeInt(this.f265836c ? 1 : 0);
        parcel.writeString(this.f265837d.name());
        parcel.writeInt(this.f265838e);
    }

    public /* synthetic */ RegionState(List list, boolean z12, CheckBoxExpandableLineState checkBoxExpandableLineState, int i12, int i13, C42822w c42822w) {
        this(list, (i13 & 2) != 0 ? false : z12, (i13 & 4) != 0 ? CheckBoxExpandableLineState.f265893b : checkBoxExpandableLineState, (i13 & 8) != 0 ? 0 : i12);
    }
}
