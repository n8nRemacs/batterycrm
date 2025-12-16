package com.avito.android.messenger.analytics.graphite_counter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChatListLoadingTimer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/graphite_counter/ChatListLoadingResult;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatListLoadingResult {

    /* renamed from: b, reason: collision with root package name */
    public static final ChatListLoadingResult f186275b;

    /* renamed from: c, reason: collision with root package name */
    public static final ChatListLoadingResult f186276c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ChatListLoadingResult[] f186277d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f186278e;

    static {
        ChatListLoadingResult chatListLoadingResult = new ChatListLoadingResult("SUCCESS", 0);
        f186275b = chatListLoadingResult;
        ChatListLoadingResult chatListLoadingResult2 = new ChatListLoadingResult("ERROR", 1);
        f186276c = chatListLoadingResult2;
        ChatListLoadingResult[] chatListLoadingResultArr = {chatListLoadingResult, chatListLoadingResult2};
        f186277d = chatListLoadingResultArr;
        f186278e = c.a(chatListLoadingResultArr);
    }

    public ChatListLoadingResult() {
        throw null;
    }

    public static ChatListLoadingResult valueOf(String str) {
        return (ChatListLoadingResult) Enum.valueOf(ChatListLoadingResult.class, str);
    }

    public static ChatListLoadingResult[] values() {
        return (ChatListLoadingResult[]) f186277d.clone();
    }
}
