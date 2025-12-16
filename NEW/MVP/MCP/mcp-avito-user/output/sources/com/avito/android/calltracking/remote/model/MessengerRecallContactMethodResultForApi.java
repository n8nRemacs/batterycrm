package com.avito.android.calltracking.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessengerPhoneCallResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/calltracking/remote/model/MessengerRecallContactMethodResultForApi;", "Landroid/os/Parcelable;", "Lcom/avito/android/calltracking/remote/model/IacResult;", "iacResult", "Lcom/avito/android/calltracking/remote/model/GsmResult;", "gsmResult", "Lcom/avito/android/calltracking/remote/model/Error;", "error", "<init>", "(Lcom/avito/android/calltracking/remote/model/IacResult;Lcom/avito/android/calltracking/remote/model/GsmResult;Lcom/avito/android/calltracking/remote/model/Error;)V", "Lcom/avito/android/calltracking/remote/model/IacResult;", "e", "()Lcom/avito/android/calltracking/remote/model/IacResult;", "Lcom/avito/android/calltracking/remote/model/GsmResult;", "d", "()Lcom/avito/android/calltracking/remote/model/GsmResult;", "Lcom/avito/android/calltracking/remote/model/Error;", "c", "()Lcom/avito/android/calltracking/remote/model/Error;", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MessengerRecallContactMethodResultForApi implements Parcelable {

    @k
    public static final Parcelable.Creator<MessengerRecallContactMethodResultForApi> CREATOR = new a();

    @c("error")
    @l
    private final Error error;

    @c("gsmResult")
    @l
    private final GsmResult gsmResult;

    @c("iacResult")
    @l
    private final IacResult iacResult;

    /* compiled from: MessengerPhoneCallResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MessengerRecallContactMethodResultForApi> {
        @Override // android.os.Parcelable.Creator
        public final MessengerRecallContactMethodResultForApi createFromParcel(Parcel parcel) {
            return new MessengerRecallContactMethodResultForApi(parcel.readInt() == 0 ? null : IacResult.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GsmResult.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Error.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessengerRecallContactMethodResultForApi[] newArray(int i12) {
            return new MessengerRecallContactMethodResultForApi[i12];
        }
    }

    public MessengerRecallContactMethodResultForApi(@l IacResult iacResult, @l GsmResult gsmResult, @l Error error) {
        this.iacResult = iacResult;
        this.gsmResult = gsmResult;
        this.error = error;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final GsmResult getGsmResult() {
        return this.gsmResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final IacResult getIacResult() {
        return this.iacResult;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessengerRecallContactMethodResultForApi)) {
            return false;
        }
        MessengerRecallContactMethodResultForApi messengerRecallContactMethodResultForApi = (MessengerRecallContactMethodResultForApi) obj;
        return L.f(this.iacResult, messengerRecallContactMethodResultForApi.iacResult) && L.f(this.gsmResult, messengerRecallContactMethodResultForApi.gsmResult) && L.f(this.error, messengerRecallContactMethodResultForApi.error);
    }

    public final int hashCode() {
        IacResult iacResult = this.iacResult;
        int iHashCode = (iacResult == null ? 0 : iacResult.hashCode()) * 31;
        GsmResult gsmResult = this.gsmResult;
        int iHashCode2 = (iHashCode + (gsmResult == null ? 0 : gsmResult.hashCode())) * 31;
        Error error = this.error;
        return iHashCode2 + (error != null ? error.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "MessengerRecallContactMethodResultForApi(iacResult=" + this.iacResult + ", gsmResult=" + this.gsmResult + ", error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        IacResult iacResult = this.iacResult;
        if (iacResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iacResult.writeToParcel(parcel, i12);
        }
        GsmResult gsmResult = this.gsmResult;
        if (gsmResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gsmResult.writeToParcel(parcel, i12);
        }
        Error error = this.error;
        if (error == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            error.writeToParcel(parcel, i12);
        }
    }
}
