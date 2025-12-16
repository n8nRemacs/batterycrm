package com.avito.android.ai_assistant.screens.chat.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AiAssistantState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/SendButtonMode;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SendButtonMode {

    /* renamed from: b, reason: collision with root package name */
    public static final SendButtonMode f89287b;

    /* renamed from: c, reason: collision with root package name */
    public static final SendButtonMode f89288c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SendButtonMode[] f89289d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f89290e;

    static {
        SendButtonMode sendButtonMode = new SendButtonMode("SEND", 0);
        f89287b = sendButtonMode;
        SendButtonMode sendButtonMode2 = new SendButtonMode("HARD_STOP", 1);
        f89288c = sendButtonMode2;
        SendButtonMode[] sendButtonModeArr = {sendButtonMode, sendButtonMode2};
        f89289d = sendButtonModeArr;
        f89290e = c.a(sendButtonModeArr);
    }

    public SendButtonMode() {
        throw null;
    }

    public static SendButtonMode valueOf(String str) {
        return (SendButtonMode) Enum.valueOf(SendButtonMode.class, str);
    }

    public static SendButtonMode[] values() {
        return (SendButtonMode[]) f89289d.clone();
    }
}
