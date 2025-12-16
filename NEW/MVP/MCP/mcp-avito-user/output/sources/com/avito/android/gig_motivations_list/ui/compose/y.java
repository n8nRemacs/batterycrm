package com.avito.android.gig_motivations_list.ui.compose;

import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
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
import zH.InterfaceC50464c;

/* compiled from: MotivationsListScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_motivations_list.ui.compose.MotivationsListScreenKt$MotivationsListScreen$1", f = "MotivationsListScreen.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class y extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f160342q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC50464c> f160343r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f160344s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f160345t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J f160346u;

    /* compiled from: MotivationsListScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LzH/c;", "event", "Lkotlin/G0;", "emit", "(LzH/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f160347b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f160348c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ J f160349d;

        public a(Y41.a<G0> aVar, com.akita.compose.component.toast_bar.u uVar, J j12) {
            this.f160347b = aVar;
            this.f160348c = uVar;
            this.f160349d = j12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InterfaceC50464c interfaceC50464c = (InterfaceC50464c) obj;
            if (interfaceC50464c instanceof InterfaceC50464c.a) {
                this.f160347b.invoke();
            } else if (interfaceC50464c instanceof InterfaceC50464c.b) {
                ((InterfaceC50464c.b) interfaceC50464c).getClass();
                Object objA = this.f160348c.a(this.f160349d, null, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : null, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, continuation);
                return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(InterfaceC43160i<? extends InterfaceC50464c> interfaceC43160i, Y41.a<G0> aVar, com.akita.compose.component.toast_bar.u uVar, J j12, Continuation<? super y> continuation) {
        super(2, continuation);
        this.f160343r = interfaceC43160i;
        this.f160344s = aVar;
        this.f160345t = uVar;
        this.f160346u = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new y(this.f160343r, this.f160344s, this.f160345t, this.f160346u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((y) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f160342q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f160344s, this.f160345t, this.f160346u);
            this.f160342q = 1;
            if (this.f160343r.collect(aVar, this) == coroutine_suspended) {
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
