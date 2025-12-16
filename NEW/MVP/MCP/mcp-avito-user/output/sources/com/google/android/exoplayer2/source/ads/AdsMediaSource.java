package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.AbstractC36538a;
import com.google.android.exoplayer2.source.AbstractC36542e;
import com.google.android.exoplayer2.source.C36554q;
import com.google.android.exoplayer2.source.C36555s;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.ads.a;
import com.google.android.exoplayer2.source.ads.b;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.upstream.M;
import com.google.android.exoplayer2.upstream.p;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class AdsMediaSource extends AbstractC36542e<y.b> {

    /* renamed from: p, reason: collision with root package name */
    public static final y.b f346165p = new y.b(new Object());

    /* renamed from: l, reason: collision with root package name */
    @P
    public c f346166l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public s0 f346167m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public com.google.android.exoplayer2.source.ads.a f346168n;

    /* renamed from: o, reason: collision with root package name */
    public a[][] f346169o;

    public static final class AdLoadException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }
    }

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final y.b f346170a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f346171b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public s0 f346172c;

        public a(y.b bVar) {
            this.f346170a = bVar;
        }
    }

    public final class b implements C36555s.a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f346174a;

        public b(Uri uri) {
            this.f346174a = uri;
        }

        @Override // com.google.android.exoplayer2.source.C36555s.a
        public final void a(y.b bVar, IOException iOException) {
            A.a aVarY = AdsMediaSource.this.y(bVar);
            long andIncrement = C36554q.f346661b.getAndIncrement();
            new p(this.f346174a, 0L, -1L);
            SystemClock.elapsedRealtime();
            aVarY.i(new C36554q(andIncrement, Collections.emptyMap()), 6, new AdLoadException(iOException), true);
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.C36555s.a
        public final void b(y.b bVar) {
            AdsMediaSource.this.getClass();
            throw null;
        }
    }

    public final class c implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f346176a = U.n(null);

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f346177b;

        public c() {
        }

        @Override // com.google.android.exoplayer2.source.ads.b.a
        public final void a(final com.google.android.exoplayer2.source.ads.a aVar) {
            if (this.f346177b) {
                return;
            }
            this.f346176a.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.c
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.c cVar = this.f346196b;
                    a aVar2 = aVar;
                    if (cVar.f346177b) {
                        return;
                    }
                    AdsMediaSource adsMediaSource = AdsMediaSource.this;
                    a aVar3 = adsMediaSource.f346168n;
                    if (aVar3 == null) {
                        AdsMediaSource.a[][] aVarArr = new AdsMediaSource.a[aVar2.f346183c][];
                        adsMediaSource.f346169o = aVarArr;
                        Arrays.fill(aVarArr, new AdsMediaSource.a[0]);
                    } else {
                        C36585a.d(aVar2.f346183c == aVar3.f346183c);
                    }
                    adsMediaSource.f346168n = aVar2;
                    adsMediaSource.J();
                    adsMediaSource.K();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.AbstractC36538a
    public final void B(@P M m12) {
        super.B(m12);
        this.f346166l = new c();
        H(f346165p, null);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.AbstractC36538a
    public final void D() {
        super.D();
        c cVar = this.f346166l;
        cVar.getClass();
        this.f346166l = null;
        cVar.f346177b = true;
        cVar.f346176a.removeCallbacksAndMessages(null);
        this.f346167m = null;
        this.f346168n = null;
        this.f346169o = new a[0][];
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e
    public final y.b E(y.b bVar, y.b bVar2) {
        y.b bVar3 = bVar;
        return bVar3.a() ? bVar3 : bVar2;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e
    public final void G(Object obj, AbstractC36538a abstractC36538a, s0 s0Var) {
        y.b bVar = (y.b) obj;
        int i12 = 0;
        if (bVar.a()) {
            a aVar = this.f346169o[bVar.f346697b][bVar.f346698c];
            aVar.getClass();
            C36585a.b(s0Var.h() == 1);
            if (aVar.f346172c == null) {
                Object objL = s0Var.l(0);
                while (true) {
                    ArrayList arrayList = aVar.f346171b;
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    C36555s c36555s = (C36555s) arrayList.get(i12);
                    c36555s.a(new y.b(objL, c36555s.f346666b.f346699d));
                    i12++;
                }
            }
            aVar.f346172c = s0Var;
        } else {
            C36585a.b(s0Var.h() == 1);
            this.f346167m = s0Var;
        }
        K();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            r6 = this;
            com.google.android.exoplayer2.source.ads.a r0 = r6.f346168n
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r2 = r1
        L7:
            com.google.android.exoplayer2.source.ads.AdsMediaSource$a[][] r3 = r6.f346169o
            int r3 = r3.length
            if (r2 >= r3) goto L35
            r3 = r1
        Ld:
            com.google.android.exoplayer2.source.ads.AdsMediaSource$a[][] r4 = r6.f346169o
            r4 = r4[r2]
            int r5 = r4.length
            if (r3 >= r5) goto L32
            r4 = r4[r3]
            com.google.android.exoplayer2.source.ads.a$b r5 = r0.a(r2)
            if (r4 == 0) goto L2f
            android.net.Uri[] r4 = r5.f346191d
            int r5 = r4.length
            if (r3 >= r5) goto L2f
            r4 = r4[r3]
            if (r4 != 0) goto L26
            goto L2f
        L26:
            com.google.android.exoplayer2.O$c r0 = new com.google.android.exoplayer2.O$c
            r0.<init>()
            r0.f343535b = r4
            r0 = 0
            throw r0
        L2f:
            int r3 = r3 + 1
            goto Ld
        L32:
            int r2 = r2 + 1
            goto L7
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ads.AdsMediaSource.J():void");
    }

    public final void K() {
        s0 s0Var;
        s0 s0Var2 = this.f346167m;
        com.google.android.exoplayer2.source.ads.a aVar = this.f346168n;
        if (aVar == null || s0Var2 == null) {
            return;
        }
        int i12 = aVar.f346183c;
        if (i12 == 0) {
            C(s0Var2);
            return;
        }
        long[][] jArr = new long[this.f346169o.length][];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            a[][] aVarArr = this.f346169o;
            if (i14 >= aVarArr.length) {
                break;
            }
            jArr[i14] = new long[aVarArr[i14].length];
            int i15 = 0;
            while (true) {
                a[] aVarArr2 = this.f346169o[i14];
                if (i15 < aVarArr2.length) {
                    a aVar2 = aVarArr2[i15];
                    long[] jArr2 = jArr[i14];
                    long j12 = -9223372036854775807L;
                    if (aVar2 != null && (s0Var = aVar2.f346172c) != null) {
                        AdsMediaSource.this.getClass();
                        j12 = s0Var.f(0, null, false).f345873e;
                    }
                    jArr2[i15] = j12;
                    i15++;
                }
            }
            i14++;
        }
        C36585a.d(aVar.f346186f == 0);
        a.b[] bVarArr = aVar.f346187g;
        a.b[] bVarArr2 = (a.b[]) U.J(bVarArr.length, bVarArr);
        while (i13 < i12) {
            a.b bVar = bVarArr2[i13];
            long[] jArrCopyOf = jArr[i13];
            bVar.getClass();
            int length = jArrCopyOf.length;
            Uri[] uriArr = bVar.f346191d;
            if (length < uriArr.length) {
                jArrCopyOf = a.b.a(jArrCopyOf, uriArr.length);
            } else if (bVar.f346190c != -1 && jArrCopyOf.length > uriArr.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, uriArr.length);
            }
            bVarArr2[i13] = new a.b(bVar.f346189b, bVar.f346190c, bVar.f346192e, bVar.f346191d, jArrCopyOf, bVar.f346194g, bVar.f346195h);
            i13++;
            i12 = i12;
            jArr = jArr;
        }
        this.f346168n = new com.google.android.exoplayer2.source.ads.a(aVar.f346182b, bVarArr2, aVar.f346184d, aVar.f346185e, aVar.f346186f);
        C(new f(s0Var2, this.f346168n));
    }

    @Override // com.google.android.exoplayer2.source.y
    public final InterfaceC36559w c(y.b bVar, InterfaceC36572b interfaceC36572b, long j12) {
        com.google.android.exoplayer2.source.ads.a aVar = this.f346168n;
        aVar.getClass();
        if (aVar.f346183c <= 0 || !bVar.a()) {
            C36555s c36555s = new C36555s(bVar, interfaceC36572b, j12);
            c36555s.h(null);
            c36555s.a(bVar);
            return c36555s;
        }
        a[][] aVarArr = this.f346169o;
        int i12 = bVar.f346697b;
        a[] aVarArr2 = aVarArr[i12];
        int length = aVarArr2.length;
        int i13 = bVar.f346698c;
        if (length <= i13) {
            aVarArr[i12] = (a[]) Arrays.copyOf(aVarArr2, i13 + 1);
        }
        a aVar2 = this.f346169o[i12][i13];
        if (aVar2 == null) {
            aVar2 = new a(bVar);
            this.f346169o[i12][i13] = aVar2;
            J();
        }
        C36555s c36555s2 = new C36555s(bVar, interfaceC36572b, j12);
        aVar2.f346171b.add(c36555s2);
        s0 s0Var = aVar2.f346172c;
        if (s0Var != null) {
            c36555s2.a(new y.b(s0Var.l(0), bVar.f346699d));
        }
        return c36555s2;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final O getMediaItem() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void t(InterfaceC36559w interfaceC36559w) {
        C36555s c36555s = (C36555s) interfaceC36559w;
        y.b bVar = c36555s.f346666b;
        if (!bVar.a()) {
            c36555s.b();
            return;
        }
        a[][] aVarArr = this.f346169o;
        int i12 = bVar.f346697b;
        a[] aVarArr2 = aVarArr[i12];
        int i13 = bVar.f346698c;
        a aVar = aVarArr2[i13];
        aVar.getClass();
        ArrayList arrayList = aVar.f346171b;
        arrayList.remove(c36555s);
        c36555s.b();
        if (arrayList.isEmpty()) {
            this.f346169o[i12][i13] = null;
        }
    }
}
