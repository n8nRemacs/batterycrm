package com.avito.android.bbl.screens.contact_history.mvi;

import Dh.C13399c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.bbl.screens.contact_history.mvi.entity.BblContactHistoryInternalAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import ph.C47085a;
import ph.C47086b;
import ph.C47087c;

/* compiled from: BblContactHistoryReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bbl/screens/contact_history/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction;", "LDh/c;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements u<BblContactHistoryInternalAction, C13399c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C13399c a(BblContactHistoryInternalAction bblContactHistoryInternalAction, C13399c c13399c) {
        BblContactHistoryInternalAction bblContactHistoryInternalAction2 = bblContactHistoryInternalAction;
        C13399c c13399c2 = c13399c;
        if (bblContactHistoryInternalAction2 instanceof BblContactHistoryInternalAction.Loading) {
            return C13399c.a(c13399c2, true, null);
        }
        if (bblContactHistoryInternalAction2 instanceof BblContactHistoryInternalAction.Error) {
            return C13399c.a(c13399c2, false, ((BblContactHistoryInternalAction.Error) bblContactHistoryInternalAction2).f99677b);
        }
        if (!(bblContactHistoryInternalAction2 instanceof BblContactHistoryInternalAction.Content)) {
            return c13399c2;
        }
        C47085a c47085a = ((BblContactHistoryInternalAction.Content) bblContactHistoryInternalAction2).f99676b;
        List<C47086b> listB = c47085a.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        for (C47086b c47086b : listB) {
            arrayList.add(new C13399c.C0183c(c47086b.getTitle(), c47086b.getDiff(), c47086b.getDate()));
        }
        C13399c.d dVar = new C13399c.d(c47085a.getTitle(), c47085a.getHeaders().getEventHeader(), c47085a.getHeaders().getDiffHeader());
        C47087c button = c47085a.getButton();
        return new C13399c(false, null, dVar, button != null ? new C13399c.a(button.getTitle(), button.getDeeplink()) : null, arrayList);
    }
}
