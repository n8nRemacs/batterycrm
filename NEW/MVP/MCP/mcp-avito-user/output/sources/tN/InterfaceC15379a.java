package Tn;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Un.C15538a;
import Y61.k;
import Y61.l;
import com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items.Api1PromoCategoryTreeItemsResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CategoryItemsTreeApi.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJN\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u000b\u001a\u00020\t2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LTn/a;", "", "", "promoToolType", "promoToolID", "Lcom/avito/android/remote/model/TypedResult;", "LUn/a;", "b", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "microCategoryId", "page", "searchValue", "Lcom/avito/android/category_items_tree/generated/api/api_1_promo_category_tree_items/Api1PromoCategoryTreeItemsResponse;", "a", "(Ljava/lang/Long;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Tn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15379a {
    @o("1/promo/category/tree/items")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@J81.c("microCategoryId") @l Long l12, @J81.c("page") long j12, @J81.c("promoToolID") @l String str, @J81.c("promoToolType") @k String str2, @J81.c("searchValue") @l String str3, @k Continuation<? super TypedResult<Api1PromoCategoryTreeItemsResponse>> continuation);

    @f("1/promo/category/tree")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@t("promoToolType") @k String str, @l @t("promoToolID") String str2, @k Continuation<? super TypedResult<C15538a>> continuation);
}
