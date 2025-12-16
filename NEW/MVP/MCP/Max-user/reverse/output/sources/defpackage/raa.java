package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class raa extends j3 implements paa, m7g {
    public static final int w0 = n1d.layout_contact_location;
    public TextView X;
    public TextView Y;
    public TextView Z;
    public final qv3 d;
    public final ViewStub o;
    public TextView s0;
    public RecyclerView t0;
    public View u0;
    public tz3 v0;

    public raa(Context context, qv3 qv3Var, ViewStub viewStub) {
        super(context);
        this.d = qv3Var;
        this.o = viewStub;
    }

    @Override // defpackage.m7g
    public final void b() {
        View view = (View) this.c;
        if (view == null) {
            return;
        }
        yeb yebVarY = a93.s0.y(view);
        ((View) this.c).setBackgroundColor(yebVarY.b().m);
        this.X.setTextColor(yebVarY.getText().h);
        this.Z.setTextColor(yebVarY.getText().g);
        this.Y.setTextColor(yebVarY.getText().g);
        this.s0.setTextColor(yebVarY.getText().j);
        Drawable drawableH = cei.h(ivd.F0, yebVarY.getIcon().k, (Context) this.b);
        TextView textView = this.s0;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableH, (Drawable) null);
        s9j.a(textView, null);
        s9j.a(textView, null);
        s9j.a(textView, drawableH);
        s9j.a(textView, null);
    }

    @Override // defpackage.j3
    public final void i() {
        TextView textView = (TextView) ((View) this.c).findViewById(q0d.layout_contact_location__tv_name);
        this.X = textView;
        dpg.i.b(textView, t75.b);
        this.Y = (TextView) ((View) this.c).findViewById(q0d.layout_contact_location__iv_update);
        TextView textView2 = this.X;
        t5g t5gVar = dpg.l;
        t5gVar.b(textView2, t75.b);
        this.Z = (TextView) ((View) this.c).findViewById(q0d.layout_contact_location__tv_address);
        t5gVar.b(this.X, t75.b);
        this.s0 = (TextView) ((View) this.c).findViewById(q0d.layout_contact_location__tv_route);
        dpg.z.b(this.X, t75.b);
        this.t0 = (RecyclerView) ((View) this.c).findViewById(q0d.layout_contact_location__rv_markers);
        this.u0 = ((View) this.c).findViewById(q0d.layout_contact_location__separator);
        b();
        tz3 tz3Var = new tz3(this.d);
        this.v0 = tz3Var;
        tz3Var.Y = this;
        tz3Var.A(true);
        this.t0.setAdapter(this.v0);
        final int i = 0;
        this.t0.setLayoutManager(new LinearLayoutManager(0, false));
        u8j.a(this.s0, new p6(this) { // from class: qaa
            public final /* synthetic */ raa b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.j(new dk0(21));
                        break;
                    default:
                        this.b.j(new dk0(22));
                        break;
                }
            }
        });
        final int i2 = 1;
        u8j.a((View) this.c, new p6(this) { // from class: qaa
            public final /* synthetic */ raa b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.j(new dk0(21));
                        break;
                    default:
                        this.b.j(new dk0(22));
                        break;
                }
            }
        });
    }
}
