package androidx.compose.ui.node;

import androidx.compose.ui.layout.InterfaceC22393x;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MeasureScopeWithLayoutNode.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22426n0 {

    /* compiled from: MeasureScopeWithLayoutNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.n0$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.f40651b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f40651b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.f40651b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LayoutNode.LayoutState layoutState4 = LayoutNode.LayoutState.f40651b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Y61.k
    public static final ArrayList a(@Y61.k InterfaceC22393x interfaceC22393x) {
        LayoutNode f40909n = ((InterfaceC22424m0) interfaceC22393x).getF40909n();
        boolean zB2 = b(f40909n);
        List<LayoutNode> listD = f40909n.D();
        ArrayList arrayList = new ArrayList(listD.size());
        int size = listD.size();
        for (int i12 = 0; i12 < size; i12++) {
            LayoutNode layoutNode = listD.get(i12);
            arrayList.add(zB2 ? layoutNode.A() : layoutNode.B());
        }
        return arrayList;
    }

    public static final boolean b(LayoutNode layoutNode) {
        int iOrdinal = layoutNode.f40616J.f40681d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return true;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return true;
                }
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                LayoutNode layoutNodeK = layoutNode.K();
                if (layoutNodeK != null) {
                    return b(layoutNodeK);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return false;
    }
}
