package androidx.compose.ui.input.key;

import Y61.l;
import android.view.KeyEvent;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: KeyInputModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/h;", "Landroidx/compose/ui/input/key/g;", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class h extends v.d implements g {

    /* renamed from: p, reason: collision with root package name */
    @l
    public Y41.l<? super c, Boolean> f40073p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public Y41.l<? super c, Boolean> f40074q;

    public h() {
        throw null;
    }

    @Override // androidx.compose.ui.input.key.g
    public final boolean R1(@Y61.k KeyEvent keyEvent) {
        Y41.l<? super c, Boolean> lVar = this.f40073p;
        if (lVar != null) {
            return lVar.invoke(c.a(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.g
    public final boolean b0(@Y61.k KeyEvent keyEvent) {
        Y41.l<? super c, Boolean> lVar = this.f40074q;
        if (lVar != null) {
            return lVar.invoke(c.a(keyEvent)).booleanValue();
        }
        return false;
    }
}
