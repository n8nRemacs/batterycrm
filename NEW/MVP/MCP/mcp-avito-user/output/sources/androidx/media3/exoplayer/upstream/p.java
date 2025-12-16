package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.J;
import androidx.media3.exoplayer.upstream.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: SlidingPercentile.java */
@J
/* loaded from: classes.dex */
public class p {

    /* renamed from: h, reason: collision with root package name */
    public static final o f50156h;

    /* renamed from: i, reason: collision with root package name */
    public static final o f50157i;

    /* renamed from: a, reason: collision with root package name */
    public final int f50158a;

    /* renamed from: e, reason: collision with root package name */
    public int f50162e;

    /* renamed from: f, reason: collision with root package name */
    public int f50163f;

    /* renamed from: g, reason: collision with root package name */
    public int f50164g;

    /* renamed from: c, reason: collision with root package name */
    public final b[] f50160c = new b[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f50159b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public int f50161d = -1;

    /* compiled from: SlidingPercentile.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f50165a;

        /* renamed from: b, reason: collision with root package name */
        public int f50166b;

        /* renamed from: c, reason: collision with root package name */
        public float f50167c;

        public b() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.upstream.o] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.upstream.o] */
    static {
        final int i12 = 0;
        f50156h = new Comparator() { // from class: androidx.media3.exoplayer.upstream.o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                p.b bVar = (p.b) obj;
                p.b bVar2 = (p.b) obj2;
                switch (i12) {
                    case 0:
                        return bVar.f50165a - bVar2.f50165a;
                    default:
                        return Float.compare(bVar.f50167c, bVar2.f50167c);
                }
            }
        };
        final int i13 = 1;
        f50157i = new Comparator() { // from class: androidx.media3.exoplayer.upstream.o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                p.b bVar = (p.b) obj;
                p.b bVar2 = (p.b) obj2;
                switch (i13) {
                    case 0:
                        return bVar.f50165a - bVar2.f50165a;
                    default:
                        return Float.compare(bVar.f50167c, bVar2.f50167c);
                }
            }
        };
    }

    public p(int i12) {
        this.f50158a = i12;
    }

    public final void a(float f12, int i12) {
        b bVar;
        int i13 = this.f50161d;
        ArrayList<b> arrayList = this.f50159b;
        if (i13 != 1) {
            Collections.sort(arrayList, f50156h);
            this.f50161d = 1;
        }
        int i14 = this.f50164g;
        b[] bVarArr = this.f50160c;
        if (i14 > 0) {
            int i15 = i14 - 1;
            this.f50164g = i15;
            bVar = bVarArr[i15];
        } else {
            bVar = new b();
        }
        int i16 = this.f50162e;
        this.f50162e = i16 + 1;
        bVar.f50165a = i16;
        bVar.f50166b = i12;
        bVar.f50167c = f12;
        arrayList.add(bVar);
        this.f50163f += i12;
        while (true) {
            int i17 = this.f50163f;
            int i18 = this.f50158a;
            if (i17 <= i18) {
                return;
            }
            int i19 = i17 - i18;
            b bVar2 = arrayList.get(0);
            int i22 = bVar2.f50166b;
            if (i22 <= i19) {
                this.f50163f -= i22;
                arrayList.remove(0);
                int i23 = this.f50164g;
                if (i23 < 5) {
                    this.f50164g = i23 + 1;
                    bVarArr[i23] = bVar2;
                }
            } else {
                bVar2.f50166b = i22 - i19;
                this.f50163f -= i19;
            }
        }
    }

    public final float b() {
        int i12 = this.f50161d;
        ArrayList<b> arrayList = this.f50159b;
        if (i12 != 0) {
            Collections.sort(arrayList, f50157i);
            this.f50161d = 0;
        }
        float f12 = 0.5f * this.f50163f;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            b bVar = arrayList.get(i14);
            i13 += bVar.f50166b;
            if (i13 >= f12) {
                return bVar.f50167c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((b) androidx.appcompat.app.r.j(1, arrayList)).f50167c;
    }
}
