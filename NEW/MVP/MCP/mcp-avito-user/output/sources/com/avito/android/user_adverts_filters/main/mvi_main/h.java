package com.avito.android.user_adverts_filters.main.mvi_main;

import com.avito.android.user_adverts_filters.main.mvi_main.entity.MainFiltersInternalAction;
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
import rJ0.InterfaceC47554a;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_main.MainFiltersActor$processLoadingChanges$$inlined$flatMapLatest$1", f = "MainFiltersActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class h extends SuspendLambda implements Y41.q<InterfaceC43172j<? super MainFiltersInternalAction>, InterfaceC47554a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f316259q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f316260r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f316261s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f316262t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f316263u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Y41.a aVar, r rVar, Continuation continuation) {
        super(3, continuation);
        this.f316262t = rVar;
        this.f316263u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super MainFiltersInternalAction> interfaceC43172j, InterfaceC47554a interfaceC47554a, Continuation<? super G0> continuation) {
        h hVar = new h(this.f316263u, this.f316262t, continuation);
        hVar.f316260r = interfaceC43172j;
        hVar.f316261s = interfaceC47554a;
        return hVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f316259q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f316260r;
            InterfaceC43160i<MainFiltersInternalAction> interfaceC43160iD = this.f316262t.b((InterfaceC47554a) this.f316261s, (rJ0.c) this.f316263u.invoke());
            this.f316259q = 1;
            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
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
