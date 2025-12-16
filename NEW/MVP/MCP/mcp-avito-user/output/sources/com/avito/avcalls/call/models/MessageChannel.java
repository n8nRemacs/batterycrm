package com.avito.avcalls.call.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageChannel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/call/models/MessageChannel;", "", "(Ljava/lang/String;I)V", "PUSH", "SIGNALLING", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MessageChannel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MessageChannel[] $VALUES;
    public static final MessageChannel PUSH = new MessageChannel("PUSH", 0);
    public static final MessageChannel SIGNALLING = new MessageChannel("SIGNALLING", 1);

    private static final /* synthetic */ MessageChannel[] $values() {
        return new MessageChannel[]{PUSH, SIGNALLING};
    }

    static {
        MessageChannel[] messageChannelArr$values = $values();
        $VALUES = messageChannelArr$values;
        $ENTRIES = c.a(messageChannelArr$values);
    }

    private MessageChannel(String str, int i12) {
    }

    public static MessageChannel valueOf(String str) {
        return (MessageChannel) Enum.valueOf(MessageChannel.class, str);
    }

    public static MessageChannel[] values() {
        return (MessageChannel[]) $VALUES.clone();
    }
}
