package com.esiasdk.android.data.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import nW0.InterfaceC44345a;

/* compiled from: ClientSessionInfo.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/esiasdk/android/data/network/model/ClientSessionInfo;", "LnW0/a;", "Landroid/os/Parcelable;", "esiasdk-1.1.3(6)_nonPguRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ClientSessionInfo implements InterfaceC44345a, Parcelable {

    @k
    public static final Parcelable.Creator<ClientSessionInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f339683b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f339684c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f339685d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f339686e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f339687f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<String> f339688g;

    /* compiled from: ClientSessionInfo.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClientSessionInfo> {
        @Override // android.os.Parcelable.Creator
        public final ClientSessionInfo createFromParcel(Parcel parcel) {
            return new ClientSessionInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ClientSessionInfo[] newArray(int i12) {
            return new ClientSessionInfo[i12];
        }
    }

    public ClientSessionInfo(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k List<String> list) {
        this.f339683b = str;
        this.f339684c = str2;
        this.f339685d = str3;
        this.f339686e = str4;
        this.f339687f = str5;
        this.f339688g = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientSessionInfo)) {
            return false;
        }
        ClientSessionInfo clientSessionInfo = (ClientSessionInfo) obj;
        return L.f(this.f339683b, clientSessionInfo.f339683b) && L.f(this.f339684c, clientSessionInfo.f339684c) && L.f(this.f339685d, clientSessionInfo.f339685d) && L.f(this.f339686e, clientSessionInfo.f339686e) && L.f(this.f339687f, clientSessionInfo.f339687f) && L.f(this.f339688g, clientSessionInfo.f339688g);
    }

    public final int hashCode() {
        return this.f339688g.hashCode() + H.d(H.d(H.d(H.d(this.f339683b.hashCode() * 31, 31, this.f339684c), 31, this.f339685d), 31, this.f339686e), 31, this.f339687f);
    }

    @k
    public final String toString() {
        return "ClientSessionInfo(clientId=" + this.f339683b + ", clientSecret=" + this.f339684c + ", time=" + this.f339685d + ", state=" + this.f339686e + ", redirectUrl=" + this.f339687f + ", scopes=" + this.f339688g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f339683b);
        parcel.writeString(this.f339684c);
        parcel.writeString(this.f339685d);
        parcel.writeString(this.f339686e);
        parcel.writeString(this.f339687f);
        parcel.writeStringList(this.f339688g);
    }
}
