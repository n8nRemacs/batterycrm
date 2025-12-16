package io.ktor.network.sockets;

import io.ktor.network.sockets.Z;
import io.ktor.utils.io.Z1;
import io.ktor.utils.io.d2;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.Q0;

/* compiled from: NIOSocketImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u000e\b\u0000\u0010\u0003 \u0001*\u00020\u0001*\u00020\u00022\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/network/sockets/N;", "Ljava/nio/channels/ByteChannel;", "Ljava/nio/channels/SelectableChannel;", "S", "Lio/ktor/network/sockets/O;", "Lio/ktor/network/selector/j;", "Lkotlinx/coroutines/T;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public abstract class N<S extends SelectableChannel & ByteChannel> extends io.ktor.network.selector.j implements O, kotlinx.coroutines.T {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final S f400229f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.ktor.network.selector.k f400230g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final io.ktor.utils.io.pool.h<ByteBuffer> f400231h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f400232i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<Z1> f400233j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<d2> f400234k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final P0 f400235l;

    public /* synthetic */ N(SelectableChannel selectableChannel, io.ktor.network.selector.k kVar, io.ktor.utils.io.pool.h hVar, Z.e eVar, int i12, C42822w c42822w) {
        this(selectableChannel, kVar, hVar, (i12 & 8) != 0 ? null : eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    @Override // io.ktor.network.selector.j, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f400232i
            r1 = 0
            r2 = 1
            boolean r1 = r0.compareAndSet(r1, r2)
            if (r1 != 0) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReference<io.ktor.utils.io.Z1> r1 = r5.f400233j
            java.lang.Object r2 = r1.get()
            io.ktor.utils.io.Z1 r2 = (io.ktor.utils.io.Z1) r2
            r3 = 0
            if (r2 == 0) goto L1f
            io.ktor.utils.io.X r2 = r2.a()
            if (r2 == 0) goto L1f
            r2.h(r3)
        L1f:
            java.util.concurrent.atomic.AtomicReference<io.ktor.utils.io.d2> r2 = r5.f400234k
            java.lang.Object r4 = r2.get()
            io.ktor.utils.io.d2 r4 = (io.ktor.utils.io.d2) r4
            if (r4 == 0) goto L2c
            r4.c(r3)
        L2c:
            boolean r0 = r0.get()
            if (r0 == 0) goto Lc3
            java.lang.Object r0 = r1.get()
            kotlinx.coroutines.N0 r0 = (kotlinx.coroutines.N0) r0
            if (r0 == 0) goto L40
            boolean r0 = r0.c0()
            if (r0 == 0) goto Lc3
        L40:
            java.lang.Object r0 = r2.get()
            kotlinx.coroutines.N0 r0 = (kotlinx.coroutines.N0) r0
            if (r0 == 0) goto L4e
            boolean r0 = r0.c0()
            if (r0 == 0) goto Lc3
        L4e:
            java.lang.Object r0 = r1.get()
            kotlinx.coroutines.N0 r0 = (kotlinx.coroutines.N0) r0
            if (r0 == 0) goto L6b
            boolean r1 = r0.isCancelled()
            if (r1 == 0) goto L5d
            goto L5e
        L5d:
            r0 = r3
        L5e:
            if (r0 == 0) goto L6b
            java.util.concurrent.CancellationException r0 = r0.J()
            if (r0 == 0) goto L6b
            java.lang.Throwable r0 = r0.getCause()
            goto L6c
        L6b:
            r0 = r3
        L6c:
            java.lang.Object r1 = r2.get()
            kotlinx.coroutines.N0 r1 = (kotlinx.coroutines.N0) r1
            if (r1 == 0) goto L89
            boolean r2 = r1.isCancelled()
            if (r2 == 0) goto L7b
            goto L7c
        L7b:
            r1 = r3
        L7c:
            if (r1 == 0) goto L89
            java.util.concurrent.CancellationException r1 = r1.J()
            if (r1 == 0) goto L89
            java.lang.Throwable r1 = r1.getCause()
            goto L8a
        L89:
            r1 = r3
        L8a:
            io.ktor.network.selector.k r2 = r5.f400230g
            java.nio.channels.SelectableChannel r4 = r5.getF400183b()     // Catch: java.lang.Throwable -> L9c
            java.nio.channels.ByteChannel r4 = (java.nio.channels.ByteChannel) r4     // Catch: java.lang.Throwable -> L9c
            r4.close()     // Catch: java.lang.Throwable -> L9c
            super.close()     // Catch: java.lang.Throwable -> L9c
        L98:
            r2.t2(r5)
            goto L9e
        L9c:
            r3 = move-exception
            goto L98
        L9e:
            if (r0 != 0) goto La2
            r0 = r1
            goto Lab
        La2:
            if (r1 != 0) goto La5
            goto Lab
        La5:
            if (r0 != r1) goto La8
            goto Lab
        La8:
            kotlin.C42833p.a(r0, r1)
        Lab:
            if (r0 != 0) goto Lae
            goto Lb8
        Lae:
            if (r3 != 0) goto Lb1
            goto Lb7
        Lb1:
            if (r0 != r3) goto Lb4
            goto Lb7
        Lb4:
            kotlin.C42833p.a(r0, r3)
        Lb7:
            r3 = r0
        Lb8:
            kotlinx.coroutines.P0 r0 = r5.f400235l
            if (r3 != 0) goto Lc0
            r0.q3()
            goto Lc3
        Lc0:
            r0.b(r3)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.N.close():void");
    }

    @Override // io.ktor.network.selector.j, kotlinx.coroutines.InterfaceC43268o0
    public final void dispose() {
        close();
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF399773c() {
        return this.f400235l;
    }

    @Override // io.ktor.network.selector.j, io.ktor.network.selector.i
    @Y61.k
    /* renamed from: r */
    public S getF400183b() {
        return this.f400229f;
    }

    public N(@Y61.k S s5, @Y61.k io.ktor.network.selector.k kVar, @Y61.l io.ktor.utils.io.pool.h<ByteBuffer> hVar, @Y61.l Z.e eVar) {
        super(s5);
        this.f400229f = s5;
        this.f400230g = kVar;
        this.f400231h = hVar;
        this.f400232i = new AtomicBoolean();
        this.f400233j = new AtomicReference<>();
        this.f400234k = new AtomicReference<>();
        this.f400235l = Q0.a();
    }
}
