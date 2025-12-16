package com.vk.push.core.auth;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AuthTokenResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/core/auth/AuthTokenResult;", "Landroid/os/Parcelable;", "CREATOR", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AuthTokenResult implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f367003b;

    /* compiled from: AuthTokenResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/auth/AuthTokenResult$a;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/auth/AuthTokenResult;", "<init>", "()V", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: com.vk.push.core.auth.AuthTokenResult$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<AuthTokenResult> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final AuthTokenResult createFromParcel(Parcel parcel) {
            return new AuthTokenResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthTokenResult[] newArray(int i12) {
            return new AuthTokenResult[i12];
        }

        public Companion() {
        }
    }

    public AuthTokenResult(@k Parcel parcel) {
        String string = parcel.readString();
        this.f367003b = string == null ? "" : string;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthTokenResult) && L.f(this.f367003b, ((AuthTokenResult) obj).f367003b);
    }

    public final int hashCode() {
        return this.f367003b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("AuthTokenResult(token="), this.f367003b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f367003b);
    }
}
