package defpackage;

import android.view.View;
import androidx.fragment.app.a;

/* loaded from: classes.dex */
public final class ai6 extends q08 {
    public final /* synthetic */ a c;

    public ai6(a aVar) {
        this.c = aVar;
    }

    @Override // defpackage.q08
    public final View d(int i) {
        a aVar = this.c;
        View view = aVar.S0;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + aVar + " does not have a view");
    }

    @Override // defpackage.q08
    public final boolean e() {
        return this.c.S0 != null;
    }
}
