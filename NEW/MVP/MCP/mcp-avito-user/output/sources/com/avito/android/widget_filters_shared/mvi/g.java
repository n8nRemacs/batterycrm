package com.avito.android.widget_filters_shared.mvi;

import UP0.b;
import UP0.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WidgetFiltersSharedOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/widget_filters_shared/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "LUP0/b;", "LUP0/c;", "<init>", "()V", "_avito_widget-filters-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements t<UP0.b, UP0.c> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final UP0.c b(UP0.b bVar) {
        UP0.b bVar2 = bVar;
        if (bVar2 instanceof b.a) {
            return new c.a(((b.a) bVar2).f16375a);
        }
        if (bVar2 instanceof b.C1125b) {
            return c.b.f16378a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
