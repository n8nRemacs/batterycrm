package androidx.compose.foundation.gestures;

import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Scrollable.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/H1;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/TraversableNode;", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H1 extends v.d implements TraversableNode {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final a f27264r = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final a f27265p = f27264r;

    /* renamed from: q, reason: collision with root package name */
    public boolean f27266q;

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/H1$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public H1(boolean z12) {
        this.f27266q = z12;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @Y61.k
    public final Object o0() {
        return this.f27265p;
    }
}
