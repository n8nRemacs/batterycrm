package com.vk.push.common.messaging;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationResourceType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/push/common/messaging/NotificationResourceType;", "", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationResourceType {

    /* renamed from: b, reason: collision with root package name */
    public static final NotificationResourceType f366987b;

    /* renamed from: c, reason: collision with root package name */
    public static final NotificationResourceType f366988c;

    /* renamed from: d, reason: collision with root package name */
    public static final NotificationResourceType f366989d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ NotificationResourceType[] f366990e;

    static {
        NotificationResourceType notificationResourceType = new NotificationResourceType("MANIFEST", 0);
        f366987b = notificationResourceType;
        NotificationResourceType notificationResourceType2 = new NotificationResourceType("DEFAULT_SDK", 1);
        f366988c = notificationResourceType2;
        NotificationResourceType notificationResourceType3 = new NotificationResourceType("PAYLOAD", 2);
        f366989d = notificationResourceType3;
        f366990e = new NotificationResourceType[]{notificationResourceType, notificationResourceType2, notificationResourceType3, new NotificationResourceType("STUB", 3)};
    }

    public NotificationResourceType() {
        throw null;
    }

    public static NotificationResourceType valueOf(String str) {
        return (NotificationResourceType) Enum.valueOf(NotificationResourceType.class, str);
    }

    public static NotificationResourceType[] values() {
        return (NotificationResourceType[]) f366990e.clone();
    }
}
