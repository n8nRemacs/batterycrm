package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DateSelectView.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/date_select/SegmentChip;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SegmentChip implements com.avito.android.lib.design.chips.h, Parcelable {

    @k
    public static final Parcelable.Creator<SegmentChip> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f317716b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f317717c;

    /* compiled from: DateSelectView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SegmentChip> {
        @Override // android.os.Parcelable.Creator
        public final SegmentChip createFromParcel(Parcel parcel) {
            return new SegmentChip(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SegmentChip[] newArray(int i12) {
            return new SegmentChip[i12];
        }
    }

    public SegmentChip(int i12, @k String str) {
        this.f317716b = i12;
        this.f317717c = str;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final Y41.l<Boolean, G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@k Object obj) {
        SegmentChip segmentChip = obj instanceof SegmentChip ? (SegmentChip) obj : null;
        return segmentChip != null && this.f317716b == segmentChip.f317716b;
    }

    @Override // com.avito.android.lib.design.chips.h
    @k
    /* renamed from: W */
    public final CharSequence getF114848c() {
        return this.f317717c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SegmentChip)) {
            return false;
        }
        SegmentChip segmentChip = (SegmentChip) obj;
        return this.f317716b == segmentChip.f317716b && L.f(this.f317717c, segmentChip.f317717c);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF262143e() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    public final int hashCode() {
        return this.f317717c.hashCode() + (Integer.hashCode(this.f317716b) * 31);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF262142d() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SegmentChip(id=");
        sb2.append(this.f317716b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f317717c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f317716b);
        parcel.writeString(this.f317717c);
    }
}
