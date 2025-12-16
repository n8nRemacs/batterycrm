package com.avito.android.user_adverts_filters.main.mvi_main;

import com.avito.android.user_adverts_filters.main.mvi_main.entity.MainFiltersInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import rJ0.InterfaceC47554a;

/* compiled from: MainFiltersActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LrJ0/a$g;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "<anonymous>", "(LrJ0/a$g;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_main.MainFiltersActor$processResetClicked$1", f = "MainFiltersActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC47554a.g, Continuation<? super InterfaceC43160i<? extends MainFiltersInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f316277q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f316278r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<rJ0.c> f316279s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Y41.a aVar, r rVar, Continuation continuation) {
        super(2, continuation);
        this.f316278r = rVar;
        this.f316279s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f316279s, this.f316278r, continuation);
        lVar.f316277q = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC47554a.g gVar, Continuation<? super InterfaceC43160i<? extends MainFiltersInternalAction>> continuation) {
        return ((l) create(gVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f316278r.b((InterfaceC47554a.g) this.f316277q, this.f316279s.invoke());
    }
}
