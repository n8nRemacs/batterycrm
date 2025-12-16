package com.avito.android.mortgage.selected_appeal.mvi;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.mortgage.selected_appeal.mvi.entity.SelectedAppealInternalAction;
import i10.InterfaceC41208a;
import k10.C42473c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectedAppealActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.selected_appeal.mvi.SelectedAppealActor$process$1", f = "SelectedAppealActor.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super SelectedAppealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f203452q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f203453r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f203454s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C42473c f203455t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, C42473c c42473c, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f203454s = bVar;
        this.f203455t = c42473c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f203454s, this.f203455t, continuation);
        aVar.f203453r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectedAppealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f203452q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f203453r;
            b bVar = this.f203454s;
            InterfaceC41208a interfaceC41208a = bVar.f203457b;
            C42473c c42473c = this.f203455t;
            interfaceC41208a.a(c42473c.f405993b, c42473c.f405996e, c42473c.f406001j, c42473c.f406002k);
            InterfaceC43160i<SelectedAppealInternalAction> interfaceC43160iA = bVar.f203456a.a(c42473c.f405993b, c42473c.f405994c);
            this.f203452q = 1;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
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
