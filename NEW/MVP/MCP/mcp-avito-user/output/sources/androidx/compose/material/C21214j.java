package androidx.compose.material;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.l0;

/* compiled from: AlertDialog.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21214j implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f33704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f33705b;

    /* compiled from: AlertDialog.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.j$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f33706l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f33707m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f33708n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f33709o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ ArrayList f33710p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, InterfaceC22369k0 interfaceC22369k0, float f12, int i12, ArrayList arrayList2) {
            super(1);
            this.f33706l = arrayList;
            this.f33707m = interfaceC22369k0;
            this.f33708n = f12;
            this.f33709o = i12;
            this.f33710p = arrayList2;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            InterfaceC22369k0 interfaceC22369k0;
            K0.a aVar2 = aVar;
            ArrayList arrayList = this.f33706l;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                List list = (List) arrayList.get(i12);
                int size2 = list.size();
                int[] iArr = new int[size2];
                int i13 = 0;
                while (true) {
                    interfaceC22369k0 = this.f33707m;
                    if (i13 >= size2) {
                        break;
                    }
                    iArr[i13] = ((androidx.compose.ui.layout.K0) list.get(i13)).f40345b + (i13 < list.size() + (-1) ? interfaceC22369k0.y0(this.f33708n) : 0);
                    i13++;
                }
                C20585k.f28659a.getClass();
                int[] iArr2 = new int[size2];
                C20585k.f28663e.c(interfaceC22369k0, this.f33709o, iArr, iArr2);
                int size3 = list.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    aVar2.e((androidx.compose.ui.layout.K0) list.get(i14), iArr2[i14], ((Number) this.f33710p.get(i12)).intValue(), 0.0f);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    public C21214j(float f12, float f13) {
        this.f33704a = f12;
        this.f33705b = f13;
    }

    public static final void a(ArrayList arrayList, l0.f fVar, InterfaceC22369k0 interfaceC22369k0, float f12, ArrayList arrayList2, ArrayList arrayList3, l0.f fVar2, ArrayList arrayList4, l0.f fVar3, l0.f fVar4) {
        if (!arrayList.isEmpty()) {
            fVar.f406840b = interfaceC22369k0.y0(f12) + fVar.f406840b;
        }
        arrayList.add(0, C42745f0.M0(arrayList2));
        arrayList3.add(Integer.valueOf(fVar2.f406840b));
        arrayList4.add(Integer.valueOf(fVar.f406840b));
        fVar.f406840b += fVar2.f406840b;
        fVar3.f406840b = Math.max(fVar3.f406840b, fVar4.f406840b);
        arrayList2.clear();
        fVar4.f406840b = 0;
        fVar2.f406840b = 0;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends InterfaceC22363h0> list, long j12) {
        C21214j c21214j;
        androidx.compose.ui.layout.K0 k02;
        int i12;
        int i13;
        long j13;
        l0.f fVar;
        l0.f fVar2;
        ArrayList arrayList;
        l0.f fVar3;
        C21214j c21214j2 = this;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        l0.f fVar4 = new l0.f();
        l0.f fVar5 = new l0.f();
        ArrayList arrayList5 = new ArrayList();
        l0.f fVar6 = new l0.f();
        l0.f fVar7 = new l0.f();
        long jB2 = C22713c.b(C22712b.j(j12), 0, 13);
        int size = list.size();
        int i14 = 0;
        while (i14 < size) {
            androidx.compose.ui.layout.K0 k0I = list.get(i14).I(jB2);
            boolean zIsEmpty = arrayList5.isEmpty();
            l0.f fVar8 = fVar4;
            float f12 = c21214j2.f33704a;
            if (zIsEmpty) {
                k02 = k0I;
                i12 = i14;
                i13 = size;
                j13 = jB2;
                fVar = fVar7;
                fVar2 = fVar6;
                arrayList = arrayList5;
                fVar3 = fVar5;
            } else {
                if (interfaceC22369k0.y0(f12) + fVar6.f406840b + k0I.f40345b <= C22712b.j(j12)) {
                    i12 = i14;
                    i13 = size;
                    j13 = jB2;
                    fVar2 = fVar6;
                    arrayList = arrayList5;
                    fVar3 = fVar5;
                    k02 = k0I;
                    fVar = fVar7;
                } else {
                    float f13 = c21214j2.f33705b;
                    k02 = k0I;
                    i12 = i14;
                    i13 = size;
                    j13 = jB2;
                    fVar = fVar7;
                    fVar2 = fVar6;
                    arrayList = arrayList5;
                    fVar3 = fVar5;
                    a(arrayList2, fVar5, interfaceC22369k0, f13, arrayList5, arrayList3, fVar7, arrayList4, fVar8, fVar2);
                }
            }
            l0.f fVar9 = fVar2;
            if (!arrayList.isEmpty()) {
                fVar9.f406840b = interfaceC22369k0.y0(f12) + fVar9.f406840b;
            }
            ArrayList arrayList6 = arrayList;
            arrayList6.add(k02);
            fVar9.f406840b += k02.f40345b;
            fVar7 = fVar;
            fVar7.f406840b = Math.max(fVar7.f406840b, k02.f40346c);
            i14 = i12 + 1;
            c21214j2 = this;
            arrayList5 = arrayList6;
            fVar6 = fVar9;
            fVar4 = fVar8;
            size = i13;
            jB2 = j13;
            fVar5 = fVar3;
        }
        ArrayList arrayList7 = arrayList5;
        l0.f fVar10 = fVar5;
        l0.f fVar11 = fVar4;
        l0.f fVar12 = fVar6;
        if (arrayList7.isEmpty()) {
            c21214j = this;
        } else {
            c21214j = this;
            a(arrayList2, fVar10, interfaceC22369k0, c21214j.f33705b, arrayList7, arrayList3, fVar7, arrayList4, fVar11, fVar12);
        }
        int iJ2 = C22712b.j(j12) != Integer.MAX_VALUE ? C22712b.j(j12) : Math.max(fVar11.f406840b, C22712b.l(j12));
        return interfaceC22369k0.L0(iJ2, Math.max(fVar10.f406840b, C22712b.k(j12)), kotlin.collections.P0.c(), new a(arrayList2, interfaceC22369k0, c21214j.f33704a, iJ2, arrayList4));
    }
}
