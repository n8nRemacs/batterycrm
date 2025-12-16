package androidx.media3.session;

import androidx.media3.common.C23089c;
import androidx.media3.common.P;
import com.facebook.imageutils.JfifUtil;
import com.google.common.collect.AbstractC37401r1;
import java.util.Arrays;
import java.util.List;

/* compiled from: QueueTimeline.java */
/* loaded from: classes.dex */
final class H1 extends androidx.media3.common.P {

    /* renamed from: i, reason: collision with root package name */
    public static final H1 f52061i = new H1(AbstractC37401r1.C(), null);

    /* renamed from: j, reason: collision with root package name */
    public static final Object f52062j = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC37401r1<a> f52063g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public final a f52064h;

    /* compiled from: QueueTimeline.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.z f52065a;

        /* renamed from: b, reason: collision with root package name */
        public final long f52066b;

        /* renamed from: c, reason: collision with root package name */
        public final long f52067c;

        public a(androidx.media3.common.z zVar, long j12, long j13) {
            this.f52065a = zVar;
            this.f52066b = j12;
            this.f52067c = j13;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f52066b == aVar.f52066b && this.f52065a.equals(aVar.f52065a) && this.f52067c == aVar.f52067c;
        }

        public final int hashCode() {
            long j12 = this.f52066b;
            int iHashCode = (this.f52065a.hashCode() + ((JfifUtil.MARKER_EOI + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31;
            long j13 = this.f52067c;
            return iHashCode + ((int) ((j13 >>> 32) ^ j13));
        }
    }

    public H1(AbstractC37401r1<a> abstractC37401r1, @j.P a aVar) {
        this.f52063g = abstractC37401r1;
        this.f52064h = aVar;
    }

    public final a A(int i12) {
        a aVar;
        AbstractC37401r1<a> abstractC37401r1 = this.f52063g;
        return (i12 != abstractC37401r1.size() || (aVar = this.f52064h) == null) ? abstractC37401r1.get(i12) : aVar;
    }

    @Override // androidx.media3.common.P
    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H1)) {
            return false;
        }
        H1 h12 = (H1) obj;
        return com.google.common.base.F.a(this.f52063g, h12.f52063g) && com.google.common.base.F.a(this.f52064h, h12.f52064h);
    }

    @Override // androidx.media3.common.P
    public final int g(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.common.P
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52063g, this.f52064h});
    }

    @Override // androidx.media3.common.P
    public final P.b n(int i12, P.b bVar, boolean z12) {
        a aVarA = A(i12);
        Long lValueOf = Long.valueOf(aVarA.f52066b);
        long jF2 = androidx.media3.common.util.M.F(aVarA.f52067c);
        bVar.getClass();
        bVar.p(lValueOf, null, i12, jF2, 0L, C23089c.f47615g, false);
        return bVar;
    }

    @Override // androidx.media3.common.P
    public final int p() {
        return w();
    }

    @Override // androidx.media3.common.P
    public final Object t(int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.common.P
    public final P.d u(int i12, P.d dVar, long j12) {
        a aVarA = A(i12);
        dVar.b(f52062j, aVarA.f52065a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, androidx.media3.common.util.M.F(aVarA.f52067c), i12, i12, 0L);
        return dVar;
    }

    @Override // androidx.media3.common.P
    public final int w() {
        return this.f52063g.size() + (this.f52064h == null ? 0 : 1);
    }

    public final H1 y(int i12, List<androidx.media3.common.z> list) {
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        AbstractC37401r1<a> abstractC37401r1 = this.f52063g;
        aVar.e(abstractC37401r1.subList(0, i12));
        for (int i13 = 0; i13 < list.size(); i13++) {
            aVar.g(new a(list.get(i13), -1L, -9223372036854775807L));
        }
        aVar.e(abstractC37401r1.subList(i12, abstractC37401r1.size()));
        return new H1(aVar.i(), this.f52064h);
    }

    public final long z(int i12) {
        if (i12 >= 0) {
            AbstractC37401r1<a> abstractC37401r1 = this.f52063g;
            if (i12 < abstractC37401r1.size()) {
                return abstractC37401r1.get(i12).f52066b;
            }
        }
        return -1L;
    }
}
