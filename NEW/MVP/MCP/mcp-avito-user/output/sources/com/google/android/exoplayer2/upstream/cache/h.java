package com.google.android.exoplayer2.upstream.cache;

import androidx.compose.foundation.H;
import com.google.android.exoplayer2.util.C36585a;
import j.P;
import java.util.ArrayList;
import java.util.TreeSet;

/* compiled from: CachedContent.java */
/* loaded from: classes6.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f347858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f347859b;

    /* renamed from: c, reason: collision with root package name */
    public final TreeSet<r> f347860c = new TreeSet<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<a> f347861d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public l f347862e;

    /* compiled from: CachedContent.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f347863a;

        /* renamed from: b, reason: collision with root package name */
        public final long f347864b;

        public a(long j12, long j13) {
            this.f347863a = j12;
            this.f347864b = j13;
        }
    }

    public h(int i12, String str, l lVar) {
        this.f347858a = i12;
        this.f347859b = str;
        this.f347862e = lVar;
    }

    public final long a(long j12, long j13) {
        C36585a.b(j12 >= 0);
        C36585a.b(j13 >= 0);
        r rVarB = b(j12, j13);
        boolean z12 = rVarB.f347845e;
        long j14 = rVarB.f347844d;
        if (!z12) {
            return -Math.min(j14 != -1 ? j14 : Long.MAX_VALUE, j13);
        }
        long j15 = j12 + j13;
        long j16 = j15 >= 0 ? j15 : Long.MAX_VALUE;
        long jMax = rVarB.f347843c + j14;
        if (jMax < j16) {
            for (r rVar : this.f347860c.tailSet(rVarB, false)) {
                long j17 = rVar.f347843c;
                if (j17 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j17 + rVar.f347844d);
                if (jMax >= j16) {
                    break;
                }
            }
        }
        return Math.min(jMax - j12, j13);
    }

    public final r b(long j12, long j13) {
        r rVar = new r(this.f347859b, j12, -1L, -9223372036854775807L, null);
        TreeSet<r> treeSet = this.f347860c;
        r rVarFloor = treeSet.floor(rVar);
        if (rVarFloor != null && rVarFloor.f347843c + rVarFloor.f347844d > j12) {
            return rVarFloor;
        }
        r rVarCeiling = treeSet.ceiling(rVar);
        if (rVarCeiling != null) {
            long j14 = rVarCeiling.f347843c - j12;
            j13 = j13 == -1 ? j14 : Math.min(j14, j13);
        }
        return new r(this.f347859b, j12, j13, -9223372036854775807L, null);
    }

    public final boolean c(long j12, long j13) {
        int i12 = 0;
        while (true) {
            ArrayList<a> arrayList = this.f347861d;
            if (i12 >= arrayList.size()) {
                return false;
            }
            a aVar = arrayList.get(i12);
            long j14 = aVar.f347864b;
            long j15 = aVar.f347863a;
            if (j14 == -1) {
                if (j12 >= j15) {
                    return true;
                }
            } else if (j13 != -1 && j15 <= j12 && j12 + j13 <= j15 + j14) {
                return true;
            }
            i12++;
        }
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f347858a == hVar.f347858a && this.f347859b.equals(hVar.f347859b) && this.f347860c.equals(hVar.f347860c) && this.f347862e.equals(hVar.f347862e);
    }

    public final int hashCode() {
        return this.f347862e.hashCode() + H.d(this.f347858a * 31, 31, this.f347859b);
    }
}
