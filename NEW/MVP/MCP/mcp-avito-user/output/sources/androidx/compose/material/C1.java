package androidx.compose.material;

import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22381q0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BottomSheetScaffold.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "<name for destructuring parameter 0>", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class C1 implements InterfaceC22381q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f32461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f32463c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ J1 f32464d;

    /* compiled from: BottomSheetScaffold.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ ArrayList f32465A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ int f32466B;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Float> f32467l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f32468m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f32469n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f32470o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f32471p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ float f32472q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f32473r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f32474s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ J1 f32475t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f32476u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f32477v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ArrayList f32478w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ArrayList f32479x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ ArrayList f32480y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ ArrayList f32481z;

        /* compiled from: BottomSheetScaffold.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.material.C1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1631a {
            static {
                int[] iArr = new int[BottomSheetValue.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    BottomSheetValue bottomSheetValue = BottomSheetValue.f32454b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, int i12, InterfaceC22369k0 interfaceC22369k0, int i13, int i14, float f12, int i15, int i16, J1 j12, int i17, int i18, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, int i19) {
            super(1);
            this.f32467l = aVar;
            this.f32468m = i12;
            this.f32469n = interfaceC22369k0;
            this.f32470o = i13;
            this.f32471p = i14;
            this.f32472q = f12;
            this.f32473r = i15;
            this.f32474s = i16;
            this.f32475t = j12;
            this.f32476u = i17;
            this.f32477v = i18;
            this.f32478w = arrayList;
            this.f32479x = arrayList2;
            this.f32480y = arrayList3;
            this.f32481z = arrayList4;
            this.f32465A = arrayList5;
            this.f32466B = i19;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            int iY02;
            int i12;
            K0.a aVar2 = aVar;
            int iB2 = kotlin.math.b.b(this.f32467l.invoke().floatValue());
            F4.f32621b.getClass();
            int i13 = this.f32468m;
            boolean zA2 = F4.a(i13, 0);
            int i14 = this.f32470o;
            InterfaceC22369k0 interfaceC22369k0 = this.f32469n;
            if (zA2) {
                iY02 = interfaceC22369k0.y0(H1.f32703a);
            } else {
                boolean zA3 = F4.a(i13, F4.f32622c);
                int i15 = this.f32471p;
                iY02 = zA3 ? (i14 - i15) / 2 : (i14 - i15) - interfaceC22369k0.y0(H1.f32703a);
            }
            float fM02 = interfaceC22369k0.M0(this.f32472q);
            int i16 = this.f32473r;
            int i17 = i16 / 2;
            int iY03 = fM02 < ((float) i17) ? (iB2 - i16) - interfaceC22369k0.y0(H1.f32703a) : iB2 - i17;
            int i18 = (i14 - this.f32474s) / 2;
            int iOrdinal = ((BottomSheetValue) ((C22082i3) this.f32475t.f32790a.f34353g).getF42167b()).ordinal();
            int i19 = this.f32476u;
            if (iOrdinal == 0) {
                i12 = iY03 - i19;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = this.f32477v - i19;
            }
            ArrayList arrayList = this.f32478w;
            int size = arrayList.size();
            for (int i22 = 0; i22 < size; i22++) {
                aVar2.h((androidx.compose.ui.layout.K0) arrayList.get(i22), 0, this.f32466B, 0.0f);
            }
            ArrayList arrayList2 = this.f32479x;
            int size2 = arrayList2.size();
            for (int i23 = 0; i23 < size2; i23++) {
                aVar2.h((androidx.compose.ui.layout.K0) arrayList2.get(i23), 0, 0, 0.0f);
            }
            ArrayList arrayList3 = this.f32480y;
            int size3 = arrayList3.size();
            for (int i24 = 0; i24 < size3; i24++) {
                aVar2.h((androidx.compose.ui.layout.K0) arrayList3.get(i24), 0, 0, 0.0f);
            }
            ArrayList arrayList4 = this.f32481z;
            int size4 = arrayList4.size();
            for (int i25 = 0; i25 < size4; i25++) {
                aVar2.h((androidx.compose.ui.layout.K0) arrayList4.get(i25), iY02, iY03, 0.0f);
            }
            ArrayList arrayList5 = this.f32465A;
            int size5 = arrayList5.size();
            for (int i26 = 0; i26 < size5; i26++) {
                aVar2.h((androidx.compose.ui.layout.K0) arrayList5.get(i26), i18, i12, 0.0f);
            }
            return kotlin.G0.f406611a;
        }
    }

    public C1(Y41.a<Float> aVar, int i12, float f12, J1 j12) {
        this.f32461a = aVar;
        this.f32462b = i12;
        this.f32463c = f12;
        this.f32464d = j12;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22381q0
    public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends List<? extends InterfaceC22363h0>> list, long j12) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        List<? extends InterfaceC22363h0> list2 = list.get(0);
        List<? extends InterfaceC22363h0> list3 = list.get(1);
        List<? extends InterfaceC22363h0> list4 = list.get(2);
        List<? extends InterfaceC22363h0> list5 = list.get(3);
        List<? extends InterfaceC22363h0> list6 = list.get(4);
        int iJ2 = C22712b.j(j12);
        int i12 = C22712b.i(j12);
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list4.size());
        int size = list4.size();
        for (int iF2 = 0; iF2 < size; iF2 = androidx.compose.foundation.H.f(list4.get(iF2), jC2, arrayList, iF2, 1)) {
        }
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int iF3 = 0; iF3 < size2; iF3 = androidx.compose.foundation.H.f(list2.get(iF3), jC2, arrayList2, iF3, 1)) {
        }
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int i13 = ((androidx.compose.ui.layout.K0) obj).f40346c;
            int size3 = arrayList2.size() - 1;
            if (1 <= size3) {
                int i14 = 1;
                while (true) {
                    Object obj6 = arrayList2.get(i14);
                    int i15 = ((androidx.compose.ui.layout.K0) obj6).f40346c;
                    if (i13 < i15) {
                        i13 = i15;
                        obj = obj6;
                    }
                    if (i14 == size3) {
                        break;
                    }
                    i14++;
                }
            }
        }
        androidx.compose.ui.layout.K0 k02 = (androidx.compose.ui.layout.K0) obj;
        int i16 = k02 != null ? k02.f40346c : 0;
        long jC3 = C22712b.c(jC2, 0, 0, 0, i12 - i16, 7);
        ArrayList arrayList3 = new ArrayList(list3.size());
        int size4 = list3.size();
        for (int iF4 = 0; iF4 < size4; iF4 = androidx.compose.foundation.H.f(list3.get(iF4), jC3, arrayList3, iF4, 1)) {
        }
        ArrayList arrayList4 = new ArrayList(list5.size());
        int size5 = list5.size();
        for (int iF5 = 0; iF5 < size5; iF5 = androidx.compose.foundation.H.f(list5.get(iF5), jC2, arrayList4, iF5, 1)) {
        }
        if (arrayList4.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList4.get(0);
            int i17 = ((androidx.compose.ui.layout.K0) obj2).f40345b;
            int size6 = arrayList4.size() - 1;
            if (1 <= size6) {
                int i18 = 1;
                while (true) {
                    Object obj7 = arrayList4.get(i18);
                    Object obj8 = obj2;
                    int i19 = ((androidx.compose.ui.layout.K0) obj7).f40345b;
                    if (i17 < i19) {
                        i17 = i19;
                        obj2 = obj7;
                    } else {
                        obj2 = obj8;
                    }
                    if (i18 == size6) {
                        break;
                    }
                    i18++;
                }
            }
        }
        androidx.compose.ui.layout.K0 k03 = (androidx.compose.ui.layout.K0) obj2;
        int i22 = k03 != null ? k03.f40345b : 0;
        if (arrayList4.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList4.get(0);
            int i23 = ((androidx.compose.ui.layout.K0) obj3).f40346c;
            int size7 = arrayList4.size() - 1;
            if (1 <= size7) {
                int i24 = 1;
                while (true) {
                    Object obj9 = arrayList4.get(i24);
                    Object obj10 = obj3;
                    int i25 = ((androidx.compose.ui.layout.K0) obj9).f40346c;
                    if (i23 < i25) {
                        i23 = i25;
                        obj3 = obj9;
                    } else {
                        obj3 = obj10;
                    }
                    if (i24 == size7) {
                        break;
                    }
                    i24++;
                }
            }
        }
        androidx.compose.ui.layout.K0 k04 = (androidx.compose.ui.layout.K0) obj3;
        int i26 = k04 != null ? k04.f40346c : 0;
        ArrayList arrayList5 = new ArrayList(list6.size());
        int size8 = list6.size();
        for (int iF6 = 0; iF6 < size8; iF6 = androidx.compose.foundation.H.f(list6.get(iF6), jC2, arrayList5, iF6, 1)) {
        }
        if (arrayList5.isEmpty()) {
            obj4 = null;
        } else {
            obj4 = arrayList5.get(0);
            int i27 = ((androidx.compose.ui.layout.K0) obj4).f40345b;
            int size9 = arrayList5.size() - 1;
            if (1 <= size9) {
                int i28 = 1;
                while (true) {
                    Object obj11 = arrayList5.get(i28);
                    Object obj12 = obj4;
                    int i29 = ((androidx.compose.ui.layout.K0) obj11).f40345b;
                    if (i27 < i29) {
                        i27 = i29;
                        obj4 = obj11;
                    } else {
                        obj4 = obj12;
                    }
                    if (i28 == size9) {
                        break;
                    }
                    i28++;
                }
            }
        }
        androidx.compose.ui.layout.K0 k05 = (androidx.compose.ui.layout.K0) obj4;
        int i32 = k05 != null ? k05.f40345b : 0;
        if (arrayList5.isEmpty()) {
            obj5 = null;
        } else {
            Object obj13 = arrayList5.get(0);
            int i33 = ((androidx.compose.ui.layout.K0) obj13).f40346c;
            int i34 = 1;
            int size10 = arrayList5.size() - 1;
            if (1 <= size10) {
                while (true) {
                    Object obj14 = arrayList5.get(i34);
                    Object obj15 = obj13;
                    int i35 = ((androidx.compose.ui.layout.K0) obj14).f40346c;
                    if (i33 < i35) {
                        i33 = i35;
                        obj13 = obj14;
                    } else {
                        obj13 = obj15;
                    }
                    if (i34 == size10) {
                        break;
                    }
                    i34++;
                }
            }
            obj5 = obj13;
        }
        androidx.compose.ui.layout.K0 k06 = (androidx.compose.ui.layout.K0) obj5;
        return interfaceC22369k0.L0(iJ2, i12, kotlin.collections.P0.c(), new a(this.f32461a, this.f32462b, interfaceC22369k0, iJ2, i22, this.f32463c, i26, i32, this.f32464d, k06 != null ? k06.f40346c : 0, i12, arrayList3, arrayList2, arrayList, arrayList4, arrayList5, i16));
    }
}
