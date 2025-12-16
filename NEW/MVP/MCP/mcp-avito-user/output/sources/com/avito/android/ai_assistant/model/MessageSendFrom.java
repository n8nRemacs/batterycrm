package com.avito.android.ai_assistant.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageSendFrom.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/model/MessageSendFrom;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MessageSendFrom {

    /* renamed from: b, reason: collision with root package name */
    public static final MessageSendFrom f89113b;

    /* renamed from: c, reason: collision with root package name */
    public static final MessageSendFrom f89114c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ MessageSendFrom[] f89115d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f89116e;

    static {
        MessageSendFrom messageSendFrom = new MessageSendFrom("Input", 0);
        f89113b = messageSendFrom;
        MessageSendFrom messageSendFrom2 = new MessageSendFrom("Suggestion", 1);
        f89114c = messageSendFrom2;
        MessageSendFrom[] messageSendFromArr = {messageSendFrom, messageSendFrom2};
        f89115d = messageSendFromArr;
        f89116e = kotlin.enums.c.a(messageSendFromArr);
    }

    public MessageSendFrom() {
        throw null;
    }

    public static MessageSendFrom valueOf(String str) {
        return (MessageSendFrom) Enum.valueOf(MessageSendFrom.class, str);
    }

    public static MessageSendFrom[] values() {
        return (MessageSendFrom[]) f89115d.clone();
    }
}
