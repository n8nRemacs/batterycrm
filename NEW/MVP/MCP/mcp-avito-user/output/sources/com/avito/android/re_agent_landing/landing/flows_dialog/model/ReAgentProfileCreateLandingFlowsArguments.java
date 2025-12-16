package com.avito.android.re_agent_landing.landing.flows_dialog.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.re_agent_landing.landing.items.action_block.ReAgentProfileCreateLandingFlowsData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentProfileCreateLandingFlowsArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/model/ReAgentProfileCreateLandingFlowsArguments;", "Landroid/os/Parcelable;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ReAgentProfileCreateLandingFlowsArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ReAgentProfileCreateLandingFlowsArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ReAgentProfileCreateLandingFlowsData f250673b;

    /* compiled from: ReAgentProfileCreateLandingFlowsArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReAgentProfileCreateLandingFlowsArguments> {
        @Override // android.os.Parcelable.Creator
        public final ReAgentProfileCreateLandingFlowsArguments createFromParcel(Parcel parcel) {
            return new ReAgentProfileCreateLandingFlowsArguments(ReAgentProfileCreateLandingFlowsData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ReAgentProfileCreateLandingFlowsArguments[] newArray(int i12) {
            return new ReAgentProfileCreateLandingFlowsArguments[i12];
        }
    }

    public ReAgentProfileCreateLandingFlowsArguments(@k ReAgentProfileCreateLandingFlowsData reAgentProfileCreateLandingFlowsData) {
        this.f250673b = reAgentProfileCreateLandingFlowsData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReAgentProfileCreateLandingFlowsArguments) && L.f(this.f250673b, ((ReAgentProfileCreateLandingFlowsArguments) obj).f250673b);
    }

    public final int hashCode() {
        return this.f250673b.hashCode();
    }

    @k
    public final String toString() {
        return "ReAgentProfileCreateLandingFlowsArguments(data=" + this.f250673b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f250673b.writeToParcel(parcel, i12);
    }
}
