package androidx.media3.exoplayer.trackselection;

import aZ0.InterfaceC19845a;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23108t;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.Q;
import androidx.media3.common.T;
import androidx.media3.common.U;
import androidx.media3.common.util.C23114e;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.c0;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.source.Y;
import androidx.media3.exoplayer.trackselection.a;
import androidx.media3.exoplayer.trackselection.k;
import androidx.media3.exoplayer.trackselection.m;
import androidx.media3.exoplayer.trackselection.r;
import com.adjust.sdk.network.ErrorCodes;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37429w3;
import com.google.common.collect.S;
import j.B;
import j.P;
import j.X;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.webrtc.MediaStreamTrack;

/* compiled from: DefaultTrackSelector.java */
@J
/* loaded from: classes.dex */
public class g extends m implements d0.f {

    /* renamed from: j, reason: collision with root package name */
    public static final AbstractC37429w3<Integer> f49906j = AbstractC37429w3.b(new androidx.media3.exoplayer.trackselection.d(6));

    /* renamed from: k, reason: collision with root package name */
    public static final AbstractC37429w3<Integer> f49907k = AbstractC37429w3.b(new androidx.media3.exoplayer.trackselection.d(7));

    /* renamed from: c, reason: collision with root package name */
    public final Object f49908c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final Context f49909d;

    /* renamed from: e, reason: collision with root package name */
    public final a.b f49910e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f49911f;

    /* renamed from: g, reason: collision with root package name */
    @B
    public d f49912g;

    /* renamed from: h, reason: collision with root package name */
    @B
    @P
    public final C1838g f49913h;

    /* renamed from: i, reason: collision with root package name */
    @B
    public C23091e f49914i;

    /* compiled from: DefaultTrackSelector.java */
    public static final class b extends i<b> implements Comparable<b> {

        /* renamed from: f, reason: collision with root package name */
        public final int f49915f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f49916g;

        /* renamed from: h, reason: collision with root package name */
        @P
        public final String f49917h;

        /* renamed from: i, reason: collision with root package name */
        public final d f49918i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f49919j;

        /* renamed from: k, reason: collision with root package name */
        public final int f49920k;

        /* renamed from: l, reason: collision with root package name */
        public final int f49921l;

        /* renamed from: m, reason: collision with root package name */
        public final int f49922m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f49923n;

        /* renamed from: o, reason: collision with root package name */
        public final int f49924o;

        /* renamed from: p, reason: collision with root package name */
        public final int f49925p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f49926q;

        /* renamed from: r, reason: collision with root package name */
        public final int f49927r;

        /* renamed from: s, reason: collision with root package name */
        public final int f49928s;

        /* renamed from: t, reason: collision with root package name */
        public final int f49929t;

        /* renamed from: u, reason: collision with root package name */
        public final int f49930u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f49931v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f49932w;

