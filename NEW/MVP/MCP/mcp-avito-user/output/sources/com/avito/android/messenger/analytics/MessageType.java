package com.avito.android.messenger.analytics;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/MessageType;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageType {

    /* renamed from: c, reason: collision with root package name */
    public static final MessageType f186199c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessageType f186200d;

    /* renamed from: e, reason: collision with root package name */
    public static final MessageType f186201e;

    /* renamed from: f, reason: collision with root package name */
    public static final MessageType f186202f;

    /* renamed from: g, reason: collision with root package name */
    public static final MessageType f186203g;

    /* renamed from: h, reason: collision with root package name */
    public static final MessageType f186204h;

    /* renamed from: i, reason: collision with root package name */
    public static final MessageType f186205i;

    /* renamed from: j, reason: collision with root package name */
    public static final MessageType f186206j;

    /* renamed from: k, reason: collision with root package name */
    public static final MessageType f186207k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ MessageType[] f186208l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f186209m;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f186210b;

    static {
        MessageType messageType = new MessageType("TEXT", 0, "text");
        f186199c = messageType;
        MessageType messageType2 = new MessageType("ITEM", 1, "item");
        f186200d = messageType2;
        MessageType messageType3 = new MessageType("IMAGE", 2, "image");
        f186201e = messageType3;
        MessageType messageType4 = new MessageType("GEO", 3, "geo");
        f186202f = messageType4;
        MessageType messageType5 = new MessageType("LINK", 4, "link");
        f186203g = messageType5;
        MessageType messageType6 = new MessageType("SUGGEST", 5, "suggest");
        f186204h = messageType6;
        MessageType messageType7 = new MessageType("FILE", 6, "file");
        f186205i = messageType7;
        MessageType messageType8 = new MessageType("VIDEO", 7, "video");
        f186206j = messageType8;
        MessageType messageType9 = new MessageType("VOICE", 8, "voice");
        f186207k = messageType9;
        MessageType[] messageTypeArr = {messageType, messageType2, messageType3, messageType4, messageType5, messageType6, messageType7, messageType8, messageType9};
        f186208l = messageTypeArr;
        f186209m = kotlin.enums.c.a(messageTypeArr);
    }

    public MessageType(String str, int i12, String str2) {
        this.f186210b = str2;
    }

    public static MessageType valueOf(String str) {
        return (MessageType) Enum.valueOf(MessageType.class, str);
    }

    public static MessageType[] values() {
        return (MessageType[]) f186208l.clone();
    }
}
