package com.avito.android.messenger.analytics.graphite_counter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChatListRefreshTimer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/graphite_counter/ChatListRefreshResult;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatListRefreshResult {

    /* renamed from: b, reason: collision with root package name */
    public static final ChatListRefreshResult f186279b;

    /* renamed from: c, reason: collision with root package name */
    public static final ChatListRefreshResult f186280c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ChatListRefreshResult[] f186281d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f186282e;

    static {
        ChatListRefreshResult chatListRefreshResult = new ChatListRefreshResult("SUCCESS", 0);
        f186279b = chatListRefreshResult;
        ChatListRefreshResult chatListRefreshResult2 = new ChatListRefreshResult("ERROR", 1);
        f186280c = chatListRefreshResult2;
        ChatListRefreshResult[] chatListRefreshResultArr = {chatListRefreshResult, chatListRefreshResult2};
        f186281d = chatListRefreshResultArr;
        f186282e = c.a(chatListRefreshResultArr);
    }

    public ChatListRefreshResult() {
        throw null;
    }

    public static ChatListRefreshResult valueOf(String str) {
        return (ChatListRefreshResult) Enum.valueOf(ChatListRefreshResult.class, str);
    }

    public static ChatListRefreshResult[] values() {
        return (ChatListRefreshResult[]) f186281d.clone();
    }
}
