package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConnectionQuality.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/ConnectionQuality;", "", "LdL/d;", "<init>", "(Ljava/lang/String;I)V", "NO_DATA", "OK", "UNSTABLE", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ConnectionQuality implements dL.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ ConnectionQuality[] $VALUES;
    public static final ConnectionQuality NO_DATA = new ConnectionQuality("NO_DATA", 0);

    /* renamed from: OK, reason: collision with root package name */
    public static final ConnectionQuality f165511OK = new ConnectionQuality("OK", 1);
    public static final ConnectionQuality UNSTABLE = new ConnectionQuality("UNSTABLE", 2);

    private static final /* synthetic */ ConnectionQuality[] $values() {
        return new ConnectionQuality[]{NO_DATA, f165511OK, UNSTABLE};
    }

    static {
        ConnectionQuality[] connectionQualityArr$values = $values();
        $VALUES = connectionQualityArr$values;
        $ENTRIES = kotlin.enums.c.a(connectionQualityArr$values);
    }

    private ConnectionQuality(String str, int i12) {
    }

    @Y61.k
    public static kotlin.enums.a<ConnectionQuality> getEntries() {
        return $ENTRIES;
    }

    public static ConnectionQuality valueOf(String str) {
        return (ConnectionQuality) Enum.valueOf(ConnectionQuality.class, str);
    }

    public static ConnectionQuality[] values() {
        return (ConnectionQuality[]) $VALUES.clone();
    }
}
