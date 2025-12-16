package com.avito.android.tariff_lf_constructor.configure.landing.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.tariff_lf_constructor.configure.landing.mvi.entity.ConstructorLandingInternalAction;
import jD0.C42238c;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kD0.C42572a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sD0.C48033a;
import sD0.C48034b;

/* compiled from: ConstructorLandingReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction;", "LjD0/c;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements u<ConstructorLandingInternalAction, C42238c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C42238c a(ConstructorLandingInternalAction constructorLandingInternalAction, C42238c c42238c) {
        ConstructorLandingInternalAction constructorLandingInternalAction2 = constructorLandingInternalAction;
        C42238c c42238c2 = c42238c;
        if (constructorLandingInternalAction2 instanceof ConstructorLandingInternalAction.Loading) {
            return new C42238c(true, null, null);
        }
        if (!(constructorLandingInternalAction2 instanceof ConstructorLandingInternalAction.Content)) {
            return constructorLandingInternalAction2 instanceof ConstructorLandingInternalAction.Error ? new C42238c(false, null, ((ConstructorLandingInternalAction.Error) constructorLandingInternalAction2).f299721b) : c42238c2;
        }
        C48034b c48034b = ((ConstructorLandingInternalAction.Content) constructorLandingInternalAction2).f299719b;
        ArrayList arrayListE0 = C42745f0.e0(new com.avito.android.tariff_lf_constructor.configure.landing.items.header.a(c48034b.getImage(), c48034b.getTitle()));
        List<C48033a> listB = c48034b.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        int i12 = 0;
        for (Object obj : listB) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(Boolean.valueOf(arrayListE0.add(new com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature.a(AK.c.g(i12, "feature_item"), ((C48033a) obj).getTitle()))));
            i12 = i13;
        }
        return new C42238c(false, new C42572a(arrayListE0, c48034b.getButton()), null);
    }
}
