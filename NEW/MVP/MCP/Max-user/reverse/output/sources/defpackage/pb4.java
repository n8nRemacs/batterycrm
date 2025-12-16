package defpackage;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class pb4 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pb4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.a) {
            case 0:
                eqf eqfVar = (eqf) this.b;
                eqfVar.a = true;
                eqfVar.notifyDataSetChanged();
                break;
            default:
                ca8 ca8Var = (ca8) this.b;
                if (ca8Var.J0.isShowing()) {
                    ca8Var.g();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.a) {
            case 0:
                eqf eqfVar = (eqf) this.b;
                eqfVar.a = false;
                eqfVar.notifyDataSetInvalidated();
                break;
            default:
                ((ca8) this.b).dismiss();
                break;
        }
    }
}
