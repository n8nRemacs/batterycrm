package com.avito.android.mortgage.sending_confirm.mvi;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.mortgage.sending_confirm.mvi.entity.SendingConfirmInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import m10.C43861c;
import m10.InterfaceC43859a;
import m10.InterfaceC43860b;

/* compiled from: SendingConfirmFeatureBuilder.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/mvi/e;", "Lcom/avito/android/arch/mvi/q;", "Lm10/a;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction;", "Lm10/c;", "Lm10/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends q<InterfaceC43859a, SendingConfirmInternalAction, C43861c, InterfaceC43860b> {

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f203566k;

    /* compiled from: SendingConfirmFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lm10/a;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction;", "Lm10/c;", "Lm10/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<q<InterfaceC43859a, SendingConfirmInternalAction, C43861c, InterfaceC43860b>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.mortgage.sending_confirm.mvi.a f203567l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f203568m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ g f203569n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f203570o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ i f203571p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScreenPerformanceTracker screenPerformanceTracker, com.avito.android.mortgage.sending_confirm.mvi.a aVar, c cVar, g gVar, i iVar) {
            super(1);
            this.f203567l = aVar;
            this.f203568m = cVar;
            this.f203569n = gVar;
            this.f203570o = screenPerformanceTracker;
            this.f203571p = iVar;
        }

        @Override // Y41.l
        public final G0 invoke(q<InterfaceC43859a, SendingConfirmInternalAction, C43861c, InterfaceC43860b> qVar) {
            q<InterfaceC43859a, SendingConfirmInternalAction, C43861c, InterfaceC43860b> qVar2 = qVar;
            qVar2.f92009e = this.f203567l;
            qVar2.f92008d = this.f203568m;
            qVar2.f92010f = this.f203569n;
            qVar2.f92011g = new o(this.f203570o, this.f203571p);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public e(@k ScreenPerformanceTracker screenPerformanceTracker, @k com.avito.android.mortgage.sending_confirm.mvi.a aVar, @k c cVar, @k g gVar, @k i iVar) {
        super("application_sending_confirmation", C43861c.f414262i, new a(screenPerformanceTracker, aVar, cVar, gVar, iVar));
        C43861c.f414261h.getClass();
        this.f203566k = screenPerformanceTracker;
    }
}
