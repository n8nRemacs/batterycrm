package io.ktor.utils.io.core;

import java.nio.ByteBuffer;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ByteReadPacketExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.core.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41644q {
    @Y61.k
    public static final C41641n a(@Y61.k ByteBuffer byteBuffer, @Y61.k Y41.l<? super ByteBuffer, G0> lVar) {
        P p12 = new P(byteBuffer, lVar);
        io.ktor.utils.io.core.internal.b bVarS2 = p12.S2();
        bVarS2.f400877d = 0;
        bVarS2.f400875b = 0;
        bVarS2.f400876c = bVarS2.f400879f;
        return new C41641n(bVarS2, p12);
    }
}
