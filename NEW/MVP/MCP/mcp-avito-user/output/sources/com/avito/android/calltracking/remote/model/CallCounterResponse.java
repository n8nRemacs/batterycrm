package com.avito.android.calltracking.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: CallCounterResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/calltracking/remote/model/CallCounterResponse;", "Landroid/os/Parcelable;", "", "missedCall", "<init>", "(I)V", "I", "c", "()I", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CallCounterResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<CallCounterResponse> CREATOR = new a();

    @c("unread")
    private final int missedCall;

    /* compiled from: CallCounterResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CallCounterResponse> {
        @Override // android.os.Parcelable.Creator
        public final CallCounterResponse createFromParcel(Parcel parcel) {
            return new CallCounterResponse(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CallCounterResponse[] newArray(int i12) {
            return new CallCounterResponse[i12];
        }
    }

    public CallCounterResponse(int i12) {
        this.missedCall = i12;
    }

    /* renamed from: c, reason: from getter */
    public final int getMissedCall() {
        return this.missedCall;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallCounterResponse) && this.missedCall == ((CallCounterResponse) obj).missedCall;
    }

    public final int hashCode() {
        return Integer.hashCode(this.missedCall);
    }

    @k
    public final String toString() {
        return r.t(new StringBuilder("CallCounterResponse(missedCall="), this.missedCall, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.missedCall);
    }
}
