package com.avito.android.category;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22187u0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class k extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CategoryFragment f116647l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CategoryFragment categoryFragment) {
        super(2);
        this.f116647l = categoryFragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            CategoryFragment categoryFragment = this.f116647l;
            com.avito.android.category.compose.b.a((q) categoryFragment.f116457o0.getValue(), a13, 8);
            C22187u0.d(new j(categoryFragment, null), a13, G0.f406611a);
        }
        return G0.f406611a;
    }
}
