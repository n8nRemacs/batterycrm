package com.avito.android.avl.view;

import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.upstream.cache.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: AvlPlayerActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.avl.view.AvlPlayerActivity$cacheMedia$2", f = "AvlPlayerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ O f98387q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AvlPlayerActivity f98388r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f98389s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i12, AvlPlayerActivity avlPlayerActivity, O o12, Continuation continuation) {
        super(2, continuation);
        this.f98387q = o12;
        this.f98388r = avlPlayerActivity;
        this.f98389s = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f98389s, this.f98388r, this.f98387q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        AvlPlayerActivity avlPlayerActivity = this.f98388r;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        try {
            O o12 = this.f98387q;
            int i12 = AvlPlayerActivity.f98291Q;
            com.google.android.exoplayer2.source.hls.offline.a aVar = new com.google.android.exoplayer2.source.hls.offline.a(o12, (a.d) avlPlayerActivity.f98305N.getValue(), new androidx.arch.core.executor.a(1));
            aVar.a(new g(this.f98389s, avlPlayerActivity, aVar));
        } catch (Exception unused) {
        }
        return G0.f406611a;
    }
}
