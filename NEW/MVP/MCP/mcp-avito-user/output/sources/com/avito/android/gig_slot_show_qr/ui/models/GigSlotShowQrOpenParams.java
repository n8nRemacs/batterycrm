package com.avito.android.gig_slot_show_qr.ui.models;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig.slot_show_qr_impl.generated.api.show_qrv_1.Action;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: GigSlotShowQrOpenParams.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/ui/models/GigSlotShowQrOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigSlotShowQrOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<GigSlotShowQrOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f160953b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Action f160954c;

    /* compiled from: GigSlotShowQrOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigSlotShowQrOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final GigSlotShowQrOpenParams createFromParcel(Parcel parcel) {
            return new GigSlotShowQrOpenParams(parcel.readString(), Action.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final GigSlotShowQrOpenParams[] newArray(int i12) {
            return new GigSlotShowQrOpenParams[i12];
        }
    }

    public GigSlotShowQrOpenParams(@k String str, @k Action action) {
        this.f160953b = str;
        this.f160954c = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f160953b);
        parcel.writeString(this.f160954c.name());
    }
}
