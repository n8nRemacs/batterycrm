package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.ActionBarContainer;
import ru.ok.messages.settings.view.LedSeekBar;

/* loaded from: classes.dex */
public final class q6 extends Drawable {
    public final /* synthetic */ int a = 0;
    public final View b;

    public q6(ActionBarContainer actionBarContainer) {
        this.b = actionBarContainer;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.b;
                if (actionBarContainer.t0) {
                    Drawable drawable = actionBarContainer.s0;
                    if (drawable != null) {
                        drawable.draw(canvas);
                        break;
                    }
                } else {
                    Drawable drawable2 = actionBarContainer.d;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.o;
                    if (drawable3 != null && actionBarContainer.u0) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
            default:
                LedSeekBar ledSeekBar = (LedSeekBar) this.b;
                int width = ((ledSeekBar.getWidth() - ledSeekBar.getPaddingLeft()) - ledSeekBar.getPaddingRight()) / ledSeekBar.c.length;
                int height = (ledSeekBar.getHeight() / 2) - ledSeekBar.b;
                for (int i = 0; i < ledSeekBar.c.length; i++) {
                    Paint paint = new Paint();
                    paint.setColor(ledSeekBar.c[i]);
                    canvas.drawRect(i * width, height, r4 + width, ledSeekBar.b + height, paint);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return ((LedSeekBar) this.b).b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.a) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.b;
                if (!actionBarContainer.t0) {
                    Drawable drawable = actionBarContainer.d;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                        break;
                    }
                } else if (actionBarContainer.s0 != null) {
                    actionBarContainer.d.getOutline(outline);
                    break;
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        int i2 = this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i = this.a;
    }

    public q6(LedSeekBar ledSeekBar) {
        this.b = ledSeekBar;
    }
}
