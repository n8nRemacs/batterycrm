package io.ktor.utils.io.core;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Buffer.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.core.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41632e {
    @Y61.k
    public static final void a(int i12, int i13) {
        throw new EOFException(androidx.appcompat.app.r.l(i12, i13, "Unable to discard ", " bytes: only ", " available for writing"));
    }

    @Y61.k
    public static final void b(int i12, int i13) {
        throw new EOFException(androidx.appcompat.app.r.l(i12, i13, "Unable to discard ", " bytes: only ", " available for reading"));
    }
}
