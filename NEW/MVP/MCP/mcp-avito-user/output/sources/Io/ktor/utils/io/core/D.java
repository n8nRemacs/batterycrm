package io.ktor.utils.io.core;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InputPrimitives.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class D {
    public static final int a(@Y61.k x xVar) {
        int i12 = xVar.f400911f;
        int i13 = xVar.f400910e;
        if (i12 - i13 > 4) {
            xVar.f400910e = i13 + 4;
            return xVar.f400909d.getInt(i13);
        }
        io.ktor.utils.io.core.internal.b bVarU = xVar.u(4);
        if (bVarU == null) {
            S.a(4);
            throw null;
        }
        int i14 = bVarU.f400875b;
        if (bVarU.f400876c - i14 < 4) {
            throw new EOFException("Not enough bytes to read a regular integer of size 4.");
        }
        int i15 = bVarU.f400874a.getInt(i14);
        bVarU.c(4);
        io.ktor.utils.io.core.internal.i.a(xVar, bVarU);
        return i15;
    }

    public static final long b(@Y61.k x xVar) {
        int i12 = xVar.f400911f;
        int i13 = xVar.f400910e;
        if (i12 - i13 > 8) {
            xVar.f400910e = i13 + 8;
            return xVar.f400909d.getLong(i13);
        }
        io.ktor.utils.io.core.internal.b bVarU = xVar.u(8);
        if (bVarU == null) {
            S.a(8);
            throw null;
        }
        int i14 = bVarU.f400875b;
        if (bVarU.f400876c - i14 < 8) {
            throw new EOFException("Not enough bytes to read a long integer of size 8.");
        }
        long j12 = bVarU.f400874a.getLong(i14);
        bVarU.c(8);
        io.ktor.utils.io.core.internal.i.a(xVar, bVarU);
        return j12;
    }

    public static final short c(@Y61.k x xVar) {
        int i12 = xVar.f400911f;
        int i13 = xVar.f400910e;
        if (i12 - i13 > 2) {
            xVar.f400910e = i13 + 2;
            return xVar.f400909d.getShort(i13);
        }
        io.ktor.utils.io.core.internal.b bVarU = xVar.u(2);
        if (bVarU == null) {
            S.a(2);
            throw null;
        }
        int i14 = bVarU.f400875b;
        if (bVarU.f400876c - i14 < 2) {
            throw new EOFException("Not enough bytes to read a short integer of size 2.");
        }
        short s5 = bVarU.f400874a.getShort(i14);
        bVarU.c(2);
        io.ktor.utils.io.core.internal.i.a(xVar, bVarU);
        return s5;
    }
}
