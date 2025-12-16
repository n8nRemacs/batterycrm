package io.ktor.network.selector;

import io.ktor.network.selector.SelectInterest;
import java.nio.channels.SelectableChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.coroutines.InterfaceC43271q;

/* compiled from: SelectableJvm.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/network/selector/j;", "Lio/ktor/network/selector/i;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public class j implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SelectableChannel f400183b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f400184c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e f400185d = new e();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AtomicInt f400186e = AtomicFU.atomic(0);

    public j(@Y61.k SelectableChannel selectableChannel) {
        this.f400183b = selectableChannel;
    }

    @Override // io.ktor.network.selector.i
    public final void O0(@Y61.k SelectInterest selectInterest, boolean z12) {
        int value;
        int f400138b = selectInterest.getF400138b();
        do {
            value = this.f400186e.getValue();
        } while (!this.f400186e.compareAndSet(value, z12 ? value | f400138b : (~f400138b) & value));
    }

    @Override // io.ktor.network.selector.i
    @Y61.k
    /* renamed from: Q1, reason: from getter */
    public final e getF400185d() {
        return this.f400185d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f400184c.compareAndSet(false, true)) {
            this.f400186e.setValue(0);
            SelectInterest.f400131c.getClass();
            for (SelectInterest selectInterest : SelectInterest.a.a()) {
                InterfaceC43271q<G0> interfaceC43271qI = this.f400185d.i(selectInterest);
                if (interfaceC43271qI != null) {
                    int i12 = Z.f406624c;
                    interfaceC43271qI.resumeWith(C42729a0.a(new ClosedChannelCancellationException()));
                }
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC43268o0
    public void dispose() {
        close();
    }

    @Override // io.ktor.network.selector.i
    public final int e2() {
        return this.f400186e.getValue();
    }

    @Override // io.ktor.network.selector.i
    public final boolean isClosed() {
        return this.f400184c.get();
    }

    @Override // io.ktor.network.selector.i
    @Y61.k
    /* renamed from: r, reason: from getter */
    public SelectableChannel getF400183b() {
        return this.f400183b;
    }
}
