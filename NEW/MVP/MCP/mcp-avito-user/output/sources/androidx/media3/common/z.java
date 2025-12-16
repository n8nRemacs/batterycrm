package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23114e;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: MediaItem.java */
/* loaded from: classes.dex */
public final class z implements InterfaceC23096j {

    /* renamed from: h, reason: collision with root package name */
    public static final z f47970h = new c().a();

    /* renamed from: i, reason: collision with root package name */
    public static final String f47971i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f47972j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f47973k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f47974l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f47975m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f47976n;

    /* renamed from: o, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final C23088b f47977o;

    /* renamed from: b, reason: collision with root package name */
    public final String f47978b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final h f47979c;

    /* renamed from: d, reason: collision with root package name */
    public final g f47980d;

    /* renamed from: e, reason: collision with root package name */
    public final B f47981e;

    /* renamed from: f, reason: collision with root package name */
    public final e f47982f;

    /* renamed from: g, reason: collision with root package name */
    public final i f47983g;

    /* compiled from: MediaItem.java */
    public static final class b implements InterfaceC23096j {

        /* renamed from: c, reason: collision with root package name */
        public static final String f47984c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final C23088b f47985d;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f47986b;

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public Uri f47987a;
        }

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f47984c = Integer.toString(0, 36);
            f47985d = new C23088b(8);
        }

        public b(a aVar, a aVar2) {
            this.f47986b = aVar.f47987a;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f47986b.equals(((b) obj).f47986b) && androidx.media3.common.util.M.a(null, null);
            }
            return false;
        }

        public final int hashCode() {
            return this.f47986b.hashCode() * 31;
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @androidx.media3.common.util.J
        public final Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f47984c, this.f47986b);
            return bundle;
        }
    }

    /* compiled from: MediaItem.java */
    public static class d implements InterfaceC23096j {

        /* renamed from: g, reason: collision with root package name */
        public static final e f48001g = new e(new a(), null);

        /* renamed from: h, reason: collision with root package name */
        public static final String f48002h;

        /* renamed from: i, reason: collision with root package name */
        public static final String f48003i;

        /* renamed from: j, reason: collision with root package name */
        public static final String f48004j;

        /* renamed from: k, reason: collision with root package name */
        public static final String f48005k;

        /* renamed from: l, reason: collision with root package name */
        public static final String f48006l;

        /* renamed from: m, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final C23088b f48007m;

        /* renamed from: b, reason: collision with root package name */
        @j.F
        public final long f48008b;

        /* renamed from: c, reason: collision with root package name */
        public final long f48009c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f48010d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f48011e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f48012f;

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f48002h = Integer.toString(0, 36);
            f48003i = Integer.toString(1, 36);
            f48004j = Integer.toString(2, 36);
            f48005k = Integer.toString(3, 36);
            f48006l = Integer.toString(4, 36);
            f48007m = new C23088b(9);
        }

        public d(a aVar, a aVar2) {
            this.f48008b = aVar.f48013a;
            this.f48009c = aVar.f48014b;
            this.f48010d = aVar.f48015c;
            this.f48011e = aVar.f48016d;
            this.f48012f = aVar.f48017e;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f48008b == dVar.f48008b && this.f48009c == dVar.f48009c && this.f48010d == dVar.f48010d && this.f48011e == dVar.f48011e && this.f48012f == dVar.f48012f;
        }

        public final int hashCode() {
            long j12 = this.f48008b;
            int i12 = ((int) (j12 ^ (j12 >>> 32))) * 31;
            long j13 = this.f48009c;
            return ((((((i12 + ((int) ((j13 >>> 32) ^ j13))) * 31) + (this.f48010d ? 1 : 0)) * 31) + (this.f48011e ? 1 : 0)) * 31) + (this.f48012f ? 1 : 0);
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @androidx.media3.common.util.J
        public final Bundle k() {
            Bundle bundle = new Bundle();
            e eVar = f48001g;
            long j12 = eVar.f48008b;
            long j13 = this.f48008b;
            if (j13 != j12) {
                bundle.putLong(f48002h, j13);
            }
            long j14 = this.f48009c;
            if (j14 != eVar.f48009c) {
                bundle.putLong(f48003i, j14);
            }
            boolean z12 = eVar.f48010d;
            boolean z13 = this.f48010d;
            if (z13 != z12) {
                bundle.putBoolean(f48004j, z13);
            }
            boolean z14 = eVar.f48011e;
            boolean z15 = this.f48011e;
            if (z15 != z14) {
                bundle.putBoolean(f48005k, z15);
            }
            boolean z16 = eVar.f48012f;
            boolean z17 = this.f48012f;
            if (z17 != z16) {
                bundle.putBoolean(f48006l, z17);
            }
            return bundle;
        }

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f48013a;

            /* renamed from: b, reason: collision with root package name */
            public long f48014b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f48015c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f48016d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f48017e;

            public a() {
                this.f48014b = Long.MIN_VALUE;
            }

            public a(d dVar, a aVar) {
                this.f48013a = dVar.f48008b;
                this.f48014b = dVar.f48009c;
                this.f48015c = dVar.f48010d;
                this.f48016d = dVar.f48011e;
                this.f48017e = dVar.f48012f;
            }
        }
    }

    /* compiled from: MediaItem.java */
    @androidx.media3.common.util.J
    @Deprecated
    public static final class e extends d {

        /* renamed from: n, reason: collision with root package name */
        public static final e f48018n = new e(new d.a(), null);

        public e(d.a aVar, a aVar2) {
            super(aVar, null);
        }
    }

    /* compiled from: MediaItem.java */
    public static final class f implements InterfaceC23096j {

        /* renamed from: j, reason: collision with root package name */
        public static final String f48019j;

        /* renamed from: k, reason: collision with root package name */
        public static final String f48020k;

        /* renamed from: l, reason: collision with root package name */
        public static final String f48021l;

        /* renamed from: m, reason: collision with root package name */
        public static final String f48022m;

        /* renamed from: n, reason: collision with root package name */
        public static final String f48023n;

        /* renamed from: o, reason: collision with root package name */
        public static final String f48024o;

        /* renamed from: p, reason: collision with root package name */
        public static final String f48025p;

        /* renamed from: q, reason: collision with root package name */
        public static final String f48026q;

        /* renamed from: r, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final C23088b f48027r;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f48028b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final Uri f48029c;

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC37412t1<String, String> f48030d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f48031e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f48032f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f48033g;

        /* renamed from: h, reason: collision with root package name */
        public final AbstractC37401r1<Integer> f48034h;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        public final byte[] f48035i;

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @j.P
            public UUID f48036a;

            /* renamed from: b, reason: collision with root package name */
            @j.P
            public Uri f48037b;

            /* renamed from: c, reason: collision with root package name */
            public AbstractC37412t1<String, String> f48038c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f48039d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f48040e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f48041f;

            /* renamed from: g, reason: collision with root package name */
            public AbstractC37401r1<Integer> f48042g;

            /* renamed from: h, reason: collision with root package name */
            @j.P
            public byte[] f48043h;

            @Deprecated
            public a() {
                this.f48038c = AbstractC37412t1.n();
                this.f48042g = AbstractC37401r1.C();
            }

            public a(f fVar, a aVar) {
                this.f48036a = fVar.f48028b;
                this.f48037b = fVar.f48029c;
                this.f48038c = fVar.f48030d;
                this.f48039d = fVar.f48031e;
                this.f48040e = fVar.f48032f;
                this.f48041f = fVar.f48033g;
                this.f48042g = fVar.f48034h;
                this.f48043h = fVar.f48035i;
            }
        }

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f48019j = Integer.toString(0, 36);
            f48020k = Integer.toString(1, 36);
            f48021l = Integer.toString(2, 36);
            f48022m = Integer.toString(3, 36);
            f48023n = Integer.toString(4, 36);
            f48024o = Integer.toString(5, 36);
            f48025p = Integer.toString(6, 36);
            f48026q = Integer.toString(7, 36);
            f48027r = new C23088b(10);
        }

        public f(a aVar, a aVar2) {
            C23110a.g((aVar.f48041f && aVar.f48037b == null) ? false : true);
            UUID uuid = aVar.f48036a;
            uuid.getClass();
            this.f48028b = uuid;
            this.f48029c = aVar.f48037b;
            this.f48030d = aVar.f48038c;
            this.f48031e = aVar.f48039d;
            this.f48033g = aVar.f48041f;
            this.f48032f = aVar.f48040e;
            this.f48034h = aVar.f48042g;
            byte[] bArr = aVar.f48043h;
            this.f48035i = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f48028b.equals(fVar.f48028b) && androidx.media3.common.util.M.a(this.f48029c, fVar.f48029c) && androidx.media3.common.util.M.a(this.f48030d, fVar.f48030d) && this.f48031e == fVar.f48031e && this.f48033g == fVar.f48033g && this.f48032f == fVar.f48032f && this.f48034h.equals(fVar.f48034h) && Arrays.equals(this.f48035i, fVar.f48035i);
        }

        public final int hashCode() {
            int iHashCode = this.f48028b.hashCode() * 31;
            Uri uri = this.f48029c;
            return Arrays.hashCode(this.f48035i) + ((this.f48034h.hashCode() + ((((((((this.f48030d.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f48031e ? 1 : 0)) * 31) + (this.f48033g ? 1 : 0)) * 31) + (this.f48032f ? 1 : 0)) * 31)) * 31);
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @androidx.media3.common.util.J
        public final Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putString(f48019j, this.f48028b.toString());
            Uri uri = this.f48029c;
            if (uri != null) {
                bundle.putParcelable(f48020k, uri);
            }
            AbstractC37412t1<String, String> abstractC37412t1 = this.f48030d;
            if (!abstractC37412t1.isEmpty()) {
                Bundle bundle2 = new Bundle();
                for (Map.Entry<String, String> entry : abstractC37412t1.entrySet()) {
                    bundle2.putString(entry.getKey(), entry.getValue());
                }
                bundle.putBundle(f48021l, bundle2);
            }
            boolean z12 = this.f48031e;
            if (z12) {
                bundle.putBoolean(f48022m, z12);
            }
            boolean z13 = this.f48032f;
            if (z13) {
                bundle.putBoolean(f48023n, z13);
            }
            boolean z14 = this.f48033g;
            if (z14) {
                bundle.putBoolean(f48024o, z14);
            }
            AbstractC37401r1<Integer> abstractC37401r1 = this.f48034h;
            if (!abstractC37401r1.isEmpty()) {
                bundle.putIntegerArrayList(f48025p, new ArrayList<>(abstractC37401r1));
            }
            byte[] bArr = this.f48035i;
            if (bArr != null) {
                bundle.putByteArray(f48026q, bArr);
            }
            return bundle;
        }
    }

    /* compiled from: MediaItem.java */
    public static final class h implements InterfaceC23096j {

        /* renamed from: j, reason: collision with root package name */
        public static final String f48061j;

        /* renamed from: k, reason: collision with root package name */
        public static final String f48062k;

        /* renamed from: l, reason: collision with root package name */
        public static final String f48063l;

        /* renamed from: m, reason: collision with root package name */
        public static final String f48064m;

        /* renamed from: n, reason: collision with root package name */
        public static final String f48065n;

        /* renamed from: o, reason: collision with root package name */
        public static final String f48066o;

        /* renamed from: p, reason: collision with root package name */
        public static final String f48067p;

        /* renamed from: q, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final C23088b f48068q;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f48069b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final String f48070c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final f f48071d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public final b f48072e;

        /* renamed from: f, reason: collision with root package name */
        @androidx.media3.common.util.J
        public final List<StreamKey> f48073f;

        /* renamed from: g, reason: collision with root package name */
        @androidx.media3.common.util.J
        @j.P
        public final String f48074g;

        /* renamed from: h, reason: collision with root package name */
        public final AbstractC37401r1<k> f48075h;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        public final Object f48076i;

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f48061j = Integer.toString(0, 36);
            f48062k = Integer.toString(1, 36);
            f48063l = Integer.toString(2, 36);
            f48064m = Integer.toString(3, 36);
            f48065n = Integer.toString(4, 36);
            f48066o = Integer.toString(5, 36);
            f48067p = Integer.toString(6, 36);
            f48068q = new C23088b(12);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f48069b.equals(hVar.f48069b) && androidx.media3.common.util.M.a(this.f48070c, hVar.f48070c) && androidx.media3.common.util.M.a(this.f48071d, hVar.f48071d) && androidx.media3.common.util.M.a(this.f48072e, hVar.f48072e) && this.f48073f.equals(hVar.f48073f) && androidx.media3.common.util.M.a(this.f48074g, hVar.f48074g) && this.f48075h.equals(hVar.f48075h) && androidx.media3.common.util.M.a(this.f48076i, hVar.f48076i);
        }

        public final int hashCode() {
            int iHashCode = this.f48069b.hashCode() * 31;
            String str = this.f48070c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f48071d;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f48072e;
            int iHashCode4 = (this.f48073f.hashCode() + ((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
            String str2 = this.f48074g;
            int iHashCode5 = (this.f48075h.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f48076i;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @androidx.media3.common.util.J
        public final Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f48061j, this.f48069b);
            String str = this.f48070c;
            if (str != null) {
                bundle.putString(f48062k, str);
            }
            f fVar = this.f48071d;
            if (fVar != null) {
                bundle.putBundle(f48063l, fVar.k());
            }
            b bVar = this.f48072e;
            if (bVar != null) {
                bundle.putBundle(f48064m, bVar.k());
            }
            List<StreamKey> list = this.f48073f;
            if (!list.isEmpty()) {
                bundle.putParcelableArrayList(f48065n, C23114e.b(list));
            }
            String str2 = this.f48074g;
            if (str2 != null) {
                bundle.putString(f48066o, str2);
            }
            AbstractC37401r1<k> abstractC37401r1 = this.f48075h;
            if (!abstractC37401r1.isEmpty()) {
                bundle.putParcelableArrayList(f48067p, C23114e.b(abstractC37401r1));
            }
            return bundle;
        }

        public h(Uri uri, @j.P String str, @j.P f fVar, @j.P b bVar, List<StreamKey> list, @j.P String str2, AbstractC37401r1<k> abstractC37401r1, @j.P Object obj) {
            this.f48069b = uri;
            this.f48070c = str;
            this.f48071d = fVar;
            this.f48072e = bVar;
            this.f48073f = list;
            this.f48074g = str2;
            this.f48075h = abstractC37401r1;
            AbstractC37401r1.a aVarS = AbstractC37401r1.s();
            for (int i12 = 0; i12 < abstractC37401r1.size(); i12++) {
                k kVar = abstractC37401r1.get(i12);
                kVar.getClass();
                aVarS.g(new j(new k.a(kVar, null), null));
            }
            aVarS.i();
            this.f48076i = obj;
        }
    }

    /* compiled from: MediaItem.java */
    public static final class i implements InterfaceC23096j {

        /* renamed from: e, reason: collision with root package name */
        public static final i f48077e = new a().a();

        /* renamed from: f, reason: collision with root package name */
        public static final String f48078f;

        /* renamed from: g, reason: collision with root package name */
        public static final String f48079g;

        /* renamed from: h, reason: collision with root package name */
        public static final String f48080h;

        /* renamed from: i, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final C23088b f48081i;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final Uri f48082b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final String f48083c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final Bundle f48084d;

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @j.P
            public Uri f48085a;

            /* renamed from: b, reason: collision with root package name */
            @j.P
            public String f48086b;

            /* renamed from: c, reason: collision with root package name */
            @j.P
            public Bundle f48087c;

            public a() {
            }

            public final i a() {
                return new i(this, null);
            }

            public a(i iVar, a aVar) {
                this.f48085a = iVar.f48082b;
                this.f48086b = iVar.f48083c;
                this.f48087c = iVar.f48084d;
            }
        }

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f48078f = Integer.toString(0, 36);
            f48079g = Integer.toString(1, 36);
            f48080h = Integer.toString(2, 36);
            f48081i = new C23088b(13);
        }

        public i(a aVar, a aVar2) {
            this.f48082b = aVar.f48085a;
            this.f48083c = aVar.f48086b;
            this.f48084d = aVar.f48087c;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return androidx.media3.common.util.M.a(this.f48082b, iVar.f48082b) && androidx.media3.common.util.M.a(this.f48083c, iVar.f48083c);
        }

        public final int hashCode() {
            Uri uri = this.f48082b;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f48083c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @androidx.media3.common.util.J
        public final Bundle k() {
            Bundle bundle = new Bundle();
            Uri uri = this.f48082b;
            if (uri != null) {
                bundle.putParcelable(f48078f, uri);
            }
            String str = this.f48083c;
            if (str != null) {
                bundle.putString(f48079g, str);
            }
            Bundle bundle2 = this.f48084d;
            if (bundle2 != null) {
                bundle.putBundle(f48080h, bundle2);
            }
            return bundle;
        }
    }

    /* compiled from: MediaItem.java */
    @androidx.media3.common.util.J
    @Deprecated
    public static final class j extends k {
        public j(k.a aVar, a aVar2) {
            super(aVar, null);
        }
    }

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47971i = Integer.toString(0, 36);
        f47972j = Integer.toString(1, 36);
        f47973k = Integer.toString(2, 36);
        f47974l = Integer.toString(3, 36);
        f47975m = Integer.toString(4, 36);
        f47976n = Integer.toString(5, 36);
        f47977o = new C23088b(7);
    }

    @androidx.media3.common.util.J
    public final Bundle a(boolean z12) {
        h hVar;
        Bundle bundle = new Bundle();
        String str = this.f47978b;
        if (!str.equals("")) {
            bundle.putString(f47971i, str);
        }
        g gVar = g.f48044g;
        g gVar2 = this.f47980d;
        if (!gVar2.equals(gVar)) {
            bundle.putBundle(f47972j, gVar2.k());
        }
        B b12 = B.f47110J;
        B b13 = this.f47981e;
        if (!b13.equals(b12)) {
            bundle.putBundle(f47973k, b13.k());
        }
        e eVar = d.f48001g;
        e eVar2 = this.f47982f;
        if (!eVar2.equals(eVar)) {
            bundle.putBundle(f47974l, eVar2.k());
        }
        i iVar = i.f48077e;
        i iVar2 = this.f47983g;
        if (!iVar2.equals(iVar)) {
            bundle.putBundle(f47975m, iVar2.k());
        }
        if (z12 && (hVar = this.f47979c) != null) {
            bundle.putBundle(f47976n, hVar.k());
        }
        return bundle;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return androidx.media3.common.util.M.a(this.f47978b, zVar.f47978b) && this.f47982f.equals(zVar.f47982f) && androidx.media3.common.util.M.a(this.f47979c, zVar.f47979c) && androidx.media3.common.util.M.a(this.f47980d, zVar.f47980d) && androidx.media3.common.util.M.a(this.f47981e, zVar.f47981e) && androidx.media3.common.util.M.a(this.f47983g, zVar.f47983g);
    }

    public final int hashCode() {
        int iHashCode = this.f47978b.hashCode() * 31;
        h hVar = this.f47979c;
        return this.f47983g.hashCode() + ((this.f47981e.hashCode() + ((this.f47982f.hashCode() + ((this.f47980d.hashCode() + ((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        return a(false);
    }

    public z(String str, e eVar, @j.P h hVar, g gVar, B b12, i iVar) {
        this.f47978b = str;
        this.f47979c = hVar;
        this.f47980d = gVar;
        this.f47981e = b12;
        this.f47982f = eVar;
        this.f47983g = iVar;
    }

    /* compiled from: MediaItem.java */
    public static final class g implements InterfaceC23096j {

        /* renamed from: g, reason: collision with root package name */
        public static final g f48044g = new g(new a(), null);

        /* renamed from: h, reason: collision with root package name */
        public static final String f48045h;

        /* renamed from: i, reason: collision with root package name */
        public static final String f48046i;

        /* renamed from: j, reason: collision with root package name */
        public static final String f48047j;

        /* renamed from: k, reason: collision with root package name */
        public static final String f48048k;

        /* renamed from: l, reason: collision with root package name */
        public static final String f48049l;

        /* renamed from: m, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final C23088b f48050m;

        /* renamed from: b, reason: collision with root package name */
        public final long f48051b;

        /* renamed from: c, reason: collision with root package name */
        public final long f48052c;

        /* renamed from: d, reason: collision with root package name */
        public final long f48053d;

        /* renamed from: e, reason: collision with root package name */
        public final float f48054e;

        /* renamed from: f, reason: collision with root package name */
        public final float f48055f;

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f48045h = Integer.toString(0, 36);
            f48046i = Integer.toString(1, 36);
            f48047j = Integer.toString(2, 36);
            f48048k = Integer.toString(3, 36);
            f48049l = Integer.toString(4, 36);
            f48050m = new C23088b(11);
        }

        public g(a aVar, a aVar2) {
            this(aVar.f48056a, aVar.f48057b, aVar.f48058c, aVar.f48059d, aVar.f48060e);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f48051b == gVar.f48051b && this.f48052c == gVar.f48052c && this.f48053d == gVar.f48053d && this.f48054e == gVar.f48054e && this.f48055f == gVar.f48055f;
        }

        public final int hashCode() {
            long j12 = this.f48051b;
            long j13 = this.f48052c;
            int i12 = ((((int) (j12 ^ (j12 >>> 32))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f48053d;
            int i13 = (i12 + ((int) ((j14 >>> 32) ^ j14))) * 31;
            float f12 = this.f48054e;
            int iFloatToIntBits = (i13 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f48055f;
            return iFloatToIntBits + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0);
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @androidx.media3.common.util.J
        public final Bundle k() {
            Bundle bundle = new Bundle();
            g gVar = f48044g;
            long j12 = gVar.f48051b;
            long j13 = this.f48051b;
            if (j13 != j12) {
                bundle.putLong(f48045h, j13);
            }
            long j14 = gVar.f48052c;
            long j15 = this.f48052c;
            if (j15 != j14) {
                bundle.putLong(f48046i, j15);
            }
            long j16 = gVar.f48053d;
            long j17 = this.f48053d;
            if (j17 != j16) {
                bundle.putLong(f48047j, j17);
            }
            float f12 = gVar.f48054e;
            float f13 = this.f48054e;
            if (f13 != f12) {
                bundle.putFloat(f48048k, f13);
            }
            float f14 = gVar.f48055f;
            float f15 = this.f48055f;
            if (f15 != f14) {
                bundle.putFloat(f48049l, f15);
            }
            return bundle;
        }

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f48056a;

            /* renamed from: b, reason: collision with root package name */
            public long f48057b;

            /* renamed from: c, reason: collision with root package name */
            public long f48058c;

            /* renamed from: d, reason: collision with root package name */
            public float f48059d;

            /* renamed from: e, reason: collision with root package name */
            public float f48060e;

            public a() {
                this.f48056a = -9223372036854775807L;
                this.f48057b = -9223372036854775807L;
                this.f48058c = -9223372036854775807L;
                this.f48059d = -3.4028235E38f;
                this.f48060e = -3.4028235E38f;
            }

            public a(g gVar, a aVar) {
                this.f48056a = gVar.f48051b;
                this.f48057b = gVar.f48052c;
                this.f48058c = gVar.f48053d;
                this.f48059d = gVar.f48054e;
                this.f48060e = gVar.f48055f;
            }
        }

        @androidx.media3.common.util.J
        @Deprecated
        public g(long j12, long j13, long j14, float f12, float f13) {
            this.f48051b = j12;
            this.f48052c = j13;
            this.f48053d = j14;
            this.f48054e = f12;
            this.f48055f = f13;
        }
    }

    /* compiled from: MediaItem.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public String f47988a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public Uri f47989b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public String f47990c;

        /* renamed from: d, reason: collision with root package name */
        public final d.a f47991d;

        /* renamed from: e, reason: collision with root package name */
        public final f.a f47992e;

        /* renamed from: f, reason: collision with root package name */
        public final List<StreamKey> f47993f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        public final String f47994g;

        /* renamed from: h, reason: collision with root package name */
        public AbstractC37401r1<k> f47995h;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        public final b f47996i;

        /* renamed from: j, reason: collision with root package name */
        @j.P
        public Object f47997j;

        /* renamed from: k, reason: collision with root package name */
        @j.P
        public B f47998k;

        /* renamed from: l, reason: collision with root package name */
        public g.a f47999l;

        /* renamed from: m, reason: collision with root package name */
        public i f48000m;

        public c() {
            this.f47991d = new d.a();
            this.f47992e = new f.a();
            this.f47993f = Collections.emptyList();
            this.f47995h = AbstractC37401r1.C();
            this.f47999l = new g.a();
            this.f48000m = i.f48077e;
        }

        public final z a() {
            h hVar;
            f.a aVar = this.f47992e;
            C23110a.g(aVar.f48037b == null || aVar.f48036a != null);
            Uri uri = this.f47989b;
            if (uri != null) {
                String str = this.f47990c;
                f.a aVar2 = this.f47992e;
                hVar = new h(uri, str, aVar2.f48036a != null ? new f(aVar2, null) : null, this.f47996i, this.f47993f, this.f47994g, this.f47995h, this.f47997j);
            } else {
                hVar = null;
            }
            String str2 = this.f47988a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            d.a aVar3 = this.f47991d;
            aVar3.getClass();
            e eVar = new e(aVar3, null);
            g.a aVar4 = this.f47999l;
            aVar4.getClass();
            g gVar = new g(aVar4, null);
            B b12 = this.f47998k;
            if (b12 == null) {
                b12 = B.f47110J;
            }
            return new z(str3, eVar, hVar, gVar, b12, this.f48000m);
        }

        public c(z zVar, a aVar) {
            f.a aVar2;
            this();
            e eVar = zVar.f47982f;
            eVar.getClass();
            this.f47991d = new d.a(eVar, null);
            this.f47988a = zVar.f47978b;
            this.f47998k = zVar.f47981e;
            g gVar = zVar.f47980d;
            gVar.getClass();
            this.f47999l = new g.a(gVar, null);
            this.f48000m = zVar.f47983g;
            h hVar = zVar.f47979c;
            if (hVar != null) {
                this.f47994g = hVar.f48074g;
                this.f47990c = hVar.f48070c;
                this.f47989b = hVar.f48069b;
                this.f47993f = hVar.f48073f;
                this.f47995h = hVar.f48075h;
                this.f47997j = hVar.f48076i;
                f fVar = hVar.f48071d;
                if (fVar != null) {
                    aVar2 = new f.a(fVar, null);
                } else {
                    aVar2 = new f.a();
                }
                this.f47992e = aVar2;
                this.f47996i = hVar.f48072e;
            }
        }
    }

    /* compiled from: MediaItem.java */
    public static class k implements InterfaceC23096j {

        /* renamed from: i, reason: collision with root package name */
        public static final String f48088i;

        /* renamed from: j, reason: collision with root package name */
        public static final String f48089j;

        /* renamed from: k, reason: collision with root package name */
        public static final String f48090k;

        /* renamed from: l, reason: collision with root package name */
        public static final String f48091l;

        /* renamed from: m, reason: collision with root package name */
        public static final String f48092m;

        /* renamed from: n, reason: collision with root package name */
        public static final String f48093n;

        /* renamed from: o, reason: collision with root package name */
        public static final String f48094o;

        /* renamed from: p, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final C23088b f48095p;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f48096b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final String f48097c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final String f48098d;

        /* renamed from: e, reason: collision with root package name */
        public final int f48099e;

        /* renamed from: f, reason: collision with root package name */
        public final int f48100f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        public final String f48101g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public final String f48102h;

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public Uri f48103a;

            /* renamed from: b, reason: collision with root package name */
            @j.P
            public String f48104b;

            /* renamed from: c, reason: collision with root package name */
            @j.P
            public String f48105c;

            /* renamed from: d, reason: collision with root package name */
            public int f48106d;

            /* renamed from: e, reason: collision with root package name */
            public int f48107e;

            /* renamed from: f, reason: collision with root package name */
            @j.P
            public String f48108f;

            /* renamed from: g, reason: collision with root package name */
            @j.P
            public String f48109g;

            public a(k kVar, a aVar) {
                this.f48103a = kVar.f48096b;
                this.f48104b = kVar.f48097c;
                this.f48105c = kVar.f48098d;
                this.f48106d = kVar.f48099e;
                this.f48107e = kVar.f48100f;
                this.f48108f = kVar.f48101g;
                this.f48109g = kVar.f48102h;
            }
        }

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f48088i = Integer.toString(0, 36);
            f48089j = Integer.toString(1, 36);
            f48090k = Integer.toString(2, 36);
            f48091l = Integer.toString(3, 36);
            f48092m = Integer.toString(4, 36);
            f48093n = Integer.toString(5, 36);
            f48094o = Integer.toString(6, 36);
            f48095p = new C23088b(14);
        }

        public k(Uri uri, String str, String str2, int i12, int i13, String str3, String str4, a aVar) {
            this.f48096b = uri;
            this.f48097c = str;
            this.f48098d = str2;
            this.f48099e = i12;
            this.f48100f = i13;
            this.f48101g = str3;
            this.f48102h = str4;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f48096b.equals(kVar.f48096b) && androidx.media3.common.util.M.a(this.f48097c, kVar.f48097c) && androidx.media3.common.util.M.a(this.f48098d, kVar.f48098d) && this.f48099e == kVar.f48099e && this.f48100f == kVar.f48100f && androidx.media3.common.util.M.a(this.f48101g, kVar.f48101g) && androidx.media3.common.util.M.a(this.f48102h, kVar.f48102h);
        }

        public final int hashCode() {
            int iHashCode = this.f48096b.hashCode() * 31;
            String str = this.f48097c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f48098d;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f48099e) * 31) + this.f48100f) * 31;
            String str3 = this.f48101g;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f48102h;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @androidx.media3.common.util.J
        public final Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f48088i, this.f48096b);
            String str = this.f48097c;
            if (str != null) {
                bundle.putString(f48089j, str);
            }
            String str2 = this.f48098d;
            if (str2 != null) {
                bundle.putString(f48090k, str2);
            }
            int i12 = this.f48099e;
            if (i12 != 0) {
                bundle.putInt(f48091l, i12);
            }
            int i13 = this.f48100f;
            if (i13 != 0) {
                bundle.putInt(f48092m, i13);
            }
            String str3 = this.f48101g;
            if (str3 != null) {
                bundle.putString(f48093n, str3);
            }
            String str4 = this.f48102h;
            if (str4 != null) {
                bundle.putString(f48094o, str4);
            }
            return bundle;
        }

        public k(a aVar, a aVar2) {
            this.f48096b = aVar.f48103a;
            this.f48097c = aVar.f48104b;
            this.f48098d = aVar.f48105c;
            this.f48099e = aVar.f48106d;
            this.f48100f = aVar.f48107e;
            this.f48101g = aVar.f48108f;
            this.f48102h = aVar.f48109g;
        }
    }
}
