package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView;

/* loaded from: classes.dex */
public final class ug implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ug(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                Drawable background = ((vs1) this.c).getBackground();
                if (background != null) {
                    background.setAlpha(this.b);
                    break;
                }
                break;
            case 1:
            case 2:
                break;
            case 3:
                ((ead) this.c).invoke(Integer.valueOf(this.b));
                break;
            default:
                j5f j5fVar = (j5f) ((lm7) this.c);
                j5fVar.A("");
                j5fVar.G0.setTextColor(v4j.c(this.b, 1.0f));
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Drawable background = ((vs1) obj).getBackground();
                if (background != null) {
                    background.setAlpha(i2);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                int i3 = MarkdownMenuView.t0;
                ((MarkdownMenuView) obj).a(i2, false);
                break;
            case 3:
                ((ead) obj).invoke(Integer.valueOf(i2));
                break;
            default:
                j5f j5fVar = (j5f) ((lm7) obj);
                j5fVar.A("");
                j5fVar.G0.setTextColor(v4j.c(i2, 1.0f));
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                x52.a((x52) this.c, this.b);
                break;
        }
    }
}
