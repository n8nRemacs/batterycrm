package com.avito.android.search.filter;

import androidx.fragment.app.ActivityC22955m;
import kotlin.Metadata;

/* compiled from: FiltersPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class P0 extends kotlin.jvm.internal.N implements Y41.l<kotlin.G0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f261889l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(C34574h0 c34574h0) {
        super(1);
        this.f261889l = c34574h0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(kotlin.G0 g02) {
        C34574h0 c34574h0 = this.f261889l;
        k1 k1Var = c34574h0.f263315M;
        if (k1Var != null) {
            k1Var.a();
        }
        FiltersFragment filtersFragment = c34574h0.f263316N;
        if (filtersFragment != null) {
            if (filtersFragment.l1() instanceof FiltersActivity) {
                ActivityC22955m activityC22955mL1 = filtersFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.setResult(0);
                }
                ActivityC22955m activityC22955mL12 = filtersFragment.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.finish();
                }
            } else {
                filtersFragment.B5(0, null);
                filtersFragment.r5();
            }
        }
        c34574h0.f263338f.f(true);
        return kotlin.G0.f406611a;
    }
}
