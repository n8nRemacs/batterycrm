package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.InterfaceC36525h;
import com.google.android.exoplayer2.audio.C36506d;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.source.V;
import com.google.android.exoplayer2.source.W;
import com.google.android.exoplayer2.trackselection.a;
import com.google.android.exoplayer2.trackselection.k;
import com.google.android.exoplayer2.trackselection.m;
import com.google.android.exoplayer2.trackselection.r;
import com.google.android.exoplayer2.trackselection.t;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36588d;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.D;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.webrtc.MediaStreamTrack;

/* compiled from: DefaultTrackSelector.java */
/* loaded from: classes6.dex */
public class g extends m {

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC37429w3<Integer> f347172i = AbstractC37429w3.b(new com.google.android.exoplayer2.trackselection.d(6));

    /* renamed from: j, reason: collision with root package name */
    public static final AbstractC37429w3<Integer> f347173j = AbstractC37429w3.b(new com.google.android.exoplayer2.trackselection.d(7));

    /* renamed from: c, reason: collision with root package name */
    public final Object f347174c;

    /* renamed from: d, reason: collision with root package name */
    public final a.b f347175d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f347176e;

    /* renamed from: f, reason: collision with root package name */
    @B
    public d f347177f;

    /* renamed from: g, reason: collision with root package name */
    @B
    @P
    public final C10607g f347178g;

    /* renamed from: h, reason: collision with root package name */
    @B
    public C36506d f347179h;

    /* compiled from: DefaultTrackSelector.java */
    public static final class b extends i<b> implements Comparable<b> {

        /* renamed from: f, reason: collision with root package name */
        public final int f347180f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f347181g;

        /* renamed from: h, reason: collision with root package name */
        @P
        public final String f347182h;

        /* renamed from: i, reason: collision with root package name */
        public final d f347183i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f347184j;

        /* renamed from: k, reason: collision with root package name */
        public final int f347185k;

        /* renamed from: l, reason: collision with root package name */
        public final int f347186l;

        /* renamed from: m, reason: collision with root package name */
        public final int f347187m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f347188n;

        /* renamed from: o, reason: collision with root package name */
        public final int f347189o;

        /* renamed from: p, reason: collision with root package name */
        public final int f347190p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f347191q;

        /* renamed from: r, reason: collision with root package name */
        public final int f347192r;

        /* renamed from: s, reason: collision with root package name */
        public final int f347193s;

        /* renamed from: t, reason: collision with root package name */
        public final int f347194t;

        /* renamed from: u, reason: collision with root package name */
        public final int f347195u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f347196v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f347197w;

