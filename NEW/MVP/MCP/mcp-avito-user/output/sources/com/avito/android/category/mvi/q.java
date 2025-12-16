package com.avito.android.category.mvi;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.category.ListItem;
import com.avito.android.category.mvi.entity.CategoryInternalAction;
import com.avito.android.category.mvi.entity.CategoryState;
import com.avito.android.category.mvi.entity.OverlayState;
import com.avito.android.remote.model.CategorySearch;
import com.avito.android.remote.model.MainSearchResult;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;
import kotlin.text.C43066x;

/* compiled from: CategoryReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction;", "Lcom/avito/android/category/mvi/entity/CategoryState;", "<init>", "()V", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q implements u<CategoryInternalAction, CategoryState> {
    @Inject
    public q() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ListItem.Category b(CategorySearch categorySearch, boolean z12) {
        C42784z0 c42784z0;
        ListItem.Category.Badge badge;
        List<CategorySearch> children;
        String id2 = categorySearch.getId();
        String name = categorySearch.getName();
        List<CategorySearch> children2 = categorySearch.getChildren();
        if (children2 != null) {
            List<CategorySearch> list = children2;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b((CategorySearch) it.next(), z12));
            }
            c42784z0 = arrayList;
        } else {
            c42784z0 = C42784z0.f406748b;
        }
        boolean z13 = (!z12 || (children = categorySearch.getChildren()) == null || children.isEmpty()) ? false : true;
        CategorySearch.Badge badge2 = categorySearch.getBadge();
        Object obj = null;
        if (badge2 != null) {
            String text = badge2.getText();
            Iterator it2 = ((AbstractC42738c) ListItem.Category.Badge.Size.f116486d).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (C43044a.c(C43066x.L(badge2.getStyle()), C43066x.L(((ListItem.Category.Badge.Size) next).name()), true)) {
                    obj = next;
                    break;
                }
            }
            ListItem.Category.Badge.Size size = (ListItem.Category.Badge.Size) obj;
            if (size == null) {
                size = ListItem.Category.Badge.Size.f116484b;
            }
            badge = new ListItem.Category.Badge(text, size);
        } else {
            badge = null;
        }
        return new ListItem.Category(id2, name, categorySearch.getParams(), c42784z0, z13, badge);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12, types: [kotlin.collections.z0] */
    @Override // com.avito.android.arch.mvi.u
    public final CategoryState a(CategoryInternalAction categoryInternalAction, CategoryState categoryState) {
        ArrayList arrayList;
        CategoryInternalAction categoryInternalAction2 = categoryInternalAction;
        CategoryState categoryState2 = categoryState;
        if (categoryInternalAction2 instanceof CategoryInternalAction.LoadingMainStarted) {
            return CategoryState.a(categoryState2, OverlayState.f116682b, null, null, null, 30);
        }
        if (categoryInternalAction2 instanceof CategoryInternalAction.LoadingLinkStarted) {
            CategoryInternalAction.LoadingLinkStarted loadingLinkStarted = (CategoryInternalAction.LoadingLinkStarted) categoryInternalAction2;
            return CategoryState.a(categoryState2, OverlayState.f116682b, null, null, new Q(loadingLinkStarted.f116671b, loadingLinkStarted.f116672c), 22);
        }
        if (categoryInternalAction2 instanceof CategoryInternalAction.LoadingMainFailed) {
            V2.f318762a.d("CATEGORY_REDUCER", "Main loading failed: " + ((CategoryInternalAction.LoadingMainFailed) categoryInternalAction2).f116675b.getMessage());
            return CategoryState.a(categoryState2, OverlayState.f116683c, null, null, null, 30);
        }
        if (categoryInternalAction2 instanceof CategoryInternalAction.LoadingLinkFailed) {
            V2.f318762a.d("CATEGORY_REDUCER", "Link loading failed: " + ((CategoryInternalAction.LoadingLinkFailed) categoryInternalAction2).f116670b.getMessage());
            return CategoryState.a(categoryState2, OverlayState.f116683c, null, null, null, 30);
        }
        if (!(categoryInternalAction2 instanceof CategoryInternalAction.LoadingMainCompleted)) {
            if (!(categoryInternalAction2 instanceof CategoryInternalAction.ExpandCategory)) {
                return categoryState2;
            }
            List<ListItem> list = categoryState2.f116678c;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (Parcelable category : list) {
                if (category instanceof ListItem.Category) {
                    ListItem.Category category2 = (ListItem.Category) category;
                    if (L.f(category2.f116476b, ((CategoryInternalAction.ExpandCategory) categoryInternalAction2).f116668b.f116476b)) {
                        category = new ListItem.Category(category2.f116476b, category2.f116477c, category2.f116478d, category2.f116479e, !category2.f116480f, category2.f116481g);
                    }
                }
                arrayList2.add(category);
            }
            return CategoryState.a(categoryState2, null, arrayList2, null, null, 29);
        }
        CategoryInternalAction.LoadingMainCompleted loadingMainCompleted = (CategoryInternalAction.LoadingMainCompleted) categoryInternalAction2;
        MainSearchResult mainSearchResult = loadingMainCompleted.f116673b;
        List<CategorySearch> categories = mainSearchResult.getCategories();
        Boolean expandAll = mainSearchResult.getExpandAll();
        if (categories == null) {
            arrayList = C42784z0.f406748b;
        } else {
            arrayList = new ArrayList();
            for (CategorySearch categorySearch : categories) {
                List<CategorySearch> children = categorySearch.getChildren();
                String parentId = categorySearch.getParentId();
                if (children == null && parentId == null) {
                    arrayList.add(new ListItem.Header(null, categorySearch.getName(), null));
                } else if (children != null) {
                    arrayList.add(b(categorySearch, expandAll != null ? expandAll.booleanValue() : false));
                }
            }
        }
        return CategoryState.a(categoryState2, OverlayState.f116684d, arrayList, loadingMainCompleted.f116674c, null, 24);
    }
}
