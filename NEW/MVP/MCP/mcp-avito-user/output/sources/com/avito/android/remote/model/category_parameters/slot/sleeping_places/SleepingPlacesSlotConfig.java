package com.avito.android.remote.model.category_parameters.slot.sleeping_places;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SleepingPlacesSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ`\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b&\u0010!J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b\u0007\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001b¨\u00068"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "title", "subtitle", "addActionText", "", "isNew", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesBottomSheetData;", "selectBottomSheet", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesRules;", "validationRules", "Lcom/avito/android/remote/model/category_parameters/ObjectsParameter;", "selectedBedTypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesBottomSheetData;Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesRules;Lcom/avito/android/remote/model/category_parameters/ObjectsParameter;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "()Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesBottomSheetData;", "component6", "()Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesRules;", "component7", "()Lcom/avito/android/remote/model/category_parameters/ObjectsParameter;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesBottomSheetData;Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesRules;Lcom/avito/android/remote/model/category_parameters/ObjectsParameter;)Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesSlotConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getAddActionText", "Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesBottomSheetData;", "getSelectBottomSheet", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesRules;", "getValidationRules", "Lcom/avito/android/remote/model/category_parameters/ObjectsParameter;", "getSelectedBedTypes", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SleepingPlacesSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<SleepingPlacesSlotConfig> CREATOR = new Creator();

    @c("addActionText")
    @l
    private final String addActionText;

    @c("isNew")
    @l
    private final Boolean isNew;

    @c("selectBottomSheet")
    @k
    private final SleepingPlacesBottomSheetData selectBottomSheet;

    @c("selectedBedTypes")
    @l
    private final ObjectsParameter selectedBedTypes;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    @c("validationRules")
    @k
    private final SleepingPlacesRules validationRules;

    /* compiled from: SleepingPlacesSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SleepingPlacesSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SleepingPlacesSlotConfig createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SleepingPlacesSlotConfig(string, string2, string3, boolValueOf, SleepingPlacesBottomSheetData.CREATOR.createFromParcel(parcel), SleepingPlacesRules.CREATOR.createFromParcel(parcel), (ObjectsParameter) parcel.readParcelable(SleepingPlacesSlotConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SleepingPlacesSlotConfig[] newArray(int i12) {
            return new SleepingPlacesSlotConfig[i12];
        }
    }

    public SleepingPlacesSlotConfig(@l String str, @l String str2, @l String str3, @l Boolean bool, @k SleepingPlacesBottomSheetData sleepingPlacesBottomSheetData, @k SleepingPlacesRules sleepingPlacesRules, @l ObjectsParameter objectsParameter) {
        this.title = str;
        this.subtitle = str2;
        this.addActionText = str3;
        this.isNew = bool;
        this.selectBottomSheet = sleepingPlacesBottomSheetData;
        this.validationRules = sleepingPlacesRules;
        this.selectedBedTypes = objectsParameter;
    }

    public static /* synthetic */ SleepingPlacesSlotConfig copy$default(SleepingPlacesSlotConfig sleepingPlacesSlotConfig, String str, String str2, String str3, Boolean bool, SleepingPlacesBottomSheetData sleepingPlacesBottomSheetData, SleepingPlacesRules sleepingPlacesRules, ObjectsParameter objectsParameter, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = sleepingPlacesSlotConfig.title;
        }
        if ((i12 & 2) != 0) {
            str2 = sleepingPlacesSlotConfig.subtitle;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = sleepingPlacesSlotConfig.addActionText;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            bool = sleepingPlacesSlotConfig.isNew;
        }
        Boolean bool2 = bool;
        if ((i12 & 16) != 0) {
            sleepingPlacesBottomSheetData = sleepingPlacesSlotConfig.selectBottomSheet;
        }
        SleepingPlacesBottomSheetData sleepingPlacesBottomSheetData2 = sleepingPlacesBottomSheetData;
        if ((i12 & 32) != 0) {
            sleepingPlacesRules = sleepingPlacesSlotConfig.validationRules;
        }
        SleepingPlacesRules sleepingPlacesRules2 = sleepingPlacesRules;
        if ((i12 & 64) != 0) {
            objectsParameter = sleepingPlacesSlotConfig.selectedBedTypes;
        }
        return sleepingPlacesSlotConfig.copy(str, str4, str5, bool2, sleepingPlacesBottomSheetData2, sleepingPlacesRules2, objectsParameter);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getAddActionText() {
        return this.addActionText;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsNew() {
        return this.isNew;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final SleepingPlacesBottomSheetData getSelectBottomSheet() {
        return this.selectBottomSheet;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final SleepingPlacesRules getValidationRules() {
        return this.validationRules;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final ObjectsParameter getSelectedBedTypes() {
        return this.selectedBedTypes;
    }

    @k
    public final SleepingPlacesSlotConfig copy(@l String title, @l String subtitle, @l String addActionText, @l Boolean isNew, @k SleepingPlacesBottomSheetData selectBottomSheet, @k SleepingPlacesRules validationRules, @l ObjectsParameter selectedBedTypes) {
        return new SleepingPlacesSlotConfig(title, subtitle, addActionText, isNew, selectBottomSheet, validationRules, selectedBedTypes);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepingPlacesSlotConfig)) {
            return false;
        }
        SleepingPlacesSlotConfig sleepingPlacesSlotConfig = (SleepingPlacesSlotConfig) other;
        return L.f(this.title, sleepingPlacesSlotConfig.title) && L.f(this.subtitle, sleepingPlacesSlotConfig.subtitle) && L.f(this.addActionText, sleepingPlacesSlotConfig.addActionText) && L.f(this.isNew, sleepingPlacesSlotConfig.isNew) && L.f(this.selectBottomSheet, sleepingPlacesSlotConfig.selectBottomSheet) && L.f(this.validationRules, sleepingPlacesSlotConfig.validationRules) && L.f(this.selectedBedTypes, sleepingPlacesSlotConfig.selectedBedTypes);
    }

    @l
    public final String getAddActionText() {
        return this.addActionText;
    }

    @k
    public final SleepingPlacesBottomSheetData getSelectBottomSheet() {
        return this.selectBottomSheet;
    }

    @l
    public final ObjectsParameter getSelectedBedTypes() {
        return this.selectedBedTypes;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @k
    public final SleepingPlacesRules getValidationRules() {
        return this.validationRules;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addActionText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isNew;
        int iHashCode4 = (this.validationRules.hashCode() + ((this.selectBottomSheet.hashCode() + ((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        ObjectsParameter objectsParameter = this.selectedBedTypes;
        return iHashCode4 + (objectsParameter != null ? objectsParameter.hashCode() : 0);
    }

    @l
    public final Boolean isNew() {
        return this.isNew;
    }

    @k
    public String toString() {
        return "SleepingPlacesSlotConfig(title=" + this.title + ", subtitle=" + this.subtitle + ", addActionText=" + this.addActionText + ", isNew=" + this.isNew + ", selectBottomSheet=" + this.selectBottomSheet + ", validationRules=" + this.validationRules + ", selectedBedTypes=" + this.selectedBedTypes + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.addActionText);
        Boolean bool = this.isNew;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        this.selectBottomSheet.writeToParcel(parcel, flags);
        this.validationRules.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.selectedBedTypes, flags);
    }
}