        public b(int i12, V v12, int i13, d dVar, int i14, boolean z12, com.google.android.exoplayer2.trackselection.f fVar) {
            int i15;
            int iJ2;
            int iJ3;
            boolean z13;
            super(i12, v12, i13);
            this.f347183i = dVar;
            this.f347182h = g.m(this.f347251e.f343467d);
            int i16 = 0;
            this.f347184j = g.k(i14, false);
            int i17 = 0;
            while (true) {
                i15 = Integer.MAX_VALUE;
                if (i17 >= dVar.f347296o.size()) {
                    iJ2 = 0;
                    i17 = Integer.MAX_VALUE;
                    break;
                } else {
                    iJ2 = g.j(this.f347251e, dVar.f347296o.get(i17), false);
                    if (iJ2 > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f347186l = i17;
            this.f347185k = iJ2;
            this.f347187m = g.h(this.f347251e.f343469f, dVar.f347297p);
            I i18 = this.f347251e;
            int i19 = i18.f343469f;
            this.f347188n = i19 == 0 || (i19 & 1) != 0;
            this.f347191q = (i18.f343468e & 1) != 0;
            int i22 = i18.f343489z;
            this.f347192r = i22;
            this.f347193s = i18.f343458A;
            int i23 = i18.f343472i;
            this.f347194t = i23;
            this.f347181g = (i23 == -1 || i23 <= dVar.f347299r) && (i22 == -1 || i22 <= dVar.f347298q) && fVar.apply(i18);
            String[] strArrA = U.A();
            int i24 = 0;
            while (true) {
                if (i24 >= strArrA.length) {
                    iJ3 = 0;
                    i24 = Integer.MAX_VALUE;
                    break;
                } else {
                    iJ3 = g.j(this.f347251e, strArrA[i24], false);
                    if (iJ3 > 0) {
                        break;
                    } else {
                        i24++;
                    }
                }
            }
            this.f347189o = i24;
            this.f347190p = iJ3;
            int i25 = 0;
            while (true) {
                AbstractC37401r1<String> abstractC37401r1 = dVar.f347300s;
                if (i25 < abstractC37401r1.size()) {
                    String str = this.f347251e.f343476m;
                    if (str != null && str.equals(abstractC37401r1.get(i25))) {
                        i15 = i25;
                        break;
                    }
                    i25++;
                } else {
                    break;
                }
            }
            this.f347195u = i15;
            this.f347196v = i0.h(i14) == 128;
            this.f347197w = i0.g(i14) == 64;
            d dVar2 = this.f347183i;
            if (g.k(i14, dVar2.f347211M) && ((z13 = this.f347181g) || dVar2.f347205G)) {
                i16 = (!g.k(i14, false) || !z13 || this.f347251e.f343472i == -1 || dVar2.f347306y || dVar2.f347305x || (!dVar2.f347213O && z12)) ? 1 : 2;
            }
            this.f347180f = i16;
        }

        @Override // com.google.android.exoplayer2.trackselection.g.i
        public final int a() {
            return this.f347180f;
        }

        @Override // com.google.android.exoplayer2.trackselection.g.i
        public final boolean b(i iVar) {
            int i12;
            String str;
            int i13;
            b bVar = (b) iVar;
            d dVar = this.f347183i;
            boolean z12 = dVar.f347208J;
            I i14 = bVar.f347251e;
            I i15 = this.f347251e;
            if ((z12 || ((i13 = i15.f343489z) != -1 && i13 == i14.f343489z)) && ((dVar.f347206H || ((str = i15.f343476m) != null && TextUtils.equals(str, i14.f343476m))) && (dVar.f347207I || ((i12 = i15.f343458A) != -1 && i12 == i14.f343458A)))) {
                if (!dVar.f347209K) {
                    if (this.f347196v != bVar.f347196v || this.f347197w != bVar.f347197w) {
                    }
                }
                return true;
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            boolean z12 = this.f347184j;
            boolean z13 = this.f347181g;
            Object objH = (z13 && z12) ? g.f347172i : g.f347172i.h();
            S sC2 = S.f359569a.d(z12, bVar.f347184j).c(Integer.valueOf(this.f347186l), Integer.valueOf(bVar.f347186l), AbstractC37429w3.d().h()).a(this.f347185k, bVar.f347185k).a(this.f347187m, bVar.f347187m).d(this.f347191q, bVar.f347191q).d(this.f347188n, bVar.f347188n).c(Integer.valueOf(this.f347189o), Integer.valueOf(bVar.f347189o), AbstractC37429w3.d().h()).a(this.f347190p, bVar.f347190p).d(z13, bVar.f347181g).c(Integer.valueOf(this.f347195u), Integer.valueOf(bVar.f347195u), AbstractC37429w3.d().h());
            int i12 = this.f347194t;
            Integer numValueOf = Integer.valueOf(i12);
            int i13 = bVar.f347194t;
            S sC3 = sC2.c(numValueOf, Integer.valueOf(i13), this.f347183i.f347305x ? g.f347172i.h() : g.f347173j).d(this.f347196v, bVar.f347196v).d(this.f347197w, bVar.f347197w).c(Integer.valueOf(this.f347192r), Integer.valueOf(bVar.f347192r), objH).c(Integer.valueOf(this.f347193s), Integer.valueOf(bVar.f347193s), objH);
            Integer numValueOf2 = Integer.valueOf(i12);
            Integer numValueOf3 = Integer.valueOf(i13);
            if (!U.a(this.f347182h, bVar.f347182h)) {
                objH = g.f347173j;
            }
            return sC3.c(numValueOf2, numValueOf3, objH).f();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class c implements Comparable<c> {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f347198b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f347199c;

        public c(I i12, int i13) {
            this.f347198b = (i12.f343468e & 1) != 0;
            this.f347199c = g.k(i13, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            return S.f359569a.d(this.f347199c, cVar2.f347199c).d(this.f347198b, cVar2.f347198b).f();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    @Deprecated
    public static final class e extends r.a {

        /* renamed from: A, reason: collision with root package name */
        public final d.a f347231A = new d.a();

        @Deprecated
        public e() {
        }

        @Override // com.google.android.exoplayer2.trackselection.r.a
        public final r a() {
            return this.f347231A.a();
        }

        @Override // com.google.android.exoplayer2.trackselection.r.a
        public final r.a b(int i12) {
            this.f347231A.j(i12);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.r.a
        public final r.a e() {
            this.f347231A.f347328u = -3;
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.r.a
        public final r.a f(q qVar) {
            this.f347231A.l(qVar);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.r.a
        public final r.a g(int i12) {
            this.f347231A.m(i12);
            return this;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class f implements InterfaceC36525h {

        /* renamed from: b, reason: collision with root package name */
        public final int f347232b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f347233c;

        /* renamed from: d, reason: collision with root package name */
        public final int f347234d;

        public f(int i12, int i13, int[] iArr) {
            this.f347232b = i12;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f347233c = iArrCopyOf;
            this.f347234d = i13;
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
            return this.f347232b == fVar.f347232b && Arrays.equals(this.f347233c, fVar.f347233c) && this.f347234d == fVar.f347234d;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f347233c) + (this.f347232b * 31)) * 31) + this.f347234d;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    @X
    /* renamed from: com.google.android.exoplayer2.trackselection.g$g, reason: collision with other inner class name */
    public static class C10607g {

        /* renamed from: a, reason: collision with root package name */
        public final Spatializer f347235a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f347236b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public Handler f347237c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public Spatializer$OnSpatializerStateChangedListener f347238d;

        public C10607g(Spatializer spatializer) {
            this.f347235a = spatializer;
            this.f347236b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public final boolean a(I i12, C36506d c36506d) throws IllegalArgumentException {
            boolean zEquals = "audio/eac3-joc".equals(i12.f343476m);
            int i13 = i12.f343489z;
            if (zEquals && i13 == 16) {
                i13 = 12;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(U.o(i13));
            int i14 = i12.f343458A;
            if (i14 != -1) {
                channelMask.setSampleRate(i14);
            }
            return this.f347235a.canBeSpatialized(c36506d.a().f343977a, channelMask.build());
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class h extends i<h> implements Comparable<h> {

        /* renamed from: f, reason: collision with root package name */
        public final int f347239f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f347240g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f347241h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f347242i;

        /* renamed from: j, reason: collision with root package name */
        public final int f347243j;

        /* renamed from: k, reason: collision with root package name */
        public final int f347244k;

        /* renamed from: l, reason: collision with root package name */
        public final int f347245l;

        /* renamed from: m, reason: collision with root package name */
        public final int f347246m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f347247n;

        public h(int i12, V v12, int i13, d dVar, int i14, @P String str) {
            int iJ2;
            super(i12, v12, i13);
            int i15 = 0;
            this.f347240g = g.k(i14, false);
            int i16 = this.f347251e.f343468e & (~dVar.f347303v);
            this.f347241h = (i16 & 1) != 0;
            this.f347242i = (i16 & 2) != 0;
            AbstractC37401r1<String> abstractC37401r1 = dVar.f347301t;
            AbstractC37401r1<String> abstractC37401r1E = abstractC37401r1.isEmpty() ? AbstractC37401r1.E("") : abstractC37401r1;
            int i17 = 0;
            while (true) {
                if (i17 >= abstractC37401r1E.size()) {
                    i17 = Integer.MAX_VALUE;
                    iJ2 = 0;
                    break;
                } else {
                    iJ2 = g.j(this.f347251e, abstractC37401r1E.get(i17), dVar.f347304w);
                    if (iJ2 > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f347243j = i17;
            this.f347244k = iJ2;
            int iH2 = g.h(this.f347251e.f343469f, dVar.f347302u);
            this.f347245l = iH2;
            this.f347247n = (this.f347251e.f343469f & 1088) != 0;
            int iJ3 = g.j(this.f347251e, str, g.m(str) == null);
            this.f347246m = iJ3;
            boolean z12 = iJ2 > 0 || (abstractC37401r1.isEmpty() && iH2 > 0) || this.f347241h || (this.f347242i && iJ3 > 0);
            if (g.k(i14, dVar.f347211M) && z12) {
                i15 = 1;
            }
            this.f347239f = i15;
        }

        @Override // com.google.android.exoplayer2.trackselection.g.i
        public final int a() {
            return this.f347239f;
        }

        @Override // com.google.android.exoplayer2.trackselection.g.i
        public final /* bridge */ /* synthetic */ boolean b(i iVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(h hVar) {
            S sC2 = S.f359569a.d(this.f347240g, hVar.f347240g).c(Integer.valueOf(this.f347243j), Integer.valueOf(hVar.f347243j), AbstractC37429w3.d().h());
            int i12 = this.f347244k;
            S sA2 = sC2.a(i12, hVar.f347244k);
            int i13 = this.f347245l;
            S sA3 = sA2.a(i13, hVar.f347245l).d(this.f347241h, hVar.f347241h).c(Boolean.valueOf(this.f347242i), Boolean.valueOf(hVar.f347242i), i12 == 0 ? AbstractC37429w3.d() : AbstractC37429w3.d().h()).a(this.f347246m, hVar.f347246m);
            if (i13 == 0) {
                sA3 = sA3.e(this.f347247n, hVar.f347247n);
            }
            return sA3.f();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static abstract class i<T extends i<T>> {

        /* renamed from: b, reason: collision with root package name */
        public final int f347248b;

        /* renamed from: c, reason: collision with root package name */
        public final V f347249c;

        /* renamed from: d, reason: collision with root package name */
        public final int f347250d;

        /* renamed from: e, reason: collision with root package name */
        public final I f347251e;

        /* compiled from: DefaultTrackSelector.java */
        public interface a<T extends i<T>> {
            List<T> a(int i12, V v12, int[] iArr);
        }

        public i(int i12, V v12, int i13) {
            this.f347248b = i12;
            this.f347249c = v12;
            this.f347250d = i13;
            this.f347251e = v12.f346151e[i13];
        }

        public abstract int a();

        public abstract boolean b(T t12);
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class j extends i<j> {

        /* renamed from: f, reason: collision with root package name */
        public final boolean f347252f;

        /* renamed from: g, reason: collision with root package name */
        public final d f347253g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f347254h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f347255i;

        /* renamed from: j, reason: collision with root package name */
        public final int f347256j;

        /* renamed from: k, reason: collision with root package name */
        public final int f347257k;

        /* renamed from: l, reason: collision with root package name */
        public final int f347258l;

        /* renamed from: m, reason: collision with root package name */
        public final int f347259m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f347260n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f347261o;

        /* renamed from: p, reason: collision with root package name */
        public final int f347262p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f347263q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f347264r;

        /* renamed from: s, reason: collision with root package name */
        public final int f347265s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public j(int r7, com.google.android.exoplayer2.source.V r8, int r9, com.google.android.exoplayer2.trackselection.g.d r10, int r11, int r12, boolean r13) {
            /*
                Method dump skipped, instructions count: 394
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.g.j.<init>(int, com.google.android.exoplayer2.source.V, int, com.google.android.exoplayer2.trackselection.g$d, int, int, boolean):void");
        }

        @Override // com.google.android.exoplayer2.trackselection.g.i
        public final int a() {
            return this.f347262p;
        }

        @Override // com.google.android.exoplayer2.trackselection.g.i
        public final boolean b(i iVar) {
            j jVar = (j) iVar;
            if (this.f347261o || U.a(this.f347251e.f343476m, jVar.f347251e.f343476m)) {
                if (!this.f347253g.f347204F) {
                    if (this.f347263q != jVar.f347263q || this.f347264r != jVar.f347264r) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    @Deprecated
    public g() {
        this(d.f347200R, new a.b(), null);
    }

    public static int h(int i12, int i13) {
        if (i12 == 0 || i12 != i13) {
            return Integer.bitCount(i12 & i13);
        }
        return Integer.MAX_VALUE;
    }

    public static void i(W w12, r rVar, HashMap map) {
        for (int i12 = 0; i12 < w12.f346155b; i12++) {
            q qVar = rVar.f347307z.get(w12.a(i12));
            if (qVar != null) {
                V v12 = qVar.f347279b;
                q qVar2 = (q) map.get(Integer.valueOf(v12.f346150d));
                if (qVar2 == null || (qVar2.f347280c.isEmpty() && !qVar.f347280c.isEmpty())) {
                    map.put(Integer.valueOf(v12.f346150d), qVar);
                }
            }
        }
    }

    public static int j(I i12, @P String str, boolean z12) {
        if (!TextUtils.isEmpty(str) && str.equals(i12.f343467d)) {
            return 4;
        }
        String strM = m(str);
        String strM2 = m(i12.f343467d);
        if (strM2 == null || strM == null) {
            return (z12 && strM2 == null) ? 1 : 0;
        }
        if (strM2.startsWith(strM) || strM.startsWith(strM2)) {
            return 3;
        }
        int i13 = U.f348106a;
        return strM2.split("-", 2)[0].equals(strM.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean k(int i12, boolean z12) {
        int i13 = i12 & 7;
        return i13 == 4 || (z12 && i13 == 3);
    }

    @P
    public static String m(@P String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    @P
    public static Pair n(int i12, m.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        RandomAccess randomAccessE;
        boolean z12;
        m.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (i13 < aVar3.f347270a) {
            if (i12 == aVar3.f347271b[i13]) {
                W w12 = aVar3.f347272c[i13];
                for (int i14 = 0; i14 < w12.f346155b; i14++) {
                    V vA2 = w12.a(i14);
                    List listA = aVar2.a(i13, vA2, iArr[i13][i14]);
                    int i15 = vA2.f346148b;
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
            iArr2[i18] = ((i) list.get(i18)).f347250d;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new k.a(0, iVar3.f347249c, iArr2), Integer.valueOf(iVar3.f347248b));
    }

    @Override // com.google.android.exoplayer2.trackselection.t
    public final r a() {
        d dVar;
        synchronized (this.f347174c) {
            dVar = this.f347177f;
        }
        return dVar;
    }

    @Override // com.google.android.exoplayer2.trackselection.t
    public final void c() {
        C10607g c10607g;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        synchronized (this.f347174c) {
            try {
                if (U.f348106a >= 32 && (c10607g = this.f347178g) != null && (spatializer$OnSpatializerStateChangedListener = c10607g.f347238d) != null && c10607g.f347237c != null) {
                    c10607g.f347235a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
                    c10607g.f347237c.removeCallbacksAndMessages(null);
                    c10607g.f347237c = null;
                    c10607g.f347238d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.c();
    }

    @Override // com.google.android.exoplayer2.trackselection.t
    public final void e(C36506d c36506d) {
        boolean zEquals;
        synchronized (this.f347174c) {
            zEquals = this.f347179h.equals(c36506d);
            this.f347179h = c36506d;
        }
        if (zEquals) {
            return;
        }
        l();
    }

    @Override // com.google.android.exoplayer2.trackselection.t
    public final void f(r rVar) {
        d dVar;
        if (rVar instanceof d) {
            o((d) rVar);
        }
        synchronized (this.f347174c) {
            dVar = this.f347177f;
        }
        d.a aVar = new d.a(dVar, (a) null);
        aVar.c(rVar);
        o(aVar.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c8  */
    @Override // com.google.android.exoplayer2.trackselection.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.google.android.exoplayer2.j0[], com.google.android.exoplayer2.trackselection.k[]> g(com.google.android.exoplayer2.trackselection.m.a r41, int[][][] r42, final int[] r43, com.google.android.exoplayer2.source.y.b r44, com.google.android.exoplayer2.s0 r45) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.g.g(com.google.android.exoplayer2.trackselection.m$a, int[][][], int[], com.google.android.exoplayer2.source.y$b, com.google.android.exoplayer2.s0):android.util.Pair");
    }

    public final void l() {
        boolean z12;
        t.a aVar;
        C10607g c10607g;
        synchronized (this.f347174c) {
            try {
                z12 = this.f347177f.f347210L && !this.f347176e && U.f348106a >= 32 && (c10607g = this.f347178g) != null && c10607g.f347236b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z12 || (aVar = this.f347334a) == null) {
            return;
        }
        aVar.a();
    }

    public final void o(d dVar) {
        boolean zEquals;
        t.a aVar;
        dVar.getClass();
        synchronized (this.f347174c) {
            zEquals = this.f347177f.equals(dVar);
            this.f347177f = dVar;
        }
        if (zEquals || (aVar = this.f347334a) == null) {
            return;
        }
        aVar.a();
    }

    public g(d dVar, a.b bVar, @P Context context) {
        this.f347174c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f347175d = bVar;
        if (dVar != null) {
            this.f347177f = dVar;
        } else {
            d dVarA = context != null ? new d.a(context).a() : d.f347200R;
            dVarA.getClass();
            d.a aVar = new d.a(dVarA, (a) null);
            aVar.c(dVar);
            this.f347177f = aVar.a();
        }
        this.f347179h = C36506d.f343970h;
        boolean z12 = context != null && U.G(context);
        this.f347176e = z12;
        if (!z12 && context != null && U.f348106a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            this.f347178g = audioManager != null ? new C10607g(audioManager.getSpatializer()) : null;
        }
        boolean z13 = this.f347177f.f347210L;
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class d extends r implements InterfaceC36525h {

        /* renamed from: R, reason: collision with root package name */
        public static final d f347200R = new a().a();

        /* renamed from: C, reason: collision with root package name */
        public final boolean f347201C;

        /* renamed from: D, reason: collision with root package name */
        public final boolean f347202D;

        /* renamed from: E, reason: collision with root package name */
        public final boolean f347203E;

        /* renamed from: F, reason: collision with root package name */
        public final boolean f347204F;

        /* renamed from: G, reason: collision with root package name */
        public final boolean f347205G;

        /* renamed from: H, reason: collision with root package name */
        public final boolean f347206H;

        /* renamed from: I, reason: collision with root package name */
        public final boolean f347207I;

        /* renamed from: J, reason: collision with root package name */
        public final boolean f347208J;

        /* renamed from: K, reason: collision with root package name */
        public final boolean f347209K;

        /* renamed from: L, reason: collision with root package name */
        public final boolean f347210L;

        /* renamed from: M, reason: collision with root package name */
        public final boolean f347211M;

        /* renamed from: N, reason: collision with root package name */
        public final boolean f347212N;

        /* renamed from: O, reason: collision with root package name */
        public final boolean f347213O;

        /* renamed from: P, reason: collision with root package name */
        public final SparseArray<Map<W, f>> f347214P;

        /* renamed from: Q, reason: collision with root package name */
        public final SparseBooleanArray f347215Q;

        public d(a aVar, a aVar2) {
            super(aVar);
            this.f347201C = aVar.f347216A;
            this.f347202D = aVar.f347217B;
            this.f347203E = aVar.f347218C;
            this.f347204F = aVar.f347219D;
            this.f347205G = aVar.f347220E;
            this.f347206H = aVar.f347221F;
            this.f347207I = aVar.f347222G;
            this.f347208J = aVar.f347223H;
            this.f347209K = aVar.f347224I;
            this.f347210L = aVar.f347225J;
            this.f347211M = aVar.f347226K;
            this.f347212N = aVar.f347227L;
            this.f347213O = aVar.f347228M;
            this.f347214P = aVar.f347229N;
            this.f347215Q = aVar.f347230O;
        }

        @Override // com.google.android.exoplayer2.trackselection.r
        public final r.a a() {
            return new a(this, (a) null);
        }

        @Override // com.google.android.exoplayer2.trackselection.r
        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (super.equals(dVar) && this.f347201C == dVar.f347201C && this.f347202D == dVar.f347202D && this.f347203E == dVar.f347203E && this.f347204F == dVar.f347204F && this.f347205G == dVar.f347205G && this.f347206H == dVar.f347206H && this.f347207I == dVar.f347207I && this.f347208J == dVar.f347208J && this.f347209K == dVar.f347209K && this.f347210L == dVar.f347210L && this.f347211M == dVar.f347211M && this.f347212N == dVar.f347212N && this.f347213O == dVar.f347213O) {
                SparseBooleanArray sparseBooleanArray = this.f347215Q;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = dVar.f347215Q;
                if (sparseBooleanArray2.size() == size) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            SparseArray<Map<W, f>> sparseArray = this.f347214P;
                            int size2 = sparseArray.size();
                            SparseArray<Map<W, f>> sparseArray2 = dVar.f347214P;
                            if (sparseArray2.size() == size2) {
                                for (int i13 = 0; i13 < size2; i13++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i13));
                                    if (iIndexOfKey >= 0) {
                                        Map<W, f> mapValueAt = sparseArray.valueAt(i13);
                                        Map<W, f> mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                        if (mapValueAt2.size() == mapValueAt.size()) {
                                            for (Map.Entry<W, f> entry : mapValueAt.entrySet()) {
                                                W key = entry.getKey();
                                                if (!mapValueAt2.containsKey(key) || !U.a(entry.getValue(), mapValueAt2.get(key))) {
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

        @Override // com.google.android.exoplayer2.trackselection.r
        public final int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f347201C ? 1 : 0)) * 31) + (this.f347202D ? 1 : 0)) * 31) + (this.f347203E ? 1 : 0)) * 31) + (this.f347204F ? 1 : 0)) * 31) + (this.f347205G ? 1 : 0)) * 31) + (this.f347206H ? 1 : 0)) * 31) + (this.f347207I ? 1 : 0)) * 31) + (this.f347208J ? 1 : 0)) * 31) + (this.f347209K ? 1 : 0)) * 31) + (this.f347210L ? 1 : 0)) * 31) + (this.f347211M ? 1 : 0)) * 31) + (this.f347212N ? 1 : 0)) * 31) + (this.f347213O ? 1 : 0);
        }

        /* compiled from: DefaultTrackSelector.java */
        public static final class a extends r.a {

            /* renamed from: A, reason: collision with root package name */
            public boolean f347216A;

            /* renamed from: B, reason: collision with root package name */
            public boolean f347217B;

            /* renamed from: C, reason: collision with root package name */
            public boolean f347218C;

            /* renamed from: D, reason: collision with root package name */
            public boolean f347219D;

            /* renamed from: E, reason: collision with root package name */
            public boolean f347220E;

            /* renamed from: F, reason: collision with root package name */
            public boolean f347221F;

            /* renamed from: G, reason: collision with root package name */
            public boolean f347222G;

            /* renamed from: H, reason: collision with root package name */
            public boolean f347223H;

            /* renamed from: I, reason: collision with root package name */
            public boolean f347224I;

            /* renamed from: J, reason: collision with root package name */
            public boolean f347225J;

            /* renamed from: K, reason: collision with root package name */
            public boolean f347226K;

            /* renamed from: L, reason: collision with root package name */
            public boolean f347227L;

            /* renamed from: M, reason: collision with root package name */
            public boolean f347228M;

            /* renamed from: N, reason: collision with root package name */
            public final SparseArray<Map<W, f>> f347229N;

            /* renamed from: O, reason: collision with root package name */
            public final SparseBooleanArray f347230O;

            /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public a(android.content.Context r9) throws java.lang.NumberFormatException {
                /*
                    Method dump skipped, instructions count: 277
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.g.d.a.<init>(android.content.Context):void");
            }

            @Override // com.google.android.exoplayer2.trackselection.r.a
            public final r.a b(int i12) {
                super.b(i12);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.r.a
            public final r.a e() {
                this.f347328u = -3;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.r.a
            public final r.a f(q qVar) {
                super.f(qVar);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.r.a
            public final r.a g(int i12) {
                super.g(i12);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.r.a
            public final r.a h(int i12, int i13) {
                super.h(i12, i13);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.r.a
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final d a() {
                return new d(this, null);
            }

            public final void j(int i12) {
                super.b(i12);
            }

            public final void k() {
                this.f347216A = true;
                this.f347217B = false;
                this.f347218C = true;
                this.f347219D = false;
                this.f347220E = true;
                this.f347221F = false;
                this.f347222G = false;
                this.f347223H = false;
                this.f347224I = false;
                this.f347225J = true;
                this.f347226K = true;
                this.f347227L = false;
                this.f347228M = true;
            }

            public final void l(q qVar) {
                super.f(qVar);
            }

            public final void m(int i12) {
                super.g(i12);
            }

            public a(d dVar, a aVar) {
                c(dVar);
                this.f347216A = dVar.f347201C;
                this.f347217B = dVar.f347202D;
                this.f347218C = dVar.f347203E;
                this.f347219D = dVar.f347204F;
                this.f347220E = dVar.f347205G;
                this.f347221F = dVar.f347206H;
                this.f347222G = dVar.f347207I;
                this.f347223H = dVar.f347208J;
                this.f347224I = dVar.f347209K;
                this.f347225J = dVar.f347210L;
                this.f347226K = dVar.f347211M;
                this.f347227L = dVar.f347212N;
                this.f347228M = dVar.f347213O;
                SparseArray<Map<W, f>> sparseArray = new SparseArray<>();
                int i12 = 0;
                while (true) {
                    SparseArray<Map<W, f>> sparseArray2 = dVar.f347214P;
                    if (i12 < sparseArray2.size()) {
                        sparseArray.put(sparseArray2.keyAt(i12), new HashMap(sparseArray2.valueAt(i12)));
                        i12++;
                    } else {
                        this.f347229N = sparseArray;
                        this.f347230O = dVar.f347215Q.clone();
                        return;
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(Bundle bundle, a aVar) {
                AbstractC37401r1 abstractC37401r1A;
                AbstractC37401r1 abstractC37401r1A2;
                SparseArray sparseArray;
                SparseBooleanArray sparseBooleanArray;
                int i12 = 0;
                r rVar = r.f347281B;
                String string = Integer.toString(6, 36);
                r rVar2 = r.f347281B;
                this.f347308a = bundle.getInt(string, rVar2.f347283b);
                this.f347309b = bundle.getInt(Integer.toString(7, 36), rVar2.f347284c);
                this.f347310c = bundle.getInt(Integer.toString(8, 36), rVar2.f347285d);
                this.f347311d = bundle.getInt(Integer.toString(9, 36), rVar2.f347286e);
                this.f347312e = bundle.getInt(Integer.toString(10, 36), rVar2.f347287f);
                this.f347313f = bundle.getInt(Integer.toString(11, 36), rVar2.f347288g);
                this.f347314g = bundle.getInt(Integer.toString(12, 36), rVar2.f347289h);
                this.f347315h = bundle.getInt(Integer.toString(13, 36), rVar2.f347290i);
                this.f347316i = bundle.getInt(Integer.toString(14, 36), rVar2.f347291j);
                this.f347317j = bundle.getInt(Integer.toString(15, 36), rVar2.f347292k);
                this.f347318k = bundle.getBoolean(Integer.toString(16, 36), rVar2.f347293l);
                this.f347319l = AbstractC37401r1.w((String[]) D.a(bundle.getStringArray(Integer.toString(17, 36)), new String[0]));
                this.f347320m = bundle.getInt(Integer.toString(25, 36), rVar2.f347295n);
                this.f347321n = r.a.d((String[]) D.a(bundle.getStringArray(Integer.toString(1, 36)), new String[0]));
                this.f347322o = bundle.getInt(Integer.toString(2, 36), rVar2.f347297p);
                this.f347323p = bundle.getInt(Integer.toString(18, 36), rVar2.f347298q);
                this.f347324q = bundle.getInt(Integer.toString(19, 36), rVar2.f347299r);
                this.f347325r = AbstractC37401r1.w((String[]) D.a(bundle.getStringArray(Integer.toString(20, 36)), new String[0]));
                this.f347326s = r.a.d((String[]) D.a(bundle.getStringArray(Integer.toString(3, 36)), new String[0]));
                this.f347327t = bundle.getInt(Integer.toString(4, 36), rVar2.f347302u);
                this.f347328u = bundle.getInt(Integer.toString(26, 36), rVar2.f347303v);
                this.f347329v = bundle.getBoolean(Integer.toString(5, 36), rVar2.f347304w);
                this.f347330w = bundle.getBoolean(Integer.toString(21, 36), rVar2.f347305x);
                this.f347331x = bundle.getBoolean(Integer.toString(22, 36), rVar2.f347306y);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(23, 36));
                if (parcelableArrayList == null) {
                    abstractC37401r1A = AbstractC37401r1.C();
                } else {
                    abstractC37401r1A = C36588d.a(q.f347278d, parcelableArrayList);
                }
                this.f347332y = new HashMap<>();
                for (int i13 = 0; i13 < abstractC37401r1A.size(); i13++) {
                    q qVar = (q) abstractC37401r1A.get(i13);
                    this.f347332y.put(qVar.f347279b, qVar);
                }
                int[] iArr = (int[]) D.a(bundle.getIntArray(Integer.toString(24, 36)), new int[0]);
                this.f347333z = new HashSet<>();
                for (int i14 : iArr) {
                    this.f347333z.add(Integer.valueOf(i14));
                }
                k();
                d dVar = d.f347200R;
                this.f347216A = bundle.getBoolean(Integer.toString(1000, 36), dVar.f347201C);
                this.f347217B = bundle.getBoolean(Integer.toString(1001, 36), dVar.f347202D);
                this.f347218C = bundle.getBoolean(Integer.toString(1002, 36), dVar.f347203E);
                this.f347219D = bundle.getBoolean(Integer.toString(1014, 36), dVar.f347204F);
                this.f347220E = bundle.getBoolean(Integer.toString(ErrorCodes.MALFORMED_URL_EXCEPTION, 36), dVar.f347205G);
                this.f347221F = bundle.getBoolean(Integer.toString(ErrorCodes.PROTOCOL_EXCEPTION, 36), dVar.f347206H);
                this.f347222G = bundle.getBoolean(Integer.toString(1005, 36), dVar.f347207I);
                this.f347223H = bundle.getBoolean(Integer.toString(ErrorCodes.SSL_HANDSHAKE_EXCEPTION, 36), dVar.f347208J);
                this.f347224I = bundle.getBoolean(Integer.toString(1015, 36), dVar.f347209K);
                this.f347225J = bundle.getBoolean(Integer.toString(1016, 36), dVar.f347210L);
                this.f347226K = bundle.getBoolean(Integer.toString(ErrorCodes.IO_EXCEPTION, 36), dVar.f347211M);
                this.f347227L = bundle.getBoolean(Integer.toString(1008, 36), dVar.f347212N);
                this.f347228M = bundle.getBoolean(Integer.toString(1009, 36), dVar.f347213O);
                this.f347229N = new SparseArray<>();
                r rVar3 = r.f347281B;
                int[] intArray = bundle.getIntArray(Integer.toString(1010, 36));
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(1011, 36));
                if (parcelableArrayList2 == null) {
                    abstractC37401r1A2 = AbstractC37401r1.C();
                } else {
                    abstractC37401r1A2 = C36588d.a(W.f346154f, parcelableArrayList2);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Integer.toString(1012, 36));
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray();
                } else {
                    SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
                    int i15 = 0;
                    while (i15 < sparseParcelableArray.size()) {
                        int iKeyAt = sparseParcelableArray.keyAt(i15);
                        Bundle bundle2 = (Bundle) sparseParcelableArray.valueAt(i15);
                        int i16 = bundle2.getInt(Integer.toString(i12, 36), -1);
                        int[] intArray2 = bundle2.getIntArray(Integer.toString(1, 36));
                        int i17 = bundle2.getInt(Integer.toString(2, 36), -1);
                        C36585a.b(i16 >= 0 && i17 >= 0);
                        intArray2.getClass();
                        sparseArray2.put(iKeyAt, new f(i16, i17, intArray2));
                        i15++;
                        i12 = 0;
                    }
                    sparseArray = sparseArray2;
                }
                if (intArray != null && intArray.length == abstractC37401r1A2.size()) {
                    for (int i18 = 0; i18 < intArray.length; i18++) {
                        int i19 = intArray[i18];
                        W w12 = (W) abstractC37401r1A2.get(i18);
                        f fVar = (f) sparseArray.get(i18);
                        SparseArray<Map<W, f>> sparseArray3 = this.f347229N;
                        Map<W, f> map = sparseArray3.get(i19);
                        if (map == null) {
                            map = new HashMap<>();
                            sparseArray3.put(i19, map);
                        }
                        if (!map.containsKey(w12) || !U.a(map.get(w12), fVar)) {
                            map.put(w12, fVar);
                        }
                    }
                }
                int[] intArray3 = bundle.getIntArray(Integer.toString(1013, 36));
                if (intArray3 == null) {
                    sparseBooleanArray = new SparseBooleanArray();
                } else {
                    SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(intArray3.length);
                    for (int i22 : intArray3) {
                        sparseBooleanArray2.append(i22, true);
                    }
                    sparseBooleanArray = sparseBooleanArray2;
                }
                this.f347230O = sparseBooleanArray;
            }

            @Deprecated
            public a() {
                this.f347229N = new SparseArray<>();
                this.f347230O = new SparseBooleanArray();
                k();
            }
        }
    }
}
