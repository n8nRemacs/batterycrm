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
import qI.C47299b;
import uI.C48901b;

/* compiled from: HistoricalSuggestsInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/a0;", "LuI/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/a0;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.interactor.HistoricalSuggestsInteractorImpl$getV1Suggests$4$1", f = "HistoricalSuggestsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super InterfaceC43076a0<? extends C48901b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f162018q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f162019r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C47299b f162020s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f162021t;

    /* compiled from: HistoricalSuggestsInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LuI/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)LuI/b;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.historical_suggests.suggest.interactor.HistoricalSuggestsInteractorImpl$getV1Suggests$4$1$1", f = "HistoricalSuggestsInteractor.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super C48901b>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f162022q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ m f162023r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C47299b f162024s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f162025t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, C47299b c47299b, int i12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f162023r = mVar;
            this.f162024s = c47299b;
            this.f162025t = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f162023r, this.f162024s, this.f162025t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super C48901b> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f162022q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f162022q = 1;
                obj = m.e(this.f162023r, this.f162024s, this.f162025t, this);
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
    public d(m mVar, C47299b c47299b, int i12, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f162019r = mVar;
        this.f162020s = c47299b;
        this.f162021t = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f162019r, this.f162020s, this.f162021t, continuation);
        dVar.f162018q = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super InterfaceC43076a0<? extends C48901b>> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return C43259k.b((T) this.f162018q, null, new a(this.f162019r, this.f162020s, this.f162021t, null), 3);
    }
}
