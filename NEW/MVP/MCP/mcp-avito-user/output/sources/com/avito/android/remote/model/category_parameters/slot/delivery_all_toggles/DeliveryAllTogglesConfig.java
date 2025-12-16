package com.avito.android.remote.model.category_parameters.slot.delivery_all_toggles;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.google.gson.annotations.c;
import com.my.tracker.ads.AdFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DeliveryAllTogglesConfig.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b\r\u0010'¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/DeliveryAllTogglesConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesBanner;", AdFormat.BANNER, "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActions;", "actions", "", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesFeature;", "features", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettings;", "settings", "", "readyToDisplay", "isOneButtonSpecificEnabled", "<init>", "(Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesBanner;Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActions;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesBanner;", "getBanner", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesBanner;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActions;", "getActions", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActions;", "Ljava/util/List;", "getFeatures", "()Ljava/util/List;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettings;", "getSettings", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettings;", "Ljava/lang/Boolean;", "getReadyToDisplay", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryAllTogglesConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<DeliveryAllTogglesConfig> CREATOR = new Creator();

    @c("actions")
    @l
    private final AllTogglesActions actions;

    @c(AdFormat.BANNER)
    @l
    private final AllTogglesBanner banner;

    @c("features")
    @l
    private final List<AllTogglesFeature> features;

    @c("isOneButtonSpecificEnabled")
    @l
    private final Boolean isOneButtonSpecificEnabled;

    @c("readyToDisplay")
    @l
    private final Boolean readyToDisplay;

    @c("settings")
    @l
    private final AllTogglesSettings settings;

    /* compiled from: DeliveryAllTogglesConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryAllTogglesConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryAllTogglesConfig createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2 = null;
            AllTogglesBanner allTogglesBannerCreateFromParcel = parcel.readInt() == 0 ? null : AllTogglesBanner.CREATOR.createFromParcel(parcel);
            AllTogglesActions allTogglesActionsCreateFromParcel = parcel.readInt() == 0 ? null : AllTogglesActions.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(AllTogglesFeature.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            AllTogglesSettings allTogglesSettingsCreateFromParcel = parcel.readInt() == 0 ? null : AllTogglesSettings.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DeliveryAllTogglesConfig(allTogglesBannerCreateFromParcel, allTogglesActionsCreateFromParcel, arrayList, allTogglesSettingsCreateFromParcel, boolValueOf, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryAllTogglesConfig[] newArray(int i12) {
            return new DeliveryAllTogglesConfig[i12];
        }
    }

    public DeliveryAllTogglesConfig(@l AllTogglesBanner allTogglesBanner, @l AllTogglesActions allTogglesActions, @l List<AllTogglesFeature> list, @l AllTogglesSettings allTogglesSettings, @l Boolean bool, @l Boolean bool2) {
        this.banner = allTogglesBanner;
        this.actions = allTogglesActions;
        this.features = list;
        this.settings = allTogglesSettings;
        this.readyToDisplay = bool;
        this.isOneButtonSpecificEnabled = bool2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AllTogglesActions getActions() {
        return this.actions;
    }

    @l
    public final AllTogglesBanner getBanner() {
        return this.banner;
    }

    @l
    public final List<AllTogglesFeature> getFeatures() {
        return this.features;
    }

    @l
    public final Boolean getReadyToDisplay() {
        return this.readyToDisplay;
    }

    @l
    public final AllTogglesSettings getSettings() {
        return this.settings;
    }

    @l
    /* renamed from: isOneButtonSpecificEnabled, reason: from getter */
    public final Boolean getIsOneButtonSpecificEnabled() {
        return this.isOneButtonSpecificEnabled;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        AllTogglesBanner allTogglesBanner = this.banner;
        if (allTogglesBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allTogglesBanner.writeToParcel(parcel, flags);
        }
        AllTogglesActions allTogglesActions = this.actions;
        if (allTogglesActions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allTogglesActions.writeToParcel(parcel, flags);
        }
        List<AllTogglesFeature> list = this.features;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AllTogglesFeature) itA.next()).writeToParcel(parcel, flags);
            }
        }
        AllTogglesSettings allTogglesSettings = this.settings;
        if (allTogglesSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allTogglesSettings.writeToParcel(parcel, flags);
        }
        Boolean bool = this.readyToDisplay;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isOneButtonSpecificEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }
}
