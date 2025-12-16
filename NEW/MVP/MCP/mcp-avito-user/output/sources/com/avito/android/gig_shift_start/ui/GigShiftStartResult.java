package com.avito.android.gig_shift_start.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GigShiftStartResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/gig_shift_start/ui/GigShiftStartResult;", "Landroid/os/Parcelable;", "()V", "Closed", "OpenAction", "OpenScan", "Lcom/avito/android/gig_shift_start/ui/GigShiftStartResult$Closed;", "Lcom/avito/android/gig_shift_start/ui/GigShiftStartResult$OpenAction;", "Lcom/avito/android/gig_shift_start/ui/GigShiftStartResult$OpenScan;", "_avito_gig_start-shift-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class GigShiftStartResult implements Parcelable {

    /* compiled from: GigShiftStartResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_start/ui/GigShiftStartResult$Closed;", "Lcom/avito/android/gig_shift_start/ui/GigShiftStartResult;", "<init>", "()V", "_avito_gig_start-shift-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Closed extends GigShiftStartResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Closed f160841b = new Closed();

        @k
        public static final Parcelable.Creator<Closed> CREATOR = new a();

        /* compiled from: GigShiftStartResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Closed> {
            @Override // android.os.Parcelable.Creator
            public final Closed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Closed.f160841b;
            }

            @Override // android.os.Parcelable.Creator
            public final Closed[] newArray(int i12) {
                return new Closed[i12];
            }
        }

        public Closed() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Closed);
        }

        public final int hashCode() {
            return -1565509820;
        }

        @k
        public final String toString() {
            return "Closed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: GigShiftStartResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_start/ui/GigShiftStartResult$OpenAction;", "Lcom/avito/android/gig_shift_start/ui/GigShiftStartResult;", "<init>", "()V", "_avito_gig_start-shift-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAction extends GigShiftStartResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenAction f160842b = new OpenAction();

        @k
        public static final Parcelable.Creator<OpenAction> CREATOR = new a();

        /* compiled from: GigShiftStartResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OpenAction> {
            @Override // android.os.Parcelable.Creator
            public final OpenAction createFromParcel(Parcel parcel) {
                parcel.readInt();
                return OpenAction.f160842b;
            }

            @Override // android.os.Parcelable.Creator
            public final OpenAction[] newArray(int i12) {
                return new OpenAction[i12];
            }
        }

        public OpenAction() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenAction);
        }

        public final int hashCode() {
            return 1164761848;
        }

        @k
        public final String toString() {
            return "OpenAction";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: GigShiftStartResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_start/ui/GigShiftStartResult$OpenScan;", "Lcom/avito/android/gig_shift_start/ui/GigShiftStartResult;", "<init>", "()V", "_avito_gig_start-shift-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenScan extends GigShiftStartResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenScan f160843b = new OpenScan();

        @k
        public static final Parcelable.Creator<OpenScan> CREATOR = new a();

        /* compiled from: GigShiftStartResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OpenScan> {
            @Override // android.os.Parcelable.Creator
            public final OpenScan createFromParcel(Parcel parcel) {
                parcel.readInt();
                return OpenScan.f160843b;
            }

            @Override // android.os.Parcelable.Creator
            public final OpenScan[] newArray(int i12) {
                return new OpenScan[i12];
            }
        }

        public OpenScan() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenScan);
        }

        public final int hashCode() {
            return 1481075647;
        }

        @k
        public final String toString() {
            return "OpenScan";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ GigShiftStartResult(C42822w c42822w) {
        this();
    }

    public GigShiftStartResult() {
    }
}
