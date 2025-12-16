package com.avito.android.location_picker.job;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.geo_common.interactor.g;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: JobAssistantInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.location_picker.job.JobAssistantInteractorImpl$sendLocation$resultSingle$1", f = "JobAssistantInteractor.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super TypedResult<Object>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f182411q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f182412r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f182413s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ double f182414t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ double f182415u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f182416v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, double d12, double d13, String str2, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f182412r = dVar;
        this.f182413s = str;
        this.f182414t = d12;
        this.f182415u = d13;
        this.f182416v = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f182412r, this.f182413s, this.f182414t, this.f182415u, this.f182416v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<Object>> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f182411q;
        if (i12 == 0) {
            C42729a0.b(obj);
            g gVar = this.f182412r.f182417a;
            this.f182411q = 1;
            obj = gVar.x(this.f182413s, this.f182414t, this.f182415u, this.f182416v, this);
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
