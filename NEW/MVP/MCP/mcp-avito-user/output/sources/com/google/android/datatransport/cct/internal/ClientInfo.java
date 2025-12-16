package com.google.android.datatransport.cct.internal;

import VY0.c;
import com.google.android.datatransport.cct.internal.e;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import j.N;
import j.P;

@VY0.c
/* loaded from: classes10.dex */
public abstract class ClientInfo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ClientType {

        /* renamed from: b, reason: collision with root package name */
        public static final ClientType f342943b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ClientType[] f342944c;

        /* JADX INFO: Fake field, exist only in values array */
        ClientType EF0;

        static {
            ClientType clientType = new ClientType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            ClientType clientType2 = new ClientType("ANDROID_FIREBASE", 1);
            f342943b = clientType2;
            f342944c = new ClientType[]{clientType, clientType2};
        }

        public ClientType() {
            throw null;
        }

        public static ClientType valueOf(String str) {
            return (ClientType) Enum.valueOf(ClientType.class, str);
        }

        public static ClientType[] values() {
            return (ClientType[]) f342944c.clone();
        }
    }

    @c.a
    public static abstract class a {
        @N
        public abstract ClientInfo a();

        @N
        public abstract a b(@P com.google.android.datatransport.cct.internal.a aVar);

        @N
        public abstract a c();
    }

    @N
    public static a a() {
        return new e.b();
    }

    @P
    public abstract com.google.android.datatransport.cct.internal.a b();

    @P
    public abstract ClientType c();
}
