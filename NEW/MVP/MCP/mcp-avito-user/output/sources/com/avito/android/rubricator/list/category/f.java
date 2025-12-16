package com.avito.android.rubricator.list.category;

import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.M;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.remote.model.vertical_main.RubricatorWidget;
import com.avito.android.rubricator.list.category.model.CategoriesListFragmentData;
import com.avito.android.rubricator.list.category.model.CategoryListArguments;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryListIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/list/category/f;", "Lcom/avito/android/rubricator/list/category/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M f255910a;

    @Inject
    public f(@Y61.k M m12) {
        this.f255910a = m12;
    }

    @Override // com.avito.android.rubricator.list.category.e
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.k List<RubricatorWidget.RubricatorWidgetAction> list, @Y61.k NavigationTabSetItem navigationTabSetItem) {
        return this.f255910a.d(new CategoriesListFragmentData(new CategoryListArguments(str, list), navigationTabSetItem));
    }
}
