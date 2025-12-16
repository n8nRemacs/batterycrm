package com.avito.android.search.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Direction;
import com.avito.android.remote.model.DistrictsWithRegions;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationInfo.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/LocationInfo;", "Landroid/os/Parcelable;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocationInfo implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<LocationInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Location f261875b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Location f261876c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<Metro> f261877d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final MetroResponseBody f261878e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final DistrictsWithRegions f261879f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<Direction> f261880g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f261881h;

    /* compiled from: LocationInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationInfo> {
        @Override // android.os.Parcelable.Creator
        public final LocationInfo createFromParcel(Parcel parcel) {
            Location location = (Location) parcel.readParcelable(LocationInfo.class.getClassLoader());
            Location location2 = (Location) parcel.readParcelable(LocationInfo.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(LocationInfo.class, parcel, arrayList, iL2, 1);
            }
            MetroResponseBody metroResponseBody = (MetroResponseBody) parcel.readParcelable(LocationInfo.class.getClassLoader());
            DistrictsWithRegions districtsWithRegions = (DistrictsWithRegions) parcel.readParcelable(LocationInfo.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iL3 = 0;
            while (iL3 != i13) {
                iL3 = com.avito.android.actions_sheet.a.l(LocationInfo.class, parcel, arrayList2, iL3, 1);
            }
            return new LocationInfo(location, location2, arrayList, metroResponseBody, districtsWithRegions, arrayList2, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final LocationInfo[] newArray(int i12) {
            return new LocationInfo[i12];
        }
    }

    public LocationInfo(@Y61.k Location location, @Y61.l Location location2, @Y61.k List<Metro> list, @Y61.l MetroResponseBody metroResponseBody, @Y61.k DistrictsWithRegions districtsWithRegions, @Y61.k List<Direction> list2, boolean z12) {
        this.f261875b = location;
        this.f261876c = location2;
        this.f261877d = list;
        this.f261878e = metroResponseBody;
        this.f261879f = districtsWithRegions;
        this.f261880g = list2;
        this.f261881h = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f261875b, i12);
        parcel.writeParcelable(this.f261876c, i12);
        Iterator itJ = com.akita.compose.theme.re23.style.C0.j(this.f261877d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f261878e, i12);
        parcel.writeParcelable(this.f261879f, i12);
        Iterator itJ2 = com.akita.compose.theme.re23.style.C0.j(this.f261880g, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
        parcel.writeInt(this.f261881h ? 1 : 0);
    }

    public /* synthetic */ LocationInfo(Location location, Location location2, List list, MetroResponseBody metroResponseBody, DistrictsWithRegions districtsWithRegions, List list2, boolean z12, int i12, C42822w c42822w) {
        this(location, location2, list, metroResponseBody, districtsWithRegions, list2, (i12 & 64) != 0 ? false : z12);
    }
}
