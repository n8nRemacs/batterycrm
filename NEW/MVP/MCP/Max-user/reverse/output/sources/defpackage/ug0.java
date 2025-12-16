package defpackage;

import android.content.Context;
import kotlinx.coroutines.internal.ContextScope;
import me.leolin.shortcutbadger.ShortcutBadger;

/* loaded from: classes.dex */
public final class ug0 implements ui8 {
    public final Context a;
    public final w63 b;
    public final ej0 c;
    public final ContextScope d;

    public ug0(Context context, w63 w63Var, ej0 ej0Var, lzf lzfVar, a84 a84Var) {
        this.a = context;
        this.b = w63Var;
        this.c = ej0Var;
        this.d = d7j.a(((q2b) lzfVar).a().limitedParallelism(1, "badge-count").plus(a84Var));
    }

    @Override // defpackage.ui8
    public final void c() {
        ShortcutBadger.removeCount(this.a);
    }
}
