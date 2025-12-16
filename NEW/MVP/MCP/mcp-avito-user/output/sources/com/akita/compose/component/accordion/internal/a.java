package com.akita.compose.component.accordion.internal;

import Y41.l;
import Y61.k;
import androidx.compose.foundation.H;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22381q0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.q0;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.unit.C22712b;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderTextLayout.kt */
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/akita/compose/component/accordion/internal/a;", "Landroidx/compose/ui/layout/q0;", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/q0;", "textMeasurer", "Landroidx/compose/ui/text/x0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "iconAtTheEnd", "Landroidx/compose/ui/unit/h;", "arrowTextSpacing", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/x0;ZFLkotlin/jvm/internal/w;)V", "accordion_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class a implements InterfaceC22381q0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C22602e f60204a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final q0 f60205b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x0 f60206c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f60207d;

    /* renamed from: e, reason: collision with root package name */
    public final float f60208e;

    /* compiled from: HeaderTextLayout.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.component.accordion.internal.a$a, reason: collision with other inner class name */
    public static final class C2079a extends N implements l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f60209l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ArrayList f60210m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ArrayList f60211n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f60212o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f60213p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f60214q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2079a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i12, int i13, int i14) {
            super(1);
            this.f60209l = arrayList;
            this.f60210m = arrayList2;
            this.f60211n = arrayList3;
            this.f60212o = i12;
            this.f60213p = i13;
            this.f60214q = i14;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            ArrayList arrayList = this.f60209l;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                aVar2.e((K0) arrayList.get(i12), 0, 0, 0.0f);
            }
            ArrayList arrayList2 = this.f60210m;
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                aVar2.e((K0) arrayList2.get(i13), this.f60212o, this.f60213p, 0.0f);
            }
            ArrayList arrayList3 = this.f60211n;
            int size3 = arrayList3.size();
            for (int i14 = 0; i14 < size3; i14++) {
                aVar2.e((K0) arrayList3.get(i14), this.f60214q, 0, 0.0f);
            }
            return G0.f406611a;
        }
    }

    public a(C22602e c22602e, q0 q0Var, x0 x0Var, boolean z12, float f12, C42822w c42822w) {
        this.f60204a = c22602e;
        this.f60205b = q0Var;
        this.f60206c = x0Var;
        this.f60207d = z12;
        this.f60208e = f12;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22381q0
    @k
    public final InterfaceC22367j0 b(@k InterfaceC22369k0 interfaceC22369k0, @k List<? extends List<? extends InterfaceC22363h0>> list, long j12) {
        ArrayList arrayList;
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList2;
        Object obj4;
        int iJ2;
        int i12;
        Object obj5;
        o0 o0VarB = q0.b(this.f60205b, this.f60204a, this.f60206c, 0, false, 0, j12, null, null, null, 1980);
        float f12 = o0VarB.f42529d;
        int i13 = (int) (f12 / 2);
        long jB2 = C22712b.b(i13, i13, i13, i13);
        List<? extends InterfaceC22363h0> list2 = list.get(0);
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size = list2.size();
        int iF2 = 0;
        while (iF2 < size) {
            iF2 = H.f(list2.get(iF2), jB2, arrayList3, iF2, 1);
            list2 = list2;
            size = size;
            arrayList3 = arrayList3;
        }
        ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            arrayList = arrayList4;
            obj = null;
        } else {
            arrayList = arrayList4;
            obj = arrayList.get(0);
            int i14 = ((K0) obj).f40345b;
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i15 = 1;
                while (true) {
                    Object obj6 = arrayList.get(i15);
                    int i16 = ((K0) obj6).f40345b;
                    if (i14 < i16) {
                        i14 = i16;
                        obj = obj6;
                    }
                    if (i15 == size2) {
                        break;
                    }
                    i15++;
                }
            }
        }
        K0 k02 = (K0) obj;
        int i17 = k02 != null ? k02.f40345b : 0;
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        int iY02 = interfaceC22369k0.y0(this.f60208e);
        List<? extends InterfaceC22363h0> list3 = list.get(2);
        ArrayList arrayList5 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int iF3 = 0; iF3 < size3; iF3 = H.f(list3.get(iF3), jC2, arrayList5, iF3, 1)) {
        }
        if (arrayList5.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList5.get(0);
            int i18 = ((K0) obj2).f40345b;
            int size4 = arrayList5.size() - 1;
            if (1 <= size4) {
                int i19 = 1;
                while (true) {
                    Object obj7 = arrayList5.get(i19);
                    Object obj8 = obj2;
                    int i22 = ((K0) obj7).f40345b;
                    if (i18 < i22) {
                        i18 = i22;
                        obj2 = obj7;
                    } else {
                        obj2 = obj8;
                    }
                    if (i19 == size4) {
                        break;
                    }
                    i19++;
                }
            }
        }
        K0 k03 = (K0) obj2;
        int i23 = k03 != null ? k03.f40345b : 0;
        if (arrayList5.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList5.get(0);
            int i24 = ((K0) obj3).f40346c;
            int size5 = arrayList5.size() - 1;
            if (1 <= size5) {
                int i25 = i24;
                Object obj9 = obj3;
                int i26 = 1;
                while (true) {
                    Object obj10 = arrayList5.get(i26);
                    int i27 = ((K0) obj10).f40346c;
                    if (i25 < i27) {
                        i25 = i27;
                        obj9 = obj10;
                    }
                    if (i26 == size5) {
                        break;
                    }
                    i26++;
                }
                obj3 = obj9;
            }
        }
        K0 k04 = (K0) obj3;
        int i28 = k04 != null ? k04.f40346c : 0;
        boolean z12 = this.f60207d || o0VarB.f42527b.f41921f > 1 || ((((int) (o0VarB.f42528c >> 32)) + iY02) + i17) + i23 > C22712b.j(j12);
        if (z12) {
            long jC3 = C22712b.c(jC2, 0, ((C22712b.j(j12) - iY02) - i17) - i23, 0, 0, 13);
            List<? extends InterfaceC22363h0> list4 = list.get(1);
            arrayList2 = new ArrayList(list4.size());
            int size6 = list4.size();
            for (int iF4 = 0; iF4 < size6; iF4 = H.f(list4.get(iF4), jC3, arrayList2, iF4, 1)) {
            }
        } else {
            List<? extends InterfaceC22363h0> list5 = list.get(1);
            arrayList2 = new ArrayList(list5.size());
            int size7 = list5.size();
            for (int iF5 = 0; iF5 < size7; iF5 = H.f(list5.get(iF5), jC2, arrayList2, iF5, 1)) {
            }
        }
        if (z12) {
            iJ2 = C22712b.j(j12) - i17;
        } else {
            if (arrayList2.isEmpty()) {
                obj4 = null;
            } else {
                obj4 = arrayList2.get(0);
                int i29 = ((K0) obj4).f40345b;
                int size8 = arrayList2.size() - 1;
                if (1 <= size8) {
                    int i32 = 1;
                    while (true) {
                        Object obj11 = arrayList2.get(i32);
                        int i33 = ((K0) obj11).f40345b;
                        if (i29 < i33) {
                            obj4 = obj11;
                            i29 = i33;
                        }
                        if (i32 == size8) {
                            break;
                        }
                        i32++;
                    }
                }
            }
            K0 k05 = (K0) obj4;
            iJ2 = (k05 != null ? k05.f40345b : 0) + iY02;
        }
        int i34 = iJ2;
        int iB2 = kotlin.math.b.b(f12 - i13);
        int iJ3 = z12 ? i34 - i23 : C22712b.j(j12) - i23;
        if (arrayList2.isEmpty()) {
            i12 = 0;
            obj5 = null;
        } else {
            i12 = 0;
            Object obj12 = arrayList2.get(0);
            int i35 = ((K0) obj12).f40346c;
            int i36 = 1;
            int size9 = arrayList2.size() - 1;
            if (1 <= size9) {
                while (true) {
                    Object obj13 = arrayList2.get(i36);
                    int i37 = ((K0) obj13).f40346c;
                    if (i35 < i37) {
                        obj12 = obj13;
                        i35 = i37;
                    }
                    if (i36 == size9) {
                        break;
                    }
                    i36++;
                }
            }
            obj5 = obj12;
        }
        K0 k06 = (K0) obj5;
        return interfaceC22369k0.L0(C22712b.j(j12), Math.max(k06 != null ? k06.f40346c : i12, i28), P0.c(), new C2079a(arrayList2, arrayList, arrayList5, i34, iB2, iJ3));
    }
}
