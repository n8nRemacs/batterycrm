package com.avito.android.advert_core.auto_select_manager_info;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoSelectManagerInfoPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/auto_select_manager_info/f;", "Lcom/avito/android/advert_core/auto_select_manager_info/e;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements e {
    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        AutoSelectManagerInfoItem autoSelectManagerInfoItem = (AutoSelectManagerInfoItem) aVar;
        cVar.setTitle(autoSelectManagerInfoItem.f82919b);
        cVar.f(autoSelectManagerInfoItem.f82920c);
        cVar.l(autoSelectManagerInfoItem.f82921d);
    }
}
