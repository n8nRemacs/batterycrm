package com.avito.android.advert_core.service_education;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;

/* compiled from: AdvertServiceEducationItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/service_education/f;", "Lcom/avito/android/advert_core/service_education/e;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements e {
    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        ServiceEducationValue serviceEducationValue = (ServiceEducationValue) aVar;
        hVar.yG(serviceEducationValue.f84302c);
        hVar.dZ(C42745f0.O(C42756l.B(new String[]{serviceEducationValue.f84303d, AK.c.i(serviceEducationValue.f84304e, " г.", new StringBuilder())}), "  ∙  ", null, null, null, 62));
    }
}
