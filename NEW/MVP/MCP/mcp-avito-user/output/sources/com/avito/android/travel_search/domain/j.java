package com.avito.android.travel_search.domain;

import Y41.p;
import com.avito.android.error.z;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction;
import com.avito.android.util.C35936s;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sF0.InterfaceC48043a;
import uF0.C48890a;

/* compiled from: TravelSearchInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_search.domain.TravelSearchInteractorImpl$getFavorites$1", f = "TravelSearchInteractor.kt", i = {0}, l = {43, 46, 49}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class j extends SuspendLambda implements p<InterfaceC43172j<? super TravelSearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f303106q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f303107r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f303108s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SearchParams f303109t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, SearchParams searchParams, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f303108s = iVar;
        this.f303109t = searchParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f303108s, this.f303109t, continuation);
        jVar.f303107r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TravelSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f303106q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f303107r;
            i iVar = this.f303108s;
            InterfaceC48043a interfaceC48043a = iVar.f303103a;
            Map<String, Object> mapConvertToMap$default = SearchParamsConverter.DefaultImpls.convertToMap$default(iVar.f303105c, this.f303109t, null, false, null, 14, null);
            this.f303107r = interfaceC43172j;
            this.f303106q = 1;
            obj = interfaceC48043a.b(mapConvertToMap$default, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f303107r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            TravelSearchInternalAction.ContentLoaded contentLoaded = new TravelSearchInternalAction.ContentLoaded((C48890a) ((TypedResult.Success) typedResult).getResult());
            this.f303107r = null;
            this.f303106q = 2;
            if (interfaceC43172j.emit(contentLoaded, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            TravelSearchInternalAction.ContentError contentError = new TravelSearchInternalAction.ContentError(z.n(C35936s.a(error.getError(), error.getCause())));
            this.f303107r = null;
            this.f303106q = 3;
            if (interfaceC43172j.emit(contentError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
