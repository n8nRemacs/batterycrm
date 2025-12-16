package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.List;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public abstract class bi9 extends en9 implements rj9, y27 {
    public static final int[] S0 = {R.attr.state_enabled, R.attr.state_pressed};
    public static final int[] T0 = {R.attr.state_enabled};
    public final ViewGroup I0;
    public long J0;
    public ghh K0;
    public m00 L0;
    public final Object M0;
    public final Object N0;
    public final boolean O0;
    public long P0;
    public ValueAnimator Q0;
    public x27 R0;

    public bi9(Context context, ViewGroup viewGroup) {
        uh9 uh9Var = new uh9(context);
        super(uh9Var);
        this.I0 = viewGroup;
        this.J0 = -1L;
        this.K0 = ghh.b;
        this.M0 = ipi.b(3, new c38(24));
        this.N0 = ipi.b(3, new fr7(13, this));
        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
        uh9Var.setPaddingRelative(iD, 0, iD, 0);
        th9 th9Var = new th9();
        ViewGroup viewGroup2 = uh9Var.t0;
        if (viewGroup2 != null) {
            uh9Var.removeView(viewGroup2);
        }
        uh9Var.t0 = viewGroup;
        uh9Var.addView(viewGroup, th9Var);
        viewGroup.setClipChildren(false);
        this.O0 = true;
    }

    public static boolean P(fn9 fn9Var, m00 m00Var) {
        if (fn9Var == null) {
            return false;
        }
        int i = fn9Var.a;
        ws8 ws8Var = m00Var instanceof ws8 ? (ws8) m00Var : null;
        boolean z = ws8Var != null && ws8Var.d() && fn9.c(i);
        int i2 = (-2130706433) & i;
        if (i2 == -2147483645 || i2 == -2147483641 || i2 == -2147483644 || i2 == -2147483643 || i2 == -2147483636) {
            return true;
        }
        return (fn9.b(i) && !z) || (fn9.a(i) && !z) || ((fn9.d(i) && !z) || i2 == -2147483642);
    }

    @Override // defpackage.d2f
    public void E() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d4  */
    @Override // defpackage.en9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(one.me.messages.list.loader.MessageModel r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi9.F(one.me.messages.list.loader.MessageModel, java.util.List):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    public final void H(MessageModel messageModel) {
        yl7 yl7Var = messageModel.t0.c;
        ?? r1 = this.N0;
        if (yl7Var == null) {
            if (r1.e()) {
                ((bm7) r1.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        bm7 bm7Var = (bm7) r1.getValue();
        long j = messageModel.a;
        yl7 yl7Var2 = messageModel.t0.c;
        int i = bm7.u0;
        bm7Var.a(j, yl7Var2, false);
        uh9 uh9Var = (uh9) this.a;
        View view = (View) r1.getValue();
        th9 th9Var = new th9();
        if (uh9Var.u0 == null) {
            uh9Var.u0 = view;
            uh9Var.addView(view, th9Var);
        }
        ((View) r1.getValue()).setVisibility(0);
    }

    public final void I(MessageModel messageModel, boolean z) {
        ViewParent viewParent = this.I0;
        if (viewParent == null) {
            return;
        }
        wad wadVar = (wad) viewParent;
        wadVar.setIsIncoming(messageModel.F0);
        if (!z) {
            wadVar.setStackFromEnd(!messageModel.F0 && P(new fn9(messageModel.K0), messageModel.t0.b));
        }
        xl9 xl9Var = messageModel.D0;
        if (xl9Var != null) {
            wadVar.g(xl9Var, z);
        } else {
            wadVar.r(z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    public final ShapeDrawable J() {
        Drawable background = this.I0.getBackground();
        qh9 qh9Var = background instanceof qh9 ? (qh9) background : null;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(qh9Var != null ? qh9Var.a() : (float[]) this.M0.getValue(), null, null));
        shapeDrawable.getPaint().setColor(a93.s0.y(this.a).c().a.b.l);
        shapeDrawable.setAlpha(150);
        return shapeDrawable;
    }

    public final void K(sh9 sh9Var, String str) {
        m00 m00Var = this.L0;
        if (m00Var == null) {
            long j = this.J0;
            MessagesListWidget messagesListWidget = ((kv9) sh9Var).a;
            yy7[] yy7VarArr = MessagesListWidget.b1;
            messagesListWidget.K0().M(j);
            return;
        }
        long j2 = this.J0;
        MessagesListWidget messagesListWidget2 = ((kv9) sh9Var).a;
        yy7[] yy7VarArr2 = MessagesListWidget.b1;
        if (messagesListWidget2.K0().J(m00Var, j2, str)) {
            return;
        }
        messagesListWidget2.K0().M(j2);
    }

    public void L(MessageModel messageModel) {
    }

    public void M(yt0 yt0Var) {
    }

    public void N(th3 th3Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean O(x27 x27Var, sm6 sm6Var) {
        b37 b37Var;
        if (!fni.a(x27Var, this.R0)) {
            this.R0 = x27Var;
            ViewGroup viewGroup = this.I0;
            if (x27Var != null) {
                List list = x27Var.b;
                long j = this.J0;
                long j2 = x27Var.a;
                if (j == j2 && this.Q0 != null) {
                    b37Var = viewGroup instanceof b37 ? (b37) viewGroup : null;
                    if (b37Var != null) {
                        b37Var.f(list, sm6Var);
                        return true;
                    }
                } else if (j == j2) {
                    viewGroup.setForeground(J());
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(J().getAlpha(), 0);
                    valueAnimatorOfInt.setStartDelay(300L);
                    valueAnimatorOfInt.setDuration(800L);
                    valueAnimatorOfInt.addUpdateListener(new q00(16, this));
                    valueAnimatorOfInt.addListener(new qe(6, this));
                    valueAnimatorOfInt.start();
                    this.Q0 = valueAnimatorOfInt;
                    b37Var = viewGroup instanceof b37 ? (b37) viewGroup : null;
                    if (b37Var != null) {
                        b37Var.f(list, sm6Var);
                    }
                } else {
                    ValueAnimator valueAnimator = this.Q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    b37 b37Var2 = viewGroup instanceof b37 ? (b37) viewGroup : null;
                    if (b37Var2 != null) {
                        b37Var2.f(null, null);
                    }
                }
                return true;
            }
            ValueAnimator valueAnimator2 = this.Q0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            b37 b37Var3 = viewGroup instanceof b37 ? (b37) viewGroup : null;
            if (b37Var3 != null) {
                b37Var3.f(null, null);
                return false;
            }
        }
        return false;
    }

    public final void Q(MessageModel messageModel) {
        int i;
        Drawable background = this.I0.getBackground();
        qh9 qh9Var = background instanceof qh9 ? (qh9) background : null;
        if (qh9Var != null) {
            boolean zA = du0.a(messageModel.K0 & 2080374784);
            yt0 yt0VarH = a93.s0.y(this.a).a().h(zA);
            boolean zA2 = messageModel.t0.a();
            boolean z = messageModel.Z;
            int i2 = yt0VarH.c.a;
            int i3 = messageModel.K0;
            int i4 = 2080374784 & i3;
            if ((134217728 & i3) != 0) {
                i = 1;
            } else if ((268435456 & i3) != 0) {
                i = 2;
            } else if ((1073741824 & i3) != 0) {
                i = 4;
            } else {
                if ((i3 & 536870912) == 0) {
                    throw new IllegalStateException(("unknown bubble type " + du0.b(i4)).toString());
                }
                i = 3;
            }
            if (qh9.b(qh9Var, zA, i, messageModel.s0, z, i2, zA2)) {
                qh9Var.invalidateSelf();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ry2
    public final void a(yt0 yt0Var) {
        bu0 bu0Var = yt0Var.d;
        ViewGroup viewGroup = this.I0;
        vde vdeVar = viewGroup instanceof vde ? (vde) viewGroup : null;
        if (vdeVar != null) {
            vdeVar.setSenderNameColor(bu0Var.d);
        }
        qde qdeVar = viewGroup instanceof qde ? (qde) viewGroup : null;
        if (qdeVar != null) {
            qdeVar.setAliasColor(bu0Var.f);
        }
        y4g y4gVar = viewGroup instanceof y4g ? (y4g) viewGroup : null;
        if (y4gVar != null) {
            y4gVar.setTextMessageColors(yt0Var);
        }
        zk9 zk9Var = viewGroup instanceof zk9 ? (zk9) viewGroup : null;
        if (zk9Var != null) {
            zk9Var.d(yt0Var);
        }
        wad wadVar = viewGroup != 0 ? (wad) viewGroup : null;
        if (wadVar != null) {
            wadVar.l(yt0Var, !P(this.H0, this.L0));
        }
        Drawable background = viewGroup.getBackground();
        qh9 qh9Var = background instanceof qh9 ? (qh9) background : null;
        if (qh9Var != null) {
            v1a v1aVar = a93.s0;
            View view = this.a;
            int[] iArr = v1aVar.y(view).a().i().a.o;
            ph9 ph9Var = qh9Var.o;
            yy7[] yy7VarArr = qh9.t;
            ph9Var.O(qh9Var, yy7VarArr[0], iArr);
            qh9Var.p.O(qh9Var, yy7VarArr[1], v1aVar.y(view).a().r().a.o);
            qh9Var.invalidateSelf();
        }
        M(yt0Var);
    }

    @Override // defpackage.ry2
    public final void d(th3 th3Var) {
        Paint paint;
        Drawable foreground = this.I0.getForeground();
        ShapeDrawable shapeDrawable = foreground instanceof ShapeDrawable ? (ShapeDrawable) foreground : null;
        if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
            paint.setColor(a93.s0.y(this.a).c().a.b.l);
        }
        N(th3Var);
    }
}
