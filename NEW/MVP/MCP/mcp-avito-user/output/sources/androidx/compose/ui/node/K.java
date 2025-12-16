package androidx.compose.ui.node;

import androidx.compose.ui.layout.C22397z;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.unit.C22713c;
import kotlin.Metadata;

/* compiled from: LayoutModifierNode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/node/k;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface K extends InterfaceC22419k {
    default int A(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        B0.f40545a.getClass();
        return f(new C22397z(x12, x12.getF40524b()), new B0.b(interfaceC22391w, B0.d.f40550c, B0.e.f40554c), C22713c.b(i12, 0, 13)).getF40522b();
    }

    @Y61.k
    InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12);

    default int m(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        B0.f40545a.getClass();
        return f(new C22397z(x12, x12.getF40524b()), new B0.b(interfaceC22391w, B0.d.f40549b, B0.e.f40553b), C22713c.b(0, i12, 7)).getF40521a();
    }

    default int x(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        B0.f40545a.getClass();
        return f(new C22397z(x12, x12.getF40524b()), new B0.b(interfaceC22391w, B0.d.f40549b, B0.e.f40554c), C22713c.b(i12, 0, 13)).getF40522b();
    }

    default int z(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        B0.f40545a.getClass();
        return f(new C22397z(x12, x12.getF40524b()), new B0.b(interfaceC22391w, B0.d.f40550c, B0.e.f40553b), C22713c.b(0, i12, 7)).getF40521a();
    }
}
