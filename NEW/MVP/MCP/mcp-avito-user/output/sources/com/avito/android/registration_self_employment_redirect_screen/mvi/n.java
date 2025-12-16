package com.avito.android.registration_self_employment_redirect_screen.mvi;

import aj0.C19900a;
import aj0.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.registration_self_employment_redirect_screen.steps_list.SelfEmploymentStepItem;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SelfEmploymentRedirectReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Laj0/c;", "Laj0/e;", "<init>", "()V", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements u<aj0.c, aj0.e> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final aj0.e a(aj0.c cVar, aj0.e eVar) {
        aj0.c cVar2 = cVar;
        aj0.e eVar2 = eVar;
        if (!(cVar2 instanceof c.b)) {
            return cVar2 instanceof c.C1505c ? aj0.e.a(eVar2, true, false) : cVar2 instanceof c.d ? aj0.e.a(eVar2, false, true) : eVar2;
        }
        c.b bVar = (c.b) cVar2;
        ArrayList<C19900a> arrayList = bVar.f21133c;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (C19900a c19900a : arrayList) {
            arrayList2.add(new SelfEmploymentStepItem(c19900a.f21123a, c19900a.f21124b, c19900a.f21125c, null, 8, null));
        }
        DeepLink deepLink = bVar.f21135e;
        return new aj0.e(bVar.f21131a, bVar.f21132b, arrayList2, bVar.f21134d, deepLink, eVar2.f21144f, deepLink != null, true, false, false);
    }
}
