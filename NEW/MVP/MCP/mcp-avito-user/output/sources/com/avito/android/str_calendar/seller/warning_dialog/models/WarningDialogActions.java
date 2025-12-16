package com.avito.android.str_calendar.seller.warning_dialog.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.str_booking.network.models.common.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WarningDialogData.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/warning_dialog/models/WarningDialogActions;", "Landroid/os/Parcelable;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WarningDialogActions implements Parcelable {

    @k
    public static final Parcelable.Creator<WarningDialogActions> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f288088b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f288089c;

    /* compiled from: WarningDialogData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WarningDialogActions> {
        @Override // android.os.Parcelable.Creator
        public final WarningDialogActions createFromParcel(Parcel parcel) {
            return new WarningDialogActions((Button) parcel.readParcelable(WarningDialogActions.class.getClassLoader()), (Button) parcel.readParcelable(WarningDialogActions.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WarningDialogActions[] newArray(int i12) {
            return new WarningDialogActions[i12];
        }
    }

    public WarningDialogActions(@k Button button, @k Button button2) {
        this.f288088b = button;
        this.f288089c = button2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarningDialogActions)) {
            return false;
        }
        WarningDialogActions warningDialogActions = (WarningDialogActions) obj;
        return L.f(this.f288088b, warningDialogActions.f288088b) && L.f(this.f288089c, warningDialogActions.f288089c);
    }

    public final int hashCode() {
        return this.f288089c.hashCode() + (this.f288088b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "WarningDialogActions(acceptButton=" + this.f288088b + ", denyButton=" + this.f288089c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f288088b, i12);
        parcel.writeParcelable(this.f288089c, i12);
    }
}
