package com.avito.android.remote;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ConfirmCodeResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/ConfirmCodeResponse;", "Landroid/os/Parcelable;", "", "success", "", "retryAfterSec", "Lcom/avito/android/remote/RecallMeError;", "error", "<init>", "(ZLjava/lang/Integer;Lcom/avito/android/remote/RecallMeError;)V", "Z", "e", "()Z", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/RecallMeError;", "c", "()Lcom/avito/android/remote/RecallMeError;", "_avito-discouraged_avito-api_recall-me"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ConfirmCodeResponse implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ConfirmCodeResponse> CREATOR = new a();

    @com.google.gson.annotations.c("error")
    @Y61.l
    private final RecallMeError error;

    @com.google.gson.annotations.c("retryAfterSec")
    @Y61.l
    private final Integer retryAfterSec;

    @com.google.gson.annotations.c("success")
    private final boolean success;

    /* compiled from: ConfirmCodeResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConfirmCodeResponse> {
        @Override // android.os.Parcelable.Creator
        public final ConfirmCodeResponse createFromParcel(Parcel parcel) {
            return new ConfirmCodeResponse(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? RecallMeError.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ConfirmCodeResponse[] newArray(int i12) {
            return new ConfirmCodeResponse[i12];
        }
    }

    public ConfirmCodeResponse(boolean z12, @Y61.l Integer num, @Y61.l RecallMeError recallMeError) {
        this.success = z12;
        this.retryAfterSec = num;
        this.error = recallMeError;
    }

    public static ConfirmCodeResponse a(ConfirmCodeResponse confirmCodeResponse, Integer num) {
        boolean z12 = confirmCodeResponse.success;
        RecallMeError recallMeError = confirmCodeResponse.error;
        confirmCodeResponse.getClass();
        return new ConfirmCodeResponse(z12, num, recallMeError);
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final RecallMeError getError() {
        return this.error;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Integer getRetryAfterSec() {
        return this.retryAfterSec;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmCodeResponse)) {
            return false;
        }
        ConfirmCodeResponse confirmCodeResponse = (ConfirmCodeResponse) obj;
        return this.success == confirmCodeResponse.success && kotlin.jvm.internal.L.f(this.retryAfterSec, confirmCodeResponse.retryAfterSec) && kotlin.jvm.internal.L.f(this.error, confirmCodeResponse.error);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        Integer num = this.retryAfterSec;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        RecallMeError recallMeError = this.error;
        return iHashCode2 + (recallMeError != null ? recallMeError.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ConfirmCodeResponse(success=" + this.success + ", retryAfterSec=" + this.retryAfterSec + ", error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.success ? 1 : 0);
        Integer num = this.retryAfterSec;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        RecallMeError recallMeError = this.error;
        if (recallMeError == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recallMeError.writeToParcel(parcel, i12);
        }
    }
}
