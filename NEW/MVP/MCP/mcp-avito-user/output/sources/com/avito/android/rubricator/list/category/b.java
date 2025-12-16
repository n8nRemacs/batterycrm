package com.avito.android.rubricator.list.category;

import Y41.p;
import androidx.compose.runtime.A;
import com.avito.android.rubricator.list.category.CategoryListFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryListFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CategoryListFragment f255856l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CategoryListFragment categoryListFragment) {
        super(2);
        this.f255856l = categoryListFragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            CategoryListFragment.a aVar = CategoryListFragment.f255836A0;
            CategoryListFragment categoryListFragment = this.f255856l;
            com.avito.android.rubricator.list.category.compose.b.a((i) categoryListFragment.f255838u0.getValue(), new a(1, categoryListFragment, CategoryListFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/rubricator/list/category/mvi/entity/CategoryListOneTimeEvent;)V", 0), a13, 8);
        }
        return G0.f406611a;
    }
}
