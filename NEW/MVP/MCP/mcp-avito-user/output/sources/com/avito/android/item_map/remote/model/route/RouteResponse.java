package com.avito.android.item_map.remote.model.route;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.search.map.Area;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RouteResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/item_map/remote/model/route/RouteResponse;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/item_map/remote/model/route/Route;", "routes", "Lcom/avito/android/remote/model/search/map/Area;", "mapArea", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/search/map/Area;)V", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/remote/model/search/map/Area;", "c", "()Lcom/avito/android/remote/model/search/map/Area;", "_avito-discouraged_avito-api_item-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RouteResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<RouteResponse> CREATOR = new a();

    @c("mapArea")
    @l
    private final Area mapArea;

    @c("routes")
    @l
    private final List<Route> routes;

    /* compiled from: RouteResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RouteResponse> {
        @Override // android.os.Parcelable.Creator
        public final RouteResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Route.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new RouteResponse(arrayList, (Area) parcel.readParcelable(RouteResponse.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RouteResponse[] newArray(int i12) {
            return new RouteResponse[i12];
        }
    }

    public RouteResponse(@l List<Route> list, @l Area area) {
        this.routes = list;
        this.mapArea = area;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Area getMapArea() {
        return this.mapArea;
    }

    @l
    public final List<Route> d() {
        return this.routes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteResponse)) {
            return false;
        }
        RouteResponse routeResponse = (RouteResponse) obj;
        return L.f(this.routes, routeResponse.routes) && L.f(this.mapArea, routeResponse.mapArea);
    }

    public final int hashCode() {
        List<Route> list = this.routes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Area area = this.mapArea;
        return iHashCode + (area != null ? area.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "RouteResponse(routes=" + this.routes + ", mapArea=" + this.mapArea + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<Route> list = this.routes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Route) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.mapArea, i12);
    }
}
