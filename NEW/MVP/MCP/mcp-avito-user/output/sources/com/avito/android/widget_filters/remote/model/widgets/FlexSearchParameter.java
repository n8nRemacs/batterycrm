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

/* compiled from: WidgetFiltersDatesWidget.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/FlexSearchParameter;", "Landroid/os/Parcelable;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersContentParameter;", "", "id", "", "isRequired", "updatesForm", "isVisible", "notSelectedErrorText", "", "defaultValue", "", "Lcom/avito/android/widget_filters/remote/model/widgets/FlexSearchOption;", "values", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersOnboardingDto;", "onboarding", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersOnboardingDto;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "f", "i", "d", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Ljava/util/List;", "g", "()Ljava/util/List;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersOnboardingDto;", "e", "()Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersOnboardingDto;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FlexSearchParameter implements Parcelable, WidgetFiltersContentParameter {

    @k
    public static final Parcelable.Creator<FlexSearchParameter> CREATOR = new a();

    @c("defaultValue")
    @l
    private final Integer defaultValue;

    @c("id")
    @l
    private final String id;

    @c("isRequired")
    @l
    private final Boolean isRequired;

    @c("isVisible")
    @l
    private final Boolean isVisible;

    @c("notSelectedErrorText")
    @l
    private final String notSelectedErrorText;

    @c("onBoarding")
    @l
    private final WidgetFiltersOnboardingDto onboarding;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("values")
    @l
    private final List<FlexSearchOption> values;

    /* compiled from: WidgetFiltersDatesWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexSearchParameter> {
        @Override // android.os.Parcelable.Creator
        public final FlexSearchParameter createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            ArrayList arrayList;
            String string = parcel.readString();
            int iC2 = 0;
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
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(FlexSearchOption.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new FlexSearchParameter(string, boolValueOf, boolValueOf2, boolValueOf3, string2, numValueOf, arrayList, parcel.readInt() != 0 ? WidgetFiltersOnboardingDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexSearchParameter[] newArray(int i12) {
            return new FlexSearchParameter[i12];
        }
    }

    public FlexSearchParameter(@l String str, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l String str2, @l Integer num, @l List<FlexSearchOption> list, @l WidgetFiltersOnboardingDto widgetFiltersOnboardingDto) {
        this.id = str;
        this.isRequired = bool;
        this.updatesForm = bool2;
        this.isVisible = bool3;
        this.notSelectedErrorText = str2;
        this.defaultValue = num;
        this.values = list;
        this.onboarding = widgetFiltersOnboardingDto;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getDefaultValue() {
        return this.defaultValue;
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

    @l
    /* renamed from: e, reason: from getter */
    public final WidgetFiltersOnboardingDto getOnboarding() {
        return this.onboarding;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexSearchParameter)) {
            return false;
        }
        FlexSearchParameter flexSearchParameter = (FlexSearchParameter) obj;
        return L.f(this.id, flexSearchParameter.id) && L.f(this.isRequired, flexSearchParameter.isRequired) && L.f(this.updatesForm, flexSearchParameter.updatesForm) && L.f(this.isVisible, flexSearchParameter.isVisible) && L.f(this.notSelectedErrorText, flexSearchParameter.notSelectedErrorText) && L.f(this.defaultValue, flexSearchParameter.defaultValue) && L.f(this.values, flexSearchParameter.values) && L.f(this.onboarding, flexSearchParameter.onboarding);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    public final List<FlexSearchOption> g() {
        return this.values;
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
        Integer num = this.defaultValue;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<FlexSearchOption> list = this.values;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        WidgetFiltersOnboardingDto widgetFiltersOnboardingDto = this.onboarding;
        return iHashCode7 + (widgetFiltersOnboardingDto != null ? widgetFiltersOnboardingDto.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }

    @k
    public final String toString() {
        return "FlexSearchParameter(id=" + this.id + ", isRequired=" + this.isRequired + ", updatesForm=" + this.updatesForm + ", isVisible=" + this.isVisible + ", notSelectedErrorText=" + this.notSelectedErrorText + ", defaultValue=" + this.defaultValue + ", values=" + this.values + ", onboarding=" + this.onboarding + ')';
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
        Integer num = this.defaultValue;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        List<FlexSearchOption> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((FlexSearchOption) itA.next()).writeToParcel(parcel, i12);
            }
        }
        WidgetFiltersOnboardingDto widgetFiltersOnboardingDto = this.onboarding;
        if (widgetFiltersOnboardingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widgetFiltersOnboardingDto.writeToParcel(parcel, i12);
        }
    }
}
