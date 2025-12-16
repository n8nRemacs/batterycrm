package com.avito.android.mortgage.root.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import f10.InterfaceC40199a;
import g10.C40513c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageRootFeatureBuilder.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/y;", "Lcom/avito/android/arch/mvi/q;", "Lf10/a;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lg10/c;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class y extends com.avito.android.arch.mvi.q<InterfaceC40199a, MortgageRootInternalAction, C40513c, f10.c> {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f203370k;

    /* compiled from: MortgageRootFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lf10/a;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lg10/c;", "Lf10/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC40199a, MortgageRootInternalAction, C40513c, f10.c>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f203371l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ D f203372m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ w f203373n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ s f203374o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ A f203375p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScreenPerformanceTracker screenPerformanceTracker, s sVar, w wVar, A a12, D d12) {
            super(1);
            this.f203371l = screenPerformanceTracker;
            this.f203372m = d12;
            this.f203373n = wVar;
            this.f203374o = sVar;
            this.f203375p = a12;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC40199a, MortgageRootInternalAction, C40513c, f10.c> qVar) {
            com.avito.android.arch.mvi.q<InterfaceC40199a, MortgageRootInternalAction, C40513c, f10.c> qVar2 = qVar;
            qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f203371l, this.f203372m);
            qVar2.f92008d = this.f203373n;
            qVar2.f92009e = this.f203374o;
            qVar2.f92010f = this.f203375p;
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public y(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k s sVar, @Y61.k w wVar, @Y61.k A a12, @Y61.k D d12) {
        super("mortgage_application_root", C40513c.f396245m, new a(screenPerformanceTracker, sVar, wVar, a12, d12));
        C40513c.f396244l.getClass();
        this.f203370k = screenPerformanceTracker;
    }
}
