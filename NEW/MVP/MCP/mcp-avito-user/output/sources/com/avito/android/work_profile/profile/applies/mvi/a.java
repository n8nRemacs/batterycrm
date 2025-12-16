package com.avito.android.work_profile.profile.applies.mvi;

import Y41.p;
import com.avito.android.work_profile.profile.applies.mvi.entity.AppliesToVacancyInternalAction;
import jQ0.AbstractC42297a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AppliesToVacancyActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LjQ0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction;", "<anonymous>", "(LjQ0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.work_profile.profile.applies.mvi.AppliesToVacancyActor$process$1", f = "AppliesToVacancyActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<AbstractC42297a, Continuation<? super InterfaceC43160i<? extends AppliesToVacancyInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f330871q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f330872r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<jQ0.b> f330873s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Y41.a<jQ0.b> aVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f330872r = cVar;
        this.f330873s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f330872r, this.f330873s, continuation);
        aVar.f330871q = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(AbstractC42297a abstractC42297a, Continuation<? super InterfaceC43160i<? extends AppliesToVacancyInternalAction>> continuation) {
        return ((a) create(abstractC42297a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        AbstractC42297a abstractC42297a = (AbstractC42297a) this.f330871q;
        this.f330873s.invoke();
        return this.f330872r.c(abstractC42297a);
    }
}
