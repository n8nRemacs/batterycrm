package com.avito.android.realty_agency.checkerboard.mvi;

import Zh0.C19563e;
import Zh0.InterfaceC19559a;
import Zh0.InterfaceC19561c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CheckerboardActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LZh0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardActor$process$1", f = "CheckerboardActor.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.realty_agency.checkerboard.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34226b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC19561c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f251233q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f251234r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC19559a f251235s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C19563e f251236t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34226b(InterfaceC19559a interfaceC19559a, C19563e c19563e, Continuation<? super C34226b> continuation) {
        super(2, continuation);
        this.f251235s = interfaceC19559a;
        this.f251236t = c19563e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34226b c34226b = new C34226b(this.f251235s, this.f251236t, continuation);
        c34226b.f251234r = obj;
        return c34226b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC19561c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34226b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f251233q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f251234r;
            boolean z12 = ((InterfaceC19559a.h) this.f251235s).f20411a;
            if (z12 == this.f251236t.f20458a) {
                return G0.f406611a;
            }
            InterfaceC19561c.q qVar = new InterfaceC19561c.q(z12);
            this.f251233q = 1;
            if (interfaceC43172j.emit(qVar, this) == coroutine_suspended) {
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
