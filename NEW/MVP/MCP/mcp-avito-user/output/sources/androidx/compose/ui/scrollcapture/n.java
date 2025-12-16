package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.semantics.u;
import androidx.compose.ui.unit.s;
import kotlin.Metadata;

/* compiled from: ScrollCapture.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/scrollcapture/n;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f41711a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41712b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final s f41713c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AbstractC22443w0 f41714d;

    public n(@Y61.k u uVar, int i12, @Y61.k s sVar, @Y61.k AbstractC22443w0 abstractC22443w0) {
        this.f41711a = uVar;
        this.f41712b = i12;
        this.f41713c = sVar;
        this.f41714d = abstractC22443w0;
    }

    @Y61.k
    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.f41711a + ", depth=" + this.f41712b + ", viewportBoundsInWindow=" + this.f41713c + ", coordinates=" + this.f41714d + ')';
    }
}
