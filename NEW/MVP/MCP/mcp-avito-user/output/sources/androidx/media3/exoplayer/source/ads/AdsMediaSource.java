package androidx.media3.exoplayer.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.C23089c;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.z;
import androidx.media3.datasource.B;
import androidx.media3.datasource.o;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.AbstractC23150a;
import androidx.media3.exoplayer.source.AbstractC23154e;
import androidx.media3.exoplayer.source.C23167s;
import androidx.media3.exoplayer.source.C23169u;
import androidx.media3.exoplayer.source.C23171w;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.InterfaceC23174z;
import androidx.media3.exoplayer.source.ads.a;
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

@J
/* loaded from: classes.dex */
public final class AdsMediaSource extends AbstractC23154e<A.b> {

    /* renamed from: p, reason: collision with root package name */
    public static final A.b f49719p = new A.b(new Object());

    /* renamed from: l, reason: collision with root package name */
    @P
    public c f49720l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public androidx.media3.common.P f49721m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public C23089c f49722n;

    /* renamed from: o, reason: collision with root package name */
    public a[][] f49723o;

    public static final class AdLoadException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }
    }

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final A.b f49724a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f49725b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public androidx.media3.common.P f49726c;

        public a(A.b bVar) {
            this.f49724a = bVar;
        }
    }

    public final class b implements C23169u.a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f49728a;

        public b(Uri uri) {
            this.f49728a = uri;
        }

        @Override // androidx.media3.exoplayer.source.C23169u.a
        public final void a(A.b bVar) {
            AdsMediaSource.this.getClass();
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.C23169u.a
        public final void b(A.b bVar, IOException iOException) {
            D.a aVar = new D.a(AdsMediaSource.this.f49714d.f49485c, 0, bVar);
            long andIncrement = C23167s.f49826b.getAndIncrement();
            new o(this.f49728a, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
            SystemClock.elapsedRealtime();
            aVar.d(new C23167s(andIncrement, Collections.emptyMap()), new C23171w(6, -1, null, 0, M.Q(-9223372036854775807L), M.Q(-9223372036854775807L)), new AdLoadException(iOException), true);
            throw null;
        }
    }

    public final class c implements a.InterfaceC1834a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f49730a = M.n(null);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final void C() {
        super.C();
        c cVar = this.f49720l;
        cVar.getClass();
        this.f49720l = null;
        cVar.f49730a.removeCallbacksAndMessages(null);
        this.f49721m = null;
        this.f49722n = null;
        this.f49723o = new a[0][];
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    public final A.b D(A.b bVar, A.b bVar2) {
        A.b bVar3 = bVar;
        return bVar3.a() ? bVar3 : bVar2;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e
    public final void G(Object obj, AbstractC23150a abstractC23150a, androidx.media3.common.P p12) {
        long j12;
        androidx.media3.common.P p13;
        long j13;
        A.b bVar = (A.b) obj;
        int i12 = 0;
        if (bVar.a()) {
            a aVar = this.f49723o[bVar.f47213b][bVar.f47214c];
            aVar.getClass();
            C23110a.b(p12.p() == 1);
            if (aVar.f49726c == null) {
                Object objT = p12.t(0);
                int i13 = 0;
                while (true) {
                    ArrayList arrayList = aVar.f49725b;
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    C23169u c23169u = (C23169u) arrayList.get(i13);
                    c23169u.a(new A.b(objT, c23169u.f49831b.f47215d));
                    i13++;
                }
            }
            aVar.f49726c = p12;
        } else {
            C23110a.b(p12.p() == 1);
            this.f49721m = p12;
        }
        androidx.media3.common.P p14 = this.f49721m;
        C23089c c23089c = this.f49722n;
        if (c23089c != null && p14 != null) {
            int i14 = c23089c.f47622b;
            if (i14 != 0) {
                long[][] jArr = new long[this.f49723o.length][];
                int i15 = 0;
                while (true) {
                    a[][] aVarArr = this.f49723o;
                    j12 = -9223372036854775807L;
                    if (i15 >= aVarArr.length) {
                        break;
                    }
                    jArr[i15] = new long[aVarArr[i15].length];
                    int i16 = 0;
                    while (true) {
                        a[] aVarArr2 = this.f49723o[i15];
                        if (i16 < aVarArr2.length) {
                            a aVar2 = aVarArr2[i16];
                            long[] jArr2 = jArr[i15];
                            if (aVar2 == null || (p13 = aVar2.f49726c) == null) {
                                j13 = -9223372036854775807L;
                            } else {
                                AdsMediaSource.this.getClass();
                                j13 = p13.n(0, null, false).f47382e;
                            }
                            jArr2[i16] = j13;
                            i16++;
                        }
                    }
                    i15++;
                }
                C23110a.g(c23089c.f47625e == 0);
                C23089c.b[] bVarArr = c23089c.f47626f;
                C23089c.b[] bVarArr2 = (C23089c.b[]) M.H(bVarArr.length, bVarArr);
                while (i12 < i14) {
                    C23089c.b bVar2 = bVarArr2[i12];
                    long[] jArrCopyOf = jArr[i12];
                    bVar2.getClass();
                    int length = jArrCopyOf.length;
                    Uri[] uriArr = bVar2.f47639e;
                    if (length < uriArr.length) {
                        int length2 = uriArr.length;
                        int length3 = jArrCopyOf.length;
                        int iMax = Math.max(length2, length3);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, iMax);
                        Arrays.fill(jArrCopyOf, length3, iMax, j12);
                    } else if (bVar2.f47637c != -1 && jArrCopyOf.length > uriArr.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, uriArr.length);
                    }
                    bVarArr2[i12] = new C23089c.b(bVar2.f47636b, bVar2.f47637c, bVar2.f47638d, bVar2.f47640f, bVar2.f47639e, jArrCopyOf, bVar2.f47642h, bVar2.f47643i);
                    i12++;
                    p14 = p14;
                    j12 = -9223372036854775807L;
                }
                this.f49722n = new C23089c(bVarArr2, c23089c.f47623c, c23089c.f47624d, c23089c.f47625e);
                z(new d(p14, this.f49722n));
                return;
            }
            z(p14);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        r4 = r4 + 1;
     */
    @Override // androidx.media3.exoplayer.source.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.media3.exoplayer.source.InterfaceC23174z e(androidx.media3.exoplayer.source.A.b r9, androidx.media3.exoplayer.upstream.b r10, long r11) {
        /*
            r8 = this;
            androidx.media3.common.c r0 = r8.f49722n
            r0.getClass()
            int r0 = r0.f47622b
            r1 = 0
            if (r0 <= 0) goto L8c
            boolean r0 = r9.a()
            if (r0 == 0) goto L8c
            androidx.media3.exoplayer.source.ads.AdsMediaSource$a[][] r0 = r8.f49723o
            int r2 = r9.f47213b
            r3 = r0[r2]
            int r4 = r3.length
            int r5 = r9.f47214c
            if (r4 > r5) goto L25
            int r4 = r5 + 1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            androidx.media3.exoplayer.source.ads.AdsMediaSource$a[] r3 = (androidx.media3.exoplayer.source.ads.AdsMediaSource.a[]) r3
            r0[r2] = r3
        L25:
            androidx.media3.exoplayer.source.ads.AdsMediaSource$a[][] r0 = r8.f49723o
            r0 = r0[r2]
            r0 = r0[r5]
            r3 = 0
            if (r0 != 0) goto L6f
            androidx.media3.exoplayer.source.ads.AdsMediaSource$a r0 = new androidx.media3.exoplayer.source.ads.AdsMediaSource$a
            r0.<init>(r9)
            androidx.media3.exoplayer.source.ads.AdsMediaSource$a[][] r4 = r8.f49723o
            r2 = r4[r2]
            r2[r5] = r0
            androidx.media3.common.c r2 = r8.f49722n
            if (r2 != 0) goto L3e
            goto L6f
        L3e:
            r4 = r3
        L3f:
            androidx.media3.exoplayer.source.ads.AdsMediaSource$a[][] r5 = r8.f49723o
            int r5 = r5.length
            if (r4 >= r5) goto L6f
            r5 = r3
        L45:
            androidx.media3.exoplayer.source.ads.AdsMediaSource$a[][] r6 = r8.f49723o
            r6 = r6[r4]
            int r7 = r6.length
            if (r5 >= r7) goto L6c
            r6 = r6[r5]
            androidx.media3.common.c$b r7 = r2.a(r4)
            if (r6 == 0) goto L69
            android.net.Uri[] r6 = r7.f47639e
            int r7 = r6.length
            if (r5 >= r7) goto L69
            r6 = r6[r5]
            if (r6 != 0) goto L5e
            goto L69
        L5e:
            androidx.media3.common.z$c r9 = new androidx.media3.common.z$c
            r9.<init>()
            r9.f47989b = r6
            r9.a()
            throw r1
        L69:
            int r5 = r5 + 1
            goto L45
        L6c:
            int r4 = r4 + 1
            goto L3f
        L6f:
            androidx.media3.exoplayer.source.u r1 = new androidx.media3.exoplayer.source.u
            r1.<init>(r9, r10, r11)
            java.util.ArrayList r10 = r0.f49725b
            r10.add(r1)
            androidx.media3.common.P r10 = r0.f49726c
            if (r10 == 0) goto L8b
            java.lang.Object r10 = r10.t(r3)
            androidx.media3.exoplayer.source.A$b r11 = new androidx.media3.exoplayer.source.A$b
            long r2 = r9.f47215d
            r11.<init>(r10, r2)
            r1.a(r11)
        L8b:
            return r1
        L8c:
            androidx.media3.exoplayer.source.u r0 = new androidx.media3.exoplayer.source.u
            r0.<init>(r9, r10, r11)
            r0.c(r1)
            r0.a(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ads.AdsMediaSource.e(androidx.media3.exoplayer.source.A$b, androidx.media3.exoplayer.upstream.b, long):androidx.media3.exoplayer.source.z");
    }

    @Override // androidx.media3.exoplayer.source.A
    public final z getMediaItem() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void k(InterfaceC23174z interfaceC23174z) {
        C23169u c23169u = (C23169u) interfaceC23174z;
        A.b bVar = c23169u.f49831b;
        if (!bVar.a()) {
            c23169u.b();
            return;
        }
        a[][] aVarArr = this.f49723o;
        int i12 = bVar.f47213b;
        a[] aVarArr2 = aVarArr[i12];
        int i13 = bVar.f47214c;
        a aVar = aVarArr2[i13];
        aVar.getClass();
        ArrayList arrayList = aVar.f49725b;
        arrayList.remove(c23169u);
        c23169u.b();
        if (arrayList.isEmpty()) {
            this.f49723o[i12][i13] = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final void y(@P B b12) {
        super.y(b12);
        this.f49720l = new c();
        H(f49719p, null);
        throw null;
    }
}
