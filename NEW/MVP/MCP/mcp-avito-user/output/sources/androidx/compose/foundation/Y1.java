package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.InterfaceC22442w;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: RectListNode.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/Y1;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/w;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Y1 extends v.d implements InterfaceC22442w {

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Rect f26901p;

    @Override // androidx.compose.ui.node.InterfaceC22442w
    public final void P(@Y61.k AbstractC22443w0 abstractC22443w0) {
        l0.j jVarP = androidx.compose.ui.layout.B.c(abstractC22443w0).P(abstractC22443w0, true);
        Rect rect = new Rect(kotlin.math.b.b(jVarP.f413390a), kotlin.math.b.b(jVarP.f413391b), kotlin.math.b.b(jVarP.f413392c), kotlin.math.b.b(jVarP.f413393d));
        androidx.compose.runtime.collection.e<Rect> eVarK2 = k2();
        Rect rect2 = this.f26901p;
        if (rect2 != null) {
            eVarK2.j(rect2);
        }
        if (!rect.isEmpty()) {
            eVarK2.b(rect);
        }
        l2(eVarK2);
        this.f26901p = rect;
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        androidx.compose.runtime.collection.e<Rect> eVarK2 = k2();
        Rect rect = this.f26901p;
        if (rect != null) {
            eVarK2.j(rect);
        }
        l2(eVarK2);
        this.f26901p = null;
    }

    @Y61.k
    public abstract androidx.compose.runtime.collection.e<Rect> k2();

    public abstract void l2(@Y61.k androidx.compose.runtime.collection.e<Rect> eVar);
}
