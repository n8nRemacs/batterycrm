package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ClientInfo;
import j.P;

/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes10.dex */
final class e extends ClientInfo {

    /* renamed from: a, reason: collision with root package name */
    public final ClientInfo.ClientType f343014a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.datatransport.cct.internal.a f343015b;

    /* compiled from: AutoValue_ClientInfo.java */
    public static final class b extends ClientInfo.a {

        /* renamed from: a, reason: collision with root package name */
        public ClientInfo.ClientType f343016a;

        /* renamed from: b, reason: collision with root package name */
        public com.google.android.datatransport.cct.internal.a f343017b;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.a
        public final ClientInfo a() {
            return new e(this.f343016a, this.f343017b, null);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.a
        public final ClientInfo.a b(@P com.google.android.datatransport.cct.internal.a aVar) {
            this.f343017b = aVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.a
        public final ClientInfo.a c() {
            this.f343016a = ClientInfo.ClientType.f342943b;
            return this;
        }
    }

    public e(ClientInfo.ClientType clientType, com.google.android.datatransport.cct.internal.a aVar, a aVar2) {
        this.f343014a = clientType;
        this.f343015b = aVar;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @P
    public final com.google.android.datatransport.cct.internal.a b() {
        return this.f343015b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @P
    public final ClientInfo.ClientType c() {
        return this.f343014a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f343014a;
        if (clientType != null ? clientType.equals(clientInfo.c()) : clientInfo.c() == null) {
            com.google.android.datatransport.cct.internal.a aVar = this.f343015b;
            if (aVar == null) {
                if (clientInfo.b() == null) {
                    return true;
                }
            } else if (aVar.equals(clientInfo.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.f343014a;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        com.google.android.datatransport.cct.internal.a aVar = this.f343015b;
        return (aVar != null ? aVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f343014a + ", androidClientInfo=" + this.f343015b + "}";
    }
}
