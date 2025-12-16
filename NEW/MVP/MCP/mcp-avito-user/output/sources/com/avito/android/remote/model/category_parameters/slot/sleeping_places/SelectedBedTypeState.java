package com.avito.android.remote.model.category_parameters.slot.sleeping_places;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.stepper.Stepper;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SleepingPlacesSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState;", "Landroid/os/Parcelable;", "select", "", "stepper", "Lcom/avito/android/lib/design/stepper/Stepper$State;", "([ILcom/avito/android/lib/design/stepper/Stepper$State;)V", "getSelect", "()[I", "getStepper", "()Lcom/avito/android/lib/design/stepper/Stepper$State;", "FullError", "Normal", "SelectError", "StepperError", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState$FullError;", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState$Normal;", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState$SelectError;", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState$StepperError;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SelectedBedTypeState implements Parcelable {

    @k
    private final int[] select;

    @k
    private final Stepper.State stepper;

    /* compiled from: SleepingPlacesSlotConfig.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState$FullError;", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FullError extends SelectedBedTypeState {

        @k
        public static final FullError INSTANCE = new FullError();

        @k
        public static final Parcelable.Creator<FullError> CREATOR = new Creator();

        /* compiled from: SleepingPlacesSlotConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FullError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FullError createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return FullError.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FullError[] newArray(int i12) {
                return new FullError[i12];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private FullError() {
            super(Input.f179305b0, Stepper.State.f180597d, null);
            Input.f179303W.getClass();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SleepingPlacesSlotConfig.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState$Normal;", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Normal extends SelectedBedTypeState {

        @k
        public static final Normal INSTANCE = new Normal();

        @k
        public static final Parcelable.Creator<Normal> CREATOR = new Creator();

        /* compiled from: SleepingPlacesSlotConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Normal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Normal createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return Normal.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Normal[] newArray(int i12) {
                return new Normal[i12];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Normal() {
            super(Input.f179304a0, Stepper.State.f180596c, null);
            Input.f179303W.getClass();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SleepingPlacesSlotConfig.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState$SelectError;", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectError extends SelectedBedTypeState {

        @k
        public static final SelectError INSTANCE = new SelectError();

        @k
        public static final Parcelable.Creator<SelectError> CREATOR = new Creator();

        /* compiled from: SleepingPlacesSlotConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SelectError createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return SelectError.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SelectError[] newArray(int i12) {
                return new SelectError[i12];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private SelectError() {
            super(Input.f179305b0, Stepper.State.f180596c, null);
            Input.f179303W.getClass();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SleepingPlacesSlotConfig.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState$StepperError;", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StepperError extends SelectedBedTypeState {

        @k
        public static final StepperError INSTANCE = new StepperError();

        @k
        public static final Parcelable.Creator<StepperError> CREATOR = new Creator();

        /* compiled from: SleepingPlacesSlotConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepperError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final StepperError createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return StepperError.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final StepperError[] newArray(int i12) {
                return new StepperError[i12];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private StepperError() {
            super(Input.f179304a0, Stepper.State.f180597d, null);
            Input.f179303W.getClass();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ SelectedBedTypeState(int[] iArr, Stepper.State state, C42822w c42822w) {
        this(iArr, state);
    }

    @k
    public final int[] getSelect() {
        return this.select;
    }

    @k
    public final Stepper.State getStepper() {
        return this.stepper;
    }

    private SelectedBedTypeState(int[] iArr, Stepper.State state) {
        this.select = iArr;
        this.stepper = state;
    }
}
