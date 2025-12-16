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
@DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsBlocksPresenterImpl$attachView$$inlined$flatMapLatest$1", f = "AdvertDetailsBlocksPresenter.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.advert.item.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27815b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super com.avito.android.advert.item.similars.t>, kotlin.G0, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f73176q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f73177r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f73178s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C28129g f73179t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27815b(Continuation continuation, C28129g c28129g) {
        super(3, continuation);
        this.f73179t = c28129g;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super com.avito.android.advert.item.similars.t> interfaceC43172j, kotlin.G0 g02, Continuation<? super kotlin.G0> continuation) {
        C27815b c27815b = new C27815b(continuation, this.f73179t);
        c27815b.f73177r = interfaceC43172j;
        c27815b.f73178s = g02;
        return c27815b.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f73176q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f73177r;
            C28129g c28129g = this.f73179t;
            kotlinx.coroutines.flow.C1 c12 = new kotlinx.coroutines.flow.C1(c28129g.f75647h.getF80229r(), C43175k.P(c28129g.f75648i.getF74337f(), new C28092c(2, null)), C28120d.f75088b);
            this.f73176q = 1;
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
