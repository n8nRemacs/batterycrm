package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.Metadata;

/* compiled from: DepthSortedSet.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22429p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f40863a = new a();

    /* compiled from: DepthSortedSet.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"androidx/compose/ui/node/p$a", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.p$a */
    public static final class a implements Comparator<LayoutNode> {
        @Override // java.util.Comparator
        public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
            LayoutNode layoutNode3 = layoutNode;
            LayoutNode layoutNode4 = layoutNode2;
            int iG2 = kotlin.jvm.internal.L.g(layoutNode3.f40643s, layoutNode4.f40643s);
            return iG2 != 0 ? iG2 : kotlin.jvm.internal.L.g(layoutNode3.hashCode(), layoutNode4.hashCode());
        }
    }
}
