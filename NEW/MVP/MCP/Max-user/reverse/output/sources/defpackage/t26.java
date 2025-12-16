package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class t26 extends vhd {
    public final int X;
    public final int Y;
    public boolean Z;
    public final Context a;
    public final wu9 b;
    public EndlessRecyclerView2 s0;
    public final m8a c = new m8a(3);
    public final Rect d = new Rect();
    public final int o = kti.d(32 * vw4.d().getDisplayMetrics().density);
    public final Object t0 = ipi.b(3, new e44(17, this));

    public t26(Application application, wu9 wu9Var) {
        this.a = application;
        this.b = wu9Var;
        float f = 6;
        this.X = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.Y = kti.d(f * vw4.d().getDisplayMetrics().density);
    }

    @Override // defpackage.vhd
    public final void g(Canvas canvas, RecyclerView recyclerView, iid iidVar) {
        m8a m8aVar = this.c;
        if (m8aVar.e == 0) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt.getAlpha() != 0.0f) {
                mid midVarT = recyclerView.T(childAt);
                bi9 bi9Var = midVarT instanceof bi9 ? (bi9) midVarT : null;
                if (bi9Var == null) {
                    continue;
                } else {
                    View view = bi9Var.a;
                    int i2 = bi9Var.X;
                    uh9 uh9Var = view instanceof uh9 ? (uh9) view : null;
                    if (uh9Var == null) {
                        continue;
                    } else {
                        RectF rectF = uh9Var.x0;
                        if ((67108864 & i2) == 0 || i2 == 0 || fn9.e(i2)) {
                            rectF.setEmpty();
                            uh9Var.setOnAvatarClickListener$message_list_release(null);
                        } else {
                            gxa gxaVar = (gxa) m8aVar.d(uh9Var.getAvatarId());
                            if (gxaVar == null) {
                                continue;
                            } else {
                                Rect rect = this.d;
                                uh9Var.getDrawingRect(rect);
                                recyclerView.offsetDescendantRectToMyCoords(uh9Var, rect);
                                gxaVar.setAlpha(kti.d(childAt.getAlpha() * 255));
                                float translationX = view.getTranslationX() + this.Y;
                                float contentViewTopMargin = uh9Var.getContentViewTopMargin() + this.X;
                                int iSave = canvas.save();
                                canvas.translate(rect.left + translationX, rect.top + contentViewTopMargin);
                                try {
                                    gxaVar.draw(canvas);
                                    rectF.left = translationX;
                                    rectF.top = contentViewTopMargin;
                                    float f = uh9Var.b;
                                    rectF.right = translationX + f;
                                    rectF.bottom = contentViewTopMargin + f;
                                    uh9Var.setOnAvatarClickListener$message_list_release(this.b);
                                } finally {
                                    canvas.restoreToCount(iSave);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
