package com.avito.avcalls.android.connection_quality;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConnectionQualityStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/connection_quality/ConnectionQualityStatus;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConnectionQualityStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final ConnectionQualityStatus f331677b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConnectionQualityStatus f331678c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConnectionQualityStatus f331679d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ConnectionQualityStatus[] f331680e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f331681f;

    static {
        ConnectionQualityStatus connectionQualityStatus = new ConnectionQualityStatus("NO_DATA", 0);
        f331677b = connectionQualityStatus;
        ConnectionQualityStatus connectionQualityStatus2 = new ConnectionQualityStatus("OK", 1);
        f331678c = connectionQualityStatus2;
        ConnectionQualityStatus connectionQualityStatus3 = new ConnectionQualityStatus("UNSTABLE", 2);
        f331679d = connectionQualityStatus3;
        ConnectionQualityStatus[] connectionQualityStatusArr = {connectionQualityStatus, connectionQualityStatus2, connectionQualityStatus3};
        f331680e = connectionQualityStatusArr;
        f331681f = kotlin.enums.c.a(connectionQualityStatusArr);
    }

    public ConnectionQualityStatus() {
        throw null;
    }

    public static ConnectionQualityStatus valueOf(String str) {
        return (ConnectionQualityStatus) Enum.valueOf(ConnectionQualityStatus.class, str);
    }

    public static ConnectionQualityStatus[] values() {
        return (ConnectionQualityStatus[]) f331680e.clone();
    }
}
