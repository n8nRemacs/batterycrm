package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/b1;", "T", "Lkotlinx/coroutines/b0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.b1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43080b1<T> extends C43079b0<T> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Continuation<kotlin.G0> f410769e;

    public C43080b1(@Y61.k CoroutineContext coroutineContext, @Y61.k Y41.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar) {
        super(coroutineContext, true, false);
        this.f410769e = IntrinsicsKt.createCoroutineUnintercepted(pVar, this, this);
    }

    @Override // kotlinx.coroutines.V0
    public final void w0() {
        F51.a.a(this.f410769e, this);
    }
}
