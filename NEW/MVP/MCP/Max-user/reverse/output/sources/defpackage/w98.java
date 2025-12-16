package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* loaded from: classes.dex */
public final class w98 implements mg9, AdapterView.OnItemClickListener {
    public lg9 X;
    public v98 Y;
    public Context a;
    public LayoutInflater b;
    public vf9 c;
    public ExpandedMenuView d;
    public final int o;

    public w98(Context context, int i) {
        this.o = i;
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.mg9
    public final boolean b(qnf qnfVar) {
        boolean zHasVisibleItems = qnfVar.hasVisibleItems();
        Context context = qnfVar.a;
        if (!zHasVisibleItems) {
            return false;
        }
        wf9 wf9Var = new wf9();
        wf9Var.a = qnfVar;
        uc ucVar = new uc(context);
        w98 w98Var = new w98(ucVar.getContext(), p1d.abc_list_menu_item_layout);
        wf9Var.c = w98Var;
        w98Var.X = wf9Var;
        qnfVar.b(w98Var, context);
        w98 w98Var2 = wf9Var.c;
        if (w98Var2.Y == null) {
            w98Var2.Y = new v98(w98Var2);
        }
        v98 v98Var = w98Var2.Y;
        qc qcVar = ucVar.a;
        qcVar.p = v98Var;
        qcVar.q = wf9Var;
        View view = qnfVar.y0;
        if (view != null) {
            qcVar.e = view;
        } else {
            qcVar.c = qnfVar.x0;
            ucVar.setTitle(qnfVar.w0);
        }
        qcVar.n = wf9Var;
        vc vcVarCreate = ucVar.create();
        wf9Var.b = vcVarCreate;
        vcVarCreate.setOnDismissListener(wf9Var);
        WindowManager.LayoutParams attributes = wf9Var.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        wf9Var.b.show();
        lg9 lg9Var = this.X;
        if (lg9Var == null) {
            return true;
        }
        lg9Var.x(qnfVar);
        return true;
    }

    @Override // defpackage.mg9
    public final boolean c() {
        return false;
    }

    @Override // defpackage.mg9
    public final boolean d(zf9 zf9Var) {
        return false;
    }

    @Override // defpackage.mg9
    public final void e(lg9 lg9Var) {
        throw null;
    }

    @Override // defpackage.mg9
    public final void f(vf9 vf9Var, boolean z) {
        lg9 lg9Var = this.X;
        if (lg9Var != null) {
            lg9Var.f(vf9Var, z);
        }
    }

    @Override // defpackage.mg9
    public final boolean h(zf9 zf9Var) {
        return false;
    }

    @Override // defpackage.mg9
    public final void i() {
        v98 v98Var = this.Y;
        if (v98Var != null) {
            v98Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.mg9
    public final void k(Context context, vf9 vf9Var) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = vf9Var;
        v98 v98Var = this.Y;
        if (v98Var != null) {
            v98Var.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.Y.getItem(i), this, 0);
    }
}
