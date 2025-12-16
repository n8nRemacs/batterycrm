package com.avito.android.gig_shift_cancel.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GigShiftCancelResult.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_shift_cancel/ui/GigShiftCancelResult;", "Landroid/os/Parcelable;", "()V", "Closed", "Lcom/avito/android/gig_shift_cancel/ui/GigShiftCancelResult$Closed;", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class GigShiftCancelResult implements Parcelable {

    /* compiled from: GigShiftCancelResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_cancel/ui/GigShiftCancelResult$Closed;", "Lcom/avito/android/gig_shift_cancel/ui/GigShiftCancelResult;", "<init>", "()V", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Closed extends GigShiftCancelResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Closed f160730b = new Closed();

        @k
        public static final Parcelable.Creator<Closed> CREATOR = new a();

        /* compiled from: GigShiftCancelResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Closed> {
            @Override // android.os.Parcelable.Creator
            public final Closed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Closed.f160730b;
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
            return -1780126370;
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

    public /* synthetic */ GigShiftCancelResult(C42822w c42822w) {
        this();
    }

    public GigShiftCancelResult() {
    }
}
