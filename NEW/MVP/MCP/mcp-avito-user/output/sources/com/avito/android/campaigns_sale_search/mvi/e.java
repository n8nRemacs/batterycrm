package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import um.b;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale_search.mvi.CampaignsSaleSearchActor$process$$inlined$flatMapLatest$2", f = "CampaignsSaleSearchActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
public final class e extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, b.n, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114707q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f114708r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f114709s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f114710t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f114711u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Y41.a aVar, a aVar2, Continuation continuation) {
        super(3, continuation);
        this.f114710t = aVar2;
        this.f114711u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, b.n nVar, Continuation<? super G0> continuation) {
        e eVar = new e(this.f114711u, this.f114710t, continuation);
        eVar.f114708r = interfaceC43172j;
        eVar.f114709s = nVar;
        return eVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114707q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f114708r;
            InterfaceC43160i interfaceC43160iA = this.f114710t.f114636a.a(((um.d) this.f114711u.invoke()).f440262b, ((b.n) this.f114709s).f440245a);
            this.f114707q = 1;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
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
