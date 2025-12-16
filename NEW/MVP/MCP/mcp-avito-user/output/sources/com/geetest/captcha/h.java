package com.geetest.captcha;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.geetest.captcha.GTCaptcha4Client;

/* loaded from: classes4.dex */
public final class h extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public View f342727a;

    /* renamed from: b, reason: collision with root package name */
    public GTCaptcha4Client.OnDialogShowListener f342728b;

    public h(@Y61.k Context context) {
        super(context, g0.f342726a.b(context, "gt4_captcha_dialog_style"));
    }

    public final void a() {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(1280);
        }
        Window window2 = getWindow();
        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
        int i12 = getContext().getResources().getDisplayMetrics().widthPixels;
        int i13 = getContext().getResources().getDisplayMetrics().heightPixels;
        if (attributes != null) {
            attributes.width = i12;
        }
        if (attributes != null) {
            attributes.height = i13;
        }
        h0 h0Var = h0.f342732d;
        StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "ScreenWidth: ", ", ScreenHeight: ", ", DialogWidth: ");
        sbY.append(attributes != null ? Integer.valueOf(attributes.width) : null);
        sbY.append(", DialogHeight: ");
        sbY.append(attributes != null ? Integer.valueOf(attributes.height) : null);
        h0Var.c(sbY.toString());
        if (attributes != null) {
            attributes.gravity = 17;
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setAttributes(attributes);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater.from(getContext());
        View view = this.f342727a;
        if (view != null) {
            setContentView(view);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z12) {
        GTCaptcha4Client.OnDialogShowListener onDialogShowListener = this.f342728b;
        if (onDialogShowListener != null) {
            onDialogShowListener.onDialogFocusChanged(this, z12);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        GTCaptcha4Client.OnDialogShowListener onDialogShowListener = this.f342728b;
        if (onDialogShowListener != null) {
            onDialogShowListener.actionBeforeDialogShow(this);
        }
        super.show();
        GTCaptcha4Client.OnDialogShowListener onDialogShowListener2 = this.f342728b;
        if (onDialogShowListener2 != null) {
            onDialogShowListener2.actionAfterDialogShow(this);
        }
        a();
    }

    public h(@Y61.k Context context, @Y61.k String str) {
        super(context, g0.f342726a.b(context, str));
    }
}
