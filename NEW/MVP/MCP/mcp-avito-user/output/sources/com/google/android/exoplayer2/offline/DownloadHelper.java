package com.google.android.exoplayer2.offline;

import android.os.Handler;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.AbstractC36538a;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.source.N;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.trackselection.k;
import com.google.android.exoplayer2.upstream.InterfaceC36574d;
import com.google.android.exoplayer2.upstream.M;
import j.P;
import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public final class DownloadHelper {

    public static class LiveContentUnsupportedException extends IOException {
    }

    public interface a {
    }

    public static final class c implements InterfaceC36574d {
        public c() {
        }

        @Override // com.google.android.exoplayer2.upstream.InterfaceC36574d
        public final long a() {
            return 0L;
        }

        @Override // com.google.android.exoplayer2.upstream.InterfaceC36574d
        @P
        public final M c() {
            return null;
        }

        public /* synthetic */ c(e eVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.upstream.InterfaceC36574d
        public final void g(InterfaceC36574d.a aVar) {
        }

        @Override // com.google.android.exoplayer2.upstream.InterfaceC36574d
        public final void b(Handler handler, InterfaceC36574d.a aVar) {
        }
    }

    public static final class d implements y.c, InterfaceC36559w.a, Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        public s0 f345791b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC36559w[] f345792c;

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w.a
        public final void c(InterfaceC36559w interfaceC36559w) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.N.a
        public final void g(N n12) {
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
                com.google.android.exoplayer2.source.w[] r4 = r3.f345792c
                if (r4 == 0) goto L1a
                int r0 = r4.length
                if (r0 <= 0) goto L1a
                r4 = r4[r2]
                throw r1
            L1a:
                throw r1
            L1b:
                java.lang.Object r4 = r4.obj
                com.google.android.exoplayer2.source.w r4 = (com.google.android.exoplayer2.source.InterfaceC36559w) r4
                throw r1
            L20:
                com.google.android.exoplayer2.source.w[] r4 = r3.f345792c     // Catch: java.io.IOException -> L26
                if (r4 != 0) goto L25
                throw r1
            L25:
                throw r1
            L26:
                throw r1
            L27:
                int r4 = com.google.android.exoplayer2.analytics.p.f343842b
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadHelper.d.handleMessage(android.os.Message):boolean");
        }

        @Override // com.google.android.exoplayer2.source.y.c
        public final void v(AbstractC36538a abstractC36538a, s0 s0Var) {
            if (this.f345791b != null) {
                return;
            }
            if (s0Var.m(0, new s0.d(), 0L).a()) {
                new LiveContentUnsupportedException();
                throw null;
            }
            this.f345791b = s0Var;
            int iH2 = s0Var.h();
            InterfaceC36559w[] interfaceC36559wArr = new InterfaceC36559w[iH2];
            this.f345792c = interfaceC36559wArr;
            if (iH2 > 0) {
                s0Var.l(0);
                throw null;
            }
            for (int i12 = 0; i12 < iH2; i12++) {
                interfaceC36559wArr[i12].e(this, 0L);
            }
        }
    }

    static {
        g.d dVar = g.d.f347200R;
        dVar.getClass();
        g.d.a aVar = new g.d.a(dVar, (g.a) null);
        aVar.f347331x = true;
        aVar.f347225J = false;
        aVar.a();
    }

    public static final class b extends com.google.android.exoplayer2.trackselection.b {

        public static final class a implements k.b {
            public a() {
            }

            public /* synthetic */ a(e eVar) {
                this();
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final int a() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        @P
        public final Object r() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final int s() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final void n(long j12, long j13, long j14, List<? extends com.google.android.exoplayer2.source.chunk.m> list, com.google.android.exoplayer2.source.chunk.n[] nVarArr) {
        }
    }
}
