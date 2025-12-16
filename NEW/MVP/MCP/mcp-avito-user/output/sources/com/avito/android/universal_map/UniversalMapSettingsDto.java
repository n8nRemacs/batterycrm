package com.avito.android.universal_map;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalMapSettingsDto.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0003*+,B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006-"}, d2 = {"Lcom/avito/android/universal_map/UniversalMapSettingsDto;", "Landroid/os/Parcelable;", "Lcom/avito/android/universal_map/UniversalMapSettingsDto$LocationSettings;", "location", "Lcom/avito/android/universal_map/UniversalMapSettingsDto$BeduinForm;", "beduinForm", "Lcom/avito/android/universal_map/UniversalMapSettingsDto$PointInfoBottomSheetSettings;", "pointInfoBottomSheetSettings", "<init>", "(Lcom/avito/android/universal_map/UniversalMapSettingsDto$LocationSettings;Lcom/avito/android/universal_map/UniversalMapSettingsDto$BeduinForm;Lcom/avito/android/universal_map/UniversalMapSettingsDto$PointInfoBottomSheetSettings;)V", "component1", "()Lcom/avito/android/universal_map/UniversalMapSettingsDto$LocationSettings;", "component2", "()Lcom/avito/android/universal_map/UniversalMapSettingsDto$BeduinForm;", "component3", "()Lcom/avito/android/universal_map/UniversalMapSettingsDto$PointInfoBottomSheetSettings;", "copy", "(Lcom/avito/android/universal_map/UniversalMapSettingsDto$LocationSettings;Lcom/avito/android/universal_map/UniversalMapSettingsDto$BeduinForm;Lcom/avito/android/universal_map/UniversalMapSettingsDto$PointInfoBottomSheetSettings;)Lcom/avito/android/universal_map/UniversalMapSettingsDto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/universal_map/UniversalMapSettingsDto$LocationSettings;", "getLocation", "Lcom/avito/android/universal_map/UniversalMapSettingsDto$BeduinForm;", "getBeduinForm", "Lcom/avito/android/universal_map/UniversalMapSettingsDto$PointInfoBottomSheetSettings;", "getPointInfoBottomSheetSettings", "BeduinForm", "LocationSettings", "PointInfoBottomSheetSettings", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UniversalMapSettingsDto implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<UniversalMapSettingsDto> CREATOR = new a();

    @Y61.l
    private final BeduinForm beduinForm;

    @Y61.l
    private final LocationSettings location;

    @Y61.l
    private final PointInfoBottomSheetSettings pointInfoBottomSheetSettings;

    /* compiled from: UniversalMapSettingsDto.kt */
    @Keep
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/universal_map/UniversalMapSettingsDto$BeduinForm;", "Landroid/os/Parcelable;", "", "topMapFormId", "", "Lcom/avito/android/beduin_models/BeduinModel;", "topMapComponents", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/universal_map/UniversalMapSettingsDto$BeduinForm;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTopMapFormId", "Ljava/util/List;", "getTopMapComponents", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class BeduinForm implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<BeduinForm> CREATOR = new a();

        @Y61.l
        private final List<BeduinModel> topMapComponents;

        @Y61.l
        private final String topMapFormId;

        /* compiled from: UniversalMapSettingsDto.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BeduinForm> {
            @Override // android.os.Parcelable.Creator
            public final BeduinForm createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(BeduinForm.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new BeduinForm(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final BeduinForm[] newArray(int i12) {
                return new BeduinForm[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BeduinForm(@Y61.l String str, @Y61.l List<? extends BeduinModel> list) {
            this.topMapFormId = str;
            this.topMapComponents = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BeduinForm copy$default(BeduinForm beduinForm, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = beduinForm.topMapFormId;
            }
            if ((i12 & 2) != 0) {
                list = beduinForm.topMapComponents;
            }
            return beduinForm.copy(str, list);
        }

        @Y61.l
        /* renamed from: component1, reason: from getter */
        public final String getTopMapFormId() {
            return this.topMapFormId;
        }

        @Y61.l
        public final List<BeduinModel> component2() {
            return this.topMapComponents;
        }

        @Y61.k
        public final BeduinForm copy(@Y61.l String topMapFormId, @Y61.l List<? extends BeduinModel> topMapComponents) {
            return new BeduinForm(topMapFormId, topMapComponents);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BeduinForm)) {
                return false;
            }
            BeduinForm beduinForm = (BeduinForm) other;
            return L.f(this.topMapFormId, beduinForm.topMapFormId) && L.f(this.topMapComponents, beduinForm.topMapComponents);
        }

        @Y61.l
        public final List<BeduinModel> getTopMapComponents() {
            return this.topMapComponents;
        }

        @Y61.l
        public final String getTopMapFormId() {
            return this.topMapFormId;
        }

        public int hashCode() {
            String str = this.topMapFormId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<BeduinModel> list = this.topMapComponents;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("BeduinForm(topMapFormId=");
            sb2.append(this.topMapFormId);
            sb2.append(", topMapComponents=");
            return H.p(sb2, this.topMapComponents, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeString(this.topMapFormId);
            List<BeduinModel> list = this.topMapComponents;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
    }

    /* compiled from: UniversalMapSettingsDto.kt */
    @Keep
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b\u0003\u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/universal_map/UniversalMapSettingsDto$LocationSettings;", "Landroid/os/Parcelable;", "", "isEnabledLocationRequest", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "<init>", "(ZLjava/util/List;)V", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lcom/avito/android/universal_map/UniversalMapSettingsDto$LocationSettings;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Ljava/util/List;", "getOnTapActions", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class LocationSettings implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<LocationSettings> CREATOR = new a();
        private final boolean isEnabledLocationRequest;

        @Y61.l
        private final List<BeduinAction> onTapActions;

        /* compiled from: UniversalMapSettingsDto.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LocationSettings> {
            @Override // android.os.Parcelable.Creator
            public final LocationSettings createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                int iL2 = 0;
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(LocationSettings.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new LocationSettings(z12, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final LocationSettings[] newArray(int i12) {
                return new LocationSettings[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LocationSettings(boolean z12, @Y61.l List<? extends BeduinAction> list) {
            this.isEnabledLocationRequest = z12;
            this.onTapActions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LocationSettings copy$default(LocationSettings locationSettings, boolean z12, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = locationSettings.isEnabledLocationRequest;
            }
            if ((i12 & 2) != 0) {
                list = locationSettings.onTapActions;
            }
            return locationSettings.copy(z12, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEnabledLocationRequest() {
            return this.isEnabledLocationRequest;
        }

        @Y61.l
        public final List<BeduinAction> component2() {
            return this.onTapActions;
        }

        @Y61.k
        public final LocationSettings copy(boolean isEnabledLocationRequest, @Y61.l List<? extends BeduinAction> onTapActions) {
            return new LocationSettings(isEnabledLocationRequest, onTapActions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationSettings)) {
                return false;
            }
            LocationSettings locationSettings = (LocationSettings) other;
            return this.isEnabledLocationRequest == locationSettings.isEnabledLocationRequest && L.f(this.onTapActions, locationSettings.onTapActions);
        }

        @Y61.l
        public final List<BeduinAction> getOnTapActions() {
            return this.onTapActions;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isEnabledLocationRequest) * 31;
            List<BeduinAction> list = this.onTapActions;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final boolean isEnabledLocationRequest() {
            return this.isEnabledLocationRequest;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LocationSettings(isEnabledLocationRequest=");
            sb2.append(this.isEnabledLocationRequest);
            sb2.append(", onTapActions=");
            return H.p(sb2, this.onTapActions, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeInt(this.isEnabledLocationRequest ? 1 : 0);
            List<BeduinAction> list = this.onTapActions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
    }

    /* compiled from: UniversalMapSettingsDto.kt */
    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/universal_map/UniversalMapSettingsDto$PointInfoBottomSheetSettings;", "Landroid/os/Parcelable;", "", "topPadding", "", "compactHeightRatio", "<init>", "(IF)V", "component1", "()I", "component2", "()F", "copy", "(IF)Lcom/avito/android/universal_map/UniversalMapSettingsDto$PointInfoBottomSheetSettings;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getTopPadding", "F", "getCompactHeightRatio", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class PointInfoBottomSheetSettings implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<PointInfoBottomSheetSettings> CREATOR = new a();
        private final float compactHeightRatio;
        private final int topPadding;

        /* compiled from: UniversalMapSettingsDto.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PointInfoBottomSheetSettings> {
            @Override // android.os.Parcelable.Creator
            public final PointInfoBottomSheetSettings createFromParcel(Parcel parcel) {
                return new PointInfoBottomSheetSettings(parcel.readInt(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final PointInfoBottomSheetSettings[] newArray(int i12) {
                return new PointInfoBottomSheetSettings[i12];
            }
        }

        public PointInfoBottomSheetSettings(int i12, float f12) {
            this.topPadding = i12;
            this.compactHeightRatio = f12;
        }

        public static /* synthetic */ PointInfoBottomSheetSettings copy$default(PointInfoBottomSheetSettings pointInfoBottomSheetSettings, int i12, float f12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = pointInfoBottomSheetSettings.topPadding;
            }
            if ((i13 & 2) != 0) {
                f12 = pointInfoBottomSheetSettings.compactHeightRatio;
            }
            return pointInfoBottomSheetSettings.copy(i12, f12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final float getCompactHeightRatio() {
            return this.compactHeightRatio;
        }

        @Y61.k
        public final PointInfoBottomSheetSettings copy(int topPadding, float compactHeightRatio) {
            return new PointInfoBottomSheetSettings(topPadding, compactHeightRatio);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointInfoBottomSheetSettings)) {
                return false;
            }
            PointInfoBottomSheetSettings pointInfoBottomSheetSettings = (PointInfoBottomSheetSettings) other;
            return this.topPadding == pointInfoBottomSheetSettings.topPadding && Float.compare(this.compactHeightRatio, pointInfoBottomSheetSettings.compactHeightRatio) == 0;
        }

        public final float getCompactHeightRatio() {
            return this.compactHeightRatio;
        }

        public final int getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return Float.hashCode(this.compactHeightRatio) + (Integer.hashCode(this.topPadding) * 31);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PointInfoBottomSheetSettings(topPadding=");
            sb2.append(this.topPadding);
            sb2.append(", compactHeightRatio=");
            return r.k(')', this.compactHeightRatio, sb2);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeInt(this.topPadding);
            parcel.writeFloat(this.compactHeightRatio);
        }
    }

    /* compiled from: UniversalMapSettingsDto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalMapSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final UniversalMapSettingsDto createFromParcel(Parcel parcel) {
            return new UniversalMapSettingsDto(parcel.readInt() == 0 ? null : LocationSettings.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BeduinForm.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PointInfoBottomSheetSettings.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalMapSettingsDto[] newArray(int i12) {
            return new UniversalMapSettingsDto[i12];
        }
    }

    public UniversalMapSettingsDto(@Y61.l LocationSettings locationSettings, @Y61.l BeduinForm beduinForm, @Y61.l PointInfoBottomSheetSettings pointInfoBottomSheetSettings) {
        this.location = locationSettings;
        this.beduinForm = beduinForm;
        this.pointInfoBottomSheetSettings = pointInfoBottomSheetSettings;
    }

    public static /* synthetic */ UniversalMapSettingsDto copy$default(UniversalMapSettingsDto universalMapSettingsDto, LocationSettings locationSettings, BeduinForm beduinForm, PointInfoBottomSheetSettings pointInfoBottomSheetSettings, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            locationSettings = universalMapSettingsDto.location;
        }
        if ((i12 & 2) != 0) {
            beduinForm = universalMapSettingsDto.beduinForm;
        }
        if ((i12 & 4) != 0) {
            pointInfoBottomSheetSettings = universalMapSettingsDto.pointInfoBottomSheetSettings;
        }
        return universalMapSettingsDto.copy(locationSettings, beduinForm, pointInfoBottomSheetSettings);
    }

    @Y61.l
    /* renamed from: component1, reason: from getter */
    public final LocationSettings getLocation() {
        return this.location;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final BeduinForm getBeduinForm() {
        return this.beduinForm;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final PointInfoBottomSheetSettings getPointInfoBottomSheetSettings() {
        return this.pointInfoBottomSheetSettings;
    }

    @Y61.k
    public final UniversalMapSettingsDto copy(@Y61.l LocationSettings location, @Y61.l BeduinForm beduinForm, @Y61.l PointInfoBottomSheetSettings pointInfoBottomSheetSettings) {
        return new UniversalMapSettingsDto(location, beduinForm, pointInfoBottomSheetSettings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalMapSettingsDto)) {
            return false;
        }
        UniversalMapSettingsDto universalMapSettingsDto = (UniversalMapSettingsDto) other;
        return L.f(this.location, universalMapSettingsDto.location) && L.f(this.beduinForm, universalMapSettingsDto.beduinForm) && L.f(this.pointInfoBottomSheetSettings, universalMapSettingsDto.pointInfoBottomSheetSettings);
    }

    @Y61.l
    public final BeduinForm getBeduinForm() {
        return this.beduinForm;
    }

    @Y61.l
    public final LocationSettings getLocation() {
        return this.location;
    }

    @Y61.l
    public final PointInfoBottomSheetSettings getPointInfoBottomSheetSettings() {
        return this.pointInfoBottomSheetSettings;
    }

    public int hashCode() {
        LocationSettings locationSettings = this.location;
        int iHashCode = (locationSettings == null ? 0 : locationSettings.hashCode()) * 31;
        BeduinForm beduinForm = this.beduinForm;
        int iHashCode2 = (iHashCode + (beduinForm == null ? 0 : beduinForm.hashCode())) * 31;
        PointInfoBottomSheetSettings pointInfoBottomSheetSettings = this.pointInfoBottomSheetSettings;
        return iHashCode2 + (pointInfoBottomSheetSettings != null ? pointInfoBottomSheetSettings.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        return "UniversalMapSettingsDto(location=" + this.location + ", beduinForm=" + this.beduinForm + ", pointInfoBottomSheetSettings=" + this.pointInfoBottomSheetSettings + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        LocationSettings locationSettings = this.location;
        if (locationSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            locationSettings.writeToParcel(parcel, flags);
        }
        BeduinForm beduinForm = this.beduinForm;
        if (beduinForm == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinForm.writeToParcel(parcel, flags);
        }
        PointInfoBottomSheetSettings pointInfoBottomSheetSettings = this.pointInfoBottomSheetSettings;
        if (pointInfoBottomSheetSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pointInfoBottomSheetSettings.writeToParcel(parcel, flags);
        }
    }
}
