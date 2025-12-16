package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class jo extends pl3 implements nn {
    public ho d;
    public final io o;

    /* JADX WARN: Type inference failed for: r1v2, types: [io] */
    public jo(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(fvc.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.o = new dz7() { // from class: io
            @Override // defpackage.dz7
            public final boolean o(KeyEvent keyEvent) {
                return this.a.e(keyEvent);
            }
        };
        un unVarC = c();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(fvc.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((ho) unVarC).d1 = i;
        unVarC.e();
    }

    @Override // defpackage.pl3, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ho hoVar = (ho) c();
        hoVar.w();
        ((ViewGroup) hoVar.K0.findViewById(R.id.content)).addView(view, layoutParams);
        hoVar.w0.a(hoVar.v0.getCallback());
    }

    public final un c() {
        if (this.d == null) {
            tn tnVar = un.a;
            this.d = new ho(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    public final void d() {
        pai.d(getWindow().getDecorView(), this);
        wqi.l(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(y0d.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return yoi.e(this.o, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ho hoVar = (ho) c();
        hoVar.w();
        return hoVar.v0.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().c();
    }

    @Override // defpackage.pl3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().a();
        super.onCreate(bundle);
        c().e();
    }

    @Override // defpackage.pl3, android.app.Dialog
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        ho hoVar = (ho) c();
        hoVar.A();
        kpi kpiVar = hoVar.y0;
        if (kpiVar != null) {
            kpiVar.o(false);
        }
    }

    @Override // defpackage.pl3, android.app.Dialog
    public void setContentView(int i) {
        d();
        c().j(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().m(charSequence);
    }

    @Override // defpackage.pl3, android.app.Dialog
    public void setContentView(View view) {
        d();
        c().k(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        c().m(getContext().getString(i));
    }

    @Override // defpackage.pl3, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        c().l(view, layoutParams);
    }
}
