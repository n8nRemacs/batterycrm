package com.avito.android.category_with_params.mvi;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.category_with_params.entity.CategoryParams;
import com.avito.android.category_with_params.entity.ListItem;
import com.avito.android.category_with_params.mvi.entity.CategoryWithParamsInternalAction;
import com.avito.android.category_with_params.mvi.entity.CategoryWithParamsState;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryWithParamsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_with_params/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsState;", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements u<CategoryWithParamsInternalAction, CategoryWithParamsState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CategoryParams f117710b;

    @Inject
    public k(@Y61.k CategoryParams categoryParams) {
        this.f117710b = categoryParams;
    }

    @Override // com.avito.android.arch.mvi.u
    public final CategoryWithParamsState a(CategoryWithParamsInternalAction categoryWithParamsInternalAction, CategoryWithParamsState categoryWithParamsState) {
        Object next;
        ArrayList arrayList;
        CategoryWithParamsInternalAction categoryWithParamsInternalAction2 = categoryWithParamsInternalAction;
        CategoryWithParamsState categoryWithParamsState2 = categoryWithParamsState;
        boolean z12 = false;
        if (categoryWithParamsInternalAction2 instanceof CategoryWithParamsInternalAction.CategoryWithParamsDataReceived) {
            CategoryParams categoryParams = ((CategoryWithParamsInternalAction.CategoryWithParamsDataReceived) categoryWithParamsInternalAction2).f117689b;
            String str = categoryParams.f117672b;
            AbstractList abstractList = categoryParams.f117673c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : abstractList) {
                if (obj instanceof ListItem.Option) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((ListItem.Option) it.next()).f117678d) {
                        z12 = true;
                        break;
                    }
                }
            }
            return CategoryWithParamsState.a(categoryWithParamsState2, str, abstractList, z12, 8);
        }
        if (categoryWithParamsInternalAction2 instanceof CategoryWithParamsInternalAction.FinishScreenWithResult) {
            return CategoryWithParamsState.a(categoryWithParamsState2, null, null, true, 3);
        }
        if (!(categoryWithParamsInternalAction2 instanceof CategoryWithParamsInternalAction.ToggleOption)) {
            throw new NoWhenBranchMatchedException();
        }
        CategoryWithParamsInternalAction.ToggleOption toggleOption = (CategoryWithParamsInternalAction.ToggleOption) categoryWithParamsInternalAction2;
        List<ListItem> list = categoryWithParamsState2.f117696c;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ListItem.Option) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((ListItem.Option) next2).f117678d) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((ListItem.Option) it3.next()).f117676b);
        }
        Iterator<T> it4 = this.f117710b.f117674d.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
            if (((List) next).containsAll(arrayList5)) {
                break;
            }
        }
        List list2 = (List) next;
        String str2 = toggleOption.f117692b;
        if (arrayList5.contains(str2)) {
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (Parcelable parcelableA : list) {
                if (parcelableA instanceof ListItem.Option) {
                    ListItem.Option option = (ListItem.Option) parcelableA;
                    if (L.f(option.f117676b, str2)) {
                        parcelableA = ListItem.Option.a(option, false);
                    }
                }
                arrayList.add(parcelableA);
            }
        } else if (list2 == null || !list2.contains(str2)) {
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (Parcelable parcelableA2 : list) {
                if (parcelableA2 instanceof ListItem.Option) {
                    ListItem.Option option2 = (ListItem.Option) parcelableA2;
                    parcelableA2 = ListItem.Option.a(option2, L.f(option2.f117676b, str2));
                }
                arrayList.add(parcelableA2);
            }
        } else {
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (Parcelable parcelableA3 : list) {
                if (parcelableA3 instanceof ListItem.Option) {
                    ListItem.Option option3 = (ListItem.Option) parcelableA3;
                    if (L.f(option3.f117676b, str2)) {
                        parcelableA3 = ListItem.Option.a(option3, true);
                    }
                }
                arrayList.add(parcelableA3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (obj3 instanceof ListItem.Option) {
                arrayList6.add(obj3);
            }
        }
        if (!arrayList6.isEmpty()) {
            Iterator it5 = arrayList6.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                if (((ListItem.Option) it5.next()).f117678d) {
                    z12 = true;
                    break;
                }
            }
        }
        return CategoryWithParamsState.a(categoryWithParamsState2, null, arrayList, z12, 9);
    }
}
