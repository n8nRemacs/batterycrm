package androidx.compose.ui.platform;

import android.view.ViewGroup;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/A0;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/relocation/a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class A0 extends v.d implements androidx.compose.ui.relocation.a {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public ViewGroup f40961p;

    @Override // androidx.compose.ui.relocation.a
    @Y61.l
    public final Object i0(@Y61.k AbstractC22443w0 abstractC22443w0, @Y61.k Y41.a aVar, @Y61.k ContinuationImpl continuationImpl) {
        long jE2 = androidx.compose.ui.layout.B.e(abstractC22443w0);
        l0.j jVar = (l0.j) aVar.invoke();
        l0.j jVarN = jVar != null ? jVar.n(jE2) : null;
        if (jVarN != null) {
            this.f40961p.requestRectangleOnScreen(androidx.compose.ui.graphics.X0.b(jVarN), false);
        }
        return kotlin.G0.f406611a;
    }
}
