package com.avito.android.user_adverts.tab_actions.info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.user_adverts.model.UserAdvertActionPendingResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsActionResultInfo.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/info/UserAdvertsActionResultInfo;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsActionResultInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsActionResultInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UserAdvertActionPendingResult.Info f314611b;

    /* compiled from: UserAdvertsActionResultInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsActionResultInfo> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsActionResultInfo createFromParcel(Parcel parcel) {
            return new UserAdvertsActionResultInfo(UserAdvertActionPendingResult.Info.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsActionResultInfo[] newArray(int i12) {
            return new UserAdvertsActionResultInfo[i12];
        }
    }

    public UserAdvertsActionResultInfo(@k UserAdvertActionPendingResult.Info info) {
        this.f314611b = info;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserAdvertsActionResultInfo) && L.f(this.f314611b, ((UserAdvertsActionResultInfo) obj).f314611b);
    }

    public final int hashCode() {
        return this.f314611b.hashCode();
    }

    @k
    public final String toString() {
        return "UserAdvertsActionResultInfo(result=" + this.f314611b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f314611b.writeToParcel(parcel, i12);
    }
}
