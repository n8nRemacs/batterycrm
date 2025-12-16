package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class d4a {
    public final FileChannel a;
    public final fa6 b;
    public final usd f;
    public long h;
    public long i;
    public long k;
    public long l;
    public long m;
    public final int g = 400000;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public boolean j = true;
    public o7d n = o7d.a(0L, 0L);
    public long o = 0;

    public d4a(FileChannel fileChannel, fa6 fa6Var) {
        this.a = fileChannel;
        this.b = fa6Var;
        usd usdVar = new usd(22, false);
        usdVar.b = ByteBuffer.allocateDirect(0);
        this.f = usdVar;
    }

    public final void a() throws IOException {
        if (this.j) {
            d();
            return;
        }
        ByteBuffer byteBufferM = kt0.m(this.c, this.b);
        int iRemaining = byteBufferM.remaining();
        long j = iRemaining + 8;
        if (this.l - this.m < j) {
            e(((Long) this.n.b.e()).longValue() + j, byteBufferM);
            hsi.g(this.l - this.m >= j);
        }
        long j2 = this.m;
        FileChannel fileChannel = this.a;
        fileChannel.position(j2);
        fileChannel.write(byteBufferM);
        long j3 = iRemaining + j2;
        long jLongValue = ((Long) this.n.b.e()).longValue() - j3;
        hsi.g(jLongValue < 2147483647L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt((int) jLongValue);
        String str = zxg.a;
        byteBufferAllocate.put("free".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate.flip();
        fileChannel.write(byteBufferAllocate);
        this.l = j2;
        f(j2 - this.k);
        this.n = o7d.a(Long.valueOf(j2), Long.valueOf(j2 + byteBufferM.limit()));
        fileChannel.truncate(j3);
    }

    public final void b() {
        ArrayList arrayList;
        long j;
        int i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i2 >= arrayList2.size()) {
                break;
            }
            g((cfg) arrayList2.get(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            arrayList = this.d;
            if (i3 >= arrayList.size()) {
                break;
            }
            g((cfg) arrayList.get(i3));
            i3++;
        }
        if (this.e.get()) {
            a();
            if (arrayList.isEmpty()) {
                return;
            }
            byte[] bArr = new byte[8];
            for (int i4 = 7; i4 >= 0; i4--) {
                bArr[i4] = (byte) 0;
            }
            ks8 ks8Var = new ks8(bArr, 0, 78, "auxiliary.tracks.offset");
            fa6 fa6Var = this.b;
            fa6Var.o(ks8Var);
            ByteBuffer byteBufferG = kt0.g();
            fa6 fa6Var2 = new fa6(7);
            fa6Var2.o((y3a) fa6Var.d);
            fa6Var2.o(new ks8(new byte[]{1}, 0, 75, "auxiliary.tracks.interleaved"));
            int size = arrayList.size();
            byte[] bArr2 = new byte[size + 2];
            bArr2[0] = 1;
            bArr2[1] = (byte) size;
            for (int i5 = 0; i5 < size; i5++) {
                cfg cfgVar = (cfg) arrayList.get(i5);
                int i6 = cfgVar.a.g;
                if (i6 == 1) {
                    i = 0;
                } else if (i6 == 2) {
                    i = 1;
                } else if (i6 == 3) {
                    i = 2;
                } else {
                    if (i6 != 4) {
                        throw new IllegalArgumentException("Unsupported auxiliary track type " + cfgVar.a.g);
                    }
                    i = 3;
                }
                bArr2[i5 + 2] = (byte) i;
            }
            fa6Var2.o(new ks8(bArr2, 0, 0, "auxiliary.tracks.map"));
            ByteBuffer byteBufferM = kt0.m(arrayList, fa6Var2);
            long jRemaining = byteBufferM.remaining() + byteBufferG.remaining();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            byteBufferAllocate.putInt(1);
            String str = zxg.a;
            byteBufferAllocate.put("axte".getBytes(StandardCharsets.UTF_8));
            byteBufferAllocate.putLong(jRemaining + 16);
            byteBufferAllocate.flip();
            ByteBuffer byteBufferA = qvi.a(byteBufferAllocate, byteBufferG, byteBufferM);
            long jRemaining2 = byteBufferA.remaining();
            byte[] bArr3 = new byte[8];
            int i7 = 7;
            while (true) {
                j = 255;
                if (i7 < 0) {
                    break;
                }
                bArr3[i7] = (byte) (255 & jRemaining2);
                jRemaining2 >>= 8;
                i7--;
            }
            fa6Var.o(new ks8(bArr3, 0, 78, "auxiliary.tracks.length"));
            a();
            ((HashSet) fa6Var.c).remove(ks8Var);
            FileChannel fileChannel = this.a;
            byte[] bArr4 = new byte[8];
            long size2 = fileChannel.size();
            int i8 = 7;
            while (i8 >= 0) {
                bArr4[i8] = (byte) (size2 & r17);
                size2 >>= 8;
                i8--;
                j = j;
            }
            fa6Var.o(new ks8(bArr4, 0, 78, "auxiliary.tracks.offset"));
            long size3 = fileChannel.size();
            a();
            hsi.g(size3 == fileChannel.size());
            fileChannel.position(fileChannel.size());
            fileChannel.write(byteBufferA);
        }
    }

    public final void c(long j) throws IOException {
        if (this.j) {
            return;
        }
        long j2 = this.m;
        if (j2 + j >= this.l) {
            e(Math.max(this.l + Math.min(1000000000L, Math.max(500000L, (long) (j2 * 0.2f))) + j, ((Long) this.n.b.e()).longValue()), kt0.m(this.c, this.b));
        }
    }

    public final void d() throws IOException {
        ByteBuffer byteBufferM = kt0.m(this.c, this.b);
        int iRemaining = byteBufferM.remaining();
        long jRemaining = byteBufferM.remaining() + 8;
        long j = this.i;
        long j2 = this.h;
        long j3 = j - j2;
        FileChannel fileChannel = this.a;
        if (jRemaining <= j3) {
            fileChannel.position(j2);
            fileChannel.write(byteBufferM);
            fileChannel.write(qvi.e("free", ByteBuffer.allocate((int) ((this.i - fileChannel.position()) - 8))));
        } else {
            this.j = false;
            long j4 = this.m;
            this.l = j4;
            fileChannel.position(j4);
            fileChannel.write(byteBufferM);
            this.n = o7d.a(Long.valueOf(this.l), Long.valueOf(this.l + iRemaining));
            fileChannel.write(qvi.e("free", ByteBuffer.allocate((int) ((this.i - this.h) - 8))), this.h);
        }
        f(this.m - this.k);
    }

    public final void e(long j, ByteBuffer byteBuffer) throws IOException {
        hsi.g(j >= ((Long) this.n.b.e()).longValue());
        hsi.g(j >= this.l);
        FileChannel fileChannel = this.a;
        fileChannel.position(j);
        fileChannel.write(qvi.e("free", byteBuffer.duplicate()));
        long j2 = 8 + j;
        this.l = j2;
        f(j2 - this.k);
        this.n = o7d.a(Long.valueOf(j), Long.valueOf(j + byteBuffer.remaining()));
    }

    public final void f(long j) throws IOException {
        long j2 = this.k + 8;
        FileChannel fileChannel = this.a;
        fileChannel.position(j2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.flip();
        fileChannel.write(byteBufferAllocate);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.cfg r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4a.g(cfg):void");
    }

    public final void h(cfg cfgVar, ByteBuffer byteBuffer, zu0 zu0Var) {
        bua buaVar;
        int iRemaining;
        hf6 hf6Var = cfgVar.a;
        if (Objects.equals(hf6Var.n, "video/av01") && hf6Var.q.isEmpty() && cfgVar.h == null) {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            ArrayList arrayList = new ArrayList();
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferDuplicate.asReadOnlyBuffer();
            ArrayList arrayList2 = new ArrayList();
            while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
                byte b = byteBufferAsReadOnlyBuffer.get();
                int i = (b >> 3) & 15;
                if (((b >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b2 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b2 & 127) << (i2 * 7);
                        if ((b2 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                ByteBuffer byteBufferDuplicate2 = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate2.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList2.add(new aua(i, byteBufferDuplicate2));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            }
            Iterator it = arrayList2.iterator();
            ByteBuffer byteBufferF = null;
            ByteBuffer byteBufferAllocate = null;
            while (it.hasNext()) {
                aua auaVar = (aua) it.next();
                int i3 = auaVar.a;
                if (i3 == 5) {
                    arrayList.add(dui.f(auaVar));
                } else if (i3 == 1 && byteBufferF == null) {
                    byteBufferF = dui.f(auaVar);
                    byteBufferAllocate = ByteBuffer.allocate(4);
                    byteBufferAllocate.put((byte) -127);
                    try {
                        buaVar = new bua(auaVar);
                    } catch (zta unused) {
                        buaVar = null;
                    }
                    hsi.e(buaVar, "No sequence header available.");
                    byteBufferAllocate.put((byte) ((buaVar.g << 5) | buaVar.h));
                    byteBufferAllocate.put((byte) ((buaVar.i > 0 ? 128 : 0) | (buaVar.l ? 64 : 0) | (buaVar.m ? 32 : 0) | (buaVar.n ? 16 : 0) | (buaVar.o ? 8 : 0) | (buaVar.p ? 4 : 0) | buaVar.q));
                    boolean z = buaVar.j;
                    byteBufferAllocate.put((byte) ((z ? buaVar.k & 15 : 0) | (z ? 16 : 0)));
                    byteBufferAllocate.flip();
                }
            }
            hsi.e(byteBufferF, "No sequence header available.");
            ByteBuffer byteBufferA = qvi.a(byteBufferF, qvi.a((ByteBuffer[]) arrayList.toArray(new ByteBuffer[0])));
            hsi.e(byteBufferAllocate, "csdHeader is null.");
            cfgVar.h = qvi.a(byteBufferAllocate, byteBufferA).array();
        }
        hsi.a("Samples can not be written after writing a sample with MediaCodec.BUFFER_FLAG_END_OF_STREAM flag", cfgVar.i == -9223372036854775807L);
        int i4 = zu0Var.b;
        long j = zu0Var.a;
        int i5 = zu0Var.c;
        if (i4 != 0 && byteBuffer.remaining() != 0) {
            if ((i5 & 1) > 0) {
                cfgVar.g = true;
            }
            if (cfgVar.g || !xz9.m(hf6Var.n)) {
                cfgVar.e.addLast(new zu0(byteBuffer.remaining(), i5, j));
                cfgVar.f.addLast(byteBuffer);
            }
        } else if ((i5 & 4) != 0) {
            cfgVar.i = j;
        }
        g(cfgVar);
        if (this.c.contains(cfgVar) && this.j && j - this.o >= 1000000) {
            d();
            this.o = j;
        }
    }
}
