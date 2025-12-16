package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;

/* loaded from: classes3.dex */
public final class acd {
    public final ConcurrentSkipListSet a = new ConcurrentSkipListSet();
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public volatile long c = 0;
    public volatile long d = 0;
    public volatile long e = -1;
    public final int f = 5120;
    public volatile boolean g;

    public static blf c(blf blfVar, blf blfVar2) {
        if (blfVar.getOffset() <= blfVar2.getOffset() && blfVar.b() >= blfVar2.b()) {
            return blfVar;
        }
        if (blfVar2.getOffset() <= blfVar.getOffset() && blfVar2.b() >= blfVar.b()) {
            return blfVar2;
        }
        int iB = (int) (blfVar.b() - blfVar2.getOffset());
        byte[] bArr = new byte[(blfVar2.getLength() + blfVar.getLength()) - iB];
        System.arraycopy(blfVar.f(), 0, bArr, 0, blfVar.getLength());
        System.arraycopy(blfVar2.f(), iB, bArr, blfVar.getLength(), blfVar2.getLength() - iB);
        return new zbd(blfVar.getOffset(), bArr, blfVar.isFinal() || blfVar2.isFinal());
    }

    public static blf e(blf blfVar, long j, long j2) {
        int i = (int) (j2 - j);
        if (i == blfVar.getLength()) {
            return blfVar;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(blfVar.f(), (int) (j - blfVar.getOffset()), bArr, 0, i);
        return new zbd(j, bArr, blfVar.isFinal());
    }

    public final boolean a(blf blfVar) throws Exception {
        try {
            if (blfVar.getLength() > 0) {
                b(blfVar);
            }
            if (blfVar.isFinal()) {
                this.e = blfVar.b();
            }
            long j = this.c;
            while (!this.a.isEmpty() && ((blf) this.a.first()).getOffset() <= this.c) {
                blf blfVarE = (blf) this.a.pollFirst();
                if (blfVarE.b() > this.c) {
                    if (blfVarE.getOffset() < this.c) {
                        blfVarE = e(blfVarE, this.c, blfVarE.b());
                    }
                    this.b.add(blfVarE);
                    this.c = blfVarE.b();
                    blfVarE.getLength();
                }
            }
            return this.c > j;
        } catch (Exception e) {
            if (this.g) {
                return false;
            }
            throw e;
        }
    }

    public final void b(blf blfVar) {
        ConcurrentSkipListSet concurrentSkipListSet = this.a;
        blf blfVar2 = (blf) concurrentSkipListSet.lower(blfVar);
        int i = this.f;
        if (blfVar2 != null && blfVar2.b() > blfVar.getOffset()) {
            if (Long.max(blfVar2.b(), blfVar.b()) - Long.min(blfVar2.getOffset(), blfVar.getOffset()) <= i) {
                blfVar = c(blfVar2, blfVar);
                concurrentSkipListSet.remove(blfVar2);
                blfVar2.getLength();
            } else {
                blfVar = e(blfVar, blfVar2.b(), blfVar.b());
                if (concurrentSkipListSet.lower(blfVar) != blfVar2) {
                    blf blfVar3 = (blf) concurrentSkipListSet.lower(blfVar);
                    blfVar = c(blfVar3, blfVar);
                    concurrentSkipListSet.remove(blfVar3);
                    blfVar3.getLength();
                }
            }
        }
        blf blfVar4 = (blf) concurrentSkipListSet.higher(blfVar);
        while (blfVar4 != null && blfVar.b() > blfVar4.getOffset()) {
            if (Long.max(blfVar.b(), blfVar4.b()) - Long.min(blfVar.getOffset(), blfVar4.getOffset()) <= i) {
                blfVar = c(blfVar, blfVar4);
                concurrentSkipListSet.remove(blfVar4);
                blfVar4.getLength();
            } else {
                blfVar = e(blfVar, blfVar.getOffset(), blfVar4.getOffset());
            }
            blfVar4 = (blf) concurrentSkipListSet.higher(blfVar);
        }
        if (concurrentSkipListSet.add(blfVar)) {
            blfVar.getLength();
        }
    }

    public final int d(ByteBuffer byteBuffer) {
        if (this.e >= 0 && this.d == this.e) {
            return -1;
        }
        blf blfVar = (blf) this.b.peek();
        int i = 0;
        while (blfVar != null && byteBuffer.hasRemaining()) {
            int iMin = (int) Long.min(byteBuffer.remaining(), blfVar.b() - this.d);
            byteBuffer.put(blfVar.f(), (int) (this.d - blfVar.getOffset()), iMin);
            this.d += iMin;
            i += iMin;
            if (this.d == blfVar.b()) {
                this.b.remove();
                blfVar = (blf) this.b.peek();
            }
        }
        return i;
    }
}
