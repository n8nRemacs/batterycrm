package com.avito.android.travel_onboarding;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import com.avito.android.travel_onboarding.ui.D;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TravelOnboardingFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TravelOnboardingFragment f302235l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelOnboardingFragment travelOnboardingFragment) {
        super(2);
        this.f302235l = travelOnboardingFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            TravelOnboardingFragment travelOnboardingFragment = this.f302235l;
            D.a(((ZE0.c) C22126m3.b(((h) travelOnboardingFragment.f302219i0.getValue()).getState(), a13).getF42167b()).f20013e, new b(travelOnboardingFragment), a13, 0);
        }
        return G0.f406611a;
    }
}
