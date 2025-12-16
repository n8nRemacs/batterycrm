package androidx.compose.ui.node;

import kotlin.Metadata;
import s0.C47949a;

/* compiled from: DepthSortedSet.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/o;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22427o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a1<LayoutNode> f40862a = new a1<>(C22429p.f40863a);

    public final void a(@Y61.k LayoutNode layoutNode) {
        if (!layoutNode.m()) {
            C47949a.b("DepthSortedSet.add called on an unattached node");
        }
        this.f40862a.add(layoutNode);
    }

    public final boolean b(@Y61.k LayoutNode layoutNode) {
        if (!layoutNode.m()) {
            C47949a.b("DepthSortedSet.remove called on an unattached node");
        }
        return this.f40862a.remove(layoutNode);
    }

    @Y61.k
    public final String toString() {
        return this.f40862a.toString();
    }
}
