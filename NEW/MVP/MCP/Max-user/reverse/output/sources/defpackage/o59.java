package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class o59 extends jo {
    public final ey A0;
    public final l69 X;
    public final t49 Y;
    public final Context Z;
    public d69 s0;
    public ArrayList t0;
    public n59 u0;
    public RecyclerView v0;
    public boolean w0;
    public k69 x0;
    public final long y0;
    public long z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public o59(Context context) {
        ContextThemeWrapper contextThemeWrapperA = r69.a(context, false);
        int iG = r69.g(contextThemeWrapperA, avc.mediaRouteTheme);
        super(contextThemeWrapperA, iG == 0 ? r69.e(contextThemeWrapperA) : iG);
        this.s0 = d69.c;
        this.A0 = new ey(7, this);
        Context context2 = getContext();
        this.X = l69.d(context2);
        this.Y = new t49(this, 3);
        this.Z = context2;
        this.y0 = context2.getResources().getInteger(z0d.mr_update_routes_delay_ms);
    }

    public final void f() {
        if (this.x0 == null && this.w0) {
            this.X.getClass();
            l69.b();
            h69 h69VarC = l69.c();
            ArrayList arrayList = new ArrayList(h69VarC == null ? Collections.EMPTY_LIST : h69VarC.g);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                k69 k69Var = (k69) arrayList.get(i);
                if (k69Var.d() || !k69Var.g || !k69Var.h(this.s0)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, s55.d);
            long jUptimeMillis = SystemClock.uptimeMillis() - this.z0;
            long j = this.y0;
            if (jUptimeMillis < j) {
                ey eyVar = this.A0;
                eyVar.removeMessages(1);
                eyVar.sendMessageAtTime(eyVar.obtainMessage(1, arrayList), this.z0 + j);
            } else {
                this.z0 = SystemClock.uptimeMillis();
                this.t0.clear();
                this.t0.addAll(arrayList);
                this.u0.C();
            }
        }
    }

    public final void g(d69 d69Var) {
        if (d69Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.s0.equals(d69Var)) {
            return;
        }
        this.s0 = d69Var;
        if (this.w0) {
            l69 l69Var = this.X;
            t49 t49Var = this.Y;
            l69Var.f(t49Var);
            l69Var.a(d69Var, t49Var, 1);
        }
        f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w0 = true;
        this.X.a(this.s0, this.Y, 1);
        f();
    }

    @Override // defpackage.jo, defpackage.pl3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(h1d.mr_picker_dialog);
        int i = r69.a;
        View decorView = getWindow().getDecorView();
        Context context = this.Z;
        decorView.setBackgroundColor(s34.a(context, r69.h(context) ? nvc.mr_dynamic_dialog_background_light : nvc.mr_dynamic_dialog_background_dark));
        this.t0 = new ArrayList();
        ((ImageButton) findViewById(pxc.mr_picker_close_button)).setOnClickListener(new r6(6, this));
        this.u0 = new n59(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(pxc.mr_picker_list);
        this.v0 = recyclerView;
        recyclerView.setAdapter(this.u0);
        this.v0.setLayoutManager(new LinearLayoutManager());
        getWindow().setLayout(!context.getResources().getBoolean(gvc.is_tablet) ? -1 : dvi.a(context), context.getResources().getBoolean(gvc.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w0 = false;
        this.X.f(this.Y);
        this.A0.removeMessages(1);
    }
}
