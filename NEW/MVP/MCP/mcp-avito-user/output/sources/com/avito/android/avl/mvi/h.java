package com.avito.android.avl.mvi;

import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import zg.f;

/* compiled from: AvlPlayerActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LMg/c;", "it", "Lkotlinx/coroutines/flow/i;", "Lzg/f;", "<anonymous>", "(LMg/c;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.avl.mvi.AvlPlayerActor$process$3", f = "AvlPlayerActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class h extends SuspendLambda implements Y41.p<Mg.c, Continuation<? super InterfaceC43160i<? extends zg.f>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f98225q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f98226r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f98226r = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f98226r, continuation);
        hVar.f98225q = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(Mg.c cVar, Continuation<? super InterfaceC43160i<? extends zg.f>> continuation) {
        return ((h) create(cVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Mg.c cVar = (Mg.c) this.f98225q;
        List<com.avito.conveyor_item.a> list = cVar.f10986b;
        return C43175k.N(new C43210w(new f.e(list)), n.c(this.f98226r, list, cVar.f10985a));
    }
}
