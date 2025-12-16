package com.avito.android.realty_agency.inline_filters.developer_suggest.mvi;

import Y41.p;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.huawei.hms.adapter.internal.AvailableCode;
import gi0.C40689d;
import gi0.InterfaceC40686a;
import gi0.InterfaceC40687b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ni0.InterfaceC44430a;
import pi0.C47094a;
import pi0.C47095b;
import pi0.C47096c;

/* compiled from: DeveloperSuggestFilterActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lgi0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.developer_suggest.mvi.DeveloperSuggestFilterActor$process$1", f = "DeveloperSuggestFilterActor.kt", i = {0}, l = {AvailableCode.ERROR_NO_ACTIVITY, 40, 43}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC40687b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f251537q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f251538r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f251539s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40689d f251540t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40686a f251541u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, C40689d c40689d, InterfaceC40686a interfaceC40686a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f251539s = cVar;
        this.f251540t = c40689d;
        this.f251541u = interfaceC40686a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f251539s, this.f251540t, this.f251541u, continuation);
        aVar.f251538r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC40687b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f251537q;
        InterfaceC40686a interfaceC40686a = this.f251541u;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f251538r;
            InterfaceC44430a interfaceC44430a = this.f251539s.f251546a;
            String str = this.f251540t.f396747b;
            C47095b c47095b = new C47095b(new C47096c(null, str != null ? Boxing.boxLong(Long.parseLong(str)) : null, ((InterfaceC40686a.C11224a) interfaceC40686a).f396736a), 100L, 0L);
            this.f251538r = interfaceC43172j;
            this.f251537q = 1;
            obj = interfaceC44430a.a(null, c47095b, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f251538r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            InterfaceC40687b.c cVar = new InterfaceC40687b.c(((InterfaceC40686a.C11224a) interfaceC40686a).f396736a, (C47094a) ((TypedResult.Success) typedResult).getResult());
            this.f251538r = null;
            this.f251537q = 2;
            if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            C35936s.a(error.getError(), error.getCause());
            InterfaceC40687b.c cVar2 = new InterfaceC40687b.c(((InterfaceC40686a.C11224a) interfaceC40686a).f396736a, new C47094a(C42784z0.f406748b));
            this.f251538r = null;
            this.f251537q = 3;
            if (interfaceC43172j.emit(cVar2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
