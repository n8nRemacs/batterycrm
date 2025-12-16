package com.my.target;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;

/* loaded from: classes7.dex */
public class V extends Dialog {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final a f364624b;

    public interface a {
        void b(boolean z12);

        void d(@j.N V v12, @j.N FrameLayout frameLayout);

        void q();
    }

    public V(@j.N a aVar, @j.N Context context) {
        super(context);
        this.f364624b = aVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.f364624b.q();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        setContentView(frameLayout);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
        }
        this.f364624b.d(this, frameLayout);
        super.onCreate(bundle);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z12) {
        this.f364624b.b(z12);
        super.onWindowFocusChanged(z12);
    }
}
