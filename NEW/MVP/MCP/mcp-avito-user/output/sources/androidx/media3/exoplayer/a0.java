package androidx.media3.exoplayer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PlaylistTimeline.java */
/* loaded from: classes.dex */
final class a0 extends AbstractC23132a {

    /* renamed from: j, reason: collision with root package name */
    public final int f48625j;

    /* renamed from: k, reason: collision with root package name */
    public final int f48626k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f48627l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f48628m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.media3.common.P[] f48629n;

    /* renamed from: o, reason: collision with root package name */
    public final Object[] f48630o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap<Object, Integer> f48631p;

    public a0(androidx.media3.common.P[] pArr, Object[] objArr, androidx.media3.exoplayer.source.S s5) {
        super(s5);
        int length = pArr.length;
        this.f48629n = pArr;
        this.f48627l = new int[length];
        this.f48628m = new int[length];
        this.f48630o = objArr;
        this.f48631p = new HashMap<>();
        int length2 = pArr.length;
        int i12 = 0;
        int iW2 = 0;
        int iP2 = 0;
        int i13 = 0;
        while (i12 < length2) {
            androidx.media3.common.P p12 = pArr[i12];
            this.f48629n[i13] = p12;
            this.f48628m[i13] = iW2;
            this.f48627l[i13] = iP2;
            iW2 += p12.w();
            iP2 += this.f48629n[i13].p();
            this.f48631p.put(objArr[i13], Integer.valueOf(i13));
            i12++;
            i13++;
        }
        this.f48625j = iW2;
        this.f48626k = iP2;
    }

    @Override // androidx.media3.exoplayer.AbstractC23132a
    public final int A(int i12) {
        return androidx.media3.common.util.M.e(this.f48628m, i12 + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.AbstractC23132a
    public final Object B(int i12) {
        return this.f48630o[i12];
    }

    @Override // androidx.media3.exoplayer.AbstractC23132a
    public final int C(int i12) {
        return this.f48627l[i12];
    }

    @Override // androidx.media3.exoplayer.AbstractC23132a
    public final int D(int i12) {
        return this.f48628m[i12];
    }

    @Override // androidx.media3.exoplayer.AbstractC23132a
    public final androidx.media3.common.P G(int i12) {
        return this.f48629n[i12];
    }

    @Override // androidx.media3.common.P
    public final int p() {
        return this.f48626k;
    }

    @Override // androidx.media3.common.P
    public final int w() {
        return this.f48625j;
    }

    @Override // androidx.media3.exoplayer.AbstractC23132a
    public final int y(Object obj) {
        Integer num = this.f48631p.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // androidx.media3.exoplayer.AbstractC23132a
    public final int z(int i12) {
        return androidx.media3.common.util.M.e(this.f48627l, i12 + 1, false, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(Collection<? extends N> collection, androidx.media3.exoplayer.source.S s5) {
        androidx.media3.common.P[] pArr = new androidx.media3.common.P[collection.size()];
        Iterator<? extends N> it = collection.iterator();
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            pArr[i13] = it.next().d();
            i13++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends N> it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i12] = it2.next().c();
            i12++;
        }
        this(pArr, objArr, s5);
    }
}
