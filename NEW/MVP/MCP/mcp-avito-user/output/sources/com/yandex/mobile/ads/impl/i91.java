package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import androidx.media3.common.C23088b;
import com.facebook.imageutils.JfifUtil;
import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.impl.g4;
import com.yandex.mobile.ads.impl.rg;
import com.yandex.mobile.ads.impl.xc0;

/* loaded from: classes8.dex */
public abstract class i91 implements rg {

    /* renamed from: a, reason: collision with root package name */
    public static final i91 f386387a = new a();

    public class a extends i91 {
        @Override // com.yandex.mobile.ads.impl.i91
        public final int a() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final int b() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final int a(Object obj) {
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final d a(int i12, d dVar, long j12) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final b a(int i12, b bVar, boolean z12) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final Object a(int i12) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static final class b implements rg {

        /* renamed from: h, reason: collision with root package name */
        public static final rg.a<b> f386388h = new L0(20);

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public Object f386389a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public Object f386390b;

        /* renamed from: c, reason: collision with root package name */
        public int f386391c;

        /* renamed from: d, reason: collision with root package name */
        public long f386392d;

        /* renamed from: e, reason: collision with root package name */
        public long f386393e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f386394f;

        /* renamed from: g, reason: collision with root package name */
        private g4 f386395g = g4.f385558g;

        public final int c() {
            return this.f386395g.f385565e;
        }

        public final int d(int i12) {
            return this.f386395g.a(i12).a(-1);
        }

        public final boolean e(int i12) {
            boolean z12;
            g4.a aVarA = this.f386395g.a(i12);
            if (aVarA.f385569b == -1) {
                z12 = true;
                break;
            }
            z12 = false;
            for (int i13 = 0; i13 < aVarA.f385569b; i13++) {
                int i14 = aVarA.f385571d[i13];
                if (i14 == 0 || i14 == 1) {
                    z12 = true;
                    break;
                }
            }
            return !z12;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return pc1.a(this.f386389a, bVar.f386389a) && pc1.a(this.f386390b, bVar.f386390b) && this.f386391c == bVar.f386391c && this.f386392d == bVar.f386392d && this.f386393e == bVar.f386393e && this.f386394f == bVar.f386394f && pc1.a(this.f386395g, bVar.f386395g);
        }

        public final boolean f(int i12) {
            return this.f386395g.a(i12).f385574g;
        }

        public final int hashCode() {
            Object obj = this.f386389a;
            int iHashCode = ((obj == null ? 0 : obj.hashCode()) + JfifUtil.MARKER_EOI) * 31;
            Object obj2 = this.f386390b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f386391c) * 31;
            long j12 = this.f386392d;
            int i12 = (iHashCode2 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f386393e;
            return this.f386395g.hashCode() + ((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f386394f ? 1 : 0)) * 31);
        }

        public final b a(@j.P Object obj, @j.P Object obj2, int i12, long j12, long j13, g4 g4Var, boolean z12) {
            this.f386389a = obj;
            this.f386390b = obj2;
            this.f386391c = i12;
            this.f386392d = j12;
            this.f386393e = j13;
            this.f386395g = g4Var;
            this.f386394f = z12;
            return this;
        }

        public final long b(int i12) {
            return this.f386395g.a(i12).f385568a;
        }

        public final int c(int i12, int i13) {
            return this.f386395g.a(i12).a(i13);
        }

        public final int b(long j12) {
            g4 g4Var = this.f386395g;
            long j13 = this.f386392d;
            int i12 = g4Var.f385562b - 1;
            while (i12 >= 0 && j12 != Long.MIN_VALUE) {
                long j14 = g4Var.a(i12).f385568a;
                if (j14 != Long.MIN_VALUE) {
                    if (j12 >= j14) {
                        break;
                    }
                    i12--;
                } else {
                    if (j13 != -9223372036854775807L && j12 >= j13) {
                        break;
                    }
                    i12--;
                }
            }
            if (i12 >= 0) {
                g4.a aVarA = g4Var.a(i12);
                if (aVarA.f385569b == -1) {
                    return i12;
                }
                for (int i13 = 0; i13 < aVarA.f385569b; i13++) {
                    int i14 = aVarA.f385571d[i13];
                    if (i14 == 0 || i14 == 1) {
                        return i12;
                    }
                }
            }
            return -1;
        }

        public final long c(int i12) {
            return this.f386395g.a(i12).f385573f;
        }

        public final int a() {
            return this.f386395g.f385562b;
        }

        public final int a(long j12) {
            g4 g4Var = this.f386395g;
            long j13 = this.f386392d;
            g4Var.getClass();
            if (j12 == Long.MIN_VALUE) {
                return -1;
            }
            if (j13 != -9223372036854775807L && j12 >= j13) {
                return -1;
            }
            int i12 = g4Var.f385565e;
            while (i12 < g4Var.f385562b) {
                if (g4Var.a(i12).f385568a == Long.MIN_VALUE || g4Var.a(i12).f385568a > j12) {
                    g4.a aVarA = g4Var.a(i12);
                    if (aVarA.f385569b == -1 || aVarA.a(-1) < aVarA.f385569b) {
                        break;
                    }
                }
                i12++;
            }
            if (i12 < g4Var.f385562b) {
                return i12;
            }
            return -1;
        }

        public final int b(int i12, int i13) {
            g4.a aVarA = this.f386395g.a(i12);
            if (aVarA.f385569b != -1) {
                return aVarA.f385571d[i13];
            }
            return 0;
        }

        public final long b() {
            return this.f386395g.f385563c;
        }

        public final int a(int i12) {
            return this.f386395g.a(i12).f385569b;
        }

        public final long a(int i12, int i13) {
            g4.a aVarA = this.f386395g.a(i12);
            if (aVarA.f385569b != -1) {
                return aVarA.f385572e[i13];
            }
            return -9223372036854775807L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b a(Bundle bundle) {
            g4 g4Var;
            int i12 = bundle.getInt(Integer.toString(0, 36), 0);
            long j12 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
            long j13 = bundle.getLong(Integer.toString(2, 36), 0L);
            boolean z12 = bundle.getBoolean(Integer.toString(3, 36));
            Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
            if (bundle2 != null) {
                g4Var = (g4) g4.f385560i.fromBundle(bundle2);
            } else {
                g4Var = g4.f385558g;
            }
            g4 g4Var2 = g4Var;
            b bVar = new b();
            bVar.a(null, null, i12, j12, j13, g4Var2, z12);
            return bVar;
        }
    }

    public static final class c extends i91 {

        /* renamed from: b, reason: collision with root package name */
        private final com.yandex.mobile.ads.embedded.guava.collect.p<d> f386396b;

        /* renamed from: c, reason: collision with root package name */
        private final com.yandex.mobile.ads.embedded.guava.collect.p<b> f386397c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f386398d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f386399e;

        public c(com.yandex.mobile.ads.embedded.guava.collect.p<d> pVar, com.yandex.mobile.ads.embedded.guava.collect.p<b> pVar2, int[] iArr) {
            db.a(pVar.size() == iArr.length);
            this.f386396b = pVar;
            this.f386397c = pVar2;
            this.f386398d = iArr;
            this.f386399e = new int[iArr.length];
            for (int i12 = 0; i12 < iArr.length; i12++) {
                this.f386399e[iArr[i12]] = i12;
            }
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final d a(int i12, d dVar, long j12) {
            d dVar2 = this.f386396b.get(i12);
            dVar.a(dVar2.f386404a, dVar2.f386406c, dVar2.f386407d, dVar2.f386408e, dVar2.f386409f, dVar2.f386410g, dVar2.f386411h, dVar2.f386412i, dVar2.f386414k, dVar2.f386416m, dVar2.f386417n, dVar2.f386418o, dVar2.f386419p, dVar2.f386420q);
            dVar.f386415l = dVar2.f386415l;
            return dVar;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final int b() {
            return this.f386396b.size();
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final int b(int i12, int i13, boolean z12) {
            if (i13 == 1) {
                return i12;
            }
            if (i12 != a(z12)) {
                return z12 ? this.f386398d[this.f386399e[i12] - 1] : i12 - 1;
            }
            if (i13 == 2) {
                return b(z12);
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final int a(int i12, int i13, boolean z12) {
            if (i13 == 1) {
                return i12;
            }
            if (i12 != b(z12)) {
                return z12 ? this.f386398d[this.f386399e[i12] + 1] : i12 + 1;
            }
            if (i13 == 2) {
                return a(z12);
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final int b(boolean z12) {
            if (c()) {
                return -1;
            }
            if (z12) {
                return this.f386398d[this.f386396b.size() - 1];
            }
            return this.f386396b.size() - 1;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final int a(boolean z12) {
            if (c()) {
                return -1;
            }
            if (z12) {
                return this.f386398d[0];
            }
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final int a() {
            return this.f386397c.size();
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final b a(int i12, b bVar, boolean z12) {
            b bVar2 = this.f386397c.get(i12);
            bVar.a(bVar2.f386389a, bVar2.f386390b, bVar2.f386391c, bVar2.f386392d, bVar2.f386393e, bVar2.f386395g, bVar2.f386394f);
            return bVar;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final int a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final Object a(int i12) {
            throw new UnsupportedOperationException();
        }
    }

    public abstract int a();

    public int a(int i12, int i13, boolean z12) {
        if (i13 == 0) {
            if (i12 == b(z12)) {
                return -1;
            }
            return i12 + 1;
        }
        if (i13 == 1) {
            return i12;
        }
        if (i13 == 2) {
            return i12 == b(z12) ? a(z12) : i12 + 1;
        }
        throw new IllegalStateException();
    }

    public abstract int a(Object obj);

    public abstract b a(int i12, b bVar, boolean z12);

    public abstract d a(int i12, d dVar, long j12);

    public abstract Object a(int i12);

    public abstract int b();

    public int b(int i12, int i13, boolean z12) {
        if (i13 == 0) {
            if (i12 == a(z12)) {
                return -1;
            }
            return i12 - 1;
        }
        if (i13 == 1) {
            return i12;
        }
        if (i13 == 2) {
            return i12 == a(z12) ? b(z12) : i12 - 1;
        }
        throw new IllegalStateException();
    }

    public final boolean c() {
        return b() == 0;
    }

    public final boolean equals(@j.P Object obj) {
        int iB2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i91)) {
            return false;
        }
        i91 i91Var = (i91) obj;
        if (i91Var.b() != b() || i91Var.a() != a()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i12 = 0; i12 < b(); i12++) {
            if (!a(i12, dVar, 0L).equals(i91Var.a(i12, dVar2, 0L))) {
                return false;
            }
        }
        for (int i13 = 0; i13 < a(); i13++) {
            if (!a(i13, bVar, true).equals(i91Var.a(i13, bVar2, true))) {
                return false;
            }
        }
        int iA2 = a(true);
        if (iA2 != i91Var.a(true) || (iB2 = b(true)) != i91Var.b(true)) {
            return false;
        }
        while (iA2 != iB2) {
            int iA3 = a(iA2, 0, true);
            if (iA3 != i91Var.a(iA2, 0, true)) {
                return false;
            }
            iA2 = iA3;
        }
        return true;
    }

    public final int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iB2 = b() + JfifUtil.MARKER_EOI;
        for (int i12 = 0; i12 < b(); i12++) {
            iB2 = (iB2 * 31) + a(i12, dVar, 0L).hashCode();
        }
        int iA2 = a() + (iB2 * 31);
        for (int i13 = 0; i13 < a(); i13++) {
            iA2 = (iA2 * 31) + a(i13, bVar, true).hashCode();
        }
        int iA3 = a(true);
        while (iA3 != -1) {
            iA2 = (iA2 * 31) + iA3;
            iA3 = a(iA3, 0, true);
        }
        return iA2;
    }

    public int a(boolean z12) {
        return c() ? -1 : 0;
    }

    public int b(boolean z12) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public final Pair<Object, Long> a(d dVar, b bVar, int i12, long j12) {
        Pair<Object, Long> pairA = a(dVar, bVar, i12, j12, 0L);
        pairA.getClass();
        return pairA;
    }

    @j.P
    public final Pair<Object, Long> a(d dVar, b bVar, int i12, long j12, long j13) {
        db.a(i12, b());
        a(i12, dVar, j13);
        if (j12 == -9223372036854775807L) {
            j12 = dVar.f386416m;
            if (j12 == -9223372036854775807L) {
                return null;
            }
        }
        int i13 = dVar.f386418o;
        a(i13, bVar, false);
        while (i13 < dVar.f386419p && bVar.f386393e != j12) {
            int i14 = i13 + 1;
            if (a(i14, bVar, false).f386393e > j12) {
                break;
            }
            i13 = i14;
        }
        a(i13, bVar, true);
        long jMin = j12 - bVar.f386393e;
        long j14 = bVar.f386392d;
        if (j14 != -9223372036854775807L) {
            jMin = Math.min(jMin, j14 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = bVar.f386390b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public static final class d implements rg {

        /* renamed from: r, reason: collision with root package name */
        public static final Object f386400r = new Object();

        /* renamed from: s, reason: collision with root package name */
        private static final Object f386401s = new Object();

        /* renamed from: t, reason: collision with root package name */
        private static final xc0 f386402t = new xc0.a().b("com.yandex.mobile.ads.exoplayer2.Timeline").a(Uri.EMPTY).a();

        /* renamed from: u, reason: collision with root package name */
        public static final rg.a<d> f386403u = new L0(21);

        /* renamed from: b, reason: collision with root package name */
        @j.P
        @Deprecated
        public Object f386405b;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public Object f386407d;

        /* renamed from: e, reason: collision with root package name */
        public long f386408e;

        /* renamed from: f, reason: collision with root package name */
        public long f386409f;

        /* renamed from: g, reason: collision with root package name */
        public long f386410g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f386411h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f386412i;

        /* renamed from: j, reason: collision with root package name */
        @Deprecated
        public boolean f386413j;

        /* renamed from: k, reason: collision with root package name */
        @j.P
        public xc0.e f386414k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f386415l;

        /* renamed from: m, reason: collision with root package name */
        public long f386416m;

        /* renamed from: n, reason: collision with root package name */
        public long f386417n;

        /* renamed from: o, reason: collision with root package name */
        public int f386418o;

        /* renamed from: p, reason: collision with root package name */
        public int f386419p;

        /* renamed from: q, reason: collision with root package name */
        public long f386420q;

        /* renamed from: a, reason: collision with root package name */
        public Object f386404a = f386400r;

        /* renamed from: c, reason: collision with root package name */
        public xc0 f386406c = f386402t;

        public final d a(Object obj, @j.P xc0 xc0Var, @j.P Object obj2, long j12, long j13, long j14, boolean z12, boolean z13, @j.P xc0.e eVar, long j15, long j16, int i12, int i13, long j17) {
            xc0.g gVar;
            this.f386404a = obj;
            this.f386406c = xc0Var != null ? xc0Var : f386402t;
            this.f386405b = (xc0Var == null || (gVar = xc0Var.f391606b) == null) ? null : gVar.f391660g;
            this.f386407d = obj2;
            this.f386408e = j12;
            this.f386409f = j13;
            this.f386410g = j14;
            this.f386411h = z12;
            this.f386412i = z13;
            this.f386413j = eVar != null;
            this.f386414k = eVar;
            this.f386416m = j15;
            this.f386417n = j16;
            this.f386418o = i12;
            this.f386419p = i13;
            this.f386420q = j17;
            this.f386415l = false;
            return this;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return pc1.a(this.f386404a, dVar.f386404a) && pc1.a(this.f386406c, dVar.f386406c) && pc1.a(this.f386407d, dVar.f386407d) && pc1.a(this.f386414k, dVar.f386414k) && this.f386408e == dVar.f386408e && this.f386409f == dVar.f386409f && this.f386410g == dVar.f386410g && this.f386411h == dVar.f386411h && this.f386412i == dVar.f386412i && this.f386415l == dVar.f386415l && this.f386416m == dVar.f386416m && this.f386417n == dVar.f386417n && this.f386418o == dVar.f386418o && this.f386419p == dVar.f386419p && this.f386420q == dVar.f386420q;
        }

        public final int hashCode() {
            int iHashCode = (this.f386406c.hashCode() + C23088b.a(JfifUtil.MARKER_EOI, 31, this.f386404a)) * 31;
            Object obj = this.f386407d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            xc0.e eVar = this.f386414k;
            int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            long j12 = this.f386408e;
            int i12 = (iHashCode3 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f386409f;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f386410g;
            int i14 = (((((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f386411h ? 1 : 0)) * 31) + (this.f386412i ? 1 : 0)) * 31) + (this.f386415l ? 1 : 0)) * 31;
            long j15 = this.f386416m;
            int i15 = (i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
            long j16 = this.f386417n;
            int i16 = (((((i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + this.f386418o) * 31) + this.f386419p) * 31;
            long j17 = this.f386420q;
            return i16 + ((int) (j17 ^ (j17 >>> 32)));
        }

        public final boolean a() {
            db.b(this.f386413j == (this.f386414k != null));
            return this.f386414k != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static d a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
            xc0 xc0Var = bundle2 != null ? (xc0) xc0.f391604g.fromBundle(bundle2) : null;
            long j12 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
            long j13 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
            long j14 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
            boolean z12 = bundle.getBoolean(Integer.toString(5, 36), false);
            boolean z13 = bundle.getBoolean(Integer.toString(6, 36), false);
            Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
            xc0.e eVar = bundle3 != null ? (xc0.e) xc0.e.f391643g.fromBundle(bundle3) : null;
            boolean z14 = bundle.getBoolean(Integer.toString(8, 36), false);
            long j15 = bundle.getLong(Integer.toString(9, 36), 0L);
            long j16 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
            int i12 = bundle.getInt(Integer.toString(11, 36), 0);
            int i13 = bundle.getInt(Integer.toString(12, 36), 0);
            long j17 = bundle.getLong(Integer.toString(13, 36), 0L);
            d dVar = new d();
            dVar.a(f386401s, xc0Var, null, j12, j13, j14, z12, z13, eVar, j15, j16, i12, i13, j17);
            dVar.f386415l = z14;
            return dVar;
        }
    }

    public b a(Object obj, b bVar) {
        return a(a(obj), bVar, true);
    }

    public final int a(int i12, b bVar, d dVar, int i13, boolean z12) {
        int i14 = a(i12, bVar, false).f386391c;
        if (a(i14, dVar, 0L).f386419p != i12) {
            return i12 + 1;
        }
        int iA2 = a(i14, i13, z12);
        if (iA2 == -1) {
            return -1;
        }
        return a(iA2, dVar, 0L).f386418o;
    }

    private static i91 a(Bundle bundle) {
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA = a(d.f386403u, qg.a(bundle, Integer.toString(0, 36)));
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA2 = a(b.f386388h, qg.a(bundle, Integer.toString(1, 36)));
        int[] intArray = bundle.getIntArray(Integer.toString(2, 36));
        if (intArray == null) {
            int size = pVarA.size();
            int[] iArr = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = i12;
            }
            intArray = iArr;
        }
        return new c(pVarA, pVarA2, intArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends rg> com.yandex.mobile.ads.embedded.guava.collect.p<T> a(rg.a<T> aVar, @j.P IBinder iBinder) {
        int i12;
        if (iBinder == null) {
            return com.yandex.mobile.ads.embedded.guava.collect.p.i();
        }
        p.a aVar2 = new p.a();
        int i13 = pg.f388811a;
        int i14 = com.yandex.mobile.ads.embedded.guava.collect.p.f382791c;
        p.a aVar3 = new p.a();
        int i15 = 1;
        int i16 = 0;
        while (i15 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i16);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i12 = parcelObtain2.readInt();
                        if (i12 == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            aVar3.b(bundle);
                            i16++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i15 = i12;
                } catch (RemoteException e12) {
                    throw new RuntimeException(e12);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA = aVar3.a();
        for (int i17 = 0; i17 < pVarA.size(); i17++) {
            aVar2.b(aVar.fromBundle((Bundle) pVarA.get(i17)));
        }
        return aVar2.a();
    }
}
