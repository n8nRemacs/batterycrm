package androidx.compose.ui.node;

import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: InnerNodeCoordinator.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/W0;", "Landroidx/compose/ui/v$d;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W0 extends v.d {

    /* renamed from: p, reason: collision with root package name */
    public boolean f40701p;

    public W0() {
        this.f42883e = 0;
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        this.f40701p = true;
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        this.f40701p = false;
    }

    @Y61.k
    public final String toString() {
        return "<tail>";
    }
}
