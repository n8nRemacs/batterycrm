package com.avito.android.rubricator.list.category.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.rubricator.list.category.model.CategoryListItem;
import com.avito.android.rubricator.list.category.mvi.entity.CategoryListState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vn0.InterfaceC49356a;
import vn0.InterfaceC49357b;

/* compiled from: CategoryListActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rubricator/list/category/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lvn0/a;", "Lvn0/b;", "Lcom/avito/android/rubricator/list/category/mvi/entity/CategoryListState;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC49356a, InterfaceC49357b, CategoryListState> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC49357b> b(InterfaceC49356a interfaceC49356a, CategoryListState categoryListState) {
        C43210w c43210w;
        InterfaceC49356a interfaceC49356a2 = interfaceC49356a;
        CategoryListState categoryListState2 = categoryListState;
        if (interfaceC49356a2 instanceof InterfaceC49356a.f) {
            return new C43210w(new InterfaceC49357b.f(((InterfaceC49356a.f) interfaceC49356a2).f440950a));
        }
        if (interfaceC49356a2 instanceof InterfaceC49356a.C12788a) {
            if (!categoryListState2.f255936e) {
                return C43175k.w();
            }
            c43210w = new C43210w(InterfaceC49357b.d.f440954a);
        } else {
            if (!(interfaceC49356a2 instanceof InterfaceC49356a.b)) {
                if (interfaceC49356a2 instanceof InterfaceC49356a.e) {
                    CategoryListItem categoryListItem = ((InterfaceC49356a.e) interfaceC49356a2).f440949a;
                    return !categoryListItem.f255921e.isEmpty() ? new C43210w(new InterfaceC49357b.e(categoryListItem)) : new C43210w(new InterfaceC49357b.c(categoryListItem.f255920d));
                }
                if (interfaceC49356a2 instanceof InterfaceC49356a.d) {
                    return new C43210w(new InterfaceC49357b.c(((InterfaceC49356a.d) interfaceC49356a2).f440948a));
                }
                if (interfaceC49356a2 instanceof InterfaceC49356a.c) {
                    return new C43210w(new InterfaceC49357b.C12789b(((InterfaceC49356a.c) interfaceC49356a2).f440947a));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(InterfaceC49357b.a.f440951a);
        }
        return c43210w;
    }
}
