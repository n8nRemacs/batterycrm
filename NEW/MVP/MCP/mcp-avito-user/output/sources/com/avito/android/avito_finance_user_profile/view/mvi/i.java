package com.avito.android.avito_finance_user_profile.view.mvi;

import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mg.InterfaceC44078b;
import pg.C47078d;
import pg.InterfaceC47075a;
import pg.InterfaceC47076b;
import pg.InterfaceC47077c;

/* compiled from: AvitoFinanceBlockFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/mvi/i;", "Lcom/avito/android/arch/mvi/q;", "Lpg/a;", "Lpg/c;", "Lpg/d;", "Lpg/b;", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.android.arch.mvi.q<InterfaceC47075a, InterfaceC47077c, C47078d, InterfaceC47076b> {

    /* compiled from: AvitoFinanceBlockFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lpg/a;", "Lpg/c;", "Lpg/d;", "Lpg/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC47075a, InterfaceC47077c, C47078d, InterfaceC47076b>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f98057l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n f98058m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ k f98059n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, n nVar, k kVar) {
            super(1);
            this.f98057l = gVar;
            this.f98058m = nVar;
            this.f98059n = kVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC47075a, InterfaceC47077c, C47078d, InterfaceC47076b> qVar) {
            com.avito.android.arch.mvi.q<InterfaceC47075a, InterfaceC47077c, C47078d, InterfaceC47076b> qVar2 = qVar;
            qVar2.f92009e = this.f98057l;
            qVar2.f92011g = this.f98058m;
            qVar2.f92010f = this.f98059n;
            AW.f fVar = AW.f.f434a;
            com.avito.android.arch.mvi.log.g.f91991f.getClass();
            qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k InterfaceC44078b interfaceC44078b, @Y61.k g gVar, @Y61.k k kVar, @Y61.k n nVar) {
        super(interfaceC44078b.a(), new C47078d(interfaceC44078b, null, 2, 0 == true ? 1 : 0), new a(gVar, nVar, kVar));
    }
}
