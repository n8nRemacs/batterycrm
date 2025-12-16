package com.avito.android.item_map.amenity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.developments_catalog.AmenityPin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AmenityButtonsPresenter.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/amenity/AmenityButtonState;", "Landroid/os/Parcelable;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AmenityButtonState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AmenityButtonState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f173272b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public ButtonViewState f173273c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f173274d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f173275e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<AmenityPin> f173276f;

    /* compiled from: AmenityButtonsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AmenityButtonState> {
        @Override // android.os.Parcelable.Creator
        public final AmenityButtonState createFromParcel(Parcel parcel) {
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            ButtonViewState buttonViewStateValueOf = ButtonViewState.valueOf(parcel.readString());
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AmenityButtonState.class, parcel, arrayList, iL2, 1);
            }
            return new AmenityButtonState(z12, buttonViewStateValueOf, z13, z14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AmenityButtonState[] newArray(int i12) {
            return new AmenityButtonState[i12];
        }
    }

    public AmenityButtonState() {
        this(false, null, false, false, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmenityButtonState)) {
            return false;
        }
        AmenityButtonState amenityButtonState = (AmenityButtonState) obj;
        return this.f173272b == amenityButtonState.f173272b && this.f173273c == amenityButtonState.f173273c && this.f173274d == amenityButtonState.f173274d && this.f173275e == amenityButtonState.f173275e && L.f(this.f173276f, amenityButtonState.f173276f);
    }

    public final int hashCode() {
        return this.f173276f.hashCode() + r.i(r.i((this.f173273c.hashCode() + (Boolean.hashCode(this.f173272b) * 31)) * 31, 31, this.f173274d), 31, this.f173275e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AmenityButtonState(isStartOnStart=");
        sb2.append(this.f173272b);
        sb2.append(", viewState=");
        sb2.append(this.f173273c);
        sb2.append(", isLoading=");
        sb2.append(this.f173274d);
        sb2.append(", isLoaded=");
        sb2.append(this.f173275e);
        sb2.append(", cachedPins=");
        return H.p(sb2, this.f173276f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f173272b ? 1 : 0);
        parcel.writeString(this.f173273c.name());
        parcel.writeInt(this.f173274d ? 1 : 0);
        parcel.writeInt(this.f173275e ? 1 : 0);
        Iterator itJ = C0.j(this.f173276f, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }

    public AmenityButtonState(boolean z12, @Y61.k ButtonViewState buttonViewState, boolean z13, boolean z14, @Y61.k List<AmenityPin> list) {
        this.f173272b = z12;
        this.f173273c = buttonViewState;
        this.f173274d = z13;
        this.f173275e = z14;
        this.f173276f = list;
    }

    public /* synthetic */ AmenityButtonState(boolean z12, ButtonViewState buttonViewState, boolean z13, boolean z14, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? ButtonViewState.f173277b : buttonViewState, (i12 & 4) != 0 ? false : z13, (i12 & 8) == 0 ? z14 : false, (i12 & 16) != 0 ? new ArrayList() : list);
    }
}
