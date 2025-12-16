package com.avito.android.widget_filters.remote.model.widgets;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersLocationWidget.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bq\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/LocationsSearch;", "Landroid/os/Parcelable;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersContentParameter;", "", "id", "", "isRequired", "updatesForm", "isVisible", "notSelectedErrorText", "inputHintText", "Lcom/avito/android/widget_filters/remote/model/widgets/Destination;", "selectedDestination", "", "_popularDestinations", "showAllRegions", "", "maxSuggests", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/widget_filters/remote/model/widgets/Destination;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "g", "i", "d", "c", "Lcom/avito/android/widget_filters/remote/model/widgets/Destination;", "f", "()Lcom/avito/android/widget_filters/remote/model/widgets/Destination;", "Ljava/util/List;", "getShowAllRegions", "Ljava/lang/Integer;", "getMaxSuggests", "()Ljava/lang/Integer;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LocationsSearch implements Parcelable, WidgetFiltersContentParameter {

    @k
    public static final Parcelable.Creator<LocationsSearch> CREATOR = new a();

    @c("popularDestinations")
    @l
    private final List<Destination> _popularDestinations;

    @c("id")
    @l
    private final String id;

    @c("inputHintText")
    @l
    private final String inputHintText;

    @c("isRequired")
    @l
    private final Boolean isRequired;

    @c("isVisible")
    @l
    private final Boolean isVisible;

    @c("maxSuggests")
    @l
    private final Integer maxSuggests;

    @c("notSelectedErrorText")
    @l
    private final String notSelectedErrorText;

    @c("selectedDestination")
    @l
    private final Destination selectedDestination;

    @c("showAllRegions")
    @l
    private final Boolean showAllRegions;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    /* compiled from: WidgetFiltersLocationWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationsSearch> {
        @Override // android.os.Parcelable.Creator
        public final LocationsSearch createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            ArrayList arrayList;
            Boolean boolValueOf4;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Destination destinationCreateFromParcel = parcel.readInt() == 0 ? null : Destination.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Destination.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LocationsSearch(string, boolValueOf, boolValueOf2, boolValueOf3, string2, string3, destinationCreateFromParcel, arrayList, boolValueOf4, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final LocationsSearch[] newArray(int i12) {
            return new LocationsSearch[i12];
        }
    }

    public LocationsSearch(@l String str, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l String str2, @l String str3, @l Destination destination, @l List<Destination> list, @l Boolean bool4, @l Integer num) {
        this.id = str;
        this.isRequired = bool;
        this.updatesForm = bool2;
        this.isVisible = bool3;
        this.notSelectedErrorText = str2;
        this.inputHintText = str3;
        this.selectedDestination = destination;
        this._popularDestinations = list;
        this.showAllRegions = bool4;
        this.maxSuggests = num;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getInputHintText() {
        return this.inputHintText;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getNotSelectedErrorText() {
        return this.notSelectedErrorText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final List<Destination> e() {
        List<Destination> list = this._popularDestinations;
        return list == null ? C42784z0.f406748b : list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationsSearch)) {
            return false;
        }
        LocationsSearch locationsSearch = (LocationsSearch) obj;
        return L.f(this.id, locationsSearch.id) && L.f(this.isRequired, locationsSearch.isRequired) && L.f(this.updatesForm, locationsSearch.updatesForm) && L.f(this.isVisible, locationsSearch.isVisible) && L.f(this.notSelectedErrorText, locationsSearch.notSelectedErrorText) && L.f(this.inputHintText, locationsSearch.inputHintText) && L.f(this.selectedDestination, locationsSearch.selectedDestination) && L.f(this._popularDestinations, locationsSearch._popularDestinations) && L.f(this.showAllRegions, locationsSearch.showAllRegions) && L.f(this.maxSuggests, locationsSearch.maxSuggests);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Destination getSelectedDestination() {
        return this.selectedDestination;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Boolean getIsRequired() {
        return this.isRequired;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isRequired;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.updatesForm;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isVisible;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.notSelectedErrorText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.inputHintText;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Destination destination = this.selectedDestination;
        int iHashCode7 = (iHashCode6 + (destination == null ? 0 : destination.hashCode())) * 31;
        List<Destination> list = this._popularDestinations;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool4 = this.showAllRegions;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.maxSuggests;
        return iHashCode9 + (num != null ? num.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationsSearch(id=");
        sb2.append(this.id);
        sb2.append(", isRequired=");
        sb2.append(this.isRequired);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", isVisible=");
        sb2.append(this.isVisible);
        sb2.append(", notSelectedErrorText=");
        sb2.append(this.notSelectedErrorText);
        sb2.append(", inputHintText=");
        sb2.append(this.inputHintText);
        sb2.append(", selectedDestination=");
        sb2.append(this.selectedDestination);
        sb2.append(", _popularDestinations=");
        sb2.append(this._popularDestinations);
        sb2.append(", showAllRegions=");
        sb2.append(this.showAllRegions);
        sb2.append(", maxSuggests=");
        return s.j(sb2, this.maxSuggests, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        Boolean bool = this.isRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.updatesForm;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.isVisible;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        parcel.writeString(this.notSelectedErrorText);
        parcel.writeString(this.inputHintText);
        Destination destination = this.selectedDestination;
        if (destination == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            destination.writeToParcel(parcel, i12);
        }
        List<Destination> list = this._popularDestinations;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Destination) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Boolean bool4 = this.showAllRegions;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        Integer num = this.maxSuggests;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
