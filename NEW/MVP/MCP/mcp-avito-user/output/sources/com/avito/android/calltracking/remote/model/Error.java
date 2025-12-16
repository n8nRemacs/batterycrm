package com.avito.android.calltracking.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessengerPhoneCallResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/calltracking/remote/model/Error;", "Landroid/os/Parcelable;", "", "code", "", "message", "<init>", "(ILjava/lang/String;)V", "I", "getCode", "()I", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Error implements Parcelable {

    @k
    public static final Parcelable.Creator<Error> CREATOR = new a();

    @c("code")
    private final int code;

    @c("message")
    @k
    private final String message;

    /* compiled from: MessengerPhoneCallResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Error> {
        @Override // android.os.Parcelable.Creator
        public final Error createFromParcel(Parcel parcel) {
            return new Error(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Error[] newArray(int i12) {
            return new Error[i12];
        }
    }

    public Error(int i12, @k String str) {
        this.code = i12;
        this.message = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return false;
        }
        Error error = (Error) obj;
        return this.code == error.code && L.f(this.message, error.message);
    }

    @k
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.message.hashCode() + (Integer.hashCode(this.code) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Error(code=");
        sb2.append(this.code);
        sb2.append(", message=");
        return C22026a.c(sb2, this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.code);
        parcel.writeString(this.message);
    }
}
