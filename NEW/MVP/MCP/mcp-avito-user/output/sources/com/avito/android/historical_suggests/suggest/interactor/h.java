package com.avito.android.historical_suggests.suggest.interactor;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import uI.C48901b;

/* compiled from: HistoricalSuggestsInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/a0;", "LuI/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/a0;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.interactor.HistoricalSuggestsInteractorImpl$getV3Suggests$4$2$1", f = "HistoricalSuggestsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class h extends SuspendLambda implements p<T, Continuation<? super InterfaceC43076a0<? extends C48901b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f162056q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f162057r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ sI.e f162058s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f162059t;

    /* compiled from: HistoricalSuggestsInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LuI/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)LuI/b;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.historical_suggests.suggest.interactor.HistoricalSuggestsInteractorImpl$getV3Suggests$4$2$1$1", f = "HistoricalSuggestsInteractor.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super C48901b>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f162060q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ m f162061r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ sI.e f162062s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f162063t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, sI.e eVar, int i12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f162061r = mVar;
            this.f162062s = eVar;
            this.f162063t = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f162061r, this.f162062s, this.f162063t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super C48901b> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f162060q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f162060q = 1;
                obj = m.f(this.f162061r, this.f162062s, this.f162063t, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, sI.e eVar, int i12, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f162057r = mVar;
        this.f162058s = eVar;
        this.f162059t = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f162057r, this.f162058s, this.f162059t, continuation);
        hVar.f162056q = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super InterfaceC43076a0<? extends C48901b>> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return C43259k.b((T) this.f162056q, null, new a(this.f162057r, this.f162058s, this.f162059t, null), 3);
    }
}
