package androidx.palette.graphics;

import android.graphics.Color;
import androidx.core.graphics.C22767g;
import androidx.palette.graphics.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* compiled from: ColorCutQuantizer.java */
/* loaded from: classes.dex */
final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final Comparator<b> f53247f = new C1876a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f53248a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f53249b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f53250c;

    /* renamed from: d, reason: collision with root package name */
    public final b.c[] f53251d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f53252e = new float[3];

    /* compiled from: ColorCutQuantizer.java */
    /* renamed from: androidx.palette.graphics.a$a, reason: collision with other inner class name */
    public static class C1876a implements Comparator<b> {
        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            return bVar2.b() - bVar.b();
        }
    }

    /* compiled from: ColorCutQuantizer.java */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f53253a;

        /* renamed from: b, reason: collision with root package name */
        public int f53254b;

        /* renamed from: c, reason: collision with root package name */
        public int f53255c;

        /* renamed from: d, reason: collision with root package name */
        public int f53256d;

        /* renamed from: e, reason: collision with root package name */
        public int f53257e;

        /* renamed from: f, reason: collision with root package name */
        public int f53258f;

        /* renamed from: g, reason: collision with root package name */
        public int f53259g;

        /* renamed from: h, reason: collision with root package name */
        public int f53260h;

        /* renamed from: i, reason: collision with root package name */
        public int f53261i;

        public b(int i12, int i13) {
            this.f53253a = i12;
            this.f53254b = i13;
            a();
        }

        public final void a() {
            a aVar = a.this;
            int[] iArr = aVar.f53248a;
            int[] iArr2 = aVar.f53249b;
            int i12 = Integer.MAX_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE;
            int i16 = 0;
            int i17 = Integer.MAX_VALUE;
            int i18 = Integer.MAX_VALUE;
            for (int i19 = this.f53253a; i19 <= this.f53254b; i19++) {
                int i22 = iArr[i19];
                i16 += iArr2[i22];
                int i23 = (i22 >> 10) & 31;
                int i24 = (i22 >> 5) & 31;
                int i25 = i22 & 31;
                if (i23 > i13) {
                    i13 = i23;
                }
                if (i23 < i12) {
                    i12 = i23;
                }
                if (i24 > i14) {
                    i14 = i24;
                }
                if (i24 < i17) {
                    i17 = i24;
                }
                if (i25 > i15) {
                    i15 = i25;
                }
                if (i25 < i18) {
                    i18 = i25;
                }
            }
            this.f53256d = i12;
            this.f53257e = i13;
            this.f53258f = i17;
            this.f53259g = i14;
            this.f53260h = i18;
            this.f53261i = i15;
            this.f53255c = i16;
        }

        public final int b() {
            return ((this.f53261i - this.f53260h) + 1) * ((this.f53259g - this.f53258f) + 1) * ((this.f53257e - this.f53256d) + 1);
        }
    }

    public a(int[] iArr, int i12, b.c[] cVarArr) {
        b bVar;
        this.f53251d = cVarArr;
        int[] iArr2 = new int[32768];
        this.f53249b = iArr2;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            int iB2 = b(Color.blue(i15), 8, 5) | (b(Color.red(i15), 8, 5) << 10) | (b(Color.green(i15), 8, 5) << 5);
            iArr[i14] = iB2;
            iArr2[iB2] = iArr2[iB2] + 1;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < 32768; i17++) {
            if (iArr2[i17] > 0) {
                int iRgb = Color.rgb(b((i17 >> 10) & 31, 5, 8), b((i17 >> 5) & 31, 5, 8), b(i17 & 31, 5, 8));
                float[] fArr = this.f53252e;
                ThreadLocal<double[]> threadLocal = C22767g.f44773a;
                C22767g.a(Color.red(iRgb), Color.green(iRgb), Color.blue(iRgb), fArr);
                b.c[] cVarArr2 = this.f53251d;
                if (cVarArr2 != null && cVarArr2.length > 0) {
                    int length = cVarArr2.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length) {
                            break;
                        }
                        if (!cVarArr2[i18].a(fArr)) {
                            iArr2[i17] = 0;
                            break;
                        }
                        i18++;
                    }
                }
            }
            if (iArr2[i17] > 0) {
                i16++;
            }
        }
        int[] iArr3 = new int[i16];
        this.f53248a = iArr3;
        int i19 = 0;
        for (int i22 = 0; i22 < 32768; i22++) {
            if (iArr2[i22] > 0) {
                iArr3[i19] = i22;
                i19++;
            }
        }
        if (i16 <= i12) {
            this.f53250c = new ArrayList();
            while (i13 < i16) {
                int i23 = iArr3[i13];
                this.f53250c.add(new b.e(Color.rgb(b((i23 >> 10) & 31, 5, 8), b((i23 >> 5) & 31, 5, 8), b(i23 & 31, 5, 8)), iArr2[i23]));
                i13++;
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i12, f53247f);
        priorityQueue.offer(new b(0, this.f53248a.length - 1));
        while (priorityQueue.size() < i12 && (bVar = (b) priorityQueue.poll()) != null) {
            int i24 = bVar.f53254b;
            int iMin = bVar.f53253a;
            if ((i24 + 1) - iMin <= 1) {
                break;
            }
            if ((i24 + 1) - iMin <= 1) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i25 = bVar.f53257e - bVar.f53256d;
            int i26 = bVar.f53259g - bVar.f53258f;
            int i27 = bVar.f53261i - bVar.f53260h;
            int i28 = (i25 < i26 || i25 < i27) ? (i26 < i25 || i26 < i27) ? -1 : -2 : -3;
            a aVar = a.this;
            int[] iArr4 = aVar.f53248a;
            a(iArr4, i28, iMin, i24);
            Arrays.sort(iArr4, iMin, bVar.f53254b + 1);
            a(iArr4, i28, iMin, bVar.f53254b);
            int i29 = bVar.f53255c / 2;
            int i32 = i13;
            int i33 = iMin;
            while (true) {
                int i34 = bVar.f53254b;
                if (i33 <= i34) {
                    i32 += aVar.f53249b[iArr4[i33]];
                    if (i32 >= i29) {
                        iMin = Math.min(i34 - 1, i33);
                        break;
                    }
                    i33++;
                }
            }
            b bVar2 = aVar.new b(iMin + 1, bVar.f53254b);
            bVar.f53254b = iMin;
            bVar.a();
            priorityQueue.offer(bVar2);
            priorityQueue.offer(bVar);
            i13 = 0;
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            b bVar3 = (b) it.next();
            a aVar2 = a.this;
            int[] iArr5 = aVar2.f53248a;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            int i38 = 0;
            for (int i39 = bVar3.f53253a; i39 <= bVar3.f53254b; i39++) {
                int i42 = iArr5[i39];
                int i43 = aVar2.f53249b[i42];
                i36 += i43;
                i35 = (((i42 >> 10) & 31) * i43) + i35;
                i37 = (((i42 >> 5) & 31) * i43) + i37;
                i38 += i43 * (i42 & 31);
            }
            float f12 = i36;
            b.e eVar = new b.e(Color.rgb(b(Math.round(i35 / f12), 5, 8), b(Math.round(i37 / f12), 5, 8), b(Math.round(i38 / f12), 5, 8)), i36);
            float[] fArrB = eVar.b();
            b.c[] cVarArr3 = this.f53251d;
            if (cVarArr3 != null && cVarArr3.length > 0) {
                for (b.c cVar : cVarArr3) {
                    if (!cVar.a(fArrB)) {
                        break;
                    }
                }
            }
            arrayList.add(eVar);
        }
        this.f53250c = arrayList;
    }

    public static void a(int[] iArr, int i12, int i13, int i14) {
        if (i12 == -2) {
            while (i13 <= i14) {
                int i15 = iArr[i13];
                iArr[i13] = (i15 & 31) | (((i15 >> 5) & 31) << 10) | (((i15 >> 10) & 31) << 5);
                i13++;
            }
            return;
        }
        if (i12 != -1) {
            return;
        }
        while (i13 <= i14) {
            int i16 = iArr[i13];
            iArr[i13] = ((i16 >> 10) & 31) | ((i16 & 31) << 10) | (((i16 >> 5) & 31) << 5);
            i13++;
        }
    }

    public static int b(int i12, int i13, int i14) {
        return (i14 > i13 ? i12 << (i14 - i13) : i12 >> (i13 - i14)) & ((1 << i14) - 1);
    }
}
