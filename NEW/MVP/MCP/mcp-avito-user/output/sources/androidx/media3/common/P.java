package androidx.media3.common;

import aZ0.InterfaceC19845a;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.media3.common.C23089c;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23113d;
import androidx.media3.common.z;
import com.facebook.imageutils.JfifUtil;
import com.google.common.collect.AbstractC37401r1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: Timeline.java */
/* loaded from: classes.dex */
public abstract class P implements InterfaceC23096j {

    /* renamed from: b, reason: collision with root package name */
    public static final P f47368b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final String f47369c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f47370d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f47371e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final C23088b f47372f;

    /* compiled from: Timeline.java */
    public class a extends P {
        @Override // androidx.media3.common.P
        public final int g(Object obj) {
            return -1;
        }

        @Override // androidx.media3.common.P
        public final b n(int i12, b bVar, boolean z12) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.P
        public final int p() {
            return 0;
        }

        @Override // androidx.media3.common.P
        public final Object t(int i12) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.P
        public final d u(int i12, d dVar, long j12) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.P
        public final int w() {
            return 0;
        }
    }

    /* compiled from: Timeline.java */
    public static final class b implements InterfaceC23096j {

        /* renamed from: i, reason: collision with root package name */
        public static final String f47373i;

        /* renamed from: j, reason: collision with root package name */
        public static final String f47374j;

        /* renamed from: k, reason: collision with root package name */
        public static final String f47375k;

        /* renamed from: l, reason: collision with root package name */
        public static final String f47376l;

        /* renamed from: m, reason: collision with root package name */
        public static final String f47377m;

        /* renamed from: n, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final C23088b f47378n;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public Object f47379b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public Object f47380c;

        /* renamed from: d, reason: collision with root package name */
        public int f47381d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.media3.common.util.J
        public long f47382e;

        /* renamed from: f, reason: collision with root package name */
        @androidx.media3.common.util.J
        public long f47383f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f47384g;

        /* renamed from: h, reason: collision with root package name */
        public C23089c f47385h = C23089c.f47615g;

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f47373i = Integer.toString(0, 36);
            f47374j = Integer.toString(1, 36);
            f47375k = Integer.toString(2, 36);
            f47376l = Integer.toString(3, 36);
            f47377m = Integer.toString(4, 36);
            f47378n = new C23088b(26);
        }

        public final long a(int i12, int i13) {
            C23089c.b bVarA = this.f47385h.a(i12);
            if (bVarA.f47637c != -1) {
                return bVarA.f47641g[i13];
            }
            return -9223372036854775807L;
        }

        public final int b(long j12) {
            int i12;
            C23089c.b bVarA;
            int i13;
            C23089c c23089c = this.f47385h;
            long j13 = this.f47382e;
            c23089c.getClass();
            if (j12 == Long.MIN_VALUE) {
                return -1;
            }
            if (j13 != -9223372036854775807L && j12 >= j13) {
                return -1;
            }
            int i14 = c23089c.f47625e;
            while (true) {
                i12 = c23089c.f47622b;
                if (i14 >= i12 || ((c23089c.a(i14).f47636b == Long.MIN_VALUE || c23089c.a(i14).f47636b > j12) && ((i13 = (bVarA = c23089c.a(i14)).f47637c) == -1 || bVarA.a(-1) < i13))) {
                    break;
                }
                i14++;
            }
            if (i14 < i12) {
                return i14;
            }
            return -1;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return androidx.media3.common.util.M.a(this.f47379b, bVar.f47379b) && androidx.media3.common.util.M.a(this.f47380c, bVar.f47380c) && this.f47381d == bVar.f47381d && this.f47382e == bVar.f47382e && this.f47383f == bVar.f47383f && this.f47384g == bVar.f47384g && androidx.media3.common.util.M.a(this.f47385h, bVar.f47385h);
        }

