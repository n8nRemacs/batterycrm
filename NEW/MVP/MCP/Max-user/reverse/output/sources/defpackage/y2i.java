package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class y2i extends en9 {
    public final h88 I0;
    public v32 J0;

    public y2i(Context context) {
        x2i x2iVar = new x2i(context);
        super(x2iVar);
        this.I0 = new h88(null, new p2f(context, 12), 7);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        float f = 24;
        marginLayoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
        marginLayoutParams.setMarginEnd(kti.d(f * vw4.d().getDisplayMetrics().density));
        x2iVar.setLayoutParams(marginLayoutParams);
        x2iVar.setBackground(new ww6(context));
    }

    @Override // defpackage.d2f
    public final void E() {
        CharSequence charSequenceX;
        v32 v32Var = this.J0;
        if (v32Var == null || (charSequenceX = v32Var.X()) == null) {
            return;
        }
        this.I0.getClass();
        h88.a(charSequenceX);
    }

    @Override // defpackage.en9
    public final void F(MessageModel messageModel, List list) {
        v32 v32Var;
        this.H0 = new fn9(messageModel.K0);
        v32 v32Var2 = messageModel.z0;
        this.J0 = v32Var2;
        View view = this.a;
        if (v32Var2 != null) {
            x2i x2iVar = (x2i) view;
            TextView textView = x2iVar.c;
            TextView textView2 = x2iVar.b;
            v1a v1aVar = a93.s0;
            zd7 zd7Var = x2iVar.a;
            bm7 bm7Var = x2iVar.d;
            x2iVar.y0 = v32Var2;
            Iterator it = ((ArrayList) v32Var2.c).iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                a3i a3iVar = (a3i) it.next();
                Iterator it2 = it;
                if (a3iVar instanceof b3i) {
                    long j = v32Var2.b;
                    fqi.c(x2iVar, bm7Var, -1);
                    v32Var = v32Var2;
                    float f = x2iVar.x0;
                    bm7Var.a = f;
                    bm7Var.b = f;
                    z4 = true;
                    bm7Var.a(j, ((b3i) a3iVar).a, true);
                } else {
                    v32Var = v32Var2;
                    if (a3iVar instanceof c3i) {
                        c3i c3iVar = (c3i) a3iVar;
                        ViewGroup.LayoutParams layoutParams = zd7Var.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        Size size = c3iVar.a;
                        String str = c3iVar.b;
                        layoutParams.width = size.getWidth();
                        layoutParams.height = c3iVar.a.getHeight();
                        zd7Var.setLayoutParams(layoutParams);
                        if (str != null && str.length() != 0) {
                            if (c3iVar.c) {
                                zd7Var.setColorFilter(v1aVar.y(x2iVar).a().G().c.b);
                            } else {
                                zd7Var.setColorFilter((ColorFilter) null);
                            }
                            sf7 sf7VarD = sf7.d(Uri.parse(str));
                            sf7VarD.f = x2iVar.o;
                            zd7Var.i(sf7VarD.a(), null);
                        }
                        z = true;
                    } else {
                        if (!(a3iVar instanceof d3i)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d3i d3iVar = (d3i) a3iVar;
                        boolean z5 = d3iVar.c;
                        if (z5) {
                            z3 = true;
                        } else {
                            z2 = true;
                        }
                        CharSequence charSequence = d3iVar.a;
                        if (z5) {
                            textView.setText(mzi.a(charSequence));
                            x2iVar.a(v1aVar.y(x2iVar));
                        } else {
                            textView2.setText(charSequence);
                            t5g t5gVar = dpg.a;
                            d3iVar.b.b(textView2, t75.b);
                        }
                    }
                }
                it = it2;
                v32Var2 = v32Var;
            }
            zd7Var.setVisibility(z ? 0 : 8);
            textView2.setVisibility(z2 ? 0 : 8);
            textView.setVisibility(z3 ? 0 : 8);
            bm7Var.setVisibility(z4 ? 0 : 8);
        }
        G(messageModel, view);
    }

    @Override // defpackage.ry2
    public final void d(th3 th3Var) {
        Drawable background = ((x2i) this.a).getBackground();
        ww6 ww6Var = background instanceof ww6 ? (ww6) background : null;
        if (ww6Var != null) {
            ww6Var.d(th3Var);
        }
    }
}
