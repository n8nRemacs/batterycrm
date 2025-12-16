package com.avito.android.mortgage.applicant_type.mvi;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.mortgage.applicant_type.mvi.entity.ApplicantTypeSelectorInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApplicantTypeSelectorFeatureBuilder.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/applicant_type/mvi/e;", "Lcom/avito/android/arch/mvi/q;", "LPZ/a;", "Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction;", "LPZ/c;", "LPZ/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends q<PZ.a, ApplicantTypeSelectorInternalAction, PZ.c, PZ.b> {

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f198318k;

    /* compiled from: ApplicantTypeSelectorFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LPZ/a;", "Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction;", "LPZ/c;", "LPZ/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<q<PZ.a, ApplicantTypeSelectorInternalAction, PZ.c, PZ.b>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.mortgage.applicant_type.mvi.a f198319l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ g f198320m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f198321n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ i f198322o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ c f198323p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScreenPerformanceTracker screenPerformanceTracker, com.avito.android.mortgage.applicant_type.mvi.a aVar, c cVar, g gVar, i iVar) {
            super(1);
            this.f198319l = aVar;
            this.f198320m = gVar;
            this.f198321n = screenPerformanceTracker;
            this.f198322o = iVar;
            this.f198323p = cVar;
        }

        @Override // Y41.l
        public final G0 invoke(q<PZ.a, ApplicantTypeSelectorInternalAction, PZ.c, PZ.b> qVar) {
            q<PZ.a, ApplicantTypeSelectorInternalAction, PZ.c, PZ.b> qVar2 = qVar;
            qVar2.f92009e = this.f198319l;
            qVar2.f92010f = this.f198320m;
            qVar2.f92011g = new o(this.f198321n, this.f198322o);
            qVar2.f92008d = this.f198323p;
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public e(@k ScreenPerformanceTracker screenPerformanceTracker, @k com.avito.android.mortgage.applicant_type.mvi.a aVar, @k c cVar, @k g gVar, @k i iVar) {
        super("applicant_type_selector_dialog", PZ.c.f13139f, new a(screenPerformanceTracker, aVar, cVar, gVar, iVar));
        PZ.c.f13138e.getClass();
        this.f198318k = screenPerformanceTracker;
    }
}
