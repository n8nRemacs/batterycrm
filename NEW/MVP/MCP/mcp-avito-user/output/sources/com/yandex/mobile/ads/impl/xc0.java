package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.exo.offline.StreamKey;
import com.yandex.mobile.ads.impl.rg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class xc0 implements rg {

    /* renamed from: g, reason: collision with root package name */
    public static final rg.a<xc0> f391604g;

    /* renamed from: a, reason: collision with root package name */
    public final String f391605a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final g f391606b;

    /* renamed from: c, reason: collision with root package name */
    public final e f391607c;

    /* renamed from: d, reason: collision with root package name */
    public final ad0 f391608d;

    /* renamed from: e, reason: collision with root package name */
    public final c f391609e;

    /* renamed from: f, reason: collision with root package name */
    public final h f391610f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private String f391611a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private Uri f391612b;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        private String f391616f;

        /* renamed from: c, reason: collision with root package name */
        private b.a f391613c = new b.a();

        /* renamed from: d, reason: collision with root package name */
        private d.a f391614d = new d.a(0);

        /* renamed from: e, reason: collision with root package name */
        private List<StreamKey> f391615e = Collections.emptyList();

        /* renamed from: g, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.p<j> f391617g = com.yandex.mobile.ads.embedded.guava.collect.p.i();

        /* renamed from: h, reason: collision with root package name */
        private e.a f391618h = new e.a();

        /* renamed from: i, reason: collision with root package name */
        private h f391619i = h.f391661c;

        public final a a(@j.P Uri uri) {
            this.f391612b = uri;
            return this;
        }

        public final a b(String str) {
            str.getClass();
            this.f391611a = str;
            return this;
        }

        public final a c(@j.P String str) {
            this.f391612b = str == null ? null : Uri.parse(str);
            return this;
        }

        public final a a(@j.P List<StreamKey> list) {
            this.f391615e = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        public final a a(@j.P String str) {
            this.f391616f = str;
            return this;
        }

        public final xc0 a() {
            g gVar;
            d dVar;
            int i12 = 0;
            db.b(d.a.e(this.f391614d) == null || d.a.f(this.f391614d) != null);
            Uri uri = this.f391612b;
            if (uri != null) {
                if (d.a.f(this.f391614d) != null) {
                    d.a aVar = this.f391614d;
                    aVar.getClass();
                    dVar = new d(aVar, i12);
                } else {
                    dVar = null;
                }
                gVar = new g(uri, null, dVar, this.f391615e, this.f391616f, this.f391617g, null, 0);
            } else {
                gVar = null;
            }
            String str = this.f391611a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            b.a aVar2 = this.f391613c;
            aVar2.getClass();
            return new xc0(str2, new c(aVar2, i12), gVar, this.f391618h.a(), ad0.f383464G, this.f391619i, 0);
        }
    }

    public static class b implements rg {

        /* renamed from: f, reason: collision with root package name */
        public static final rg.a<c> f391620f;

        /* renamed from: a, reason: collision with root package name */
        @j.F
        public final long f391621a;

        /* renamed from: b, reason: collision with root package name */
        public final long f391622b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f391623c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f391624d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f391625e;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f391626a;

            /* renamed from: b, reason: collision with root package name */
            private long f391627b = Long.MIN_VALUE;

            /* renamed from: c, reason: collision with root package name */
            private boolean f391628c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f391629d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f391630e;

            public final a a(long j12) {
                db.a(j12 == Long.MIN_VALUE || j12 >= 0);
                this.f391627b = j12;
                return this;
            }

            public final a b(@j.F long j12) {
                db.a(j12 >= 0);
                this.f391626a = j12;
                return this;
            }

            public final a c(boolean z12) {
                this.f391630e = z12;
                return this;
            }

            public final a a(boolean z12) {
                this.f391629d = z12;
                return this;
            }

            public final a b(boolean z12) {
                this.f391628c = z12;
                return this;
            }
        }

        static {
            new c(new a(), 0);
            f391620f = new Q0(16);
        }

        public /* synthetic */ b(a aVar, int i12) {
            this(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c a(Bundle bundle) {
            return new c(new a().b(bundle.getLong(Integer.toString(0, 36), 0L)).a(bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE)).b(bundle.getBoolean(Integer.toString(2, 36), false)).a(bundle.getBoolean(Integer.toString(3, 36), false)).c(bundle.getBoolean(Integer.toString(4, 36), false)), 0);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f391621a == bVar.f391621a && this.f391622b == bVar.f391622b && this.f391623c == bVar.f391623c && this.f391624d == bVar.f391624d && this.f391625e == bVar.f391625e;
        }

        public final int hashCode() {
            long j12 = this.f391621a;
            int i12 = ((int) (j12 ^ (j12 >>> 32))) * 31;
            long j13 = this.f391622b;
            return ((((((i12 + ((int) ((j13 >>> 32) ^ j13))) * 31) + (this.f391623c ? 1 : 0)) * 31) + (this.f391624d ? 1 : 0)) * 31) + (this.f391625e ? 1 : 0);
        }

        private b(a aVar) {
            this.f391621a = aVar.f391626a;
            this.f391622b = aVar.f391627b;
            this.f391623c = aVar.f391628c;
            this.f391624d = aVar.f391629d;
            this.f391625e = aVar.f391630e;
        }
    }

    @Deprecated
    public static final class c extends b {

        /* renamed from: g, reason: collision with root package name */
        public static final c f391631g = new c(new b.a(), 0);

        public /* synthetic */ c(b.a aVar, int i12) {
            this(aVar);
        }

        private c(b.a aVar) {
            super(aVar, 0);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f391632a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final Uri f391633b;

        /* renamed from: c, reason: collision with root package name */
        public final com.yandex.mobile.ads.embedded.guava.collect.q<String, String> f391634c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f391635d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f391636e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f391637f;

        /* renamed from: g, reason: collision with root package name */
        public final com.yandex.mobile.ads.embedded.guava.collect.p<Integer> f391638g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        private final byte[] f391639h;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private com.yandex.mobile.ads.embedded.guava.collect.q<String, String> f391640a;

            /* renamed from: b, reason: collision with root package name */
            private com.yandex.mobile.ads.embedded.guava.collect.p<Integer> f391641b;

            public /* synthetic */ a(int i12) {
                this();
            }

            public static /* synthetic */ boolean a(a aVar) {
                aVar.getClass();
                return false;
            }

            public static /* synthetic */ boolean b(a aVar) {
                aVar.getClass();
                return false;
            }

            public static /* synthetic */ byte[] d(a aVar) {
                aVar.getClass();
                return null;
            }

            public static /* synthetic */ Uri e(a aVar) {
                aVar.getClass();
                return null;
            }

            public static /* synthetic */ UUID f(a aVar) {
                aVar.getClass();
                return null;
            }

            public static /* synthetic */ boolean g(a aVar) {
                aVar.getClass();
                return false;
            }

            @Deprecated
            private a() {
                this.f391640a = com.yandex.mobile.ads.embedded.guava.collect.q.h();
                this.f391641b = com.yandex.mobile.ads.embedded.guava.collect.p.i();
            }
        }

        public /* synthetic */ d(a aVar, int i12) {
            this(aVar);
        }

        @j.P
        public final byte[] a() {
            byte[] bArr = this.f391639h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f391632a.equals(dVar.f391632a) && pc1.a(this.f391633b, dVar.f391633b) && pc1.a(this.f391634c, dVar.f391634c) && this.f391635d == dVar.f391635d && this.f391637f == dVar.f391637f && this.f391636e == dVar.f391636e && this.f391638g.equals(dVar.f391638g) && Arrays.equals(this.f391639h, dVar.f391639h);
        }

        public final int hashCode() {
            int iHashCode = this.f391632a.hashCode() * 31;
            Uri uri = this.f391633b;
            return Arrays.hashCode(this.f391639h) + ((this.f391638g.hashCode() + ((((((((this.f391634c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f391635d ? 1 : 0)) * 31) + (this.f391637f ? 1 : 0)) * 31) + (this.f391636e ? 1 : 0)) * 31)) * 31);
        }

        private d(a aVar) {
            db.b((a.g(aVar) && a.e(aVar) == null) ? false : true);
            this.f391632a = (UUID) db.a(a.f(aVar));
            this.f391633b = a.e(aVar);
            this.f391634c = aVar.f391640a;
            this.f391635d = a.a(aVar);
            this.f391637f = a.g(aVar);
            this.f391636e = a.b(aVar);
            this.f391638g = aVar.f391641b;
            this.f391639h = a.d(aVar) != null ? Arrays.copyOf(a.d(aVar), a.d(aVar).length) : null;
        }
    }

    public static final class e implements rg {

        /* renamed from: f, reason: collision with root package name */
        public static final e f391642f = new a().a();

        /* renamed from: g, reason: collision with root package name */
        public static final rg.a<e> f391643g = new Q0(17);

        /* renamed from: a, reason: collision with root package name */
        public final long f391644a;

        /* renamed from: b, reason: collision with root package name */
        public final long f391645b;

        /* renamed from: c, reason: collision with root package name */
        public final long f391646c;

        /* renamed from: d, reason: collision with root package name */
        public final float f391647d;

        /* renamed from: e, reason: collision with root package name */
        public final float f391648e;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f391649a = -9223372036854775807L;

            /* renamed from: b, reason: collision with root package name */
            private long f391650b = -9223372036854775807L;

            /* renamed from: c, reason: collision with root package name */
            private long f391651c = -9223372036854775807L;

            /* renamed from: d, reason: collision with root package name */
            private float f391652d = -3.4028235E38f;

            /* renamed from: e, reason: collision with root package name */
            private float f391653e = -3.4028235E38f;

            public final e a() {
                return new e(this, 0);
            }
        }

        public /* synthetic */ e(a aVar, int i12) {
            this(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e a(Bundle bundle) {
            return new e(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f391644a == eVar.f391644a && this.f391645b == eVar.f391645b && this.f391646c == eVar.f391646c && this.f391647d == eVar.f391647d && this.f391648e == eVar.f391648e;
        }

        public final int hashCode() {
            long j12 = this.f391644a;
            long j13 = this.f391645b;
            int i12 = ((((int) (j12 ^ (j12 >>> 32))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f391646c;
            int i13 = (i12 + ((int) ((j14 >>> 32) ^ j14))) * 31;
            float f12 = this.f391647d;
            int iFloatToIntBits = (i13 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f391648e;
            return iFloatToIntBits + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0);
        }

        private e(a aVar) {
            this(aVar.f391649a, aVar.f391650b, aVar.f391651c, aVar.f391652d, aVar.f391653e);
        }

        @Deprecated
        public e(long j12, long j13, long j14, float f12, float f13) {
            this.f391644a = j12;
            this.f391645b = j13;
            this.f391646c = j14;
            this.f391647d = f12;
            this.f391648e = f13;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f391654a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final String f391655b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final d f391656c;

        /* renamed from: d, reason: collision with root package name */
        public final List<StreamKey> f391657d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public final String f391658e;

        /* renamed from: f, reason: collision with root package name */
        public final com.yandex.mobile.ads.embedded.guava.collect.p<j> f391659f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        public final Object f391660g;

        public /* synthetic */ f(Uri uri, String str, d dVar, List list, String str2, com.yandex.mobile.ads.embedded.guava.collect.p pVar, Object obj, int i12) {
            this(uri, str, dVar, list, str2, pVar, obj);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f391654a.equals(fVar.f391654a) && pc1.a(this.f391655b, fVar.f391655b) && pc1.a(this.f391656c, fVar.f391656c) && pc1.a((Object) null, (Object) null) && this.f391657d.equals(fVar.f391657d) && pc1.a(this.f391658e, fVar.f391658e) && this.f391659f.equals(fVar.f391659f) && pc1.a(this.f391660g, fVar.f391660g);
        }

        public final int hashCode() {
            int iHashCode = this.f391654a.hashCode() * 31;
            String str = this.f391655b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.f391656c;
            int iHashCode3 = (this.f391657d.hashCode() + ((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 961)) * 31;
            String str2 = this.f391658e;
            int iHashCode4 = (this.f391659f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f391660g;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private f(Uri uri, @j.P String str, @j.P d dVar, List list, @j.P String str2, com.yandex.mobile.ads.embedded.guava.collect.p pVar, @j.P Object obj) {
            this.f391654a = uri;
            this.f391655b = str;
            this.f391656c = dVar;
            this.f391657d = list;
            this.f391658e = str2;
            this.f391659f = pVar;
            p.a aVarH = com.yandex.mobile.ads.embedded.guava.collect.p.h();
            for (int i12 = 0; i12 < pVar.size(); i12++) {
                aVarH.b(j.a.a(((j) pVar.get(i12)).a()));
            }
            aVarH.a();
            this.f391660g = obj;
        }
    }

    @Deprecated
    public static final class g extends f {
        public /* synthetic */ g(Uri uri, String str, d dVar, List list, String str2, com.yandex.mobile.ads.embedded.guava.collect.p pVar, Object obj, int i12) {
            this(uri, str, dVar, list, str2, pVar, obj);
        }

        private g(Uri uri, @j.P String str, @j.P d dVar, List list, @j.P String str2, com.yandex.mobile.ads.embedded.guava.collect.p pVar, @j.P Object obj) {
            super(uri, str, dVar, list, str2, pVar, obj, 0);
        }
    }

    public static final class h implements rg {

        /* renamed from: c, reason: collision with root package name */
        public static final h f391661c = new h(new a(), 0);

        /* renamed from: d, reason: collision with root package name */
        public static final rg.a<h> f391662d = new Q0(18);

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public final Uri f391663a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final String f391664b;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @j.P
            private Uri f391665a;

            /* renamed from: b, reason: collision with root package name */
            @j.P
            private String f391666b;

            /* renamed from: c, reason: collision with root package name */
            @j.P
            private Bundle f391667c;

            public final a a(@j.P Uri uri) {
                this.f391665a = uri;
                return this;
            }

            public final a a(@j.P String str) {
                this.f391666b = str;
                return this;
            }

            public final a a(@j.P Bundle bundle) {
                this.f391667c = bundle;
                return this;
            }
        }

        public /* synthetic */ h(a aVar, int i12) {
            this(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static h a(Bundle bundle) {
            return new h(new a().a((Uri) bundle.getParcelable(Integer.toString(0, 36))).a(bundle.getString(Integer.toString(1, 36))).a(bundle.getBundle(Integer.toString(2, 36))), 0);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return pc1.a(this.f391663a, hVar.f391663a) && pc1.a(this.f391664b, hVar.f391664b);
        }

        public final int hashCode() {
            Uri uri = this.f391663a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f391664b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        private h(a aVar) {
            this.f391663a = aVar.f391665a;
            this.f391664b = aVar.f391666b;
            Bundle unused = aVar.f391667c;
        }
    }

    @Deprecated
    public static final class i extends j {
        public /* synthetic */ i(j.a aVar, int i12) {
            this(aVar);
        }

        private i(j.a aVar) {
            super(aVar, 0);
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f391668a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final String f391669b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final String f391670c;

        /* renamed from: d, reason: collision with root package name */
        public final int f391671d;

        /* renamed from: e, reason: collision with root package name */
        public final int f391672e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        public final String f391673f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        public final String f391674g;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f391675a;

            /* renamed from: b, reason: collision with root package name */
            @j.P
            private String f391676b;

            /* renamed from: c, reason: collision with root package name */
            @j.P
            private String f391677c;

            /* renamed from: d, reason: collision with root package name */
            private int f391678d;

            /* renamed from: e, reason: collision with root package name */
            private int f391679e;

            /* renamed from: f, reason: collision with root package name */
            @j.P
            private String f391680f;

            /* renamed from: g, reason: collision with root package name */
            @j.P
            private String f391681g;

            public /* synthetic */ a(j jVar, int i12) {
                this(jVar);
            }

            public static i a(a aVar) {
                return new i(aVar, 0);
            }

            private a(j jVar) {
                this.f391675a = jVar.f391668a;
                this.f391676b = jVar.f391669b;
                this.f391677c = jVar.f391670c;
                this.f391678d = jVar.f391671d;
                this.f391679e = jVar.f391672e;
                this.f391680f = jVar.f391673f;
                this.f391681g = jVar.f391674g;
            }
        }

        public /* synthetic */ j(a aVar, int i12) {
            this(aVar);
        }

        public final a a() {
            return new a(this, 0);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f391668a.equals(jVar.f391668a) && pc1.a(this.f391669b, jVar.f391669b) && pc1.a(this.f391670c, jVar.f391670c) && this.f391671d == jVar.f391671d && this.f391672e == jVar.f391672e && pc1.a(this.f391673f, jVar.f391673f) && pc1.a(this.f391674g, jVar.f391674g);
        }

        public final int hashCode() {
            int iHashCode = this.f391668a.hashCode() * 31;
            String str = this.f391669b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f391670c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f391671d) * 31) + this.f391672e) * 31;
            String str3 = this.f391673f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f391674g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private j(a aVar) {
            this.f391668a = aVar.f391675a;
            this.f391669b = aVar.f391676b;
            this.f391670c = aVar.f391677c;
            this.f391671d = aVar.f391678d;
            this.f391672e = aVar.f391679e;
            this.f391673f = aVar.f391680f;
            this.f391674g = aVar.f391681g;
        }
    }

    static {
        new a().a();
        f391604g = new Q0(15);
    }

    public /* synthetic */ xc0(String str, c cVar, g gVar, e eVar, ad0 ad0Var, h hVar, int i12) {
        this(str, cVar, gVar, eVar, ad0Var, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static xc0 a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(0, 36), "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        e eVar = bundle2 == null ? e.f391642f : (e) e.f391643g.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        ad0 ad0Var = bundle3 == null ? ad0.f383464G : (ad0) ad0.f383465H.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        c cVar = bundle4 == null ? c.f391631g : (c) b.f391620f.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        return new xc0(string, cVar, null, eVar, ad0Var, bundle5 == null ? h.f391661c : (h) h.f391662d.fromBundle(bundle5));
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc0)) {
            return false;
        }
        xc0 xc0Var = (xc0) obj;
        return pc1.a(this.f391605a, xc0Var.f391605a) && this.f391609e.equals(xc0Var.f391609e) && pc1.a(this.f391606b, xc0Var.f391606b) && pc1.a(this.f391607c, xc0Var.f391607c) && pc1.a(this.f391608d, xc0Var.f391608d) && pc1.a(this.f391610f, xc0Var.f391610f);
    }

    public final int hashCode() {
        int iHashCode = this.f391605a.hashCode() * 31;
        g gVar = this.f391606b;
        return this.f391610f.hashCode() + ((this.f391608d.hashCode() + ((this.f391609e.hashCode() + ((this.f391607c.hashCode() + ((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    private xc0(String str, c cVar, @j.P g gVar, e eVar, ad0 ad0Var, h hVar) {
        this.f391605a = str;
        this.f391606b = gVar;
        this.f391607c = eVar;
        this.f391608d = ad0Var;
        this.f391609e = cVar;
        this.f391610f = hVar;
    }
}
