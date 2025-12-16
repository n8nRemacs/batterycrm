package com.avito.android.socketEvents;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConnectionState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/socketEvents/ConnectionState;", "", "_avito_socket-events_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectionState {

    /* renamed from: b, reason: collision with root package name */
    public static final ConnectionState f284728b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConnectionState f284729c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ConnectionState[] f284730d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f284731e;

    static {
        ConnectionState connectionState = new ConnectionState("Connected", 0);
        f284728b = connectionState;
        ConnectionState connectionState2 = new ConnectionState("Disconnected", 1);
        f284729c = connectionState2;
        ConnectionState[] connectionStateArr = {connectionState, connectionState2};
        f284730d = connectionStateArr;
        f284731e = c.a(connectionStateArr);
    }

    public ConnectionState() {
        throw null;
    }

    public static ConnectionState valueOf(String str) {
        return (ConnectionState) Enum.valueOf(ConnectionState.class, str);
    }

    public static ConnectionState[] values() {
        return (ConnectionState[]) f284730d.clone();
    }
}
