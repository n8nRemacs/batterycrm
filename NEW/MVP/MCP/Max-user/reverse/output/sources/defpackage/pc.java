package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class pc implements AdapterView.OnItemClickListener {
    public final /* synthetic */ tc a;
    public final /* synthetic */ qc b;

    public pc(qc qcVar, tc tcVar) {
        this.b = qcVar;
        this.a = tcVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        qc qcVar = this.b;
        DialogInterface.OnClickListener onClickListener = qcVar.q;
        tc tcVar = this.a;
        onClickListener.onClick(tcVar.b, i);
        if (qcVar.s) {
            return;
        }
        tcVar.b.dismiss();
    }
}
