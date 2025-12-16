package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: DepthSortedSet.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/q;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22431q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22427o f40864a = new C22427o();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22427o f40865b = new C22427o();

    public final void a(@Y61.k LayoutNode layoutNode, boolean z12) {
        C22427o c22427o = this.f40865b;
        C22427o c22427o2 = this.f40864a;
        if (z12) {
            c22427o2.a(layoutNode);
            c22427o.a(layoutNode);
        } else {
            if (c22427o2.f40862a.contains(layoutNode)) {
                return;
            }
            c22427o.a(layoutNode);
        }
    }

    public final boolean b(@Y61.k LayoutNode layoutNode) {
        return this.f40864a.f40862a.contains(layoutNode);
    }

    public final boolean c() {
        return !(this.f40865b.f40862a.isEmpty() && this.f40864a.f40862a.isEmpty());
    }
}
