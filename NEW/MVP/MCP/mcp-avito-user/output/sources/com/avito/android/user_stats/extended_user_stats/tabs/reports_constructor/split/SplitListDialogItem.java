package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.split;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SplitListDialogItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/split/SplitListDialogItem;", "Landroid/os/Parcelable;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SplitListDialogItem implements Parcelable {

    @k
    public static final Parcelable.Creator<SplitListDialogItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318253b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f318254c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f318255d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f318256e;

    /* compiled from: SplitListDialogItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SplitListDialogItem> {
        @Override // android.os.Parcelable.Creator
        public final SplitListDialogItem createFromParcel(Parcel parcel) {
            return new SplitListDialogItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SplitListDialogItem[] newArray(int i12) {
            return new SplitListDialogItem[i12];
        }
    }

    public SplitListDialogItem(@k String str, @l String str2, @l String str3, boolean z12) {
        this.f318253b = str;
        this.f318254c = str2;
        this.f318255d = str3;
        this.f318256e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitListDialogItem)) {
            return false;
        }
        SplitListDialogItem splitListDialogItem = (SplitListDialogItem) obj;
        return L.f(this.f318253b, splitListDialogItem.f318253b) && L.f(this.f318254c, splitListDialogItem.f318254c) && L.f(this.f318255d, splitListDialogItem.f318255d) && this.f318256e == splitListDialogItem.f318256e;
    }

    public final int hashCode() {
        int iHashCode = this.f318253b.hashCode() * 31;
        String str = this.f318254c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f318255d;
        return Boolean.hashCode(this.f318256e) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SplitListDialogItem(slug=");
        sb2.append(this.f318253b);
        sb2.append(", title=");
        sb2.append(this.f318254c);
        sb2.append(", subtitle=");
        sb2.append(this.f318255d);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f318256e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318253b);
        parcel.writeString(this.f318254c);
        parcel.writeString(this.f318255d);
        parcel.writeInt(this.f318256e ? 1 : 0);
    }

    public /* synthetic */ SplitListDialogItem(String str, String str2, String str3, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? false : z12);
    }
}
