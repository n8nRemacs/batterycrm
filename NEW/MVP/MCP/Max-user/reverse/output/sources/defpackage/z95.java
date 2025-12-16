package defpackage;

import android.os.SystemClock;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class z95 implements aa7, bz9, qpf {
    public static final long[] o = new long[0];
    public long a;
    public final Object b;
    public final Object c;
    public Object d;

    public z95(ey2 ey2Var) {
        this.d = ey2Var;
        this.b = new ia5(0.3d, 0.0d, 6);
        this.c = new dq0(0);
    }

    public static final List f(z95 z95Var, cr2 cr2Var, String str) {
        z95Var.getClass();
        return lee.o(lee.g(new nhg(lee.g(new at(2, cr2Var.c), new dse(6, z95Var)), new a7c(z95Var, 10, str)), new llc(26)));
    }

    public static final gpf g(z95 z95Var, gx3 gx3Var) {
        z95Var.getClass();
        String strB = m6g.b(gx3Var.v0);
        ArrayList arrayList = new ArrayList();
        i(arrayList, gx3Var.o);
        return ((ssb) z95Var.c).m(gx3Var.a, arrayList, strB, gx3Var.a(), gx3Var.d(il0.c), null, ((mce) ((k18) z95Var.d).getValue()).a(gx3Var.a));
    }

    public static void i(ArrayList arrayList, List list) {
        String str = (String) lee.i(new nhg(lee.g(new at(2, list), new llc(24)), new llc(25)));
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = fni.b(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() > 0) {
                arrayList.add(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.q44 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.npf
            if (r0 == 0) goto L13
            r0 = r12
            npf r0 = (defpackage.npf) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            npf r0 = new npf
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            z95 r1 = r0.d
            defpackage.g8j.b(r12)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L2a
            goto L58
        L27:
            r0 = move-exception
            r12 = r0
            goto L64
        L2a:
            r0 = move-exception
            r12 = r0
            goto L74
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            defpackage.g8j.b(r12)
            fh2 r3 = new fh2
            long r4 = r11.a
            r9 = 100
            r10 = 0
            java.lang.String r6 = "MEMBER"
            r7 = 0
            r3.<init>(r4, r6, r7, r9, r10)
            java.lang.Object r12 = r11.b     // Catch: java.util.concurrent.CancellationException -> L2a java.lang.Throwable -> L61
            hwa r12 = (defpackage.hwa) r12     // Catch: java.util.concurrent.CancellationException -> L2a java.lang.Throwable -> L61
            r0.d = r11     // Catch: java.util.concurrent.CancellationException -> L2a java.lang.Throwable -> L61
            r0.Y = r2     // Catch: java.util.concurrent.CancellationException -> L2a java.lang.Throwable -> L61
            java.lang.Object r12 = r12.F(r3, r0)     // Catch: java.util.concurrent.CancellationException -> L2a java.lang.Throwable -> L61
            g84 r0 = defpackage.g84.a
            if (r12 != r0) goto L57
            return r0
        L57:
            r1 = r11
        L58:
            cr2 r12 = (defpackage.cr2) r12     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L2a
            java.lang.String r0 = "@"
            java.util.List r12 = f(r1, r12, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L2a
            return r12
        L61:
            r0 = move-exception
            r12 = r0
            r1 = r11
        L64:
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "getAllContacts fail!"
            defpackage.wqi.p(r0, r1, r12)
            hd5 r12 = defpackage.hd5.a
            return r12
        L74:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z95.a(q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.util.LinkedHashSet r5, defpackage.q44 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.opf
            if (r0 == 0) goto L13
            r0 = r6
            opf r0 = (defpackage.opf) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            opf r0 = new opf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            z95 r5 = r0.d
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L51
        L27:
            r6 = move-exception
            goto L83
        L29:
            r5 = move-exception
            goto L93
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.g8j.b(r6)
            java.lang.Object r6 = r4.b     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L80
            hwa r6 = (defpackage.hwa) r6     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L80
            fh2 r1 = new fh2     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L7d
            long[] r5 = defpackage.ue3.e0(r5)     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L7d
            r1.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L7d
            r0.d = r4     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L7d
            r0.Y = r2     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L7d
            java.lang.Object r6 = r6.F(r1, r0)     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L7d
            g84 r5 = defpackage.g84.a
            if (r6 != r5) goto L50
            return r5
        L50:
            r5 = r4
        L51:
            jx3 r6 = (defpackage.jx3) r6     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.util.List r6 = r6.e()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r1 = 10
            int r1 = defpackage.we3.q(r6, r1)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
        L68:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            gx3 r1 = (defpackage.gx3) r1     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            gpf r1 = g(r5, r1)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.add(r1)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L68
        L7c:
            return r0
        L7d:
            r6 = move-exception
        L7e:
            r5 = r4
            goto L83
        L80:
            r5 = move-exception
            r6 = r5
            goto L7e
        L83:
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "getContactsByIds fail!"
            defpackage.wqi.p(r5, r0, r6)
            hd5 r5 = defpackage.hd5.a
            return r5
        L93:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z95.b(java.util.LinkedHashSet, q44):java.lang.Object");
    }

    @Override // defpackage.bz9
    public int c() throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.position(0);
        m(4);
        return byteBuffer.getInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r13, defpackage.q44 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.ppf
            if (r0 == 0) goto L13
            r0 = r14
            ppf r0 = (defpackage.ppf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ppf r0 = new ppf
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.X
            g84 r1 = defpackage.g84.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.String r13 = r0.o
            z95 r1 = r0.d
            defpackage.g8j.b(r14)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            goto L72
        L2b:
            r0 = move-exception
            r14 = r0
            goto L7c
        L2e:
            r0 = move-exception
            r13 = r0
            goto Lba
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            defpackage.g8j.b(r14)
            int r14 = r13.length()
            if (r14 <= r3) goto L52
            r14 = 0
            char r14 = r13.charAt(r14)
            r2 = 64
            if (r14 != r2) goto L52
            java.lang.String r14 = r13.substring(r3)
            r11 = r14
            goto L53
        L52:
            r11 = r13
        L53:
            fh2 r4 = new fh2
            long r5 = r12.a
            r8 = 0
            r10 = 100
            java.lang.String r7 = "MEMBER"
            r4.<init>(r5, r7, r8, r10, r11)
            java.lang.Object r14 = r12.b     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Throwable -> L79
            hwa r14 = (defpackage.hwa) r14     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Throwable -> L79
            r0.d = r12     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Throwable -> L79
            r0.o = r13     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Throwable -> L79
            r0.Z = r3     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Throwable -> L79
            java.lang.Object r14 = r14.F(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Throwable -> L79
            if (r14 != r1) goto L71
            return r1
        L71:
            r1 = r12
        L72:
            cr2 r14 = (defpackage.cr2) r14     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            java.util.List r13 = f(r1, r14, r13)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            return r13
        L79:
            r0 = move-exception
            r14 = r0
            r1 = r12
        L7c:
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            l6b r1 = defpackage.wqi.a
            if (r1 != 0) goto L89
            goto Lb7
        L89:
            lg8 r2 = defpackage.lg8.X
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto Lb7
            boolean r3 = defpackage.wqi.a()
            r4 = 0
            if (r3 == 0) goto L99
            goto L9a
        L99:
            r13 = r4
        L9a:
            java.lang.String r14 = defpackage.saj.d(r14)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "getFilteredContacts for query=`"
            r3.<init>(r5)
            r3.append(r13)
            java.lang.String r13 = "` fail!\n"
            r3.append(r13)
            r3.append(r14)
            java.lang.String r13 = r3.toString()
            r1.c(r2, r0, r13, r4)
        Lb7:
            hd5 r13 = defpackage.hd5.a
            return r13
        Lba:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z95.d(java.lang.String, q44):java.lang.Object");
    }

    public void e(long j) {
        ey2 ey2Var = (ey2) this.d;
        if (this.a != j) {
            this.a = j;
            ey2Var.b = SystemClock.elapsedRealtime();
            ((ia5) this.b).a(((dq0) this.c).a(j, ey2Var.b));
        }
    }

    @Override // defpackage.aa7
    public long getContentLength() {
        return this.a;
    }

    @Override // defpackage.aa7
    public String getContentType() {
        return (String) this.d;
    }

    @Override // defpackage.bz9
    public long getPosition() {
        return this.a;
    }

    @Override // defpackage.bz9
    public long h() throws IOException {
        ((ByteBuffer) this.c).position(0);
        m(4);
        return r0.getInt() & 4294967295L;
    }

    public void j(iz9 iz9Var, int i) {
        z5j.a("Invalid metering mode " + i, i >= 1 && i <= 7);
        if ((i & 1) != 0) {
            ((ArrayList) this.b).add(iz9Var);
        }
        if ((i & 2) != 0) {
            ((ArrayList) this.c).add(iz9Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:9:0x0019, B:16:0x0023, B:20:0x002b), top: B:26:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(defpackage.aa r6, defpackage.mbd r7, java.util.ArrayList r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.d
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            qbd r1 = (defpackage.qbd) r1
            monitor-enter(r1)
            r3 = 1
            if (r9 == 0) goto L23
            m87 r4 = r1.f     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L1e
            r2 = r3
        L1e:
            if (r2 != 0) goto L23
            goto L29
        L21:
            r6 = move-exception
            goto L30
        L23:
            boolean r2 = r1.h(r6, r8)     // Catch: java.lang.Throwable -> L21
            if (r2 != 0) goto L2b
        L29:
            monitor-exit(r1)
            goto L8
        L2b:
            r7.b(r1)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)
            return r3
        L30:
            monitor-exit(r1)
            throw r6
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z95.k(aa, mbd, java.util.ArrayList, boolean):boolean");
    }

    public int l(qbd qbdVar, long j) {
        byte[] bArr = yxg.a;
        ArrayList arrayList = qbdVar.o;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + qbdVar.q.a.a + " was leaked. Did you forget to close a response body?";
                p2c p2cVar = p2c.a;
                p2c.a.j(((lbd) reference).a, str);
                arrayList.remove(i);
                qbdVar.i = true;
                if (arrayList.isEmpty()) {
                    qbdVar.p = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public void m(int i) throws IOException {
        if (((FileInputStream) this.d).read((byte[]) this.b, 0, i) != i) {
            throw new IOException("read failed");
        }
        this.a += i;
    }

    @Override // defpackage.bz9
    public int readUnsignedShort() throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.position(0);
        m(2);
        return byteBuffer.getShort() & 65535;
    }

    @Override // defpackage.bz9
    public void v(int i) {
        while (i > 0) {
            int iSkip = (int) ((FileInputStream) this.d).skip(i);
            if (iSkip < 1) {
                throw new IOException("Skip didn't move at least 1 byte forward");
            }
            i -= iSkip;
            this.a += iSkip;
        }
    }

    @Override // defpackage.aa7
    public void writeTo(OutputStream outputStream) throws IOException {
        String str = (String) this.b;
        for (z97 z97Var : (List) this.c) {
            outputStream.write(x97.b);
            x97.c(outputStream, str);
            byte[] bArr = x97.a;
            outputStream.write(bArr);
            x97.c(outputStream, z97Var.b);
            outputStream.write(bArr);
            z97Var.a.writeTo(outputStream);
            outputStream.write(bArr);
        }
        byte[] bArr2 = x97.b;
        outputStream.write(bArr2);
        x97.c(outputStream, str);
        outputStream.write(bArr2);
    }

    public z95(ree reeVar, rw rwVar) {
        this.b = reeVar;
        this.c = rwVar;
        int iF = reeVar.f();
        if (iF <= 64) {
            this.a = iF != 64 ? (-1) << iF : 0L;
            this.d = o;
            return;
        }
        this.a = 0L;
        int i = (iF - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iF & 63) != 0) {
            jArr[i - 1] = (-1) << iF;
        }
        this.d = jArr;
    }

    public z95(long j, hwa hwaVar, ssb ssbVar, k18 k18Var) {
        this.a = j;
        this.b = hwaVar;
        this.c = ssbVar;
        this.d = k18Var;
    }

    public z95(b3g b3gVar) {
        this.a = TimeUnit.MINUTES.toNanos(5L);
        this.b = b3gVar.e();
        this.c = new k87(1, this, ho7.l(new StringBuilder(), yxg.g, " ConnectionPool"));
        this.d = new ConcurrentLinkedQueue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z95(java.lang.String r13, java.util.List r14) {
        /*
            r12 = this;
            r12.<init>()
            r12.b = r13
            r12.c = r14
            java.lang.String r0 = "multipart/form-data; boundary="
            java.lang.String r13 = r0.concat(r13)
            r12.d = r13
            boolean r13 = r14.isEmpty()
            r0 = -1
            r2 = 0
            if (r13 == 0) goto L1a
            goto L35
        L1a:
            java.util.Iterator r13 = r14.iterator()
        L1e:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L35
            java.lang.Object r14 = r13.next()
            z97 r14 = (defpackage.z97) r14
            aa7 r14 = r14.a
            long r4 = r14.getContentLength()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 >= 0) goto L1e
            goto L90
        L35:
            java.lang.Object r13 = r12.c
            java.util.List r13 = (java.util.List) r13
            byte[] r14 = defpackage.x97.b
            int r14 = r14.length
            long r4 = (long) r14
            java.lang.Object r14 = r12.b
            java.lang.String r14 = (java.lang.String) r14
            int r14 = defpackage.x97.b(r14)
            long r6 = (long) r14
            long r4 = r4 + r6
            byte[] r14 = defpackage.x97.a
            int r14 = r14.length
            long r6 = (long) r14
            long r4 = r4 + r6
            java.util.Iterator r13 = r13.iterator()
        L50:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L8f
            java.lang.Object r14 = r13.next()
            z97 r14 = (defpackage.z97) r14
            byte[] r6 = defpackage.x97.b
            int r6 = r6.length
            long r6 = (long) r6
            long r4 = r4 + r6
            java.lang.Object r6 = r12.b
            java.lang.String r6 = (java.lang.String) r6
            int r6 = defpackage.x97.b(r6)
            long r6 = (long) r6
            long r4 = r4 + r6
            byte[] r6 = defpackage.x97.a
            int r7 = r6.length
            long r7 = (long) r7
            long r4 = r4 + r7
            aa7 r7 = r14.a
            long r8 = r7.getContentLength()
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 >= 0) goto L7c
            r10 = r0
            goto L8d
        L7c:
            java.lang.String r14 = r14.b
            int r14 = defpackage.x97.b(r14)
            int r8 = r6.length
            int r14 = r14 + r8
            long r8 = (long) r14
            long r10 = r7.getContentLength()
            long r10 = r10 + r8
            int r14 = r6.length
            long r6 = (long) r14
            long r10 = r10 + r6
        L8d:
            long r4 = r4 + r10
            goto L50
        L8f:
            r0 = r4
        L90:
            r12.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z95.<init>(java.lang.String, java.util.List):void");
    }

    public z95(long j, ehg ehgVar) {
        this.a = j;
        this.b = ehgVar;
        String str = zxg.a;
        this.c = Executors.newSingleThreadScheduledExecutor(new nn3(3, "WatchdogTimer"));
    }

    public z95(z95 z95Var) {
        this.b = Collections.unmodifiableList((ArrayList) z95Var.b);
        this.c = Collections.unmodifiableList((ArrayList) z95Var.c);
        this.d = Collections.unmodifiableList((ArrayList) z95Var.d);
        this.a = z95Var.a;
    }

    public z95(iz9 iz9Var) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        j(iz9Var, 1);
    }

    public z95(FileInputStream fileInputStream) {
        this.a = 0L;
        this.d = fileInputStream;
        byte[] bArr = new byte[4];
        this.b = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.c = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
    }
}
