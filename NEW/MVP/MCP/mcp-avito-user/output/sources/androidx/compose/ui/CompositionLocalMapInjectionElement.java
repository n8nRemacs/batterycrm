package androidx.compose.ui;

import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComposedModifier.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/o;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionLocalMapInjectionElement extends AbstractC22430p0<o> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final U f38818b;

    public CompositionLocalMapInjectionElement(@Y61.k U u12) {
        this.f38818b = u12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        o oVar = new o();
        oVar.f40960p = this.f38818b;
        return oVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        o oVar = (o) dVar;
        U u12 = this.f38818b;
        oVar.f40960p = u12;
        C22421l.g(oVar).e(u12);
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && L.f(((CompositionLocalMapInjectionElement) obj).f38818b, this.f38818b);
    }

    public final int hashCode() {
        return this.f38818b.hashCode();
    }
}
