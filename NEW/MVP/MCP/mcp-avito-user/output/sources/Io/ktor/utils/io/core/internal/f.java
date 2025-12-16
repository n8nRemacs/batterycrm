package io.ktor.utils.io.core.internal;

import Y61.k;
import kotlin.Metadata;
import kotlin.X;

/* compiled from: Numbers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f {
    @X
    @k
    public static final void a(long j12, @k String str) {
        throw new IllegalArgumentException("Long value " + j12 + " of " + str + " doesn't fit into 32-bit integer");
    }
}
