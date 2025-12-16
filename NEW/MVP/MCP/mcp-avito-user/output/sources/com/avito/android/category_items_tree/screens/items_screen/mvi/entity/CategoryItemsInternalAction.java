package com.avito.android.category_items_tree.screens.items_screen.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items.Api1PromoCategoryTreeItemsResponse;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryItemsInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Items", "LoadMoreError", "LoadMoreItems", "Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction$Items;", "Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction$LoadMoreError;", "Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction$LoadMoreItems;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CategoryItemsInternalAction extends n {

    /* compiled from: CategoryItemsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction$Items;", "Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Items implements CategoryItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Api1PromoCategoryTreeItemsResponse.ActionType f116989b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f116990c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f116991d;

        public Items(@l Api1PromoCategoryTreeItemsResponse.ActionType actionType, boolean z12, @k ArrayList arrayList) {
            this.f116989b = actionType;
            this.f116990c = z12;
            this.f116991d = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Items)) {
                return false;
            }
            Items items = (Items) obj;
            return this.f116989b == items.f116989b && this.f116990c == items.f116990c && this.f116991d.equals(items.f116991d);
        }

        public final int hashCode() {
            Api1PromoCategoryTreeItemsResponse.ActionType actionType = this.f116989b;
            return this.f116991d.hashCode() + r.i((actionType == null ? 0 : actionType.hashCode()) * 31, 31, this.f116990c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Items(actionType=");
            sb2.append(this.f116989b);
            sb2.append(", lastPage=");
            sb2.append(this.f116990c);
            sb2.append(", items=");
            return e.p(sb2, this.f116991d, ')');
        }
    }

    /* compiled from: CategoryItemsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction$LoadMoreError;", "Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadMoreError implements CategoryItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f116992b;

        public LoadMoreError(@k ApiError apiError) {
            this.f116992b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadMoreError) && L.f(this.f116992b, ((LoadMoreError) obj).f116992b);
        }

        public final int hashCode() {
            return this.f116992b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadMoreError(apiError="), this.f116992b, ')');
        }
    }

    /* compiled from: CategoryItemsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction$LoadMoreItems;", "Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadMoreItems implements CategoryItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f116993b;

        public LoadMoreItems(boolean z12) {
            this.f116993b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadMoreItems) && this.f116993b == ((LoadMoreItems) obj).f116993b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f116993b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("LoadMoreItems(isInitial="), this.f116993b, ')');
        }
    }
}
