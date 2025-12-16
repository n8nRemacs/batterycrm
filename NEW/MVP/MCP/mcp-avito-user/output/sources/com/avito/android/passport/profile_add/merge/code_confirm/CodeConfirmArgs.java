package com.avito.android.passport.profile_add.merge.code_confirm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CodeConfirmArgs.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/CodeConfirmArgs;", "Landroid/os/Parcelable;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CodeConfirmArgs implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CodeConfirmArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f212680b;

    /* renamed from: c, reason: collision with root package name */
    public final long f212681c;

    /* compiled from: CodeConfirmArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CodeConfirmArgs> {
        @Override // android.os.Parcelable.Creator
        public final CodeConfirmArgs createFromParcel(Parcel parcel) {
            return new CodeConfirmArgs(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final CodeConfirmArgs[] newArray(int i12) {
            return new CodeConfirmArgs[i12];
        }
    }

    public CodeConfirmArgs(@Y61.k String str, long j12) {
        this.f212680b = str;
        this.f212681c = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CodeConfirmArgs)) {
            return false;
        }
        CodeConfirmArgs codeConfirmArgs = (CodeConfirmArgs) obj;
        return L.f(this.f212680b, codeConfirmArgs.f212680b) && this.f212681c == codeConfirmArgs.f212681c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f212681c) + (this.f212680b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CodeConfirmArgs(phoneNumber=");
        sb2.append(this.f212680b);
        sb2.append(", timeoutEndTimestampSeconds=");
        return r.u(sb2, this.f212681c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f212680b);
        parcel.writeLong(this.f212681c);
    }
}
