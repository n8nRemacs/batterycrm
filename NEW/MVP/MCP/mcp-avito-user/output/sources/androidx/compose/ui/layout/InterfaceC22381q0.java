package androidx.compose.ui.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.C22713c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MultiContentMeasurePolicy.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/q0;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22381q0 {
    @Y61.k
    InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends List<? extends InterfaceC22363h0>> list, long j12);

    default int c(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends List<? extends InterfaceC22391w>> list, int i12) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            List list2 = (List) arrayList.get(i13);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList3.add(new C22378p((InterfaceC22391w) list2.get(i14), IntrinsicMinMax.f40333b, IntrinsicWidthHeight.f40338c));
            }
            arrayList2.add(arrayList3);
        }
        return b(new C22397z(interfaceC22393x, interfaceC22393x.getF40388b()), arrayList2, C22713c.b(i12, 0, 13)).getF40716b();
    }

    default int e(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends List<? extends InterfaceC22391w>> list, int i12) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            List list2 = (List) arrayList.get(i13);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList3.add(new C22378p((InterfaceC22391w) list2.get(i14), IntrinsicMinMax.f40333b, IntrinsicWidthHeight.f40337b));
            }
            arrayList2.add(arrayList3);
        }
        return b(new C22397z(interfaceC22393x, interfaceC22393x.getF40388b()), arrayList2, C22713c.b(0, i12, 7)).getF40715a();
    }

    default int f(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends List<? extends InterfaceC22391w>> list, int i12) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            List list2 = (List) arrayList.get(i13);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList3.add(new C22378p((InterfaceC22391w) list2.get(i14), IntrinsicMinMax.f40334c, IntrinsicWidthHeight.f40338c));
            }
            arrayList2.add(arrayList3);
        }
        return b(new C22397z(interfaceC22393x, interfaceC22393x.getF40388b()), arrayList2, C22713c.b(i12, 0, 13)).getF40716b();
    }

    default int h(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends List<? extends InterfaceC22391w>> list, int i12) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            List list2 = (List) arrayList.get(i13);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList3.add(new C22378p((InterfaceC22391w) list2.get(i14), IntrinsicMinMax.f40334c, IntrinsicWidthHeight.f40337b));
            }
            arrayList2.add(arrayList3);
        }
        return b(new C22397z(interfaceC22393x, interfaceC22393x.getF40388b()), arrayList2, C22713c.b(0, i12, 7)).getF40715a();
    }
}
