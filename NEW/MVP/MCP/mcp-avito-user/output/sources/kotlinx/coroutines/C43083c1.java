package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/c1;", "Lkotlinx/coroutines/q1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.c1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43083c1 extends q1 {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Continuation<kotlin.G0> f410770e;

    public C43083c1(@Y61.k CoroutineContext coroutineContext, @Y61.k Y41.p<? super T, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar) {
        super(coroutineContext, true, false);
        this.f410770e = IntrinsicsKt.createCoroutineUnintercepted(pVar, this, this);
    }

    @Override // kotlinx.coroutines.V0
    public final void w0() {
        F51.a.a(this.f410770e, this);
    }
}
