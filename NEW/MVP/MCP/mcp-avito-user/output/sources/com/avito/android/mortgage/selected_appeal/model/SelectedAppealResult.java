package com.avito.android.mortgage.selected_appeal.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SelectedAppealResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/model/SelectedAppealResult;", "Landroid/os/Parcelable;", "ReloadApplication", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SelectedAppealResult extends Parcelable {

    /* compiled from: SelectedAppealResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/model/SelectedAppealResult$ReloadApplication;", "Lcom/avito/android/mortgage/selected_appeal/model/SelectedAppealResult;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ReloadApplication implements SelectedAppealResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ReloadApplication f203451b = new ReloadApplication();

        @k
        public static final Parcelable.Creator<ReloadApplication> CREATOR = new a();

        /* compiled from: SelectedAppealResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReloadApplication> {
            @Override // android.os.Parcelable.Creator
            public final ReloadApplication createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ReloadApplication.f203451b;
            }

            @Override // android.os.Parcelable.Creator
            public final ReloadApplication[] newArray(int i12) {
                return new ReloadApplication[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ReloadApplication);
        }

        public final int hashCode() {
            return 918237655;
        }

        @k
        public final String toString() {
            return "ReloadApplication";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
