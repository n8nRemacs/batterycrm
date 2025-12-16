package com.avito.android.ai_assistant.adapter.append;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppendItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/append/AppendState;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AppendState {

    /* renamed from: b, reason: collision with root package name */
    public static final AppendState f88727b;

    /* renamed from: c, reason: collision with root package name */
    public static final AppendState f88728c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AppendState[] f88729d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f88730e;

    static {
        AppendState appendState = new AppendState("LOADING", 0);
        f88727b = appendState;
        AppendState appendState2 = new AppendState("RETRY", 1);
        f88728c = appendState2;
        AppendState[] appendStateArr = {appendState, appendState2};
        f88729d = appendStateArr;
        f88730e = kotlin.enums.c.a(appendStateArr);
    }

    public AppendState() {
        throw null;
    }

    public static AppendState valueOf(String str) {
        return (AppendState) Enum.valueOf(AppendState.class, str);
    }

    public static AppendState[] values() {
        return (AppendState[]) f88729d.clone();
    }
}
