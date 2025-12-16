package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Q;
import androidx.media3.common.util.D;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.trackselection.k;
import com.google.common.collect.AbstractC37401r1;
import j.InterfaceC42153i;
import j.P;
import java.util.ArrayList;

/* compiled from: AdaptiveTrackSelection.java */
@J
/* loaded from: classes.dex */
public class a extends androidx.media3.exoplayer.trackselection.b {

    /* renamed from: f, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.d f49887f;

    /* compiled from: AdaptiveTrackSelection.java */
    /* renamed from: androidx.media3.exoplayer.trackselection.a$a, reason: collision with other inner class name */
    public static final class C1837a {

        /* renamed from: a, reason: collision with root package name */
        public final long f49888a;

        /* renamed from: b, reason: collision with root package name */
        public final long f49889b;

        public C1837a(long j12, long j13) {
            this.f49888a = j12;
            this.f49889b = j13;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1837a)) {
                return false;
            }
            C1837a c1837a = (C1837a) obj;
            return this.f49888a == c1837a.f49888a && this.f49889b == c1837a.f49889b;
        }

        public final int hashCode() {
            return (((int) this.f49888a) * 31) + ((int) this.f49889b);
        }
    }

    /* compiled from: AdaptiveTrackSelection.java */
    public static class b implements k.b {

        /* renamed from: a, reason: collision with root package name */
        public final int f49890a;

        /* renamed from: b, reason: collision with root package name */
        public final int f49891b;

        /* renamed from: c, reason: collision with root package name */
        public final D f49892c;

        public b() {
            D d12 = InterfaceC23115f.f47901a;
            this.f49890a = 10000;
            this.f49891b = 25000;
            this.f49892c = d12;
        }
    }

    public a(Q q12, int[] iArr, androidx.media3.exoplayer.upstream.d dVar, long j12, long j13, AbstractC37401r1 abstractC37401r1, D d12) {
        super(q12, iArr);
        if (j13 < j12) {
            androidx.media3.common.util.s.g();
        }
        this.f49887f = dVar;
        AbstractC37401r1.v(abstractC37401r1);
    }

    public static void l(ArrayList arrayList, long[] jArr) {
        long j12 = 0;
        for (long j13 : jArr) {
            j12 += j13;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            AbstractC37401r1.a aVar = (AbstractC37401r1.a) arrayList.get(i12);
            if (aVar != null) {
                aVar.g(new C1837a(j12, jArr[i12]));
            }
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.k
    public final int a() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.trackselection.b, androidx.media3.exoplayer.trackselection.k
    @InterfaceC42153i
    public final void N() {
    }

    @Override // androidx.media3.exoplayer.trackselection.b, androidx.media3.exoplayer.trackselection.k
    @InterfaceC42153i
    public final void j() {
    }

    @Override // androidx.media3.exoplayer.trackselection.b, androidx.media3.exoplayer.trackselection.k
    public final void e(float f12) {
    }
}
