package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: AbstractDialog.java */
/* loaded from: classes7.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public AlertDialog f363418a;

    /* renamed from: b, reason: collision with root package name */
    public p f363419b;

    /* compiled from: AbstractDialog.java */
    public class a implements DialogInterface.OnCancelListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            q.this.c();
        }
    }

    /* compiled from: AbstractDialog.java */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            q.this.c();
        }
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }

    public void b() {
        AlertDialog alertDialog = this.f363418a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void c() {
        p pVar = this.f363419b;
        if (pVar != null) {
            pVar.a(this);
        }
    }

    public void d() {
        p pVar = this.f363419b;
        if (pVar != null) {
            pVar.b(this);
        }
    }

    public Activity e() {
        p pVar = this.f363419b;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public int f() {
        return a(e()) != 0 ? 0 : 3;
    }

    public abstract AlertDialog g();

    public void a(p pVar) {
        this.f363419b = pVar;
        if (e() == null || e().isFinishing()) {
            HMSLog.e("AbstractDialog", "In show, The activity is null or finishing.");
            return;
        }
        AlertDialog alertDialogG = g();
        this.f363418a = alertDialogG;
        alertDialogG.setCanceledOnTouchOutside(false);
        this.f363418a.setOnCancelListener(new a());
        this.f363418a.show();
    }

    public void a(AlertDialog alertDialog) {
        this.f363418a.setOnCancelListener(null);
        this.f363418a.cancel();
        this.f363418a = alertDialog;
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.setOnCancelListener(new b());
        alertDialog.show();
    }

    public void a() {
        AlertDialog alertDialog = this.f363418a;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }
}
