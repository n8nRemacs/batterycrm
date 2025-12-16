package com.avito.android.ai_assistant.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReactionState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/model/ReactionState;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReactionState {

    /* renamed from: b, reason: collision with root package name */
    public static final ReactionState f89129b;

    /* renamed from: c, reason: collision with root package name */
    public static final ReactionState f89130c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReactionState f89131d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ReactionState[] f89132e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f89133f;

    static {
        ReactionState reactionState = new ReactionState("NONE", 0);
        f89129b = reactionState;
        ReactionState reactionState2 = new ReactionState("LIKED", 1);
        f89130c = reactionState2;
        ReactionState reactionState3 = new ReactionState("DISLIKED", 2);
        f89131d = reactionState3;
        ReactionState[] reactionStateArr = {reactionState, reactionState2, reactionState3};
        f89132e = reactionStateArr;
        f89133f = kotlin.enums.c.a(reactionStateArr);
    }

    public ReactionState() {
        throw null;
    }

    public static ReactionState valueOf(String str) {
        return (ReactionState) Enum.valueOf(ReactionState.class, str);
    }

    public static ReactionState[] values() {
        return (ReactionState[]) f89132e.clone();
    }
}
