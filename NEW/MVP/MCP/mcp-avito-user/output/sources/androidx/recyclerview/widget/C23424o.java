package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: DiffUtil.java */
/* renamed from: androidx.recyclerview.widget.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23424o {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator<d> f54066a = new a();

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.o$a */
    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        public final int compare(d dVar, d dVar2) {
            return dVar.f54069a - dVar2.f54069a;
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.o$b */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i12, int i13);

        public abstract boolean areItemsTheSame(int i12, int i13);

        @j.P
        public Object getChangePayload(int i12, int i13) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.o$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f54067a;

        /* renamed from: b, reason: collision with root package name */
        public final int f54068b;

        public c(int i12) {
            int[] iArr = new int[i12];
            this.f54067a = iArr;
            this.f54068b = iArr.length / 2;
        }

        public final int a(int i12) {
            return this.f54067a[i12 + this.f54068b];
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.o$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f54069a;

        /* renamed from: b, reason: collision with root package name */
        public final int f54070b;

        /* renamed from: c, reason: collision with root package name */
        public final int f54071c;

        public d(int i12, int i13, int i14) {
            this.f54069a = i12;
            this.f54070b = i13;
            this.f54071c = i14;
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.o$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f54072a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f54073b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f54074c;

        /* renamed from: d, reason: collision with root package name */
        public final b f54075d;

        /* renamed from: e, reason: collision with root package name */
        public final int f54076e;

        /* renamed from: f, reason: collision with root package name */
        public final int f54077f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f54078g;

        public e(b bVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z12) {
            int[] iArr3;
            int[] iArr4;
            b bVar2;
            int i12;
            d dVar;
            int i13;
            this.f54072a = arrayList;
            this.f54073b = iArr;
            this.f54074c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f54075d = bVar;
            int oldListSize = bVar.getOldListSize();
            this.f54076e = oldListSize;
            int newListSize = bVar.getNewListSize();
            this.f54077f = newListSize;
            this.f54078g = z12;
            d dVar2 = arrayList.isEmpty() ? null : (d) arrayList.get(0);
            if (dVar2 == null || dVar2.f54069a != 0 || dVar2.f54070b != 0) {
                arrayList.add(0, new d(0, 0, 0));
            }
            arrayList.add(new d(oldListSize, newListSize, 0));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                iArr3 = this.f54074c;
                iArr4 = this.f54073b;
                bVar2 = this.f54075d;
                if (!zHasNext) {
                    break;
                }
                d dVar3 = (d) it.next();
                for (int i14 = 0; i14 < dVar3.f54071c; i14++) {
                    int i15 = dVar3.f54069a + i14;
                    int i16 = dVar3.f54070b + i14;
                    int i17 = bVar2.areContentsTheSame(i15, i16) ? 1 : 2;
                    iArr4[i15] = (i16 << 4) | i17;
                    iArr3[i16] = (i15 << 4) | i17;
                }
            }
            if (this.f54078g) {
                Iterator it2 = arrayList.iterator();
                int i18 = 0;
                while (it2.hasNext()) {
                    d dVar4 = (d) it2.next();
                    while (true) {
                        i12 = dVar4.f54069a;
                        if (i18 < i12) {
                            if (iArr4[i18] == 0) {
                                int size = arrayList.size();
                                int i19 = 0;
                                int i22 = 0;
                                while (true) {
                                    if (i19 < size) {
                                        dVar = (d) arrayList.get(i19);
                                        while (true) {
                                            i13 = dVar.f54070b;
                                            if (i22 < i13) {
                                                if (iArr3[i22] == 0 && bVar2.areItemsTheSame(i18, i22)) {
                                                    int i23 = bVar2.areContentsTheSame(i18, i22) ? 8 : 4;
                                                    iArr4[i18] = (i22 << 4) | i23;
                                                    iArr3[i22] = i23 | (i18 << 4);
                                                } else {
                                                    i22++;
                                                }
                                            }
                                        }
                                    }
                                    i22 = dVar.f54071c + i13;
                                    i19++;
                                }
                            }
                            i18++;
                        }
                    }
                    i18 = dVar4.f54071c + i12;
                }
            }
        }

        @j.P
        public static g c(ArrayDeque arrayDeque, int i12, boolean z12) {
            g gVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = (g) it.next();
                if (gVar.f54079a == i12 && gVar.f54081c == z12) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                if (z12) {
                    gVar2.f54080b--;
                } else {
                    gVar2.f54080b++;
                }
            }
            return gVar;
        }

        public final void a(@j.N C c12) {
            int[] iArr;
            b bVar;
            int i12;
            int i13;
            ArrayList arrayList;
            int i14;
            e eVar = this;
            C23415f c23415f = c12 instanceof C23415f ? (C23415f) c12 : new C23415f(c12);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayList arrayList2 = eVar.f54072a;
            int size = arrayList2.size() - 1;
            int i15 = eVar.f54076e;
            int i16 = eVar.f54077f;
            int i17 = i15;
            while (size >= 0) {
                d dVar = (d) arrayList2.get(size);
                int i18 = dVar.f54069a;
                int i19 = dVar.f54071c;
                int i22 = i18 + i19;
                int i23 = dVar.f54070b;
                int i24 = i23 + i19;
                while (true) {
                    iArr = eVar.f54073b;
                    bVar = eVar.f54075d;
                    i12 = 0;
                    if (i17 <= i22) {
                        break;
                    }
                    i17--;
                    int i25 = iArr[i17];
                    if ((i25 & 12) != 0) {
                        arrayList = arrayList2;
                        int i26 = i25 >> 4;
                        g gVarC = c(arrayDeque, i26, false);
                        if (gVarC != null) {
                            i14 = i16;
                            int i27 = (i15 - gVarC.f54080b) - 1;
                            c23415f.d(i17, i27);
                            if ((i25 & 4) != 0) {
                                c23415f.i(i27, 1, bVar.getChangePayload(i17, i26));
                            }
                        } else {
                            i14 = i16;
                            arrayDeque.add(new g(i17, (i15 - i17) - 1, true));
                        }
                    } else {
                        arrayList = arrayList2;
                        i14 = i16;
                        c23415f.b(i17, 1);
                        i15--;
                    }
                    arrayList2 = arrayList;
                    i16 = i14;
                }
                ArrayList arrayList3 = arrayList2;
                while (i16 > i24) {
                    i16--;
                    int i28 = eVar.f54074c[i16];
                    if ((i28 & 12) != 0) {
                        int i29 = i28 >> 4;
                        g gVarC2 = c(arrayDeque, i29, true);
                        if (gVarC2 == null) {
                            arrayDeque.add(new g(i16, i15 - i17, false));
                            i13 = 0;
                        } else {
                            i13 = 0;
                            c23415f.d((i15 - gVarC2.f54080b) - 1, i17);
                            if ((i28 & 4) != 0) {
                                c23415f.i(i17, 1, bVar.getChangePayload(i29, i16));
                            }
                        }
                    } else {
                        i13 = i12;
                        c23415f.c(i17, 1);
                        i15++;
                    }
                    eVar = this;
                    i12 = i13;
                }
                i17 = dVar.f54069a;
                int i32 = i17;
                int i33 = i23;
                while (i12 < i19) {
                    if ((iArr[i32] & 15) == 2) {
                        c23415f.i(i32, 1, bVar.getChangePayload(i32, i33));
                    }
                    i32++;
                    i33++;
                    i12++;
                }
                size--;
                eVar = this;
                i16 = i23;
                arrayList2 = arrayList3;
            }
            c23415f.a();
        }

        public final void b(@j.N RecyclerView.Adapter adapter) {
            a(new C23411b(adapter));
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.o$f */
    public static abstract class f<T> {
        public abstract boolean a(@j.N T t12, @j.N T t13);

        public abstract boolean b(@j.N T t12, @j.N T t13);

        @j.P
        public Object c(@j.N T t12, @j.N T t13) {
            return null;
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.o$g */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f54079a;

        /* renamed from: b, reason: collision with root package name */
        public int f54080b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f54081c;

        public g(int i12, int i13, boolean z12) {
            this.f54079a = i12;
            this.f54080b = i13;
            this.f54081c = z12;
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.o$h */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public int f54082a;

        /* renamed from: b, reason: collision with root package name */
        public int f54083b;

        /* renamed from: c, reason: collision with root package name */
        public int f54084c;

        /* renamed from: d, reason: collision with root package name */
        public int f54085d;

        public final int a() {
            return this.f54085d - this.f54084c;
        }

        public final int b() {
            return this.f54083b - this.f54082a;
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.o$i */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f54086a;

        /* renamed from: b, reason: collision with root package name */
        public int f54087b;

        /* renamed from: c, reason: collision with root package name */
        public int f54088c;

        /* renamed from: d, reason: collision with root package name */
        public int f54089d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f54090e;

        public final int a() {
            return Math.min(this.f54088c - this.f54086a, this.f54089d - this.f54087b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.recyclerview.widget.C23424o.e a(@j.N androidx.recyclerview.widget.C23424o.b r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C23424o.a(androidx.recyclerview.widget.o$b, boolean):androidx.recyclerview.widget.o$e");
    }
}
