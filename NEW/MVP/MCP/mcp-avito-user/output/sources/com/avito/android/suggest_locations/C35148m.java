package com.avito.android.suggest_locations;

import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import tF.AbstractC48544a;

/* compiled from: SuggestLocationsInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "LtF/a$c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.suggest_locations.SuggestLocationsInteractorImpl$getAddressSuggestionV2$1$1", f = "SuggestLocationsInteractor.kt", i = {0}, l = {96, 97}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.suggest_locations.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35148m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<AbstractC48544a.c>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f292343q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f292344r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35154t f292345s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f292346t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35148m(C35154t c35154t, String str, Continuation<? super C35148m> continuation) {
        super(2, continuation);
        this.f292345s = c35154t;
        this.f292346t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35148m c35148m = new C35148m(this.f292345s, this.f292346t, continuation);
        c35148m.f292344r = obj;
        return c35148m;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<AbstractC48544a.c>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35148m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f292343q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f292344r;
            com.avito.android.geo_common.interactor.g gVar = this.f292345s.f292378a;
            this.f292344r = interfaceC43172j;
            this.f292343q = 1;
            obj = gVar.p(this.f292346t, (254 & 2) != 0 ? null : null, (254 & 4) != 0 ? null : null, (254 & 8) != 0 ? null : null, (254 & 16) != 0 ? null : null, P0.c(), this);
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
            interfaceC43172j = (InterfaceC43172j) this.f292344r;
            C42729a0.b(obj);
        }
        this.f292344r = null;
        this.f292343q = 2;
        if (interfaceC43172j.emit((TypedResult) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
