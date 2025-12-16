package com.avito.android.messenger;

import hw.InterfaceC41178c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageDeliveryStatus.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/MessageDeliveryStatus;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageDeliveryStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final MessageDeliveryStatus f186163b;

    /* renamed from: c, reason: collision with root package name */
    public static final MessageDeliveryStatus f186164c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessageDeliveryStatus f186165d;

    /* renamed from: e, reason: collision with root package name */
    public static final MessageDeliveryStatus f186166e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ MessageDeliveryStatus[] f186167f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f186168g;

    static {
        MessageDeliveryStatus messageDeliveryStatus = new MessageDeliveryStatus("SENDING", 0);
        f186163b = messageDeliveryStatus;
        MessageDeliveryStatus messageDeliveryStatus2 = new MessageDeliveryStatus("SENT", 1);
        f186164c = messageDeliveryStatus2;
        MessageDeliveryStatus messageDeliveryStatus3 = new MessageDeliveryStatus("READ", 2);
        f186165d = messageDeliveryStatus3;
        MessageDeliveryStatus messageDeliveryStatus4 = new MessageDeliveryStatus("ERROR", 3);
        f186166e = messageDeliveryStatus4;
        MessageDeliveryStatus[] messageDeliveryStatusArr = {messageDeliveryStatus, messageDeliveryStatus2, messageDeliveryStatus3, messageDeliveryStatus4};
        f186167f = messageDeliveryStatusArr;
        f186168g = kotlin.enums.c.a(messageDeliveryStatusArr);
    }

    public MessageDeliveryStatus() {
        throw null;
    }

    public static MessageDeliveryStatus valueOf(String str) {
        return (MessageDeliveryStatus) Enum.valueOf(MessageDeliveryStatus.class, str);
    }

    public static MessageDeliveryStatus[] values() {
        return (MessageDeliveryStatus[]) f186167f.clone();
    }
}
