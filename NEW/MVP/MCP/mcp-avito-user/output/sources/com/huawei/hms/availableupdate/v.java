package com.huawei.hms.availableupdate;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* compiled from: ConfirmDialogs.java */
/* loaded from: classes7.dex */
public abstract class v extends q {

    /* compiled from: ConfirmDialogs.java */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i12) {
            v.this.d();
        }
    }

    /* compiled from: ConfirmDialogs.java */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i12) {
            v.this.a();
        }
    }

    public v() {
    }

    @Override // com.huawei.hms.availableupdate.q
    public AlertDialog g() {
        AlertDialog.Builder builder = new AlertDialog.Builder(e(), f());
        builder.setMessage(h());
        builder.setPositiveButton(j(), new a());
        builder.setNegativeButton(i(), new b());
        return builder.create();
    }

    public abstract int h();

    public abstract int i();

    public abstract int j();
}
