package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class sf9 extends BaseAdapter {
    public final int X;
    public final vf9 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater o;

    public sf9(vf9 vf9Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.o = layoutInflater;
        this.a = vf9Var;
        this.X = i;
        a();
    }

    public final void a() {
        vf9 vf9Var = this.a;
        zf9 zf9Var = vf9Var.F0;
        if (zf9Var != null) {
            vf9Var.i();
            ArrayList arrayList = vf9Var.t0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((zf9) arrayList.get(i)) == zf9Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zf9 getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.d;
        vf9 vf9Var = this.a;
        if (z) {
            vf9Var.i();
            arrayListL = vf9Var.t0;
        } else {
            arrayListL = vf9Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (zf9) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.d;
        vf9 vf9Var = this.a;
        if (z) {
            vf9Var.i();
            arrayListL = vf9Var.t0;
        } else {
            arrayListL = vf9Var.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.o.inflate(this.X, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        ng9 ng9Var = (ng9) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        ng9Var.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
