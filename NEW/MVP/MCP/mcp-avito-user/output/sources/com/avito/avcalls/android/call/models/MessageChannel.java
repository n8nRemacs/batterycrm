package com.avito.avcalls.android.call.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageChannel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/call/models/MessageChannel;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MessageChannel {

    /* renamed from: b, reason: collision with root package name */
    public static final MessageChannel f331571b;

    /* renamed from: c, reason: collision with root package name */
    public static final MessageChannel f331572c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ MessageChannel[] f331573d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f331574e;

    static {
        MessageChannel messageChannel = new MessageChannel("PUSH", 0);
        f331571b = messageChannel;
        MessageChannel messageChannel2 = new MessageChannel("SIGNALLING", 1);
        f331572c = messageChannel2;
        MessageChannel[] messageChannelArr = {messageChannel, messageChannel2};
        f331573d = messageChannelArr;
        f331574e = c.a(messageChannelArr);
    }

    public MessageChannel() {
        throw null;
    }

    public static MessageChannel valueOf(String str) {
        return (MessageChannel) Enum.valueOf(MessageChannel.class, str);
    }

    public static MessageChannel[] values() {
        return (MessageChannel[]) f331573d.clone();
    }
}
