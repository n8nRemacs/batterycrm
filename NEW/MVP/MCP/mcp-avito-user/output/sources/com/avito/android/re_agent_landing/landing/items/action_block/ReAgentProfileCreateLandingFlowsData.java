package com.avito.android.re_agent_landing.landing.items.action_block;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActionBlockItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/action_block/ReAgentProfileCreateLandingFlowsData;", "Landroid/os/Parcelable;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ReAgentProfileCreateLandingFlowsData implements Parcelable {

    @k
    public static final Parcelable.Creator<ReAgentProfileCreateLandingFlowsData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250728b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CreationFlow f250729c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CreationFlow f250730d;

    /* compiled from: ActionBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReAgentProfileCreateLandingFlowsData> {
        @Override // android.os.Parcelable.Creator
        public final ReAgentProfileCreateLandingFlowsData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Parcelable.Creator<CreationFlow> creator = CreationFlow.CREATOR;
            return new ReAgentProfileCreateLandingFlowsData(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ReAgentProfileCreateLandingFlowsData[] newArray(int i12) {
            return new ReAgentProfileCreateLandingFlowsData[i12];
        }
    }

    public ReAgentProfileCreateLandingFlowsData(@k String str, @k CreationFlow creationFlow, @k CreationFlow creationFlow2) {
        this.f250728b = str;
        this.f250729c = creationFlow;
        this.f250730d = creationFlow2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReAgentProfileCreateLandingFlowsData)) {
            return false;
        }
        ReAgentProfileCreateLandingFlowsData reAgentProfileCreateLandingFlowsData = (ReAgentProfileCreateLandingFlowsData) obj;
        return L.f(this.f250728b, reAgentProfileCreateLandingFlowsData.f250728b) && L.f(this.f250729c, reAgentProfileCreateLandingFlowsData.f250729c) && L.f(this.f250730d, reAgentProfileCreateLandingFlowsData.f250730d);
    }

    public final int hashCode() {
        return this.f250730d.hashCode() + ((this.f250729c.hashCode() + (this.f250728b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "ReAgentProfileCreateLandingFlowsData(title=" + this.f250728b + ", upgradeFlow=" + this.f250729c + ", createFlow=" + this.f250730d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f250728b);
        this.f250729c.writeToParcel(parcel, i12);
        this.f250730d.writeToParcel(parcel, i12);
    }
}
