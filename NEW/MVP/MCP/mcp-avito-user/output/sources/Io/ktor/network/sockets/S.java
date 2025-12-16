package io.ktor.network.sockets;

import io.ktor.network.selector.SelectInterest;
import java.nio.channels.SelectableChannel;
import kotlin.Metadata;

/* compiled from: ServerSocketImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/network/sockets/S;", "Lio/ktor/network/sockets/P;", "Lio/ktor/network/selector/i;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class S implements P, io.ktor.network.selector.i {
    @Override // io.ktor.network.selector.i
    public final void O0(@Y61.k SelectInterest selectInterest, boolean z12) {
        throw null;
    }

    @Override // io.ktor.network.selector.i
    @Y61.k
    public final io.ktor.network.selector.e Q1() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        throw null;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r1 = this;
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L2
        L2:
            throw r0     // Catch: java.lang.Throwable -> L3
        L3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.S.close():void");
    }

    @Override // kotlinx.coroutines.InterfaceC43268o0
    public final void dispose() {
        try {
            close();
        } catch (Throwable unused) {
        }
    }

    @Override // io.ktor.network.selector.i
    public final int e2() {
        throw null;
    }

    @Override // io.ktor.network.selector.i
    public final boolean isClosed() {
        throw null;
    }

    @Override // io.ktor.network.selector.i
    public final /* bridge */ /* synthetic */ SelectableChannel r() {
        return null;
    }
}
