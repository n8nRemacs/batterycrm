package com.avito.android.progress_info_toast_bar.interactor;

import Y41.p;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import id0.InterfaceC41386a;
import jd0.C42361a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.I0;

/* compiled from: VacancyProgressInfoInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Ljd0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.progress_info_toast_bar.interactor.VacancyProgressInfoInteractorImpl$getVacancyProgress$1", f = "VacancyProgressInfoInteractorImpl.kt", i = {0}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 39}, m = "invokeSuspend", n = {"$this$rxObservable"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements p<I0<? super C42361a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f231527q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f231528r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f231529s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Long f231530t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f231531u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Long f231532v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Long l12, String str, Long l13, Continuation continuation) {
        super(2, continuation);
        this.f231529s = dVar;
        this.f231530t = l12;
        this.f231531u = str;
        this.f231532v = l13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f231529s, this.f231530t, this.f231531u, this.f231532v, continuation);
        cVar.f231528r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super C42361a> i02, Continuation<? super G0> continuation) {
        return ((c) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        I0 i02;
        C42361a c42361a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f231527q;
        if (i12 == 0) {
            C42729a0.b(obj);
            i02 = (I0) this.f231528r;
            InterfaceC41386a interfaceC41386a = this.f231529s.f231533a.get();
            this.f231528r = i02;
            this.f231527q = 1;
            obj = interfaceC41386a.a(this.f231530t, this.f231531u, this.f231532v, Boolean.TRUE, null, this);
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
            i02 = (I0) this.f231528r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Error) {
            c42361a = new C42361a(null);
        } else {
            if (!(typedResult instanceof TypedResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            c42361a = (C42361a) ((TypedResult.Success) typedResult).getResult();
        }
        this.f231528r = null;
        this.f231527q = 2;
        if (i02.send(c42361a, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
