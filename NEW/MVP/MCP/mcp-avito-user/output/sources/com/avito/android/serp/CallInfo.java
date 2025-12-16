package com.avito.android.serp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CallInfo.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/CallInfo;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CallInfo implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CallInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f268358b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DeepLink f268359c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ContactSource f268360d;

    /* compiled from: CallInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CallInfo> {
        @Override // android.os.Parcelable.Creator
        public final CallInfo createFromParcel(Parcel parcel) {
            return new CallInfo(parcel.readString(), (DeepLink) parcel.readParcelable(CallInfo.class.getClassLoader()), ContactSource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final CallInfo[] newArray(int i12) {
            return new CallInfo[i12];
        }
    }

    public CallInfo(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k ContactSource contactSource) {
        this.f268358b = str;
        this.f268359c = deepLink;
        this.f268360d = contactSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallInfo)) {
            return false;
        }
        CallInfo callInfo = (CallInfo) obj;
        return L.f(this.f268358b, callInfo.f268358b) && L.f(this.f268359c, callInfo.f268359c) && this.f268360d == callInfo.f268360d;
    }

    public final int hashCode() {
        return this.f268360d.hashCode() + com.avito.android.actions_sheet.a.e(this.f268359c, this.f268358b.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        return "CallInfo(stringId=" + this.f268358b + ", callLink=" + this.f268359c + ", contactSource=" + this.f268360d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f268358b);
        parcel.writeParcelable(this.f268359c, i12);
        parcel.writeString(this.f268360d.name());
    }
}
