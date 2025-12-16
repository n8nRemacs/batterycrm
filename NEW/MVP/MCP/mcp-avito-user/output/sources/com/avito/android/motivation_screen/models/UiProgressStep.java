package com.avito.android.motivation_screen.models;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: MotivationUiState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/motivation_screen/models/UiProgressStep;", "", "UiProgressStepState", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UiProgressStep {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f206337a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UiProgressStepState f206338b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MotivationUiState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/motivation_screen/models/UiProgressStep$UiProgressStepState;", "", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UiProgressStepState {

        /* renamed from: b, reason: collision with root package name */
        public static final UiProgressStepState f206339b;

        /* renamed from: c, reason: collision with root package name */
        public static final UiProgressStepState f206340c;

        /* renamed from: d, reason: collision with root package name */
        public static final UiProgressStepState f206341d;

        /* renamed from: e, reason: collision with root package name */
        public static final UiProgressStepState f206342e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ UiProgressStepState[] f206343f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ a f206344g;

        static {
            UiProgressStepState uiProgressStepState = new UiProgressStepState("COMPLETED", 0);
            f206339b = uiProgressStepState;
            UiProgressStepState uiProgressStepState2 = new UiProgressStepState("LOCKED", 1);
            f206340c = uiProgressStepState2;
            UiProgressStepState uiProgressStepState3 = new UiProgressStepState("CURRENT", 2);
            f206341d = uiProgressStepState3;
            UiProgressStepState uiProgressStepState4 = new UiProgressStepState("FINISH", 3);
            f206342e = uiProgressStepState4;
            UiProgressStepState[] uiProgressStepStateArr = {uiProgressStepState, uiProgressStepState2, uiProgressStepState3, uiProgressStepState4};
            f206343f = uiProgressStepStateArr;
            f206344g = c.a(uiProgressStepStateArr);
        }

        public UiProgressStepState() {
            throw null;
        }

        public static UiProgressStepState valueOf(String str) {
            return (UiProgressStepState) Enum.valueOf(UiProgressStepState.class, str);
        }

        public static UiProgressStepState[] values() {
            return (UiProgressStepState[]) f206343f.clone();
        }
    }

    public UiProgressStep(@k String str, @k UiProgressStepState uiProgressStepState) {
        this.f206337a = str;
        this.f206338b = uiProgressStepState;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiProgressStep)) {
            return false;
        }
        UiProgressStep uiProgressStep = (UiProgressStep) obj;
        return L.f(this.f206337a, uiProgressStep.f206337a) && this.f206338b == uiProgressStep.f206338b;
    }

    public final int hashCode() {
        return this.f206338b.hashCode() + (this.f206337a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "UiProgressStep(text=" + this.f206337a + ", state=" + this.f206338b + ')';
    }
}
