package com.avito.android.iac_dialer.impl_module.notifications.new_impl;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IacNotificationManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotificationIdType;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacNotificationIdType {

    /* renamed from: b, reason: collision with root package name */
    public static final IacNotificationIdType f166099b;

    /* renamed from: c, reason: collision with root package name */
    public static final IacNotificationIdType f166100c;

    /* renamed from: d, reason: collision with root package name */
    public static final IacNotificationIdType f166101d;

    /* renamed from: e, reason: collision with root package name */
    public static final IacNotificationIdType f166102e;

    /* renamed from: f, reason: collision with root package name */
    public static final IacNotificationIdType f166103f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ IacNotificationIdType[] f166104g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f166105h;

    static {
        IacNotificationIdType iacNotificationIdType = new IacNotificationIdType("InitializingNormal", 0);
        f166099b = iacNotificationIdType;
        IacNotificationIdType iacNotificationIdType2 = new IacNotificationIdType("IncomingNormal", 1);
        f166100c = iacNotificationIdType2;
        IacNotificationIdType iacNotificationIdType3 = new IacNotificationIdType("IncomingHigh", 2);
        f166101d = iacNotificationIdType3;
        IacNotificationIdType iacNotificationIdType4 = new IacNotificationIdType("OngoingNormal", 3);
        f166102e = iacNotificationIdType4;
        IacNotificationIdType iacNotificationIdType5 = new IacNotificationIdType("OngoingHigh", 4);
        f166103f = iacNotificationIdType5;
        IacNotificationIdType[] iacNotificationIdTypeArr = {iacNotificationIdType, iacNotificationIdType2, iacNotificationIdType3, iacNotificationIdType4, iacNotificationIdType5};
        f166104g = iacNotificationIdTypeArr;
        f166105h = kotlin.enums.c.a(iacNotificationIdTypeArr);
    }

    public IacNotificationIdType() {
        throw null;
    }

    public static IacNotificationIdType valueOf(String str) {
        return (IacNotificationIdType) Enum.valueOf(IacNotificationIdType.class, str);
    }

    public static IacNotificationIdType[] values() {
        return (IacNotificationIdType[]) f166104g.clone();
    }
}
