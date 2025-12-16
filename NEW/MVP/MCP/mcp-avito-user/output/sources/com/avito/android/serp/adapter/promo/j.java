package com.avito.android.serp.adapter.promo;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rn0.InterfaceC47689a;

/* compiled from: PromoHeaderPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.serp.adapter.promo.PromoHeaderPresenterImpl$bindView$2", f = "PromoHeaderPresenter.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class j extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f270486q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f270487r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PromoHeaderItem f270488s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f270489t;

    /* compiled from: PromoHeaderPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "yOffset", "Lkotlin/G0;", "emit", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PromoHeaderItem f270490b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f270491c;

        public a(PromoHeaderItem promoHeaderItem, m mVar) {
            this.f270490b = promoHeaderItem;
            this.f270491c = mVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            float fFloatValue = ((Number) obj).floatValue();
            if (this.f270490b.f270460g) {
                this.f270491c.iM(fFloatValue);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, PromoHeaderItem promoHeaderItem, m mVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f270487r = kVar;
        this.f270488s = promoHeaderItem;
        this.f270489t = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new j(this.f270487r, this.f270488s, this.f270489t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f270486q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC47689a interfaceC47689a = this.f270487r.f270494d.get();
            PromoHeaderItem promoHeaderItem = this.f270488s;
            InterfaceC43160i<Float> interfaceC43160iM6 = interfaceC47689a.M6(promoHeaderItem.f270460g);
            a aVar = new a(promoHeaderItem, this.f270489t);
            this.f270486q = 1;
            if (interfaceC43160iM6.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
