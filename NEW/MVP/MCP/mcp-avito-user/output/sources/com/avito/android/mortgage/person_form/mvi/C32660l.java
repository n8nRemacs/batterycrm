package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PersonFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$resumed$1", f = "PersonFormActor.kt", i = {}, l = {466}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.person_form.mvi.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32660l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PersonFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201253q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201254r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G00.c f201255s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C32649a f201256t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32660l(G00.c cVar, C32649a c32649a, Continuation<? super C32660l> continuation) {
        super(2, continuation);
        this.f201255s = cVar;
        this.f201256t = c32649a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32660l c32660l = new C32660l(this.f201255s, this.f201256t, continuation);
        c32660l.f201254r = obj;
        return c32660l;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32660l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201253q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f201254r;
            Set<String> set = r.f201300a;
            G00.c cVar = this.f201255s;
            JZ.u uVar = cVar.f6154l;
            if (!C42745f0.r(set, uVar != null ? uVar.getStatus() : null)) {
                return G0.f406611a;
            }
            InterfaceC43160i interfaceC43160iB = this.f201256t.f200898d.b(cVar.f6144b, cVar.f6145c, cVar.c());
            this.f201253q = 1;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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
