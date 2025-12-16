package Hn;

import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import com.avito.android.categories_global.domain.CategoriesModel;
import com.avito.android.remote.model.ConvertDtoToTyped;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CategoriesApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LHn/a;", "", "", "categoryId", SearchParamsConverterKt.LOCATION_ID, "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/categories_global/domain/CategoriesModel;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Hn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14010a {
    @f("3/search/main")
    @ConvertDtoToTyped
    @SuppressLint({"ApiWithoutContracts"})
    @l
    Object a(@l @t("categoryId") String str, @l @t(SearchParamsConverterKt.LOCATION_ID) String str2, @k Continuation<? super TypedResult<CategoriesModel>> continuation);
}
