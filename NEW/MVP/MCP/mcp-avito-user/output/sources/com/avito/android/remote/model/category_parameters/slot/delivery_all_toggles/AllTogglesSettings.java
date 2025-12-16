package com.avito.android.remote.model.category_parameters.slot.delivery_all_toggles;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: DeliveryAllTogglesConfig.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettings;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettingsLegal;", "legal", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettingsToggles;", "toggles", "<init>", "(Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettingsLegal;Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettingsToggles;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettingsLegal;", "getLegal", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettingsLegal;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettingsToggles;", "getToggles", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettingsToggles;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AllTogglesSettings implements Parcelable {

    @k
    public static final Parcelable.Creator<AllTogglesSettings> CREATOR = new Creator();

    @c("legal")
    @l
    private final AllTogglesSettingsLegal legal;

    @c("toggles")
    @l
    private final AllTogglesSettingsToggles toggles;

    /* compiled from: DeliveryAllTogglesConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AllTogglesSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AllTogglesSettings createFromParcel(@k Parcel parcel) {
            return new AllTogglesSettings(parcel.readInt() == 0 ? null : AllTogglesSettingsLegal.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AllTogglesSettingsToggles.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AllTogglesSettings[] newArray(int i12) {
            return new AllTogglesSettings[i12];
        }
    }

    public AllTogglesSettings(@l AllTogglesSettingsLegal allTogglesSettingsLegal, @l AllTogglesSettingsToggles allTogglesSettingsToggles) {
        this.legal = allTogglesSettingsLegal;
        this.toggles = allTogglesSettingsToggles;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AllTogglesSettingsLegal getLegal() {
        return this.legal;
    }

    @l
    public final AllTogglesSettingsToggles getToggles() {
        return this.toggles;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        AllTogglesSettingsLegal allTogglesSettingsLegal = this.legal;
        if (allTogglesSettingsLegal == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allTogglesSettingsLegal.writeToParcel(parcel, flags);
        }
        AllTogglesSettingsToggles allTogglesSettingsToggles = this.toggles;
        if (allTogglesSettingsToggles == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allTogglesSettingsToggles.writeToParcel(parcel, flags);
        }
    }
}
