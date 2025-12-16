package com.avito.android.bxcontent;

import com.avito.android.advertising.loaders.beduin.H;
import com.avito.android.bxcontent.BxContentFragment;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/H$c;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/advertising/loaders/beduin/H$c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$subscribeOnLoadedAd$1", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.j0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29094j0 extends SuspendLambda implements Y41.p<H.c, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f111134q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f111135r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29094j0(BxContentFragment bxContentFragment, Continuation<? super C29094j0> continuation) {
        super(2, continuation);
        this.f111135r = bxContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29094j0 c29094j0 = new C29094j0(this.f111135r, continuation);
        c29094j0.f111134q = obj;
        return c29094j0;
    }

    @Override // Y41.p
    public final Object invoke(H.c cVar, Continuation<? super kotlin.G0> continuation) {
        return ((C29094j0) create(cVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        H.c cVar = (H.c) this.f111134q;
        BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
        BxContentFragment bxContentFragment = this.f111135r;
        if (bxContentFragment.Z5().f112646N.getValue().f111141a.f112324a0.f112056a != null && ((cVar instanceof H.c.C2608c) || (cVar instanceof H.c.a))) {
            com.avito.android.bx_beduin_native_items.c cVar2 = bxContentFragment.f109067w0;
            if (cVar2 == null) {
                cVar2 = null;
            }
            cVar2.b();
        }
        return kotlin.G0.f406611a;
    }
}
