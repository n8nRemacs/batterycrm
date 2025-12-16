package com.akita.compose.component.stepper;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StepperState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/stepper/StepperState;", "", "stepper_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StepperState {

    /* renamed from: b, reason: collision with root package name */
    public static final StepperState f62828b;

    /* renamed from: c, reason: collision with root package name */
    public static final StepperState f62829c;

    /* renamed from: d, reason: collision with root package name */
    public static final StepperState f62830d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ StepperState[] f62831e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f62832f;

    static {
        StepperState stepperState = new StepperState("Normal", 0);
        f62828b = stepperState;
        StepperState stepperState2 = new StepperState("Disable", 1);
        f62829c = stepperState2;
        StepperState stepperState3 = new StepperState("Error", 2);
        f62830d = stepperState3;
        StepperState[] stepperStateArr = {stepperState, stepperState2, stepperState3};
        f62831e = stepperStateArr;
        f62832f = kotlin.enums.c.a(stepperStateArr);
    }

    public StepperState() {
        throw null;
    }

    public static StepperState valueOf(String str) {
        return (StepperState) Enum.valueOf(StepperState.class, str);
    }

    public static StepperState[] values() {
        return (StepperState[]) f62831e.clone();
    }
}
