package e11;

import android.app.Activity;
import android.view.View;
import com.my.target.C37788h;

/* loaded from: classes7.dex */
public class N1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.my.target.e1 f394452b;

    public N1(com.my.target.e1 e1Var) {
        this.f394452b = e1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C37788h c37788h;
        com.my.target.e1 e1Var = this.f394452b;
        C39848C c39848c = e1Var.f364825o;
        if (c39848c == null || (c37788h = c39848c.f394698D) == null) {
            return;
        }
        com.my.target.D d12 = e1Var.f364822l;
        if (d12 == null || !d12.c()) {
            Activity activity = e1Var.f364815e.get();
            if (d12 == null || activity == null) {
                i2.a(c37788h.f364852b, e1Var.f364816f);
            } else {
                d12.b(activity);
            }
        }
    }
}
