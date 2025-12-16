package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v98 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ w98 b;

    public v98(w98 w98Var) {
        this.b = w98Var;
        a();
    }

    public final void a() {
        vf9 vf9Var = this.b.c;
        zf9 zf9Var = vf9Var.F0;
        if (zf9Var != null) {
            vf9Var.i();
            ArrayList arrayList = vf9Var.t0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((zf9) arrayList.get(i)) == zf9Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zf9 getItem(int i) {
        w98 w98Var = this.b;
        vf9 vf9Var = w98Var.c;
        vf9Var.i();
        ArrayList arrayList = vf9Var.t0;
        w98Var.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (zf9) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        w98 w98Var = this.b;
        vf9 vf9Var = w98Var.c;
        vf9Var.i();
        int size = vf9Var.t0.size();
        w98Var.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            w98 w98Var = this.b;
            view = w98Var.b.inflate(w98Var.o, viewGroup, false);
        }
        ((ng9) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
