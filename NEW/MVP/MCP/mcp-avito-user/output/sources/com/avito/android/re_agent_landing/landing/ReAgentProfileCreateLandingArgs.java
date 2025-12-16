package com.avito.android.re_agent_landing.landing;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentProfileCreateLandingArgs.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/ReAgentProfileCreateLandingArgs;", "Landroid/os/Parcelable;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ReAgentProfileCreateLandingArgs implements Parcelable {

    @k
    public static final Parcelable.Creator<ReAgentProfileCreateLandingArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250555b;

    /* compiled from: ReAgentProfileCreateLandingArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReAgentProfileCreateLandingArgs> {
        @Override // android.os.Parcelable.Creator
        public final ReAgentProfileCreateLandingArgs createFromParcel(Parcel parcel) {
            return new ReAgentProfileCreateLandingArgs(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReAgentProfileCreateLandingArgs[] newArray(int i12) {
            return new ReAgentProfileCreateLandingArgs[i12];
        }
    }

    public ReAgentProfileCreateLandingArgs(@k String str) {
        this.f250555b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReAgentProfileCreateLandingArgs) && L.f(this.f250555b, ((ReAgentProfileCreateLandingArgs) obj).f250555b);
    }

    public final int hashCode() {
        return this.f250555b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ReAgentProfileCreateLandingArgs(fromPage="), this.f250555b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f250555b);
    }
}
