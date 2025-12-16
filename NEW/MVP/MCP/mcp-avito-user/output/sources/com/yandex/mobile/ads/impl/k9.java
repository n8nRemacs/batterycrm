package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.impl.jd0;
import java.util.Arrays;

/* loaded from: classes8.dex */
public interface k9 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f387075a;

        /* renamed from: b, reason: collision with root package name */
        public final i91 f387076b;

        /* renamed from: c, reason: collision with root package name */
        public final int f387077c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final jd0.b f387078d;

        /* renamed from: e, reason: collision with root package name */
        public final long f387079e;

        /* renamed from: f, reason: collision with root package name */
        public final i91 f387080f;

        /* renamed from: g, reason: collision with root package name */
        public final int f387081g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public final jd0.b f387082h;

        /* renamed from: i, reason: collision with root package name */
        public final long f387083i;

        /* renamed from: j, reason: collision with root package name */
        public final long f387084j;

        public a(long j12, i91 i91Var, int i12, @j.P jd0.b bVar, long j13, i91 i91Var2, int i13, @j.P jd0.b bVar2, long j14, long j15) {
            this.f387075a = j12;
            this.f387076b = i91Var;
            this.f387077c = i12;
            this.f387078d = bVar;
            this.f387079e = j13;
            this.f387080f = i91Var2;
            this.f387081g = i13;
            this.f387082h = bVar2;
            this.f387083i = j14;
            this.f387084j = j15;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f387075a == aVar.f387075a && this.f387077c == aVar.f387077c && this.f387079e == aVar.f387079e && this.f387081g == aVar.f387081g && this.f387083i == aVar.f387083i && this.f387084j == aVar.f387084j && vp0.a(this.f387076b, aVar.f387076b) && vp0.a(this.f387078d, aVar.f387078d) && vp0.a(this.f387080f, aVar.f387080f) && vp0.a(this.f387082h, aVar.f387082h);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f387075a), this.f387076b, Integer.valueOf(this.f387077c), this.f387078d, Long.valueOf(this.f387079e), this.f387080f, Integer.valueOf(this.f387081g), this.f387082h, Long.valueOf(this.f387083i), Long.valueOf(this.f387084j)});
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final nw f387085a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f387086b;

        public b(nw nwVar, SparseArray<a> sparseArray) {
            this.f387085a = nwVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(nwVar.a());
            for (int i12 = 0; i12 < nwVar.a(); i12++) {
                int iB2 = nwVar.b(i12);
                sparseArray2.append(iB2, (a) db.a(sparseArray.get(iB2)));
            }
            this.f387086b = sparseArray2;
        }

        public final boolean a(int i12) {
            return this.f387085a.a(i12);
        }

        public final int b(int i12) {
            return this.f387085a.b(i12);
        }

        public final a c(int i12) {
            a aVar = this.f387086b.get(i12);
            aVar.getClass();
            return aVar;
        }

        public final int a() {
            return this.f387085a.a();
        }
    }
}
