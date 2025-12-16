package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.AddressesSearchParameter;
import com.avito.android.remote.model.category_parameters.BeduinParameter;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.GuestsSelectParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.QuartersParameter;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InlineFilters.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/search/WidgetType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Shortcut", "Select", "Multiselect", "NumericRange", "Calendar", "Checkbox", "Segmented", "Suggest", "SearchRadius", "Coordinates", "RadioSelect", "Group", "Location", "Radius", "Chips", "Metro", "Boolean", "District", "Direction", "AllFilters", "CategoryNodes", "AvitoBlackCategoryNodes", "ProfileCategoryNodes", "SectionedMultiselect", "Beduin", "SearchSubscription", "Quarters", "Addresses", "GuestsSelect", "SuggestLocation", "LocalPriority", "CategoryWithParams", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WidgetType implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WidgetType[] $VALUES;

    @k
    public static final Parcelable.Creator<WidgetType> CREATOR;

    @c("shortcut")
    public static final WidgetType Shortcut = new WidgetType("Shortcut", 0);

    @c("select")
    public static final WidgetType Select = new WidgetType("Select", 1);

    @c("multiselect")
    public static final WidgetType Multiselect = new WidgetType("Multiselect", 2);

    @c("numericRange")
    public static final WidgetType NumericRange = new WidgetType("NumericRange", 3);

    @c(DateRangeParameter.FormattedDateParameter.TYPE)
    public static final WidgetType Calendar = new WidgetType("Calendar", 4);

    @c("checkbox")
    public static final WidgetType Checkbox = new WidgetType("Checkbox", 5);

    @c("segmented")
    public static final WidgetType Segmented = new WidgetType("Segmented", 6);

    @c("suggest")
    public static final WidgetType Suggest = new WidgetType("Suggest", 7);

    @c("searchRadius")
    public static final WidgetType SearchRadius = new WidgetType("SearchRadius", 8);

    @c(ServiceTransportationWidget.LocationField.COORDINATES)
    public static final WidgetType Coordinates = new WidgetType("Coordinates", 9);

    @c("radioSelect")
    public static final WidgetType RadioSelect = new WidgetType("RadioSelect", 10);

    @c("group")
    public static final WidgetType Group = new WidgetType("Group", 11);

    @c("location")
    public static final WidgetType Location = new WidgetType("Location", 12);

    @c("radius")
    public static final WidgetType Radius = new WidgetType("Radius", 13);

    @c("chips")
    public static final WidgetType Chips = new WidgetType("Chips", 14);

    @c(MetroParameter.TYPE)
    public static final WidgetType Metro = new WidgetType("Metro", 15);

    @c(BooleanParameter.TYPE)
    public static final WidgetType Boolean = new WidgetType("Boolean", 16);

    @c(DistrictParameter.TYPE)
    public static final WidgetType District = new WidgetType("District", 17);

    @c("direction")
    public static final WidgetType Direction = new WidgetType("Direction", 18);

    @c("allFilters")
    public static final WidgetType AllFilters = new WidgetType("AllFilters", 19);

    @c("categoryNodes")
    public static final WidgetType CategoryNodes = new WidgetType("CategoryNodes", 20);

    @c("avitoBlackCategoryNodes")
    public static final WidgetType AvitoBlackCategoryNodes = new WidgetType("AvitoBlackCategoryNodes", 21);

    @c("profileCategoryNodes")
    public static final WidgetType ProfileCategoryNodes = new WidgetType("ProfileCategoryNodes", 22);

    @c(SectionedMultiselectParameter.TYPE)
    public static final WidgetType SectionedMultiselect = new WidgetType("SectionedMultiselect", 23);

    @c(BeduinParameter.TYPE)
    public static final WidgetType Beduin = new WidgetType("Beduin", 24);

    @c("searchSubscription")
    public static final WidgetType SearchSubscription = new WidgetType("SearchSubscription", 25);

    @c(QuartersParameter.TYPE)
    public static final WidgetType Quarters = new WidgetType("Quarters", 26);

    @c(AddressesSearchParameter.TYPE)
    public static final WidgetType Addresses = new WidgetType("Addresses", 27);

    @c(GuestsSelectParameter.TYPE)
    public static final WidgetType GuestsSelect = new WidgetType("GuestsSelect", 28);

    @c("suggestLocation")
    public static final WidgetType SuggestLocation = new WidgetType("SuggestLocation", 29);

    @c("localPriority")
    public static final WidgetType LocalPriority = new WidgetType("LocalPriority", 30);

    @c("categoryWithParams")
    public static final WidgetType CategoryWithParams = new WidgetType("CategoryWithParams", 31);

    private static final /* synthetic */ WidgetType[] $values() {
        return new WidgetType[]{Shortcut, Select, Multiselect, NumericRange, Calendar, Checkbox, Segmented, Suggest, SearchRadius, Coordinates, RadioSelect, Group, Location, Radius, Chips, Metro, Boolean, District, Direction, AllFilters, CategoryNodes, AvitoBlackCategoryNodes, ProfileCategoryNodes, SectionedMultiselect, Beduin, SearchSubscription, Quarters, Addresses, GuestsSelect, SuggestLocation, LocalPriority, CategoryWithParams};
    }

    static {
        WidgetType[] widgetTypeArr$values = $values();
        $VALUES = widgetTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(widgetTypeArr$values);
        CREATOR = new Parcelable.Creator<WidgetType>() { // from class: com.avito.android.remote.model.search.WidgetType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WidgetType createFromParcel(@k Parcel parcel) {
                return WidgetType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WidgetType[] newArray(int i12) {
                return new WidgetType[i12];
            }
        };
    }

    private WidgetType(String str, int i12) {
    }

    @k
    public static a<WidgetType> getEntries() {
        return $ENTRIES;
    }

    public static WidgetType valueOf(String str) {
        return (WidgetType) Enum.valueOf(WidgetType.class, str);
    }

    public static WidgetType[] values() {
        return (WidgetType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(name());
    }
}
