package com.avito.android.review_gallery.mvi;

import Y41.p;
import com.avito.android.review_gallery.mvi.entity.ReviewGalleryInternalAction;
import dn0.InterfaceC39764a;
import gn0.InterfaceC40712a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ReviewGalleryActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.review_gallery.mvi.ReviewGalleryActor$process$4", f = "ReviewGalleryActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super ReviewGalleryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f255528q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40712a f255529r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, InterfaceC40712a interfaceC40712a, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f255528q = fVar;
        this.f255529r = interfaceC40712a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f255528q, this.f255529r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ReviewGalleryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC39764a interfaceC39764a = this.f255528q.f255540b;
        InterfaceC40712a interfaceC40712a = this.f255529r;
        interfaceC39764a.c(((InterfaceC40712a.e) interfaceC40712a).f396851b, ((InterfaceC40712a.e) interfaceC40712a).f396850a);
        return G0.f406611a;
    }
}
