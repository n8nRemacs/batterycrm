package com.avito.android.rating_form.step.dialog.mvi;

import Y41.p;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction;
import gh0.InterfaceC40682a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: DialogActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.dialog.mvi.DialogActor$process$2", f = "DialogActor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super DialogInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f249422q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f249423r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40682a f249424s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f249425t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC40682a interfaceC40682a, d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f249424s = interfaceC40682a;
        this.f249425t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f249424s, this.f249425t, continuation);
        cVar.f249423r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DialogInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f249422q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f249423r;
            C43501a c43501a = ((InterfaceC40682a.d) this.f249424s).f396706a;
            if ((c43501a.f413260a.f134520a instanceof AuthenticateLink) && (c43501a.f413261b instanceof AuthenticateLink.b.C4024b)) {
                C42784z0 c42784z0 = C42784z0.f406748b;
                this.f249422q = 1;
                if (d.c(this.f249425t, interfaceC43172j, c42784z0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
