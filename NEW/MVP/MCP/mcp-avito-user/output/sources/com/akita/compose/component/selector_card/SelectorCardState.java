package com.akita.compose.component.selector_card;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectorCardState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/selector_card/SelectorCardState;", "", "selector-card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SelectorCardState {

    /* renamed from: b, reason: collision with root package name */
    public static final SelectorCardState f62621b;

    /* renamed from: c, reason: collision with root package name */
    public static final SelectorCardState f62622c;

    /* renamed from: d, reason: collision with root package name */
    public static final SelectorCardState f62623d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SelectorCardState[] f62624e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f62625f;

    static {
        SelectorCardState selectorCardState = new SelectorCardState("Default", 0);
        f62621b = selectorCardState;
        SelectorCardState selectorCardState2 = new SelectorCardState("Disabled", 1);
        f62622c = selectorCardState2;
        SelectorCardState selectorCardState3 = new SelectorCardState("Error", 2);
        f62623d = selectorCardState3;
        SelectorCardState[] selectorCardStateArr = {selectorCardState, selectorCardState2, selectorCardState3};
        f62624e = selectorCardStateArr;
        f62625f = kotlin.enums.c.a(selectorCardStateArr);
    }

    public SelectorCardState() {
        throw null;
    }

    public static SelectorCardState valueOf(String str) {
        return (SelectorCardState) Enum.valueOf(SelectorCardState.class, str);
    }

    public static SelectorCardState[] values() {
        return (SelectorCardState[]) f62624e.clone();
    }
}
