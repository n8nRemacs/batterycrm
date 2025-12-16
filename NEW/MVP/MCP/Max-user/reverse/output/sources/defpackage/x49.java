package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class x49 extends jo {
    public final l69 X;
    public final t49 Y;
    public TextView Z;
    public d69 s0;
    public ArrayList t0;
    public w49 u0;
    public ListView v0;
    public boolean w0;
    public long x0;
    public final ey y0;

    /* JADX WARN: Illegal instructions before constructor call */
    public x49(Context context) {
        ContextThemeWrapper contextThemeWrapperA = r69.a(context, false);
        int iG = r69.g(contextThemeWrapperA, avc.mediaRouteTheme);
        super(contextThemeWrapperA, iG == 0 ? r69.e(contextThemeWrapperA) : iG);
        this.s0 = d69.c;
        this.y0 = new ey(6, this);
        this.X = l69.d(getContext());
        this.Y = new t49(this, 1);
    }

    public final void f() {
        if (this.w0) {
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
            Collections.sort(arrayList, s55.c);
            if (SystemClock.uptimeMillis() - this.x0 < 300) {
                ey eyVar = this.y0;
                eyVar.removeMessages(1);
                eyVar.sendMessageAtTime(eyVar.obtainMessage(1, arrayList), this.x0 + 300);
            } else {
                this.x0 = SystemClock.uptimeMillis();
                this.t0.clear();
                this.t0.addAll(arrayList);
                this.u0.notifyDataSetChanged();
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
        setContentView(h1d.mr_chooser_dialog);
        this.t0 = new ArrayList();
        this.u0 = new w49(getContext(), this.t0);
        ListView listView = (ListView) findViewById(pxc.mr_chooser_list);
        this.v0 = listView;
        listView.setAdapter((ListAdapter) this.u0);
        this.v0.setOnItemClickListener(this.u0);
        this.v0.setEmptyView(findViewById(R.id.empty));
        this.Z = (TextView) findViewById(pxc.mr_chooser_title);
        getWindow().setLayout(dvi.a(getContext()), -2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.w0 = false;
        this.X.f(this.Y);
        this.y0.removeMessages(1);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.jo, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.Z.setText(charSequence);
    }

    @Override // defpackage.jo, android.app.Dialog
    public final void setTitle(int i) {
        this.Z.setText(i);
    }
}
