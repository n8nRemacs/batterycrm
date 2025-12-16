package com.avito.android.lib.design.stepper;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StepperState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/stepper/StepperState;", "", "Mode", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class StepperState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f180604a;

    /* renamed from: b, reason: collision with root package name */
    public final int f180605b;

    /* renamed from: c, reason: collision with root package name */
    public final int f180606c;

    /* renamed from: d, reason: collision with root package name */
    public final int f180607d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Mode f180608e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Y41.l<Integer, G0> f180609f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.l<Integer, G0> f180610g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StepperState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/stepper/StepperState$Mode;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Mode {

        /* renamed from: b, reason: collision with root package name */
        public static final Mode f180611b;

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f180612c;

        /* renamed from: d, reason: collision with root package name */
        public static final Mode f180613d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Mode[] f180614e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f180615f;

        static {
            Mode mode = new Mode("REGULAR", 0);
            f180611b = mode;
            Mode mode2 = new Mode("LOADING", 1);
            f180612c = mode2;
            Mode mode3 = new Mode("ERROR", 2);
            f180613d = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            f180614e = modeArr;
            f180615f = kotlin.enums.c.a(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f180614e.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StepperState(boolean z12, int i12, int i13, int i14, @k Mode mode, @l Y41.l<? super Integer, G0> lVar, @l Y41.l<? super Integer, G0> lVar2) {
        this.f180604a = z12;
        this.f180605b = i12;
        this.f180606c = i13;
        this.f180607d = i14;
        this.f180608e = mode;
        this.f180609f = lVar;
        this.f180610g = lVar2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepperState)) {
            return false;
        }
        StepperState stepperState = (StepperState) obj;
        return this.f180604a == stepperState.f180604a && this.f180605b == stepperState.f180605b && this.f180606c == stepperState.f180606c && this.f180607d == stepperState.f180607d && this.f180608e == stepperState.f180608e && L.f(this.f180609f, stepperState.f180609f) && L.f(this.f180610g, stepperState.f180610g);
    }

    public final int hashCode() {
        int iHashCode = (this.f180608e.hashCode() + r.e(this.f180607d, r.e(this.f180606c, r.e(this.f180605b, Boolean.hashCode(this.f180604a) * 31, 31), 31), 31)) * 31;
        Y41.l<Integer, G0> lVar = this.f180609f;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Y41.l<Integer, G0> lVar2 = this.f180610g;
        return iHashCode2 + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StepperState(isEnabled=");
        sb2.append(this.f180604a);
        sb2.append(", currentValue=");
        sb2.append(this.f180605b);
        sb2.append(", maxValue=");
        sb2.append(this.f180606c);
        sb2.append(", minValue=");
        sb2.append(this.f180607d);
        sb2.append(", mode=");
        sb2.append(this.f180608e);
        sb2.append(", onIncrementClick=");
        sb2.append(this.f180609f);
        sb2.append(", onDecrementClick=");
        return H.l(sb2, this.f180610g, ')');
    }

    public /* synthetic */ StepperState(boolean z12, int i12, int i13, int i14, Mode mode, Y41.l lVar, Y41.l lVar2, int i15, C42822w c42822w) {
        this((i15 & 1) != 0 ? true : z12, (i15 & 2) != 0 ? 0 : i12, i13, i14, (i15 & 16) != 0 ? Mode.f180611b : mode, (i15 & 32) != 0 ? null : lVar, (i15 & 64) != 0 ? null : lVar2);
    }
}
