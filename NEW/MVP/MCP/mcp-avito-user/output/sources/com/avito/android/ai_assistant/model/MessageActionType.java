package com.avito.android.ai_assistant.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageActionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/model/MessageActionType;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MessageActionType {

    /* renamed from: b, reason: collision with root package name */
    public static final MessageActionType f89107b;

    /* renamed from: c, reason: collision with root package name */
    public static final MessageActionType f89108c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessageActionType f89109d;

    /* renamed from: e, reason: collision with root package name */
    public static final MessageActionType f89110e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ MessageActionType[] f89111f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f89112g;

    static {
        MessageActionType messageActionType = new MessageActionType("LIKE", 0);
        f89107b = messageActionType;
        MessageActionType messageActionType2 = new MessageActionType("UNLIKE", 1);
        f89108c = messageActionType2;
        MessageActionType messageActionType3 = new MessageActionType("DISLIKE", 2);
        f89109d = messageActionType3;
        MessageActionType messageActionType4 = new MessageActionType("UNDISLIKE", 3);
        f89110e = messageActionType4;
        MessageActionType[] messageActionTypeArr = {messageActionType, messageActionType2, messageActionType3, messageActionType4};
        f89111f = messageActionTypeArr;
        f89112g = kotlin.enums.c.a(messageActionTypeArr);
    }

    public MessageActionType() {
        throw null;
    }

    public static MessageActionType valueOf(String str) {
        return (MessageActionType) Enum.valueOf(MessageActionType.class, str);
    }

    public static MessageActionType[] values() {
        return (MessageActionType[]) f89111f.clone();
    }
}
