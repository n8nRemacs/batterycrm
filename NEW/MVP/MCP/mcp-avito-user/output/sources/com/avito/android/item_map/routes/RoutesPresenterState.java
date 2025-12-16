package com.avito.android.item_map.routes;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.item_map.remote.model.route.Route;
import com.avito.android.item_map.remote.model.route.Type;
import com.avito.android.remote.model.search.map.Area;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RoutesPresenterState.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/routes/RoutesPresenterState;", "Landroid/os/Parcelable;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RoutesPresenterState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RoutesPresenterState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<Route> f173371b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Area f173372c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Type f173373d;

    /* compiled from: RoutesPresenterState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RoutesPresenterState> {
        @Override // android.os.Parcelable.Creator
        public final RoutesPresenterState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(RoutesPresenterState.class, parcel, arrayList, iL2, 1);
                }
            }
            return new RoutesPresenterState(arrayList, (Area) parcel.readParcelable(RoutesPresenterState.class.getClassLoader()), parcel.readInt() != 0 ? Type.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final RoutesPresenterState[] newArray(int i12) {
            return new RoutesPresenterState[i12];
        }
    }

    public RoutesPresenterState() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutesPresenterState)) {
            return false;
        }
        RoutesPresenterState routesPresenterState = (RoutesPresenterState) obj;
        return L.f(this.f173371b, routesPresenterState.f173371b) && L.f(this.f173372c, routesPresenterState.f173372c) && this.f173373d == routesPresenterState.f173373d;
    }

    public final int hashCode() {
        List<Route> list = this.f173371b;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Area area = this.f173372c;
        int iHashCode2 = (iHashCode + (area == null ? 0 : area.hashCode())) * 31;
        Type type = this.f173373d;
        return iHashCode2 + (type != null ? type.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "RoutesPresenterState(routes=" + this.f173371b + ", mapArea=" + this.f173372c + ", chosenRoute=" + this.f173373d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        List<Route> list = this.f173371b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f173372c, i12);
        Type type = this.f173373d;
        if (type == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(type.name());
        }
    }

    public RoutesPresenterState(@Y61.l List<Route> list, @Y61.l Area area, @Y61.l Type type) {
        this.f173371b = list;
        this.f173372c = area;
        this.f173373d = type;
    }

    public /* synthetic */ RoutesPresenterState(List list, Area area, Type type, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? null : area, (i12 & 4) != 0 ? null : type);
    }
}
