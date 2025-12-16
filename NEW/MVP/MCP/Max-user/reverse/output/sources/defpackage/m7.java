package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
public abstract class m7 {
    public final Context a;
    public usd b;

    public m7(Context context) {
        this.a = context;
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract View c();

    public View d(zf9 zf9Var) {
        return c();
    }

    public abstract boolean e();

    public void f(qnf qnfVar) {
    }

    public abstract boolean g();

    public void h(usd usdVar) {
        if (this.b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.b = usdVar;
    }
}
