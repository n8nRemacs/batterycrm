package com.akita.compose.component.stepper;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Stepper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class j extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f62866l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f62867m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ StepperState f62868n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f62869o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f62870p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i12, w wVar, StepperState stepperState, androidx.compose.ui.v vVar, int i13) {
        super(2);
        this.f62866l = i12;
        this.f62867m = wVar;
        this.f62868n = stepperState;
        this.f62869o = vVar;
        this.f62870p = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62870p | 1);
        StepperState stepperState = this.f62868n;
        l.d(this.f62866l, this.f62867m, stepperState, this.f62869o, a12, iA2);
        return G0.f406611a;
    }
}
