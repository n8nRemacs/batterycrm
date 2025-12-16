package com.avito.android.realty_agency.inline_filters.developer_suggest.mvi;

import Y41.p;
import com.avito.android.realty_agency.inline_filters_public.generated.api.api_2_nd_trx_developments_suggest_post.DevelopmentSuggestV1Suggest;
import gi0.C40689d;
import gi0.InterfaceC40686a;
import gi0.InterfaceC40687b;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pi0.C47094a;

/* compiled from: DeveloperSuggestFilterActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lgi0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.developer_suggest.mvi.DeveloperSuggestFilterActor$process$2", f = "DeveloperSuggestFilterActor.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC40687b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f251542q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f251543r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C40689d f251544s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40686a f251545t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C40689d c40689d, InterfaceC40686a interfaceC40686a, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f251544s = c40689d;
        this.f251545t = interfaceC40686a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f251544s, this.f251545t, continuation);
        bVar.f251543r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC40687b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<DevelopmentSuggestV1Suggest> listA;
        DevelopmentSuggestV1Suggest developmentSuggestV1Suggest;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f251542q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f251543r;
            C47094a c47094a = this.f251544s.f396750e;
            if (c47094a == null || (listA = c47094a.a()) == null || (developmentSuggestV1Suggest = listA.get(((InterfaceC40686a.b) this.f251545t).f396737a)) == null) {
                return G0.f406611a;
            }
            InterfaceC40687b.C11225b c11225b = new InterfaceC40687b.C11225b(developmentSuggestV1Suggest);
            this.f251542q = 1;
            if (interfaceC43172j.emit(c11225b, this) == coroutine_suspended) {
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
