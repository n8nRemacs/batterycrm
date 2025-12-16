package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.channels.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43086b {
    public static M0 a(io.ktor.client.engine.okhttp.s sVar, Y41.p pVar) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineStart coroutineStart = CoroutineStart.f410680b;
        CoroutineContext coroutineContextC = kotlinx.coroutines.K.c(sVar, emptyCoroutineContext);
        C43108m c43108mA = A.a(0, null, null, 6);
        CoroutineStart coroutineStart2 = CoroutineStart.f410680b;
        C43084a c43084a = new C43084a(coroutineContextC, c43108mA, false, true);
        c43084a.m0((kotlinx.coroutines.N0) coroutineContextC.get(kotlinx.coroutines.N0.f410716u2));
        c43084a.E0(coroutineStart, c43084a, pVar);
        return c43084a;
    }
}
