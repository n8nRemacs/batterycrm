package com.avito.android.service_booking.mvi.step;

import Hs0.InterfaceC14030a;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import java.util.Set;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: ServiceBookingMviStepViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/P;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "", "LHs0/b;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class P extends M0 implements com.avito.android.arch.mvi.android.k<Object, Hs0.b, Object> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.B f274464E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Set<FV0.h> f274465J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final aU0.b f274466K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f274467L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f274468M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f274469N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.internal.m f274470O;

    /* compiled from: ServiceBookingMviStepViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking.mvi.step.ServiceBookingMviStepViewModel$accept$1", f = "ServiceBookingMviStepViewModel.kt", i = {}, l = {41, 42}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f274471q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Object f274472r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ P f274473s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, P p12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f274472r = obj;
            this.f274473s = p12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f274472r, this.f274473s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f274471q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Object obj2 = this.f274472r;
                boolean z12 = obj2 instanceof InterfaceC40047a;
                P p12 = this.f274473s;
                if (z12) {
                    com.avito.android.lib.beduin_v2.feature.mvi.x xVar = (com.avito.android.lib.beduin_v2.feature.mvi.x) p12.f274467L.getValue();
                    this.f274471q = 1;
                    if (xVar.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (obj2 instanceof InterfaceC14030a) {
                    com.avito.android.arch.mvi.c cVar = (com.avito.android.arch.mvi.c) p12.f274468M.getValue();
                    this.f274471q = 2;
                    if (cVar.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingMviStepViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f274474l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ P f274475m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n.a aVar, P p12) {
            super(0);
            this.f274474l = aVar;
            this.f274475m = p12;
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f274474l.a(N0.a(this.f274475m));
        }
    }

    /* compiled from: ServiceBookingMviStepViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "LHs0/a;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepState;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.arch.mvi.c<InterfaceC14030a, ServiceBookingMviStepInternalAction, ServiceBookingMviStepState, com.avito.android.service_booking.mvi.step.mvi.entity.a>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.service_booking.mvi.step.mvi.l f274476l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ P f274477m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.service_booking.mvi.step.mvi.l lVar, P p12) {
            super(0);
            this.f274476l = lVar;
            this.f274477m = p12;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<InterfaceC14030a, ServiceBookingMviStepInternalAction, ServiceBookingMviStepState, com.avito.android.service_booking.mvi.step.mvi.entity.a> invoke() {
            return this.f274476l.a(null, N0.a(this.f274477m));
        }
    }

    /* compiled from: ServiceBookingMviStepViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/n2;", "LHs0/b;", "invoke", "()Lkotlinx/coroutines/flow/n2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<n2<? extends Hs0.b>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final n2<? extends Hs0.b> invoke() {
            P p12 = P.this;
            com.avito.android.arch.mvi.c cVar = (com.avito.android.arch.mvi.c) p12.f274468M.getValue();
            InterfaceC42726C interfaceC42726C = p12.f274467L;
            C1 c12 = new C1(cVar, (com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726C.getValue(), new Q(3, null));
            A1.a aVarA = N0.a(p12);
            i2.f411430a.getClass();
            return C43175k.U(c12, aVarA, i2.a.f411433c, new Hs0.b((ServiceBookingMviStepState) ((com.avito.android.arch.mvi.c) p12.f274468M.getValue()).f91929r.get(), (AbstractC40048c) ((com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726C.getValue()).getState()));
        }
    }

    @Inject
    public P(@Y61.k com.avito.android.service_booking.mvi.step.mvi.l lVar, @Y61.k n.a aVar, @Y61.k com.avito.beduin.v2.engine.component.B b12, @Y61.k Set<FV0.h> set, @Y61.k aU0.b bVar) {
        this.f274464E = b12;
        this.f274465J = set;
        this.f274466K = bVar;
        InterfaceC42726C interfaceC42726CC = C42727D.c(new b(aVar, this));
        this.f274467L = interfaceC42726CC;
        InterfaceC42726C interfaceC42726CC2 = C42727D.c(new c(lVar, this));
        this.f274468M = interfaceC42726CC2;
        this.f274469N = C42727D.c(new d());
        this.f274470O = C43175k.N(((com.avito.android.arch.mvi.c) interfaceC42726CC2.getValue()).f91928q, ((com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726CC.getValue()).getEvents());
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(@Y61.k Object obj) {
        C43259k.d(N0.a(this), null, null, new a(obj, this, null), 3);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<Object> getEvents() {
        return this.f274470O;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<Hs0.b> getState() {
        return (n2) this.f274469N.getValue();
    }
}
