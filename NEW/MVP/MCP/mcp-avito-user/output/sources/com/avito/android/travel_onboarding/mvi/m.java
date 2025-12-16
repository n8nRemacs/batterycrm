package com.avito.android.travel_onboarding.mvi;

import ZE0.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TravelOnboardingViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/m;", "", "<init>", "()V", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m {
    @Inject
    public m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static ZE0.c a(@Y61.k ZE0.c cVar) {
        ZE0.d bVar;
        ZE0.d dVar;
        P2<YE0.b> p22 = cVar.f20012d;
        if (p22 instanceof P2.c) {
            dVar = d.C1430d.f20020b;
        } else {
            if (!(p22 instanceof P2.a)) {
                if (!(p22 instanceof P2.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new d.b((YE0.b) ((P2.b) p22).f318720a);
                return ZE0.c.a(cVar, null, null, null, bVar, 7);
            }
            dVar = d.c.f20019b;
        }
        bVar = dVar;
        return ZE0.c.a(cVar, null, null, null, bVar, 7);
    }
}
