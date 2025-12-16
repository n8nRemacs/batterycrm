package com.avito.android.publish.screen.objects.mvi;

import Ee0.C13479a;
import Ge0.InterfaceC13872a;
import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
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

/* compiled from: ObjectFillFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.objects.mvi.ObjectFillFormActor$onNavigationButtonClicked$1", f = "ObjectFillFormActor.kt", i = {}, l = {61, 63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ObjectFillFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f240189q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f240190r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13872a.l f240191s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f240192t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC13872a.l lVar, f fVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f240191s = lVar;
        this.f240192t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f240191s, this.f240192t, continuation);
        cVar.f240190r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ObjectFillFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f240189q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f240190r;
            C13479a c13479a = this.f240191s.f6641a;
            if (c13479a.f4128b == null) {
                f fVar = this.f240192t;
                fVar.getClass();
                InterfaceC43160i interfaceC43160iG = C43175k.G(new a(c13479a, fVar, null));
                this.f240189q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                ObjectFillFormInternalAction.ShowConfirmation showConfirmation = new ObjectFillFormInternalAction.ShowConfirmation(c13479a);
                this.f240189q = 2;
                if (interfaceC43172j.emit(showConfirmation, this) == coroutine_suspended) {
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
