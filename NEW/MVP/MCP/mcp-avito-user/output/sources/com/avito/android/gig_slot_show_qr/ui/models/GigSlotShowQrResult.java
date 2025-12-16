package com.avito.android.gig_slot_show_qr.ui.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GigSlotShowQrResult.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/ui/models/GigSlotShowQrResult;", "Landroid/os/Parcelable;", "()V", "Success", "Lcom/avito/android/gig_slot_show_qr/ui/models/GigSlotShowQrResult$Success;", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class GigSlotShowQrResult implements Parcelable {

    /* compiled from: GigSlotShowQrResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/ui/models/GigSlotShowQrResult$Success;", "Lcom/avito/android/gig_slot_show_qr/ui/models/GigSlotShowQrResult;", "<init>", "()V", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Success extends GigSlotShowQrResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Success f160955b = new Success();

        @k
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* compiled from: GigSlotShowQrResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Success.f160955b;
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        public Success() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 763146242;
        }

        @k
        public final String toString() {
            return "Success";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ GigSlotShowQrResult(C42822w c42822w) {
        this();
    }

    public GigSlotShowQrResult() {
    }
}
