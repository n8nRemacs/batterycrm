package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.xz;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.C44802l;
import okio.C44805o;
import okio.InterfaceC44804n;

/* loaded from: classes8.dex */
public final class a10 implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private static final Logger f383371e = Logger.getLogger(t00.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f383372f = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final InterfaceC44804n f383373a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f383374b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final b f383375c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final xz.a f383376d;

    public static final class a {
        @Y61.k
        public static Logger a() {
            return a10.f383371e;
        }

        public static int a(int i12, int i13, int i14) throws IOException {
            if ((i13 & 8) != 0) {
                i12--;
            }
            if (i14 <= i12) {
                return i12 - i14;
            }
            throw new IOException(androidx.compose.foundation.H.j(i14, i12, "PROTOCOL_ERROR padding ", " > remaining length "));
        }
    }

    public static final class b implements okio.e0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final InterfaceC44804n f383377a;

        /* renamed from: b, reason: collision with root package name */
        private int f383378b;

        /* renamed from: c, reason: collision with root package name */
        private int f383379c;

        /* renamed from: d, reason: collision with root package name */
        private int f383380d;

        /* renamed from: e, reason: collision with root package name */
        private int f383381e;

        /* renamed from: f, reason: collision with root package name */
        private int f383382f;

        public b(@Y61.k InterfaceC44804n interfaceC44804n) {
            this.f383377a = interfaceC44804n;
        }

        public final void a(int i12) {
            this.f383379c = i12;
        }

        public final void b(int i12) {
            this.f383381e = i12;
        }

        public final void c(int i12) {
            this.f383378b = i12;
        }

        public final void d(int i12) {
            this.f383382f = i12;
        }

        public final void e(int i12) {
            this.f383380d = i12;
        }

        @Override // okio.e0
        public final long read(@Y61.k C44802l c44802l, long j12) throws IOException {
            int i12;
            int i13;
            do {
                int i14 = this.f383381e;
                if (i14 != 0) {
                    long j13 = this.f383377a.read(c44802l, Math.min(j12, i14));
                    if (j13 == -1) {
                        return -1L;
                    }
                    this.f383381e -= (int) j13;
                    return j13;
                }
                this.f383377a.skip(this.f383382f);
                this.f383382f = 0;
                if ((this.f383379c & 4) != 0) {
                    return -1L;
                }
                i12 = this.f383380d;
                int iA2 = qc1.a(this.f383377a);
                this.f383381e = iA2;
                this.f383378b = iA2;
                int iA3 = qc1.a(this.f383377a.readByte());
                this.f383379c = qc1.a(this.f383377a.readByte());
                int i15 = a10.f383372f;
                if (a.a().isLoggable(Level.FINE)) {
                    Logger loggerA = a.a();
                    t00 t00Var = t00.f390046a;
                    int i16 = this.f383380d;
                    int i17 = this.f383378b;
                    int i18 = this.f383379c;
                    t00Var.getClass();
                    loggerA.fine(t00.a(true, i16, i17, iA3, i18));
                }
                i13 = this.f383377a.readInt() & Integer.MAX_VALUE;
                this.f383380d = i13;
                if (iA3 != 9) {
                    throw new IOException(iA3 + " != TYPE_CONTINUATION");
                }
            } while (i13 == i12);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // okio.e0
        @Y61.k
        /* renamed from: timeout */
        public final okio.i0 getTimeout() {
            return this.f383377a.getTimeout();
        }

        public final int a() {
            return this.f383381e;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    public interface c {
        void a();

        void a(int i12, int i13, @Y61.k InterfaceC44804n interfaceC44804n, boolean z12);

        void a(int i12, int i13, boolean z12);

        void a(int i12, long j12);

        void a(int i12, @Y61.k xs xsVar);

        void a(int i12, @Y61.k xs xsVar, @Y61.k C44805o c44805o);

        void a(int i12, @Y61.k List list);

        void a(@Y61.k m31 m31Var);

        void a(boolean z12, int i12, @Y61.k List list);

        void b();
    }

    public a10(@Y61.k InterfaceC44804n interfaceC44804n, boolean z12) {
        this.f383373a = interfaceC44804n;
        this.f383374b = z12;
        b bVar = new b(interfaceC44804n);
        this.f383375c = bVar;
        this.f383376d = new xz.a(bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f383373a.close();
    }

    public final void a(@Y61.k c cVar) throws IOException {
        if (this.f383374b) {
            if (!a(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC44804n interfaceC44804n = this.f383373a;
        C44805o c44805o = t00.f390047b;
        C44805o c44805oW0 = interfaceC44804n.W0(c44805o.d());
        Logger logger = f383371e;
        if (logger.isLoggable(Level.FINE)) {
            StringBuilder sbA = Cif.a("<< CONNECTION ");
            sbA.append(c44805oW0.e());
            logger.fine(qc1.a(sbA.toString(), new Object[0]));
        }
        if (c44805o.equals(c44805oW0)) {
            return;
        }
        StringBuilder sbA2 = Cif.a("Expected a connection header but was ");
        sbA2.append(c44805oW0.t());
        throw new IOException(sbA2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01cb, code lost:
    
        throw new java.io.IOException(com.yandex.mobile.ads.impl.ba.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r5));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r11, @Y61.k com.yandex.mobile.ads.impl.a10.c r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.a10.a(boolean, com.yandex.mobile.ads.impl.a10$c):boolean");
    }
}
