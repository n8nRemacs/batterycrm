package com.avito.android.search.filter;

import com.avito.android.select.Arguments;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: FiltersPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/category_group/B;", "payload", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/search/filter/adapter/category_group/B;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class B0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.search.filter.adapter.category_group.B, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f261748l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(C34574h0 c34574h0) {
        super(1);
        this.f261748l = c34574h0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(com.avito.android.search.filter.adapter.category_group.B b12) {
        com.avito.android.search.filter.adapter.category_group.B b13 = b12;
        Arguments arguments = new Arguments(false, "category_group_select_id", null, b13.f262036c, C42784z0.f406748b, b13.f262035b, null, !b13.f262037d, false, false, false, false, true, false, false, null, false, null, null, null, null, true, false, false, false, false, true, false, null, null, null, false, false, null, false, false, false, 0, null, null, -103242939, 255, null);
        C34574h0 c34574h0 = this.f261748l;
        k1 k1Var = c34574h0.f263315M;
        if (k1Var != null) {
            k1Var.a();
        }
        FiltersFragment filtersFragment = c34574h0.f263316N;
        if (filtersFragment != null) {
            filtersFragment.D5(arguments);
        }
        return kotlin.G0.f406611a;
    }
}
