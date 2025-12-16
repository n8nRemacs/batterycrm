package com.avito.android.iac_dialer.impl_module.active_call_processing.mediator;

import JK.j;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialer;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import h31.e;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: IacDialerMediator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/mediator/b;", "MediatorAction", "MediatorState", "MediatorEvent", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/mediator/a;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class b<MediatorAction, MediatorState, MediatorEvent> implements com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.a<MediatorAction, MediatorState, MediatorEvent> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165640a = C42727D.c(new a(this));

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165641b = C42727D.c(new C4908b(this));

    /* compiled from: IacDialerMediator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/IacDialer;", "kotlin.jvm.PlatformType", "MediatorAction", "MediatorState", "MediatorEvent", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<IacDialer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b<MediatorAction, MediatorState, MediatorEvent> f165642l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<MediatorAction, MediatorState, MediatorEvent> bVar) {
            super(0);
            this.f165642l = bVar;
        }

        @Override // Y41.a
        public final IacDialer invoke() {
            return this.f165642l.b().get();
        }
    }

    /* compiled from: IacDialerMediator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"MediatorAction", "MediatorState", "MediatorEvent", "Lkotlinx/coroutines/flow/Z1;", "invoke", "()Lkotlinx/coroutines/flow/Z1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b$b, reason: collision with other inner class name */
    public static final class C4908b extends N implements Y41.a<Z1<MediatorState>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b<MediatorAction, MediatorState, MediatorEvent> f165643l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4908b(b<MediatorAction, MediatorState, MediatorEvent> bVar) {
            super(0);
            this.f165643l = bVar;
        }

        @Override // Y41.a
        public final Object invoke() {
            b<MediatorAction, MediatorState, MediatorEvent> bVar = this.f165643l;
            Z1 z1A = p2.a(bVar.d().b(((IacDialer) bVar.f165640a.getValue()).getState().getValue()));
            C43259k.d(U.a(EmptyCoroutineContext.INSTANCE), null, null, new d(bVar, z1A, null), 3);
            return z1A;
        }
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.a
    public final void a(MediatorAction mediatoraction, @k String str) {
        IacAction iacActionB = e().b(mediatoraction);
        if (iacActionB != null) {
            ((IacDialer) this.f165640a.getValue()).accept(iacActionB, str);
        }
    }

    @k
    public abstract e<IacDialer> b();

    @k
    public abstract j<IacEvent, MediatorEvent> c();

    @k
    public abstract j<IacState, MediatorState> d();

    @k
    public abstract j<MediatorAction, IacAction> e();

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.a
    @k
    public final c getEvents() {
        return new c(((IacDialer) this.f165640a.getValue()).getEvents(), this);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.a
    @k
    public final n2<MediatorState> getState() {
        return (n2) this.f165641b.getValue();
    }
}
