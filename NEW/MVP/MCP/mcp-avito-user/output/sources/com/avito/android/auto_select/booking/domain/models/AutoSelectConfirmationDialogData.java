package com.avito.android.auto_select.booking.domain.models;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectConfirmationDialogContent;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: AutoSelectConfirmationDialogData.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/booking/domain/models/AutoSelectConfirmationDialogData;", "Lcom/avito/android/util/OpenParams;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoSelectConfirmationDialogData implements OpenParams {

    @k
    public static final Parcelable.Creator<AutoSelectConfirmationDialogData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f95831b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AutoSelectConfirmationDialogContent f95832c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f95833d;

    /* compiled from: AutoSelectConfirmationDialogData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectConfirmationDialogData> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectConfirmationDialogData createFromParcel(Parcel parcel) {
            return new AutoSelectConfirmationDialogData(parcel.readString(), AutoSelectConfirmationDialogContent.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectConfirmationDialogData[] newArray(int i12) {
            return new AutoSelectConfirmationDialogData[i12];
        }
    }

    public AutoSelectConfirmationDialogData(@k String str, @k AutoSelectConfirmationDialogContent autoSelectConfirmationDialogContent, @k String str2) {
        this.f95831b = str;
        this.f95832c = autoSelectConfirmationDialogContent;
        this.f95833d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f95831b);
        this.f95832c.writeToParcel(parcel, i12);
        parcel.writeString(this.f95833d);
    }
}
