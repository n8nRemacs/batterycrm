package androidx.compose.foundation;

import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FocusedBounds.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/h1;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/TraversableNode;", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20527h1 extends v.d implements TraversableNode {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final a f28124r = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super androidx.compose.ui.layout.A, kotlin.G0> f28125p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final a f28126q = f28124r;

    /* compiled from: FocusedBounds.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/h1$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.h1$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C20527h1(@Y61.k Y41.l<? super androidx.compose.ui.layout.A, kotlin.G0> lVar) {
        this.f28125p = lVar;
    }

    public final void k2(@Y61.l androidx.compose.ui.layout.A a12) {
        this.f28125p.invoke(a12);
        C20527h1 c20527h1 = (C20527h1) androidx.compose.ui.node.Z0.a(this);
        if (c20527h1 != null) {
            c20527h1.k2(a12);
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @Y61.k
    /* renamed from: o0 */
    public final Object getF39003r() {
        return this.f28126q;
    }
}
