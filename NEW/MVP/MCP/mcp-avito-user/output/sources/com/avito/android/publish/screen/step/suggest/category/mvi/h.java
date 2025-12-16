package com.avito.android.publish.screen.step.suggest.category.mvi;

import com.avito.android.publish.PublishState;
import com.avito.android.remote.model.CategoryModel;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestCategoryActor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h {
    public static final boolean a(@Y61.k PublishState.StepState.CategoriesSuggestions categoriesSuggestions) {
        CategoryModel chosenCategory = categoriesSuggestions.getChosenCategory();
        if (chosenCategory != null) {
            return L.f(chosenCategory.getNavigation(), categoriesSuggestions.getPreviousNavigation());
        }
        return true;
    }

    public static final boolean b(@Y61.k PublishState.StepState.CategoriesSuggestions categoriesSuggestions) {
        return categoriesSuggestions.g().isEmpty() && a(categoriesSuggestions);
    }
}
