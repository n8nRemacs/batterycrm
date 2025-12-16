package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C43259k;

/* compiled from: Coroutines.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.z1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41714z1 {
    public static final C41658g1 a(kotlinx.coroutines.T t12, CoroutineContext coroutineContext, C41619a c41619a, boolean z12, Y41.p pVar) {
        kotlinx.coroutines.N0 n0D = C43259k.d(t12, coroutineContext, null, new C41711y1(z12, c41619a, pVar, (kotlinx.coroutines.M) t12.getF401642c().get(kotlinx.coroutines.M.f410711b), null), 2);
        ((kotlinx.coroutines.V0) n0D).k(new C41708x1(c41619a));
        return new C41658g1(n0D, c41619a);
    }

    @Y61.k
    public static final d2 b(@Y61.k kotlinx.coroutines.T t12, @Y61.k CoroutineContext coroutineContext, boolean z12, @Y61.k Y41.p<? super e2, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar) {
        return a(t12, coroutineContext, new C41619a(z12, null, 0, 6, null), true, pVar);
    }
}
