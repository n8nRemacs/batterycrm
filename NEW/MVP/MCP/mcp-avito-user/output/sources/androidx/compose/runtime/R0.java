package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43311x0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: Effects.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/R0;", "Landroidx/compose/runtime/B2;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class R0 implements B2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> f38100b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43238h f38101c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f38102d;

    /* JADX WARN: Multi-variable type inference failed */
    public R0(@Y61.k CoroutineContext coroutineContext, @Y61.k Y41.p<? super kotlinx.coroutines.T, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar) {
        this.f38100b = pVar;
        this.f38101c = kotlinx.coroutines.U.a(coroutineContext);
    }

    @Override // androidx.compose.runtime.B2
    public final void b() {
        kotlinx.coroutines.N0 n02 = this.f38102d;
        if (n02 != null) {
            n02.c(new T0());
        }
        this.f38102d = null;
    }

    @Override // androidx.compose.runtime.B2
    public final void c() {
        kotlinx.coroutines.N0 n02 = this.f38102d;
        if (n02 != null) {
            ((kotlinx.coroutines.V0) n02).c(C43311x0.a("Old job was still running!", null));
        }
        this.f38102d = C43259k.d(this.f38101c, null, null, this.f38100b, 3);
    }

    @Override // androidx.compose.runtime.B2
    public final void e() {
        kotlinx.coroutines.N0 n02 = this.f38102d;
        if (n02 != null) {
            n02.c(new T0());
        }
        this.f38102d = null;
    }
}
