package androidx.compose.ui.text;

import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.font.E;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42754k;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import y0.C50028a;

/* compiled from: MultiParagraphIntrinsics.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/H;", "Landroidx/compose/ui/text/O;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H implements O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22602e f41924a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<C22602e.C1684e<U>> f41925b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f41926c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f41927d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f41928e;

    /* compiled from: MultiParagraphIntrinsics.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Float> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Float invoke() {
            Object obj;
            ArrayList arrayList = H.this.f41928e;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = arrayList.get(0);
                float fC2 = ((N) obj2).f41939a.f42563i.c();
                int i12 = 1;
                int size = arrayList.size() - 1;
                if (1 <= size) {
                    while (true) {
                        Object obj3 = arrayList.get(i12);
                        float fC3 = ((N) obj3).f41939a.f42563i.c();
                        if (Float.compare(fC2, fC3) < 0) {
                            obj2 = obj3;
                            fC2 = fC3;
                        }
                        if (i12 == size) {
                            break;
                        }
                        i12++;
                    }
                }
                obj = obj2;
            }
            N n12 = (N) obj;
            return Float.valueOf(n12 != null ? n12.f41939a.f42563i.c() : 0.0f);
        }
    }

    /* compiled from: MultiParagraphIntrinsics.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Float> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Float invoke() {
            Object obj;
            ArrayList arrayList = H.this.f41928e;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = arrayList.get(0);
                float fC2 = ((N) obj2).f41939a.c();
                int i12 = 1;
                int size = arrayList.size() - 1;
                if (1 <= size) {
                    while (true) {
                        Object obj3 = arrayList.get(i12);
                        float fC3 = ((N) obj3).f41939a.c();
                        if (Float.compare(fC2, fC3) < 0) {
                            obj2 = obj3;
                            fC2 = fC3;
                        }
                        if (i12 == size) {
                            break;
                        }
                        i12++;
                    }
                }
                obj = obj2;
            }
            N n12 = (N) obj;
            return Float.valueOf(n12 != null ? n12.f41939a.c() : 0.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H(@Y61.k C22602e c22602e, @Y61.k x0 x0Var, @Y61.k List<C22602e.C1684e<U>> list, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k E.b bVar) {
        String str;
        int i12;
        S s5;
        String str2;
        ArrayList arrayList;
        int i13;
        int i14;
        ArrayList arrayList2;
        int i15;
        int i16;
        List list2;
        C22602e c22602e2 = c22602e;
        this.f41924a = c22602e2;
        this.f41925b = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f41926c = C42727D.b(lazyThreadSafetyMode, new b());
        this.f41927d = C42727D.b(lazyThreadSafetyMode, new a());
        S s12 = x0Var.f42740b;
        C22602e c22602e3 = C22662l.f42494a;
        ArrayList arrayList3 = c22602e2.f42129e;
        List listB0 = (arrayList3 == null || (listB0 = C42745f0.B0(arrayList3, new C22633h())) == null) ? C42784z0.f406748b : listB0;
        ArrayList arrayList4 = new ArrayList();
        C42754k c42754k = new C42754k();
        int size = listB0.size();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            C22602e.C1684e c1684e = (C22602e.C1684e) listB0.get(i18);
            C22602e.C1684e c1684eA = C22602e.C1684e.a(c1684e, s12.a((S) c1684e.f42138a), i17, i17, 14);
            while (true) {
                i16 = c1684eA.f42139b;
                if (i19 >= i16 || c42754k.isEmpty()) {
                    break;
                }
                C22602e.C1684e c1684e2 = (C22602e.C1684e) c42754k.last();
                int i22 = c1684e2.f42140c;
                T t12 = c1684e2.f42138a;
                if (i16 < i22) {
                    arrayList4.add(new C22602e.C1684e(i19, i16, t12));
                } else {
                    arrayList4.add(new C22602e.C1684e(i19, i22, t12));
                    while (true) {
                        boolean zIsEmpty = c42754k.isEmpty();
                        i16 = c1684e2.f42140c;
                        if (zIsEmpty || i16 != ((C22602e.C1684e) c42754k.last()).f42140c) {
                            break;
                        } else {
                            c42754k.removeLast();
                        }
                    }
                }
                i19 = i16;
            }
            if (i19 < i16) {
                arrayList4.add(new C22602e.C1684e(i19, i16, s12));
                i19 = i16;
            }
            C22602e.C1684e c1684e3 = (C22602e.C1684e) c42754k.h();
            T t13 = c1684eA.f42138a;
            int i23 = c1684eA.f42140c;
            if (c1684e3 != null) {
                int i24 = c1684e3.f42140c;
                T t14 = c1684e3.f42138a;
                int i25 = c1684e3.f42139b;
                if (i25 == i16 && i24 == i23) {
                    c42754k.removeLast();
                    c42754k.addLast(new C22602e.C1684e(i16, i23, ((S) t14).a((S) t13)));
                    list2 = listB0;
                } else if (i25 == i24) {
                    list2 = listB0;
                    arrayList4.add(new C22602e.C1684e(i25, i24, t14));
                    c42754k.removeLast();
                    c42754k.addLast(new C22602e.C1684e(i16, i23, t13));
                } else {
                    list2 = listB0;
                    if (i24 < i23) {
                        throw new IllegalArgumentException();
                    }
                    c42754k.addLast(new C22602e.C1684e(i16, i23, ((S) t14).a((S) t13)));
                }
            } else {
                list2 = listB0;
                c42754k.addLast(new C22602e.C1684e(i16, i23, t13));
            }
            i18++;
            listB0 = list2;
            i17 = 0;
        }
        while (true) {
            str = c22602e2.f42127c;
            if (i19 > str.length() || c42754k.isEmpty()) {
                break;
            }
            C22602e.C1684e c1684e4 = (C22602e.C1684e) c42754k.last();
            T t15 = c1684e4.f42138a;
            int i26 = c1684e4.f42140c;
            arrayList4.add(new C22602e.C1684e(i19, i26, t15));
            while (!c42754k.isEmpty() && i26 == ((C22602e.C1684e) c42754k.last()).f42140c) {
                c42754k.removeLast();
            }
            i19 = i26;
        }
        if (i19 < str.length()) {
            arrayList4.add(new C22602e.C1684e(i19, str.length(), s12));
        }
        if (arrayList4.isEmpty()) {
            i12 = 0;
            arrayList4.add(new C22602e.C1684e(0, 0, s12));
        } else {
            i12 = 0;
        }
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int size2 = arrayList4.size();
        int i27 = i12;
        while (i27 < size2) {
            C22602e.C1684e c1684e5 = (C22602e.C1684e) arrayList4.get(i27);
            int i28 = c1684e5.f42139b;
            int i29 = c1684e5.f42140c;
            String strSubstring = i28 != i29 ? str.substring(i28, i29) : "";
            List listB = C22662l.b(c22602e2, i28, i29, C22634i.f42338l);
            C22602e c22602e4 = new C22602e(strSubstring, (List<? extends C22602e.C1684e<? extends C22602e.a>>) (listB == null ? C42784z0.f406748b : listB));
            S s13 = (S) c1684e5.f42138a;
            int i32 = s13.f41943b;
            androidx.compose.ui.text.style.k.f42689b.getClass();
            if (androidx.compose.ui.text.style.k.b(i32, androidx.compose.ui.text.style.k.f42695h)) {
                s5 = s12;
                str2 = str;
                arrayList = arrayList4;
                i13 = size2;
                i14 = i27;
                arrayList2 = arrayList5;
                s13 = new S(s13.f41942a, s12.f41943b, s13.f41944c, s13.f41945d, s13.f41946e, s13.f41947f, s13.f41948g, s13.f41949h, s13.f41950i, (C42822w) null);
            } else {
                s5 = s12;
                str2 = str;
                arrayList = arrayList4;
                arrayList2 = arrayList5;
                i13 = size2;
                i14 = i27;
            }
            x0 x0Var2 = new x0(x0Var.f42739a, x0Var.f42740b.a(s13));
            List list3 = c22602e4.f42126b;
            List list4 = list3 == null ? C42784z0.f406748b : list3;
            List<C22602e.C1684e<U>> list5 = this.f41925b;
            ArrayList arrayList6 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i33 = 0;
            while (true) {
                i15 = c1684e5.f42139b;
                if (i33 < size3) {
                    C22602e.C1684e<U> c1684e6 = list5.get(i33);
                    int i34 = c1684e6.f42139b;
                    int i35 = c1684e6.f42140c;
                    if (C22662l.c(i15, i29, i34, i35)) {
                        int i36 = c1684e6.f42139b;
                        if (i15 > i36 || i35 > i29) {
                            C50028a.a("placeholder can not overlap with paragraph.");
                        }
                        arrayList6.add(new C22602e.C1684e(i36 - i15, i35 - i15, c1684e6.f42138a));
                    }
                    i33++;
                }
            }
            N n12 = new N(new androidx.compose.ui.text.platform.g(strSubstring, x0Var2, list4, arrayList6, bVar, dVar), i15, i29);
            ArrayList arrayList7 = arrayList2;
            arrayList7.add(n12);
            i27 = i14 + 1;
            c22602e2 = c22602e;
            arrayList5 = arrayList7;
            s12 = s5;
            arrayList4 = arrayList;
            str = str2;
            size2 = i13;
        }
        this.f41928e = arrayList5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.compose.ui.text.O
    public final float a() {
        return ((Number) this.f41927d.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.O
    public final boolean b() {
        ArrayList arrayList = this.f41928e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((N) arrayList.get(i12)).f41939a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.compose.ui.text.O
    public final float c() {
        return ((Number) this.f41926c.getValue()).floatValue();
    }
}
