package io.ktor.client.plugins.logging;

import kotlin.Metadata;

/* compiled from: LogLevel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/logging/LogLevel;", "", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum LogLevel {
    /* JADX INFO: Fake field, exist only in values array */
    EF6(true, true, true),
    f399489e(true, true, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(true, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(true, false, false),
    f399490f(false, false, false);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f399492b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f399493c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f399494d;

    LogLevel(boolean z12, boolean z13, boolean z14) {
        this.f399492b = z12;
        this.f399493c = z13;
        this.f399494d = z14;
    }
}
