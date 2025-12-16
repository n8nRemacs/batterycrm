package com.avito.android.categories_global.mvi;

import Ln.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.categories_global.mvi.entity.CategoriesInternalAction;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoriesOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/categories_global/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "LLn/d;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements t<CategoriesInternalAction, Ln.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f116431b;

    @Inject
    public h(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f116431b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Ln.d b(CategoriesInternalAction categoriesInternalAction) {
        Ln.d cVar;
        CategoriesInternalAction categoriesInternalAction2 = categoriesInternalAction;
        if (categoriesInternalAction2.equals(CategoriesInternalAction.NavigateBack.f116422b)) {
            return d.a.f10114a;
        }
        if (!(categoriesInternalAction2 instanceof CategoriesInternalAction.OpenDeeplink)) {
            if (categoriesInternalAction2 instanceof CategoriesInternalAction.OpenDestination) {
                cVar = new d.b(((CategoriesInternalAction.OpenDestination) categoriesInternalAction2).f116424b);
            } else if (categoriesInternalAction2 instanceof CategoriesInternalAction.ShowErrorToast) {
                cVar = new d.c();
            }
            return cVar;
        }
        b.a.a(this.f116431b, ((CategoriesInternalAction.OpenDeeplink) categoriesInternalAction2).f116423b, null, null, 6);
        return null;
    }
}
