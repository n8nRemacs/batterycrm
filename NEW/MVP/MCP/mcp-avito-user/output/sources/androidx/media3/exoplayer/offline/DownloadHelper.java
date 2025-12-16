package androidx.media3.exoplayer.offline;

import android.os.Handler;
import androidx.media3.common.P;
import androidx.media3.common.util.J;
import androidx.media3.datasource.B;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.AbstractC23150a;
import androidx.media3.exoplayer.source.InterfaceC23174z;
import androidx.media3.exoplayer.source.Q;
import androidx.media3.exoplayer.trackselection.g;
import androidx.media3.exoplayer.trackselection.k;
import androidx.media3.exoplayer.upstream.d;
import j.P;
import java.io.IOException;

@J
/* loaded from: classes.dex */
public final class DownloadHelper {

    public static class LiveContentUnsupportedException extends IOException {
    }

    public interface a {
    }

    public static final class b extends androidx.media3.exoplayer.trackselection.b {

        public static final class a implements k.b {
            public a() {
            }

            public /* synthetic */ a(e eVar) {
                this();
            }
        }

        @Override // androidx.media3.exoplayer.trackselection.k
        public final int a() {
            return 0;
        }
    }

    public static final class c implements androidx.media3.exoplayer.upstream.d {
        public c() {
        }

        @Override // androidx.media3.exoplayer.upstream.d
        @P
        public final B c() {
            return null;
        }

        public /* synthetic */ c(e eVar) {
            this();
        }

        @Override // androidx.media3.exoplayer.upstream.d
        public final void a(d.a aVar) {
        }

        @Override // androidx.media3.exoplayer.upstream.d
        public final void b(Handler handler, androidx.media3.exoplayer.analytics.a aVar) {
        }
    }

    public static final class d implements A.c, InterfaceC23174z.a, Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        public androidx.media3.common.P f49414b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC23174z[] f49415c;

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z.a
        public final void e(InterfaceC23174z interfaceC23174z) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.Q.a
        public final void g(Q q12) {
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            throw null;
         */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                int r0 = r4.what
                r1 = 0
                if (r0 == 0) goto L27
                r2 = 1
                if (r0 == r2) goto L20
                r2 = 2
                if (r0 == r2) goto L1b
                r4 = 3
                r2 = 0
                if (r0 == r4) goto L10
                return r2
            L10:
                androidx.media3.exoplayer.source.z[] r4 = r3.f49415c
                if (r4 == 0) goto L1a
                int r0 = r4.length
                if (r0 <= 0) goto L1a
                r4 = r4[r2]
                throw r1
            L1a:
                throw r1
            L1b:
                java.lang.Object r4 = r4.obj
                androidx.media3.exoplayer.source.z r4 = (androidx.media3.exoplayer.source.InterfaceC23174z) r4
                throw r1
            L20:
                androidx.media3.exoplayer.source.z[] r4 = r3.f49415c     // Catch: java.io.IOException -> L26
                if (r4 != 0) goto L25
                throw r1
            L25:
                throw r1
            L26:
                throw r1
            L27:
                int r4 = androidx.media3.exoplayer.analytics.w.f48756b
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.offline.DownloadHelper.d.handleMessage(android.os.Message):boolean");
        }

        @Override // androidx.media3.exoplayer.source.A.c
        public final void m(AbstractC23150a abstractC23150a, androidx.media3.common.P p12) {
            if (this.f49414b != null) {
                return;
            }
            if (p12.u(0, new P.d(), 0L).a()) {
                new LiveContentUnsupportedException();
                throw null;
            }
            this.f49414b = p12;
            int iP2 = p12.p();
            InterfaceC23174z[] interfaceC23174zArr = new InterfaceC23174z[iP2];
            this.f49415c = interfaceC23174zArr;
            if (iP2 > 0) {
                p12.t(0);
                throw null;
            }
            for (int i12 = 0; i12 < iP2; i12++) {
                interfaceC23174zArr[i12].f(this, 0L);
            }
        }
    }

    static {
        g.d dVar = g.d.f49946s0;
        dVar.getClass();
        g.d.a aVar = new g.d.a(dVar, (g.a) null);
        aVar.f47532x = true;
        aVar.f49979J = false;
        aVar.b();
    }
}
