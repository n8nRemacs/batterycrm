package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public class g extends View {

    /* renamed from: b, reason: collision with root package name */
    public int f44401b;

    /* renamed from: c, reason: collision with root package name */
    public View f44402c;

    /* renamed from: d, reason: collision with root package name */
    public int f44403d;

    public View getContent() {
        return this.f44402c;
    }

    public int getEmptyVisibility() {
        return this.f44403d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i12) {
        View viewFindViewById;
        if (this.f44401b == i12) {
            return;
        }
        View view = this.f44402c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f44402c.getLayoutParams()).f44192g0 = false;
            this.f44402c = null;
        }
        this.f44401b = i12;
        if (i12 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i12)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i12) {
        this.f44403d = i12;
    }
}
