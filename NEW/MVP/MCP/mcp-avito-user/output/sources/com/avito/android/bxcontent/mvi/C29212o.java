package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.Q1;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.serp.adapter.l1;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BxContentActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "itemId", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<anonymous>", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$subscribeOnVacancyRespond$1", f = "BxContentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29212o extends SuspendLambda implements Y41.p<String, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f112490q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.bxcontent.mvi.entity.l> f112491r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29105a f112492s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29212o(Y41.a<com.avito.android.bxcontent.mvi.entity.l> aVar, C29105a c29105a, Continuation<? super C29212o> continuation) {
        super(2, continuation);
        this.f112491r = aVar;
        this.f112492s = c29105a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29212o c29212o = new C29212o(this.f112491r, this.f112492s, continuation);
        c29212o.f112490q = obj;
        return c29212o;
    }

    @Override // Y41.p
    public final Object invoke(String str, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>> continuation) {
        return ((C29212o) create(str, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        String str = (String) this.f112490q;
        com.avito.android.bxcontent.mvi.entity.l lVarInvoke = this.f112491r.invoke();
        C29105a c29105a = this.f112492s;
        List<l1> list = lVarInvoke.f().f112428e;
        Z0 z02 = c29105a.f111550x;
        z02.f111513a.c(z02.f111514b.a(list, str, lVarInvoke.f112345l).j(new l41.o() { // from class: com.avito.android.bxcontent.mvi.X0
            @Override // l41.o
            public final Object apply(Object obj2) {
                Q1.a aVar = (Q1.a) obj2;
                return ProgressInfoToastBarPresenter.RequestData.a.a(ProgressInfoToastBarPresenter.RequestData.f231543h, aVar.f109420a, aVar.f109421b, aVar.f109423d);
            }
        }));
        return C43175k.w();
    }
}
