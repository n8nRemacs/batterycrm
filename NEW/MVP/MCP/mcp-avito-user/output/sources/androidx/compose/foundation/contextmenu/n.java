package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.window.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ContextMenuPopupPositionProvider.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/contextmenu/n;", "Landroidx/compose/ui/window/T;", "Landroidx/compose/ui/unit/q;", "localPosition", "<init>", "(JLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n implements T {

    /* renamed from: a, reason: collision with root package name */
    public final long f27036a;

    public n(long j12, C42822w c42822w) {
        this.f27036a = j12;
    }

    @Override // androidx.compose.ui.window.T
    public final long a(@Y61.k androidx.compose.ui.unit.s sVar, long j12, @Y61.k LayoutDirection layoutDirection, long j13) {
        int i12 = sVar.f42867a;
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        long j14 = this.f27036a;
        return (o.a(i12 + ((int) (j14 >> 32)), (int) (j13 >> 32), (int) (j12 >> 32), layoutDirection == LayoutDirection.f42838b) << 32) | (o.a(sVar.f42868b + ((int) (j14 & 4294967295L)), (int) (j13 & 4294967295L), (int) (j12 & 4294967295L), true) & 4294967295L);
    }
}
