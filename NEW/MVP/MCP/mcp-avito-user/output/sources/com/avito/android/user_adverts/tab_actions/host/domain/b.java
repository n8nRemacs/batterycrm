package com.avito.android.user_adverts.tab_actions.host.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import bm0.InterfaceC25677b;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.A4;
import hm0.InterfaceC40961a;
import java.util.Map;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: UserAdvertsActionsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lhm0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.domain.UserAdvertsActionsInteractorImpl$activate$2", f = "UserAdvertsActionsInteractor.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<InterfaceC40961a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314230q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f314231r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Set<String> f314232s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f314233t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Set<String> set, Map<String, String> map, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f314231r = cVar;
        this.f314232s = set;
        this.f314233t = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f314231r, this.f314232s, this.f314233t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<InterfaceC40961a>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314230q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC25677b interfaceC25677b = this.f314231r.f314234a.get();
            A4.f318516a.getClass();
            Map<String, String> mapH = A4.h(this.f314232s, "itemIds");
            Map<String, String> map = this.f314233t;
            Map<String, String> mapH2 = map != null ? A4.h(map, "cptTokens") : P0.c();
            this.f314230q = 1;
            obj = interfaceC25677b.b(mapH, mapH2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
