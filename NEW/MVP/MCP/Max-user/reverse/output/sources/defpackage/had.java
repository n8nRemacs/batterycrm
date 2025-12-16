package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class had extends PopupWindow implements w9d {
    public ValueAnimator Y;
    public AnimatorSet Z;
    public final Context a;
    public final ExecutorService b;
    public x9d c;
    public Rect d;
    public View o;
    public Long s0;
    public mc5 v0;
    public final int[] X = new int[2];
    public int t0 = 1;
    public int u0 = 1;

    public had(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    @Override // defpackage.w9d
    public final void M() {
        o98 o98VarX;
        Long l = this.s0;
        if (l != null) {
            long jLongValue = l.longValue();
            mc5 mc5Var = this.v0;
            if (mc5Var != null) {
                y9d y9dVar = (y9d) mc5Var.b;
                MessageModel messageModelE = ((hr9) y9dVar.d.D1.a.getValue()).e(jLongValue);
                o98VarX = y9dVar.c.t().x(messageModelE != null ? messageModelE.D0 : null, false);
            } else {
                o98VarX = null;
            }
            x9d x9dVar = this.c;
            if (o98VarX == null || x9dVar == null) {
                return;
            }
            x9dVar.a(o98VarX, null);
            RecyclerView recyclerView = x9dVar.d;
            if (recyclerView != null) {
                uog.i(recyclerView, p07.KEYBOARD_TAP);
            }
            View view = this.o;
            Rect rect = this.d;
            if (view == null || rect == null) {
                wqi.c(had.class.getName(), "Can't calculate direction for expand reaction popup", new Object[0]);
            } else {
                this.u0 = rect.bottom - (view.getHeight() + this.X[1]) >= kti.d(((float) 240) * vw4.d().getDisplayMetrics().density) ? 1 : 2;
            }
            int iD = kti.d(240 * vw4.d().getDisplayMetrics().density);
            View contentView = getContentView();
            FrameLayout frameLayout = contentView instanceof FrameLayout ? (FrameLayout) contentView : null;
            if (frameLayout == null) {
                wqi.c(had.class.getName(), "Can't find container for reactionView", new Object[0]);
                return;
            }
            int height = frameLayout.getHeight();
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            ead eadVar = new ead(this, iArr[0], iArr[1] + height);
            x9d x9dVar2 = this.c;
            View contentView2 = getContentView();
            ViewGroup viewGroup = contentView2 instanceof ViewGroup ? (ViewGroup) contentView2 : null;
            if (x9dVar2 == null || viewGroup == null) {
                return;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, iD);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new q00(21, eadVar));
            valueAnimatorOfInt.addListener(new ug(eadVar, iD, 3));
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(height, iD);
            valueAnimatorOfInt2.setDuration(300L);
            valueAnimatorOfInt2.setStartDelay(75L);
            valueAnimatorOfInt2.addUpdateListener(new fad(x9dVar2, viewGroup, 0));
            valueAnimatorOfInt2.addListener(new gad(x9dVar2, viewGroup, iD, 0));
            AnimatorSet animatorSet = this.Z;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            animatorSet2.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
            animatorSet2.start();
            this.Z = animatorSet2;
        }
    }

    @Override // defpackage.w9d
    public final void Z(m9d m9dVar) {
        xl9 xl9Var;
        f9d f9dVar;
        Long l = this.s0;
        if (l == null) {
            wqi.q(had.class.getName(), "not found messageId when try to react on msg", new Object[0]);
            return;
        }
        mc5 mc5Var = this.v0;
        if (mc5Var != null) {
            long jLongValue = l.longValue();
            x8d x8dVar = m9dVar.b;
            y9d y9dVar = (y9d) mc5Var.b;
            MessageModel messageModelE = ((hr9) y9dVar.d.D1.a.getValue()).e(jLongValue);
            x8d x8dVar2 = null;
            y9dVar.c.t().z(new pad(x8dVar, messageModelE != null ? messageModelE.a : 0L, messageModelE != null ? messageModelE.b : 0L, messageModelE != null ? messageModelE.D0 : null));
            if (messageModelE != null && (xl9Var = messageModelE.D0) != null && (f9dVar = xl9Var.c) != null) {
                x8dVar2 = f9dVar.b;
            }
            if (!fni.a(x8dVar2, x8dVar)) {
                uh7 uh7VarA = gq9.a.a();
                if (uh7VarA != null) {
                    uh7VarA.f(Collections.singleton(new th7(rh7.o, 1)), f1e.CHAT);
                }
                xfh.r(y9dVar.b.Z, sr9.a);
            }
        }
        dismiss();
    }
}
