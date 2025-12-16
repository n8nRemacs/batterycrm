package com.avito.android.bxcontent;

import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isOpened", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$subscribeOnClickSearchBar$1", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.h0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29088h0 extends SuspendLambda implements Y41.p<Boolean, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f111119q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f111120r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29088h0(BxContentFragment bxContentFragment, Continuation<? super C29088h0> continuation) {
        super(2, continuation);
        this.f111120r = bxContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29088h0 c29088h0 = new C29088h0(this.f111120r, continuation);
        c29088h0.f111119q = obj;
        return c29088h0;
    }

    @Override // Y41.p
    public final Object invoke(Boolean bool, Continuation<? super kotlin.G0> continuation) {
        return ((C29088h0) create(bool, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Boolean bool = (Boolean) this.f111119q;
        BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
        this.f111120r.Z5().accept(new InterfaceC29127b.E0(bool.booleanValue()));
        return kotlin.G0.f406611a;
    }
}
