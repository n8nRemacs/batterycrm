package com.avito.android.bxcontent;

import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BxContentView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$B0;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/bxcontent/mvi/entity/b$B0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.BxContentViewImpl$10", f = "BxContentView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.e1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29080e1 extends SuspendLambda implements Y41.p<InterfaceC29127b.B0, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f111057q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C29240o1 f111058r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29080e1(C29240o1 c29240o1, Continuation<? super C29080e1> continuation) {
        super(2, continuation);
        this.f111058r = c29240o1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29080e1 c29080e1 = new C29080e1(this.f111058r, continuation);
        c29080e1.f111057q = obj;
        return c29080e1;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC29127b.B0 b02, Continuation<? super kotlin.G0> continuation) {
        return ((C29080e1) create(b02, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f111058r.f112693U.K5((InterfaceC29127b.B0) this.f111057q);
        return kotlin.G0.f406611a;
    }
}
