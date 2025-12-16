package com.avito.android.widget_filters.remote.model.widgets;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersLocationWidget.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/LocationContent;", "Landroid/os/Parcelable;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersContent;", "", "Lcom/avito/android/widget_filters/remote/model/widgets/RecentSearch;", "recentSearches", "", "showFastRecentSearches", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersOnboardingDto;", "fastRecentSearchesOnboarding", "Lcom/avito/android/widget_filters/remote/model/widgets/LocationsSearch;", "locationsSearch", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersOnboardingDto;Lcom/avito/android/widget_filters/remote/model/widgets/LocationsSearch;)V", "Ljava/util/List;", "e", "()Ljava/util/List;", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersOnboardingDto;", "c", "()Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersOnboardingDto;", "Lcom/avito/android/widget_filters/remote/model/widgets/LocationsSearch;", "d", "()Lcom/avito/android/widget_filters/remote/model/widgets/LocationsSearch;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LocationContent implements Parcelable, WidgetFiltersContent {

    @k
    public static final Parcelable.Creator<LocationContent> CREATOR = new a();

    @c("fastRecentSearchesOnBoarding")
    @l
    private final WidgetFiltersOnboardingDto fastRecentSearchesOnboarding;

    @c("locationsSearch")
    @l
    private final LocationsSearch locationsSearch;

    @c("recentSearches")
    @l
    private final List<RecentSearch> recentSearches;

    @c("showFastRecentSearches")
    @l
    private final Boolean showFastRecentSearches;

    /* compiled from: WidgetFiltersLocationWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationContent> {
        @Override // android.os.Parcelable.Creator
        public final LocationContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(RecentSearch.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LocationContent(arrayList, boolValueOf, parcel.readInt() == 0 ? null : WidgetFiltersOnboardingDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LocationsSearch.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final LocationContent[] newArray(int i12) {
            return new LocationContent[i12];
        }
    }

    public LocationContent(@l List<RecentSearch> list, @l Boolean bool, @l WidgetFiltersOnboardingDto widgetFiltersOnboardingDto, @l LocationsSearch locationsSearch) {
        this.recentSearches = list;
        this.showFastRecentSearches = bool;
        this.fastRecentSearchesOnboarding = widgetFiltersOnboardingDto;
        this.locationsSearch = locationsSearch;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final WidgetFiltersOnboardingDto getFastRecentSearchesOnboarding() {
        return this.fastRecentSearchesOnboarding;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final LocationsSearch getLocationsSearch() {
        return this.locationsSearch;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<RecentSearch> e() {
        return this.recentSearches;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationContent)) {
            return false;
        }
        LocationContent locationContent = (LocationContent) obj;
        return L.f(this.recentSearches, locationContent.recentSearches) && L.f(this.showFastRecentSearches, locationContent.showFastRecentSearches) && L.f(this.fastRecentSearchesOnboarding, locationContent.fastRecentSearchesOnboarding) && L.f(this.locationsSearch, locationContent.locationsSearch);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Boolean getShowFastRecentSearches() {
        return this.showFastRecentSearches;
    }

    public final int hashCode() {
        List<RecentSearch> list = this.recentSearches;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.showFastRecentSearches;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        WidgetFiltersOnboardingDto widgetFiltersOnboardingDto = this.fastRecentSearchesOnboarding;
        int iHashCode3 = (iHashCode2 + (widgetFiltersOnboardingDto == null ? 0 : widgetFiltersOnboardingDto.hashCode())) * 31;
        LocationsSearch locationsSearch = this.locationsSearch;
        return iHashCode3 + (locationsSearch != null ? locationsSearch.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "LocationContent(recentSearches=" + this.recentSearches + ", showFastRecentSearches=" + this.showFastRecentSearches + ", fastRecentSearchesOnboarding=" + this.fastRecentSearchesOnboarding + ", locationsSearch=" + this.locationsSearch + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<RecentSearch> list = this.recentSearches;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((RecentSearch) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Boolean bool = this.showFastRecentSearches;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        WidgetFiltersOnboardingDto widgetFiltersOnboardingDto = this.fastRecentSearchesOnboarding;
        if (widgetFiltersOnboardingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widgetFiltersOnboardingDto.writeToParcel(parcel, i12);
        }
        LocationsSearch locationsSearch = this.locationsSearch;
        if (locationsSearch == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            locationsSearch.writeToParcel(parcel, i12);
        }
    }
}