        public final int g(long j12) {
            C23089c c23089c = this.f47385h;
            long j13 = this.f47382e;
            int i12 = c23089c.f47622b - 1;
            int i13 = i12 - (c23089c.b(i12) ? 1 : 0);
            while (i13 >= 0 && j12 != Long.MIN_VALUE) {
                C23089c.b bVarA = c23089c.a(i13);
                long j14 = bVarA.f47636b;
                if (j14 != Long.MIN_VALUE) {
                    if (j12 >= j14) {
                        break;
                    }
                    i13--;
                } else {
                    if (j13 != -9223372036854775807L && ((!bVarA.f47643i || bVarA.f47637c != -1) && j12 >= j13)) {
                        break;
                    }
                    i13--;
                }
            }
            if (i13 >= 0) {
                C23089c.b bVarA2 = c23089c.a(i13);
                int i14 = bVarA2.f47637c;
                if (i14 == -1) {
                    return i13;
                }
                for (int i15 = 0; i15 < i14; i15++) {
                    int i16 = bVarA2.f47640f[i15];
                    if (i16 == 0 || i16 == 1) {
                        return i13;
                    }
                }
            }
            return -1;
        }

        public final int hashCode() {
            Object obj = this.f47379b;
            int iHashCode = (JfifUtil.MARKER_EOI + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f47380c;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f47381d) * 31;
            long j12 = this.f47382e;
            int i12 = (iHashCode2 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f47383f;
            return this.f47385h.hashCode() + ((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f47384g ? 1 : 0)) * 31);
        }

        public final long j(int i12) {
            return this.f47385h.a(i12).f47636b;
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @androidx.media3.common.util.J
        public final Bundle k() {
            Bundle bundle = new Bundle();
            int i12 = this.f47381d;
            if (i12 != 0) {
                bundle.putInt(f47373i, i12);
            }
            long j12 = this.f47382e;
            if (j12 != -9223372036854775807L) {
                bundle.putLong(f47374j, j12);
            }
            long j13 = this.f47383f;
            if (j13 != 0) {
                bundle.putLong(f47375k, j13);
            }
            boolean z12 = this.f47384g;
            if (z12) {
                bundle.putBoolean(f47376l, z12);
            }
            if (!this.f47385h.equals(C23089c.f47615g)) {
                bundle.putBundle(f47377m, this.f47385h.k());
            }
            return bundle;
        }

        @androidx.media3.common.util.J
        public final int l(int i12, int i13) {
            C23089c.b bVarA = this.f47385h.a(i12);
            if (bVarA.f47637c != -1) {
                return bVarA.f47640f[i13];
            }
            return 0;
        }

        public final int m(int i12) {
            return this.f47385h.a(i12).a(-1);
        }

        @androidx.media3.common.util.J
        public final boolean n(int i12) {
            C23089c c23089c = this.f47385h;
            return i12 == c23089c.f47622b - 1 && c23089c.b(i12);
        }

        @androidx.media3.common.util.J
        public final boolean o(int i12) {
            return this.f47385h.a(i12).f47643i;
        }

        @InterfaceC19845a
        @androidx.media3.common.util.J
        public final void p(@j.P Object obj, @j.P Object obj2, int i12, long j12, long j13, C23089c c23089c, boolean z12) {
            this.f47379b = obj;
            this.f47380c = obj2;
            this.f47381d = i12;
            this.f47382e = j12;
            this.f47383f = j13;
            this.f47385h = c23089c;
            this.f47384g = z12;
        }
    }

    /* compiled from: Timeline.java */
    @androidx.media3.common.util.J
    public static final class c extends P {

        /* renamed from: g, reason: collision with root package name */
        public final AbstractC37401r1<d> f47386g;

        /* renamed from: h, reason: collision with root package name */
        public final AbstractC37401r1<b> f47387h;

        /* renamed from: i, reason: collision with root package name */
        public final int[] f47388i;

        /* renamed from: j, reason: collision with root package name */
        public final int[] f47389j;

        public c(AbstractC37401r1<d> abstractC37401r1, AbstractC37401r1<b> abstractC37401r12, int[] iArr) {
            C23110a.b(abstractC37401r1.size() == iArr.length);
            this.f47386g = abstractC37401r1;
            this.f47387h = abstractC37401r12;
            this.f47388i = iArr;
            this.f47389j = new int[iArr.length];
            for (int i12 = 0; i12 < iArr.length; i12++) {
                this.f47389j[iArr[i12]] = i12;
            }
        }

