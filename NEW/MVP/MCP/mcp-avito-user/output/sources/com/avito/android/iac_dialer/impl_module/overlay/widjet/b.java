package com.avito.android.iac_dialer.impl_module.overlay.widjet;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Activity;
import androidx.appcompat.app.m;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.dialer_mediator.IacOverlayState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.HashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lL.InterfaceC43652a;

/* compiled from: IacDialerOverlayLifecycleCallbacks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.overlay.widjet.IacDialerOverlayLifecycleCallbacks$onActivityCreated$1", f = "IacDialerOverlayLifecycleCallbacks.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f166156q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Activity f166157r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer.impl_module.overlay.widjet.a f166158s;

    /* compiled from: IacDialerOverlayLifecycleCallbacks.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.overlay.widjet.IacDialerOverlayLifecycleCallbacks$onActivityCreated$1$1", f = "IacDialerOverlayLifecycleCallbacks.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f166159q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_dialer.impl_module.overlay.widjet.a f166160r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Activity f166161s;

        /* compiled from: IacDialerOverlayLifecycleCallbacks.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.iac_dialer.impl_module.overlay.widjet.b$a$a, reason: collision with other inner class name */
        public static final class C4925a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.iac_dialer.impl_module.overlay.widjet.a f166162b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Activity f166163c;

            public C4925a(com.avito.android.iac_dialer.impl_module.overlay.widjet.a aVar, Activity activity) {
                this.f166162b = aVar;
                this.f166163c = activity;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                IacOverlayState iacOverlayState = (IacOverlayState) obj;
                com.avito.android.iac_dialer.impl_module.overlay.widjet.a aVar = this.f166162b;
                InterfaceC43652a interfaceC43652a = aVar.f166152e.get();
                Activity activity = this.f166163c;
                if (interfaceC43652a.b(activity) || !(iacOverlayState instanceof IacOverlayState.Visible)) {
                    aVar.i(activity);
                } else {
                    m mVar = (m) activity;
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
                    bVar.a("IacDialerOverlayLifecycleCallbacks", c.a(mVar) + ": updateOverlayView(), state=" + iacOverlayState, null);
                    HashMap<Integer, com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.a> map = aVar.f166154g;
                    Integer numValueOf = Integer.valueOf(mVar.hashCode());
                    com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.a aVar2 = map.get(numValueOf);
                    if (aVar2 == null) {
                        com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.a aVar3 = new com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.a(aVar.f166153f, mVar, c.a(mVar), aVar.f166155h, aVar.f166151d.get(), aVar.f166152e.get());
                        bVar.a("IacDialerOverlayLifecycleCallbacks", c.a(mVar) + ": addOverlayViewOnActivity()", null);
                        mVar.getWindowManager().addView(aVar3.f166171g, aVar3.f166172h);
                        map.put(Integer.valueOf(mVar.hashCode()), aVar3);
                        map.put(numValueOf, aVar3);
                        aVar2 = aVar3;
                    }
                    aVar2.a(iacOverlayState);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, com.avito.android.iac_dialer.impl_module.overlay.widjet.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f166160r = aVar;
            this.f166161s = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f166161s, this.f166160r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f166159q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.iac_dialer.impl_module.overlay.widjet.a aVar = this.f166160r;
                InterfaceC43160i<IacOverlayState> interfaceC43160iA = aVar.f166150c.get().a();
                C4925a c4925a = new C4925a(aVar, this.f166161s);
                this.f166159q = 1;
                if (interfaceC43160iA.collect(c4925a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity, com.avito.android.iac_dialer.impl_module.overlay.widjet.a aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f166157r = activity;
        this.f166158s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f166157r, this.f166158s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f166156q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Activity activity = this.f166157r;
            Lifecycle.State state = Lifecycle.State.f46683f;
            a aVar = new a(activity, this.f166158s, null);
            this.f166156q = 1;
            if (C23056p0.b((InterfaceC22983P) activity, state, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
