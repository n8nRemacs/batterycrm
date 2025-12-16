package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.InterfaceC36525h;
import com.google.android.exoplayer2.util.C36605v;
import com.google.common.collect.AbstractC37401r1;

/* compiled from: TrackGroupArray.java */
/* loaded from: classes6.dex */
public final class W implements InterfaceC36525h {

    /* renamed from: e, reason: collision with root package name */
    public static final W f346153e = new W(new V[0]);

    /* renamed from: f, reason: collision with root package name */
    public static final K f346154f = new K(3);

    /* renamed from: b, reason: collision with root package name */
    public final int f346155b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC37401r1<V> f346156c;

    /* renamed from: d, reason: collision with root package name */
    public int f346157d;

    public W(V... vArr) {
        this.f346156c = AbstractC37401r1.w(vArr);
        this.f346155b = vArr.length;
        int i12 = 0;
        while (true) {
            AbstractC37401r1<V> abstractC37401r1 = this.f346156c;
            if (i12 >= abstractC37401r1.size()) {
                return;
            }
            int i13 = i12 + 1;
            for (int i14 = i13; i14 < abstractC37401r1.size(); i14++) {
                if (abstractC37401r1.get(i12).equals(abstractC37401r1.get(i14))) {
                    C36605v.a("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i12 = i13;
        }
    }

    public final V a(int i12) {
        return this.f346156c.get(i12);
    }

    public final int b(V v12) {
        int iIndexOf = this.f346156c.indexOf(v12);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w12 = (W) obj;
        return this.f346155b == w12.f346155b && this.f346156c.equals(w12.f346156c);
    }

    public final int hashCode() {
        if (this.f346157d == 0) {
            this.f346157d = this.f346156c.hashCode();
        }
        return this.f346157d;
    }
}
