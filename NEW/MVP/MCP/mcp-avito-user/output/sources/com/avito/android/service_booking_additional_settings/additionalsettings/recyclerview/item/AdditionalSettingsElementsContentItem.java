package com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: AdditionalSettingsElementsContentItem.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "AdditionalSettingsElementBookingToggle", "AdditionalSettingsElementSheetTimeGap", "AdditionalSettingsElementType", "AdditionalSettingsElementsSpecific", "AdditionalSettingsTechBreakItem", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AdditionalSettingsElementsContentItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AdditionalSettingsElementsContentItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AdditionalSettingsElementType f275036b;

    /* renamed from: c, reason: collision with root package name */
    public final int f275037c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f275038d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f275039e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AdditionalSettingsElementsSpecific f275040f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f275041g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f275042h;

    /* compiled from: AdditionalSettingsElementsContentItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem$AdditionalSettingsElementBookingToggle;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem$AdditionalSettingsElementsSpecific;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdditionalSettingsElementBookingToggle implements AdditionalSettingsElementsSpecific {

        @k
        public static final Parcelable.Creator<AdditionalSettingsElementBookingToggle> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Boolean f275043b;

        /* compiled from: AdditionalSettingsElementsContentItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdditionalSettingsElementBookingToggle> {
            @Override // android.os.Parcelable.Creator
            public final AdditionalSettingsElementBookingToggle createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new AdditionalSettingsElementBookingToggle(boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final AdditionalSettingsElementBookingToggle[] newArray(int i12) {
                return new AdditionalSettingsElementBookingToggle[i12];
            }
        }

        public AdditionalSettingsElementBookingToggle(@l Boolean bool) {
            this.f275043b = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AdditionalSettingsElementBookingToggle) && L.f(this.f275043b, ((AdditionalSettingsElementBookingToggle) obj).f275043b);
        }

        public final int hashCode() {
            Boolean bool = this.f275043b;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @k
        public final String toString() {
            return C0.g(new StringBuilder("AdditionalSettingsElementBookingToggle(value="), this.f275043b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Boolean bool = this.f275043b;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: AdditionalSettingsElementsContentItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem$AdditionalSettingsElementSheetTimeGap;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem$AdditionalSettingsElementsSpecific;", "AdditionalSettingsElementOption", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AdditionalSettingsElementSheetTimeGap implements AdditionalSettingsElementsSpecific {

        @k
        public static final Parcelable.Creator<AdditionalSettingsElementSheetTimeGap> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f275044b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f275045c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f275046d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f275047e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final ArrayList f275048f;

        /* compiled from: AdditionalSettingsElementsContentItem.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem$AdditionalSettingsElementSheetTimeGap$AdditionalSettingsElementOption;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class AdditionalSettingsElementOption implements ParcelableEntity<String> {

            @k
            public static final Parcelable.Creator<AdditionalSettingsElementOption> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f275049b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f275050c;

            /* compiled from: AdditionalSettingsElementsContentItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AdditionalSettingsElementOption> {
                @Override // android.os.Parcelable.Creator
                public final AdditionalSettingsElementOption createFromParcel(Parcel parcel) {
                    return new AdditionalSettingsElementOption(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AdditionalSettingsElementOption[] newArray(int i12) {
                    return new AdditionalSettingsElementOption[i12];
                }
            }

            public AdditionalSettingsElementOption(@l String str, @k String str2) {
                this.f275049b = str;
                this.f275050c = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AdditionalSettingsElementOption)) {
                    return false;
                }
                AdditionalSettingsElementOption additionalSettingsElementOption = (AdditionalSettingsElementOption) obj;
                return L.f(this.f275049b, additionalSettingsElementOption.f275049b) && L.f(this.f275050c, additionalSettingsElementOption.f275050c);
            }

            @Override // com.avito.android.remote.model.Entity
            public final Object getId() {
                return this.f275050c;
            }

            @Override // com.avito.android.remote.model.Entity
            @l
            /* renamed from: getName, reason: from getter */
            public final String getF282831b() {
                return this.f275049b;
            }

            public final int hashCode() {
                String str = this.f275049b;
                return this.f275050c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AdditionalSettingsElementOption(name=");
                sb2.append(this.f275049b);
                sb2.append(", id=");
                return C22026a.c(sb2, this.f275050c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f275049b);
                parcel.writeString(this.f275050c);
            }
        }

        /* compiled from: AdditionalSettingsElementsContentItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdditionalSettingsElementSheetTimeGap> {
            @Override // android.os.Parcelable.Creator
            public final AdditionalSettingsElementSheetTimeGap createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                int iC2 = 0;
                ArrayList arrayList = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(AdditionalSettingsElementOption.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                return new AdditionalSettingsElementSheetTimeGap(string, boolValueOf, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AdditionalSettingsElementSheetTimeGap[] newArray(int i12) {
                return new AdditionalSettingsElementSheetTimeGap[i12];
            }
        }

        public AdditionalSettingsElementSheetTimeGap(@l String str, @l Boolean bool, @l String str2, @l String str3, @l ArrayList arrayList) {
            this.f275044b = str;
            this.f275045c = bool;
            this.f275046d = str2;
            this.f275047e = str3;
            this.f275048f = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdditionalSettingsElementSheetTimeGap)) {
                return false;
            }
            AdditionalSettingsElementSheetTimeGap additionalSettingsElementSheetTimeGap = (AdditionalSettingsElementSheetTimeGap) obj;
            return L.f(this.f275044b, additionalSettingsElementSheetTimeGap.f275044b) && L.f(this.f275045c, additionalSettingsElementSheetTimeGap.f275045c) && L.f(this.f275046d, additionalSettingsElementSheetTimeGap.f275046d) && L.f(this.f275047e, additionalSettingsElementSheetTimeGap.f275047e) && L.f(this.f275048f, additionalSettingsElementSheetTimeGap.f275048f);
        }

        public final int hashCode() {
            String str = this.f275044b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f275045c;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.f275046d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f275047e;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ArrayList arrayList = this.f275048f;
            return iHashCode4 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdditionalSettingsElementSheetTimeGap(value=");
            sb2.append(this.f275044b);
            sb2.append(", hasCloseButton=");
            sb2.append(this.f275045c);
            sb2.append(", resetTitle=");
            sb2.append(this.f275046d);
            sb2.append(", bottomSheetTitle=");
            sb2.append(this.f275047e);
            sb2.append(", options=");
            return e.p(sb2, this.f275048f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f275044b);
            Boolean bool = this.f275045c;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.f275046d);
            parcel.writeString(this.f275047e);
            ArrayList arrayList = this.f275048f;
            if (arrayList == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((AdditionalSettingsElementOption) itY.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdditionalSettingsElementsContentItem.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem$AdditionalSettingsElementType;", "", "Landroid/os/Parcelable;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class AdditionalSettingsElementType implements Parcelable {

        @k
        public static final Parcelable.Creator<AdditionalSettingsElementType> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        public static final AdditionalSettingsElementType f275051b;

        /* renamed from: c, reason: collision with root package name */
        public static final AdditionalSettingsElementType f275052c;

        /* renamed from: d, reason: collision with root package name */
        public static final AdditionalSettingsElementType f275053d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AdditionalSettingsElementType[] f275054e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f275055f;

        /* compiled from: AdditionalSettingsElementsContentItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdditionalSettingsElementType> {
            @Override // android.os.Parcelable.Creator
            public final AdditionalSettingsElementType createFromParcel(Parcel parcel) {
                return AdditionalSettingsElementType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AdditionalSettingsElementType[] newArray(int i12) {
                return new AdditionalSettingsElementType[i12];
            }
        }

        static {
            AdditionalSettingsElementType additionalSettingsElementType = new AdditionalSettingsElementType("BOOKING_TOGGLE", 0);
            f275051b = additionalSettingsElementType;
            AdditionalSettingsElementType additionalSettingsElementType2 = new AdditionalSettingsElementType("BOTTOM_SHEET_TIME_GAP", 1);
            f275052c = additionalSettingsElementType2;
            AdditionalSettingsElementType additionalSettingsElementType3 = new AdditionalSettingsElementType("BOTTOM_SHEET_TECH_BREAK", 2);
            f275053d = additionalSettingsElementType3;
            AdditionalSettingsElementType[] additionalSettingsElementTypeArr = {additionalSettingsElementType, additionalSettingsElementType2, additionalSettingsElementType3};
            f275054e = additionalSettingsElementTypeArr;
            f275055f = c.a(additionalSettingsElementTypeArr);
            CREATOR = new a();
        }

        public AdditionalSettingsElementType() {
            throw null;
        }

        public static AdditionalSettingsElementType valueOf(String str) {
            return (AdditionalSettingsElementType) Enum.valueOf(AdditionalSettingsElementType.class, str);
        }

        public static AdditionalSettingsElementType[] values() {
            return (AdditionalSettingsElementType[]) f275054e.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AdditionalSettingsElementsContentItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem$AdditionalSettingsElementsSpecific;", "Landroid/os/Parcelable;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface AdditionalSettingsElementsSpecific extends Parcelable {
    }

    /* compiled from: AdditionalSettingsElementsContentItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem$AdditionalSettingsTechBreakItem;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem$AdditionalSettingsElementsSpecific;", "TechBreakBadgeItem", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AdditionalSettingsTechBreakItem implements AdditionalSettingsElementsSpecific {

        @k
        public static final Parcelable.Creator<AdditionalSettingsTechBreakItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f275056b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f275057c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f275058d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f275059e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final ArrayList f275060f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final TechBreakBadgeItem f275061g;

        /* compiled from: AdditionalSettingsElementsContentItem.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem$AdditionalSettingsTechBreakItem$TechBreakBadgeItem;", "Landroid/os/Parcelable;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TechBreakBadgeItem implements Parcelable {

            @k
            public static final Parcelable.Creator<TechBreakBadgeItem> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f275062b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f275063c;

            /* compiled from: AdditionalSettingsElementsContentItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<TechBreakBadgeItem> {
                @Override // android.os.Parcelable.Creator
                public final TechBreakBadgeItem createFromParcel(Parcel parcel) {
                    return new TechBreakBadgeItem(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TechBreakBadgeItem[] newArray(int i12) {
                    return new TechBreakBadgeItem[i12];
                }
            }

            public TechBreakBadgeItem(@k String str, @l String str2) {
                this.f275062b = str;
                this.f275063c = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TechBreakBadgeItem)) {
                    return false;
                }
                TechBreakBadgeItem techBreakBadgeItem = (TechBreakBadgeItem) obj;
                return L.f(this.f275062b, techBreakBadgeItem.f275062b) && L.f(this.f275063c, techBreakBadgeItem.f275063c);
            }

            public final int hashCode() {
                int iHashCode = this.f275062b.hashCode() * 31;
                String str = this.f275063c;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("TechBreakBadgeItem(badgeStyle=");
                sb2.append(this.f275062b);
                sb2.append(", text=");
                return C22026a.c(sb2, this.f275063c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f275062b);
                parcel.writeString(this.f275063c);
            }
        }

        /* compiled from: AdditionalSettingsElementsContentItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdditionalSettingsTechBreakItem> {
            @Override // android.os.Parcelable.Creator
            public final AdditionalSettingsTechBreakItem createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                ArrayList arrayList;
                String string = parcel.readString();
                int iC2 = 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(AdditionalSettingsElementSheetTimeGap.AdditionalSettingsElementOption.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                return new AdditionalSettingsTechBreakItem(string, boolValueOf, string2, string3, arrayList, parcel.readInt() != 0 ? TechBreakBadgeItem.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AdditionalSettingsTechBreakItem[] newArray(int i12) {
                return new AdditionalSettingsTechBreakItem[i12];
            }
        }

        public AdditionalSettingsTechBreakItem(@l String str, @l Boolean bool, @l String str2, @k String str3, @l ArrayList arrayList, @l TechBreakBadgeItem techBreakBadgeItem) {
            this.f275056b = str;
            this.f275057c = bool;
            this.f275058d = str2;
            this.f275059e = str3;
            this.f275060f = arrayList;
            this.f275061g = techBreakBadgeItem;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdditionalSettingsTechBreakItem)) {
                return false;
            }
            AdditionalSettingsTechBreakItem additionalSettingsTechBreakItem = (AdditionalSettingsTechBreakItem) obj;
            return L.f(this.f275056b, additionalSettingsTechBreakItem.f275056b) && L.f(this.f275057c, additionalSettingsTechBreakItem.f275057c) && L.f(this.f275058d, additionalSettingsTechBreakItem.f275058d) && L.f(this.f275059e, additionalSettingsTechBreakItem.f275059e) && L.f(this.f275060f, additionalSettingsTechBreakItem.f275060f) && L.f(this.f275061g, additionalSettingsTechBreakItem.f275061g);
        }

        public final int hashCode() {
            String str = this.f275056b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f275057c;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.f275058d;
            int iD2 = H.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f275059e);
            ArrayList arrayList = this.f275060f;
            int iHashCode3 = (iD2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            TechBreakBadgeItem techBreakBadgeItem = this.f275061g;
            return iHashCode3 + (techBreakBadgeItem != null ? techBreakBadgeItem.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "AdditionalSettingsTechBreakItem(value=" + this.f275056b + ", hasCloseButton=" + this.f275057c + ", bottomSheetTitle=" + this.f275058d + ", bottomSheetDescription=" + this.f275059e + ", options=" + this.f275060f + ", badge=" + this.f275061g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f275056b);
            Boolean bool = this.f275057c;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.f275058d);
            parcel.writeString(this.f275059e);
            ArrayList arrayList = this.f275060f;
            if (arrayList == null) {
                parcel.writeInt(0);
            } else {
                Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
                while (itY.hasNext()) {
                    ((AdditionalSettingsElementSheetTimeGap.AdditionalSettingsElementOption) itY.next()).writeToParcel(parcel, i12);
                }
            }
            TechBreakBadgeItem techBreakBadgeItem = this.f275061g;
            if (techBreakBadgeItem == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                techBreakBadgeItem.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: AdditionalSettingsElementsContentItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdditionalSettingsElementsContentItem> {
        @Override // android.os.Parcelable.Creator
        public final AdditionalSettingsElementsContentItem createFromParcel(Parcel parcel) {
            return new AdditionalSettingsElementsContentItem(parcel.readInt() == 0 ? null : AdditionalSettingsElementType.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString(), (AdditionalSettingsElementsSpecific) parcel.readParcelable(AdditionalSettingsElementsContentItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalSettingsElementsContentItem[] newArray(int i12) {
            return new AdditionalSettingsElementsContentItem[i12];
        }
    }

    public AdditionalSettingsElementsContentItem(@l AdditionalSettingsElementType additionalSettingsElementType, @InterfaceC42165v int i12, @l String str, @l String str2, @k AdditionalSettingsElementsSpecific additionalSettingsElementsSpecific, boolean z12, @k String str3) {
        this.f275036b = additionalSettingsElementType;
        this.f275037c = i12;
        this.f275038d = str;
        this.f275039e = str2;
        this.f275040f = additionalSettingsElementsSpecific;
        this.f275041g = z12;
        this.f275042h = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalSettingsElementsContentItem)) {
            return false;
        }
        AdditionalSettingsElementsContentItem additionalSettingsElementsContentItem = (AdditionalSettingsElementsContentItem) obj;
        return this.f275036b == additionalSettingsElementsContentItem.f275036b && this.f275037c == additionalSettingsElementsContentItem.f275037c && L.f(this.f275038d, additionalSettingsElementsContentItem.f275038d) && L.f(this.f275039e, additionalSettingsElementsContentItem.f275039e) && L.f(this.f275040f, additionalSettingsElementsContentItem.f275040f) && this.f275041g == additionalSettingsElementsContentItem.f275041g && L.f(this.f275042h, additionalSettingsElementsContentItem.f275042h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF275674b() {
        return this.f275042h;
    }

    public final int hashCode() {
        AdditionalSettingsElementType additionalSettingsElementType = this.f275036b;
        int iE2 = r.e(this.f275037c, (additionalSettingsElementType == null ? 0 : additionalSettingsElementType.hashCode()) * 31, 31);
        String str = this.f275038d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f275039e;
        return this.f275042h.hashCode() + r.i((this.f275040f.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.f275041g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdditionalSettingsElementsContentItem(type=");
        sb2.append(this.f275036b);
        sb2.append(", elementIconRes=");
        sb2.append(this.f275037c);
        sb2.append(", elementTitle=");
        sb2.append(this.f275038d);
        sb2.append(", elementSubtitle=");
        sb2.append(this.f275039e);
        sb2.append(", elementsSpecificParams=");
        sb2.append(this.f275040f);
        sb2.append(", blockEnabled=");
        sb2.append(this.f275041g);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f275042h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        AdditionalSettingsElementType additionalSettingsElementType = this.f275036b;
        if (additionalSettingsElementType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            additionalSettingsElementType.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f275037c);
        parcel.writeString(this.f275038d);
        parcel.writeString(this.f275039e);
        parcel.writeParcelable(this.f275040f, i12);
        parcel.writeInt(this.f275041g ? 1 : 0);
        parcel.writeString(this.f275042h);
    }
}
