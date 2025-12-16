package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacFinishReason.kt */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason;", "Landroid/os/Parcelable;", "()V", "BusyByGsm", "BusyByIac", "HangupByLocal", "HangupByRemote", "InternalError", "MissedCameraPermissionError", "MissedMicPermissionError", "RejectIncomingCallByLocal", "TimeoutOfAnswering", "TimeoutOfConnecting", "UnknownError", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$BusyByGsm;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$BusyByIac;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$HangupByLocal;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$HangupByRemote;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$InternalError;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$MissedCameraPermissionError;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$MissedMicPermissionError;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$RejectIncomingCallByLocal;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$TimeoutOfAnswering;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$TimeoutOfConnecting;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$UnknownError;", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class IacFinishReason implements Parcelable {

    /* compiled from: IacFinishReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$BusyByGsm;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class BusyByGsm extends IacFinishReason {

        @k
        public static final BusyByGsm INSTANCE = new BusyByGsm();

        @k
        public static final Parcelable.Creator<BusyByGsm> CREATOR = new a();

        /* compiled from: IacFinishReason.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BusyByGsm> {
            @Override // android.os.Parcelable.Creator
            public final BusyByGsm createFromParcel(Parcel parcel) {
                parcel.readInt();
                return BusyByGsm.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final BusyByGsm[] newArray(int i12) {
                return new BusyByGsm[i12];
            }
        }

        private BusyByGsm() {
            super(null);
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

    /* compiled from: IacFinishReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$BusyByIac;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class BusyByIac extends IacFinishReason {

        @k
        public static final BusyByIac INSTANCE = new BusyByIac();

        @k
        public static final Parcelable.Creator<BusyByIac> CREATOR = new a();

        /* compiled from: IacFinishReason.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BusyByIac> {
            @Override // android.os.Parcelable.Creator
            public final BusyByIac createFromParcel(Parcel parcel) {
                parcel.readInt();
                return BusyByIac.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final BusyByIac[] newArray(int i12) {
                return new BusyByIac[i12];
            }
        }

        private BusyByIac() {
            super(null);
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

    /* compiled from: IacFinishReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$HangupByLocal;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class HangupByLocal extends IacFinishReason {

        @k
        public static final HangupByLocal INSTANCE = new HangupByLocal();

        @k
        public static final Parcelable.Creator<HangupByLocal> CREATOR = new a();

        /* compiled from: IacFinishReason.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HangupByLocal> {
            @Override // android.os.Parcelable.Creator
            public final HangupByLocal createFromParcel(Parcel parcel) {
                parcel.readInt();
                return HangupByLocal.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final HangupByLocal[] newArray(int i12) {
                return new HangupByLocal[i12];
            }
        }

        private HangupByLocal() {
            super(null);
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

    /* compiled from: IacFinishReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$HangupByRemote;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class HangupByRemote extends IacFinishReason {

        @k
        public static final HangupByRemote INSTANCE = new HangupByRemote();

        @k
        public static final Parcelable.Creator<HangupByRemote> CREATOR = new a();

        /* compiled from: IacFinishReason.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HangupByRemote> {
            @Override // android.os.Parcelable.Creator
            public final HangupByRemote createFromParcel(Parcel parcel) {
                parcel.readInt();
                return HangupByRemote.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final HangupByRemote[] newArray(int i12) {
                return new HangupByRemote[i12];
            }
        }

        private HangupByRemote() {
            super(null);
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

    /* compiled from: IacFinishReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$InternalError;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class InternalError extends IacFinishReason {

        @k
        public static final InternalError INSTANCE = new InternalError();

        @k
        public static final Parcelable.Creator<InternalError> CREATOR = new a();

        /* compiled from: IacFinishReason.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<InternalError> {
            @Override // android.os.Parcelable.Creator
            public final InternalError createFromParcel(Parcel parcel) {
                parcel.readInt();
                return InternalError.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final InternalError[] newArray(int i12) {
                return new InternalError[i12];
            }
        }

        private InternalError() {
            super(null);
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

    /* compiled from: IacFinishReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$MissedCameraPermissionError;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class MissedCameraPermissionError extends IacFinishReason {

        @k
        public static final MissedCameraPermissionError INSTANCE = new MissedCameraPermissionError();

        @k
        public static final Parcelable.Creator<MissedCameraPermissionError> CREATOR = new a();

        /* compiled from: IacFinishReason.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MissedCameraPermissionError> {
            @Override // android.os.Parcelable.Creator
            public final MissedCameraPermissionError createFromParcel(Parcel parcel) {
                parcel.readInt();
                return MissedCameraPermissionError.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final MissedCameraPermissionError[] newArray(int i12) {
                return new MissedCameraPermissionError[i12];
            }
        }

        private MissedCameraPermissionError() {
            super(null);
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

    /* compiled from: IacFinishReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$MissedMicPermissionError;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class MissedMicPermissionError extends IacFinishReason {

        @k
        public static final MissedMicPermissionError INSTANCE = new MissedMicPermissionError();

        @k
        public static final Parcelable.Creator<MissedMicPermissionError> CREATOR = new a();

        /* compiled from: IacFinishReason.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MissedMicPermissionError> {
            @Override // android.os.Parcelable.Creator
            public final MissedMicPermissionError createFromParcel(Parcel parcel) {
                parcel.readInt();
                return MissedMicPermissionError.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final MissedMicPermissionError[] newArray(int i12) {
                return new MissedMicPermissionError[i12];
            }
        }

        private MissedMicPermissionError() {
            super(null);
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

    /* compiled from: IacFinishReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$RejectIncomingCallByLocal;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class RejectIncomingCallByLocal extends IacFinishReason {

        @k
        public static final RejectIncomingCallByLocal INSTANCE = new RejectIncomingCallByLocal();

        @k
        public static final Parcelable.Creator<RejectIncomingCallByLocal> CREATOR = new a();

        /* compiled from: IacFinishReason.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RejectIncomingCallByLocal> {
            @Override // android.os.Parcelable.Creator
            public final RejectIncomingCallByLocal createFromParcel(Parcel parcel) {
                parcel.readInt();
                return RejectIncomingCallByLocal.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final RejectIncomingCallByLocal[] newArray(int i12) {
                return new RejectIncomingCallByLocal[i12];
            }
        }

        private RejectIncomingCallByLocal() {
            super(null);
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

    /* compiled from: IacFinishReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$TimeoutOfAnswering;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class TimeoutOfAnswering extends IacFinishReason {

        @k
        public static final TimeoutOfAnswering INSTANCE = new TimeoutOfAnswering();

        @k
        public static final Parcelable.Creator<TimeoutOfAnswering> CREATOR = new a();

        /* compiled from: IacFinishReason.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TimeoutOfAnswering> {
            @Override // android.os.Parcelable.Creator
            public final TimeoutOfAnswering createFromParcel(Parcel parcel) {
                parcel.readInt();
                return TimeoutOfAnswering.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final TimeoutOfAnswering[] newArray(int i12) {
                return new TimeoutOfAnswering[i12];
            }
        }

        private TimeoutOfAnswering() {
            super(null);
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

    /* compiled from: IacFinishReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$TimeoutOfConnecting;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class TimeoutOfConnecting extends IacFinishReason {

        @k
        public static final TimeoutOfConnecting INSTANCE = new TimeoutOfConnecting();

        @k
        public static final Parcelable.Creator<TimeoutOfConnecting> CREATOR = new a();

        /* compiled from: IacFinishReason.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TimeoutOfConnecting> {
            @Override // android.os.Parcelable.Creator
            public final TimeoutOfConnecting createFromParcel(Parcel parcel) {
                parcel.readInt();
                return TimeoutOfConnecting.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final TimeoutOfConnecting[] newArray(int i12) {
                return new TimeoutOfConnecting[i12];
            }
        }

        private TimeoutOfConnecting() {
            super(null);
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

    /* compiled from: IacFinishReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason$UnknownError;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacFinishReason;", "", "cause", "", "description", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class UnknownError extends IacFinishReason {

        @k
        public static final Parcelable.Creator<UnknownError> CREATOR = new a();

        @l
        private final Throwable cause;

        @k
        private final String description;

        /* compiled from: IacFinishReason.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UnknownError> {
            @Override // android.os.Parcelable.Creator
            public final UnknownError createFromParcel(Parcel parcel) {
                return new UnknownError((Throwable) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UnknownError[] newArray(int i12) {
                return new UnknownError[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UnknownError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Throwable getCause() {
            return this.cause;
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeSerializable(this.cause);
            parcel.writeString(this.description);
        }

        public UnknownError(@l Throwable th2, @k String str) {
            super(null);
            this.cause = th2;
            this.description = str;
        }

        public /* synthetic */ UnknownError(Throwable th2, String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : th2, (i12 & 2) != 0 ? "" : str);
        }
    }

    public /* synthetic */ IacFinishReason(C42822w c42822w) {
        this();
    }

    private IacFinishReason() {
    }
}
