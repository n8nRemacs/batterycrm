package androidx.compose.ui.input.key;

import Y61.l;
import android.view.KeyEvent;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: SoftwareKeyboardInterceptionModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/a;", "Landroidx/compose/ui/input/key/j;", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class a extends v.d implements j {

    /* renamed from: p, reason: collision with root package name */
    @l
    public Y41.l<? super c, Boolean> f40051p;

    public a() {
        throw null;
    }

    @Override // androidx.compose.ui.input.key.j
    public final boolean T0(@Y61.k KeyEvent keyEvent) {
        Y41.l<? super c, Boolean> lVar = this.f40051p;
        if (lVar != null) {
            return lVar.invoke(c.a(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.j
    public final boolean f1(@Y61.k KeyEvent keyEvent) {
        return false;
    }
}
