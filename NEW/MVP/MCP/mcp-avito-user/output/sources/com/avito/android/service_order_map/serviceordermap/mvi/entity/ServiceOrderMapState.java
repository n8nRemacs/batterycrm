package com.avito.android.service_order_map.serviceordermap.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrderMapState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "a", "MapMode", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceOrderMapState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f278774b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f278775c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Double f278776d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Double f278777e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f278778f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f278779g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f278780h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<AddressSuggestion> f278781i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final MapMode f278782j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f278772k = new a(null);

    @k
    public static final Parcelable.Creator<ServiceOrderMapState> CREATOR = new b();

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final ServiceOrderMapState f278773l = new ServiceOrderMapState(null, null, null, null, false, null, null, C42784z0.f406748b, MapMode.f278784c);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceOrderMapState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapState$MapMode;", "", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MapMode {

        /* renamed from: b, reason: collision with root package name */
        public static final MapMode f278783b;

        /* renamed from: c, reason: collision with root package name */
        public static final MapMode f278784c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ MapMode[] f278785d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278786e;

        static {
            MapMode mapMode = new MapMode("Search", 0);
            f278783b = mapMode;
            MapMode mapMode2 = new MapMode("Map", 1);
            f278784c = mapMode2;
            MapMode[] mapModeArr = {mapMode, mapMode2};
            f278785d = mapModeArr;
            f278786e = c.a(mapModeArr);
        }

        public MapMode() {
            throw null;
        }

        public static MapMode valueOf(String str) {
            return (MapMode) Enum.valueOf(MapMode.class, str);
        }

        public static MapMode[] values() {
            return (MapMode[]) f278785d.clone();
        }
    }

    /* compiled from: ServiceOrderMapState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapState$a;", "", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceOrderMapState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ServiceOrderMapState> {
        @Override // android.os.Parcelable.Creator
        public final ServiceOrderMapState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ServiceOrderMapState.class, parcel, arrayList, iL2, 1);
            }
            return new ServiceOrderMapState(string, string2, dValueOf, dValueOf2, z12, string3, string4, arrayList, MapMode.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceOrderMapState[] newArray(int i12) {
            return new ServiceOrderMapState[i12];
        }
    }

    public ServiceOrderMapState(@l String str, @l String str2, @l Double d12, @l Double d13, boolean z12, @l String str3, @l String str4, @k List<AddressSuggestion> list, @k MapMode mapMode) {
        this.f278774b = str;
        this.f278775c = str2;
        this.f278776d = d12;
        this.f278777e = d13;
        this.f278778f = z12;
        this.f278779g = str3;
        this.f278780h = str4;
        this.f278781i = list;
        this.f278782j = mapMode;
    }

    public static ServiceOrderMapState a(ServiceOrderMapState serviceOrderMapState, String str, String str2, Double d12, Double d13, boolean z12, String str3, String str4, ArrayList arrayList, MapMode mapMode, int i12) {
        String str5 = (i12 & 1) != 0 ? serviceOrderMapState.f278774b : str;
        String str6 = (i12 & 2) != 0 ? serviceOrderMapState.f278775c : str2;
        Double d14 = (i12 & 4) != 0 ? serviceOrderMapState.f278776d : d12;
        Double d15 = (i12 & 8) != 0 ? serviceOrderMapState.f278777e : d13;
        boolean z13 = (i12 & 16) != 0 ? serviceOrderMapState.f278778f : z12;
        String str7 = (i12 & 32) != 0 ? serviceOrderMapState.f278779g : str3;
        String str8 = (i12 & 64) != 0 ? serviceOrderMapState.f278780h : str4;
        List<AddressSuggestion> list = (i12 & 128) != 0 ? serviceOrderMapState.f278781i : arrayList;
        MapMode mapMode2 = (i12 & 256) != 0 ? serviceOrderMapState.f278782j : mapMode;
        serviceOrderMapState.getClass();
        return new ServiceOrderMapState(str5, str6, d14, d15, z13, str7, str8, list, mapMode2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceOrderMapState)) {
            return false;
        }
        ServiceOrderMapState serviceOrderMapState = (ServiceOrderMapState) obj;
        return L.f(this.f278774b, serviceOrderMapState.f278774b) && L.f(this.f278775c, serviceOrderMapState.f278775c) && L.f(this.f278776d, serviceOrderMapState.f278776d) && L.f(this.f278777e, serviceOrderMapState.f278777e) && this.f278778f == serviceOrderMapState.f278778f && L.f(this.f278779g, serviceOrderMapState.f278779g) && L.f(this.f278780h, serviceOrderMapState.f278780h) && L.f(this.f278781i, serviceOrderMapState.f278781i) && this.f278782j == serviceOrderMapState.f278782j;
    }

    public final int hashCode() {
        String str = this.f278774b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f278775c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d12 = this.f278776d;
        int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f278777e;
        int i12 = r.i((iHashCode3 + (d13 == null ? 0 : d13.hashCode())) * 31, 31, this.f278778f);
        String str3 = this.f278779g;
        int iHashCode4 = (i12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f278780h;
        return this.f278782j.hashCode() + H.e((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f278781i);
    }

    @k
    public final String toString() {
        return "ServiceOrderMapState(searchQuery=" + this.f278774b + ", displayInput=" + this.f278775c + ", lat=" + this.f278776d + ", lng=" + this.f278777e + ", loading=" + this.f278778f + ", title=" + this.f278779g + ", buttonTitle=" + this.f278780h + ", addressSuggestions=" + this.f278781i + ", mode=" + this.f278782j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f278774b);
        parcel.writeString(this.f278775c);
        Double d12 = this.f278776d;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        Double d13 = this.f278777e;
        if (d13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
        }
        parcel.writeInt(this.f278778f ? 1 : 0);
        parcel.writeString(this.f278779g);
        parcel.writeString(this.f278780h);
        Iterator itJ = C0.j(this.f278781i, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f278782j.name());
    }
}
