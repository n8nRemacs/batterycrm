package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.C41714z1;
import io.ktor.utils.io.W0;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.D0;

/* compiled from: Reading.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class o {
    @Y61.k
    public static final W0 a(@Y61.k InputStream inputStream, @Y61.k CoroutineContext coroutineContext, @Y61.k io.ktor.utils.io.pool.b bVar) {
        return C41714z1.b(D0.f410691b, coroutineContext, true, new m(bVar, inputStream, null)).x();
    }

    public static W0 b(InputStream inputStream) {
        return C41714z1.b(D0.f410691b, C43262l0.f411947c, true, new n(io.ktor.utils.io.pool.a.f401244a, inputStream, null)).x();
    }
}
