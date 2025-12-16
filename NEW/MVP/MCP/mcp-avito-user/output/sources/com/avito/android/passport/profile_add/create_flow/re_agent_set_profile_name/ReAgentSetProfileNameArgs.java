package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentSetProfileNameArgs.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/ReAgentSetProfileNameArgs;", "Landroid/os/Parcelable;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ReAgentSetProfileNameArgs implements Parcelable {

    @k
    public static final Parcelable.Creator<ReAgentSetProfileNameArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f211375b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f211376c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f211377d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ProfileCreateExtendedFlow f211378e;

    /* compiled from: ReAgentSetProfileNameArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReAgentSetProfileNameArgs> {
        @Override // android.os.Parcelable.Creator
        public final ReAgentSetProfileNameArgs createFromParcel(Parcel parcel) {
            return new ReAgentSetProfileNameArgs(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (ProfileCreateExtendedFlow) parcel.readParcelable(ReAgentSetProfileNameArgs.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReAgentSetProfileNameArgs[] newArray(int i12) {
            return new ReAgentSetProfileNameArgs[i12];
        }
    }

    public ReAgentSetProfileNameArgs(int i12, @l Integer num, @k String str, @k ProfileCreateExtendedFlow profileCreateExtendedFlow) {
        this.f211375b = i12;
        this.f211376c = num;
        this.f211377d = str;
        this.f211378e = profileCreateExtendedFlow;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReAgentSetProfileNameArgs)) {
            return false;
        }
        ReAgentSetProfileNameArgs reAgentSetProfileNameArgs = (ReAgentSetProfileNameArgs) obj;
        return this.f211375b == reAgentSetProfileNameArgs.f211375b && L.f(this.f211376c, reAgentSetProfileNameArgs.f211376c) && L.f(this.f211377d, reAgentSetProfileNameArgs.f211377d) && L.f(this.f211378e, reAgentSetProfileNameArgs.f211378e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f211375b) * 31;
        Integer num = this.f211376c;
        return this.f211378e.hashCode() + H.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f211377d);
    }

    @k
    public final String toString() {
        return "ReAgentSetProfileNameArgs(verticalId=" + this.f211375b + ", specificId=" + this.f211376c + ", constructorRequestId=" + this.f211377d + ", flow=" + this.f211378e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f211375b);
        Integer num = this.f211376c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f211377d);
        parcel.writeParcelable(this.f211378e, i12);
    }
}
