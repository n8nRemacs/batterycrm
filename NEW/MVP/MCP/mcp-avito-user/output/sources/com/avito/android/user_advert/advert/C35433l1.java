package com.avito.android.user_advert.advert;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: MyAdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_advert.advert.MyAdvertDetailsViewImpl$3", f = "MyAdvertDetailsView.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_advert.advert.l1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35433l1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f310428q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35436m1 f310429r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35433l1(C35436m1 c35436m1, Continuation<? super C35433l1> continuation) {
        super(2, continuation);
        this.f310429r = c35436m1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35433l1(this.f310429r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C35433l1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f310428q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f310428q = 1;
            C35436m1 c35436m1 = this.f310429r;
            Object objCollect = C43175k.I(c35436m1.f310557l.c(), C43175k.k(c35436m1.f310555j, c35436m1.f310556k, c35436m1.f310564s, new C35439n1(4, c35436m1, C35436m1.class, "combineItemsState", "combineItemsState(Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState;Lcom/avito/android/lib/beduin_v2/beduin_item/BeduinItemsState;Lcom/avito/konveyor/data_source/ListDataSource;)Lcom/avito/konveyor/data_source/ListDataSource;", 4))).collect(new C35442o1(c35436m1.f310549d), this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = kotlin.G0.f406611a;
            }
            if (objCollect == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
