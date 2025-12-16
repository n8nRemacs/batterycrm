package com.avito.android.avl.mvi;

import Mg.InterfaceC14486a;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zg.e;

/* compiled from: AvlPlayerActor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lcom/avito/conveyor_item/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.avl.mvi.AvlPlayerActor$process$1", f = "AvlPlayerActor.kt", i = {}, l = {51, 51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super List<? extends com.avito.conveyor_item.a>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f98221q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f98222r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f98223s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zg.e f98224t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, Continuation continuation, zg.e eVar) {
        super(2, continuation);
        this.f98223s = nVar;
        this.f98224t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f98223s, continuation, this.f98224t);
        gVar.f98222r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super List<? extends com.avito.conveyor_item.a>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f98221q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f98222r;
            n nVar = this.f98223s;
            InterfaceC14486a interfaceC14486a = nVar.f98239b;
            String str = ((e.h) this.f98224t).f444142a;
            this.f98222r = interfaceC43172j;
            this.f98221q = 1;
            obj = interfaceC14486a.a(nVar.f98240c, (8 & 2) != 0 ? null : null, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f98222r;
            C42729a0.b(obj);
        }
        this.f98222r = null;
        this.f98221q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
