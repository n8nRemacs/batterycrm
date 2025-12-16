package com.avito.android.user_adverts_filters.main;

import Y41.l;
import com.avito.android.user_adverts_filters.main.view.g;
import com.avito.android.user_adverts_filters.main.vm.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAdvertsFiltersMainMviFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/view/g;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_adverts_filters/main/view/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements l<g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsFiltersMainMviFragment f316002l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment) {
        super(1);
        this.f316002l = userAdvertsFiltersMainMviFragment;
    }

    @Override // Y41.l
    public final G0 invoke(g gVar) {
        g gVar2 = gVar;
        boolean z12 = gVar2 instanceof g.a;
        UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment = this.f316002l;
        if (z12) {
            userAdvertsFiltersMainMviFragment.r5().accept(new h.b.a(((g.a) gVar2).f316356a));
        } else if (gVar2 instanceof g.b) {
            userAdvertsFiltersMainMviFragment.r5().accept(h.b.C9828b.f316419a);
        } else if (gVar2 instanceof g.c) {
            userAdvertsFiltersMainMviFragment.r5().accept(h.b.d.f316421a);
        }
        return G0.f406611a;
    }
}
