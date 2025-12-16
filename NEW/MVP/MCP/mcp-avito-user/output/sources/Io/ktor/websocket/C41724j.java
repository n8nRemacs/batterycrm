package io.ktor.websocket;

import io.ktor.utils.io.core.C41640m;
import io.ktor.utils.io.core.C41641n;
import io.ktor.websocket.AbstractC41723i;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FrameCommon.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-websockets"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.websocket.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41724j {
    @Y61.l
    public static final CloseReason a(@Y61.k AbstractC41723i.b bVar) {
        if (bVar.f401559c.length < 2) {
            return null;
        }
        C41640m c41640m = new C41640m(null, 1, null);
        try {
            byte[] bArr = bVar.f401559c;
            io.ktor.utils.io.core.G.b(c41640m, bArr, 0, bArr.length);
            C41641n c41641nY = c41640m.y();
            return new CloseReason(io.ktor.utils.io.core.x.y(c41641nY), io.ktor.utils.io.core.D.c(c41641nY));
        } catch (Throwable th2) {
            c41640m.close();
            throw th2;
        }
    }
}
