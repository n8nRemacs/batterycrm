package io.ktor.utils.io.core;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OutputPrimitives.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class I {
    public static final void a(@Y61.k C41640m c41640m, short s5) throws InsufficientSpaceException {
        int i12 = c41640m.f400866f;
        if (c41640m.f400867g - i12 > 2) {
            c41640m.f400866f = i12 + 2;
            c41640m.f400865e.putShort(i12, s5);
            return;
        }
        io.ktor.utils.io.core.internal.b bVarM = c41640m.m(2);
        int i13 = bVarM.f400876c;
        int i14 = bVarM.f400878e - i13;
        if (i14 < 2) {
            throw new InsufficientSpaceException("short integer", 2, i14);
        }
        bVarM.f400874a.putShort(i13, s5);
        bVarM.a(2);
        c41640m.a();
    }
}
