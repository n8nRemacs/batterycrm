package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.e;

/* loaded from: classes.dex */
public final class zo implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.a) {
            case 0:
                bp bpVar = (bp) this.b;
                ep epVar = bpVar.Q0;
                epVar.setSelection(i);
                if (epVar.getOnItemClickListener() != null) {
                    epVar.performItemClick(view, i, bpVar.N0.getItemId(i));
                }
                bpVar.dismiss();
                break;
            case 1:
                zp8 zp8Var = (zp8) this.b;
                ca8 ca8Var = zp8Var.o;
                zp8.b(zp8Var, i < 0 ? !ca8Var.J0.isShowing() ? null : ca8Var.c.getSelectedItem() : zp8Var.getAdapter().getItem(i));
                AdapterView.OnItemClickListener onItemClickListener = zp8Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !ca8Var.J0.isShowing() ? null : ca8Var.c.getSelectedView();
                        i = !ca8Var.J0.isShowing() ? -1 : ca8Var.c.getSelectedItemPosition();
                        j = !ca8Var.J0.isShowing() ? Long.MIN_VALUE : ca8Var.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(ca8Var.c, view, i, j);
                }
                ca8Var.dismiss();
                break;
            default:
                ((e) this.b).onItemClicked(i, 0, null);
                break;
        }
    }
}
