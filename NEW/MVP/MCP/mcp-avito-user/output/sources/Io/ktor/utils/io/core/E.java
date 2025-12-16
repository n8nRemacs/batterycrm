package io.ktor.utils.io.core;

import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.C0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import okhttp3.internal.http2.Settings;

/* compiled from: Output.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00060\u0001j\u0002`\u00022\u00060\u0003j\u0002`\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/core/E;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes8.dex */
public abstract class E implements Appendable, Closeable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.ktor.utils.io.pool.h<io.ktor.utils.io.core.internal.b> f400862b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public io.ktor.utils.io.core.internal.b f400863c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public io.ktor.utils.io.core.internal.b f400864d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public ByteBuffer f400865e;

    /* renamed from: f, reason: collision with root package name */
    public int f400866f;

    /* renamed from: g, reason: collision with root package name */
    public int f400867g;

    /* renamed from: h, reason: collision with root package name */
    public int f400868h;

    /* renamed from: i, reason: collision with root package name */
    public int f400869i;

    public E(@Y61.k io.ktor.utils.io.pool.h<io.ktor.utils.io.core.internal.b> hVar) {
        this.f400862b = hVar;
        V31.e.f16906b.getClass();
        this.f400865e = V31.e.f16907c;
    }

    @X
    public final void a() {
        io.ktor.utils.io.core.internal.b bVar = this.f400864d;
        if (bVar != null) {
            this.f400866f = bVar.f400876c;
        }
    }

    @Override // java.lang.Appendable
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public E append(char c12) {
        int i12 = this.f400866f;
        int i13 = 4;
        if (this.f400867g - i12 >= 3) {
            ByteBuffer byteBuffer = this.f400865e;
            if (c12 >= 0 && c12 < 128) {
                byteBuffer.put(i12, (byte) c12);
                i13 = 1;
            } else if (128 <= c12 && c12 < 2048) {
                byteBuffer.put(i12, (byte) (((c12 >> 6) & 31) | 192));
                byteBuffer.put(i12 + 1, (byte) ((c12 & '?') | 128));
                i13 = 2;
            } else if (2048 <= c12 && c12 < 0) {
                byteBuffer.put(i12, (byte) (((c12 >> '\f') & 15) | 224));
                byteBuffer.put(i12 + 1, (byte) (((c12 >> 6) & 63) | 128));
                byteBuffer.put(i12 + 2, (byte) ((c12 & '?') | 128));
                i13 = 3;
            } else {
                if (0 > c12 || c12 >= 0) {
                    io.ktor.utils.io.core.internal.h.c(c12);
                    throw null;
                }
                byteBuffer.put(i12, (byte) (((c12 >> 18) & 7) | 240));
                byteBuffer.put(i12 + 1, (byte) (((c12 >> '\f') & 63) | 128));
                byteBuffer.put(i12 + 2, (byte) (((c12 >> 6) & 63) | 128));
                byteBuffer.put(i12 + 3, (byte) ((c12 & '?') | 128));
            }
            this.f400866f = i12 + i13;
            return this;
        }
        io.ktor.utils.io.core.internal.b bVarM = m(3);
        try {
            ByteBuffer byteBuffer2 = bVarM.f400874a;
            int i14 = bVarM.f400876c;
            if (c12 >= 0 && c12 < 128) {
                byteBuffer2.put(i14, (byte) c12);
                i13 = 1;
            } else if (128 <= c12 && c12 < 2048) {
                byteBuffer2.put(i14, (byte) (((c12 >> 6) & 31) | 192));
                byteBuffer2.put(i14 + 1, (byte) ((c12 & '?') | 128));
                i13 = 2;
            } else if (2048 <= c12 && c12 < 0) {
                byteBuffer2.put(i14, (byte) (((c12 >> '\f') & 15) | 224));
                byteBuffer2.put(i14 + 1, (byte) (((c12 >> 6) & 63) | 128));
                byteBuffer2.put(i14 + 2, (byte) ((c12 & '?') | 128));
                i13 = 3;
            } else {
                if (0 > c12 || c12 >= 0) {
                    io.ktor.utils.io.core.internal.h.c(c12);
                    throw null;
                }
                byteBuffer2.put(i14, (byte) (((c12 >> 18) & 7) | 240));
                byteBuffer2.put(i14 + 1, (byte) (((c12 >> '\f') & 63) | 128));
                byteBuffer2.put(i14 + 2, (byte) (((c12 >> 6) & 63) | 128));
                byteBuffer2.put(i14 + 3, (byte) ((c12 & '?') | 128));
            }
            bVarM.a(i13);
            if (i13 < 0) {
                throw new IllegalStateException("The returned value shouldn't be negative");
            }
            a();
            return this;
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }

    @Override // java.lang.Appendable
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public E append(int i12, int i13, @Y61.l CharSequence charSequence) {
        if (charSequence == null) {
            return append(i12, i13, "null");
        }
        C43047d c43047d = C43047d.f410588a;
        io.ktor.utils.io.core.internal.b bVarM = m(1);
        while (true) {
            try {
                int iB2 = io.ktor.utils.io.core.internal.h.b(bVarM.f400874a, charSequence, i12, i13, bVarM.f400876c, bVarM.f400878e);
                int i14 = C0.f406602c;
                int i15 = ((short) (iB2 >>> 16)) & 65535;
                i12 += i15;
                bVarM.a(((short) (iB2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) & 65535);
                int i16 = (i15 != 0 || i12 >= i13) ? i12 < i13 ? 1 : 0 : 8;
                if (i16 <= 0) {
                    return this;
                }
                bVarM = io.ktor.utils.io.core.internal.i.c(this, i16, bVarM);
            } finally {
                a();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            io.ktor.utils.io.pool.h<io.ktor.utils.io.core.internal.b> hVar = this.f400862b;
            io.ktor.utils.io.core.internal.b bVarN = n();
            if (bVarN != null) {
                io.ktor.utils.io.core.internal.b bVarI = bVarN;
                do {
                    try {
                        ByteBuffer byteBuffer = bVarI.f400874a;
                        int i12 = bVarI.f400875b;
                        j(byteBuffer, i12, bVarI.f400876c - i12);
                        bVarI = bVarI.i();
                    } catch (Throwable th2) {
                        while (bVarN != null) {
                            io.ktor.utils.io.core.internal.b bVarG = bVarN.g();
                            bVarN.k(hVar);
                            bVarN = bVarG;
                        }
                        throw th2;
                    }
                } while (bVarI != null);
                while (bVarN != null) {
                    io.ktor.utils.io.core.internal.b bVarG2 = bVarN.g();
                    bVarN.k(hVar);
                    bVarN = bVarG2;
                }
            }
        } finally {
            i();
        }
    }

    @Override // java.lang.Appendable
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public E append(@Y61.l CharSequence charSequence) {
        if (charSequence == null) {
            append(0, 4, "null");
        } else {
            append(0, charSequence.length(), charSequence);
        }
        return this;
    }

    public final void f(@Y61.k io.ktor.utils.io.core.internal.b bVar) {
        io.ktor.utils.io.core.internal.b bVar2 = bVar;
        while (true) {
            io.ktor.utils.io.core.internal.b bVarI = bVar2.i();
            if (bVarI == null) {
                break;
            } else {
                bVar2 = bVarI;
            }
        }
        long jA2 = C41636i.a(bVar) - (bVar2.f400876c - bVar2.f400875b);
        if (jA2 < 2147483647L) {
            g(bVar, bVar2, (int) jA2);
        } else {
            io.ktor.utils.io.core.internal.f.a(jA2, "total size increase");
            throw null;
        }
    }

    public final void g(io.ktor.utils.io.core.internal.b bVar, io.ktor.utils.io.core.internal.b bVar2, int i12) {
        io.ktor.utils.io.core.internal.b bVar3 = this.f400864d;
        if (bVar3 == null) {
            this.f400863c = bVar;
            this.f400869i = 0;
        } else {
            bVar3.m(bVar);
            int i13 = this.f400866f;
            bVar3.b(i13);
            this.f400869i = (i13 - this.f400868h) + this.f400869i;
        }
        this.f400864d = bVar2;
        this.f400869i += i12;
        this.f400865e = bVar2.f400874a;
        this.f400866f = bVar2.f400876c;
        this.f400868h = bVar2.f400875b;
        this.f400867g = bVar2.f400878e;
    }

    public final void h(@Y61.k io.ktor.utils.io.core.internal.b bVar) {
        if (bVar.i() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        g(bVar, bVar, 0);
    }

    public abstract void i();

    public abstract void j(@Y61.k ByteBuffer byteBuffer, int i12, int i13);

    public final int k() {
        return (this.f400866f - this.f400868h) + this.f400869i;
    }

    @X
    @Y61.k
    public final io.ktor.utils.io.core.internal.b m(int i12) {
        io.ktor.utils.io.core.internal.b bVar;
        int i13 = this.f400867g;
        int i14 = this.f400866f;
        if (i13 - i14 >= i12 && (bVar = this.f400864d) != null) {
            bVar.b(i14);
            return bVar;
        }
        io.ktor.utils.io.core.internal.b bVarS2 = this.f400862b.S2();
        bVarS2.e();
        h(bVarS2);
        return bVarS2;
    }

    @Y61.l
    public final io.ktor.utils.io.core.internal.b n() {
        io.ktor.utils.io.core.internal.b bVar = this.f400863c;
        if (bVar == null) {
            return null;
        }
        io.ktor.utils.io.core.internal.b bVar2 = this.f400864d;
        if (bVar2 != null) {
            bVar2.b(this.f400866f);
        }
        this.f400863c = null;
        this.f400864d = null;
        this.f400866f = 0;
        this.f400867g = 0;
        this.f400868h = 0;
        this.f400869i = 0;
        V31.e.f16906b.getClass();
        this.f400865e = V31.e.f16907c;
        return bVar;
    }

    public final void o(byte b12) throws InsufficientSpaceException {
        int i12 = this.f400866f;
        if (i12 < this.f400867g) {
            this.f400866f = i12 + 1;
            this.f400865e.put(i12, b12);
            return;
        }
        io.ktor.utils.io.core.internal.b bVarS2 = this.f400862b.S2();
        bVarS2.e();
        h(bVarS2);
        int i13 = bVarS2.f400876c;
        if (i13 == bVarS2.f400878e) {
            throw new InsufficientSpaceException("No free space in the buffer to write a byte");
        }
        bVarS2.f400874a.put(i13, b12);
        bVarS2.f400876c = i13 + 1;
        this.f400866f++;
    }

    public final void p(@Y61.k C41641n c41641n) {
        io.ktor.utils.io.core.internal.b bVarN = c41641n.n();
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
        io.ktor.utils.io.core.internal.b bVar = io.ktor.utils.io.core.internal.b.f400886o;
        if (bVarN == bVar) {
            bVarN = null;
        } else {
            c41641n.D(bVar);
            c41641n.B(0L);
        }
        if (bVarN == null) {
            c41641n.z();
            return;
        }
        io.ktor.utils.io.core.internal.b bVar2 = this.f400864d;
        if (bVar2 == null) {
            f(bVarN);
        } else {
            x(bVar2, bVarN, c41641n.f400907b);
        }
    }

    public final void q(@Y61.k C41641n c41641n, int i12) throws EOFException {
        while (i12 > 0) {
            int i13 = c41641n.f400911f - c41641n.f400910e;
            if (i13 > i12) {
                io.ktor.utils.io.core.internal.b bVarQ = c41641n.q(1);
                if (bVarQ == null) {
                    S.a(1);
                    throw null;
                }
                int i14 = bVarQ.f400875b;
                try {
                    G.a((C41640m) this, bVarQ, i12);
                    int i15 = bVarQ.f400875b;
                    if (i15 < i14) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (i15 == bVarQ.f400876c) {
                        c41641n.h(bVarQ);
                        return;
                    } else {
                        c41641n.f400910e = i15;
                        return;
                    }
                } catch (Throwable th2) {
                    int i16 = bVarQ.f400875b;
                    if (i16 < i14) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (i16 == bVarQ.f400876c) {
                        c41641n.h(bVarQ);
                    } else {
                        c41641n.f400910e = i16;
                    }
                    throw th2;
                }
            }
            i12 -= i13;
            io.ktor.utils.io.core.internal.b bVarF = c41641n.F();
            if (bVarF == null) {
                throw new EOFException("Unexpected end of packet");
            }
            h(bVarF);
        }
    }

    public final void u(@Y61.k C41641n c41641n, long j12) throws EOFException {
        while (j12 > 0) {
            long j13 = c41641n.f400911f - c41641n.f400910e;
            if (j13 > j12) {
                io.ktor.utils.io.core.internal.b bVarQ = c41641n.q(1);
                if (bVarQ == null) {
                    S.a(1);
                    throw null;
                }
                int i12 = bVarQ.f400875b;
                try {
                    G.a((C41640m) this, bVarQ, (int) j12);
                    int i13 = bVarQ.f400875b;
                    if (i13 < i12) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (i13 == bVarQ.f400876c) {
                        c41641n.h(bVarQ);
                        return;
                    } else {
                        c41641n.f400910e = i13;
                        return;
                    }
                } catch (Throwable th2) {
                    int i14 = bVarQ.f400875b;
                    if (i14 < i12) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (i14 == bVarQ.f400876c) {
                        c41641n.h(bVarQ);
                    } else {
                        c41641n.f400910e = i14;
                    }
                    throw th2;
                }
            }
            j12 -= j13;
            io.ktor.utils.io.core.internal.b bVarF = c41641n.F();
            if (bVarF == null) {
                throw new EOFException("Unexpected end of packet");
            }
            h(bVarF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(io.ktor.utils.io.core.internal.b r9, io.ktor.utils.io.core.internal.b r10, io.ktor.utils.io.pool.h<io.ktor.utils.io.core.internal.b> r11) {
        /*
            r8 = this;
            int r0 = r8.f400866f
            r9.b(r0)
            int r0 = r9.f400876c
            int r1 = r9.f400875b
            int r1 = r0 - r1
            int r2 = r10.f400876c
            int r3 = r10.f400875b
            int r2 = r2 - r3
            int r3 = io.ktor.utils.io.core.K.f400870a
            r4 = -1
            int r5 = r9.f400879f
            if (r2 >= r3) goto L20
            int r6 = r9.f400878e
            int r7 = r5 - r6
            int r6 = r6 - r0
            int r6 = r6 + r7
            if (r2 > r6) goto L20
            goto L21
        L20:
            r2 = r4
        L21:
            if (r1 >= r3) goto L2f
            int r0 = r10.f400877d
            if (r1 > r0) goto L2f
            int r0 = r10.getRefCount()
            r3 = 1
            if (r0 != r3) goto L2f
            goto L30
        L2f:
            r1 = r4
        L30:
            if (r2 != r4) goto L39
            if (r1 != r4) goto L39
            r8.f(r10)
            goto Lb6
        L39:
            if (r1 == r4) goto L9c
            if (r2 > r1) goto L3e
            goto L9c
        L3e:
            if (r2 == r4) goto L51
            if (r1 >= r2) goto L43
            goto L51
        L43:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "prep = "
            java.lang.String r11 = ", app = "
            java.lang.String r10 = androidx.compose.foundation.H.j(r1, r2, r10, r11)
            r9.<init>(r10)
            throw r9
        L51:
            int r11 = r9.f400876c
            int r0 = r9.f400875b
            int r11 = r11 - r0
            int r1 = r10.f400875b
            if (r1 < r11) goto L94
            int r1 = r1 - r11
            java.nio.ByteBuffer r2 = r9.f400874a
            java.nio.ByteBuffer r3 = r10.f400874a
            V31.e.b(r2, r3, r0, r11, r1)
            r9.c(r11)
            r10.d(r1)
            io.ktor.utils.io.core.internal.b r11 = r8.f400863c
            if (r11 == 0) goto L8c
            if (r11 != r9) goto L71
            r8.f400863c = r10
            goto L7c
        L71:
            io.ktor.utils.io.core.internal.b r0 = r11.i()
            if (r0 == r9) goto L79
            r11 = r0
            goto L71
        L79:
            r11.m(r10)
        L7c:
            io.ktor.utils.io.pool.h<io.ktor.utils.io.core.internal.b> r11 = r8.f400862b
            r9.k(r11)
        L81:
            io.ktor.utils.io.core.internal.b r9 = r10.i()
            if (r9 != 0) goto L8a
            r8.f400864d = r10
            goto Lb6
        L8a:
            r10 = r9
            goto L81
        L8c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "head should't be null since it is already handled in the fast-path"
            r9.<init>(r10)
            throw r9
        L94:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Not enough space in the beginning to prepend bytes"
            r9.<init>(r10)
            throw r9
        L9c:
            int r0 = r9.f400878e
            int r1 = r9.f400876c
            int r1 = r0 - r1
            int r5 = r5 - r0
            int r5 = r5 + r1
            io.ktor.utils.io.core.C41629b.a(r9, r10, r5)
            r8.a()
            io.ktor.utils.io.core.internal.b r9 = r10.g()
            if (r9 == 0) goto Lb3
            r8.f(r9)
        Lb3:
            r10.k(r11)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.core.E.x(io.ktor.utils.io.core.internal.b, io.ktor.utils.io.core.internal.b, io.ktor.utils.io.pool.h):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E() {
        this(io.ktor.utils.io.core.internal.b.f400884m);
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
    }
}
