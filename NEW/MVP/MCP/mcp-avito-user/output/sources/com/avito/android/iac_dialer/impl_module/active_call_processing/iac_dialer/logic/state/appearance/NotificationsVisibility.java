package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationsVisibility.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/NotificationsVisibility;", "", "LdL/d;", "", "common", "reserve", "<init>", "(Ljava/lang/String;IZZ)V", "Z", "getCommon", "()Z", "getReserve", "NONE", "COMMON", "RESERVE", "COMMON_AND_RESERVE", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NotificationsVisibility implements dL.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ NotificationsVisibility[] $VALUES;
    private final boolean common;
    private final boolean reserve;
    public static final NotificationsVisibility NONE = new NotificationsVisibility("NONE", 0, false, false);
    public static final NotificationsVisibility COMMON = new NotificationsVisibility("COMMON", 1, true, false);
    public static final NotificationsVisibility RESERVE = new NotificationsVisibility("RESERVE", 2, false, true);
    public static final NotificationsVisibility COMMON_AND_RESERVE = new NotificationsVisibility("COMMON_AND_RESERVE", 3, true, true);

    private static final /* synthetic */ NotificationsVisibility[] $values() {
        return new NotificationsVisibility[]{NONE, COMMON, RESERVE, COMMON_AND_RESERVE};
    }

    static {
        NotificationsVisibility[] notificationsVisibilityArr$values = $values();
        $VALUES = notificationsVisibilityArr$values;
        $ENTRIES = kotlin.enums.c.a(notificationsVisibilityArr$values);
    }

    private NotificationsVisibility(String str, int i12, boolean z12, boolean z13) {
        this.common = z12;
        this.reserve = z13;
    }

    @Y61.k
    public static kotlin.enums.a<NotificationsVisibility> getEntries() {
        return $ENTRIES;
    }

    public static NotificationsVisibility valueOf(String str) {
        return (NotificationsVisibility) Enum.valueOf(NotificationsVisibility.class, str);
    }

    public static NotificationsVisibility[] values() {
        return (NotificationsVisibility[]) $VALUES.clone();
    }

    public final boolean getCommon() {
        return this.common;
    }

    public final boolean getReserve() {
        return this.reserve;
    }
}
