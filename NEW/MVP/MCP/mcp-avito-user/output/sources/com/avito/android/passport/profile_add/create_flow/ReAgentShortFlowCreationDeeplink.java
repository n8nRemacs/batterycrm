package com.avito.android.passport.profile_add.create_flow;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ReAgentShortFlowCreationDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/ReAgentShortFlowCreationDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class ReAgentShortFlowCreationDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<ReAgentShortFlowCreationDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f211337b;

    /* compiled from: ReAgentShortFlowCreationDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReAgentShortFlowCreationDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final ReAgentShortFlowCreationDeeplink createFromParcel(Parcel parcel) {
            return new ReAgentShortFlowCreationDeeplink((DeepLink) parcel.readParcelable(ReAgentShortFlowCreationDeeplink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReAgentShortFlowCreationDeeplink[] newArray(int i12) {
            return new ReAgentShortFlowCreationDeeplink[i12];
        }
    }

    public ReAgentShortFlowCreationDeeplink(@l DeepLink deepLink) {
        this.f211337b = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReAgentShortFlowCreationDeeplink) && L.f(this.f211337b, ((ReAgentShortFlowCreationDeeplink) obj).f211337b);
    }

    public final int hashCode() {
        DeepLink deepLink = this.f211337b;
        if (deepLink == null) {
            return 0;
        }
        return deepLink.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("ReAgentShortFlowCreationDeeplink(navigationBackDeeplink="), this.f211337b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f211337b, i12);
    }
}
