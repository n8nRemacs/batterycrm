package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentShortFlowCreationArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/model/ReAgentShortFlowCreationArguments;", "Landroid/os/Parcelable;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ReAgentShortFlowCreationArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ReAgentShortFlowCreationArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f211578b;

    /* compiled from: ReAgentShortFlowCreationArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReAgentShortFlowCreationArguments> {
        @Override // android.os.Parcelable.Creator
        public final ReAgentShortFlowCreationArguments createFromParcel(Parcel parcel) {
            return new ReAgentShortFlowCreationArguments((DeepLink) parcel.readParcelable(ReAgentShortFlowCreationArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReAgentShortFlowCreationArguments[] newArray(int i12) {
            return new ReAgentShortFlowCreationArguments[i12];
        }
    }

    public ReAgentShortFlowCreationArguments(@l DeepLink deepLink) {
        this.f211578b = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReAgentShortFlowCreationArguments) && L.f(this.f211578b, ((ReAgentShortFlowCreationArguments) obj).f211578b);
    }

    public final int hashCode() {
        DeepLink deepLink = this.f211578b;
        if (deepLink == null) {
            return 0;
        }
        return deepLink.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("ReAgentShortFlowCreationArguments(navigationBackDeeplink="), this.f211578b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f211578b, i12);
    }
}
