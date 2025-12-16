package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import j.P;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes10.dex */
final class i extends NetworkConnectionInfo {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkConnectionInfo.NetworkType f343047a;

    /* renamed from: b, reason: collision with root package name */
    public final NetworkConnectionInfo.MobileSubtype f343048b;

    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    public static final class b extends NetworkConnectionInfo.a {

        /* renamed from: a, reason: collision with root package name */
        public NetworkConnectionInfo.NetworkType f343049a;

        /* renamed from: b, reason: collision with root package name */
        public NetworkConnectionInfo.MobileSubtype f343050b;

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.a
        public final NetworkConnectionInfo a() {
            return new i(this.f343049a, this.f343050b, null);
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.a
        public final NetworkConnectionInfo.a b(@P NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f343050b = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.a
        public final NetworkConnectionInfo.a c(@P NetworkConnectionInfo.NetworkType networkType) {
            this.f343049a = networkType;
            return this;
        }
    }

    public i(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype, a aVar) {
        this.f343047a = networkType;
        this.f343048b = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @P
    public final NetworkConnectionInfo.MobileSubtype b() {
        return this.f343048b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @P
    public final NetworkConnectionInfo.NetworkType c() {
        return this.f343047a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f343047a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.c()) : networkConnectionInfo.c() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f343048b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.b() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.f343047a;
        int iHashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f343048b;
        return (mobileSubtype != null ? mobileSubtype.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f343047a + ", mobileSubtype=" + this.f343048b + "}";
    }
}
