package com.avito.android.analytics.screens.tracker;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ScreenTransfer.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/ScreenTransfer;", "Landroid/os/Parcelable;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScreenTransfer implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ScreenTransfer> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f90789b;

    /* renamed from: c, reason: collision with root package name */
    public final long f90790c;

    /* renamed from: d, reason: collision with root package name */
    public final long f90791d;

    /* compiled from: ScreenTransfer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ScreenTransfer> {
        @Override // android.os.Parcelable.Creator
        public final ScreenTransfer createFromParcel(Parcel parcel) {
            return new ScreenTransfer(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final ScreenTransfer[] newArray(int i12) {
            return new ScreenTransfer[i12];
        }
    }

    public ScreenTransfer(long j12, long j13, long j14) {
        this.f90789b = j12;
        this.f90790c = j13;
        this.f90791d = j14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f90789b);
        parcel.writeLong(this.f90790c);
        parcel.writeLong(this.f90791d);
    }
}
