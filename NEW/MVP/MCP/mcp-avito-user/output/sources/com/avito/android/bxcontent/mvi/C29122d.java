package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.h;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$$inlined$flatMapLatest$1", f = "BxContentActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29122d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.bxcontent.mvi.entity.h, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f111763q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f111764r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f111765s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C29105a f111766t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f111767u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29122d(Y41.a aVar, C29105a c29105a, Continuation continuation) {
        super(3, continuation);
        this.f111766t = c29105a;
        this.f111767u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.bxcontent.mvi.entity.h hVar, Continuation<? super kotlin.G0> continuation) {
        C29105a c29105a = this.f111766t;
        C29122d c29122d = new C29122d(this.f111767u, c29105a, continuation);
        c29122d.f111764r = interfaceC43172j;
        c29122d.f111765s = hVar;
        return c29122d.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f111763q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f111764r;
            com.avito.android.bxcontent.mvi.entity.h hVar = (com.avito.android.bxcontent.mvi.entity.h) this.f111765s;
            if (!(hVar instanceof h.a)) {
                throw new NoWhenBranchMatchedException();
            }
            C43210w c43210w = new C43210w(new BxContentInternalAction.UpdatePrivateState(((h.a) hVar).f112293a));
            C29105a c29105a = this.f111766t;
            kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(c43210w, new C43197r1(new C29198h(c29105a, null), new C29202j(C43175k.L(new C29196g(2, null), c29105a.f111524H.b(new C29194f(hVar, null))), this.f111767u)));
            this.f111763q = 1;
            if (C43175k.u(this, mVarN, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
