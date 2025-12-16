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
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.interactor.HistoricalSuggestsInteractorImpl$getV2Suggests$4$1", f = "HistoricalSuggestsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super InterfaceC43076a0<? extends C48901b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f162034q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f162035r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ qI.e f162036s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f162037t;

    /* compiled from: HistoricalSuggestsInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LuI/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)LuI/b;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.historical_suggests.suggest.interactor.HistoricalSuggestsInteractorImpl$getV2Suggests$4$1$1", f = "HistoricalSuggestsInteractor.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super C48901b>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f162038q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ m f162039r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ qI.e f162040s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f162041t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, qI.e eVar, int i12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f162039r = mVar;
            this.f162040s = eVar;
            this.f162041t = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f162039r, this.f162040s, this.f162041t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super C48901b> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f162038q;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return obj;
            }
            C42729a0.b(obj);
            m mVar = this.f162039r;
            mVar.getClass();
            qI.e eVar = this.f162040s;
            C48901b c48901b = new C48901b(eVar.getTitle(), eVar.getSubtitle(), null, eVar.getJsonWebToken(), null, false, null, this.f162041t, null, 368, null);
            this.f162038q = 1;
            Object objG = mVar.g(c48901b, this);
            return objG == coroutine_suspended ? coroutine_suspended : objG;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, qI.e eVar, int i12, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f162035r = mVar;
        this.f162036s = eVar;
        this.f162037t = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f162035r, this.f162036s, this.f162037t, continuation);
        fVar.f162034q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super InterfaceC43076a0<? extends C48901b>> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return C43259k.b((T) this.f162034q, null, new a(this.f162035r, this.f162036s, this.f162037t, null), 3);
    }
}
