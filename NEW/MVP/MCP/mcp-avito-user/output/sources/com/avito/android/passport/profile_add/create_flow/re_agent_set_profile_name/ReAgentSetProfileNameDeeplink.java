package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ReAgentSetProfileNameDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/ReAgentSetProfileNameDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class ReAgentSetProfileNameDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<ReAgentSetProfileNameDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f211379b;

    /* renamed from: c, reason: collision with root package name */
    public final int f211380c;

    /* renamed from: d, reason: collision with root package name */
    public final int f211381d;

    /* compiled from: ReAgentSetProfileNameDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReAgentSetProfileNameDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final ReAgentSetProfileNameDeeplink createFromParcel(Parcel parcel) {
            return new ReAgentSetProfileNameDeeplink(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ReAgentSetProfileNameDeeplink[] newArray(int i12) {
            return new ReAgentSetProfileNameDeeplink[i12];
        }
    }

    public ReAgentSetProfileNameDeeplink(@k String str, int i12, int i13) {
        this.f211379b = str;
        this.f211380c = i12;
        this.f211381d = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReAgentSetProfileNameDeeplink)) {
            return false;
        }
        ReAgentSetProfileNameDeeplink reAgentSetProfileNameDeeplink = (ReAgentSetProfileNameDeeplink) obj;
        return L.f(this.f211379b, reAgentSetProfileNameDeeplink.f211379b) && this.f211380c == reAgentSetProfileNameDeeplink.f211380c && this.f211381d == reAgentSetProfileNameDeeplink.f211381d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f211381d) + r.e(this.f211380c, this.f211379b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReAgentSetProfileNameDeeplink(flow=");
        sb2.append(this.f211379b);
        sb2.append(", verticalId=");
        sb2.append(this.f211380c);
        sb2.append(", specificId=");
        return r.t(sb2, this.f211381d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f211379b);
        parcel.writeInt(this.f211380c);
        parcel.writeInt(this.f211381d);
    }
}
