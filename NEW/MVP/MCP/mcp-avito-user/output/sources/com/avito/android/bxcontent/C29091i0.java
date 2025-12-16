package com.avito.android.bxcontent;

import com.avito.android.bxcontent.BxContentFragment;
import iw.C42120a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liw/a;", "value", "Lkotlin/G0;", "<anonymous>", "(Liw/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$subscribeOnLayoutSearchBar$1", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.i0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29091i0 extends SuspendLambda implements Y41.p<C42120a, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f111125q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f111126r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29091i0(BxContentFragment bxContentFragment, Continuation<? super C29091i0> continuation) {
        super(2, continuation);
        this.f111126r = bxContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29091i0 c29091i0 = new C29091i0(this.f111126r, continuation);
        c29091i0.f111125q = obj;
        return c29091i0;
    }

    @Override // Y41.p
    public final Object invoke(C42120a c42120a, Continuation<? super kotlin.G0> continuation) {
        return ((C29091i0) create(c42120a, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C42120a c42120a = (C42120a) this.f111125q;
        BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
        this.f111126r.K5().E30(c42120a);
        return kotlin.G0.f406611a;
    }
}
