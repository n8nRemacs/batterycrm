package com.avito.android.location_picker.entities;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;

/* compiled from: LocationPickerState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", "Landroid/os/Parcelable;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LocationPickerState implements Parcelable {

    @k
    public static final Parcelable.Creator<LocationPickerState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f182357b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AvitoMapPoint f182358c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f182359d;

    /* renamed from: e, reason: collision with root package name */
    public final float f182360e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f182361f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f182362g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f182363h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f182364i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f182365j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f182366k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f182367l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final List<AddressSuggestion> f182368m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final LocationPickerErrors f182369n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f182370o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f182371p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f182372q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final String f182373r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f182374s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final RadiusViewState f182375t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f182376u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final String f182377v;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final AddressValidationState f182378w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f182379x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f182380y;

    /* compiled from: LocationPickerState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationPickerState> {
        @Override // android.os.Parcelable.Creator
        public final LocationPickerState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            AvitoMapPoint avitoMapPoint = (AvitoMapPoint) parcel.readParcelable(LocationPickerState.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            float f12 = parcel.readFloat();
            String string2 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            String string4 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(LocationPickerState.class, parcel, arrayList, iL2, 1);
            }
            return new LocationPickerState(string, avitoMapPoint, z12, f12, string2, z13, string3, z14, z15, z16, string4, arrayList, LocationPickerErrors.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, RadiusViewState.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), (AddressValidationState) parcel.readParcelable(LocationPickerState.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final LocationPickerState[] newArray(int i12) {
            return new LocationPickerState[i12];
        }
    }

    public LocationPickerState(@l String str, @k AvitoMapPoint avitoMapPoint, boolean z12, float f12, @k String str2, boolean z13, @k String str3, boolean z14, boolean z15, boolean z16, @k String str4, @k List<AddressSuggestion> list, @k LocationPickerErrors locationPickerErrors, boolean z17, boolean z18, boolean z19, @k String str5, boolean z22, @k RadiusViewState radiusViewState, boolean z23, @l String str6, @k AddressValidationState addressValidationState, boolean z24, boolean z25) {
        this.f182357b = str;
        this.f182358c = avitoMapPoint;
        this.f182359d = z12;
        this.f182360e = f12;
        this.f182361f = str2;
        this.f182362g = z13;
        this.f182363h = str3;
        this.f182364i = z14;
        this.f182365j = z15;
        this.f182366k = z16;
        this.f182367l = str4;
        this.f182368m = list;
        this.f182369n = locationPickerErrors;
        this.f182370o = z17;
        this.f182371p = z18;
        this.f182372q = z19;
        this.f182373r = str5;
        this.f182374s = z22;
        this.f182375t = radiusViewState;
        this.f182376u = z23;
        this.f182377v = str6;
        this.f182378w = addressValidationState;
        this.f182379x = z24;
        this.f182380y = z25;
    }

    public static LocationPickerState a(LocationPickerState locationPickerState, AvitoMapPoint avitoMapPoint, boolean z12, float f12, String str, boolean z13, String str2, boolean z14, boolean z15, String str3, List list, LocationPickerErrors locationPickerErrors, boolean z16, boolean z17, boolean z18, boolean z19, RadiusViewState radiusViewState, boolean z22, String str4, AddressValidationState addressValidationState, boolean z23, boolean z24, int i12) {
        String str5;
        boolean z25;
        String str6 = locationPickerState.f182357b;
        AvitoMapPoint avitoMapPoint2 = (i12 & 2) != 0 ? locationPickerState.f182358c : avitoMapPoint;
        boolean z26 = (i12 & 4) != 0 ? locationPickerState.f182359d : z12;
        float f13 = (i12 & 8) != 0 ? locationPickerState.f182360e : f12;
        String str7 = (i12 & 16) != 0 ? locationPickerState.f182361f : str;
        boolean z27 = (i12 & 32) != 0 ? locationPickerState.f182362g : z13;
        String str8 = (i12 & 64) != 0 ? locationPickerState.f182363h : str2;
        boolean z28 = (i12 & 128) != 0 ? locationPickerState.f182364i : true;
        boolean z29 = (i12 & 256) != 0 ? locationPickerState.f182365j : z14;
        boolean z32 = (i12 & 512) != 0 ? locationPickerState.f182366k : z15;
        String str9 = (i12 & 1024) != 0 ? locationPickerState.f182367l : str3;
        List list2 = (i12 & 2048) != 0 ? locationPickerState.f182368m : list;
        LocationPickerErrors locationPickerErrors2 = (i12 & 4096) != 0 ? locationPickerState.f182369n : locationPickerErrors;
        boolean z33 = (i12 & 8192) != 0 ? locationPickerState.f182370o : z16;
        boolean z34 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? locationPickerState.f182371p : z17;
        boolean z35 = (i12 & 32768) != 0 ? locationPickerState.f182372q : z18;
        String str10 = locationPickerState.f182373r;
        if ((i12 & 131072) != 0) {
            str5 = str10;
            z25 = locationPickerState.f182374s;
        } else {
            str5 = str10;
            z25 = z19;
        }
        RadiusViewState radiusViewState2 = (262144 & i12) != 0 ? locationPickerState.f182375t : radiusViewState;
        boolean z36 = (524288 & i12) != 0 ? locationPickerState.f182376u : z22;
        String str11 = (1048576 & i12) != 0 ? locationPickerState.f182377v : str4;
        AddressValidationState addressValidationState2 = (2097152 & i12) != 0 ? locationPickerState.f182378w : addressValidationState;
        boolean z37 = (4194304 & i12) != 0 ? locationPickerState.f182379x : z23;
        boolean z38 = (i12 & 8388608) != 0 ? locationPickerState.f182380y : z24;
        locationPickerState.getClass();
        return new LocationPickerState(str6, avitoMapPoint2, z26, f13, str7, z27, str8, z28, z29, z32, str9, list2, locationPickerErrors2, z33, z34, z35, str5, z25, radiusViewState2, z36, str11, addressValidationState2, z37, z38);
    }

    public final boolean c() {
        return (!this.f182369n.c() || !C43066x.K(this.f182363h) || this.f182366k || this.f182362g || this.f182370o || f() || this.f182359d) ? false : true;
    }

    public final boolean d() {
        if (this.f182366k && !this.f182362g) {
            String str = this.f182361f;
            if (!C43066x.K(str) && (this.f182368m.isEmpty() || !L.f(this.f182367l, str))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f182365j && !this.f182364i && this.f182369n.c();
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationPickerState)) {
            return false;
        }
        LocationPickerState locationPickerState = (LocationPickerState) obj;
        return L.f(this.f182357b, locationPickerState.f182357b) && L.f(this.f182358c, locationPickerState.f182358c) && this.f182359d == locationPickerState.f182359d && Float.compare(this.f182360e, locationPickerState.f182360e) == 0 && L.f(this.f182361f, locationPickerState.f182361f) && this.f182362g == locationPickerState.f182362g && L.f(this.f182363h, locationPickerState.f182363h) && this.f182364i == locationPickerState.f182364i && this.f182365j == locationPickerState.f182365j && this.f182366k == locationPickerState.f182366k && L.f(this.f182367l, locationPickerState.f182367l) && L.f(this.f182368m, locationPickerState.f182368m) && L.f(this.f182369n, locationPickerState.f182369n) && this.f182370o == locationPickerState.f182370o && this.f182371p == locationPickerState.f182371p && this.f182372q == locationPickerState.f182372q && L.f(this.f182373r, locationPickerState.f182373r) && this.f182374s == locationPickerState.f182374s && L.f(this.f182375t, locationPickerState.f182375t) && this.f182376u == locationPickerState.f182376u && L.f(this.f182377v, locationPickerState.f182377v) && L.f(this.f182378w, locationPickerState.f182378w) && this.f182379x == locationPickerState.f182379x && this.f182380y == locationPickerState.f182380y;
    }

    public final boolean f() {
        AvitoMapPoint avitoMapPoint = this.f182358c;
        return (avitoMapPoint.getLatitude() == 0.0d || avitoMapPoint.getLongitude() == 0.0d) && !this.f182370o && !this.f182366k && this.f182369n.c();
    }

    public final int hashCode() {
        String str = this.f182357b;
        int i12 = r.i((this.f182375t.hashCode() + r.i(H.d(r.i(r.i(r.i((this.f182369n.hashCode() + H.e(H.d(r.i(r.i(r.i(H.d(r.i(H.d(r.d(this.f182360e, r.i((this.f182358c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f182359d), 31), 31, this.f182361f), 31, this.f182362g), 31, this.f182363h), 31, this.f182364i), 31, this.f182365j), 31, this.f182366k), 31, this.f182367l), 31, this.f182368m)) * 31, 31, this.f182370o), 31, this.f182371p), 31, this.f182372q), 31, this.f182373r), 31, this.f182374s)) * 31, 31, this.f182376u);
        String str2 = this.f182377v;
        return Boolean.hashCode(this.f182380y) + r.i((this.f182378w.hashCode() + ((i12 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.f182379x);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationPickerState(itemId=");
        sb2.append(this.f182357b);
        sb2.append(", latLng=");
        sb2.append(this.f182358c);
        sb2.append(", doNotTryToGetAddress=");
        sb2.append(this.f182359d);
        sb2.append(", zoom=");
        sb2.append(this.f182360e);
        sb2.append(", addressString=");
        sb2.append(this.f182361f);
        sb2.append(", addressStringFitsCoords=");
        sb2.append(this.f182362g);
        sb2.append(", addressStringToSearchFor=");
        sb2.append(this.f182363h);
        sb2.append(", coordsVerified=");
        sb2.append(this.f182364i);
        sb2.append(", shouldBeVerified=");
        sb2.append(this.f182365j);
        sb2.append(", searchHasFocus=");
        sb2.append(this.f182366k);
        sb2.append(", querySuggestionsLoadedBy=");
        sb2.append(this.f182367l);
        sb2.append(", suggestionList=");
        sb2.append(this.f182368m);
        sb2.append(", errors=");
        sb2.append(this.f182369n);
        sb2.append(", cameraMoving=");
        sb2.append(this.f182370o);
        sb2.append(", goToCheckLocationPermission=");
        sb2.append(this.f182371p);
        sb2.append(", moveCameraToDeviceLocation=");
        sb2.append(this.f182372q);
        sb2.append(", categoryId=");
        sb2.append(this.f182373r);
        sb2.append(", userInteractsWithUI=");
        sb2.append(this.f182374s);
        sb2.append(", radiusState=");
        sb2.append(this.f182375t);
        sb2.append(", sendLocationToJobAssistant=");
        sb2.append(this.f182376u);
        sb2.append(", jsonWebToken=");
        sb2.append(this.f182377v);
        sb2.append(", addressValidationState=");
        sb2.append(this.f182378w);
        sb2.append(", shouldMoveToDeviceLocation=");
        sb2.append(this.f182379x);
        sb2.append(", checkGeoSettings=");
        return r.x(sb2, this.f182380y, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f182357b);
        parcel.writeParcelable(this.f182358c, i12);
        parcel.writeInt(this.f182359d ? 1 : 0);
        parcel.writeFloat(this.f182360e);
        parcel.writeString(this.f182361f);
        parcel.writeInt(this.f182362g ? 1 : 0);
        parcel.writeString(this.f182363h);
        parcel.writeInt(this.f182364i ? 1 : 0);
        parcel.writeInt(this.f182365j ? 1 : 0);
        parcel.writeInt(this.f182366k ? 1 : 0);
        parcel.writeString(this.f182367l);
        Iterator itJ = C0.j(this.f182368m, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        this.f182369n.writeToParcel(parcel, i12);
        parcel.writeInt(this.f182370o ? 1 : 0);
        parcel.writeInt(this.f182371p ? 1 : 0);
        parcel.writeInt(this.f182372q ? 1 : 0);
        parcel.writeString(this.f182373r);
        parcel.writeInt(this.f182374s ? 1 : 0);
        this.f182375t.writeToParcel(parcel, i12);
        parcel.writeInt(this.f182376u ? 1 : 0);
        parcel.writeString(this.f182377v);
        parcel.writeParcelable(this.f182378w, i12);
        parcel.writeInt(this.f182379x ? 1 : 0);
        parcel.writeInt(this.f182380y ? 1 : 0);
    }

    public LocationPickerState(String str, AvitoMapPoint avitoMapPoint, boolean z12, float f12, String str2, boolean z13, String str3, boolean z14, boolean z15, boolean z16, String str4, List list, LocationPickerErrors locationPickerErrors, boolean z17, boolean z18, boolean z19, String str5, boolean z22, RadiusViewState radiusViewState, boolean z23, String str6, AddressValidationState addressValidationState, boolean z24, boolean z25, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? new AvitoMapPoint(0.0d, 0.0d, null, 4, null) : avitoMapPoint, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? 0.0f : f12, (i12 & 16) != 0 ? "" : str2, (i12 & 32) != 0 ? false : z13, (i12 & 64) != 0 ? "" : str3, (i12 & 128) != 0 ? false : z14, (i12 & 256) != 0 ? false : z15, (i12 & 512) != 0 ? false : z16, (i12 & 1024) != 0 ? "" : str4, (i12 & 2048) != 0 ? C42784z0.f406748b : list, (i12 & 4096) != 0 ? new LocationPickerErrors(false, false, null, null, false, false, false, false, false, false, false, false, 4095, null) : locationPickerErrors, (i12 & 8192) != 0 ? false : z17, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z18, (32768 & i12) != 0 ? false : z19, str5, (131072 & i12) != 0 ? false : z22, (262144 & i12) != 0 ? new RadiusViewState(null, null, false, false, null, 0L, null, false, false, 0L, null, false, null, false, null, 32767, null) : radiusViewState, (524288 & i12) != 0 ? false : z23, (1048576 & i12) != 0 ? null : str6, (2097152 & i12) != 0 ? new AddressValidationState(null, false, false, null, 15, null) : addressValidationState, (4194304 & i12) != 0 ? false : z24, (i12 & 8388608) != 0 ? false : z25);
    }
}
