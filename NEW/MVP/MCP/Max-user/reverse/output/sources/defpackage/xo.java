package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class xo implements dp, DialogInterface.OnClickListener {
    public vc a;
    public yo b;
    public CharSequence c;
    public final /* synthetic */ ep d;

    public xo(ep epVar) {
        this.d = epVar;
    }

    @Override // defpackage.dp
    public final boolean a() {
        vc vcVar = this.a;
        if (vcVar != null) {
            return vcVar.isShowing();
        }
        return false;
    }

    @Override // defpackage.dp
    public final Drawable b() {
        return null;
    }

    @Override // defpackage.dp
    public final int c() {
        return 0;
    }

    @Override // defpackage.dp
    public final void dismiss() {
        vc vcVar = this.a;
        if (vcVar != null) {
            vcVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.dp
    public final void e(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.dp
    public final CharSequence f() {
        return this.c;
    }

    @Override // defpackage.dp
    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.dp
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.dp
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.dp
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.dp
    public final void n(int i, int i2) {
        if (this.b == null) {
            return;
        }
        ep epVar = this.d;
        uc ucVar = new uc(epVar.getPopupContext());
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            ucVar.setTitle(charSequence);
        }
        yo yoVar = this.b;
        int selectedItemPosition = epVar.getSelectedItemPosition();
        qc qcVar = ucVar.a;
        qcVar.p = yoVar;
        qcVar.q = this;
        qcVar.t = selectedItemPosition;
        qcVar.s = true;
        vc vcVarCreate = ucVar.create();
        this.a = vcVarCreate;
        AlertController$RecycleListView alertController$RecycleListView = vcVarCreate.X.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.dp
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ep epVar = this.d;
        epVar.setSelection(i);
        if (epVar.getOnItemClickListener() != null) {
            epVar.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.dp
    public final void p(ListAdapter listAdapter) {
        this.b = (yo) listAdapter;
    }
}
