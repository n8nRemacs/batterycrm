package com.avito.android.freemium.screens.contact_history.mvi;

import androidx.compose.runtime.internal.P;
import bF.C25506a;
import com.avito.android.arch.mvi.u;
import com.avito.android.freemium.screens.contact_history.mvi.entity.FreemiumContactHistoryInternalAction;
import dF.c;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FreemiumContactHistoryReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/freemium/screens/contact_history/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction;", "LdF/c;", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements u<FreemiumContactHistoryInternalAction, dF.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final dF.c a(FreemiumContactHistoryInternalAction freemiumContactHistoryInternalAction, dF.c cVar) {
        FreemiumContactHistoryInternalAction freemiumContactHistoryInternalAction2 = freemiumContactHistoryInternalAction;
        dF.c cVar2 = cVar;
        if (freemiumContactHistoryInternalAction2 instanceof FreemiumContactHistoryInternalAction.Loading) {
            return dF.c.a(cVar2, true, null);
        }
        if (freemiumContactHistoryInternalAction2 instanceof FreemiumContactHistoryInternalAction.Error) {
            return dF.c.a(cVar2, false, ((FreemiumContactHistoryInternalAction.Error) freemiumContactHistoryInternalAction2).f158994b);
        }
        if (!(freemiumContactHistoryInternalAction2 instanceof FreemiumContactHistoryInternalAction.Content)) {
            return cVar2;
        }
        C25506a c25506a = ((FreemiumContactHistoryInternalAction.Content) freemiumContactHistoryInternalAction2).f158993b;
        List<bF.b> listB = c25506a.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        for (bF.b bVar : listB) {
            arrayList.add(new c.C11020c(bVar.getTitle(), bVar.getDiff(), bVar.getDate()));
        }
        c.d dVar = new c.d(c25506a.getTitle(), c25506a.getHeaders().getEventHeader(), c25506a.getHeaders().getDiffHeader());
        bF.c button = c25506a.getButton();
        return new dF.c(false, null, dVar, button != null ? new c.a(button.getTitle(), button.getDeeplink()) : null, arrayList);
    }
}
