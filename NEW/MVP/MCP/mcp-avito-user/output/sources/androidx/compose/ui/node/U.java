package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: LayoutNodeLayoutDelegate.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U {
    public static final boolean a(@Y61.k LayoutNode layoutNode) {
        if (layoutNode.f40635k != null) {
            LayoutNode layoutNodeK = layoutNode.K();
            if ((layoutNodeK != null ? layoutNodeK.f40635k : null) == null || layoutNode.f40616J.f40679b) {
                return true;
            }
        }
        return false;
    }
}
