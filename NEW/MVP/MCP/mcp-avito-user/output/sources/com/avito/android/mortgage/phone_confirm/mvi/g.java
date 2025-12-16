package com.avito.android.mortgage.phone_confirm.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhoneConfirmFeatureBuilder.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/g;", "Lcom/avito/android/arch/mvi/q;", "LJ00/a;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "LJ00/c;", "LJ00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends q<J00.a, PhoneConfirmInternalAction, J00.c, J00.b> {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f201649k;

    /* compiled from: PhoneConfirmFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LJ00/a;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "LJ00/c;", "LJ00/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<q<J00.a, PhoneConfirmInternalAction, J00.c, J00.b>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f201650l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e f201651m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ i f201652n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f201653o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ k f201654p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScreenPerformanceTracker screenPerformanceTracker, c cVar, e eVar, i iVar, k kVar) {
            super(1);
            this.f201650l = cVar;
            this.f201651m = eVar;
            this.f201652n = iVar;
            this.f201653o = screenPerformanceTracker;
            this.f201654p = kVar;
        }

        @Override // Y41.l
        public final G0 invoke(q<J00.a, PhoneConfirmInternalAction, J00.c, J00.b> qVar) {
            q<J00.a, PhoneConfirmInternalAction, J00.c, J00.b> qVar2 = qVar;
            qVar2.f92009e = this.f201650l;
            qVar2.f92008d = this.f201651m;
            qVar2.f92010f = this.f201652n;
            qVar2.f92011g = new o(this.f201653o, this.f201654p);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public g(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k c cVar, @Y61.k e eVar, @Y61.k i iVar, @Y61.k k kVar) {
        super("PhoneConfirmationDialog", J00.c.f8700p, new a(screenPerformanceTracker, cVar, eVar, iVar, kVar));
        J00.c.f8699o.getClass();
        this.f201649k = screenPerformanceTracker;
    }
}
