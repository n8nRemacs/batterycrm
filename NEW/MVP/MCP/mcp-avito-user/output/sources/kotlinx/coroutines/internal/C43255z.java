package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LimitedDispatcher.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43255z {
    public static final void a(int i12) {
        if (i12 < 1) {
            throw new IllegalArgumentException(AK.c.g(i12, "Expected positive parallelism level, but got ").toString());
        }
    }
}
