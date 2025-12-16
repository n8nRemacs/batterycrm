package com.akita.compose.component.input;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InputState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/input/InputState;", "", "input_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InputState {

    /* renamed from: b, reason: collision with root package name */
    public static final InputState f61668b;

    /* renamed from: c, reason: collision with root package name */
    public static final InputState f61669c;

    /* renamed from: d, reason: collision with root package name */
    public static final InputState f61670d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InputState[] f61671e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f61672f;

    static {
        InputState inputState = new InputState("Normal", 0);
        f61668b = inputState;
        InputState inputState2 = new InputState("Error", 1);
        f61669c = inputState2;
        InputState inputState3 = new InputState("Warning", 2);
        f61670d = inputState3;
        InputState[] inputStateArr = {inputState, inputState2, inputState3};
        f61671e = inputStateArr;
        f61672f = kotlin.enums.c.a(inputStateArr);
    }

    public InputState() {
        throw null;
    }

    public static InputState valueOf(String str) {
        return (InputState) Enum.valueOf(InputState.class, str);
    }

    public static InputState[] values() {
        return (InputState[]) f61671e.clone();
    }
}
