package com.yandex.mobile.ads.impl;

import com.avito.android.remote.model.AdvertStatus;
import com.yandex.mobile.ads.impl.xz;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.Http2;
import okio.C44802l;
import okio.InterfaceC44803m;

/* loaded from: classes8.dex */
public final class c10 implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f384149g = Logger.getLogger(t00.class.getName());

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final InterfaceC44803m f384150a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f384151b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final C44802l f384152c;

    /* renamed from: d, reason: collision with root package name */
    private int f384153d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f384154e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final xz.b f384155f;

    public c10(@Y61.k InterfaceC44803m interfaceC44803m, boolean z12) {
        this.f384150a = interfaceC44803m;
        this.f384151b = z12;
        C44802l c44802l = new C44802l();
        this.f384152c = c44802l;
        this.f384153d = Http2.INITIAL_MAX_FRAME_SIZE;
        this.f384155f = new xz.b(c44802l);
    }

    public final synchronized void a() {
        try {
            if (this.f384154e) {
                throw new IOException(AdvertStatus.CLOSED);
            }
            if (this.f384151b) {
                Logger logger = f384149g;
                if (logger.isLoggable(Level.FINE)) {
                    StringBuilder sbA = Cif.a(">> CONNECTION ");
                    sbA.append(t00.f390047b.e());
                    logger.fine(qc1.a(sbA.toString(), new Object[0]));
                }
                this.f384150a.B1(t00.f390047b);
                this.f384150a.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final int b() {
        return this.f384153d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f384154e = true;
        this.f384150a.close();
    }

    public final synchronized void flush() {
        if (this.f384154e) {
            throw new IOException(AdvertStatus.CLOSED);
        }
        this.f384150a.flush();
    }

    public final synchronized void b(@Y61.k m31 m31Var) {
        try {
            if (this.f384154e) {
                throw new IOException(AdvertStatus.CLOSED);
            }
            int i12 = 0;
            a(0, m31Var.d() * 6, 4, 0);
            while (i12 < 10) {
                if (m31Var.c(i12)) {
                    this.f384150a.writeShort(i12 != 4 ? i12 != 7 ? i12 : 4 : 3);
                    this.f384150a.writeInt(m31Var.a(i12));
                }
                i12++;
            }
            this.f384150a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(@Y61.k m31 m31Var) {
        try {
            if (!this.f384154e) {
                this.f384153d = m31Var.b(this.f384153d);
                if (m31Var.a() != -1) {
                    this.f384155f.b(m31Var.a());
                }
                a(0, 0, 4, 1);
                this.f384150a.flush();
            } else {
                throw new IOException(AdvertStatus.CLOSED);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(int i12, @Y61.k xs xsVar) {
        if (!this.f384154e) {
            if (xsVar.a() != -1) {
                a(i12, 4, 3, 0);
                this.f384150a.writeInt(xsVar.a());
                this.f384150a.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            throw new IOException(AdvertStatus.CLOSED);
        }
    }

    public final synchronized void a(boolean z12, int i12, @Y61.l C44802l c44802l, int i13) {
        if (!this.f384154e) {
            a(i12, i13, 0, z12 ? 1 : 0);
            if (i13 > 0) {
                this.f384150a.write(c44802l, i13);
            }
        } else {
            throw new IOException(AdvertStatus.CLOSED);
        }
    }

    public final synchronized void a(int i12, int i13, boolean z12) {
        if (!this.f384154e) {
            a(0, 8, 6, z12 ? 1 : 0);
            this.f384150a.writeInt(i12);
            this.f384150a.writeInt(i13);
            this.f384150a.flush();
        } else {
            throw new IOException(AdvertStatus.CLOSED);
        }
    }

    public final synchronized void a(int i12, @Y61.k xs xsVar, @Y61.k byte[] bArr) {
        if (!this.f384154e) {
            if (xsVar.a() != -1) {
                a(0, bArr.length + 8, 7, 0);
                this.f384150a.writeInt(i12);
                this.f384150a.writeInt(xsVar.a());
                if (bArr.length != 0) {
                    this.f384150a.write(bArr);
                }
                this.f384150a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
        } else {
            throw new IOException(AdvertStatus.CLOSED);
        }
    }

    public final synchronized void a(int i12, long j12) {
        if (this.f384154e) {
            throw new IOException(AdvertStatus.CLOSED);
        }
        if (j12 != 0 && j12 <= 2147483647L) {
            a(i12, 4, 8, 0);
            this.f384150a.writeInt((int) j12);
            this.f384150a.flush();
        } else {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j12).toString());
        }
    }

    public final void a(int i12, int i13, int i14, int i15) {
        Logger logger = f384149g;
        if (logger.isLoggable(Level.FINE)) {
            t00.f390046a.getClass();
            logger.fine(t00.a(false, i12, i13, i14, i15));
        }
        if (i13 > this.f384153d) {
            StringBuilder sbA = Cif.a("FRAME_SIZE_ERROR length > ");
            sbA.append(this.f384153d);
            sbA.append(": ");
            sbA.append(i13);
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        if ((Integer.MIN_VALUE & i12) == 0) {
            qc1.a(this.f384150a, i13);
            this.f384150a.writeByte(i14 & 255);
            this.f384150a.writeByte(i15 & 255);
            this.f384150a.writeInt(i12 & Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException(ba.a("reserved bit set: ", i12).toString());
    }

    public final synchronized void a(int i12, @Y61.k ArrayList arrayList, boolean z12) {
        if (!this.f384154e) {
            this.f384155f.a(arrayList);
            long j12 = this.f384152c.f420125c;
            long jMin = Math.min(this.f384153d, j12);
            int i13 = j12 == jMin ? 4 : 0;
            if (z12) {
                i13 |= 1;
            }
            a(i12, (int) jMin, 1, i13);
            this.f384150a.write(this.f384152c, jMin);
            if (j12 > jMin) {
                long j13 = j12 - jMin;
                while (j13 > 0) {
                    long jMin2 = Math.min(this.f384153d, j13);
                    j13 -= jMin2;
                    a(i12, (int) jMin2, 9, j13 == 0 ? 4 : 0);
                    this.f384150a.write(this.f384152c, jMin2);
                }
            }
        } else {
            throw new IOException(AdvertStatus.CLOSED);
        }
    }
}
