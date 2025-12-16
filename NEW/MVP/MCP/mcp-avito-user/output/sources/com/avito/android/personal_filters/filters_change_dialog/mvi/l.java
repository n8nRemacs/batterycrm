package com.avito.android.personal_filters.filters_change_dialog.mvi;

import com.avito.android.arch.mvi.u;
import g70.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PersonalFiltersChangeDialogReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/personal_filters/filters_change_dialog/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lg70/b;", "Lg70/d;", "<init>", "()V", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements u<g70.b, g70.d> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final g70.d a(g70.b bVar, g70.d dVar) {
        g70.b bVar2 = bVar;
        if (bVar2.equals(b.C11193b.f396328a)) {
            return new g70.d(true);
        }
        if (bVar2.equals(b.c.f396329a)) {
            return new g70.d(false);
        }
        if (bVar2.equals(b.a.f396327a)) {
            return new g70.d(false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
