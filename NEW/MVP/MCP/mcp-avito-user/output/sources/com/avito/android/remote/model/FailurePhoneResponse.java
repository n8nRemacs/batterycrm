package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: PhoneResponse.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/FailurePhoneResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/PhoneResponse;", "Lcom/avito/android/remote/model/DialogInfo;", "dialogInfo", "<init>", "(Lcom/avito/android/remote/model/DialogInfo;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/DialogInfo;", "getDialogInfo", "()Lcom/avito/android/remote/model/DialogInfo;", "_avito-discouraged_avito-api_async-phone"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FailurePhoneResponse extends PhoneResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<FailurePhoneResponse> CREATOR = new Creator();

    @c("dialog")
    @k
    private final DialogInfo dialogInfo;

    /* compiled from: PhoneResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FailurePhoneResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FailurePhoneResponse createFromParcel(@k Parcel parcel) {
            return new FailurePhoneResponse((DialogInfo) parcel.readParcelable(FailurePhoneResponse.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FailurePhoneResponse[] newArray(int i12) {
            return new FailurePhoneResponse[i12];
        }
    }

    public FailurePhoneResponse(@k DialogInfo dialogInfo) {
        super(null);
        this.dialogInfo = dialogInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final DialogInfo getDialogInfo() {
        return this.dialogInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.dialogInfo, flags);
    }
}
