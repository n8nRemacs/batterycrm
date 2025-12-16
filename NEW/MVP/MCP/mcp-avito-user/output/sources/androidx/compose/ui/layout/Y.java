package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC22400a0;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

/* compiled from: LookaheadLayoutCoordinates.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y {
    @Y61.k
    public static final AbstractC22400a0 a(@Y61.k AbstractC22400a0 abstractC22400a0) {
        LayoutNode layoutNodeK = abstractC22400a0.f40731n.f40909n;
        while (true) {
            LayoutNode layoutNodeK2 = layoutNodeK.K();
            if ((layoutNodeK2 != null ? layoutNodeK2.f40635k : null) == null) {
                return layoutNodeK.f40615I.f40876c.getF40958U();
            }
            LayoutNode layoutNodeK3 = layoutNodeK.K();
            layoutNodeK = (layoutNodeK3 != null ? layoutNodeK3.f40635k : null).f40634j ? layoutNodeK.K() : layoutNodeK.K().f40635k;
        }
    }
}
