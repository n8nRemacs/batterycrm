package com.avito.android.advert.item;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsItemsPresenterImpl$attachView$$inlined$flatMapLatest$1", f = "AdvertDetailsItemsPresenter.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class U extends SuspendLambda implements Y41.q<InterfaceC43172j<? super com.avito.android.advert.item.similars.t>, kotlin.G0, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f72170q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f72171r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f72172s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ T f72173t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(T t12, Continuation continuation) {
        super(3, continuation);
        this.f72173t = t12;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super com.avito.android.advert.item.similars.t> interfaceC43172j, kotlin.G0 g02, Continuation<? super kotlin.G0> continuation) {
        U u12 = new U(this.f72173t, continuation);
        u12.f72171r = interfaceC43172j;
        u12.f72172s = g02;
        return u12.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f72170q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f72171r;
            T t12 = this.f72173t;
            kotlinx.coroutines.flow.C1 c12 = new kotlinx.coroutines.flow.C1(t12.f71988b1.getF80229r(), C43175k.P(t12.f71995c1.getF74337f(), new V(2, null)), W.f72279b);
            this.f72170q = 1;
            if (C43175k.u(this, c12, interfaceC43172j) == coroutine_suspended) {
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