        @Override // androidx.media3.common.P
        public final int b(boolean z12) {
            if (x()) {
                return -1;
            }
            if (z12) {
                return this.f47388i[0];
            }
            return 0;
        }

        @Override // androidx.media3.common.P
        public final int g(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.common.P
        public final int j(boolean z12) {
            if (x()) {
                return -1;
            }
            AbstractC37401r1<d> abstractC37401r1 = this.f47386g;
            if (!z12) {
                return abstractC37401r1.size() - 1;
            }
            return this.f47388i[abstractC37401r1.size() - 1];
        }

        @Override // androidx.media3.common.P
        public final int m(int i12, int i13, boolean z12) {
            if (i13 == 1) {
                return i12;
            }
            if (i12 == j(z12)) {
                if (i13 == 2) {
                    return b(z12);
                }
                return -1;
            }
            if (!z12) {
                return i12 + 1;
            }
            return this.f47388i[this.f47389j[i12] + 1];
        }

        @Override // androidx.media3.common.P
        public final b n(int i12, b bVar, boolean z12) {
            b bVar2 = this.f47387h.get(i12);
            bVar.p(bVar2.f47379b, bVar2.f47380c, bVar2.f47381d, bVar2.f47382e, bVar2.f47383f, bVar2.f47385h, bVar2.f47384g);
            return bVar;
        }

        @Override // androidx.media3.common.P
        public final int p() {
            return this.f47387h.size();
        }

        @Override // androidx.media3.common.P
        public final int s(int i12, int i13, boolean z12) {
            if (i13 == 1) {
                return i12;
            }
            if (i12 == b(z12)) {
                if (i13 == 2) {
                    return j(z12);
                }
                return -1;
            }
            if (!z12) {
                return i12 - 1;
            }
            return this.f47388i[this.f47389j[i12] - 1];
        }

        @Override // androidx.media3.common.P
        public final Object t(int i12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.common.P
        public final d u(int i12, d dVar, long j12) {
            d dVar2 = this.f47386g.get(i12);
            dVar.b(dVar2.f47407b, dVar2.f47409d, dVar2.f47410e, dVar2.f47411f, dVar2.f47412g, dVar2.f47413h, dVar2.f47414i, dVar2.f47415j, dVar2.f47417l, dVar2.f47419n, dVar2.f47420o, dVar2.f47421p, dVar2.f47422q, dVar2.f47423r);
            dVar.f47418m = dVar2.f47418m;
            return dVar;
        }

        @Override // androidx.media3.common.P
        public final int w() {
            return this.f47386g.size();
        }
    }

    /* compiled from: Timeline.java */
    public static final class d implements InterfaceC23096j {

        /* renamed from: A, reason: collision with root package name */
        public static final String f47390A;

        /* renamed from: B, reason: collision with root package name */
        public static final String f47391B;

        /* renamed from: C, reason: collision with root package name */
        public static final String f47392C;

        /* renamed from: D, reason: collision with root package name */
        public static final String f47393D;

        /* renamed from: E, reason: collision with root package name */
        public static final String f47394E;

        /* renamed from: F, reason: collision with root package name */
        public static final String f47395F;

        /* renamed from: G, reason: collision with root package name */
        public static final String f47396G;

        /* renamed from: H, reason: collision with root package name */
        public static final String f47397H;

        /* renamed from: I, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final C23088b f47398I;

        /* renamed from: s, reason: collision with root package name */
        public static final Object f47399s = new Object();

        /* renamed from: t, reason: collision with root package name */
        public static final Object f47400t = new Object();

        /* renamed from: u, reason: collision with root package name */
        public static final z f47401u;

        /* renamed from: v, reason: collision with root package name */
        public static final String f47402v;

        /* renamed from: w, reason: collision with root package name */
        public static final String f47403w;

        /* renamed from: x, reason: collision with root package name */
        public static final String f47404x;

        /* renamed from: y, reason: collision with root package name */
        public static final String f47405y;

        /* renamed from: z, reason: collision with root package name */
        public static final String f47406z;

        /* renamed from: c, reason: collision with root package name */
        @androidx.media3.common.util.J
        @j.P
        @Deprecated
        public Object f47408c;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public Object f47410e;

        /* renamed from: f, reason: collision with root package name */
        public long f47411f;

        /* renamed from: g, reason: collision with root package name */
        public long f47412g;

        /* renamed from: h, reason: collision with root package name */
        public long f47413h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f47414i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f47415j;

        /* renamed from: k, reason: collision with root package name */
        @androidx.media3.common.util.J
        @Deprecated
        public boolean f47416k;

        /* renamed from: l, reason: collision with root package name */
        @j.P
        public z.g f47417l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f47418m;

        /* renamed from: n, reason: collision with root package name */
        @androidx.media3.common.util.J
        public long f47419n;

        /* renamed from: o, reason: collision with root package name */
        @androidx.media3.common.util.J
        public long f47420o;

        /* renamed from: p, reason: collision with root package name */
        public int f47421p;

        /* renamed from: q, reason: collision with root package name */
        public int f47422q;

        /* renamed from: r, reason: collision with root package name */
        @androidx.media3.common.util.J
        public long f47423r;

        /* renamed from: b, reason: collision with root package name */
        public Object f47407b = f47399s;

        /* renamed from: d, reason: collision with root package name */
        public z f47409d = f47401u;

        static {
            z.c cVar = new z.c();
            cVar.f47988a = "androidx.media3.common.Timeline";
            cVar.f47989b = Uri.EMPTY;
            f47401u = cVar.a();
            int i12 = androidx.media3.common.util.M.f47887a;
            f47402v = Integer.toString(1, 36);
            f47403w = Integer.toString(2, 36);
            f47404x = Integer.toString(3, 36);
            f47405y = Integer.toString(4, 36);
            f47406z = Integer.toString(5, 36);
            f47390A = Integer.toString(6, 36);
            f47391B = Integer.toString(7, 36);
            f47392C = Integer.toString(8, 36);
            f47393D = Integer.toString(9, 36);
            f47394E = Integer.toString(10, 36);
            f47395F = Integer.toString(11, 36);
            f47396G = Integer.toString(12, 36);
            f47397H = Integer.toString(13, 36);
            f47398I = new C23088b(27);
        }

        public final boolean a() {
            C23110a.g(this.f47416k == (this.f47417l != null));
            return this.f47417l != null;
        }

        @InterfaceC19845a
        @androidx.media3.common.util.J
        public final void b(Object obj, @j.P z zVar, @j.P Object obj2, long j12, long j13, long j14, boolean z12, boolean z13, @j.P z.g gVar, long j15, long j16, int i12, int i13, long j17) {
            z.h hVar;
            this.f47407b = obj;
            this.f47409d = zVar != null ? zVar : f47401u;
            this.f47408c = (zVar == null || (hVar = zVar.f47979c) == null) ? null : hVar.f48076i;
            this.f47410e = obj2;
            this.f47411f = j12;
            this.f47412g = j13;
            this.f47413h = j14;
            this.f47414i = z12;
            this.f47415j = z13;
            this.f47416k = gVar != null;
            this.f47417l = gVar;
            this.f47419n = j15;
            this.f47420o = j16;
            this.f47421p = i12;
            this.f47422q = i13;
            this.f47423r = j17;
            this.f47418m = false;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return androidx.media3.common.util.M.a(this.f47407b, dVar.f47407b) && androidx.media3.common.util.M.a(this.f47409d, dVar.f47409d) && androidx.media3.common.util.M.a(this.f47410e, dVar.f47410e) && androidx.media3.common.util.M.a(this.f47417l, dVar.f47417l) && this.f47411f == dVar.f47411f && this.f47412g == dVar.f47412g && this.f47413h == dVar.f47413h && this.f47414i == dVar.f47414i && this.f47415j == dVar.f47415j && this.f47418m == dVar.f47418m && this.f47419n == dVar.f47419n && this.f47420o == dVar.f47420o && this.f47421p == dVar.f47421p && this.f47422q == dVar.f47422q && this.f47423r == dVar.f47423r;
        }

        public final int hashCode() {
            int iHashCode = (this.f47409d.hashCode() + C23088b.a(JfifUtil.MARKER_EOI, 31, this.f47407b)) * 31;
            Object obj = this.f47410e;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            z.g gVar = this.f47417l;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j12 = this.f47411f;
            int i12 = (iHashCode3 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f47412g;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f47413h;
            int i14 = (((((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f47414i ? 1 : 0)) * 31) + (this.f47415j ? 1 : 0)) * 31) + (this.f47418m ? 1 : 0)) * 31;
            long j15 = this.f47419n;
            int i15 = (i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
            long j16 = this.f47420o;
            int i16 = (((((i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + this.f47421p) * 31) + this.f47422q) * 31;
            long j17 = this.f47423r;
            return i16 + ((int) (j17 ^ (j17 >>> 32)));
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @androidx.media3.common.util.J
        public final Bundle k() {
            Bundle bundle = new Bundle();
            if (!z.f47970h.equals(this.f47409d)) {
                bundle.putBundle(f47402v, this.f47409d.a(false));
            }
            long j12 = this.f47411f;
            if (j12 != -9223372036854775807L) {
                bundle.putLong(f47403w, j12);
            }
            long j13 = this.f47412g;
            if (j13 != -9223372036854775807L) {
                bundle.putLong(f47404x, j13);
            }
            long j14 = this.f47413h;
            if (j14 != -9223372036854775807L) {
                bundle.putLong(f47405y, j14);
            }
            boolean z12 = this.f47414i;
            if (z12) {
                bundle.putBoolean(f47406z, z12);
            }
            boolean z13 = this.f47415j;
            if (z13) {
                bundle.putBoolean(f47390A, z13);
            }
            z.g gVar = this.f47417l;
            if (gVar != null) {
                bundle.putBundle(f47391B, gVar.k());
            }
            boolean z14 = this.f47418m;
            if (z14) {
                bundle.putBoolean(f47392C, z14);
            }
            long j15 = this.f47419n;
            if (j15 != 0) {
                bundle.putLong(f47393D, j15);
            }
            long j16 = this.f47420o;
            if (j16 != -9223372036854775807L) {
                bundle.putLong(f47394E, j16);
            }
            int i12 = this.f47421p;
            if (i12 != 0) {
                bundle.putInt(f47395F, i12);
            }
            int i13 = this.f47422q;
            if (i13 != 0) {
                bundle.putInt(f47396G, i13);
            }
            long j17 = this.f47423r;
            if (j17 != 0) {
                bundle.putLong(f47397H, j17);
            }
            return bundle;
        }
    }

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47369c = Integer.toString(0, 36);
        f47370d = Integer.toString(1, 36);
        f47371e = Integer.toString(2, 36);
        f47372f = new C23088b(25);
    }

    @androidx.media3.common.util.J
    public P() {
    }

    public static <T extends InterfaceC23096j> AbstractC37401r1<T> a(InterfaceC23096j.a<T> aVar, @j.P IBinder iBinder) {
        if (iBinder == null) {
            return AbstractC37401r1.C();
        }
        AbstractC37401r1.a aVar2 = new AbstractC37401r1.a();
        AbstractC37401r1<Bundle> abstractC37401r1A = BinderC23095i.a(iBinder);
        for (int i12 = 0; i12 < abstractC37401r1A.size(); i12++) {
            aVar2.g(aVar.fromBundle(abstractC37401r1A.get(i12)));
        }
        return aVar2.i();
    }

    public int b(boolean z12) {
        return x() ? -1 : 0;
    }

    public boolean equals(@j.P Object obj) {
        int iJ2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p12 = (P) obj;
        if (p12.w() != w() || p12.p() != p()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i12 = 0; i12 < w(); i12++) {
            if (!u(i12, dVar, 0L).equals(p12.u(i12, dVar2, 0L))) {
                return false;
            }
        }
        for (int i13 = 0; i13 < p(); i13++) {
            if (!n(i13, bVar, true).equals(p12.n(i13, bVar2, true))) {
                return false;
            }
        }
        int iB2 = b(true);
        if (iB2 != p12.b(true) || (iJ2 = j(true)) != p12.j(true)) {
            return false;
        }
        while (iB2 != iJ2) {
            int iM2 = m(iB2, 0, true);
            if (iM2 != p12.m(iB2, 0, true)) {
                return false;
            }
            iB2 = iM2;
        }
        return true;
    }

    public abstract int g(Object obj);

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iW2 = w() + JfifUtil.MARKER_EOI;
        for (int i12 = 0; i12 < w(); i12++) {
            iW2 = (iW2 * 31) + u(i12, dVar, 0L).hashCode();
        }
        int iP2 = p() + (iW2 * 31);
        for (int i13 = 0; i13 < p(); i13++) {
            iP2 = (iP2 * 31) + n(i13, bVar, true).hashCode();
        }
        int iB2 = b(true);
        while (iB2 != -1) {
            iP2 = (iP2 * 31) + iB2;
            iB2 = m(iB2, 0, true);
        }
        return iP2;
    }

    public int j(boolean z12) {
        if (x()) {
            return -1;
        }
        return w() - 1;
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        int iW2 = w();
        d dVar = new d();
        for (int i12 = 0; i12 < iW2; i12++) {
            arrayList.add(u(i12, dVar, 0L).k());
        }
        ArrayList arrayList2 = new ArrayList();
        int iP2 = p();
        b bVar = new b();
        for (int i13 = 0; i13 < iP2; i13++) {
            arrayList2.add(n(i13, bVar, false).k());
        }
        int[] iArr = new int[iW2];
        if (iW2 > 0) {
            iArr[0] = b(true);
        }
        for (int i14 = 1; i14 < iW2; i14++) {
            iArr[i14] = m(iArr[i14 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        C23113d.b(bundle, f47369c, new BinderC23095i(arrayList));
        C23113d.b(bundle, f47370d, new BinderC23095i(arrayList2));
        bundle.putIntArray(f47371e, iArr);
        return bundle;
    }

    public final int l(int i12, b bVar, d dVar, int i13, boolean z12) {
        int i14 = n(i12, bVar, false).f47381d;
        if (u(i14, dVar, 0L).f47422q != i12) {
            return i12 + 1;
        }
        int iM2 = m(i14, i13, z12);
        if (iM2 == -1) {
            return -1;
        }
        return u(iM2, dVar, 0L).f47421p;
    }

    public int m(int i12, int i13, boolean z12) {
        if (i13 == 0) {
            if (i12 == j(z12)) {
                return -1;
            }
            return i12 + 1;
        }
        if (i13 == 1) {
            return i12;
        }
        if (i13 == 2) {
            return i12 == j(z12) ? b(z12) : i12 + 1;
        }
        throw new IllegalStateException();
    }

    public abstract b n(int i12, b bVar, boolean z12);

    public b o(Object obj, b bVar) {
        return n(g(obj), bVar, true);
    }

    public abstract int p();

    public final Pair<Object, Long> q(d dVar, b bVar, int i12, long j12) {
        Pair<Object, Long> pairR = r(dVar, bVar, i12, j12, 0L);
        pairR.getClass();
        return pairR;
    }

    @j.P
    public final Pair<Object, Long> r(d dVar, b bVar, int i12, long j12, long j13) {
        C23110a.c(i12, w());
        u(i12, dVar, j13);
        if (j12 == -9223372036854775807L) {
            j12 = dVar.f47419n;
            if (j12 == -9223372036854775807L) {
                return null;
            }
        }
        int i13 = dVar.f47421p;
        n(i13, bVar, false);
        while (i13 < dVar.f47422q && bVar.f47383f != j12) {
            int i14 = i13 + 1;
            if (n(i14, bVar, false).f47383f > j12) {
                break;
            }
            i13 = i14;
        }
        n(i13, bVar, true);
        long jMin = j12 - bVar.f47383f;
        long j14 = bVar.f47382e;
        if (j14 != -9223372036854775807L) {
            jMin = Math.min(jMin, j14 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = bVar.f47380c;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int s(int i12, int i13, boolean z12) {
        if (i13 == 0) {
            if (i12 == b(z12)) {
                return -1;
            }
            return i12 - 1;
        }
        if (i13 == 1) {
            return i12;
        }
        if (i13 == 2) {
            return i12 == b(z12) ? j(z12) : i12 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object t(int i12);

    public abstract d u(int i12, d dVar, long j12);

    public final void v(int i12, d dVar) {
        u(i12, dVar, 0L);
    }

    public abstract int w();

    public final boolean x() {
        return w() == 0;
    }
}
