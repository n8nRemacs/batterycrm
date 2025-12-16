package com.avito.android.messenger.analytics;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SendMessageAttemptEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/ServerConnectionType;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ServerConnectionType {

    /* renamed from: c, reason: collision with root package name */
    public static final ServerConnectionType f186248c;

    /* renamed from: d, reason: collision with root package name */
    public static final ServerConnectionType f186249d;

    /* renamed from: e, reason: collision with root package name */
    public static final ServerConnectionType f186250e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ServerConnectionType[] f186251f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f186252g;

    /* renamed from: b, reason: collision with root package name */
    public final int f186253b;

    static {
        ServerConnectionType serverConnectionType = new ServerConnectionType("NONE", 0, 0);
        f186248c = serverConnectionType;
        ServerConnectionType serverConnectionType2 = new ServerConnectionType("SOCKET", 1, 1);
        f186249d = serverConnectionType2;
        ServerConnectionType serverConnectionType3 = new ServerConnectionType("FALLBACK", 2, 2);
        f186250e = serverConnectionType3;
        ServerConnectionType[] serverConnectionTypeArr = {serverConnectionType, serverConnectionType2, serverConnectionType3};
        f186251f = serverConnectionTypeArr;
        f186252g = kotlin.enums.c.a(serverConnectionTypeArr);
    }

    public ServerConnectionType(String str, int i12, int i13) {
        this.f186253b = i13;
    }

    public static ServerConnectionType valueOf(String str) {
        return (ServerConnectionType) Enum.valueOf(ServerConnectionType.class, str);
    }

    public static ServerConnectionType[] values() {
        return (ServerConnectionType[]) f186251f.clone();
    }
}
