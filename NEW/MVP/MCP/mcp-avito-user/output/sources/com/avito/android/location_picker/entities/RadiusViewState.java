package com.avito.android.location_picker.entities;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: RadiusViewState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/entities/RadiusViewState;", "Landroid/os/Parcelable;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RadiusViewState implements Parcelable {

    @k
    public static final Parcelable.Creator<RadiusViewState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f182381b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Radius> f182382c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f182383d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f182384e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f182385f;

    /* renamed from: g, reason: collision with root package name */
    public final long f182386g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AvitoMapBounds f182387h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f182388i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f182389j;

    /* renamed from: k, reason: collision with root package name */
    public final long f182390k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f182391l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f182392m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final SearchParams f182393n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f182394o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final Radius f182395p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f182396q;

    /* compiled from: RadiusViewState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RadiusViewState> {
        @Override // android.os.Parcelable.Creator
        public final RadiusViewState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(RadiusViewState.class, parcel, arrayList, iL2, 1);
            }
            return new RadiusViewState(string, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readLong(), (AvitoMapBounds) parcel.readParcelable(RadiusViewState.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt() != 0, (SearchParams) parcel.readParcelable(RadiusViewState.class.getClassLoader()), parcel.readInt() != 0, (Radius) parcel.readParcelable(RadiusViewState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RadiusViewState[] newArray(int i12) {
            return new RadiusViewState[i12];
        }
    }

    public RadiusViewState() {
        this(null, null, false, false, null, 0L, null, false, false, 0L, null, false, null, false, null, 32767, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RadiusViewState a(RadiusViewState radiusViewState, String str, ArrayList arrayList, boolean z12, String str2, long j12, AvitoMapBounds avitoMapBounds, boolean z13, long j13, String str3, boolean z14, SearchParams searchParams, boolean z15, int i12) {
        String str4 = (i12 & 1) != 0 ? radiusViewState.f182381b : str;
        List list = (i12 & 2) != 0 ? radiusViewState.f182382c : arrayList;
        boolean z16 = (i12 & 4) != 0 ? radiusViewState.f182383d : false;
        boolean z17 = (i12 & 8) != 0 ? radiusViewState.f182384e : z12;
        String str5 = (i12 & 16) != 0 ? radiusViewState.f182385f : str2;
        long j14 = (i12 & 32) != 0 ? radiusViewState.f182386g : j12;
        AvitoMapBounds avitoMapBounds2 = (i12 & 64) != 0 ? radiusViewState.f182387h : avitoMapBounds;
        boolean z18 = (i12 & 128) != 0 ? radiusViewState.f182388i : z13;
        boolean z19 = (i12 & 256) != 0 ? radiusViewState.f182389j : false;
        long j15 = (i12 & 512) != 0 ? radiusViewState.f182390k : j13;
        String str6 = (i12 & 1024) != 0 ? radiusViewState.f182391l : str3;
        boolean z22 = (i12 & 2048) != 0 ? radiusViewState.f182392m : z14;
        SearchParams searchParams2 = (i12 & 4096) != 0 ? radiusViewState.f182393n : searchParams;
        boolean z23 = (i12 & 8192) != 0 ? radiusViewState.f182394o : z15;
        Radius radius = radiusViewState.f182395p;
        radiusViewState.getClass();
        return new RadiusViewState(str4, list, z16, z17, str5, j14, avitoMapBounds2, z18, z19, j15, str6, z22, searchParams2, z23, radius);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadiusViewState)) {
            return false;
        }
        RadiusViewState radiusViewState = (RadiusViewState) obj;
        return L.f(this.f182381b, radiusViewState.f182381b) && L.f(this.f182382c, radiusViewState.f182382c) && this.f182383d == radiusViewState.f182383d && this.f182384e == radiusViewState.f182384e && L.f(this.f182385f, radiusViewState.f182385f) && this.f182386g == radiusViewState.f182386g && L.f(this.f182387h, radiusViewState.f182387h) && this.f182388i == radiusViewState.f182388i && this.f182389j == radiusViewState.f182389j && this.f182390k == radiusViewState.f182390k && L.f(this.f182391l, radiusViewState.f182391l) && this.f182392m == radiusViewState.f182392m && L.f(this.f182393n, radiusViewState.f182393n) && this.f182394o == radiusViewState.f182394o && L.f(this.f182395p, radiusViewState.f182395p);
    }

    public final int hashCode() {
        int iG2 = r.g(H.d(r.i(r.i(H.e(this.f182381b.hashCode() * 31, 31, this.f182382c), 31, this.f182383d), 31, this.f182384e), 31, this.f182385f), 31, this.f182386g);
        AvitoMapBounds avitoMapBounds = this.f182387h;
        int i12 = r.i(H.d(r.g(r.i(r.i((iG2 + (avitoMapBounds == null ? 0 : avitoMapBounds.hashCode())) * 31, 31, this.f182388i), 31, this.f182389j), 31, this.f182390k), 31, this.f182391l), 31, this.f182392m);
        SearchParams searchParams = this.f182393n;
        int i13 = r.i((i12 + (searchParams == null ? 0 : searchParams.hashCode())) * 31, 31, this.f182394o);
        Radius radius = this.f182395p;
        return i13 + (radius != null ? radius.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "RadiusViewState(radiusId=" + this.f182381b + ", radiusList=" + this.f182382c + ", shouldLoadRadiusList=" + this.f182383d + ", radiusSelected=" + this.f182384e + ", initialRadiusId=" + this.f182385f + ", distanceInMeters=" + this.f182386g + ", mapBounds=" + this.f182387h + ", radiusIsVisible=" + this.f182388i + ", loadFailed=" + this.f182389j + ", advertsCount=" + this.f182390k + ", titleCountButton=" + this.f182391l + ", enabledCountButton=" + this.f182392m + ", searchParams=" + this.f182393n + ", shouldInvalidateAdvertsCount=" + this.f182394o + ", initialRadius=" + this.f182395p + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f182381b);
        Iterator itJ = C0.j(this.f182382c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f182383d ? 1 : 0);
        parcel.writeInt(this.f182384e ? 1 : 0);
        parcel.writeString(this.f182385f);
        parcel.writeLong(this.f182386g);
        parcel.writeParcelable(this.f182387h, i12);
        parcel.writeInt(this.f182388i ? 1 : 0);
        parcel.writeInt(this.f182389j ? 1 : 0);
        parcel.writeLong(this.f182390k);
        parcel.writeString(this.f182391l);
        parcel.writeInt(this.f182392m ? 1 : 0);
        parcel.writeParcelable(this.f182393n, i12);
        parcel.writeInt(this.f182394o ? 1 : 0);
        parcel.writeParcelable(this.f182395p, i12);
    }

    public RadiusViewState(@k String str, @k List<Radius> list, boolean z12, boolean z13, @k String str2, long j12, @l AvitoMapBounds avitoMapBounds, boolean z14, boolean z15, long j13, @k String str3, boolean z16, @l SearchParams searchParams, boolean z17, @l Radius radius) {
        this.f182381b = str;
        this.f182382c = list;
        this.f182383d = z12;
        this.f182384e = z13;
        this.f182385f = str2;
        this.f182386g = j12;
        this.f182387h = avitoMapBounds;
        this.f182388i = z14;
        this.f182389j = z15;
        this.f182390k = j13;
        this.f182391l = str3;
        this.f182392m = z16;
        this.f182393n = searchParams;
        this.f182394o = z17;
        this.f182395p = radius;
        this.f182396q = z12 || !list.isEmpty();
    }

    public RadiusViewState(String str, List list, boolean z12, boolean z13, String str2, long j12, AvitoMapBounds avitoMapBounds, boolean z14, boolean z15, long j13, String str3, boolean z16, SearchParams searchParams, boolean z17, Radius radius, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? "" : str2, (i12 & 32) != 0 ? 0L : j12, (i12 & 64) != 0 ? null : avitoMapBounds, (i12 & 128) != 0 ? false : z14, (i12 & 256) != 0 ? false : z15, (i12 & 512) != 0 ? -1L : j13, (i12 & 1024) == 0 ? str3 : "", (i12 & 2048) != 0 ? false : z16, (i12 & 4096) != 0 ? null : searchParams, (i12 & 8192) != 0 ? false : z17, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : radius);
    }
}
