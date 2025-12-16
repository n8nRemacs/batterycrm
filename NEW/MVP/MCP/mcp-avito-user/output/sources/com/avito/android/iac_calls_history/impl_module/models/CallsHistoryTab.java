package com.avito.android.iac_calls_history.impl_module.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: CallsHistoryTab.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/models/CallsHistoryTab;", "Landroid/os/Parcelable;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CallsHistoryTab implements Parcelable {

    @k
    public static final Parcelable.Creator<CallsHistoryTab> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CallsHistoryTabType f164753b;

    /* renamed from: c, reason: collision with root package name */
    public final int f164754c;

    /* compiled from: CallsHistoryTab.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CallsHistoryTab> {
        @Override // android.os.Parcelable.Creator
        public final CallsHistoryTab createFromParcel(Parcel parcel) {
            return new CallsHistoryTab(CallsHistoryTabType.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsHistoryTab[] newArray(int i12) {
            return new CallsHistoryTab[i12];
        }
    }

    public CallsHistoryTab(@k CallsHistoryTabType callsHistoryTabType, int i12) {
        this.f164753b = callsHistoryTabType;
        this.f164754c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsHistoryTab)) {
            return false;
        }
        CallsHistoryTab callsHistoryTab = (CallsHistoryTab) obj;
        return this.f164753b == callsHistoryTab.f164753b && this.f164754c == callsHistoryTab.f164754c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f164754c) + (this.f164753b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallsHistoryTab(type=");
        sb2.append(this.f164753b);
        sb2.append(", counter=");
        return r.t(sb2, this.f164754c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f164753b.name());
        parcel.writeInt(this.f164754c);
    }
}
