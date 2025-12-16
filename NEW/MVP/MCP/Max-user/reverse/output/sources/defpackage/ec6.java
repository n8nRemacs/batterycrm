package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import one.me.chats.list.ChatsListWidget;

/* loaded from: classes2.dex */
public final class ec6 extends vhd implements u6g {
    public final /* synthetic */ int a;
    public final Parcelable b;
    public final mc5 c;
    public final Object d;
    public final Object o;

    public ec6(z11 z11Var, Context context) {
        this.a = 2;
        this.o = z11Var;
        this.c = new mc5(18);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(vw4.d().getDisplayMetrics().density * 3.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.d = paint;
        this.b = new RectF();
        onThemeChanged(a93.s0.x(context).k());
    }

    public static boolean i(RecyclerView recyclerView, int i) {
        phd adapter = recyclerView.getAdapter();
        if (adapter == null || i == -1 || i == 0) {
            return false;
        }
        int iL = adapter.l(i);
        int i2 = d5b.l;
        return iL == i2 && adapter.l(i - 1) != i2;
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        int iR;
        switch (this.a) {
            case 0:
                super.f(rect, view, recyclerView, iidVar);
                phd adapter = recyclerView.getAdapter();
                if (adapter != null && (iR = RecyclerView.R(view)) > 0 && adapter.l(iR) == d5b.i) {
                    rect.top = (int) ((kti.d(6 * vw4.d().getDisplayMetrics().density) * 2) + 0.5f);
                }
                this.c.w(rect, view, recyclerView);
                break;
            case 1:
                super.f(rect, view, recyclerView, iidVar);
                if (i(recyclerView, RecyclerView.R(view))) {
                    rect.top = kti.d(48 * vw4.d().getDisplayMetrics().density);
                }
                this.c.w(rect, view, recyclerView);
                break;
            case 2:
                int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
                rect.set(iD, iD, iD, iD);
                this.c.w(rect, view, recyclerView);
                break;
            case 3:
                super.f(rect, view, recyclerView, iidVar);
                if (j(view, recyclerView)) {
                    rect.top = (int) ((kti.d(10 * vw4.d().getDisplayMetrics().density) * 2) + 0.5f);
                }
                this.c.w(rect, view, recyclerView);
                break;
            default:
                TextPaint textPaint = (TextPaint) this.o;
                super.f(rect, view, recyclerView, iidVar);
                int iR2 = RecyclerView.R(view);
                ChatsListWidget chatsListWidget = (ChatsListWidget) ((ka5) this.d).a;
                if (iR2 == chatsListWidget.y0.j() + chatsListWidget.z0.j() && chatsListWidget.A0.j() > 0) {
                    rect.top = (kti.d(6 * vw4.d().getDisplayMetrics().density) * 2) + ((int) (textPaint.descent() - textPaint.ascent())) + rect.top;
                }
                this.c.w(rect, view, recyclerView);
                break;
        }
    }

    @Override // defpackage.vhd
    public void g(Canvas canvas, RecyclerView recyclerView, iid iidVar) {
        int iR;
        switch (this.a) {
            case 0:
                Canvas canvas2 = canvas;
                Rect rect = (Rect) this.b;
                int i = 0;
                while (true) {
                    if (!(i < recyclerView.getChildCount())) {
                        return;
                    }
                    int i2 = i + 1;
                    View childAt = recyclerView.getChildAt(i);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    phd adapter = recyclerView.getAdapter();
                    if (adapter != null && (iR = RecyclerView.R(childAt)) > 0 && adapter.l(iR) == d5b.i) {
                        this.c.v(rect, childAt, RecyclerView.R(childAt));
                        float f = 12;
                        canvas2.drawRect(u45.c(f, vw4.d().getDisplayMetrics().density, rect.left), rect.top, u45.q(f, vw4.d().getDisplayMetrics().density, rect.right), rect.bottom, (Paint) this.o);
                        float f2 = 24;
                        canvas.drawLine(u45.c(f2, vw4.d().getDisplayMetrics().density, rect.left), rect.centerY(), u45.q(f2, vw4.d().getDisplayMetrics().density, rect.right), rect.centerY(), (Paint) this.d);
                    }
                    canvas2 = canvas;
                    i = i2;
                }
                break;
            case 1:
                Rect rect2 = (Rect) this.b;
                int i3 = 0;
                while (true) {
                    if (!(i3 < recyclerView.getChildCount())) {
                        return;
                    }
                    int i4 = i3 + 1;
                    View childAt2 = recyclerView.getChildAt(i3);
                    if (childAt2 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    int iR2 = RecyclerView.R(childAt2);
                    if (i(recyclerView, iR2)) {
                        String upperCase = ((Context) this.d).getString(f5b.b).toUpperCase(Locale.ROOT);
                        this.c.v(rect2, childAt2, iR2);
                        canvas.drawText(upperCase, rect2.left + kti.d(28 * vw4.d().getDisplayMetrics().density), rect2.bottom - kti.d(10 * vw4.d().getDisplayMetrics().density), (TextPaint) this.o);
                    }
                    i3 = i4;
                }
            default:
                return;
        }
    }

    @Override // defpackage.vhd
    public void h(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        switch (this.a) {
            case 2:
                RectF rectF = (RectF) this.b;
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    int iR = RecyclerView.R(recyclerView.getChildAt(i));
                    if (iR != -1 && ((Boolean) ((z11) this.o).invoke(Integer.valueOf(iR))).booleanValue()) {
                        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
                        rectF.set(r2.getLeft() - iD, r2.getTop() - iD, r2.getRight() + iD, r2.getBottom() + iD);
                        float f = 2;
                        canvas.drawRoundRect(rectF, rectF.width() / f, rectF.width() / f, (Paint) this.d);
                    }
                }
                return;
            case 3:
                Rect rect = (Rect) this.b;
                int i2 = 0;
                while (true) {
                    if (!(i2 < recyclerView.getChildCount())) {
                        return;
                    }
                    int i3 = i2 + 1;
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    if (j(childAt, recyclerView)) {
                        int iD2 = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        int iD3 = kti.d(18 * vw4.d().getDisplayMetrics().density);
                        this.c.v(rect, childAt, RecyclerView.R(childAt));
                        canvas2 = canvas;
                        canvas2.drawLine(rect.left + iD2, rect.centerY(), rect.right - iD3, rect.centerY(), (Paint) this.d);
                    } else {
                        canvas2 = canvas;
                    }
                    i2 = i3;
                    canvas = canvas2;
                }
            case 4:
                TextPaint textPaint = (TextPaint) this.o;
                ka5 ka5Var = (ka5) this.d;
                Rect rect2 = (Rect) this.b;
                int i4 = 0;
                while (true) {
                    if (!(i4 < recyclerView.getChildCount())) {
                        return;
                    }
                    int i5 = i4 + 1;
                    View childAt2 = recyclerView.getChildAt(i4);
                    if (childAt2 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    int iR2 = RecyclerView.R(childAt2);
                    if (iR2 != -1) {
                        ChatsListWidget chatsListWidget = (ChatsListWidget) ka5Var.a;
                        if (iR2 == chatsListWidget.y0.j() + chatsListWidget.z0.j() && chatsListWidget.A0.j() > 0) {
                            String str = (String) ka5Var.b;
                            this.c.v(rect2, childAt2, iR2);
                            canvas.drawText(str, rect2.left + kti.d(16 * vw4.d().getDisplayMetrics().density), textPaint.descent() + rect2.centerY(), textPaint);
                        }
                    }
                    i4 = i5;
                }
                break;
            default:
                return;
        }
    }

    public boolean j(View view, RecyclerView recyclerView) {
        int iR;
        phd adapter = recyclerView.getAdapter();
        if (adapter == null || (iR = RecyclerView.R(view)) <= 0 || ((xaf) this.o).b(iR)) {
            return false;
        }
        int iL = adapter.l(iR);
        int i = u1b.u;
        return iL == i && adapter.l(iR - 1) != i;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        switch (this.a) {
            case 0:
                ((Paint) this.d).setColor(yebVar.i().b.b);
                ((Paint) this.o).setColor(yebVar.b().h);
                break;
            case 1:
                TextPaint textPaint = (TextPaint) this.o;
                t5g.c(dpg.n, (Context) this.d, textPaint, null, null, 12);
                textPaint.setColor(yebVar.getText().g);
                break;
            case 2:
                ((Paint) this.d).setColor(yebVar.b().a.n);
                break;
            case 3:
                ((Paint) this.d).setColor(yebVar.i().b.b);
                break;
            default:
                ((ka5) this.d).q((TextPaint) this.o);
                break;
        }
    }

    public ec6(ka5 ka5Var) {
        this.a = 4;
        this.d = ka5Var;
        this.b = new Rect();
        TextPaint textPaint = new TextPaint();
        ka5Var.q(textPaint);
        this.o = textPaint;
        this.c = new mc5(18);
    }

    public ec6(yeb yebVar) {
        this.a = 0;
        Paint paint = new Paint();
        paint.setStrokeWidth(vw4.d().getDisplayMetrics().density * 0.5f);
        this.d = paint;
        this.o = new Paint();
        this.b = new Rect();
        this.c = new mc5(18);
        onThemeChanged(yebVar);
    }

    public ec6(yeb yebVar, xaf xafVar) {
        this.a = 3;
        this.o = xafVar;
        Paint paint = new Paint();
        paint.setStrokeWidth(vw4.d().getDisplayMetrics().density * 0.5f);
        this.d = paint;
        this.b = new Rect();
        this.c = new mc5(18);
        onThemeChanged(yebVar);
    }

    public ec6(Context context) {
        this.a = 1;
        this.d = context;
        this.b = new Rect();
        this.o = new TextPaint();
        onThemeChanged(a93.s0.x(context).k());
        this.c = new mc5(18);
    }
}
