package com.avito.android.tariff_cpt.configure.forbidden.viewmodel;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import mC0.C43945a;

/* compiled from: CptForbiddenConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/b;", "Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.tariff_cpt.configure.forbidden.viewmodel.a
    @Y61.k
    public final C43945a a(@Y61.k KC0.c cVar) {
        return new C43945a(cVar.getImage(), cVar.getTitle(), cVar.getSubtitle(), cVar.getButton());
    }
}
