package com.avito.android.mortgage.confirm_close.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ConfirmCloseResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/confirm_close/model/ConfirmCloseResult;", "Landroid/os/Parcelable;", "Confirmed", "Declined", "Lcom/avito/android/mortgage/confirm_close/model/ConfirmCloseResult$Confirmed;", "Lcom/avito/android/mortgage/confirm_close/model/ConfirmCloseResult$Declined;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConfirmCloseResult extends Parcelable {

    /* compiled from: ConfirmCloseResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/confirm_close/model/ConfirmCloseResult$Confirmed;", "Lcom/avito/android/mortgage/confirm_close/model/ConfirmCloseResult;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Confirmed implements ConfirmCloseResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Confirmed f198500b = new Confirmed();

        @k
        public static final Parcelable.Creator<Confirmed> CREATOR = new a();

        /* compiled from: ConfirmCloseResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Confirmed> {
            @Override // android.os.Parcelable.Creator
            public final Confirmed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Confirmed.f198500b;
            }

            @Override // android.os.Parcelable.Creator
            public final Confirmed[] newArray(int i12) {
                return new Confirmed[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Confirmed);
        }

        public final int hashCode() {
            return -1826661369;
        }

        @k
        public final String toString() {
            return "Confirmed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ConfirmCloseResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/confirm_close/model/ConfirmCloseResult$Declined;", "Lcom/avito/android/mortgage/confirm_close/model/ConfirmCloseResult;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Declined implements ConfirmCloseResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Declined f198501b = new Declined();

        @k
        public static final Parcelable.Creator<Declined> CREATOR = new a();

        /* compiled from: ConfirmCloseResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Declined> {
            @Override // android.os.Parcelable.Creator
            public final Declined createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Declined.f198501b;
            }

            @Override // android.os.Parcelable.Creator
            public final Declined[] newArray(int i12) {
                return new Declined[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Declined);
        }

        public final int hashCode() {
            return 1643589254;
        }

        @k
        public final String toString() {
            return "Declined";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
