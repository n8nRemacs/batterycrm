package com.avito.android.categories_global.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.categories_global.mvi.entity.CategoriesInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoriesReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/categories_global/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "LLn/e;", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements u<CategoriesInternalAction, Ln.e> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ln.e a(CategoriesInternalAction categoriesInternalAction, Ln.e eVar) {
        CategoriesInternalAction categoriesInternalAction2 = categoriesInternalAction;
        Ln.e eVar2 = eVar;
        if (categoriesInternalAction2 instanceof CategoriesInternalAction.ContentLoaded) {
            return new Ln.e(false, null, ((CategoriesInternalAction.ContentLoaded) categoriesInternalAction2).f116419b);
        }
        if (!(categoriesInternalAction2 instanceof CategoriesInternalAction.Error)) {
            return categoriesInternalAction2 instanceof CategoriesInternalAction.LoadContentStarted ? Ln.e.a(eVar2, true, null) : eVar2;
        }
        String message = ((CategoriesInternalAction.Error) categoriesInternalAction2).f116420b.getMessage();
        if (message == null) {
            message = "";
        }
        return Ln.e.a(eVar2, false, message);
    }
}
