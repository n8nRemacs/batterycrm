package com.avito.android.clientEventBus;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConnectionState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/clientEventBus/ConnectionState;", "", "_avito_client-event-bus_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConnectionState {

    /* renamed from: b, reason: collision with root package name */
    public static final ConnectionState f118528b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConnectionState f118529c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ConnectionState[] f118530d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f118531e;

    static {
        ConnectionState connectionState = new ConnectionState("Connected", 0);
        f118528b = connectionState;
        ConnectionState connectionState2 = new ConnectionState("Disconnected", 1);
        f118529c = connectionState2;
        ConnectionState[] connectionStateArr = {connectionState, connectionState2};
        f118530d = connectionStateArr;
        f118531e = kotlin.enums.c.a(connectionStateArr);
    }

    public ConnectionState() {
        throw null;
    }

    public static ConnectionState valueOf(String str) {
        return (ConnectionState) Enum.valueOf(ConnectionState.class, str);
    }

    public static ConnectionState[] values() {
        return (ConnectionState[]) f118530d.clone();
    }
}
