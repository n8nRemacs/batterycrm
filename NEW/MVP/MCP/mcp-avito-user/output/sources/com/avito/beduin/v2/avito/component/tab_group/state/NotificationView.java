package com.avito.beduin.v2.avito.component.tab_group.state;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoTabGroupState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/tab_group/state/NotificationView;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationView {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ NotificationView[] f335263b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f335264c;

    static {
        NotificationView[] notificationViewArr = {new NotificationView("CounterStandard", 0), new NotificationView("CounterProminent", 1), new NotificationView("Point", 2), new NotificationView("CounterStandardWithPoint", 3)};
        f335263b = notificationViewArr;
        f335264c = kotlin.enums.c.a(notificationViewArr);
    }

    public NotificationView() {
        throw null;
    }

    public static NotificationView valueOf(String str) {
        return (NotificationView) Enum.valueOf(NotificationView.class, str);
    }

    public static NotificationView[] values() {
        return (NotificationView[]) f335263b.clone();
    }
}
