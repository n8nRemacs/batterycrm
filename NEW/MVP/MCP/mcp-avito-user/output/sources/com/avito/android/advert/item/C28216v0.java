package com.avito.android.advert.item;

import com.avito.android.advert.InterfaceC27797i;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import da.C39687a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsPresenterImpl$loadSalaryRange$1", f = "AdvertDetailsPresenter.kt", i = {}, l = {2656, 2657}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.advert.item.v0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28216v0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f80646q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f80647r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f80648s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f80649t;

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsPresenterImpl$loadSalaryRange$1$1", f = "AdvertDetailsPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.advert.item.v0$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ TypedResult<C39687a> f80650q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C28136i0 f80651r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f80652s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TypedResult<C39687a> typedResult, C28136i0 c28136i0, AdvertDetails advertDetails, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f80650q = typedResult;
            this.f80651r = c28136i0;
            this.f80652s = advertDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f80650q, this.f80651r, this.f80652s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            I1 i12;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            TypedResult<C39687a> typedResult = this.f80650q;
            boolean z12 = typedResult instanceof TypedResult.Success;
            C28136i0 c28136i0 = this.f80651r;
            if (z12) {
                S sO2 = c28136i0.o2(this.f80652s);
                if (sO2 != null) {
                    sO2.z((C39687a) ((TypedResult.Success) typedResult).getResult());
                }
            } else if ((typedResult instanceof TypedResult.Error) && (i12 = c28136i0.f76350h1) != null) {
                TypedResult.Error error = (TypedResult.Error) typedResult;
                Throwable cause = error.getCause();
                if (cause == null) {
                    cause = C35936s.a(error.getError(), null);
                }
                i12.ka(cause);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28216v0(C28136i0 c28136i0, long j12, AdvertDetails advertDetails, Continuation<? super C28216v0> continuation) {
        super(2, continuation);
        this.f80647r = c28136i0;
        this.f80648s = j12;
        this.f80649t = advertDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C28216v0(this.f80647r, this.f80648s, this.f80649t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C28216v0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f80646q;
        C28136i0 c28136i0 = this.f80647r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC27797i interfaceC27797i = c28136i0.f76333c;
            this.f80646q = 1;
            obj = interfaceC27797i.b(this.f80648s, this);
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
        AbstractC43129d1 abstractC43129d1B = c28136i0.f76361l0.b();
        a aVar = new a((TypedResult) obj, c28136i0, this.f80649t, null);
        this.f80646q = 2;
        if (C43259k.g(abstractC43129d1B, aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.G0.f406611a;
    }
}
