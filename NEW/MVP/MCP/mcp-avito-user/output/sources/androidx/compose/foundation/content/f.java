package androidx.compose.foundation.content;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.modifier.j;
import androidx.compose.ui.modifier.k;
import androidx.compose.ui.modifier.l;
import androidx.compose.ui.modifier.t;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.InterfaceC22415i;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: ReceiveContent.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/content/f;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/modifier/k;", "Landroidx/compose/ui/node/i;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f extends AbstractC22425n implements k, InterfaceC22415i {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final t f26979r;

    public f() {
        androidx.compose.foundation.content.internal.b bVar = new androidx.compose.foundation.content.internal.b(this);
        this.f26979r = l.a(new Q(androidx.compose.foundation.content.internal.e.f26988a, bVar));
        k2(androidx.compose.foundation.content.internal.h.a(bVar, new e(this)));
    }

    @Override // androidx.compose.ui.modifier.k
    @Y61.k
    public final j c1() {
        return this.f26979r;
    }
}
