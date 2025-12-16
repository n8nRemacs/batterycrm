package com.avito.android.personal_filters.filters_change_dialog.mvi;

import com.avito.android.arch.mvi.t;
import g70.b;
import g70.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PersonalFiltersChangeDialogOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/personal_filters/filters_change_dialog/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lg70/b;", "Lg70/c;", "<init>", "()V", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements t<g70.b, g70.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final g70.c b(g70.b bVar) {
        g70.b bVar2 = bVar;
        if (bVar2 instanceof b.C11193b) {
            return null;
        }
        if (bVar2 instanceof b.c) {
            return c.a.f396330a;
        }
        if (bVar2.equals(b.a.f396327a)) {
            return c.b.f396331a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
