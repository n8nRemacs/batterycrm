package defpackage;

import android.graphics.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ce4 extends Thread {
    public yj X;
    public int Y;
    public final ReentrantLock Z;
    public final a93 a;
    public ae4 c;
    public final Condition s0;
    public final ReentrantLock t0;
    public volatile boolean u0;
    public final int b = 30;
    public final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    public final AtomicInteger o = new AtomicInteger(0);

    public ce4(ae4 ae4Var, a93 a93Var) {
        this.a = a93Var;
        this.c = ae4Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.Z = reentrantLock;
        this.s0 = reentrantLock.newCondition();
        this.t0 = new ReentrantLock();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int length;
        byte[] bArr;
        int i;
        float[] fArr;
        ReentrantLock reentrantLock;
        loop0: while (!this.u0) {
            this.t0.lock();
            try {
                ae4 ae4Var = this.c;
                boolean z = ae4Var == null;
                long jBufferedAmount = ae4Var != null ? ae4Var.a.bufferedAmount() : 0L;
                if (z) {
                    break;
                }
                while (!this.u0 && (jBufferedAmount >= 8000000 || (this.X == null && this.d.isEmpty()))) {
                    try {
                        reentrantLock = this.Z;
                        reentrantLock.lock();
                    } catch (Throwable unused) {
                    }
                    try {
                        this.s0.await(50L, TimeUnit.MILLISECONDS);
                        reentrantLock.unlock();
                        ReentrantLock reentrantLock2 = this.t0;
                        reentrantLock2.lock();
                        try {
                            ae4 ae4Var2 = this.c;
                            z = ae4Var2 == null;
                            jBufferedAmount = ae4Var2 != null ? ae4Var2.a.bufferedAmount() : 0L;
                            reentrantLock2.unlock();
                            if (z) {
                                break loop0;
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                if (this.u0) {
                    break;
                }
                if (this.X == null) {
                    yj yjVar = (yj) this.d.poll();
                    this.X = yjVar;
                    if (yjVar == null) {
                        continue;
                    } else {
                        this.o.decrementAndGet();
                    }
                }
                yj yjVar2 = this.X;
                if (yjVar2 != null) {
                    int i2 = this.Y;
                    this.Y = i2 + 1;
                    int i3 = yjVar2.b;
                    hi hiVar = yjVar2.c;
                    if (yjVar2.a == 1) {
                        boolean z2 = hiVar instanceof ji;
                        if (hiVar instanceof gi) {
                            fArr = ((gi) hiVar).a;
                        } else {
                            if (!z2) {
                                if (!(hiVar instanceof ii)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("Internal error AnimojiSendDataPackage");
                            }
                            fArr = new float[0];
                        }
                        bArr = new byte[(fArr.length * 4) + 10];
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                        byte b = z2 ? (byte) 1 : (byte) 0;
                        byteBufferWrap.put((byte) 1);
                        byteBufferWrap.putShort((short) i2);
                        byteBufferWrap.putInt(i3);
                        byteBufferWrap.putShort((short) 0);
                        byteBufferWrap.put(b);
                        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                        for (float f : fArr) {
                            byteBufferWrap.putFloat(f);
                        }
                    } else {
                        boolean z3 = hiVar instanceof gi;
                        if (z3) {
                            length = ((gi) hiVar).a.length;
                        } else if (hiVar instanceof ii) {
                            length = 3;
                        } else {
                            if (!(hiVar instanceof ji)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            length = 0;
                        }
                        bArr = new byte[length + 12];
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                        if (z3) {
                            i = 0;
                        } else if (hiVar instanceof ii) {
                            i = 2;
                        } else {
                            if (!(hiVar instanceof ji)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = 1;
                        }
                        byteBufferWrap2.put((byte) 2);
                        byteBufferWrap2.putShort((short) i2);
                        byteBufferWrap2.putInt(i3);
                        byteBufferWrap2.putInt(0);
                        byteBufferWrap2.put((byte) i);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        if (z3) {
                            int length2 = ((gi) hiVar).a.length;
                            for (int i4 = 0; i4 < length2; i4++) {
                                byteBufferWrap2.put((byte) (r0[i4] * 255.0f));
                            }
                        } else if (hiVar instanceof ii) {
                            ii iiVar = (ii) hiVar;
                            byte bRed = (byte) Color.red(iiVar.a);
                            byte bGreen = (byte) Color.green(iiVar.a);
                            byte bBlue = (byte) Color.blue(iiVar.a);
                            byteBufferWrap2.put(bRed);
                            byteBufferWrap2.put(bGreen);
                            byteBufferWrap2.put(bBlue);
                        } else {
                            hiVar.equals(ji.a);
                        }
                    }
                    this.t0.lock();
                    try {
                        boolean z4 = this.c == null;
                        ((AtomicInteger) this.a.a).addAndGet(bArr.length);
                        ae4 ae4Var3 = this.c;
                        if (ae4Var3 != null) {
                            ae4Var3.e(2, bArr);
                        }
                        ((AtomicInteger) this.a.b).incrementAndGet();
                        this.X = null;
                        if (z4) {
                            break;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    continue;
                }
            } finally {
            }
        }
        this.X = null;
        this.d.clear();
    }
}
