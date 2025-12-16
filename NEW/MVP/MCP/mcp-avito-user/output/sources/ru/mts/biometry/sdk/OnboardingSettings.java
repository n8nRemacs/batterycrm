package ru.mts.biometry.sdk;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import z91.u;

@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/mts/biometry/sdk/OnboardingSettings;", "Landroid/os/Parcelable;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OnboardingSettings implements Parcelable {

    @k
    public static final Parcelable.Creator<OnboardingSettings> CREATOR = new u();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f436370b;

    public OnboardingSettings() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnboardingSettings) && this.f436370b == ((OnboardingSettings) obj).f436370b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f436370b);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("OnboardingSettings(isSelfieOnboardingEnabled="), this.f436370b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f436370b ? 1 : 0);
    }

    public OnboardingSettings(boolean z12) {
        this.f436370b = z12;
    }

    public /* synthetic */ OnboardingSettings(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12);
    }
}
