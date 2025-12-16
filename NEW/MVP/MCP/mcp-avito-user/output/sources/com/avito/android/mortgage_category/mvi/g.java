package com.avito.android.mortgage_category.mvi;

import P10.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage_category.mvi.entity.MortgageCategoryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageCategoryOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction;", "LP10/c;", "<init>", "()V", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements t<MortgageCategoryInternalAction, P10.c> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final P10.c b(MortgageCategoryInternalAction mortgageCategoryInternalAction) {
        MortgageCategoryInternalAction mortgageCategoryInternalAction2 = mortgageCategoryInternalAction;
        if (mortgageCategoryInternalAction2 instanceof MortgageCategoryInternalAction.HandleDeeplink) {
            return new c.a(((MortgageCategoryInternalAction.HandleDeeplink) mortgageCategoryInternalAction2).f204947b);
        }
        if (mortgageCategoryInternalAction2 instanceof MortgageCategoryInternalAction.SetArchivedLoadingCompleted) {
            return c.b.f12776a;
        }
        return null;
    }
}
