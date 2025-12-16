package com.avito.android.publish.slots.user_verification;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;

/* compiled from: UserVerificationError.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/slots/user_verification/UserVerificationError;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/error/ApiError$Custom;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UserVerificationError extends ApiError.Custom implements Parcelable {

    @k
    public static final Parcelable.Creator<UserVerificationError> CREATOR = new a();

    /* compiled from: UserVerificationError.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserVerificationError> {
        @Override // android.os.Parcelable.Creator
        public final UserVerificationError createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new UserVerificationError();
        }

        @Override // android.os.Parcelable.Creator
        public final UserVerificationError[] newArray(int i12) {
            return new UserVerificationError[i12];
        }
    }

    public UserVerificationError() {
        super(null, 1, null);
    }

    @Override // com.avito.android.remote.error.ApiError.Custom, android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
