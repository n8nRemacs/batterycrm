package com.avito.android.newcars_mark_model_filter.presentation.mvi;

import com.avito.android.newcars_mark_model_filter.presentation.mvi.entity.NewCarsBrandModelFilterInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import o30.b;

/* compiled from: NewCarsBrandModelFilterOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/q;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "Lo30/b;", "<init>", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements com.avito.android.arch.mvi.t<NewCarsBrandModelFilterInternalAction, o30.b> {
    @Inject
    public q() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final o30.b b(NewCarsBrandModelFilterInternalAction newCarsBrandModelFilterInternalAction) {
        NewCarsBrandModelFilterInternalAction newCarsBrandModelFilterInternalAction2 = newCarsBrandModelFilterInternalAction;
        if (newCarsBrandModelFilterInternalAction2 instanceof NewCarsBrandModelFilterInternalAction.Apply) {
            return new b.a(((NewCarsBrandModelFilterInternalAction.Apply) newCarsBrandModelFilterInternalAction2).f207328b);
        }
        if (newCarsBrandModelFilterInternalAction2 instanceof NewCarsBrandModelFilterInternalAction.LoadError) {
            return new b.C12162b(((NewCarsBrandModelFilterInternalAction.LoadError) newCarsBrandModelFilterInternalAction2).f207332b);
        }
        return null;
    }
}
