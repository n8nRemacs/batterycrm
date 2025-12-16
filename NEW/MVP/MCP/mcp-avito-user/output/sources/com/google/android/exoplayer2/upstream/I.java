package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.I;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: SlidingPercentile.java */
/* loaded from: classes6.dex */
public class I {

    /* renamed from: h, reason: collision with root package name */
    public static final H f347739h;

    /* renamed from: i, reason: collision with root package name */
    public static final H f347740i;

    /* renamed from: a, reason: collision with root package name */
    public final int f347741a;

    /* renamed from: e, reason: collision with root package name */
    public int f347745e;

    /* renamed from: f, reason: collision with root package name */
    public int f347746f;

    /* renamed from: g, reason: collision with root package name */
    public int f347747g;

    /* renamed from: c, reason: collision with root package name */
    public final b[] f347743c = new b[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f347742b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public int f347744d = -1;

    /* compiled from: SlidingPercentile.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f347748a;

        /* renamed from: b, reason: collision with root package name */
        public int f347749b;

        /* renamed from: c, reason: collision with root package name */
        public float f347750c;

        public b() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.upstream.H] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.exoplayer2.upstream.H] */
    static {
        final int i12 = 0;
        f347739h = new Comparator() { // from class: com.google.android.exoplayer2.upstream.H
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                I.b bVar = (I.b) obj;
                I.b bVar2 = (I.b) obj2;
                switch (i12) {
                    case 0:
                        return bVar.f347748a - bVar2.f347748a;
                    default:
                        return Float.compare(bVar.f347750c, bVar2.f347750c);
                }
            }
        };
        final int i13 = 1;
        f347740i = new Comparator() { // from class: com.google.android.exoplayer2.upstream.H
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                I.b bVar = (I.b) obj;
                I.b bVar2 = (I.b) obj2;
                switch (i13) {
                    case 0:
                        return bVar.f347748a - bVar2.f347748a;
                    default:
                        return Float.compare(bVar.f347750c, bVar2.f347750c);
                }
            }
        };
    }

    public I(int i12) {
        this.f347741a = i12;
    }

    public final void a(float f12, int i12) {
        b bVar;
        int i13 = this.f347744d;
        ArrayList<b> arrayList = this.f347742b;
        if (i13 != 1) {
            Collections.sort(arrayList, f347739h);
            this.f347744d = 1;
        }
        int i14 = this.f347747g;
        b[] bVarArr = this.f347743c;
        if (i14 > 0) {
            int i15 = i14 - 1;
            this.f347747g = i15;
            bVar = bVarArr[i15];
        } else {
            bVar = new b();
        }
        int i16 = this.f347745e;
        this.f347745e = i16 + 1;
        bVar.f347748a = i16;
        bVar.f347749b = i12;
        bVar.f347750c = f12;
        arrayList.add(bVar);
        this.f347746f += i12;
        while (true) {
            int i17 = this.f347746f;
            int i18 = this.f347741a;
            if (i17 <= i18) {
                return;
            }
            int i19 = i17 - i18;
            b bVar2 = arrayList.get(0);
            int i22 = bVar2.f347749b;
            if (i22 <= i19) {
                this.f347746f -= i22;
                arrayList.remove(0);
                int i23 = this.f347747g;
                if (i23 < 5) {
                    this.f347747g = i23 + 1;
                    bVarArr[i23] = bVar2;
                }
            } else {
                bVar2.f347749b = i22 - i19;
                this.f347746f -= i19;
            }
        }
    }

    public final float b() {
        int i12 = this.f347744d;
        ArrayList<b> arrayList = this.f347742b;
        if (i12 != 0) {
            Collections.sort(arrayList, f347740i);
            this.f347744d = 0;
        }
        float f12 = 0.5f * this.f347746f;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            b bVar = arrayList.get(i14);
            i13 += bVar.f347749b;
            if (i13 >= f12) {
                return bVar.f347750c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((b) androidx.appcompat.app.r.j(1, arrayList)).f347750c;
    }
}
