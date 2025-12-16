package androidx.compose.ui.focus;

import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

/* compiled from: FocusTargetNode.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j0 {
    @Y61.l
    public static final k0 a(@Y61.k FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        AndroidComposeView androidComposeView;
        B focusOwner;
        AbstractC22443w0 abstractC22443w0 = focusTargetNode.f42880b.f42887i;
        if (abstractC22443w0 == null || (layoutNode = abstractC22443w0.f40909n) == null || (androidComposeView = layoutNode.f40641q) == null || (focusOwner = androidComposeView.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.getF39106h();
    }
}
