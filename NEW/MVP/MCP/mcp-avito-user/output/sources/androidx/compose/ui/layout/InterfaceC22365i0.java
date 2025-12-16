package androidx.compose.ui.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.C22713c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MeasurePolicy.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/i0;", "", "Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;Landroidx/compose/ui/unit/b;)Landroidx/compose/ui/layout/j0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22365i0 {

    /* compiled from: MeasurePolicy.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.i0$a */
    public static final class a {
    }

    @Y61.k
    InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12);

    default int c(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(new C22378p(list.get(i13), IntrinsicMinMax.f40333b, IntrinsicWidthHeight.f40338c));
        }
        return b(new C22397z(interfaceC22393x, interfaceC22393x.getF40524b()), arrayList, C22713c.b(i12, 0, 13)).getF40522b();
    }

    default int e(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(new C22378p(list.get(i13), IntrinsicMinMax.f40333b, IntrinsicWidthHeight.f40337b));
        }
        return b(new C22397z(interfaceC22393x, interfaceC22393x.getF40524b()), arrayList, C22713c.b(0, i12, 7)).getF40521a();
    }

    default int f(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(new C22378p(list.get(i13), IntrinsicMinMax.f40334c, IntrinsicWidthHeight.f40338c));
        }
        return b(new C22397z(interfaceC22393x, interfaceC22393x.getF40524b()), arrayList, C22713c.b(i12, 0, 13)).getF40522b();
    }

    default int h(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(new C22378p(list.get(i13), IntrinsicMinMax.f40334c, IntrinsicWidthHeight.f40337b));
        }
        return b(new C22397z(interfaceC22393x, interfaceC22393x.getF40524b()), arrayList, C22713c.b(0, i12, 7)).getF40521a();
    }
}
