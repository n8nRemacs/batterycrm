package io.ktor.utils.io.core;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Buffers.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.core.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41636i {
    public static final long a(@Y61.k io.ktor.utils.io.core.internal.b bVar) {
        long j12 = 0;
        do {
            j12 += bVar.f400876c - bVar.f400875b;
            bVar = bVar.i();
        } while (bVar != null);
        return j12;
    }
}
