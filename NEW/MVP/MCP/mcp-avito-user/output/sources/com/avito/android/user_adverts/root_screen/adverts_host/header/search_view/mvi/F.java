package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi;

import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;

/* compiled from: SearchViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/mvi/F;", "Lcom/avito/android/arch/mvi/android/j;", "LBI0/a;", "LBI0/d;", "LBI0/c;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class F extends com.avito.android.arch.mvi.android.j<BI0.a, BI0.d, BI0.c> implements com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.a {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f312848N;

    /* compiled from: SearchViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/b;", "invoke", "()Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<InterfaceC43160i<? extends com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.b>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC43160i<? extends com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.b> invoke() {
            return new E(new D(new C(com.avito.android.arch.mvi.utils.h.c(F.this.getState()))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(@Y61.k w wVar) {
        super(wVar, i2.a.f411432b);
        i2.f411430a.getClass();
        this.f312848N = C42727D.c(new a());
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.a
    @Y61.k
    public final InterfaceC43160i<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.b> Oa() {
        return (InterfaceC43160i) this.f312848N.getValue();
    }
}
