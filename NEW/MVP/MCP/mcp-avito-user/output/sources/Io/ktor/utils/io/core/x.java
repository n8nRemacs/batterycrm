package io.ktor.utils.io.core;

import androidx.compose.foundation.text.selection.C21030p;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Input.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/core/x;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes8.dex */
public abstract class x implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.ktor.utils.io.pool.h<io.ktor.utils.io.core.internal.b> f400907b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public io.ktor.utils.io.core.internal.b f400908c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public ByteBuffer f400909d;

    /* renamed from: e, reason: collision with root package name */
    public int f400910e;

    /* renamed from: f, reason: collision with root package name */
    public int f400911f;

    /* renamed from: g, reason: collision with root package name */
    public long f400912g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f400913h;

    /* compiled from: Input.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/core/x$a;", "", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public x() {
        this(null, 0L, null, 7, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x033b, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x033f, code lost:
    
        r7.c(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0342, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0353, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0354, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0125, code lost:
    
        throw new java.lang.IllegalStateException("Buffer's limit change is not allowed");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String y(io.ktor.utils.io.core.x r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.core.x.y(io.ktor.utils.io.core.x):java.lang.String");
    }

    @Y61.k
    public final void A(@Y61.k io.ktor.utils.io.core.internal.b bVar) {
        io.ktor.utils.io.core.internal.b bVarG = bVar.g();
        if (bVarG == null) {
            io.ktor.utils.io.core.internal.b.f400881j.getClass();
            bVarG = io.ktor.utils.io.core.internal.b.f400886o;
        }
        D(bVarG);
        B(this.f400912g - (bVarG.f400876c - bVarG.f400875b));
        bVar.k(this.f400907b);
    }

    public final void B(long j12) {
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "tailRemaining shouldn't be negative: ").toString());
        }
        this.f400912g = j12;
    }

    public final void D(io.ktor.utils.io.core.internal.b bVar) {
        this.f400908c = bVar;
        this.f400909d = bVar.f400874a;
        this.f400910e = bVar.f400875b;
        this.f400911f = bVar.f400876c;
    }

    @Y61.l
    public final io.ktor.utils.io.core.internal.b F() {
        io.ktor.utils.io.core.internal.b bVarN = n();
        io.ktor.utils.io.core.internal.b bVarI = bVarN.i();
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
        io.ktor.utils.io.core.internal.b bVar = io.ktor.utils.io.core.internal.b.f400886o;
        if (bVarN == bVar) {
            return null;
        }
        if (bVarI == null) {
            D(bVar);
            B(0L);
        } else {
            D(bVarI);
            B(this.f400912g - (bVarI.f400876c - bVarI.f400875b));
        }
        bVarN.g();
        return bVarN;
    }

    public final boolean a() {
        return (this.f400910e == this.f400911f && this.f400912g == 0) ? false : true;
    }

    public abstract void b();

    public final int c(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "Negative discard is not allowed: ").toString());
        }
        int i13 = 0;
        while (i12 != 0) {
            io.ktor.utils.io.core.internal.b bVarQ = q(1);
            if (bVarQ == null) {
                break;
            }
            int iMin = Math.min(bVarQ.f400876c - bVarQ.f400875b, i12);
            bVarQ.c(iMin);
            this.f400910e += iMin;
            if (bVarQ.f400876c - bVarQ.f400875b == 0) {
                A(bVarQ);
            }
            i12 -= iMin;
            i13 += iMin;
        }
        return i13;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z();
        if (!this.f400913h) {
            this.f400913h = true;
        }
        b();
    }

    public final long d(long j12) {
        io.ktor.utils.io.core.internal.b bVarQ;
        if (j12 <= 0) {
            return 0L;
        }
        long j13 = 0;
        while (j12 != 0 && (bVarQ = q(1)) != null) {
            int iMin = (int) Math.min(bVarQ.f400876c - bVarQ.f400875b, j12);
            bVarQ.c(iMin);
            this.f400910e += iMin;
            if (bVarQ.f400876c - bVarQ.f400875b == 0) {
                A(bVarQ);
            }
            long j14 = iMin;
            j12 -= j14;
            j13 += j14;
        }
        return j13;
    }

    public final void f(int i12) throws EOFException {
        if (c(i12) != i12) {
            throw new EOFException(androidx.camera.camera2.internal.G.e(i12, "Unable to discard ", " bytes due to end of packet"));
        }
    }

    public final io.ktor.utils.io.core.internal.b g() {
        if (this.f400913h) {
            return null;
        }
        io.ktor.utils.io.core.internal.b bVarI = i();
        if (bVarI == null) {
            this.f400913h = true;
            return null;
        }
        io.ktor.utils.io.core.internal.b bVar = this.f400908c;
        while (true) {
            io.ktor.utils.io.core.internal.b bVarI2 = bVar.i();
            if (bVarI2 == null) {
                break;
            }
            bVar = bVarI2;
        }
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
        if (bVar == io.ktor.utils.io.core.internal.b.f400886o) {
            D(bVarI);
            if (this.f400912g != 0) {
                throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
            }
            io.ktor.utils.io.core.internal.b bVarI3 = bVarI.i();
            B(bVarI3 != null ? C41636i.a(bVarI3) : 0L);
        } else {
            bVar.m(bVarI);
            B(C41636i.a(bVarI) + this.f400912g);
        }
        return bVarI;
    }

    @Y61.l
    @X
    public final io.ktor.utils.io.core.internal.b h(@Y61.k io.ktor.utils.io.core.internal.b bVar) {
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
        io.ktor.utils.io.core.internal.b bVar2 = io.ktor.utils.io.core.internal.b.f400886o;
        while (bVar != bVar2) {
            io.ktor.utils.io.core.internal.b bVarG = bVar.g();
            bVar.k(this.f400907b);
            if (bVarG == null) {
                D(bVar2);
                B(0L);
                bVar = bVar2;
            } else {
                if (bVarG.f400876c > bVarG.f400875b) {
                    D(bVarG);
                    B(this.f400912g - (bVarG.f400876c - bVarG.f400875b));
                    return bVarG;
                }
                bVar = bVarG;
            }
        }
        return g();
    }

    @Y61.l
    public io.ktor.utils.io.core.internal.b i() {
        io.ktor.utils.io.pool.h<io.ktor.utils.io.core.internal.b> hVar = this.f400907b;
        io.ktor.utils.io.core.internal.b bVarS2 = hVar.S2();
        try {
            bVarS2.e();
            ByteBuffer byteBuffer = bVarS2.f400874a;
            int i12 = bVarS2.f400876c;
            int iJ2 = j(byteBuffer, i12, bVarS2.f400878e - i12);
            if (iJ2 == 0) {
                this.f400913h = true;
                if (bVarS2.f400876c <= bVarS2.f400875b) {
                    bVarS2.k(hVar);
                    return null;
                }
            }
            bVarS2.a(iJ2);
            return bVarS2;
        } catch (Throwable th2) {
            bVarS2.k(hVar);
            throw th2;
        }
    }

    public abstract int j(@Y61.k ByteBuffer byteBuffer, int i12, int i13);

    public final void k(io.ktor.utils.io.core.internal.b bVar) {
        if (this.f400913h && bVar.i() == null) {
            this.f400910e = bVar.f400875b;
            this.f400911f = bVar.f400876c;
            B(0L);
            return;
        }
        int i12 = bVar.f400876c - bVar.f400875b;
        int iMin = Math.min(i12, 8 - (bVar.f400879f - bVar.f400878e));
        io.ktor.utils.io.pool.h<io.ktor.utils.io.core.internal.b> hVar = this.f400907b;
        if (i12 > iMin) {
            io.ktor.utils.io.core.internal.b bVarS2 = hVar.S2();
            io.ktor.utils.io.core.internal.b bVarS22 = hVar.S2();
            bVarS2.e();
            bVarS22.e();
            bVarS2.m(bVarS22);
            bVarS22.m(bVar.g());
            C41629b.a(bVarS2, bVar, i12 - iMin);
            C41629b.a(bVarS22, bVar, iMin);
            D(bVarS2);
            B(C41636i.a(bVarS22));
        } else {
            io.ktor.utils.io.core.internal.b bVarS23 = hVar.S2();
            bVarS23.e();
            bVarS23.m(bVar.g());
            C41629b.a(bVarS23, bVar, i12);
            D(bVarS23);
        }
        bVar.k(hVar);
    }

    public final boolean m() {
        return this.f400911f - this.f400910e == 0 && this.f400912g == 0 && (this.f400913h || g() == null);
    }

    @Y61.k
    public final io.ktor.utils.io.core.internal.b n() {
        io.ktor.utils.io.core.internal.b bVar = this.f400908c;
        int i12 = this.f400910e;
        if (i12 < 0 || i12 > bVar.f400876c) {
            int i13 = bVar.f400875b;
            C41632e.b(i12 - i13, bVar.f400876c - i13);
            throw null;
        }
        if (bVar.f400875b != i12) {
            bVar.f400875b = i12;
        }
        return bVar;
    }

    public final long o() {
        return (this.f400911f - this.f400910e) + this.f400912g;
    }

    public final boolean p(int i12) {
        return ((long) (this.f400911f - this.f400910e)) + this.f400912g >= ((long) i12);
    }

    @Y61.l
    @X
    public final io.ktor.utils.io.core.internal.b q(int i12) {
        io.ktor.utils.io.core.internal.b bVarN = n();
        return this.f400911f - this.f400910e >= i12 ? bVarN : x(i12, bVarN);
    }

    public final byte readByte() throws EOFException {
        int i12 = this.f400910e;
        int i13 = i12 + 1;
        int i14 = this.f400911f;
        if (i13 < i14) {
            this.f400910e = i13;
            return this.f400909d.get(i12);
        }
        if (i12 >= i14) {
            io.ktor.utils.io.core.internal.b bVarQ = q(1);
            if (bVarQ == null) {
                S.a(1);
                throw null;
            }
            int i15 = bVarQ.f400875b;
            if (i15 == bVarQ.f400876c) {
                throw new EOFException("No readable bytes available.");
            }
            bVarQ.f400875b = i15 + 1;
            byte b12 = bVarQ.f400874a.get(i15);
            io.ktor.utils.io.core.internal.i.a(this, bVarQ);
            return b12;
        }
        byte b13 = this.f400909d.get(i12);
        this.f400910e = i12;
        io.ktor.utils.io.core.internal.b bVar = this.f400908c;
        if (i12 < 0 || i12 > bVar.f400876c) {
            int i16 = bVar.f400875b;
            C41632e.b(i12 - i16, bVar.f400876c - i16);
            throw null;
        }
        if (bVar.f400875b != i12) {
            bVar.f400875b = i12;
        }
        h(bVar);
        return b13;
    }

    @Y61.l
    public final io.ktor.utils.io.core.internal.b u(int i12) {
        return x(i12, n());
    }

    public final io.ktor.utils.io.core.internal.b x(int i12, io.ktor.utils.io.core.internal.b bVar) {
        while (true) {
            int i13 = this.f400911f - this.f400910e;
            if (i13 >= i12) {
                return bVar;
            }
            io.ktor.utils.io.core.internal.b bVarI = bVar.i();
            if (bVarI == null && (bVarI = g()) == null) {
                return null;
            }
            if (i13 == 0) {
                io.ktor.utils.io.core.internal.b.f400881j.getClass();
                if (bVar != io.ktor.utils.io.core.internal.b.f400886o) {
                    A(bVar);
                }
                bVar = bVarI;
            } else {
                int iA2 = C41629b.a(bVar, bVarI, i12 - i13);
                this.f400911f = bVar.f400876c;
                B(this.f400912g - iA2);
                int i14 = bVarI.f400876c;
                int i15 = bVarI.f400875b;
                if (i14 <= i15) {
                    bVar.g();
                    bVar.m(bVarI.g());
                    bVarI.k(this.f400907b);
                } else {
                    if (iA2 < 0) {
                        throw new IllegalArgumentException(AK.c.g(iA2, "startGap shouldn't be negative: ").toString());
                    }
                    if (i15 >= iA2) {
                        bVarI.f400877d = iA2;
                    } else {
                        if (i15 != i14) {
                            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(iA2, "Unable to reserve ", " start gap: there are already ");
                            sbJ.append(bVarI.f400876c - bVarI.f400875b);
                            sbJ.append(" content bytes starting at offset ");
                            sbJ.append(bVarI.f400875b);
                            throw new IllegalStateException(sbJ.toString());
                        }
                        if (iA2 > bVarI.f400878e) {
                            int i16 = bVarI.f400879f;
                            if (iA2 > i16) {
                                throw new IllegalArgumentException(androidx.compose.foundation.H.j(iA2, i16, "Start gap ", " is bigger than the capacity "));
                            }
                            StringBuilder sbJ2 = androidx.camera.camera2.internal.G.j(iA2, "Unable to reserve ", " start gap: there are already ");
                            sbJ2.append(i16 - bVarI.f400878e);
                            sbJ2.append(" bytes reserved in the end");
                            throw new IllegalStateException(sbJ2.toString());
                        }
                        bVarI.f400876c = iA2;
                        bVarI.f400875b = iA2;
                        bVarI.f400877d = iA2;
                    }
                }
                if (bVar.f400876c - bVar.f400875b >= i12) {
                    return bVar;
                }
                if (i12 > 8) {
                    throw new IllegalStateException(androidx.camera.camera2.internal.G.e(i12, "minSize of ", " is too big (should be less than 8)"));
                }
            }
        }
    }

    public final void z() {
        io.ktor.utils.io.core.internal.b bVarN = n();
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
        io.ktor.utils.io.core.internal.b bVar = io.ktor.utils.io.core.internal.b.f400886o;
        if (bVarN != bVar) {
            D(bVar);
            B(0L);
            while (bVarN != null) {
                io.ktor.utils.io.core.internal.b bVarG = bVarN.g();
                bVarN.k(this.f400907b);
                bVarN = bVarG;
            }
        }
    }

    public x(@Y61.k io.ktor.utils.io.core.internal.b bVar, long j12, @Y61.k io.ktor.utils.io.pool.h<io.ktor.utils.io.core.internal.b> hVar) {
        this.f400907b = hVar;
        this.f400908c = bVar;
        this.f400909d = bVar.f400874a;
        this.f400910e = bVar.f400875b;
        this.f400911f = bVar.f400876c;
        this.f400912g = j12 - (r3 - r6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(io.ktor.utils.io.core.internal.b bVar, long j12, io.ktor.utils.io.pool.h hVar, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            io.ktor.utils.io.core.internal.b.f400881j.getClass();
            bVar = io.ktor.utils.io.core.internal.b.f400886o;
        }
        j12 = (i12 & 2) != 0 ? C41636i.a(bVar) : j12;
        if ((i12 & 4) != 0) {
            io.ktor.utils.io.core.internal.b.f400881j.getClass();
            hVar = io.ktor.utils.io.core.internal.b.f400884m;
        }
        this(bVar, j12, hVar);
    }
}
