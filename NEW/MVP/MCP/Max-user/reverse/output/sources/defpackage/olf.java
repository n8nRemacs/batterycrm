package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final /* synthetic */ class olf implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ qlf b;

    public /* synthetic */ olf(qlf qlfVar, int i) {
        this.a = i;
        this.b = qlfVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        dlf dlfVar;
        long jLongValue;
        long jLongValue2;
        boolean z;
        switch (this.a) {
            case 0:
                qlf qlfVar = this.b;
                ((Integer) obj).getClass();
                return qlf.P(qlfVar);
            case 1:
                qlf qlfVar2 = this.b;
                int iIntValue = ((Integer) obj).intValue();
                if (!qlfVar2.t0) {
                    synchronized (qlfVar2.b) {
                        qlfVar2.s0 = false;
                    }
                    if (!((ConcurrentLinkedQueue) qlfVar2.X.a).isEmpty()) {
                        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) qlfVar2.X.a;
                        if (concurrentLinkedQueue.isEmpty()) {
                            dlfVar = null;
                        } else {
                            dlfVar = (dlf) concurrentLinkedQueue.poll();
                            int i = dlfVar.Y;
                            if (i > iIntValue) {
                                dlf dlfVar2 = new dlf(dlfVar.b, dlfVar.c, dlfVar.o, 0, dlfVar.d - (i - iIntValue), false, 0);
                                int i2 = dlfVar.b;
                                long j = dlfVar.c;
                                int i3 = dlfVar2.d;
                                concurrentLinkedQueue.add(new dlf(i2, j + i3, dlfVar.o, i3, dlfVar.d - i3, dlfVar.X, 0));
                                dlfVar = dlfVar2;
                            }
                        }
                        qlfVar2.a.d.recovery("Retransmitted lost stream frame " + dlfVar);
                    } else if (qlfVar2.c.a.isEmpty()) {
                        dlfVar = null;
                    } else {
                        b36 b36Var = qlfVar2.w0;
                        ctc ctcVar = qlfVar2.a;
                        synchronized (b36Var) {
                            jLongValue = ((Long) b36Var.h.get(Integer.valueOf(ctcVar.a))).longValue() + b36Var.a(ctcVar);
                        }
                        int i4 = qlfVar2.c.d.get();
                        long j2 = qlfVar2.Y;
                        if (jLongValue > j2 || i4 == 0) {
                            ctc ctcVar2 = qlfVar2.a;
                            ctcVar2.getClass();
                            int iMin = Integer.min(i4, (iIntValue - new dlf(ctcVar2.a, j2, new byte[0], 0, 0, false, 0).Y) - 1);
                            b36 b36Var2 = qlfVar2.w0;
                            ctc ctcVar3 = qlfVar2.a;
                            long j3 = qlfVar2.Y + iMin;
                            b36Var2.getClass();
                            int i5 = ctcVar3.a;
                            synchronized (b36Var2) {
                                long jA = b36Var2.a(ctcVar3);
                                long jLongValue3 = j3 - ((Long) b36Var2.h.get(Integer.valueOf(i5))).longValue();
                                long jMin = Long.min(jLongValue3, jA);
                                if (jLongValue3 < 0) {
                                    throw new IllegalArgumentException();
                                }
                                b36Var2.f += jMin;
                                jLongValue2 = ((Long) b36Var2.h.get(Integer.valueOf(i5))).longValue() + jMin;
                                b36Var2.h.put(Integer.valueOf(i5), Long.valueOf(jLongValue2));
                            }
                            int iMin2 = Integer.min((int) (jLongValue2 - qlfVar2.Y), iMin);
                            zce zceVar = qlfVar2.c;
                            ctc ctcVar4 = qlfVar2.a;
                            ctcVar4.getClass();
                            int i6 = ctcVar4.a;
                            long j4 = qlfVar2.Y;
                            ReentrantLock reentrantLock = zceVar.e;
                            ConcurrentLinkedDeque concurrentLinkedDeque = zceVar.a;
                            byte[] bArrCopyOfRange = new byte[iMin2];
                            int i7 = 0;
                            while (i7 < iMin2 && !concurrentLinkedDeque.isEmpty()) {
                                ByteBuffer byteBuffer = (ByteBuffer) concurrentLinkedDeque.peek();
                                int i8 = iMin2 - i7;
                                if (byteBuffer.remaining() <= i8) {
                                    int iRemaining = byteBuffer.remaining() + i7;
                                    byteBuffer.get(bArrCopyOfRange, i7, byteBuffer.remaining());
                                    concurrentLinkedDeque.poll();
                                    i7 = iRemaining;
                                } else {
                                    byteBuffer.get(bArrCopyOfRange, i7, i8);
                                    i7 = iMin2;
                                }
                            }
                            if (concurrentLinkedDeque.isEmpty() || concurrentLinkedDeque.peek() != zceVar.b) {
                                z = false;
                            } else {
                                concurrentLinkedDeque.poll();
                                z = true;
                            }
                            if (i7 != 0 || z) {
                                zceVar.d.getAndAdd(i7 * (-1));
                                reentrantLock.lock();
                                try {
                                    zceVar.f.signal();
                                    if (i7 < iMin2) {
                                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, 0, i7);
                                    }
                                    dlfVar = new dlf(i6, j4, bArrCopyOfRange, 0, bArrCopyOfRange.length, z, 0);
                                } finally {
                                    reentrantLock.unlock();
                                }
                            } else {
                                dlfVar = null;
                            }
                            if (dlfVar != null) {
                                qlfVar2.Y += dlfVar.d;
                            }
                            if (dlfVar != null && dlfVar.X) {
                                qlfVar2.Z();
                            }
                        } else {
                            if (j2 != qlfVar2.v0) {
                                qlfVar2.v0 = j2;
                                qlfVar2.d.stream(qlfVar2.a + " blocked at " + j2);
                                ctc ctcVar5 = qlfVar2.a;
                                ctcVar5.b.l(new olf(qlfVar2, 0), epi.a((long) ctcVar5.a) + 9, hf5.d, new plf(qlfVar2, 0), true);
                            }
                            dlfVar = null;
                        }
                    }
                    if (dlfVar == null) {
                        return dlfVar;
                    }
                    if (qlfVar2.c.a.isEmpty() && ((ConcurrentLinkedQueue) qlfVar2.X.a).isEmpty()) {
                        return dlfVar;
                    }
                    synchronized (qlfVar2.b) {
                        qlfVar2.s0 = true;
                    }
                    int i9 = 1;
                    qlfVar2.a.b.l(new olf(qlfVar2, i9), 20, qlfVar2.h0(), new plf(qlfVar2, i9), true);
                    return dlfVar;
                }
                return null;
            default:
                qlf qlfVar3 = this.b;
                ((Integer) obj).intValue();
                int i10 = qlfVar3.a.a;
                long j5 = qlfVar3.u0;
                long j6 = qlfVar3.Y;
                snd sndVar = new snd();
                sndVar.a = i10;
                sndVar.b = j5;
                sndVar.c = j6;
                return sndVar;
        }
    }
}
