package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaItem.java */
/* loaded from: classes6.dex */
public final class O implements InterfaceC36525h {

    /* renamed from: h, reason: collision with root package name */
    public static final C36607v f343527h;

    /* renamed from: b, reason: collision with root package name */
    public final String f343528b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final i f343529c;

    /* renamed from: d, reason: collision with root package name */
    public final g f343530d;

    /* renamed from: e, reason: collision with root package name */
    public final P f343531e;

    /* renamed from: f, reason: collision with root package name */
    public final e f343532f;

    /* renamed from: g, reason: collision with root package name */
    public final j f343533g;

    /* compiled from: MediaItem.java */
    public static final class b {

        /* compiled from: MediaItem.java */
        public static final class a {
        }

        public b(a aVar, a aVar2) {
            aVar.getClass();
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* compiled from: MediaItem.java */
    public static class d implements InterfaceC36525h {

        /* renamed from: g, reason: collision with root package name */
        public static final C36607v f343547g;

        /* renamed from: b, reason: collision with root package name */
        @j.F
        public final long f343548b;

        /* renamed from: c, reason: collision with root package name */
        public final long f343549c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f343550d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f343551e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f343552f;

        static {
            new a().a();
            f343547g = new C36607v(7);
        }

        public d(a aVar, a aVar2) {
            this.f343548b = aVar.f343553a;
            this.f343549c = aVar.f343554b;
            this.f343550d = aVar.f343555c;
            this.f343551e = aVar.f343556d;
            this.f343552f = aVar.f343557e;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f343548b == dVar.f343548b && this.f343549c == dVar.f343549c && this.f343550d == dVar.f343550d && this.f343551e == dVar.f343551e && this.f343552f == dVar.f343552f;
        }

        public final int hashCode() {
            long j12 = this.f343548b;
            int i12 = ((int) (j12 ^ (j12 >>> 32))) * 31;
            long j13 = this.f343549c;
            return ((((((i12 + ((int) ((j13 >>> 32) ^ j13))) * 31) + (this.f343550d ? 1 : 0)) * 31) + (this.f343551e ? 1 : 0)) * 31) + (this.f343552f ? 1 : 0);
        }

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f343553a;

            /* renamed from: b, reason: collision with root package name */
            public long f343554b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f343555c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f343556d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f343557e;

            public a() {
                this.f343554b = Long.MIN_VALUE;
            }

            @Deprecated
            public final e a() {
                return new e(this, null);
            }

            public a(d dVar, a aVar) {
                this.f343553a = dVar.f343548b;
                this.f343554b = dVar.f343549c;
                this.f343555c = dVar.f343550d;
                this.f343556d = dVar.f343551e;
                this.f343557e = dVar.f343552f;
            }
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    public static final class e extends d {

        /* renamed from: h, reason: collision with root package name */
        public static final e f343558h = new d.a().a();

        public e(d.a aVar, a aVar2) {
            super(aVar, null);
        }
    }

    /* compiled from: MediaItem.java */
    public static final class f {

        /* compiled from: MediaItem.java */
        public static final class a {
            @Deprecated
            public a() {
                AbstractC37412t1.n();
                AbstractC37401r1.C();
            }

            public a(f fVar, a aVar) {
                fVar.getClass();
            }
        }

        public f(a aVar, a aVar2) {
            aVar.getClass();
            throw null;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* compiled from: MediaItem.java */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f343571a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final String f343572b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final f f343573c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final b f343574d;

        /* renamed from: e, reason: collision with root package name */
        public final List<StreamKey> f343575e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        public final String f343576f;

        /* renamed from: g, reason: collision with root package name */
        public final AbstractC37401r1<l> f343577g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public final Object f343578h;

        public h() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(Uri uri, String str, f fVar, b bVar, List list, String str2, AbstractC37401r1 abstractC37401r1, Object obj, a aVar) {
            this.f343571a = uri;
            this.f343572b = str;
            this.f343573c = fVar;
            this.f343574d = bVar;
            this.f343575e = list;
            this.f343576f = str2;
            this.f343577g = abstractC37401r1;
            AbstractC37401r1.a aVarS = AbstractC37401r1.s();
            for (int i12 = 0; i12 < abstractC37401r1.size(); i12++) {
                l lVar = (l) abstractC37401r1.get(i12);
                lVar.getClass();
                aVarS.g(new k(new l.a(lVar, null), null));
            }
            aVarS.i();
            this.f343578h = obj;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f343571a.equals(hVar.f343571a) && com.google.android.exoplayer2.util.U.a(this.f343572b, hVar.f343572b) && com.google.android.exoplayer2.util.U.a(this.f343573c, hVar.f343573c) && com.google.android.exoplayer2.util.U.a(this.f343574d, hVar.f343574d) && this.f343575e.equals(hVar.f343575e) && com.google.android.exoplayer2.util.U.a(this.f343576f, hVar.f343576f) && this.f343577g.equals(hVar.f343577g) && com.google.android.exoplayer2.util.U.a(this.f343578h, hVar.f343578h);
        }

        public final int hashCode() {
            int iHashCode = this.f343571a.hashCode() * 31;
            String str = this.f343572b;
            int iHashCode2 = iHashCode + (str == null ? 0 : str.hashCode());
            if (this.f343573c != null || this.f343574d != null) {
                throw null;
            }
            int iHashCode3 = (this.f343575e.hashCode() + (iHashCode2 * 29791)) * 31;
            String str2 = this.f343576f;
            int iHashCode4 = (this.f343577g.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f343578h;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    public static final class i extends h {
        public i() {
            throw null;
        }

        public i(Uri uri, String str, f fVar, b bVar, List list, String str2, AbstractC37401r1 abstractC37401r1, Object obj, a aVar) {
            super(uri, str, fVar, bVar, list, str2, abstractC37401r1, obj, null);
        }
    }

    /* compiled from: MediaItem.java */
    public static final class j implements InterfaceC36525h {

        /* renamed from: e, reason: collision with root package name */
        public static final j f343579e = new j(new a(), null);

        /* renamed from: f, reason: collision with root package name */
        public static final C36607v f343580f = new C36607v(9);

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final Uri f343581b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final String f343582c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final Bundle f343583d;

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @j.P
            public Uri f343584a;

            /* renamed from: b, reason: collision with root package name */
            @j.P
            public String f343585b;

            /* renamed from: c, reason: collision with root package name */
            @j.P
            public Bundle f343586c;

            public a() {
            }

            public a(j jVar, a aVar) {
                this.f343584a = jVar.f343581b;
                this.f343585b = jVar.f343582c;
                this.f343586c = jVar.f343583d;
            }
        }

        public j(a aVar, a aVar2) {
            this.f343581b = aVar.f343584a;
            this.f343582c = aVar.f343585b;
            this.f343583d = aVar.f343586c;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return com.google.android.exoplayer2.util.U.a(this.f343581b, jVar.f343581b) && com.google.android.exoplayer2.util.U.a(this.f343582c, jVar.f343582c);
        }

        public final int hashCode() {
            Uri uri = this.f343581b;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f343582c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    public static final class k extends l {
        public k(l.a aVar, a aVar2) {
            super(aVar, null);
        }
    }

    static {
        new c().a();
        f343527h = new C36607v(6);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o12 = (O) obj;
        return com.google.android.exoplayer2.util.U.a(this.f343528b, o12.f343528b) && this.f343532f.equals(o12.f343532f) && com.google.android.exoplayer2.util.U.a(this.f343529c, o12.f343529c) && com.google.android.exoplayer2.util.U.a(this.f343530d, o12.f343530d) && com.google.android.exoplayer2.util.U.a(this.f343531e, o12.f343531e) && com.google.android.exoplayer2.util.U.a(this.f343533g, o12.f343533g);
    }

    public final int hashCode() {
        int iHashCode = this.f343528b.hashCode() * 31;
        i iVar = this.f343529c;
        return this.f343533g.hashCode() + ((this.f343531e.hashCode() + ((this.f343532f.hashCode() + ((this.f343530d.hashCode() + ((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public O(String str, e eVar, @j.P i iVar, g gVar, P p12, j jVar) {
        this.f343528b = str;
        this.f343529c = iVar;
        this.f343530d = gVar;
        this.f343531e = p12;
        this.f343532f = eVar;
        this.f343533g = jVar;
    }

    /* compiled from: MediaItem.java */
    public static final class g implements InterfaceC36525h {

        /* renamed from: g, reason: collision with root package name */
        public static final g f343559g = new g(new a(), null);

        /* renamed from: h, reason: collision with root package name */
        public static final C36607v f343560h = new C36607v(8);

        /* renamed from: b, reason: collision with root package name */
        public final long f343561b;

        /* renamed from: c, reason: collision with root package name */
        public final long f343562c;

        /* renamed from: d, reason: collision with root package name */
        public final long f343563d;

        /* renamed from: e, reason: collision with root package name */
        public final float f343564e;

        /* renamed from: f, reason: collision with root package name */
        public final float f343565f;

        public g(a aVar, a aVar2) {
            this(aVar.f343566a, aVar.f343567b, aVar.f343568c, aVar.f343569d, aVar.f343570e);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f343561b == gVar.f343561b && this.f343562c == gVar.f343562c && this.f343563d == gVar.f343563d && this.f343564e == gVar.f343564e && this.f343565f == gVar.f343565f;
        }

        public final int hashCode() {
            long j12 = this.f343561b;
            long j13 = this.f343562c;
            int i12 = ((((int) (j12 ^ (j12 >>> 32))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f343563d;
            int i13 = (i12 + ((int) ((j14 >>> 32) ^ j14))) * 31;
            float f12 = this.f343564e;
            int iFloatToIntBits = (i13 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f343565f;
            return iFloatToIntBits + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0);
        }

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f343566a;

            /* renamed from: b, reason: collision with root package name */
            public long f343567b;

            /* renamed from: c, reason: collision with root package name */
            public long f343568c;

            /* renamed from: d, reason: collision with root package name */
            public float f343569d;

            /* renamed from: e, reason: collision with root package name */
            public float f343570e;

            public a() {
                this.f343566a = -9223372036854775807L;
                this.f343567b = -9223372036854775807L;
                this.f343568c = -9223372036854775807L;
                this.f343569d = -3.4028235E38f;
                this.f343570e = -3.4028235E38f;
            }

            public a(g gVar, a aVar) {
                this.f343566a = gVar.f343561b;
                this.f343567b = gVar.f343562c;
                this.f343568c = gVar.f343563d;
                this.f343569d = gVar.f343564e;
                this.f343570e = gVar.f343565f;
            }
        }

        @Deprecated
        public g(long j12, long j13, long j14, float f12, float f13) {
            this.f343561b = j12;
            this.f343562c = j13;
            this.f343563d = j14;
            this.f343564e = f12;
            this.f343565f = f13;
        }
    }

    /* compiled from: MediaItem.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public String f343534a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public Uri f343535b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public String f343536c;

        /* renamed from: d, reason: collision with root package name */
        public d.a f343537d;

        /* renamed from: e, reason: collision with root package name */
        public final f.a f343538e;

        /* renamed from: f, reason: collision with root package name */
        public final List<StreamKey> f343539f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        public final String f343540g;

        /* renamed from: h, reason: collision with root package name */
        public AbstractC37401r1<l> f343541h;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        public final b f343542i;

        /* renamed from: j, reason: collision with root package name */
        @j.P
        public Object f343543j;

        /* renamed from: k, reason: collision with root package name */
        @j.P
        public final P f343544k;

        /* renamed from: l, reason: collision with root package name */
        public g.a f343545l;

        /* renamed from: m, reason: collision with root package name */
        public final j f343546m;

        public c() {
            this.f343537d = new d.a();
            this.f343538e = new f.a();
            this.f343539f = Collections.emptyList();
            this.f343541h = AbstractC37401r1.C();
            this.f343545l = new g.a();
            this.f343546m = j.f343579e;
        }

        public final O a() {
            i iVar;
            this.f343538e.getClass();
            Uri uri = this.f343535b;
            if (uri != null) {
                String str = this.f343536c;
                this.f343538e.getClass();
                iVar = new i(uri, str, null, this.f343542i, this.f343539f, this.f343540g, this.f343541h, this.f343543j, null);
            } else {
                iVar = null;
            }
            String str2 = this.f343534a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            e eVarA = this.f343537d.a();
            g.a aVar = this.f343545l;
            aVar.getClass();
            g gVar = new g(aVar, null);
            P p12 = this.f343544k;
            if (p12 == null) {
                p12 = P.f343601H;
            }
            return new O(str3, eVarA, iVar, gVar, p12, this.f343546m);
        }

        public c(O o12, a aVar) {
            f.a aVar2;
            this();
            e eVar = o12.f343532f;
            eVar.getClass();
            this.f343537d = new d.a(eVar, null);
            this.f343534a = o12.f343528b;
            this.f343544k = o12.f343531e;
            g gVar = o12.f343530d;
            gVar.getClass();
            this.f343545l = new g.a(gVar, null);
            this.f343546m = o12.f343533g;
            i iVar = o12.f343529c;
            if (iVar != null) {
                this.f343540g = iVar.f343576f;
                this.f343536c = iVar.f343572b;
                this.f343535b = iVar.f343571a;
                this.f343539f = iVar.f343575e;
                this.f343541h = iVar.f343577g;
                this.f343543j = iVar.f343578h;
                f fVar = iVar.f343573c;
                if (fVar != null) {
                    aVar2 = new f.a(fVar, null);
                } else {
                    aVar2 = new f.a();
                }
                this.f343538e = aVar2;
                this.f343542i = iVar.f343574d;
            }
        }
    }

    /* compiled from: MediaItem.java */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f343587a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final String f343588b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final String f343589c;

        /* renamed from: d, reason: collision with root package name */
        public final int f343590d;

        /* renamed from: e, reason: collision with root package name */
        public final int f343591e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        public final String f343592f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        public final String f343593g;

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final Uri f343594a;

            /* renamed from: b, reason: collision with root package name */
            @j.P
            public final String f343595b;

            /* renamed from: c, reason: collision with root package name */
            @j.P
            public final String f343596c;

            /* renamed from: d, reason: collision with root package name */
            public final int f343597d;

            /* renamed from: e, reason: collision with root package name */
            public final int f343598e;

            /* renamed from: f, reason: collision with root package name */
            @j.P
            public final String f343599f;

            /* renamed from: g, reason: collision with root package name */
            @j.P
            public final String f343600g;

            public a(l lVar, a aVar) {
                this.f343594a = lVar.f343587a;
                this.f343595b = lVar.f343588b;
                this.f343596c = lVar.f343589c;
                this.f343597d = lVar.f343590d;
                this.f343598e = lVar.f343591e;
                this.f343599f = lVar.f343592f;
                this.f343600g = lVar.f343593g;
            }
        }

        public l(Uri uri, String str, String str2, int i12, int i13, String str3, String str4, a aVar) {
            this.f343587a = uri;
            this.f343588b = str;
            this.f343589c = str2;
            this.f343590d = i12;
            this.f343591e = i13;
            this.f343592f = str3;
            this.f343593g = str4;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f343587a.equals(lVar.f343587a) && com.google.android.exoplayer2.util.U.a(this.f343588b, lVar.f343588b) && com.google.android.exoplayer2.util.U.a(this.f343589c, lVar.f343589c) && this.f343590d == lVar.f343590d && this.f343591e == lVar.f343591e && com.google.android.exoplayer2.util.U.a(this.f343592f, lVar.f343592f) && com.google.android.exoplayer2.util.U.a(this.f343593g, lVar.f343593g);
        }

        public final int hashCode() {
            int iHashCode = this.f343587a.hashCode() * 31;
            String str = this.f343588b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f343589c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f343590d) * 31) + this.f343591e) * 31;
            String str3 = this.f343592f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f343593g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public l(a aVar, a aVar2) {
            this.f343587a = aVar.f343594a;
            this.f343588b = aVar.f343595b;
            this.f343589c = aVar.f343596c;
            this.f343590d = aVar.f343597d;
            this.f343591e = aVar.f343598e;
            this.f343592f = aVar.f343599f;
            this.f343593g = aVar.f343600g;
        }
    }
}
