package io.ktor.network.selector;

import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.InterfaceC43271q;
import kotlinx.coroutines.r;

/* compiled from: SelectorManagerSupport.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/network/selector/SelectorManagerSupport;", "Lio/ktor/network/selector/k;", "<init>", "()V", "ClosedSelectorCancellationException", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public abstract class SelectorManagerSupport implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SelectorProvider f400139b = SelectorProvider.provider();

    /* renamed from: c, reason: collision with root package name */
    public int f400140c;

    /* renamed from: d, reason: collision with root package name */
    public int f400141d;

    /* compiled from: SelectorManagerSupport.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/network/selector/SelectorManagerSupport$ClosedSelectorCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "()V", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ClosedSelectorCancellationException extends CancellationException {
        public ClosedSelectorCancellationException() {
            super("Closed selector");
        }
    }

    public static void c(@Y61.k i iVar, @Y61.k Throwable th2) {
        e f400185d = iVar.getF400185d();
        SelectInterest.f400131c.getClass();
        for (SelectInterest selectInterest : SelectInterest.f400132d) {
            InterfaceC43271q<G0> interfaceC43271qI = f400185d.i(selectInterest);
            if (interfaceC43271qI != null) {
                int i12 = Z.f406624c;
                interfaceC43271qI.resumeWith(new Z.b(th2));
            }
        }
    }

    public static void f(@Y61.k AbstractSelector abstractSelector, @Y61.l Throwable th2) {
        if (th2 == null) {
            th2 = new ClosedSelectorCancellationException();
        }
        for (SelectionKey selectionKey : abstractSelector.keys()) {
            try {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
            } catch (CancelledKeyException unused) {
            }
            Object objAttachment = selectionKey.attachment();
            i iVar = objAttachment instanceof i ? (i) objAttachment : null;
            if (iVar != null) {
                c(iVar, th2);
            }
            selectionKey.cancel();
        }
    }

    public final void b(@Y61.k Selector selector, @Y61.k i iVar) {
        try {
            SelectableChannel f400183b = iVar.getF400183b();
            SelectionKey selectionKeyKeyFor = f400183b.keyFor(selector);
            int iE2 = iVar.e2();
            if (selectionKeyKeyFor == null) {
                if (iE2 != 0) {
                    f400183b.register(selector, iE2, iVar);
                }
            } else if (selectionKeyKeyFor.interestOps() != iE2) {
                selectionKeyKeyFor.interestOps(iE2);
            }
            if (iE2 != 0) {
                this.f400140c++;
            }
        } catch (Throwable th2) {
            SelectionKey selectionKeyKeyFor2 = iVar.getF400183b().keyFor(selector);
            if (selectionKeyKeyFor2 != null) {
                selectionKeyKeyFor2.cancel();
            }
            c(iVar, th2);
        }
    }

    @Override // io.ktor.network.selector.k
    @Y61.l
    public final Object c1(@Y61.k i iVar, @Y61.k SelectInterest selectInterest, @Y61.k ContinuationImpl continuationImpl) throws IOException {
        int iE2 = iVar.e2();
        if (iVar.isClosed()) {
            throw new IOException("Selectable is already closed");
        }
        int i12 = selectInterest.f400138b;
        if ((iE2 & i12) == 0) {
            throw new IllegalStateException(("Selectable is invalid state: " + iE2 + ", " + i12).toString());
        }
        r rVar = new r(1, IntrinsicsKt.intercepted(continuationImpl));
        rVar.p();
        rVar.r(m.f400187l);
        e f400185d = iVar.getF400185d();
        f400185d.getClass();
        e.f400168a.getClass();
        AtomicReferenceFieldUpdater<e, InterfaceC43271q<G0>> atomicReferenceFieldUpdater = e.f400169b[selectInterest.ordinal()];
        while (!atomicReferenceFieldUpdater.compareAndSet(f400185d, null, rVar)) {
            if (atomicReferenceFieldUpdater.get(f400185d) != null) {
                throw new IllegalStateException("Handler for " + selectInterest.name() + " is already registered");
            }
        }
        if (!rVar.u()) {
            h(iVar);
        }
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
    }

    public final void g(@Y61.k Set<SelectionKey> set, @Y61.k Set<? extends SelectionKey> set2) {
        int size = set.size();
        this.f400140c = set2.size() - size;
        this.f400141d = 0;
        if (size > 0) {
            Iterator<SelectionKey> it = set.iterator();
            while (it.hasNext()) {
                SelectionKey next = it.next();
                try {
                    int i12 = next.readyOps();
                    int iInterestOps = next.interestOps();
                    Object objAttachment = next.attachment();
                    i iVar = objAttachment instanceof i ? (i) objAttachment : null;
                    if (iVar == null) {
                        next.cancel();
                        this.f400141d++;
                    } else {
                        e f400185d = iVar.getF400185d();
                        SelectInterest.f400131c.getClass();
                        int[] iArr = SelectInterest.f400133e;
                        int length = iArr.length;
                        for (int i13 = 0; i13 < length; i13++) {
                            if ((iArr[i13] & i12) != 0) {
                                f400185d.getClass();
                                InterfaceC43271q<G0> andSet = e.f400169b[i13].getAndSet(f400185d, null);
                                if (andSet != null) {
                                    int i14 = Z.f406624c;
                                    andSet.resumeWith(G0.f406611a);
                                }
                            }
                        }
                        int i15 = (~i12) & iInterestOps;
                        if (i15 != iInterestOps) {
                            next.interestOps(i15);
                        }
                        if (i15 != 0) {
                            this.f400140c++;
                        }
                    }
                } catch (Throwable th2) {
                    next.cancel();
                    this.f400141d++;
                    Object objAttachment2 = next.attachment();
                    i iVar2 = objAttachment2 instanceof i ? (i) objAttachment2 : null;
                    if (iVar2 != null) {
                        c(iVar2, th2);
                        next.attach(null);
                    }
                }
                it.remove();
            }
        }
    }

    public abstract void h(@Y61.k i iVar);
}
