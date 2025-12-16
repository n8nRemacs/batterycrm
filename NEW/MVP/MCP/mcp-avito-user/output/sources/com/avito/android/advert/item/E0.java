package com.avito.android.advert.item;

import com.avito.android.remote.model.AdvertDetails;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsPresenterImpl$subscribeRatingLLMSummaryIfNeeded$1", f = "AdvertDetailsPresenter.kt", i = {}, l = {1326, 1326}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class E0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f71614q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f71615r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Long f71616s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f71617t;

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C28136i0 f71618b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f71619c;

        public a(C28136i0 c28136i0, AdvertDetails advertDetails) {
            this.f71618b = c28136i0;
            this.f71619c = advertDetails;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            C28136i0 c28136i0 = this.f71618b;
            Object objG = C43259k.g(c28136i0.f76361l0.b(), new D0(c28136i0, this.f71619c, zBooleanValue, null), continuation);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(C28136i0 c28136i0, Long l12, AdvertDetails advertDetails, Continuation<? super E0> continuation) {
        super(2, continuation);
        this.f71615r = c28136i0;
        this.f71616s = l12;
        this.f71617t = advertDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new E0(this.f71615r, this.f71616s, this.f71617t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((E0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f71614q;
        C28136i0 c28136i0 = this.f71615r;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.rating_persistence.llm_summary.h hVar = c28136i0.f76285G0;
            long jLongValue = this.f71616s.longValue();
            this.f71614q = 1;
            obj = hVar.a(jLongValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            C42729a0.b(obj);
        }
        a aVar = new a(c28136i0, this.f71617t);
        this.f71614q = 2;
        if (((InterfaceC43160i) obj).collect(aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.G0.f406611a;
    }
}
