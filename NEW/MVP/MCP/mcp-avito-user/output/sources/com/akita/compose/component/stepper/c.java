package com.akita.compose.component.stepper;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Stepper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f62836l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.r f62837m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a f62838n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f62839o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Boolean> f62840p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ StepperState f62841q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f62842r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f62843s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, com.akita.compose.foundation.r rVar, a aVar, float f12, Y41.a<Boolean> aVar2, StepperState stepperState, float f13, int i12) {
        super(2);
        this.f62836l = str;
        this.f62837m = rVar;
        this.f62838n = aVar;
        this.f62839o = f12;
        this.f62840p = aVar2;
        this.f62841q = stepperState;
        this.f62842r = f13;
        this.f62843s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62843s | 1);
        StepperState stepperState = this.f62841q;
        float f12 = this.f62842r;
        l.c(this.f62836l, this.f62837m, this.f62838n, this.f62839o, this.f62840p, stepperState, f12, a12, iA2);
        return G0.f406611a;
    }
}
