package com.avito.android.edit_count_field.mvi;

import Y41.p;
import Y61.l;
import com.avito.android.edit_count_field.mvi.entity.EditCountFieldInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import uy.C49127c;

/* compiled from: EditCountFieldActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_count_field.mvi.EditCountFieldActor$process$2", f = "EditCountFieldActor.kt", i = {}, l = {45, 47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super EditCountFieldInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f146631q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f146632r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f146633s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C49127c f146634t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, C49127c c49127c, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f146633s = cVar;
        this.f146634t = c49127c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f146633s, this.f146634t, continuation);
        bVar.f146632r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EditCountFieldInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f146631q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f146632r;
            C49127c c49127c = this.f146634t;
            String str = c49127c.f440356b;
            c cVar = this.f146633s;
            if (!c.c(cVar, str, c49127c.f440357c, c49127c.f440358d)) {
                return G0.f406611a;
            }
            Integer numY0 = C43066x.y0(c49127c.f440356b);
            if (L.f(cVar.f146636b.f146623b.f229369n, numY0)) {
                EditCountFieldInternalAction.SubmitSuccess submitSuccess = new EditCountFieldInternalAction.SubmitSuccess(false);
                this.f146631q = 2;
                if (interfaceC43172j.emit(submitSuccess, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                InterfaceC43160i<EditCountFieldInternalAction> interfaceC43160iA = cVar.f146635a.a(numY0);
                this.f146631q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
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
