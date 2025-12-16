package com.avito.android.suggest_institutes_bottom_sheet.mvi;

import com.avito.android.suggest_institutes_bottom_sheet.mvi.m;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SuggestInstitutesReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/m;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/s;", "<init>", "()V", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q implements com.avito.android.arch.mvi.u<m, s> {
    @Inject
    public q() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final s a(m mVar, s sVar) {
        m mVar2 = mVar;
        s sVar2 = sVar;
        if (mVar2 instanceof m.b) {
            return new s(((m.b) mVar2).f292072a);
        }
        if (mVar2 instanceof m.a) {
            return sVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
