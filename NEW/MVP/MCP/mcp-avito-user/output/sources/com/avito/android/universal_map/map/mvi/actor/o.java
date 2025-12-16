package com.avito.android.universal_map.map.mvi.actor;

import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43187o;
import kotlinx.coroutines.flow.InterfaceC43160i;
import rG0.AbstractC47541a;

/* compiled from: UniversalMapActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LrG0/a;", "it", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Ljava/util/List;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.UniversalMapActor$process$3", f = "UniversalMapActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class o extends SuspendLambda implements Y41.p<List<? extends AbstractC47541a>, Continuation<? super InterfaceC43160i<? extends AbstractC47541a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f305401q;

    public o() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(2, continuation);
        oVar.f305401q = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(List<? extends AbstractC47541a> list, Continuation<? super InterfaceC43160i<? extends AbstractC47541a>> continuation) {
        return ((o) create(list, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new C43187o((List) this.f305401q);
    }
}
