package com.avito.android.avito_finance_user_profile.view.mvi;

import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import og.C44772a;
import qg.C47395a;

/* compiled from: AvitoFinanceBlockActor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Log/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.avito_finance_user_profile.view.mvi.AvitoFinanceBlockActor$process$2", f = "AvitoFinanceBlockActor.kt", i = {}, l = {51, 51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<C44772a>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f98046q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f98047r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f98048s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f98048s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f98048s, continuation);
        dVar.f98047r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<C44772a>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f98046q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f98047r;
            g gVar = this.f98048s;
            com.avito.android.avito_finance_user_profile.view.domain.b bVar = gVar.f98055b;
            C47395a c47395a = gVar.f98056c;
            this.f98047r = interfaceC43172j;
            this.f98046q = 1;
            obj = bVar.a(c47395a.f429345a, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f98047r;
            C42729a0.b(obj);
        }
        this.f98047r = null;
        this.f98046q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
