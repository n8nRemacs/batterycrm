package io.ktor.utils.io.core;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BufferAppend.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.core.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41629b {
    public static final int a(@Y61.k io.ktor.utils.io.core.internal.b bVar, @Y61.k io.ktor.utils.io.core.internal.b bVar2, int i12) {
        int iMin = Math.min(bVar2.f400876c - bVar2.f400875b, i12);
        int i13 = bVar.f400878e;
        int i14 = bVar.f400876c;
        int i15 = i13 - i14;
        if (i15 <= iMin) {
            int i16 = bVar.f400879f;
            if ((i16 - i13) + i15 < iMin) {
                throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
            }
            if ((i14 + iMin) - i13 > 0) {
                bVar.f400878e = i16;
            }
        }
        V31.e.b(bVar2.f400874a, bVar.f400874a, bVar2.f400875b, iMin, i14);
        bVar2.c(iMin);
        bVar.a(iMin);
        return iMin;
    }
}
