package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.e;

/* loaded from: classes.dex */
public final class x98 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x98(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        q55 q55Var;
        switch (this.a) {
            case 0:
                if (i != -1 && (q55Var = ((ca8) this.b).c) != null) {
                    q55Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((e) this.b).onItemSelected(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.a;
    }
}
