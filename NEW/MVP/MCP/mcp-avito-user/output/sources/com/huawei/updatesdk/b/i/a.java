package com.huawei.updatesdk.b.i;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private com.huawei.updatesdk.b.i.b f363870a;

    /* renamed from: b, reason: collision with root package name */
    private Context f363871b;

    /* renamed from: c, reason: collision with root package name */
    private String f363872c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f363873d;

    /* renamed from: e, reason: collision with root package name */
    private AlertDialog f363874e;

    /* renamed from: f, reason: collision with root package name */
    private AlertDialog.Builder f363875f;

    /* renamed from: g, reason: collision with root package name */
    private DialogInterface.OnShowListener f363876g;

    /* renamed from: h, reason: collision with root package name */
    private DialogInterface.OnDismissListener f363877h;

    /* renamed from: com.huawei.updatesdk.b.i.a$a, reason: collision with other inner class name */
    public class DialogInterfaceOnShowListenerC10762a implements DialogInterface.OnShowListener {

        /* renamed from: com.huawei.updatesdk.b.i.a$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC10763a implements View.OnClickListener {
            public ViewOnClickListenerC10763a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (a.this.f363870a != null) {
                    a.this.f363870a.a();
                }
            }
        }

        /* renamed from: com.huawei.updatesdk.b.i.a$a$b */
        public class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (a.this.f363870a != null) {
                    a.this.f363870a.b();
                }
            }
        }

        public DialogInterfaceOnShowListenerC10762a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            AlertDialog alertDialog = (AlertDialog) dialogInterface;
            alertDialog.getButton(-1).setOnClickListener(new ViewOnClickListenerC10763a());
            Button button = alertDialog.getButton(-2);
            if (button != null) {
                button.setOnClickListener(new b());
            }
            if (a.this.f363876g != null) {
                a.this.f363876g.onShow(dialogInterface);
            }
        }
    }

    public class b implements DialogInterface.OnDismissListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (a.this.f363877h != null) {
                a.this.f363877h.onDismiss(dialogInterface);
            }
        }
    }

    public interface c {
        void a();
    }

    public a(Context context, String str, CharSequence charSequence) {
        this.f363871b = context;
        this.f363872c = str;
        this.f363873d = charSequence;
        this.f363875f = com.huawei.updatesdk.a.a.d.i.c.k() ? new AlertDialog.Builder(context) : ((context.getResources().getConfiguration().uiMode & 48) != 32 || Build.VERSION.SDK_INT < 29) ? new AlertDialog.Builder(context, R.style.Theme.DeviceDefault.Light.Dialog.Alert) : new AlertDialog.Builder(context, R.style.Theme.DeviceDefault.Dialog.Alert);
        this.f363875f.setTitle(this.f363872c);
        this.f363875f.setPositiveButton(com.huawei.updatesdk.b.h.c.c(context, "upsdk_third_app_dl_sure_cancel_download"), (DialogInterface.OnClickListener) null);
        this.f363875f.setNegativeButton(com.huawei.updatesdk.b.h.c.c(context, "upsdk_cancel"), (DialogInterface.OnClickListener) null);
        this.f363875f.setMessage(this.f363873d);
    }

    public static a a(Context context, String str, CharSequence charSequence) {
        return new a(context, str, charSequence);
    }

    public boolean b() {
        AlertDialog alertDialog = this.f363874e;
        return alertDialog != null && alertDialog.isShowing();
    }

    public void c() {
        AlertDialog.Builder builder = this.f363875f;
        if (builder == null) {
            return;
        }
        builder.setNegativeButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public void a() {
        try {
            AlertDialog alertDialog = this.f363874e;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f363874e = null;
            }
        } catch (IllegalArgumentException unused) {
            com.huawei.updatesdk.a.a.a.b("BaseAlertDialog", "dialog dismiss IllegalArgumentException");
        }
    }

    public void a(int i12, String str) {
        Button button;
        AlertDialog alertDialog = this.f363874e;
        if (alertDialog == null || (button = alertDialog.getButton(i12)) == null) {
            return;
        }
        button.setText(str);
        button.setAllCaps(true);
    }

    public void a(DialogInterface.OnDismissListener onDismissListener) {
        this.f363877h = onDismissListener;
    }

    public void a(DialogInterface.OnKeyListener onKeyListener) {
        AlertDialog alertDialog = this.f363874e;
        if (alertDialog != null) {
            alertDialog.setOnKeyListener(onKeyListener);
        }
    }

    public void a(DialogInterface.OnShowListener onShowListener) {
        this.f363876g = onShowListener;
    }

    public void a(View view) {
        ImageView imageView;
        if (this.f363875f != null) {
            if ((com.huawei.updatesdk.b.h.a.f().a() >= 17 || com.huawei.updatesdk.b.h.a.f().b() > 0) && (imageView = (ImageView) view.findViewById(com.huawei.updatesdk.b.h.c.a(view.getContext(), "divider"))) != null) {
                imageView.setVisibility(8);
            }
            this.f363875f.setMessage((CharSequence) null);
            this.f363875f.setView(view);
        }
    }

    public void a(c cVar) {
        Context context = this.f363871b;
        if (context == null || ((Activity) context).isFinishing()) {
            com.huawei.updatesdk.a.a.a.b("BaseAlertDialog", "context == null or activity isFinishing");
            if (cVar != null) {
                cVar.a();
                return;
            }
            return;
        }
        if (b()) {
            return;
        }
        try {
            this.f363874e = this.f363875f.create();
            com.huawei.updatesdk.a.a.d.i.c.e().a(this.f363874e.getWindow());
            this.f363874e.setCanceledOnTouchOutside(false);
            this.f363874e.setOnShowListener(new DialogInterfaceOnShowListenerC10762a());
            this.f363874e.setOnDismissListener(new b());
            this.f363874e.show();
            this.f363874e.getButton(-1).requestFocus();
        } catch (Exception e12) {
            if (cVar != null) {
                cVar.a();
            }
            com.huawei.updatesdk.a.a.a.a("BaseAlertDialog", "show dlg error, e: " + e12.toString());
        }
    }

    public void a(com.huawei.updatesdk.b.i.b bVar) {
        this.f363870a = bVar;
    }

    public void a(boolean z12) {
        AlertDialog alertDialog = this.f363874e;
        if (alertDialog != null) {
            alertDialog.setCancelable(z12);
        }
    }
}
