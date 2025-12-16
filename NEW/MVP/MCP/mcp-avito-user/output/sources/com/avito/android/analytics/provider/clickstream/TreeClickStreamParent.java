package com.avito.android.analytics.provider.clickstream;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: TreeClickStreamEvent.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/provider/clickstream/TreeClickStreamParent;", "Landroid/os/Parcelable;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TreeClickStreamParent implements Parcelable {

    @k
    public static final Parcelable.Creator<TreeClickStreamParent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f90258b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f90259c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f90260d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f90261e;

    /* compiled from: TreeClickStreamEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TreeClickStreamParent> {
        @Override // android.os.Parcelable.Creator
        public final TreeClickStreamParent createFromParcel(Parcel parcel) {
            return new TreeClickStreamParent(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final TreeClickStreamParent[] newArray(int i12) {
            return new TreeClickStreamParent[i12];
        }
    }

    public TreeClickStreamParent(long j12, @k String str, @l Integer num, @l Integer num2) {
        this.f90258b = j12;
        this.f90259c = str;
        this.f90260d = num;
        this.f90261e = num2;
    }

    @k
    public final LinkedHashMap c() {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("parentstate_id", Long.valueOf(this.f90258b)), new Q("from_page", this.f90259c));
        Integer num = this.f90260d;
        if (num != null) {
            linkedHashMapJ.put("from_block", num);
        }
        Integer num2 = this.f90261e;
        if (num2 != null) {
            linkedHashMapJ.put("from_position", num2);
        }
        return linkedHashMapJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f90258b);
        parcel.writeString(this.f90259c);
        Integer num = this.f90260d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f90261e;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }
}
