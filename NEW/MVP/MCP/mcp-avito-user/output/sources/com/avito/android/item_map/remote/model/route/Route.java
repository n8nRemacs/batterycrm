package com.avito.android.item_map.remote.model.route;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Coordinates;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RouteResponse.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/item_map/remote/model/route/Route;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/Coordinates;", "coords", "Lcom/avito/android/item_map/remote/model/route/Meta;", Constants.REFERRER_API_META, "Lcom/avito/android/item_map/remote/model/route/Type;", "type", "<init>", "(Ljava/util/List;Lcom/avito/android/item_map/remote/model/route/Meta;Lcom/avito/android/item_map/remote/model/route/Type;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/item_map/remote/model/route/Meta;", "d", "()Lcom/avito/android/item_map/remote/model/route/Meta;", "Lcom/avito/android/item_map/remote/model/route/Type;", "e", "()Lcom/avito/android/item_map/remote/model/route/Type;", "_avito-discouraged_avito-api_item-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Route implements Parcelable {

    @k
    public static final Parcelable.Creator<Route> CREATOR = new a();

    @c("points")
    @k
    private final List<Coordinates> coords;

    @c(Constants.REFERRER_API_META)
    @k
    private final Meta meta;

    @c("type")
    @k
    private final Type type;

    /* compiled from: RouteResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Route> {
        @Override // android.os.Parcelable.Creator
        public final Route createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(Route.class, parcel, arrayList, iL2, 1);
            }
            return new Route(arrayList, Meta.CREATOR.createFromParcel(parcel), Type.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Route[] newArray(int i12) {
            return new Route[i12];
        }
    }

    public Route(@k List<Coordinates> list, @k Meta meta, @k Type type) {
        this.coords = list;
        this.meta = meta;
        this.type = type;
    }

    @k
    public final List<Coordinates> c() {
        return this.coords;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return L.f(this.coords, route.coords) && L.f(this.meta, route.meta) && this.type == route.type;
    }

    public final int hashCode() {
        return this.type.hashCode() + ((this.meta.hashCode() + (this.coords.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "Route(coords=" + this.coords + ", meta=" + this.meta + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.coords, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        this.meta.writeToParcel(parcel, i12);
        parcel.writeString(this.type.name());
    }
}
