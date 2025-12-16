package androidx.compose.ui.input.rotary;

import Y61.k;
import Y61.l;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: RotaryInputModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/c;", "Landroidx/compose/ui/input/rotary/b;", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class c extends v.d implements b {

    /* renamed from: p, reason: collision with root package name */
    @l
    public Y41.l<? super d, Boolean> f40312p;

    public c() {
        throw null;
    }

    @Override // androidx.compose.ui.input.rotary.b
    public final boolean F0(@k d dVar) {
        Y41.l<? super d, Boolean> lVar = this.f40312p;
        if (lVar != null) {
            return lVar.invoke(dVar).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.rotary.b
    public final boolean G1(@k d dVar) {
        return false;
    }
}
