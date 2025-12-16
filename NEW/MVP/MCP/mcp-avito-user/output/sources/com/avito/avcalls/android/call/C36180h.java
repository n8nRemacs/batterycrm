package com.avito.avcalls.android.call;

import com.avito.avcalls.android.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: CallManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.CallManager$notifyViaObserver$2", f = "CallManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.android.call.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36180h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f331520q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C36177e f331521r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36180h(Y41.l<? super a.g, G0> lVar, C36177e c36177e, Continuation<? super C36180h> continuation) {
        super(2, continuation);
        this.f331520q = (kotlin.jvm.internal.N) lVar;
        this.f331521r = c36177e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36180h(this.f331520q, this.f331521r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C36180h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f331520q.invoke(this.f331521r.f331488d);
        return G0.f406611a;
    }
}
