package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* compiled from: InstallConfirm.java */
/* loaded from: classes7.dex */
public class c0 extends q {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f363343f;

    /* renamed from: c, reason: collision with root package name */
    public String f363344c = ResourceLoaderUtil.getString("hms_update_title");

    /* renamed from: d, reason: collision with root package name */
    public c0 f363345d;

    /* renamed from: e, reason: collision with root package name */
    public AlertDialog f363346e;

    /* compiled from: InstallConfirm.java */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i12) {
            c0.this.d();
        }
    }

    /* compiled from: InstallConfirm.java */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AlertDialog.Builder f363348a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f363349b;

        public b(AlertDialog.Builder builder, Activity activity) {
            this.f363348a = builder;
            this.f363349b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i12) {
            c0 c0Var = c0.this;
            c0Var.f363346e = new i0(this.f363348a, this.f363349b, c0Var.f363345d).a();
            if (c0.this.f363346e == null) {
                c0.this.a();
                return;
            }
            c0 c0Var2 = c0.this;
            c0Var2.a(c0Var2.f363346e);
            c0.b(true);
        }
    }

    @Override // com.huawei.hms.availableupdate.q
    public AlertDialog g() {
        this.f363345d = this;
        int stringId = ResourceLoaderUtil.getStringId("hms_update_message_new");
        int stringId2 = ResourceLoaderUtil.getStringId("hms_install");
        Activity activityE = e();
        AlertDialog.Builder builder = new AlertDialog.Builder(activityE, f());
        if (t.b().a() && f363343f) {
            AlertDialog alertDialog = this.f363346e;
            if (alertDialog != null) {
                return alertDialog;
            }
            AlertDialog alertDialogA = new i0(builder, activityE, this.f363345d).a();
            this.f363346e = alertDialogA;
            if (alertDialogA != null) {
                return alertDialogA;
            }
        }
        b(false);
        builder.setMessage(activityE.getString(stringId, this.f363344c));
        builder.setPositiveButton(stringId2, new a());
        builder.setNegativeButton(ResourceLoaderUtil.getStringId("hms_cancel"), new b(builder, activityE));
        return builder.create();
    }

    public static void b(boolean z12) {
        f363343f = z12;
    }

    public void a(String str) {
        this.f363344c = str;
    }
}
