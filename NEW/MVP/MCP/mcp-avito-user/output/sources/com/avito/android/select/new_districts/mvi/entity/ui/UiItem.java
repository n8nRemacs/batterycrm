package com.avito.android.select.new_districts.mvi.entity.ui;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.District;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UiItem.kt */
@H0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/ui/UiItem;", "Landroid/os/Parcelable;", "DistrictItem", "RegionItem", "Lcom/avito/android/select/new_districts/mvi/entity/ui/UiItem$DistrictItem;", "Lcom/avito/android/select/new_districts/mvi/entity/ui/UiItem$RegionItem;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class UiItem implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final int f265839b;

    /* compiled from: UiItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/ui/UiItem$DistrictItem;", "Lcom/avito/android/select/new_districts/mvi/entity/ui/UiItem;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DistrictItem extends UiItem {

        @k
        public static final Parcelable.Creator<DistrictItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f265840c;

        /* renamed from: d, reason: collision with root package name */
        public final long f265841d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f265842e;

        /* renamed from: f, reason: collision with root package name */
        public final int f265843f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final District f265844g;

        /* compiled from: UiItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DistrictItem> {
            @Override // android.os.Parcelable.Creator
            public final DistrictItem createFromParcel(Parcel parcel) {
                return new DistrictItem(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readInt(), (District) parcel.readParcelable(DistrictItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DistrictItem[] newArray(int i12) {
                return new DistrictItem[i12];
            }
        }

        public DistrictItem(int i12, long j12, @k String str, int i13, @l District district) {
            super(i12, null);
            this.f265840c = i12;
            this.f265841d = j12;
            this.f265842e = str;
            this.f265843f = i13;
            this.f265844g = district;
        }

        @Override // com.avito.android.select.new_districts.mvi.entity.ui.UiItem
        /* renamed from: c, reason: from getter */
        public final int getF265839b() {
            return this.f265840c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DistrictItem)) {
                return false;
            }
            DistrictItem districtItem = (DistrictItem) obj;
            return this.f265840c == districtItem.f265840c && this.f265841d == districtItem.f265841d && L.f(this.f265842e, districtItem.f265842e) && this.f265843f == districtItem.f265843f && L.f(this.f265844g, districtItem.f265844g);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f265843f, H.d(r.g(Integer.hashCode(this.f265840c) * 31, 31, this.f265841d), 31, this.f265842e), 31);
            District district = this.f265844g;
            return iE2 + (district == null ? 0 : district.hashCode());
        }

        @k
        public final String toString() {
            return "DistrictItem(index=" + this.f265840c + ", id=" + this.f265841d + ", name=" + this.f265842e + ", currentRegionIndex=" + this.f265843f + ", district=" + this.f265844g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f265840c);
            parcel.writeLong(this.f265841d);
            parcel.writeString(this.f265842e);
            parcel.writeInt(this.f265843f);
            parcel.writeParcelable(this.f265844g, i12);
        }
    }

    /* compiled from: UiItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/ui/UiItem$RegionItem;", "Lcom/avito/android/select/new_districts/mvi/entity/ui/UiItem;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class RegionItem extends UiItem {

        @k
        public static final Parcelable.Creator<RegionItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f265845c;

        /* renamed from: d, reason: collision with root package name */
        public final long f265846d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f265847e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f265848f;

        /* renamed from: g, reason: collision with root package name */
        public final int f265849g;

        /* compiled from: UiItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RegionItem> {
            @Override // android.os.Parcelable.Creator
            public final RegionItem createFromParcel(Parcel parcel) {
                return new RegionItem(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final RegionItem[] newArray(int i12) {
                return new RegionItem[i12];
            }
        }

        public RegionItem(@k String str, int i12, long j12, @k String str2, int i13) {
            super(i12, null);
            this.f265845c = i12;
            this.f265846d = j12;
            this.f265847e = str;
            this.f265848f = str2;
            this.f265849g = i13;
        }

        @Override // com.avito.android.select.new_districts.mvi.entity.ui.UiItem
        /* renamed from: c, reason: from getter */
        public final int getF265839b() {
            return this.f265845c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegionItem)) {
                return false;
            }
            RegionItem regionItem = (RegionItem) obj;
            return this.f265845c == regionItem.f265845c && this.f265846d == regionItem.f265846d && L.f(this.f265847e, regionItem.f265847e) && L.f(this.f265848f, regionItem.f265848f) && this.f265849g == regionItem.f265849g;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f265849g) + H.d(H.d(r.g(Integer.hashCode(this.f265845c) * 31, 31, this.f265846d), 31, this.f265847e), 31, this.f265848f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RegionItem(index=");
            sb2.append(this.f265845c);
            sb2.append(", id=");
            sb2.append(this.f265846d);
            sb2.append(", fullName=");
            sb2.append(this.f265847e);
            sb2.append(", shortName=");
            sb2.append(this.f265848f);
            sb2.append(", regionStateIndex=");
            return r.t(sb2, this.f265849g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f265845c);
            parcel.writeLong(this.f265846d);
            parcel.writeString(this.f265847e);
            parcel.writeString(this.f265848f);
            parcel.writeInt(this.f265849g);
        }
    }

    public UiItem(int i12, C42822w c42822w) {
        this.f265839b = i12;
    }

    /* renamed from: c, reason: from getter */
    public int getF265839b() {
        return this.f265839b;
    }
}
