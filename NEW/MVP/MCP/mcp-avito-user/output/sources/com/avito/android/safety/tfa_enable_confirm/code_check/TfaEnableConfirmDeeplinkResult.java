package com.avito.android.safety.tfa_enable_confirm.code_check;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: TfaEnableCodeCheckScenarioBuilder.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/tfa_enable_confirm/code_check/TfaEnableConfirmDeeplinkResult;", "Landroid/os/Parcelable;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TfaEnableConfirmDeeplinkResult implements Parcelable {

    @k
    public static final Parcelable.Creator<TfaEnableConfirmDeeplinkResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f258140b;

    /* compiled from: TfaEnableCodeCheckScenarioBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TfaEnableConfirmDeeplinkResult> {
        @Override // android.os.Parcelable.Creator
        public final TfaEnableConfirmDeeplinkResult createFromParcel(Parcel parcel) {
            return new TfaEnableConfirmDeeplinkResult(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TfaEnableConfirmDeeplinkResult[] newArray(int i12) {
            return new TfaEnableConfirmDeeplinkResult[i12];
        }
    }

    public TfaEnableConfirmDeeplinkResult(boolean z12) {
        this.f258140b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TfaEnableConfirmDeeplinkResult) && this.f258140b == ((TfaEnableConfirmDeeplinkResult) obj).f258140b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258140b);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("TfaEnableConfirmDeeplinkResult(isTfaEnabled="), this.f258140b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f258140b ? 1 : 0);
    }
}
