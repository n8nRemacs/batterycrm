package com.akita.compose.component.toggle;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToggleState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/toggle/ToggleState;", "", "toggle_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ToggleState {

    /* renamed from: b, reason: collision with root package name */
    public static final ToggleState f63311b;

    /* renamed from: c, reason: collision with root package name */
    public static final ToggleState f63312c;

    /* renamed from: d, reason: collision with root package name */
    public static final ToggleState f63313d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ToggleState[] f63314e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f63315f;

    static {
        ToggleState toggleState = new ToggleState("Default", 0);
        f63311b = toggleState;
        ToggleState toggleState2 = new ToggleState("Disabled", 1);
        f63312c = toggleState2;
        ToggleState toggleState3 = new ToggleState("Error", 2);
        f63313d = toggleState3;
        ToggleState[] toggleStateArr = {toggleState, toggleState2, toggleState3};
        f63314e = toggleStateArr;
        f63315f = kotlin.enums.c.a(toggleStateArr);
    }

    public ToggleState() {
        throw null;
    }

    public static ToggleState valueOf(String str) {
        return (ToggleState) Enum.valueOf(ToggleState.class, str);
    }

    public static ToggleState[] values() {
        return (ToggleState[]) f63314e.clone();
    }
}
