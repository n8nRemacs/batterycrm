package com.avito.android.remote.model.category_parameters.slot.delivery_all_toggles;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: DeliveryAllTogglesConfig.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActions;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionInfo;", RequestReviewResultKt.INFO_TYPE, "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionPrimary;", "primary", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionSettings;", "settings", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionSecondary;", "secondary", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesPrimaryDeliveryEnabled;", "primaryDeliveryEnabled", "<init>", "(Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionInfo;Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionPrimary;Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionSettings;Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionSecondary;Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesPrimaryDeliveryEnabled;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionInfo;", "getInfo", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionInfo;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionPrimary;", "getPrimary", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionPrimary;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionSettings;", "getSettings", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionSettings;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionSecondary;", "getSecondary", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesActionSecondary;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesPrimaryDeliveryEnabled;", "getPrimaryDeliveryEnabled", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesPrimaryDeliveryEnabled;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AllTogglesActions implements Parcelable {

    @k
    public static final Parcelable.Creator<AllTogglesActions> CREATOR = new Creator();

    @c(RequestReviewResultKt.INFO_TYPE)
    @l
    private final AllTogglesActionInfo info;

    @c("primary")
    @l
    private final AllTogglesActionPrimary primary;

    @c("primaryDeliveryEnabled")
    @l
    private final AllTogglesPrimaryDeliveryEnabled primaryDeliveryEnabled;

    @c("secondary")
    @l
    private final AllTogglesActionSecondary secondary;

    @c("settings")
    @l
    private final AllTogglesActionSettings settings;

    /* compiled from: DeliveryAllTogglesConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AllTogglesActions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AllTogglesActions createFromParcel(@k Parcel parcel) {
            return new AllTogglesActions(parcel.readInt() == 0 ? null : AllTogglesActionInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AllTogglesActionPrimary.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AllTogglesActionSettings.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AllTogglesActionSecondary.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AllTogglesPrimaryDeliveryEnabled.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AllTogglesActions[] newArray(int i12) {
            return new AllTogglesActions[i12];
        }
    }

    public AllTogglesActions(@l AllTogglesActionInfo allTogglesActionInfo, @l AllTogglesActionPrimary allTogglesActionPrimary, @l AllTogglesActionSettings allTogglesActionSettings, @l AllTogglesActionSecondary allTogglesActionSecondary, @l AllTogglesPrimaryDeliveryEnabled allTogglesPrimaryDeliveryEnabled) {
        this.info = allTogglesActionInfo;
        this.primary = allTogglesActionPrimary;
        this.settings = allTogglesActionSettings;
        this.secondary = allTogglesActionSecondary;
        this.primaryDeliveryEnabled = allTogglesPrimaryDeliveryEnabled;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AllTogglesActionInfo getInfo() {
        return this.info;
    }

    @l
    public final AllTogglesActionPrimary getPrimary() {
        return this.primary;
    }

    @l
    public final AllTogglesPrimaryDeliveryEnabled getPrimaryDeliveryEnabled() {
        return this.primaryDeliveryEnabled;
    }

    @l
    public final AllTogglesActionSecondary getSecondary() {
        return this.secondary;
    }

    @l
    public final AllTogglesActionSettings getSettings() {
        return this.settings;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        AllTogglesActionInfo allTogglesActionInfo = this.info;
        if (allTogglesActionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allTogglesActionInfo.writeToParcel(parcel, flags);
        }
        AllTogglesActionPrimary allTogglesActionPrimary = this.primary;
        if (allTogglesActionPrimary == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allTogglesActionPrimary.writeToParcel(parcel, flags);
        }
        AllTogglesActionSettings allTogglesActionSettings = this.settings;
        if (allTogglesActionSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allTogglesActionSettings.writeToParcel(parcel, flags);
        }
        AllTogglesActionSecondary allTogglesActionSecondary = this.secondary;
        if (allTogglesActionSecondary == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allTogglesActionSecondary.writeToParcel(parcel, flags);
        }
        AllTogglesPrimaryDeliveryEnabled allTogglesPrimaryDeliveryEnabled = this.primaryDeliveryEnabled;
        if (allTogglesPrimaryDeliveryEnabled == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allTogglesPrimaryDeliveryEnabled.writeToParcel(parcel, flags);
        }
    }
}
