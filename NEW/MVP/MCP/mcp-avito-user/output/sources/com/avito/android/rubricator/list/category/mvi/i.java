package com.avito.android.rubricator.list.category.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.rubricator.list.category.model.CategoryListItem;
import com.avito.android.rubricator.list.category.mvi.entity.CategoryListState;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import vn0.InterfaceC49357b;

/* compiled from: CategoryListReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rubricator/list/category/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "Lvn0/b;", "Lcom/avito/android/rubricator/list/category/mvi/entity/CategoryListState;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements u<InterfaceC49357b, CategoryListState> {
    @Inject
    public i() {
    }

    public static ArrayList b(List list, CategoryListItem categoryListItem) {
        List<CategoryListItem> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (CategoryListItem categoryListItem2 : list2) {
            if (L.f(categoryListItem2, categoryListItem)) {
                categoryListItem2 = new CategoryListItem(categoryListItem2.f255918b, categoryListItem2.f255919c, categoryListItem2.f255920d, categoryListItem2.f255921e, categoryListItem2.f255922f, categoryListItem2.f255923g, categoryListItem2.f255924h, categoryListItem2.f255925i, !categoryListItem2.f255926j, null);
            }
            arrayList.add(categoryListItem2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.rubricator.list.category.mvi.entity.CategoryListState a(vn0.InterfaceC49357b r8, com.avito.android.rubricator.list.category.mvi.entity.CategoryListState r9) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rubricator.list.category.mvi.i.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
