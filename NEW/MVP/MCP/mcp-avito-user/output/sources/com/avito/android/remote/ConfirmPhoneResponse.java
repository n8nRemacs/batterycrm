package com.avito.android.remote;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ConfirmPhoneResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/ConfirmPhoneResponse;", "Landroid/os/Parcelable;", "", "success", "Lcom/avito/android/remote/RecallMeError;", "error", "<init>", "(ZLcom/avito/android/remote/RecallMeError;)V", "Z", "d", "()Z", "Lcom/avito/android/remote/RecallMeError;", "c", "()Lcom/avito/android/remote/RecallMeError;", "_avito-discouraged_avito-api_recall-me"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConfirmPhoneResponse implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ConfirmPhoneResponse> CREATOR = new a();

    @com.google.gson.annotations.c("error")
    @Y61.l
    private final RecallMeError error;

    @com.google.gson.annotations.c("success")
    private final boolean success;

    /* compiled from: ConfirmPhoneResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConfirmPhoneResponse> {
        @Override // android.os.Parcelable.Creator
        public final ConfirmPhoneResponse createFromParcel(Parcel parcel) {
            return new ConfirmPhoneResponse(parcel.readInt() != 0, parcel.readInt() == 0 ? null : RecallMeError.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ConfirmPhoneResponse[] newArray(int i12) {
            return new ConfirmPhoneResponse[i12];
        }
    }

    public ConfirmPhoneResponse(boolean z12, @Y61.l RecallMeError recallMeError) {
        this.success = z12;
        this.error = recallMeError;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final RecallMeError getError() {
        return this.error;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.success ? 1 : 0);
        RecallMeError recallMeError = this.error;
        if (recallMeError == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recallMeError.writeToParcel(parcel, i12);
        }
    }
}
