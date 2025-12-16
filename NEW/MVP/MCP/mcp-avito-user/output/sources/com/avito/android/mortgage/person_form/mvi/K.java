package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PersonFormFeatureBuilder.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/K;", "Lcom/avito/android/arch/mvi/q;", "LE00/b;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "LG00/c;", "LE00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class K extends com.avito.android.arch.mvi.q<E00.b, PersonFormInternalAction, G00.c, E00.c> {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f200878k;

    /* compiled from: PersonFormFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LE00/b;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "LG00/c;", "LE00/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<E00.b, PersonFormInternalAction, G00.c, E00.c>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f200879l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ P f200880m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C32649a f200881n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ M f200882o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScreenPerformanceTracker screenPerformanceTracker, C32649a c32649a, M m12, P p12) {
            super(1);
            this.f200879l = screenPerformanceTracker;
            this.f200880m = p12;
            this.f200881n = c32649a;
            this.f200882o = m12;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.arch.mvi.q<E00.b, PersonFormInternalAction, G00.c, E00.c> qVar) {
            com.avito.android.arch.mvi.q<E00.b, PersonFormInternalAction, G00.c, E00.c> qVar2 = qVar;
            qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f200879l, this.f200880m);
            qVar2.f92009e = this.f200881n;
            qVar2.f92010f = this.f200882o;
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public K(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k C32649a c32649a, @Y61.k M m12, @Y61.k P p12) {
        super("MortgagePersonForm", G00.c.f6143s, new a(screenPerformanceTracker, c32649a, m12, p12));
        G00.c.f6142r.getClass();
        this.f200878k = screenPerformanceTracker;
    }
}
