package com.avito.android.remote.model.counter;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChangingParametersForButtons.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/counter/ChangingParametersForButtons;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/counter/CounterButton;", "counterButton", "Lcom/avito/android/remote/model/counter/MapButton;", "mapButton", "<init>", "(Lcom/avito/android/remote/model/counter/CounterButton;Lcom/avito/android/remote/model/counter/MapButton;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/counter/CounterButton;", "getCounterButton", "()Lcom/avito/android/remote/model/counter/CounterButton;", "Lcom/avito/android/remote/model/counter/MapButton;", "getMapButton", "()Lcom/avito/android/remote/model/counter/MapButton;", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ChangingParametersForButtons implements Parcelable {

    @k
    public static final Parcelable.Creator<ChangingParametersForButtons> CREATOR = new Creator();

    @c("applyButton")
    @l
    private final CounterButton counterButton;

    @c("mapButton")
    @l
    private final MapButton mapButton;

    /* compiled from: ChangingParametersForButtons.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChangingParametersForButtons> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChangingParametersForButtons createFromParcel(@k Parcel parcel) {
            return new ChangingParametersForButtons(parcel.readInt() == 0 ? null : CounterButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MapButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChangingParametersForButtons[] newArray(int i12) {
            return new ChangingParametersForButtons[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangingParametersForButtons() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final CounterButton getCounterButton() {
        return this.counterButton;
    }

    @l
    public final MapButton getMapButton() {
        return this.mapButton;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        CounterButton counterButton = this.counterButton;
        if (counterButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            counterButton.writeToParcel(parcel, flags);
        }
        MapButton mapButton = this.mapButton;
        if (mapButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mapButton.writeToParcel(parcel, flags);
        }
    }

    public ChangingParametersForButtons(@l CounterButton counterButton, @l MapButton mapButton) {
        this.counterButton = counterButton;
        this.mapButton = mapButton;
    }

    public /* synthetic */ ChangingParametersForButtons(CounterButton counterButton, MapButton mapButton, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : counterButton, (i12 & 2) != 0 ? null : mapButton);
    }
}
