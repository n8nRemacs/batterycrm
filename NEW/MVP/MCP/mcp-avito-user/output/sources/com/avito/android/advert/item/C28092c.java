package com.avito.android.advert.item;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AdvertDetailsBlocksPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert/item/commercials/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsBlocksPresenterImpl$attachView$1$1", f = "AdvertDetailsBlocksPresenter.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.advert.item.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28092c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.advert.item.commercials.a>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f74231q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f74232r;

    public C28092c() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C28092c c28092c = new C28092c(2, continuation);
        c28092c.f74232r = obj;
        return c28092c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.advert.item.commercials.a> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C28092c) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f74231q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f74232r;
            this.f74231q = 1;
            if (interfaceC43172j.emit(null, this) == coroutine_suspended) {
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
