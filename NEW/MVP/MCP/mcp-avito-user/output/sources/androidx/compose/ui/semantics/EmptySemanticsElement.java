package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: SemanticsModifier.jvm.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/semantics/f;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmptySemanticsElement extends AbstractC22430p0<C22558f> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22558f f41726b;

    public EmptySemanticsElement(@Y61.k C22558f c22558f) {
        this.f41726b = c22558f;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return this.f41726b;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final /* bridge */ /* synthetic */ void b(v.d dVar) {
    }

    public final boolean equals(@Y61.l Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