        public b(int i12, Q q12, int i13, d dVar, int i14, boolean z12, androidx.media3.exoplayer.trackselection.f fVar) {
            int i15;
            int iL2;
            int iL3;
            boolean z13;
            super(i12, q12, i13);
            this.f49918i = dVar;
            this.f49917h = g.o(this.f50010e.f47748d);
            int i16 = 0;
            this.f49919j = g.m(i14, false);
            int i17 = 0;
            while (true) {
                i15 = Integer.MAX_VALUE;
                if (i17 >= dVar.f47497o.size()) {
                    iL2 = 0;
                    i17 = Integer.MAX_VALUE;
                    break;
                } else {
                    iL2 = g.l(this.f50010e, dVar.f47497o.get(i17), false);
                    if (iL2 > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f49921l = i17;
            this.f49920k = iL2;
            this.f49922m = g.j(this.f50010e.f47750f, dVar.f47498p);
            C23108t c23108t = this.f50010e;
            int i18 = c23108t.f47750f;
            this.f49923n = i18 == 0 || (i18 & 1) != 0;
            this.f49926q = (c23108t.f47749e & 1) != 0;
            int i19 = c23108t.f47770z;
            this.f49927r = i19;
            this.f49928s = c23108t.f47737A;
            int i22 = c23108t.f47753i;
            this.f49929t = i22;
            this.f49916g = (i22 == -1 || i22 <= dVar.f47500r) && (i19 == -1 || i19 <= dVar.f47499q) && fVar.apply(c23108t);
            String[] strArrW = M.w();
            int i23 = 0;
            while (true) {
                if (i23 >= strArrW.length) {
                    iL3 = 0;
                    i23 = Integer.MAX_VALUE;
                    break;
                } else {
                    iL3 = g.l(this.f50010e, strArrW[i23], false);
                    if (iL3 > 0) {
                        break;
                    } else {
                        i23++;
                    }
                }
            }
            this.f49924o = i23;
            this.f49925p = iL3;
            int i24 = 0;
            while (true) {
                AbstractC37401r1<String> abstractC37401r1 = dVar.f47501s;
                if (i24 < abstractC37401r1.size()) {
                    String str = this.f50010e.f47757m;
                    if (str != null && str.equals(abstractC37401r1.get(i24))) {
                        i15 = i24;
                        break;
                    }
                    i24++;
                } else {
                    break;
                }
            }
            this.f49930u = i15;
            this.f49931v = d0.h(i14) == 128;
            this.f49932w = d0.g(i14) == 64;
            d dVar2 = this.f49918i;
            if (g.m(i14, dVar2.f49964m0) && ((z13 = this.f49916g) || dVar2.f49958g0)) {
                i16 = (!g.m(i14, false) || !z13 || this.f50010e.f47753i == -1 || dVar2.f47507y || dVar2.f47506x || (!dVar2.f49966o0 && z12)) ? 1 : 2;
            }
            this.f49915f = i16;
        }

        @Override // androidx.media3.exoplayer.trackselection.g.i
        public final int a() {
            return this.f49915f;
        }

        @Override // androidx.media3.exoplayer.trackselection.g.i
        public final boolean b(i iVar) {
            int i12;
            String str;
            int i13;
            b bVar = (b) iVar;
            d dVar = this.f49918i;
            boolean z12 = dVar.f49961j0;
            C23108t c23108t = bVar.f50010e;
            C23108t c23108t2 = this.f50010e;
            if ((z12 || ((i13 = c23108t2.f47770z) != -1 && i13 == c23108t.f47770z)) && ((dVar.f49959h0 || ((str = c23108t2.f47757m) != null && TextUtils.equals(str, c23108t.f47757m))) && (dVar.f49960i0 || ((i12 = c23108t2.f47737A) != -1 && i12 == c23108t.f47737A)))) {
                if (!dVar.f49962k0) {
                    if (this.f49931v != bVar.f49931v || this.f49932w != bVar.f49932w) {
                    }
                }
                return true;
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            boolean z12 = this.f49919j;
            boolean z13 = this.f49916g;
            Object objH = (z13 && z12) ? g.f49906j : g.f49906j.h();
            S sC2 = S.f359569a.d(z12, bVar.f49919j).c(Integer.valueOf(this.f49921l), Integer.valueOf(bVar.f49921l), AbstractC37429w3.d().h()).a(this.f49920k, bVar.f49920k).a(this.f49922m, bVar.f49922m).d(this.f49926q, bVar.f49926q).d(this.f49923n, bVar.f49923n).c(Integer.valueOf(this.f49924o), Integer.valueOf(bVar.f49924o), AbstractC37429w3.d().h()).a(this.f49925p, bVar.f49925p).d(z13, bVar.f49916g).c(Integer.valueOf(this.f49930u), Integer.valueOf(bVar.f49930u), AbstractC37429w3.d().h());
            int i12 = this.f49929t;
            Integer numValueOf = Integer.valueOf(i12);
            int i13 = bVar.f49929t;
            S sC3 = sC2.c(numValueOf, Integer.valueOf(i13), this.f49918i.f47506x ? g.f49906j.h() : g.f49907k).d(this.f49931v, bVar.f49931v).d(this.f49932w, bVar.f49932w).c(Integer.valueOf(this.f49927r), Integer.valueOf(bVar.f49927r), objH).c(Integer.valueOf(this.f49928s), Integer.valueOf(bVar.f49928s), objH);
            Integer numValueOf2 = Integer.valueOf(i12);
            Integer numValueOf3 = Integer.valueOf(i13);
            if (!M.a(this.f49917h, bVar.f49917h)) {
                objH = g.f49907k;
            }
            return sC3.c(numValueOf2, numValueOf3, objH).f();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class c implements Comparable<c> {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f49933b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f49934c;

        public c(C23108t c23108t, int i12) {
            this.f49933b = (c23108t.f47749e & 1) != 0;
            this.f49934c = g.m(i12, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            return S.f359569a.d(this.f49934c, cVar2.f49934c).d(this.f49933b, cVar2.f49933b).f();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    @Deprecated
    public static final class e extends U.a {

        /* renamed from: A, reason: collision with root package name */
        public final d.a f49986A = new d.a();

        @Deprecated
        public e() {
        }

        @Override // androidx.media3.common.U.a
        @InterfaceC19845a
        public final void a(T t12) {
            this.f49986A.f47533y.put(t12.f47454b, t12);
        }

        @Override // androidx.media3.common.U.a
        public final U b() {
            return this.f49986A.b();
        }

        @Override // androidx.media3.common.U.a
        @InterfaceC19845a
        public final U.a c() {
            this.f49986A.h();
            return this;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class f implements InterfaceC23096j {

        /* renamed from: e, reason: collision with root package name */
        public static final String f49987e;

        /* renamed from: f, reason: collision with root package name */
        public static final String f49988f;

        /* renamed from: g, reason: collision with root package name */
        public static final String f49989g;

        /* renamed from: h, reason: collision with root package name */
        @J
        public static final androidx.media3.exoplayer.trackselection.h f49990h;

        /* renamed from: b, reason: collision with root package name */
        public final int f49991b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f49992c;

        /* renamed from: d, reason: collision with root package name */
        public final int f49993d;

        static {
            int i12 = M.f47887a;
            f49987e = Integer.toString(0, 36);
            f49988f = Integer.toString(1, 36);
            f49989g = Integer.toString(2, 36);
            f49990h = new androidx.media3.exoplayer.trackselection.h();
        }

        @J
        public f(int i12, int i13, int[] iArr) {
            this.f49991b = i12;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f49992c = iArrCopyOf;
            this.f49993d = i13;
            Arrays.sort(iArrCopyOf);
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f49991b == fVar.f49991b && Arrays.equals(this.f49992c, fVar.f49992c) && this.f49993d == fVar.f49993d;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f49992c) + (this.f49991b * 31)) * 31) + this.f49993d;
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @J
        public final Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putInt(f49987e, this.f49991b);
            bundle.putIntArray(f49988f, this.f49992c);
            bundle.putInt(f49989g, this.f49993d);
            return bundle;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    @X
    /* renamed from: androidx.media3.exoplayer.trackselection.g$g, reason: collision with other inner class name */
    public static class C1838g {

        /* renamed from: a, reason: collision with root package name */
        public final Spatializer f49994a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f49995b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public Handler f49996c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public Spatializer$OnSpatializerStateChangedListener f49997d;

        public C1838g(Spatializer spatializer) {
            this.f49994a = spatializer;
            this.f49995b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public final boolean a(C23091e c23091e, C23108t c23108t) throws IllegalArgumentException {
            boolean zEquals = "audio/eac3-joc".equals(c23108t.f47757m);
            int i12 = c23108t.f47770z;
            if (zEquals && i12 == 16) {
                i12 = 12;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(M.p(i12));
            int i13 = c23108t.f47737A;
            if (i13 != -1) {
                channelMask.setSampleRate(i13);
            }
            return this.f49994a.canBeSpatialized(c23091e.a().f47657a, channelMask.build());
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class h extends i<h> implements Comparable<h> {

        /* renamed from: f, reason: collision with root package name */
        public final int f49998f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f49999g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f50000h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f50001i;

        /* renamed from: j, reason: collision with root package name */
        public final int f50002j;

        /* renamed from: k, reason: collision with root package name */
        public final int f50003k;

        /* renamed from: l, reason: collision with root package name */
        public final int f50004l;

        /* renamed from: m, reason: collision with root package name */
        public final int f50005m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f50006n;

        public h(int i12, Q q12, int i13, d dVar, int i14, @P String str) {
            int iL2;
            super(i12, q12, i13);
            int i15 = 0;
            this.f49999g = g.m(i14, false);
            int i16 = this.f50010e.f47749e & (~dVar.f47504v);
            this.f50000h = (i16 & 1) != 0;
            this.f50001i = (i16 & 2) != 0;
            AbstractC37401r1<String> abstractC37401r1 = dVar.f47502t;
            AbstractC37401r1<String> abstractC37401r1E = abstractC37401r1.isEmpty() ? AbstractC37401r1.E("") : abstractC37401r1;
            int i17 = 0;
            while (true) {
                if (i17 >= abstractC37401r1E.size()) {
                    i17 = Integer.MAX_VALUE;
                    iL2 = 0;
                    break;
                } else {
                    iL2 = g.l(this.f50010e, abstractC37401r1E.get(i17), dVar.f47505w);
                    if (iL2 > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f50002j = i17;
            this.f50003k = iL2;
            int iJ2 = g.j(this.f50010e.f47750f, dVar.f47503u);
            this.f50004l = iJ2;
            this.f50006n = (this.f50010e.f47750f & 1088) != 0;
            int iL3 = g.l(this.f50010e, str, g.o(str) == null);
            this.f50005m = iL3;
            boolean z12 = iL2 > 0 || (abstractC37401r1.isEmpty() && iJ2 > 0) || this.f50000h || (this.f50001i && iL3 > 0);
            if (g.m(i14, dVar.f49964m0) && z12) {
                i15 = 1;
            }
            this.f49998f = i15;
        }

        @Override // androidx.media3.exoplayer.trackselection.g.i
        public final int a() {
            return this.f49998f;
        }

        @Override // androidx.media3.exoplayer.trackselection.g.i
        public final /* bridge */ /* synthetic */ boolean b(i iVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(h hVar) {
            S sC2 = S.f359569a.d(this.f49999g, hVar.f49999g).c(Integer.valueOf(this.f50002j), Integer.valueOf(hVar.f50002j), AbstractC37429w3.d().h());
            int i12 = this.f50003k;
            S sA2 = sC2.a(i12, hVar.f50003k);
            int i13 = this.f50004l;
            S sA3 = sA2.a(i13, hVar.f50004l).d(this.f50000h, hVar.f50000h).c(Boolean.valueOf(this.f50001i), Boolean.valueOf(hVar.f50001i), i12 == 0 ? AbstractC37429w3.d() : AbstractC37429w3.d().h()).a(this.f50005m, hVar.f50005m);
            if (i13 == 0) {
                sA3 = sA3.e(this.f50006n, hVar.f50006n);
            }
            return sA3.f();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static abstract class i<T extends i<T>> {

        /* renamed from: b, reason: collision with root package name */
        public final int f50007b;

        /* renamed from: c, reason: collision with root package name */
        public final Q f50008c;

        /* renamed from: d, reason: collision with root package name */
        public final int f50009d;

        /* renamed from: e, reason: collision with root package name */
        public final C23108t f50010e;

        /* compiled from: DefaultTrackSelector.java */
        public interface a<T extends i<T>> {
            List<T> a(int i12, Q q12, int[] iArr);
        }

        public i(int i12, Q q12, int i13) {
            this.f50007b = i12;
            this.f50008c = q12;
            this.f50009d = i13;
            this.f50010e = q12.f47442e[i13];
        }

        public abstract int a();

        public abstract boolean b(T t12);
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class j extends i<j> {

        /* renamed from: f, reason: collision with root package name */
        public final boolean f50011f;

        /* renamed from: g, reason: collision with root package name */
        public final d f50012g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f50013h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f50014i;

        /* renamed from: j, reason: collision with root package name */
        public final int f50015j;

        /* renamed from: k, reason: collision with root package name */
        public final int f50016k;

        /* renamed from: l, reason: collision with root package name */
        public final int f50017l;

        /* renamed from: m, reason: collision with root package name */
        public final int f50018m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f50019n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f50020o;

        /* renamed from: p, reason: collision with root package name */
        public final int f50021p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f50022q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f50023r;

        /* renamed from: s, reason: collision with root package name */
        public final int f50024s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public j(int r8, androidx.media3.common.Q r9, int r10, androidx.media3.exoplayer.trackselection.g.d r11, int r12, int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.g.j.<init>(int, androidx.media3.common.Q, int, androidx.media3.exoplayer.trackselection.g$d, int, int, boolean):void");
        }

        @Override // androidx.media3.exoplayer.trackselection.g.i
        public final int a() {
            return this.f50021p;
        }

        @Override // androidx.media3.exoplayer.trackselection.g.i
        public final boolean b(i iVar) {
            j jVar = (j) iVar;
            if (this.f50020o || M.a(this.f50010e.f47757m, jVar.f50010e.f47757m)) {
                if (!this.f50012g.f49957f0) {
                    if (this.f50022q != jVar.f50022q || this.f50023r != jVar.f50023r) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    public g(Context context) {
        a.b bVar = new a.b();
        d dVar = d.f49946s0;
        d dVarB = new d.a(context).b();
        this.f49908c = new Object();
        this.f49909d = context != null ? context.getApplicationContext() : null;
        this.f49910e = bVar;
        this.f49912g = dVarB;
        this.f49914i = C23091e.f47644h;
        boolean z12 = context != null && M.D(context);
        this.f49911f = z12;
        if (!z12 && context != null && M.f47887a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            this.f49913h = audioManager != null ? new C1838g(audioManager.getSpatializer()) : null;
        }
        if (this.f49912g.f49963l0 && context == null) {
            androidx.media3.common.util.s.g();
        }
    }

    public static int j(int i12, int i13) {
        if (i12 == 0 || i12 != i13) {
            return Integer.bitCount(i12 & i13);
        }
        return Integer.MAX_VALUE;
    }

    public static void k(Y y12, U u12, HashMap map) {
        for (int i12 = 0; i12 < y12.f49708b; i12++) {
            T t12 = u12.f47508z.get(y12.a(i12));
            if (t12 != null) {
                Q q12 = t12.f47454b;
                T t13 = (T) map.get(Integer.valueOf(q12.f47441d));
                if (t13 == null || (t13.f47455c.isEmpty() && !t12.f47455c.isEmpty())) {
                    map.put(Integer.valueOf(q12.f47441d), t12);
                }
            }
        }
    }

    public static int l(C23108t c23108t, @P String str, boolean z12) {
        if (!TextUtils.isEmpty(str) && str.equals(c23108t.f47748d)) {
            return 4;
        }
        String strO = o(str);
        String strO2 = o(c23108t.f47748d);
        if (strO2 == null || strO == null) {
            return (z12 && strO2 == null) ? 1 : 0;
        }
        if (strO2.startsWith(strO) || strO.startsWith(strO2)) {
            return 3;
        }
        int i12 = M.f47887a;
        return strO2.split("-", 2)[0].equals(strO.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean m(int i12, boolean z12) {
        int i13 = i12 & 7;
        return i13 == 4 || (z12 && i13 == 3);
    }

    @P
    public static String o(@P String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    @P
    public static Pair p(int i12, m.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        RandomAccess randomAccessE;
        boolean z12;
        m.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (i13 < aVar3.f50028a) {
            if (i12 == aVar3.f50029b[i13]) {
                Y y12 = aVar3.f50030c[i13];
                for (int i14 = 0; i14 < y12.f49708b; i14++) {
                    Q qA2 = y12.a(i14);
                    List listA = aVar2.a(i13, qA2, iArr[i13][i14]);
                    int i15 = qA2.f47439b;
                    boolean[] zArr = new boolean[i15];
                    for (int i16 = 0; i16 < i15; i16++) {
                        i iVar = (i) listA.get(i16);
                        int iA2 = iVar.a();
                        if (!zArr[i16] && iA2 != 0) {
                            if (iA2 == 1) {
                                randomAccessE = AbstractC37401r1.E(iVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                for (int i17 = i16 + 1; i17 < i15; i17++) {
                                    i iVar2 = (i) listA.get(i17);
                                    if (iVar2.a() == 2 && iVar.b(iVar2)) {
                                        arrayList2.add(iVar2);
                                        z12 = true;
                                        zArr[i17] = true;
                                    } else {
                                        z12 = true;
                                    }
                                }
                                randomAccessE = arrayList2;
                            }
                            arrayList.add(randomAccessE);
                        }
                    }
                }
            }
            i13++;
            aVar3 = aVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((i) list.get(i18)).f50009d;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new k.a(0, iVar3.f50008c, iArr2), Integer.valueOf(iVar3.f50007b));
    }

    @Override // androidx.media3.exoplayer.d0.f
    public final void a(c0 c0Var) {
        boolean z12;
        r.a aVar;
        synchronized (this.f49908c) {
            z12 = this.f49912g.f49967p0;
        }
        if (!z12 || (aVar = this.f50035a) == null) {
            return;
        }
        aVar.c();
    }

    @Override // androidx.media3.exoplayer.trackselection.r
    public final U b() {
        d dVar;
        synchronized (this.f49908c) {
            dVar = this.f49912g;
        }
        return dVar;
    }

    @Override // androidx.media3.exoplayer.trackselection.r
    public final void e() {
        C1838g c1838g;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        synchronized (this.f49908c) {
            try {
                if (M.f47887a >= 32 && (c1838g = this.f49913h) != null && (spatializer$OnSpatializerStateChangedListener = c1838g.f49997d) != null && c1838g.f49996c != null) {
                    c1838g.f49994a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
                    c1838g.f49996c.removeCallbacksAndMessages(null);
                    c1838g.f49996c = null;
                    c1838g.f49997d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.e();
    }

    @Override // androidx.media3.exoplayer.trackselection.r
    public final void g(C23091e c23091e) {
        boolean zEquals;
        synchronized (this.f49908c) {
            zEquals = this.f49914i.equals(c23091e);
            this.f49914i = c23091e;
        }
        if (zEquals) {
            return;
        }
        n();
    }

    @Override // androidx.media3.exoplayer.trackselection.r
    public final void h(U u12) {
        d dVar;
        if (u12 instanceof d) {
            q((d) u12);
        }
        synchronized (this.f49908c) {
            dVar = this.f49912g;
        }
        d.a aVar = new d.a(dVar, (a) null);
        aVar.d(u12);
        q(aVar.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ce  */
    @Override // androidx.media3.exoplayer.trackselection.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<androidx.media3.exoplayer.e0[], androidx.media3.exoplayer.trackselection.k[]> i(androidx.media3.exoplayer.trackselection.m.a r33, int[][][] r34, final int[] r35, androidx.media3.exoplayer.source.A.b r36, androidx.media3.common.P r37) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.g.i(androidx.media3.exoplayer.trackselection.m$a, int[][][], int[], androidx.media3.exoplayer.source.A$b, androidx.media3.common.P):android.util.Pair");
    }

    public final void n() {
        boolean z12;
        r.a aVar;
        C1838g c1838g;
        synchronized (this.f49908c) {
            try {
                z12 = this.f49912g.f49963l0 && !this.f49911f && M.f47887a >= 32 && (c1838g = this.f49913h) != null && c1838g.f49995b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z12 || (aVar = this.f50035a) == null) {
            return;
        }
        aVar.a();
    }

    public final void q(d dVar) {
        boolean zEquals;
        dVar.getClass();
        synchronized (this.f49908c) {
            zEquals = this.f49912g.equals(dVar);
            this.f49912g = dVar;
        }
        if (zEquals) {
            return;
        }
        if (dVar.f49963l0 && this.f49909d == null) {
            androidx.media3.common.util.s.g();
        }
        r.a aVar = this.f50035a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.r
    @P
    public final d0.f c() {
        return this;
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class d extends U implements InterfaceC23096j {

        /* renamed from: A0, reason: collision with root package name */
        public static final String f49935A0;

        /* renamed from: B0, reason: collision with root package name */
        public static final String f49936B0;

        /* renamed from: C0, reason: collision with root package name */
        public static final String f49937C0;

        /* renamed from: D0, reason: collision with root package name */
        public static final String f49938D0;

        /* renamed from: E0, reason: collision with root package name */
        public static final String f49939E0;

        /* renamed from: F0, reason: collision with root package name */
        public static final String f49940F0;

        /* renamed from: G0, reason: collision with root package name */
        public static final String f49941G0;

        /* renamed from: H0, reason: collision with root package name */
        public static final String f49942H0;

        /* renamed from: I0, reason: collision with root package name */
        public static final String f49943I0;

        /* renamed from: J0, reason: collision with root package name */
        public static final String f49944J0;

        /* renamed from: K0, reason: collision with root package name */
        public static final String f49945K0;

        /* renamed from: s0, reason: collision with root package name */
        public static final d f49946s0 = new a().b();

        /* renamed from: t0, reason: collision with root package name */
        public static final String f49947t0;

        /* renamed from: u0, reason: collision with root package name */
        public static final String f49948u0;

        /* renamed from: v0, reason: collision with root package name */
        public static final String f49949v0;

        /* renamed from: w0, reason: collision with root package name */
        public static final String f49950w0;

        /* renamed from: x0, reason: collision with root package name */
        public static final String f49951x0;

        /* renamed from: y0, reason: collision with root package name */
        public static final String f49952y0;

        /* renamed from: z0, reason: collision with root package name */
        public static final String f49953z0;

        /* renamed from: c0, reason: collision with root package name */
        public final boolean f49954c0;

        /* renamed from: d0, reason: collision with root package name */
        public final boolean f49955d0;

        /* renamed from: e0, reason: collision with root package name */
        public final boolean f49956e0;

        /* renamed from: f0, reason: collision with root package name */
        public final boolean f49957f0;

        /* renamed from: g0, reason: collision with root package name */
        public final boolean f49958g0;

        /* renamed from: h0, reason: collision with root package name */
        public final boolean f49959h0;

        /* renamed from: i0, reason: collision with root package name */
        public final boolean f49960i0;

        /* renamed from: j0, reason: collision with root package name */
        public final boolean f49961j0;

        /* renamed from: k0, reason: collision with root package name */
        public final boolean f49962k0;

        /* renamed from: l0, reason: collision with root package name */
        public final boolean f49963l0;

        /* renamed from: m0, reason: collision with root package name */
        public final boolean f49964m0;

        /* renamed from: n0, reason: collision with root package name */
        public final boolean f49965n0;

        /* renamed from: o0, reason: collision with root package name */
        public final boolean f49966o0;

        /* renamed from: p0, reason: collision with root package name */
        public final boolean f49967p0;

        /* renamed from: q0, reason: collision with root package name */
        public final SparseArray<Map<Y, f>> f49968q0;

        /* renamed from: r0, reason: collision with root package name */
        public final SparseBooleanArray f49969r0;

        static {
            int i12 = M.f47887a;
            f49947t0 = Integer.toString(1000, 36);
            f49948u0 = Integer.toString(1001, 36);
            f49949v0 = Integer.toString(1002, 36);
            f49950w0 = Integer.toString(ErrorCodes.MALFORMED_URL_EXCEPTION, 36);
            f49951x0 = Integer.toString(ErrorCodes.PROTOCOL_EXCEPTION, 36);
            f49952y0 = Integer.toString(1005, 36);
            f49953z0 = Integer.toString(ErrorCodes.SSL_HANDSHAKE_EXCEPTION, 36);
            f49935A0 = Integer.toString(ErrorCodes.IO_EXCEPTION, 36);
            f49936B0 = Integer.toString(1008, 36);
            f49937C0 = Integer.toString(1009, 36);
            f49938D0 = Integer.toString(1010, 36);
            f49939E0 = Integer.toString(1011, 36);
            f49940F0 = Integer.toString(1012, 36);
            f49941G0 = Integer.toString(1013, 36);
            f49942H0 = Integer.toString(1014, 36);
            f49943I0 = Integer.toString(1015, 36);
            f49944J0 = Integer.toString(1016, 36);
            f49945K0 = Integer.toString(1017, 36);
        }

        public d(a aVar, a aVar2) {
            super(aVar);
            this.f49954c0 = aVar.f49970A;
            this.f49955d0 = aVar.f49971B;
            this.f49956e0 = aVar.f49972C;
            this.f49957f0 = aVar.f49973D;
            this.f49958g0 = aVar.f49974E;
            this.f49959h0 = aVar.f49975F;
            this.f49960i0 = aVar.f49976G;
            this.f49961j0 = aVar.f49977H;
            this.f49962k0 = aVar.f49978I;
            this.f49963l0 = aVar.f49979J;
            this.f49964m0 = aVar.f49980K;
            this.f49965n0 = aVar.f49981L;
            this.f49966o0 = aVar.f49982M;
            this.f49967p0 = aVar.f49983N;
            this.f49968q0 = aVar.f49984O;
            this.f49969r0 = aVar.f49985P;
        }

        @Override // androidx.media3.common.U
        public final U.a a() {
            return new a(this, (a) null);
        }

        @Override // androidx.media3.common.U
        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (super.equals(dVar) && this.f49954c0 == dVar.f49954c0 && this.f49955d0 == dVar.f49955d0 && this.f49956e0 == dVar.f49956e0 && this.f49957f0 == dVar.f49957f0 && this.f49958g0 == dVar.f49958g0 && this.f49959h0 == dVar.f49959h0 && this.f49960i0 == dVar.f49960i0 && this.f49961j0 == dVar.f49961j0 && this.f49962k0 == dVar.f49962k0 && this.f49963l0 == dVar.f49963l0 && this.f49964m0 == dVar.f49964m0 && this.f49965n0 == dVar.f49965n0 && this.f49966o0 == dVar.f49966o0 && this.f49967p0 == dVar.f49967p0) {
                SparseBooleanArray sparseBooleanArray = this.f49969r0;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = dVar.f49969r0;
                if (sparseBooleanArray2.size() == size) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            SparseArray<Map<Y, f>> sparseArray = this.f49968q0;
                            int size2 = sparseArray.size();
                            SparseArray<Map<Y, f>> sparseArray2 = dVar.f49968q0;
                            if (sparseArray2.size() == size2) {
                                for (int i13 = 0; i13 < size2; i13++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i13));
                                    if (iIndexOfKey >= 0) {
                                        Map<Y, f> mapValueAt = sparseArray.valueAt(i13);
                                        Map<Y, f> mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                        if (mapValueAt2.size() == mapValueAt.size()) {
                                            for (Map.Entry<Y, f> entry : mapValueAt.entrySet()) {
                                                Y key = entry.getKey();
                                                if (!mapValueAt2.containsKey(key) || !M.a(entry.getValue(), mapValueAt2.get(key))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i12)) < 0) {
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.media3.common.U
        public final int hashCode() {
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f49954c0 ? 1 : 0)) * 31) + (this.f49955d0 ? 1 : 0)) * 31) + (this.f49956e0 ? 1 : 0)) * 31) + (this.f49957f0 ? 1 : 0)) * 31) + (this.f49958g0 ? 1 : 0)) * 31) + (this.f49959h0 ? 1 : 0)) * 31) + (this.f49960i0 ? 1 : 0)) * 31) + (this.f49961j0 ? 1 : 0)) * 31) + (this.f49962k0 ? 1 : 0)) * 31) + (this.f49963l0 ? 1 : 0)) * 31) + (this.f49964m0 ? 1 : 0)) * 31) + (this.f49965n0 ? 1 : 0)) * 31) + (this.f49966o0 ? 1 : 0)) * 31) + (this.f49967p0 ? 1 : 0);
        }

        @Override // androidx.media3.common.U, androidx.media3.common.InterfaceC23096j
        public final Bundle k() {
            Bundle bundleK = super.k();
            bundleK.putBoolean(f49947t0, this.f49954c0);
            bundleK.putBoolean(f49948u0, this.f49955d0);
            bundleK.putBoolean(f49949v0, this.f49956e0);
            bundleK.putBoolean(f49942H0, this.f49957f0);
            bundleK.putBoolean(f49950w0, this.f49958g0);
            bundleK.putBoolean(f49951x0, this.f49959h0);
            bundleK.putBoolean(f49952y0, this.f49960i0);
            bundleK.putBoolean(f49953z0, this.f49961j0);
            bundleK.putBoolean(f49943I0, this.f49962k0);
            bundleK.putBoolean(f49944J0, this.f49963l0);
            bundleK.putBoolean(f49935A0, this.f49964m0);
            bundleK.putBoolean(f49936B0, this.f49965n0);
            bundleK.putBoolean(f49937C0, this.f49966o0);
            bundleK.putBoolean(f49945K0, this.f49967p0);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            int i12 = 0;
            while (true) {
                SparseArray<Map<Y, f>> sparseArray2 = this.f49968q0;
                if (i12 >= sparseArray2.size()) {
                    break;
                }
                int iKeyAt = sparseArray2.keyAt(i12);
                for (Map.Entry<Y, f> entry : sparseArray2.valueAt(i12).entrySet()) {
                    f value = entry.getValue();
                    if (value != null) {
                        sparseArray.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundleK.putIntArray(f49938D0, com.google.common.primitives.l.g(arrayList));
                bundleK.putParcelableArrayList(f49939E0, C23114e.b(arrayList2));
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    sparseArray3.put(sparseArray.keyAt(i13), ((InterfaceC23096j) sparseArray.valueAt(i13)).k());
                }
                bundleK.putSparseParcelableArray(f49940F0, sparseArray3);
                i12++;
            }
            SparseBooleanArray sparseBooleanArray = this.f49969r0;
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i14 = 0; i14 < sparseBooleanArray.size(); i14++) {
                iArr[i14] = sparseBooleanArray.keyAt(i14);
            }
            bundleK.putIntArray(f49941G0, iArr);
            return bundleK;
        }

        /* compiled from: DefaultTrackSelector.java */
        public static final class a extends U.a {

            /* renamed from: A, reason: collision with root package name */
            public boolean f49970A;

            /* renamed from: B, reason: collision with root package name */
            public boolean f49971B;

            /* renamed from: C, reason: collision with root package name */
            public boolean f49972C;

            /* renamed from: D, reason: collision with root package name */
            public boolean f49973D;

            /* renamed from: E, reason: collision with root package name */
            public boolean f49974E;

            /* renamed from: F, reason: collision with root package name */
            public boolean f49975F;

            /* renamed from: G, reason: collision with root package name */
            public boolean f49976G;

            /* renamed from: H, reason: collision with root package name */
            public boolean f49977H;

            /* renamed from: I, reason: collision with root package name */
            public boolean f49978I;

            /* renamed from: J, reason: collision with root package name */
            public boolean f49979J;

            /* renamed from: K, reason: collision with root package name */
            public boolean f49980K;

            /* renamed from: L, reason: collision with root package name */
            public boolean f49981L;

            /* renamed from: M, reason: collision with root package name */
            public boolean f49982M;

            /* renamed from: N, reason: collision with root package name */
            public boolean f49983N;

            /* renamed from: O, reason: collision with root package name */
            public final SparseArray<Map<Y, f>> f49984O;

            /* renamed from: P, reason: collision with root package name */
            public final SparseBooleanArray f49985P;

            /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public a(android.content.Context r9) throws java.lang.NumberFormatException {
                /*
                    Method dump skipped, instructions count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.g.d.a.<init>(android.content.Context):void");
            }

            @Override // androidx.media3.common.U.a
            @InterfaceC19845a
            public final void a(T t12) {
                this.f47533y.put(t12.f47454b, t12);
            }

            @Override // androidx.media3.common.U.a
            @InterfaceC19845a
            public final U.a c() {
                super.c();
                return this;
            }

            @Override // androidx.media3.common.U.a
            @InterfaceC19845a
            public final U.a f(int i12, int i13) {
                super.f(i12, i13);
                return this;
            }

            @Override // androidx.media3.common.U.a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final d b() {
                return new d(this, null);
            }

            @InterfaceC19845a
            public final void h() {
                super.c();
            }

            public final void i() {
                this.f49970A = true;
                this.f49971B = false;
                this.f49972C = true;
                this.f49973D = false;
                this.f49974E = true;
                this.f49975F = false;
                this.f49976G = false;
                this.f49977H = false;
                this.f49978I = false;
                this.f49979J = true;
                this.f49980K = true;
                this.f49981L = false;
                this.f49982M = true;
                this.f49983N = false;
            }

            public a(d dVar, a aVar) {
                d(dVar);
                this.f49970A = dVar.f49954c0;
                this.f49971B = dVar.f49955d0;
                this.f49972C = dVar.f49956e0;
                this.f49973D = dVar.f49957f0;
                this.f49974E = dVar.f49958g0;
                this.f49975F = dVar.f49959h0;
                this.f49976G = dVar.f49960i0;
                this.f49977H = dVar.f49961j0;
                this.f49978I = dVar.f49962k0;
                this.f49979J = dVar.f49963l0;
                this.f49980K = dVar.f49964m0;
                this.f49981L = dVar.f49965n0;
                this.f49982M = dVar.f49966o0;
                this.f49983N = dVar.f49967p0;
                SparseArray<Map<Y, f>> sparseArray = new SparseArray<>();
                int i12 = 0;
                while (true) {
                    SparseArray<Map<Y, f>> sparseArray2 = dVar.f49968q0;
                    if (i12 < sparseArray2.size()) {
                        sparseArray.put(sparseArray2.keyAt(i12), new HashMap(sparseArray2.valueAt(i12)));
                        i12++;
                    } else {
                        this.f49984O = sparseArray;
                        this.f49985P = dVar.f49969r0.clone();
                        return;
                    }
                }
            }

            @Deprecated
            public a() {
                this.f49984O = new SparseArray<>();
                this.f49985P = new SparseBooleanArray();
                i();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(Bundle bundle, a aVar) {
                AbstractC37401r1 abstractC37401r1A;
                SparseArray sparseArray;
                SparseBooleanArray sparseBooleanArray;
                super(bundle);
                i();
                d dVar = d.f49946s0;
                this.f49970A = bundle.getBoolean(d.f49947t0, dVar.f49954c0);
                this.f49971B = bundle.getBoolean(d.f49948u0, dVar.f49955d0);
                this.f49972C = bundle.getBoolean(d.f49949v0, dVar.f49956e0);
                this.f49973D = bundle.getBoolean(d.f49942H0, dVar.f49957f0);
                this.f49974E = bundle.getBoolean(d.f49950w0, dVar.f49958g0);
                this.f49975F = bundle.getBoolean(d.f49951x0, dVar.f49959h0);
                this.f49976G = bundle.getBoolean(d.f49952y0, dVar.f49960i0);
                this.f49977H = bundle.getBoolean(d.f49953z0, dVar.f49961j0);
                this.f49978I = bundle.getBoolean(d.f49943I0, dVar.f49962k0);
                this.f49979J = bundle.getBoolean(d.f49944J0, dVar.f49963l0);
                this.f49980K = bundle.getBoolean(d.f49935A0, dVar.f49964m0);
                this.f49981L = bundle.getBoolean(d.f49936B0, dVar.f49965n0);
                this.f49982M = bundle.getBoolean(d.f49937C0, dVar.f49966o0);
                this.f49983N = bundle.getBoolean(d.f49945K0, dVar.f49967p0);
                this.f49984O = new SparseArray<>();
                int[] intArray = bundle.getIntArray(d.f49938D0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(d.f49939E0);
                if (parcelableArrayList == null) {
                    abstractC37401r1A = AbstractC37401r1.C();
                } else {
                    abstractC37401r1A = C23114e.a(Y.f49707g, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(d.f49940F0);
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray();
                } else {
                    androidx.media3.exoplayer.trackselection.h hVar = f.f49990h;
                    SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
                    for (int i12 = 0; i12 < sparseParcelableArray.size(); i12++) {
                        sparseArray2.put(sparseParcelableArray.keyAt(i12), hVar.fromBundle((Bundle) sparseParcelableArray.valueAt(i12)));
                    }
                    sparseArray = sparseArray2;
                }
                if (intArray != null && intArray.length == abstractC37401r1A.size()) {
                    for (int i13 = 0; i13 < intArray.length; i13++) {
                        int i14 = intArray[i13];
                        Y y12 = (Y) abstractC37401r1A.get(i13);
                        f fVar = (f) sparseArray.get(i13);
                        SparseArray<Map<Y, f>> sparseArray3 = this.f49984O;
                        Map<Y, f> map = sparseArray3.get(i14);
                        if (map == null) {
                            map = new HashMap<>();
                            sparseArray3.put(i14, map);
                        }
                        if (!map.containsKey(y12) || !M.a(map.get(y12), fVar)) {
                            map.put(y12, fVar);
                        }
                    }
                }
                int[] intArray2 = bundle.getIntArray(d.f49941G0);
                if (intArray2 == null) {
                    sparseBooleanArray = new SparseBooleanArray();
                } else {
                    SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(intArray2.length);
                    for (int i15 : intArray2) {
                        sparseBooleanArray2.append(i15, true);
                    }
                    sparseBooleanArray = sparseBooleanArray2;
                }
                this.f49985P = sparseBooleanArray;
            }
        }
    }
}
