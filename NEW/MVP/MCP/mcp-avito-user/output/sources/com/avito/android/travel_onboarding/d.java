package com.avito.android.travel_onboarding;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.r;
import com.avito.android.analytics.screens.compose.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TravelOnboardingFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TravelOnboardingFragment f302236l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelOnboardingFragment travelOnboardingFragment) {
        super(2);
        this.f302236l = travelOnboardingFragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            TravelOnboardingFragment travelOnboardingFragment = this.f302236l;
            q.b((com.avito.android.analytics.screens.compose.a) travelOnboardingFragment.f302221k0.getValue(), r.c(2112914576, new c(travelOnboardingFragment), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
