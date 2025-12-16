package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.d69;
import defpackage.i59;
import defpackage.l69;
import defpackage.m7;
import defpackage.v49;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MediaRouteActionProvider extends m7 {
    public final l69 c;
    public final d69 d;
    public final i59 e;
    public v49 f;

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.d = d69.c;
        this.e = i59.a;
        this.c = l69.d(context);
        new WeakReference(this);
    }

    @Override // defpackage.m7
    public final boolean b() {
        this.c.getClass();
        return l69.e(this.d);
    }

    @Override // defpackage.m7
    public final View c() {
        if (this.f != null) {
            Log.e("MRActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        v49 v49Var = new v49(this.a);
        this.f = v49Var;
        v49Var.setCheatSheetEnabled(true);
        this.f.setRouteSelector(this.d);
        this.f.setAlwaysVisible(false);
        this.f.setDialogFactory(this.e);
        this.f.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.f;
    }

    @Override // defpackage.m7
    public final boolean e() {
        v49 v49Var = this.f;
        if (v49Var != null) {
            return v49Var.d();
        }
        return false;
    }

    @Override // defpackage.m7
    public final boolean g() {
        return true;
    }
}
