package com.avito.android.remote;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: SaveResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/RecallMeError;", "Landroid/os/Parcelable;", "", "code", "", "message", "<init>", "(ILjava/lang/String;)V", "I", "c", "()I", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_recall-me"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RecallMeError implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RecallMeError> CREATOR = new a();

    @com.google.gson.annotations.c("code")
    private final int code;

    @com.google.gson.annotations.c("message")
    @Y61.k
    private final String message;

    /* compiled from: SaveResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecallMeError> {
        @Override // android.os.Parcelable.Creator
        public final RecallMeError createFromParcel(Parcel parcel) {
            return new RecallMeError(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecallMeError[] newArray(int i12) {
            return new RecallMeError[i12];
        }
    }

    public RecallMeError(int i12, @Y61.k String str) {
        this.code = i12;
        this.message = str;
    }

    /* renamed from: c, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecallMeError)) {
            return false;
        }
        RecallMeError recallMeError = (RecallMeError) obj;
        return this.code == recallMeError.code && kotlin.jvm.internal.L.f(this.message, recallMeError.message);
    }

    @Y61.k
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.message.hashCode() + (Integer.hashCode(this.code) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecallMeError(code=");
        sb2.append(this.code);
        sb2.append(", message=");
        return C22026a.c(sb2, this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.code);
        parcel.writeString(this.message);
    }
}
