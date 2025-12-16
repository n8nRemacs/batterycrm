package com.avito.android.search.filter.location_filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.counter.ChangingParametersForButtons;
import com.avito.android.search.filter.FiltersOverrideParams;
import com.avito.android.search.filter.LocationInfo;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Arguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/location_filter/InteractorState;", "Landroid/os/Parcelable;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InteractorState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<InteractorState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final LocationInfo f263432b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Location f263433c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ParametersTreeWithAdditional f263434d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Coordinates f263435e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ChangingParametersForButtons f263436f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Boolean f263437g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final FiltersOverrideParams f263438h;

    /* compiled from: Arguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InteractorState> {
        @Override // android.os.Parcelable.Creator
        public final InteractorState createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            LocationInfo locationInfoCreateFromParcel = parcel.readInt() == 0 ? null : LocationInfo.CREATOR.createFromParcel(parcel);
            Location location = (Location) parcel.readParcelable(InteractorState.class.getClassLoader());
            ParametersTreeWithAdditional parametersTreeWithAdditional = (ParametersTreeWithAdditional) parcel.readParcelable(InteractorState.class.getClassLoader());
            Coordinates coordinates = (Coordinates) parcel.readParcelable(InteractorState.class.getClassLoader());
            ChangingParametersForButtons changingParametersForButtons = (ChangingParametersForButtons) parcel.readParcelable(InteractorState.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InteractorState(locationInfoCreateFromParcel, location, parametersTreeWithAdditional, coordinates, changingParametersForButtons, boolValueOf, parcel.readInt() != 0 ? FiltersOverrideParams.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final InteractorState[] newArray(int i12) {
            return new InteractorState[i12];
        }
    }

    public InteractorState(@Y61.l LocationInfo locationInfo, @Y61.l Location location, @Y61.l ParametersTreeWithAdditional parametersTreeWithAdditional, @Y61.l Coordinates coordinates, @Y61.l ChangingParametersForButtons changingParametersForButtons, @Y61.l Boolean bool, @Y61.l FiltersOverrideParams filtersOverrideParams) {
        this.f263432b = locationInfo;
        this.f263433c = location;
        this.f263434d = parametersTreeWithAdditional;
        this.f263435e = coordinates;
        this.f263436f = changingParametersForButtons;
        this.f263437g = bool;
        this.f263438h = filtersOverrideParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractorState)) {
            return false;
        }
        InteractorState interactorState = (InteractorState) obj;
        return L.f(this.f263432b, interactorState.f263432b) && L.f(this.f263433c, interactorState.f263433c) && L.f(this.f263434d, interactorState.f263434d) && L.f(this.f263435e, interactorState.f263435e) && L.f(this.f263436f, interactorState.f263436f) && L.f(this.f263437g, interactorState.f263437g) && L.f(this.f263438h, interactorState.f263438h);
    }

    public final int hashCode() {
        LocationInfo locationInfo = this.f263432b;
        int iHashCode = (locationInfo == null ? 0 : locationInfo.hashCode()) * 31;
        Location location = this.f263433c;
        int iHashCode2 = (iHashCode + (location == null ? 0 : location.hashCode())) * 31;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263434d;
        int iHashCode3 = (iHashCode2 + (parametersTreeWithAdditional == null ? 0 : parametersTreeWithAdditional.hashCode())) * 31;
        Coordinates coordinates = this.f263435e;
        int iHashCode4 = (iHashCode3 + (coordinates == null ? 0 : coordinates.hashCode())) * 31;
        ChangingParametersForButtons changingParametersForButtons = this.f263436f;
        int iHashCode5 = (iHashCode4 + (changingParametersForButtons == null ? 0 : changingParametersForButtons.hashCode())) * 31;
        Boolean bool = this.f263437g;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        FiltersOverrideParams filtersOverrideParams = this.f263438h;
        return iHashCode6 + (filtersOverrideParams != null ? filtersOverrideParams.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "InteractorState(locationInfo=" + this.f263432b + ", location=" + this.f263433c + ", parametersTree=" + this.f263434d + ", coordinates=" + this.f263435e + ", lastButtons=" + this.f263436f + ", lastUpdatesForm=" + this.f263437g + ", overrideParams=" + this.f263438h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        LocationInfo locationInfo = this.f263432b;
        if (locationInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            locationInfo.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f263433c, i12);
        parcel.writeParcelable(this.f263434d, i12);
        parcel.writeParcelable(this.f263435e, i12);
        parcel.writeParcelable(this.f263436f, i12);
        Boolean bool = this.f263437g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        FiltersOverrideParams filtersOverrideParams = this.f263438h;
        if (filtersOverrideParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            filtersOverrideParams.writeToParcel(parcel, i12);
        }
    }
}
