package com.vk.push.core.auth;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AuthorizedResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/core/auth/AuthorizedResult;", "Landroid/os/Parcelable;", "CREATOR", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AuthorizedResult implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f367004b;

    /* compiled from: AuthorizedResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/auth/AuthorizedResult$a;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/auth/AuthorizedResult;", "<init>", "()V", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: com.vk.push.core.auth.AuthorizedResult$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<AuthorizedResult> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorizedResult createFromParcel(Parcel parcel) {
            return new AuthorizedResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorizedResult[] newArray(int i12) {
            return new AuthorizedResult[i12];
        }

        public Companion() {
        }
    }

    public AuthorizedResult(@k Parcel parcel) {
        this.f367004b = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthorizedResult) && this.f367004b == ((AuthorizedResult) obj).f367004b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f367004b);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("AuthorizedResult(isAuthorized="), this.f367004b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeByte(this.f367004b ? (byte) 1 : (byte) 0);
    }
}
