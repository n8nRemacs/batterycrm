package io.ktor.websocket;

import V31.e;
import io.ktor.utils.io.core.C41640m;
import io.ktor.utils.io.core.C41641n;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RawWebSocketCommon.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-websockets"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.websocket.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41735v {
    public static final C41641n a(C41641n c41641n, int i12) {
        long j12 = 4;
        V31.d.f16905a.getClass();
        if (j12 >= 2147483647L) {
            io.ktor.utils.io.core.internal.f.a(j12, "size");
            throw null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) j12);
        e.a aVar = V31.e.f16906b;
        byteBufferAllocate.putInt(0, i12);
        C41640m c41640m = new C41640m(null, 1, null);
        try {
            int iO2 = (int) c41641n.o();
            for (int i13 = 0; i13 < iO2; i13++) {
                c41640m.o((byte) (c41641n.readByte() ^ byteBufferAllocate.get(i13 % 4)));
            }
            return c41640m.y();
        } catch (Throwable th2) {
            c41640m.close();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01de  */
    @io.ktor.util.InterfaceC41603j0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@Y61.k io.ktor.utils.io.W0 r18, long r19, int r21, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r22) throws io.ktor.websocket.FrameTooBigException, io.ktor.websocket.ProtocolViolationException {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C41735v.b(io.ktor.utils.io.W0, long, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @io.ktor.util.InterfaceC41603j0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@Y61.k io.ktor.utils.io.InterfaceC41649d1 r10, @Y61.k io.ktor.websocket.AbstractC41723i r11, boolean r12, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C41735v.c(io.ktor.utils.io.d1, io.ktor.websocket.i, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
