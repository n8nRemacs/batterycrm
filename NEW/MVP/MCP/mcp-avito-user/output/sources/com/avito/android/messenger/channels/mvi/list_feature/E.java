package com.avito.android.messenger.channels.mvi.list_feature;

import HY.c;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.util.X2;
import io.reactivex.rxjava3.core.AbstractC41768a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: ChannelsListActor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LHY/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$24", f = "ChannelsListActor.kt", i = {}, l = {519}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class E extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f187709q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C31772a f187710r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c.b f187711s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(c.b bVar, C31772a c31772a, Continuation continuation) {
        super(2, continuation);
        this.f187710r = c31772a;
        this.f187711s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new E(this.f187711s, this.f187710r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((E) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        com.avito.android.arch.mvi.utils.c bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f187709q;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                C31772a c31772a = this.f187710r;
                c.b bVar2 = this.f187711s;
                AbstractC41768a abstractC41768aP = c31772a.f187937q.p(((c.b.h) bVar2).f7156b, ((c.b.h) bVar2).f7155a);
                this.f187709q = 1;
                if (C43292o.a(abstractC41768aP, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            bVar = new c.C2712c(kotlin.G0.f406611a);
        } catch (Throwable th2) {
            kotlinx.coroutines.Q0.e(getF411447c());
            bVar = new c.b(th2);
        }
        if (!(bVar instanceof c.C2712c)) {
            if (!(bVar instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            X2.f318778a.a("ChannelsListActor", "restoreLocallyDeletedChat failed", (Throwable) ((c.b) bVar).f92027b);
        }
        return kotlin.G0.f406611a;
    }
}
