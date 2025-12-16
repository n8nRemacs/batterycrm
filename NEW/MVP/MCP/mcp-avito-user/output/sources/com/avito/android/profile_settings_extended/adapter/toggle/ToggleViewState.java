package com.avito.android.profile_settings_extended.adapter.toggle;

import Rb0.InterfaceC15025a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ToggleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/toggle/ToggleViewState;", "Landroid/os/Parcelable;", "LRb0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ToggleViewState implements Parcelable, InterfaceC15025a {

    @k
    public static final Parcelable.Creator<ToggleViewState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f229868b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f229869c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f229870d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f229871e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f229872f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f229873g;

    /* compiled from: ToggleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ToggleViewState> {
        @Override // android.os.Parcelable.Creator
        public final ToggleViewState createFromParcel(Parcel parcel) {
            return new ToggleViewState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ToggleViewState[] newArray(int i12) {
            return new ToggleViewState[i12];
        }
    }

    public ToggleViewState(@l String str, @l String str2, @l String str3, boolean z12, boolean z13, boolean z14) {
        this.f229868b = str;
        this.f229869c = str2;
        this.f229870d = str3;
        this.f229871e = z12;
        this.f229872f = z13;
        this.f229873g = z14;
    }

    public static ToggleViewState a(ToggleViewState toggleViewState, boolean z12, boolean z13, int i12) {
        String str = toggleViewState.f229868b;
        String str2 = toggleViewState.f229869c;
        String str3 = toggleViewState.f229870d;
        if ((i12 & 8) != 0) {
            z12 = toggleViewState.f229871e;
        }
        boolean z14 = toggleViewState.f229873g;
        toggleViewState.getClass();
        return new ToggleViewState(str, str2, str3, z12, z13, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToggleViewState)) {
            return false;
        }
        ToggleViewState toggleViewState = (ToggleViewState) obj;
        return L.f(this.f229868b, toggleViewState.f229868b) && L.f(this.f229869c, toggleViewState.f229869c) && L.f(this.f229870d, toggleViewState.f229870d) && this.f229871e == toggleViewState.f229871e && this.f229872f == toggleViewState.f229872f && this.f229873g == toggleViewState.f229873g;
    }

    public final int hashCode() {
        String str = this.f229868b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f229869c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f229870d;
        return Boolean.hashCode(this.f229873g) + r.i(r.i((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f229871e), 31, this.f229872f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToggleViewState(title=");
        sb2.append(this.f229868b);
        sb2.append(", label=");
        sb2.append(this.f229869c);
        sb2.append(", hint=");
        sb2.append(this.f229870d);
        sb2.append(", isChecked=");
        sb2.append(this.f229871e);
        sb2.append(", isSwitcherEnabled=");
        sb2.append(this.f229872f);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229873g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229868b);
        parcel.writeString(this.f229869c);
        parcel.writeString(this.f229870d);
        parcel.writeInt(this.f229871e ? 1 : 0);
        parcel.writeInt(this.f229872f ? 1 : 0);
        parcel.writeInt(this.f229873g ? 1 : 0);
    }
}
