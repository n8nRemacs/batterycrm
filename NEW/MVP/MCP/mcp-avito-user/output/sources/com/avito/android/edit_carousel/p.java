package com.avito.android.edit_carousel;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ty.InterfaceC48738a;

/* compiled from: EditCarouselView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_carousel.EditCarouselViewImpl$5", f = "EditCarouselView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class p extends SuspendLambda implements Y41.p<String, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f146534q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f146535r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f146535r = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f146535r, continuation);
        pVar.f146534q = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(String str, Continuation<? super G0> continuation) {
        return ((p) create(str, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f146535r.f146545b.accept(new InterfaceC48738a.m((String) this.f146534q));
        return G0.f406611a;
    }
}
