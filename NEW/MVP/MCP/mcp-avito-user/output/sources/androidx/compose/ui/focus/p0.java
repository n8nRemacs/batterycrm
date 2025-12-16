package androidx.compose.ui.focus;

import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.Metadata;

/* compiled from: OneDimensionalFocusSearch.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/focus/p0;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class p0 implements Comparator<FocusTargetNode> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final p0 f39198b = new p0();

    @Override // java.util.Comparator
    public final int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        FocusTargetNode focusTargetNode3 = focusTargetNode;
        FocusTargetNode focusTargetNode4 = focusTargetNode2;
        int i12 = 0;
        if (n0.d(focusTargetNode3) && n0.d(focusTargetNode4)) {
            LayoutNode layoutNodeG = C22421l.g(focusTargetNode3);
            LayoutNode layoutNodeG2 = C22421l.g(focusTargetNode4);
            if (!kotlin.jvm.internal.L.f(layoutNodeG, layoutNodeG2)) {
                androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new LayoutNode[16], 0);
                while (layoutNodeG != null) {
                    eVar.a(0, layoutNodeG);
                    layoutNodeG = layoutNodeG.K();
                }
                androidx.compose.runtime.collection.e eVar2 = new androidx.compose.runtime.collection.e(new LayoutNode[16], 0);
                while (layoutNodeG2 != null) {
                    eVar2.a(0, layoutNodeG2);
                    layoutNodeG2 = layoutNodeG2.K();
                }
                int iMin = Math.min(eVar.f38262d - 1, eVar2.f38262d - 1);
                if (iMin >= 0) {
                    while (kotlin.jvm.internal.L.f(eVar.f38260b[i12], eVar2.f38260b[i12])) {
                        if (i12 != iMin) {
                            i12++;
                        }
                    }
                    return kotlin.jvm.internal.L.g(((LayoutNode) eVar.f38260b[i12]).L(), ((LayoutNode) eVar2.f38260b[i12]).L());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (n0.d(focusTargetNode3)) {
                return -1;
            }
            if (n0.d(focusTargetNode4)) {
                return 1;
            }
        }
        return 0;
    }
}
